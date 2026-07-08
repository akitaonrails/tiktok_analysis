package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.verify.FwhcLeftSidebarI2iRecallAB;
import com.ss.android.ugc.aweme.verify.FwhcLeftSidebarSelectedRecallAB;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0sUm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1629100sUm {
    public static final Effect LIZ = new Effect("recent_title", null, null, null, "recent_title", null, null, null, null, null, 0, null, null, null, null, null, null, null, 0, 0, 0, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, 0, null, null, 0, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, 0, null, null, null, 0, 0, null, null, null, null, null, false, false, -18, -1, 15, null);
    public static final Effect LIZIZ = new Effect("favorite_title", null, null, null, "favorite_title", null, null, null, null, null, 0, null, null, null, null, null, null, null, 0, 0, 0, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, 0, null, null, 0, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, 0, null, null, null, 0, 0, null, null, null, null, null, false, false, -18, -1, 15, null);
    public static final Effect LIZJ = new Effect("related_title", null, null, null, "related_title", null, null, null, null, null, 0, null, null, null, null, null, null, null, 0, 0, 0, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, 0, null, null, 0, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, 0, null, null, null, 0, 0, null, null, null, null, null, false, false, -18, -1, 15, null);

    public static final String LIZIZ(Effect effect) {
        try {
            String strLIZJ = LIZJ(effect);
            if (strLIZJ == null) {
                return null;
            }
            if (a0.LJJIIZI(strLIZJ, "used", false)) {
                return "used";
            }
            if (!a0.LJJIIZI(strLIZJ, "fav", false)) {
                return null;
            }
            return "fav_effect";
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static final String LIZJ(Effect effect) {
        boolean z;
        if (effect == null) {
            return null;
        }
        try {
            C1446130njf.LIZ.getClass();
            String strLJFF = C1446130njf.LJFF(effect, "source_type");
            boolean z2 = false;
            if (strLJFF != null) {
                if (strLJFF.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    z2 = true;
                }
            }
            if (!z2) {
                return null;
            }
            return strLJFF;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static final boolean LIZLLL(Effect effect) {
        return Intrinsics.LJFF(LIZIZ(effect), "fav_effect");
    }

    public static final boolean LJ(Effect effect) {
        if (effect == null) {
            return false;
        }
        return Intrinsics.LJFF(effect.getName(), "favorite_title");
    }

    public static final boolean LJFF(Effect effect) {
        return Intrinsics.LJFF(LIZIZ(effect), "used");
    }

    public static final boolean LJI(Effect effect) {
        if (effect == null) {
            return false;
        }
        return Intrinsics.LJFF(effect.getName(), "recent_title");
    }

    public static final void LJIIIIZZ(Effect effect) {
        String str;
        if (effect == null) {
            return;
        }
        if (!FwhcLeftSidebarI2iRecallAB.isEnabled() && FwhcLeftSidebarSelectedRecallAB.isEnabled()) {
            str = "premium";
        } else {
            str = "related";
        }
        LJII(effect, str);
    }

    public static final void LJII(Effect effect, String str) {
        if (effect == null) {
            return;
        }
        try {
            C1446130njf.LIZ.getClass();
            JSONObject jSONObjectLJII = C1446130njf.LJII(effect);
            if (jSONObjectLJII == null) {
                jSONObjectLJII = new JSONObject();
            }
            jSONObjectLJII.put("source_type", str);
            effect.setExtra(C786410Ut5.J3(jSONObjectLJII));
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static final int LIZ(InterfaceC1624480sNK interfaceC1624480sNK, Effect effect, int i, String str) {
        List<Integer> list;
        if (C1402560mbO.LIZ() > 0) {
            if ((LJFF(effect) || LIZLLL(effect)) && Intrinsics.LJFF(str, "sticker_category:favorite") && i >= 1 && (list = interfaceC1624480sNK.LJJJLIIL().get("sticker_category:favorite")) != null) {
                int size = list.size();
                if (LJFF(effect)) {
                    return i - 1;
                }
                if (LIZLLL(effect)) {
                    return i - size;
                }
                return i;
            }
            return i;
        }
        return i;
    }
}
