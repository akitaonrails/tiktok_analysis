package X;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13Bo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19969813Bo implements Comparable<C19969813Bo> {
    public static final C19969913Bp LLILLJJLI;
    public final long LL;

    /* JADX WARN: Type inference failed for: r1v0, types: [X.13Bp] */
    static {
        final DefaultConstructorMarker defaultConstructorMarker = null;
        LLILLJJLI = new Object(defaultConstructorMarker) { // from class: X.13Bp
        };
    }

    public final int hashCode() {
        return C786410Ut5.Y2(this.LL);
    }

    public final String toString() {
        return C1385770mAJ.LIZIZ(10, this.LL);
    }

    @Override // java.lang.Comparable
    public final int compareTo(C19969813Bo c19969813Bo) {
        return Intrinsics.LJII(this.LL ^ Long.MIN_VALUE, c19969813Bo.LL ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        long j = this.LL;
        if (!(obj instanceof C19969813Bo) || j != ((C19969813Bo) obj).LL) {
            return false;
        }
        return true;
    }
}
