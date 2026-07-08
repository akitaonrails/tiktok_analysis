package X;

import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.livesdk.livesetting.effect.LiveEffectStructureOptSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.depend.model.effect.LiveEffectOld;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0U7v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C767250U7v {
    public static final LiveEffect LIZ() {
        if (LiveEffectStructureOptSetting.INSTANCE.enable()) {
            return ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).createEffectByType(EnumC767550U8z.NONE);
        }
        LiveEffectOld liveEffectOld = new LiveEffectOld();
        liveEffectOld.LLIIZ(0L);
        liveEffectOld.LJI = CardStruct.IStatusCode.DEFAULT;
        liveEffectOld.LJJLIIIJL = true;
        liveEffectOld.LLLJ(C497740JfY.LJIJI(2131841685));
        liveEffectOld.LJJJJIZL = true;
        liveEffectOld.LJIJJLI = "";
        return liveEffectOld;
    }

    public static final boolean LIZLLL(LiveEffect liveEffect) {
        if (liveEffect == null || liveEffect.LJJL() != EnumC356360Dy6.COLLECTION_EFFECT.getValue()) {
            return false;
        }
        return true;
    }

    public static final boolean LJ(LiveEffect liveEffect) {
        if (liveEffect == null || liveEffect.LJJJJI() == null) {
            return false;
        }
        return true;
    }

    public static final boolean LJFF(LiveEffect liveEffect) {
        LiveEffect.PlDataBean plDataBean;
        if (liveEffect != null) {
            LiveEffect.StickerSDKExtra stickerSDKExtraLJLJLLL = liveEffect.LJLJLLL();
            if (stickerSDKExtraLJLJLLL != null) {
                plDataBean = stickerSDKExtraLJLJLLL.pl;
            } else {
                plDataBean = null;
            }
            if (plDataBean != null || (liveEffect != null && liveEffect.LJJJJLL())) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean LJI(LiveEffect liveEffect) {
        LiveEffect.StickerSDKExtra stickerSDKExtraLJLJLLL;
        Boolean boolValueOf;
        if (liveEffect != null && (stickerSDKExtraLJLJLLL = liveEffect.LJLJLLL()) != null && (boolValueOf = Boolean.valueOf(stickerSDKExtraLJLJLLL.isAvatar)) != null) {
            return boolValueOf.booleanValue();
        }
        return false;
    }

    public static final boolean LJIIIIZZ(LiveEffect liveEffect) {
        if (liveEffect != null && liveEffect.getEffectId() > 0 && !liveEffect.LJJIJIIJI()) {
            return false;
        }
        return true;
    }

    public static final boolean LJIIIZ(String str) {
        String lowerCase;
        if (str != null) {
            lowerCase = str.toLowerCase(Locale.ENGLISH);
        } else {
            lowerCase = null;
        }
        return Intrinsics.LJFF(lowerCase, "trending");
    }

    public static final void LIZIZ(int i, LiveEffect liveEffect) {
        boolean z;
        String strJ3;
        try {
            String extra = liveEffect.getExtra();
            if (extra != null && extra.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("effect_type", i);
                strJ3 = C786410Ut5.J3(jSONObject);
            } else {
                JSONObject jSONObject2 = new JSONObject(extra);
                if (!jSONObject2.has("effect_type")) {
                    jSONObject2.put("effect_type", i);
                }
                strJ3 = C786410Ut5.J3(jSONObject2);
            }
            liveEffect.setExtra(strJ3);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static final LiveEffect LIZJ(LiveEffect liveEffect, List list) {
        Object obj = null;
        if (liveEffect == null) {
            return null;
        }
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (LJII((LiveEffect) next, liveEffect)) {
                obj = next;
                break;
            }
        }
        return (LiveEffect) obj;
    }

    public static final boolean LJII(LiveEffect liveEffect, LiveEffect liveEffect2) {
        String strLJJJJI;
        if (liveEffect2 != null) {
            strLJJJJI = liveEffect2.LJJJJI();
        } else {
            strLJJJJI = null;
        }
        if (Intrinsics.LJFF(strLJJJJI, String.valueOf(liveEffect.getEffectId())) && C500260Jjc.LJJIIZ(liveEffect2.LJJJJI())) {
            return true;
        }
        return false;
    }

    public static final void LJIIJ(C474500IjA c474500IjA, LiveEffect liveEffect) {
        String name;
        Integer position;
        Integer numValueOf;
        c474500IjA.LJJII(liveEffect.LJLL(), "tab_name");
        c474500IjA.LJJII(Long.valueOf(liveEffect.getEffectId()), "effect_id");
        c474500IjA.LJJII(liveEffect.getResourceId(), "resource_id");
        String strLJJIJLIJ = liveEffect.LJJIJLIJ();
        if (strLJJIJLIJ == null) {
            strLJJIJLIJ = liveEffect.getName();
        }
        c474500IjA.LJJII(strLJJIJLIJ, "beauty_type");
        String strLJJIJLIJ2 = liveEffect.LJJIJLIJ();
        if (strLJJIJLIJ2 == null) {
            strLJJIJLIJ2 = liveEffect.getName();
        }
        c474500IjA.LJJII(strLJJIJLIJ2, "beauty_type_name");
        if (liveEffect.LLLIIII()) {
            name = liveEffect.getName();
        } else {
            name = "";
        }
        c474500IjA.LJJII(name, "beauty_type_name_tier2");
        if (liveEffect.LLLIIII()) {
            position = liveEffect.LJJIJL();
        } else {
            position = liveEffect.getPosition();
        }
        if (position != null) {
            numValueOf = Integer.valueOf(position.intValue() + 1);
        } else {
            numValueOf = null;
        }
        c474500IjA.LJJII(numValueOf, "impr_position");
    }
}
