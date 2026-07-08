package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.s;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.MobileEffectTemplateEffect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.ProTemplateEffect;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.text.Charsets;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0nko, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1446840nko {
    public static final void LIZ(Effect effect) {
        if (effect == null) {
            return;
        }
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(C1624600sNW.LIZIZ(effect));
            sbLIZ.append("/extra.json");
            C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
            if (!c0vsj.exists()) {
                return;
            }
            effect.setSdkExtra(C09BH.LJI(c0vsj, Charsets.UTF_8));
        } catch (s e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("fixExtra json fail: ");
            sbLIZ2.append(e);
            C201955140j.LJIIZILJ(C2188811AlT.LIZIZ(sbLIZ2));
        } catch (FileNotFoundException e2) {
            TryCatchGuardChecker.doCheck(e2);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("fixExtra file fail: ");
            sbLIZ3.append(e2);
            C201955140j.LJIIZILJ(C2188811AlT.LIZIZ(sbLIZ3));
        }
    }

    public static final String LIZIZ(Effect effect) {
        String extra;
        if (effect == null || (extra = effect.getExtra()) == null || extra.length() == 0 || !a0.LJJIIZI(extra, "mobile_tool_template_biz_type", false)) {
            return null;
        }
        C1446130njf.LIZ.getClass();
        return C1446130njf.LJFF(effect, "mobile_tool_template_biz_type");
    }

    public static final boolean LIZJ(Effect effect) {
        if (!u.LJIJI(LIZIZ(effect), "ai_create", false) && !u.LJIJI(LIZIZ(effect), "ai_create_i2v", false) && !u.LJIJI(LIZIZ(effect), "ai_create_fl2v", false)) {
            return false;
        }
        return true;
    }

    public static final boolean LIZLLL(Effect effect) {
        String extra;
        if (effect == null || (extra = effect.getExtra()) == null || extra.length() == 0 || !a0.LJJIIZI(extra, "mobile_tool_template_biz_type", false)) {
            return false;
        }
        C1446130njf.LIZ.getClass();
        return u.LJIJI(C1446130njf.LJFF(effect, "mobile_tool_template_biz_type"), "ame", false);
    }

    public static final boolean LJ(Effect effect) {
        if (effect instanceof ProTemplateEffect) {
            return true;
        }
        if (effect instanceof MobileEffectTemplateEffect) {
            return ((MobileEffectTemplateEffect) effect).isAMETemplate();
        }
        return C1624200sMs.LJFF(effect);
    }

    public static final void LJFF(Effect effect) {
        Object c098200Yq;
        String strLIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tryChangeUrlToTemplateRectUri, ");
        sbLIZ.append(effect.getName());
        sbLIZ.append(", ");
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(strLIZIZ2);
        sbLIZ2.append(", ");
        StringBuilder sb = new StringBuilder(C2188811AlT.LIZIZ(sbLIZ2));
        try {
            if (C1656550tD3.LIZ() && C1446850nkp.LIZ().enable && C1446850nkp.LIZ().keyOfExtra.length() > 0) {
                String strValueOf = String.valueOf(effect.getIconUrl());
                String extra = effect.getExtra();
                if (extra != null && extra.length() != 0) {
                    String strOptString = new JSONObject(extra).optString(C1446850nkp.LIZ().keyOfExtra);
                    if (strOptString != null && strOptString.length() != 0) {
                        List<String> urlList = effect.getIconUrl().getUrlList();
                        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(urlList, 10));
                        for (String str : urlList) {
                            String strLJJZZIII = a0.LJJZZIII('/', str, str);
                            if (strLJJZZIII.length() == 0) {
                                strLIZIZ = null;
                            } else {
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append(strLJJZZIII);
                                sbLIZ3.append('/');
                                sbLIZ3.append(strOptString);
                                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                            }
                            arrayList.add(strLIZIZ);
                        }
                        List<String> listLJJJJLI = C13LP.LJJJJLI(arrayList);
                        if (((ArrayList) listLJJJJLI).isEmpty()) {
                            sb.append("failed, due to targetUrlList is null.");
                        } else {
                            effect.getIconUrl().setUrlList(listLJJJJLI);
                            effect.getIconUrl().setUri(strOptString);
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append("replace url success, before = ");
                            sbLIZ4.append(strValueOf);
                            sbLIZ4.append(", after = ");
                            sbLIZ4.append(effect.getIconUrl());
                            sb.append(C2188811AlT.LIZIZ(sbLIZ4));
                        }
                    } else {
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append("failed, due to templateUri is null. extra=");
                        sbLIZ5.append(extra);
                        sbLIZ5.append('.');
                        sb.append(C2188811AlT.LIZIZ(sbLIZ5));
                    }
                } else {
                    sb.append("failed, due to extra is null.");
                }
            } else {
                sb.append("failed, due to config.");
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("failed, due to ");
            sbLIZ6.append(thM5exceptionOrNullimpl);
            sbLIZ6.append('.');
            sb.append(C2188811AlT.LIZIZ(sbLIZ6));
        }
        C201955140j.LIZLLL(C20012313Rx.LIZIZ, strLIZIZ2, String.valueOf(sb));
    }
}
