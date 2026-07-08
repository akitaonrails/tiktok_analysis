package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;

/* JADX INFO: renamed from: X.0ndx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1442590ndx {
    public static final String LIZ() {
        SettingsManager.LIZLLL().getClass();
        String strLJI = SettingsManager.LJI("import_compile_external_settings", "");
        String strImportExternalSettings = InterfaceC1442790neH.LIZJ.importExternalSettings();
        if (C1442390ndd.LIZ() || C1442400nde.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("key : ");
            sbLIZ.append("import_compile_external_settings");
            sbLIZ.append(" , byteBenchValue : ");
            sbLIZ.append(C1983207pm.LIZ(String.class) ? String.valueOf(strImportExternalSettings) : GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), strImportExternalSettings));
            C1440300naG.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            return strImportExternalSettings;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("key : ");
        sbLIZ2.append("import_compile_external_settings");
        sbLIZ2.append(" , libraValue : ");
        sbLIZ2.append(C1983207pm.LIZ(String.class) ? String.valueOf(strLJI) : GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), strLJI));
        C1440300naG.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
        return strLJI;
    }
}
