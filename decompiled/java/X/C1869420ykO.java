package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ykO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1869420ykO implements InterfaceC1869470ykT {
    public static final int $stable = 8;
    public final int LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;
    public final int LLILZIL;
    public final int LLILZLL;
    public final C1869440ykQ LLIZ;

    public final C1869420ykO copy(int i, int i2, int i3, int i4, int i5, int i6, C1869440ykQ c1869440ykQ) {
        return new C1869420ykO(i, i2, i3, i4, i5, i6, c1869440ykQ);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1869420ykO)) {
            return false;
        }
        C1869420ykO c1869420ykO = (C1869420ykO) obj;
        return this.LL == c1869420ykO.LL && this.LLILLJJLI == c1869420ykO.LLILLJJLI && this.LLILLL == c1869420ykO.LLILLL && this.LLILZ == c1869420ykO.LLILZ && this.LLILZIL == c1869420ykO.LLILZIL && this.LLILZLL == c1869420ykO.LLILZLL && Intrinsics.LJFF(this.LLIZ, c1869420ykO.LLIZ);
    }

    public int hashCode() {
        return (((((((((((this.LL * 31) + this.LLILLJJLI) * 31) + this.LLILLL) * 31) + this.LLILZ) * 31) + this.LLILZIL) * 31) + this.LLILZLL) * 31) + this.LLIZ.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchFirstVideoAdaptionHandlerContext(left=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", top=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", containerWidth=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", containerHeight=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", viewWidth=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", viewHeight=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", strategyContext=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int getContainerHeight() {
        return this.LLILZ;
    }

    public final int getContainerWidth() {
        return this.LLILLL;
    }

    public final int getLeft() {
        return this.LL;
    }

    public final int getTop() {
        return this.LLILLJJLI;
    }

    public final int getViewHeight() {
        return this.LLILZLL;
    }

    public final int getViewWidth() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC1869470ykT
    public C1869440ykQ getStrategyContext() {
        return this.LLIZ;
    }

    public C1869420ykO(int i, int i2, int i3, int i4, int i5, int i6, C1869440ykQ c1869440ykQ) {
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = i3;
        this.LLILZ = i4;
        this.LLILZIL = i5;
        this.LLILZLL = i6;
        this.LLIZ = c1869440ykQ;
    }
}
