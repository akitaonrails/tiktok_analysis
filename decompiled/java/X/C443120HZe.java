package X;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HZe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C443120HZe<A, B, C> implements Serializable {
    public final A LL;
    public final B LLILLJJLI;
    public final C LLILLL;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C443120HZe copy$default(C443120HZe c443120HZe, Object obj, Object obj2, Object obj3, int i, Object obj4) {
        if ((i & 1) != 0) {
            obj = c443120HZe.LL;
        }
        if ((i & 2) != 0) {
            obj2 = c443120HZe.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            obj3 = c443120HZe.LLILLL;
        }
        return c443120HZe.copy(obj, obj2, obj3);
    }

    public final C443120HZe<A, B, C> copy(A a, B b, C c) {
        return new C443120HZe<>(a, b, c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C443120HZe)) {
            return false;
        }
        C443120HZe c443120HZe = (C443120HZe) obj;
        return Intrinsics.LJFF(this.LL, c443120HZe.LL) && Intrinsics.LJFF(this.LLILLJJLI, c443120HZe.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c443120HZe.LLILLL);
    }

    public int hashCode() {
        A a = this.LL;
        int iHashCode = (a == null ? 0 : a.hashCode()) * 31;
        B b = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (b == null ? 0 : b.hashCode())) * 31;
        C c = this.LLILLL;
        return iHashCode2 + (c != null ? c.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('(');
        sbLIZ.append(this.LL);
        sbLIZ.append(", ");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", ");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final A getFirst() {
        return this.LL;
    }

    public final B getSecond() {
        return this.LLILLJJLI;
    }

    public final C getThird() {
        return this.LLILLL;
    }

    public C443120HZe(A a, B b, C c) {
        this.LL = a;
        this.LLILLJJLI = b;
        this.LLILLL = c;
    }
}
