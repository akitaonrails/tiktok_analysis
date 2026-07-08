package X;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS24S0100001_25;

/* JADX INFO: renamed from: X.0thI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1675300thI extends C09AY implements Function1<C1681030tqX, C1681040tqY> {
    public final /* synthetic */ float LL;
    public final /* synthetic */ float LLILLJJLI;
    public final /* synthetic */ C1690080u58 LLILLL;
    public final /* synthetic */ float LLILZ;
    public final /* synthetic */ C13EY<Integer, Integer> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1675300thI(float f, float f2, C1690080u58 c1690080u58, float f3, C13EY<Integer, Integer> c13ey) {
        super(1);
        this.LL = f;
        this.LLILLJJLI = f2;
        this.LLILLL = c1690080u58;
        this.LLILZ = f3;
        this.LLILZIL = c13ey;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1681040tqY invoke(C1681030tqX c1681030tqX) {
        float fIntBitsToFloat;
        float fLIZLLL;
        float fLIZLLL2;
        int iIntValue;
        C1681030tqX c1681030tqX2 = c1681030tqX;
        float density = this.LL * c1681030tqX2.getDensity();
        float f = this.LLILLJJLI * density;
        float f2 = density - f;
        if (Float.intBitsToFloat((int) (c1681030tqX2.LIZIZ() & 4294967295L)) <= f2) {
            fIntBitsToFloat = 0.0f;
        } else {
            fIntBitsToFloat = Float.intBitsToFloat((int) (c1681030tqX2.LIZIZ() & 4294967295L)) - f2;
            if (fIntBitsToFloat > density) {
                fIntBitsToFloat = density;
            }
        }
        float f3 = 1.0f;
        if (Float.intBitsToFloat((int) (c1681030tqX2.LIZIZ() & 4294967295L)) >= density) {
            fLIZLLL = 0.0f;
        } else {
            fLIZLLL = C13LZ.LIZLLL(1 - (fIntBitsToFloat / f), 0.0f, 1.0f);
        }
        if (!this.LLILLL.LIZLLL() && !this.LLILLL.LIZJ()) {
            fLIZLLL2 = 1.0f;
        } else {
            int iLJII = this.LLILLL.LJII();
            int iLJIIIIZZ = this.LLILLL.LJIIIIZZ();
            float density2 = this.LLILZ * c1681030tqX2.getDensity();
            int i = 0;
            for (int i2 = 0; i2 < iLJII; i2++) {
                Integer num = this.LLILZIL.get(Integer.valueOf(i2));
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
                i += iIntValue;
            }
            fLIZLLL2 = C13LZ.LIZLLL(((i + (density2 * iLJII)) + iLJIIIIZZ) / f, 0.0f, 1.0f);
        }
        float f4 = fIntBitsToFloat * fLIZLLL2;
        float fLIZIZ = C1677720tlC.LIZIZ(1.0f, fLIZLLL, fLIZLLL2);
        long j = C1685910tyP.LIZIZ;
        List listLJIIJJI = C1697810uHb.LJIIJJI(new C1685910tyP(C1685910tyP.LIZJ(fLIZIZ, j)), new C1685910tyP(j));
        if (f4 >= 1.0f) {
            f3 = f4;
        }
        return c1681030tqX2.LIZLLL(new AwS24S0100001_25(f4, C1668200tVq.LJII(listLJIIJJI, 0.0f, f3, 8), 2));
    }
}
