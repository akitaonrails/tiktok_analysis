package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hHk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1198180hHk implements InterfaceC0148002o {
    public final AbstractC1198100hHc<C1198230hHp> LL;

    public C1198180hHk() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1198180hHk) && Intrinsics.LJFF(this.LL, ((C1198180hHk) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MyMomentsFeedState(response=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1198180hHk(int i) {
        this(C1198090hHb.LIZ);
    }

    public C1198180hHk(AbstractC1198100hHc<C1198230hHp> abstractC1198100hHc) {
        this.LL = abstractC1198100hHc;
    }
}
