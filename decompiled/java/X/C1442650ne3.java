package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;

/* JADX INFO: renamed from: X.0ne3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1442650ne3 {
    public static boolean LIZ() {
        SettingsManager.LIZLLL().getClass();
        Boolean boolValueOf = Boolean.valueOf(SettingsManager.LIZ("enable_1080p_photo_to_video", false));
        Boolean boolValueOf2 = Boolean.valueOf(InterfaceC1442770neF.LJII.enableSynthesisMvTo1080p());
        if (C1442400nde.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("key : ");
            sbLIZ.append("enable_1080p_photo_to_video");
            sbLIZ.append(" , byteBenchValue : ");
            sbLIZ.append(C1983207pm.LIZ(Boolean.class) ? String.valueOf(boolValueOf2) : GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), boolValueOf2));
            C1440300naG.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            boolValueOf = boolValueOf2;
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("key : ");
            sbLIZ2.append("enable_1080p_photo_to_video");
            sbLIZ2.append(" , libraValue : ");
            sbLIZ2.append(C1983207pm.LIZ(Boolean.class) ? String.valueOf(boolValueOf) : GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), boolValueOf));
            C1440300naG.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
        }
        return boolValueOf.booleanValue();
    }
}
