package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;

/* JADX INFO: renamed from: X.0ne7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1442690ne7 {
    public static final /* synthetic */ int LIZ = 0;

    public static final String LIZ() {
        String strLJJ = C0C64.LJIILLIIL().LJJ(31744, "ve_synthesis_settings", "", true);
        String strCompileExternalSettings = InterfaceC1442790neH.LIZJ.compileExternalSettings();
        if (C1442400nde.LIZ()) {
            StringBuilder sb = new StringBuilder("key : ve_synthesis_settings , byteBenchValue : ");
            sb.append(C1983207pm.LIZ(String.class) ? String.valueOf(strCompileExternalSettings) : GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), strCompileExternalSettings));
            C1440300naG.LIZ(sb.toString());
            return strCompileExternalSettings;
        }
        StringBuilder sb2 = new StringBuilder("key : ve_synthesis_settings , libraValue : ");
        sb2.append(C1983207pm.LIZ(String.class) ? String.valueOf(strLJJ) : GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), strLJJ));
        C1440300naG.LIZ(sb2.toString());
        return strLJJ;
    }
}
