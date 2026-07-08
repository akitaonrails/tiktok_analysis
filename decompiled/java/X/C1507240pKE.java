package X;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0pKE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1507240pKE implements Comparable<C1507240pKE> {
    public static final C1507250pKF LLILLJJLI;
    public final int LL;

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0pKF] */
    static {
        final DefaultConstructorMarker defaultConstructorMarker = null;
        LLILLJJLI = new Object(defaultConstructorMarker) { // from class: X.0pKF
        };
    }

    public final int hashCode() {
        return this.LL;
    }

    public final String toString() {
        return LIZJ(this.LL);
    }

    public static String LIZJ(int i) {
        return String.valueOf(((long) i) & 4294967295L);
    }

    @Override // java.lang.Comparable
    public final int compareTo(C1507240pKE c1507240pKE) {
        return Intrinsics.LJI(this.LL ^ Integer.MIN_VALUE, c1507240pKE.LL ^ Integer.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        int i = this.LL;
        if (!(obj instanceof C1507240pKE) || i != ((C1507240pKE) obj).LL) {
            return false;
        }
        return true;
    }
}
