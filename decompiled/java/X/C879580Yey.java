package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Yey, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C879580Yey implements InterfaceC1491305sd {
    public static final int $stable = 0;
    public static final C879590Yez Companion = new Object() { // from class: X.0Yez
    };
    public final String LL;

    public final C879580Yey copy(String str) {
        return new C879580Yey(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C879580Yey) && Intrinsics.LJFF(this.LL, ((C879580Yey) obj).LL);
    }

    public int hashCode() {
        return this.LL.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MessageRequestAggregationWrapperKey(key=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getKey() {
        return this.LL;
    }

    public C879580Yey(String str) {
        this.LL = str;
    }
}
