package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;

/* JADX INFO: renamed from: X.0nda, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1442360nda {
    public static final /* synthetic */ int LIZ = 0;

    public static final float LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("key : video_bitrate, byteBenchValue : ");
        C1442500ndo c1442500ndo = InterfaceC1442530ndr.LIZ;
        Float fValueOf = Float.valueOf(c1442500ndo.videoBitrate());
        sbLIZ.append(C1983207pm.LIZ(Float.class) ? String.valueOf(fValueOf) : GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), fValueOf));
        C1440300naG.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        return c1442500ndo.videoBitrate();
    }
}
