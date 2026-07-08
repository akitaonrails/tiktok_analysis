package X;

import com.ss.android.ugc.aweme.feature.info.MemoryFeatureInfo;

/* JADX INFO: renamed from: X.0ooR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1487530ooR extends MemoryFeatureInfo {
    public static final C1487530ooR LIZ = new C1487530ooR();
    public static boolean LIZIZ;

    @Override // com.ss.android.ugc.aweme.feature.info.MemoryFeatureInfo
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UGFeatureInfo(enable=");
        sbLIZ.append(LIZIZ);
        sbLIZ.append(" featureMap=");
        sbLIZ.append(getFeatureMap());
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
