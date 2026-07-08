package X;

import com.ss.android.ugc.aweme.feature.info.MemoryFeatureInfo;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0ooV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1487570ooV extends MemoryFeatureInfo {
    public static final ConcurrentHashMap<String, C1487570ooV> LIZIZ = new ConcurrentHashMap<>(24);
    public static final CopyOnWriteArrayList<String> LIZJ = new CopyOnWriteArrayList<>();
    public static int LIZLLL;
    public static int LJ;
    public final int LIZ;

    @Override // com.ss.android.ugc.aweme.feature.info.MemoryFeatureInfo
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchSession(featureMap=");
        sbLIZ.append(getFeatureMap());
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1487570ooV(int i) {
        this.LIZ = i;
    }
}
