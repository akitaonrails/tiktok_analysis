package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;

/* JADX INFO: renamed from: X.0ne4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1442660ne4 {
    public static final String LIZ() {
        SettingsManager.LIZLLL().getClass();
        String strLJI = SettingsManager.LJI("avtools_1080p_mv_photo_ve_synthesis_settings", "");
        String strMvSynthesisSettingsFor1080p = InterfaceC1442770neF.LJII.mvSynthesisSettingsFor1080p();
        if (C1442400nde.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("key : ");
            sbLIZ.append("avtools_1080p_mv_photo_ve_synthesis_settings");
            sbLIZ.append(" , byteBenchValue : ");
            sbLIZ.append(C1983207pm.LIZ(String.class) ? String.valueOf(strMvSynthesisSettingsFor1080p) : GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), strMvSynthesisSettingsFor1080p));
            C1440300naG.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            return strMvSynthesisSettingsFor1080p;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("key : ");
        sbLIZ2.append("avtools_1080p_mv_photo_ve_synthesis_settings");
        sbLIZ2.append(" , libraValue : ");
        sbLIZ2.append(C1983207pm.LIZ(String.class) ? String.valueOf(strLJI) : GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), strLJI));
        C1440300naG.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
        return strLJI;
    }
}
