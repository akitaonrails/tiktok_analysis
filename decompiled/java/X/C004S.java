package X;

import java.util.Map;

/* JADX INFO: renamed from: X.004S, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C004S {
    public final String LIZ;
    public final Map<String, String> LIZIZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StatisticEventData(eventName=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", map=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C004S(String str, Map<String, String> map) {
        this.LIZ = str;
        this.LIZIZ = map;
    }
}
