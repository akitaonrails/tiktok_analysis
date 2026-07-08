package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uFv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1696770uFv extends AbstractC1696860uG4 {
    public final String LL;
    public final List<AbstractC1776680wKo> LLILLJJLI;
    public final int LLILLL;
    public final AbstractC1668700tWe LLILZ;
    public final float LLILZIL;
    public final AbstractC1668700tWe LLILZLL;
    public final float LLIZ;
    public final float LLIZLLLIL;
    public final int LLJ;
    public final int LLJI;
    public final float LLJIJIL;
    public final float LLJILJIL;
    public final float LLJILJILJ;
    public final float LLJILLL;

    public final int hashCode() {
        int iHashCode = ((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31;
        AbstractC1668700tWe abstractC1668700tWe = this.LLILZ;
        int iHashCode2 = (((iHashCode + (abstractC1668700tWe != null ? abstractC1668700tWe.hashCode() : 0)) * 31) + Float.floatToIntBits(this.LLILZIL)) * 31;
        AbstractC1668700tWe abstractC1668700tWe2 = this.LLILZLL;
        return ((((((((((((((((((iHashCode2 + (abstractC1668700tWe2 != null ? abstractC1668700tWe2.hashCode() : 0)) * 31) + Float.floatToIntBits(this.LLIZ)) * 31) + Float.floatToIntBits(this.LLIZLLLIL)) * 31) + this.LLJ) * 31) + this.LLJI) * 31) + Float.floatToIntBits(this.LLJIJIL)) * 31) + Float.floatToIntBits(this.LLJILJIL)) * 31) + Float.floatToIntBits(this.LLJILJILJ)) * 31) + Float.floatToIntBits(this.LLJILLL)) * 31) + this.LLILLL;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1696770uFv.class != obj.getClass()) {
            return false;
        }
        C1696770uFv c1696770uFv = (C1696770uFv) obj;
        if (Intrinsics.LJFF(this.LL, c1696770uFv.LL) && Intrinsics.LJFF(this.LLILZ, c1696770uFv.LLILZ) && this.LLILZIL == c1696770uFv.LLILZIL && Intrinsics.LJFF(this.LLILZLL, c1696770uFv.LLILZLL) && this.LLIZ == c1696770uFv.LLIZ && this.LLIZLLLIL == c1696770uFv.LLIZLLLIL && this.LLJ == c1696770uFv.LLJ && this.LLJI == c1696770uFv.LLJI && this.LLJIJIL == c1696770uFv.LLJIJIL && this.LLJILJIL == c1696770uFv.LLJILJIL && this.LLJILJILJ == c1696770uFv.LLJILJILJ && this.LLJILLL == c1696770uFv.LLJILLL && this.LLILLL == c1696770uFv.LLILLL && Intrinsics.LJFF(this.LLILLJJLI, c1696770uFv.LLILLJJLI)) {
            return true;
        }
        return false;
    }

    public C1696770uFv(String str, List list, int i, AbstractC1668700tWe abstractC1668700tWe, float f, AbstractC1668700tWe abstractC1668700tWe2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7) {
        this.LL = str;
        this.LLILLJJLI = list;
        this.LLILLL = i;
        this.LLILZ = abstractC1668700tWe;
        this.LLILZIL = f;
        this.LLILZLL = abstractC1668700tWe2;
        this.LLIZ = f2;
        this.LLIZLLLIL = f3;
        this.LLJ = i2;
        this.LLJI = i3;
        this.LLJIJIL = f4;
        this.LLJILJIL = f5;
        this.LLJILJILJ = f6;
        this.LLJILLL = f7;
    }
}
