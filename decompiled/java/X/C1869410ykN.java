package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ykN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1869410ykN implements InterfaceC1869470ykT {
    public static final int $stable = 8;
    public final int LL;
    public final int LLILLJJLI;
    public final float LLILLL;
    public final float LLILZ;
    public final C1869440ykQ LLILZIL;

    public final C1869410ykN copy(int i, int i2, float f, float f2, C1869440ykQ c1869440ykQ) {
        return new C1869410ykN(i, i2, f, f2, c1869440ykQ);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1869410ykN)) {
            return false;
        }
        C1869410ykN c1869410ykN = (C1869410ykN) obj;
        return this.LL == c1869410ykN.LL && this.LLILLJJLI == c1869410ykN.LLILLJJLI && Float.compare(this.LLILLL, c1869410ykN.LLILLL) == 0 && Float.compare(this.LLILZ, c1869410ykN.LLILZ) == 0 && Intrinsics.LJFF(this.LLILZIL, c1869410ykN.LLILZIL);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchAdaptionHandlerContext(alignType=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", space=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", widthThreshold=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", heightThreshold=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", strategyContext=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public int hashCode() {
        return (((((((this.LL * 31) + this.LLILLJJLI) * 31) + Float.floatToIntBits(this.LLILLL)) * 31) + Float.floatToIntBits(this.LLILZ)) * 31) + this.LLILZIL.hashCode();
    }

    public final int getAlignType() {
        return this.LL;
    }

    public final float getHeightThreshold() {
        return this.LLILZ;
    }

    public final int getSpace() {
        return this.LLILLJJLI;
    }

    public final float getWidthThreshold() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC1869470ykT
    public C1869440ykQ getStrategyContext() {
        return this.LLILZIL;
    }

    public C1869410ykN(int i, int i2, float f, float f2, C1869440ykQ c1869440ykQ) {
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = f;
        this.LLILZ = f2;
        this.LLILZIL = c1869440ykQ;
    }
}
