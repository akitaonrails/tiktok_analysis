package X;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: X.07aq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1890607aq implements Comparable<C1890607aq> {
    public static final C1890707ar LLILZIL;
    public static final C1890607aq LLILZLL = new C1890607aq();
    public final int LL = 2;
    public final int LLILLJJLI = 1;
    public final int LLILLL = 20;
    public final int LLILZ = 131348;

    /* JADX WARN: Type inference failed for: r1v0, types: [X.07ar] */
    static {
        final DefaultConstructorMarker defaultConstructorMarker = null;
        LLILZIL = new Object(defaultConstructorMarker) { // from class: X.07ar
        };
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LL);
        sbLIZ.append('.');
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append('.');
        sbLIZ.append(this.LLILLL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return this.LLILZ;
    }

    @Override // java.lang.Comparable
    public final int compareTo(C1890607aq c1890607aq) {
        return this.LLILZ - c1890607aq.LLILZ;
    }

    public final boolean equals(Object obj) {
        C1890607aq c1890607aq;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1890607aq) {
            c1890607aq = (C1890607aq) obj;
        } else {
            c1890607aq = null;
        }
        if (c1890607aq != null && this.LLILZ == c1890607aq.LLILZ) {
            return true;
        }
        return false;
    }
}
