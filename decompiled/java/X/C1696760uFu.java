package X;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uFu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1696760uFu extends AbstractC1696860uG4 implements Iterable<AbstractC1696860uG4>, C03W4 {
    public final String LL;
    public final float LLILLJJLI;
    public final float LLILLL;
    public final float LLILZ;
    public final float LLILZIL;
    public final float LLILZLL;
    public final float LLIZ;
    public final float LLIZLLLIL;
    public final List<AbstractC1776680wKo> LLJ;
    public final List<AbstractC1696860uG4> LLJI;

    public C1696760uFu() {
        this("", 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, C1696220uF2.LIZ, C13BV.INSTANCE);
    }

    public final int hashCode() {
        return (((((((((((((((((this.LL.hashCode() * 31) + Float.floatToIntBits(this.LLILLJJLI)) * 31) + Float.floatToIntBits(this.LLILLL)) * 31) + Float.floatToIntBits(this.LLILZ)) * 31) + Float.floatToIntBits(this.LLILZIL)) * 31) + Float.floatToIntBits(this.LLILZLL)) * 31) + Float.floatToIntBits(this.LLIZ)) * 31) + Float.floatToIntBits(this.LLIZLLLIL)) * 31) + this.LLJ.hashCode()) * 31) + this.LLJI.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator<AbstractC1696860uG4> iterator() {
        return new C1696780uFw(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C1696760uFu)) {
            return false;
        }
        C1696760uFu c1696760uFu = (C1696760uFu) obj;
        if (Intrinsics.LJFF(this.LL, c1696760uFu.LL) && this.LLILLJJLI == c1696760uFu.LLILLJJLI && this.LLILLL == c1696760uFu.LLILLL && this.LLILZ == c1696760uFu.LLILZ && this.LLILZIL == c1696760uFu.LLILZIL && this.LLILZLL == c1696760uFu.LLILZLL && this.LLIZ == c1696760uFu.LLIZ && this.LLIZLLLIL == c1696760uFu.LLIZLLLIL && Intrinsics.LJFF(this.LLJ, c1696760uFu.LLJ) && Intrinsics.LJFF(this.LLJI, c1696760uFu.LLJI)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1696760uFu(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List<? extends AbstractC1776680wKo> list, List<? extends AbstractC1696860uG4> list2) {
        this.LL = str;
        this.LLILLJJLI = f;
        this.LLILLL = f2;
        this.LLILZ = f3;
        this.LLILZIL = f4;
        this.LLILZLL = f5;
        this.LLIZ = f6;
        this.LLIZLLLIL = f7;
        this.LLJ = list;
        this.LLJI = list2;
    }
}
