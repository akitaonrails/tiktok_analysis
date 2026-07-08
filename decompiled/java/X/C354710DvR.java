package X;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: X.0DvR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C354710DvR extends C0DYW implements C13LX<Long> {
    public static final C354460Dv2 LLILZIL;
    public static final C354710DvR LLILZLL = new C354710DvR(1, 0);

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0Dv2] */
    static {
        final DefaultConstructorMarker defaultConstructorMarker = null;
        LLILZIL = new Object(defaultConstructorMarker) { // from class: X.0Dv2
        };
    }

    @Override // X.C13LX
    public final Comparable LJFF() {
        return Long.valueOf(this.LLILLJJLI);
    }

    @Override // X.C13LX
    public final Comparable getStart() {
        return Long.valueOf(this.LL);
    }

    @Override // X.C0DYW
    public final boolean isEmpty() {
        return this.LL > this.LLILLJJLI;
    }

    @Override // X.C0DYW
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j = this.LL;
        long j2 = ((long) 31) * (j ^ (j >>> 32));
        long j3 = this.LLILLJJLI;
        return (int) (j2 + (j3 ^ (j3 >>> 32)));
    }

    @Override // X.C0DYW
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LL);
        sbLIZ.append("..");
        sbLIZ.append(this.LLILLJJLI);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C13LX
    public final /* bridge */ /* synthetic */ boolean LIZJ(Comparable comparable) {
        return LJIIIIZZ(((Number) comparable).longValue());
    }

    public final boolean LJIIIIZZ(long j) {
        if (this.LL <= j && j <= this.LLILLJJLI) {
            return true;
        }
        return false;
    }

    @Override // X.C0DYW
    public final boolean equals(Object obj) {
        if (obj instanceof C354710DvR) {
            if (!isEmpty() || !((C0DYW) obj).isEmpty()) {
                C0DYW c0dyw = (C0DYW) obj;
                if (this.LL == c0dyw.LL && this.LLILLJJLI == c0dyw.LLILLJJLI) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public C354710DvR(long j, long j2) {
        super(j, j2, 1L);
    }
}
