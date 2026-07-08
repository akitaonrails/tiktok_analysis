package X;

import com.ss.android.ugc.aweme.feature.info.MemoryFeatureInfo;

/* JADX INFO: renamed from: X.0ooT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1487550ooT extends MemoryFeatureInfo {
    public static final C1487550ooT LIZ = new C1487550ooT();
    public static boolean LIZIZ;

    @Override // com.ss.android.ugc.aweme.feature.info.MemoryFeatureInfo
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchGlobal(enable=");
        sbLIZ.append(LIZIZ);
        sbLIZ.append(" featureMap=");
        sbLIZ.append(getFeatureMap());
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
