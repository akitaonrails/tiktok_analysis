package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0tiY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1676080tiY extends C09AY implements Function1<InterfaceC1669010tX9, Unit> {
    public final /* synthetic */ C1692150u8T LL;
    public final /* synthetic */ C1677480tko<Float, C1677280tkU> LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ C05P0<C1692150u8T> LLILZ;
    public final /* synthetic */ C05P1<Integer> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1676080tiY(C1692150u8T c1692150u8T, C1677480tko<Float, C1677280tkU> c1677480tko, int i, C05P0<C1692150u8T> c05p0, C05P1<Integer> c05p1) {
        super(1);
        this.LL = c1692150u8T;
        this.LLILLJJLI = c1677480tko;
        this.LLILLL = i;
        this.LLILZ = c05p0;
        this.LLILZIL = c05p1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC1669010tX9 interfaceC1669010tX9) throws Throwable {
        float fFloatValue;
        int i;
        InterfaceC1669010tX9 interfaceC1669010tX92 = interfaceC1669010tX9;
        C1692150u8T value = this.LLILZ.getValue();
        C1692150u8T c1692150u8T = this.LL;
        int i2 = 0;
        float f = 0.0f;
        if (c1692150u8T != null) {
            float fFloatValue2 = this.LLILLJJLI.LIZLLL().floatValue();
            int iIntValue = this.LLILZIL.getValue().intValue();
            int i3 = this.LLILLL;
            int i4 = c1692150u8T.LIZIZ.LJFF;
            if (i4 > 0 && iIntValue >= 0 && iIntValue < i4 && i3 > 0) {
                float fLJI = C1676150tif.LJI(c1692150u8T);
                if (fLJI <= 0.0f) {
                    fFloatValue = C13LZ.LIZLLL(fFloatValue2, 0.0f, 1.0f);
                } else {
                    int i5 = i3 + iIntValue;
                    int i6 = c1692150u8T.LIZIZ.LJFF;
                    if (i5 > i6) {
                        i5 = i6;
                    }
                    float fLJIIIIZZ = 0.0f;
                    for (int i7 = 0; i7 < iIntValue; i7++) {
                        fLJIIIIZZ += C1676150tif.LJIIIIZZ(c1692150u8T, i7);
                    }
                    float fLJIIIIZZ2 = 0.0f;
                    while (iIntValue < i5) {
                        fLJIIIIZZ2 += C1676150tif.LJIIIIZZ(c1692150u8T, iIntValue);
                        iIntValue++;
                    }
                    if (fLJIIIIZZ2 <= 0.0f) {
                        fFloatValue = 0.0f;
                    } else {
                        fFloatValue = C13LZ.LIZLLL(((fLJI * C13LZ.LIZLLL(fFloatValue2, 0.0f, 1.0f)) - fLJIIIIZZ) / fLJIIIIZZ2, 0.0f, 1.0f);
                    }
                }
            } else {
                fFloatValue = C13LZ.LIZLLL(fFloatValue2, 0.0f, 1.0f);
            }
        } else {
            fFloatValue = this.LLILLJJLI.LIZLLL().floatValue();
        }
        if (value != null && (i = value.LIZIZ.LJFF) > 0 && fFloatValue > 0.0f) {
            float fLJI2 = C1676150tif.LJI(value);
            if (fLJI2 > 0.0f) {
                float fLIZLLL = fLJI2 * C13LZ.LIZLLL(fFloatValue, 0.0f, 1.0f);
                do {
                    float fLJIIIIZZ3 = C1676150tif.LJIIIIZZ(value, i2);
                    float fLIZLLL2 = C13LZ.LIZLLL(fLIZLLL, f, fLJIIIIZZ3);
                    if (fLIZLLL2 > f) {
                        float fLJIIIZ = value.LJIIIZ(i2);
                        float fLJIIL = value.LJIIL(i2);
                        float fLJFF = value.LJFF(i2);
                        float f2 = fLJIIIZ + fLIZLLL2;
                        C1695230uDR c1695230uDRLJLJI = interfaceC1669010tX92.LJLJI();
                        long jLIZIZ = c1695230uDRLJLJI.LIZIZ();
                        c1695230uDRLJLJI.LIZ().save();
                        try {
                            try {
                                c1695230uDRLJLJI.LIZ.LIZJ(fLJIIIZ, fLJIIL, f2, fLJFF, 1);
                                interfaceC1669010tX92.LLIIJLIL();
                                c1695230uDRLJLJI.LIZ().LJIIJ();
                                c1695230uDRLJLJI.LIZJ(jLIZIZ);
                            } catch (Throwable th) {
                                th = th;
                                while (true) {
                                    try {
                                        TryCatchGuardChecker.doCheck(th);
                                        c1695230uDRLJLJI.LIZ().LJIIJ();
                                        c1695230uDRLJLJI.LIZJ(jLIZIZ);
                                        throw th;
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    }
                    fLIZLLL -= fLJIIIIZZ3;
                    if (fLIZLLL <= 0.0f) {
                        break;
                    }
                    i2++;
                    f = 0.0f;
                } while (i2 < i);
            }
        }
        return Unit.LIZ;
    }
}
