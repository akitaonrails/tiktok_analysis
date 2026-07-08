package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;

/* JADX INFO: renamed from: X.0ndz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1442610ndz {
    public static boolean LIZ() {
        SettingsManager.LIZLLL().getClass();
        Boolean boolValueOf = Boolean.valueOf(SettingsManager.LIZ("avtools_enable_hd_import_resolution", false));
        Boolean boolValueOf2 = Boolean.valueOf(InterfaceC1442780neG.LJ.enableImportHD());
        if (C1442390ndd.LIZ() || C1442400nde.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("key : ");
            sbLIZ.append("avtools_enable_hd_import_resolution");
            sbLIZ.append(" , byteBenchValue : ");
            sbLIZ.append(C1983207pm.LIZ(Boolean.class) ? String.valueOf(boolValueOf2) : GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), boolValueOf2));
            C1440300naG.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            boolValueOf = boolValueOf2;
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("key : ");
            sbLIZ2.append("avtools_enable_hd_import_resolution");
            sbLIZ2.append(" , libraValue : ");
            sbLIZ2.append(C1983207pm.LIZ(Boolean.class) ? String.valueOf(boolValueOf) : GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), boolValueOf));
            C1440300naG.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
        }
        return boolValueOf.booleanValue();
    }
}
