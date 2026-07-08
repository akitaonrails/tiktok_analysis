package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;

/* JADX INFO: renamed from: X.0ndm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1442480ndm {
    public static final float LIZ() {
        SettingsManager.LIZLLL().getClass();
        Float fValueOf = Float.valueOf(SettingsManager.LIZJ("synthetic_video_bitrate", 1.0f));
        Float fValueOf2 = Float.valueOf(InterfaceC1442530ndr.LIZ.syntheticVideoBitrate());
        if (C1442400nde.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("key : ");
            sbLIZ.append("synthetic_video_bitrate");
            sbLIZ.append(" , byteBenchValue : ");
            sbLIZ.append(C1983207pm.LIZ(Float.class) ? String.valueOf(fValueOf2) : GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), fValueOf2));
            C1440300naG.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            fValueOf = fValueOf2;
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("key : ");
            sbLIZ2.append("synthetic_video_bitrate");
            sbLIZ2.append(" , libraValue : ");
            sbLIZ2.append(C1983207pm.LIZ(Float.class) ? String.valueOf(fValueOf) : GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), fValueOf));
            C1440300naG.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
        }
        return fValueOf.floatValue();
    }
}
