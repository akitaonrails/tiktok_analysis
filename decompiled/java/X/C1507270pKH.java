package X;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0pKH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1507270pKH implements Comparable<C1507270pKH> {
    public static final C1507280pKI LLILLJJLI;
    public final short LL;

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0pKI] */
    static {
        final DefaultConstructorMarker defaultConstructorMarker = null;
        LLILLJJLI = new Object(defaultConstructorMarker) { // from class: X.0pKI
        };
    }

    public final int hashCode() {
        return this.LL;
    }

    public final String toString() {
        return LIZJ(this.LL);
    }

    public static String LIZJ(short s) {
        return String.valueOf(s & 65535);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(C1507270pKH c1507270pKH) {
        return Intrinsics.LJI(this.LL & 65535, c1507270pKH.LL & 65535);
    }

    public final boolean equals(Object obj) {
        short s = this.LL;
        if (!(obj instanceof C1507270pKH) || s != ((C1507270pKH) obj).LL) {
            return false;
        }
        return true;
    }
}
