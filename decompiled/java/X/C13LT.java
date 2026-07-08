package X;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13LT, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13LT extends C13LU implements C13LX<Character> {
    public static final C13LW LLILZIL;

    /* JADX WARN: Type inference failed for: r1v0, types: [X.13LW] */
    static {
        final DefaultConstructorMarker defaultConstructorMarker = null;
        LLILZIL = new Object(defaultConstructorMarker) { // from class: X.13LW
        };
        new C13LT((char) 1, (char) 0);
    }

    @Override // X.C13LX
    public final Comparable LJFF() {
        return Character.valueOf(this.LLILLJJLI);
    }

    @Override // X.C13LX
    public final Comparable getStart() {
        return Character.valueOf(this.LL);
    }

    public final boolean isEmpty() {
        return Intrinsics.LJI(this.LL, this.LLILLJJLI) > 0;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.LL * 31) + this.LLILLJJLI;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LL);
        sbLIZ.append("..");
        sbLIZ.append(this.LLILLJJLI);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C13LX
    public final boolean LIZJ(Comparable comparable) {
        char cCharValue = ((Character) comparable).charValue();
        if (Intrinsics.LJI(this.LL, cCharValue) <= 0 && Intrinsics.LJI(cCharValue, this.LLILLJJLI) <= 0) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C13LT) {
            if (!isEmpty() || !((C13LT) obj).isEmpty()) {
                C13LU c13lu = (C13LU) obj;
                if (this.LL == c13lu.LL && this.LLILLJJLI == c13lu.LLILLJJLI) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public C13LT(char c, char c2) {
        super(c, c2);
    }
}
