package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0tiZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1676090tiZ extends C09AY implements Function1<InterfaceC1669010tX9, Unit> {
    public final /* synthetic */ C1692150u8T LL;
    public final /* synthetic */ C1677480tko<Float, C1677280tkU> LLILLJJLI;
    public final /* synthetic */ C05P0<C1692150u8T> LLILLL;
    public final /* synthetic */ C05P1<Integer> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1676090tiZ(C1692150u8T c1692150u8T, C1677480tko<Float, C1677280tkU> c1677480tko, C05P0<C1692150u8T> c05p0, C05P1<Integer> c05p1) {
        super(1);
        this.LL = c1692150u8T;
        this.LLILLJJLI = c1677480tko;
        this.LLILLL = c05p0;
        this.LLILZ = c05p1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC1669010tX9 interfaceC1669010tX9) {
        float fFloatValue;
        InterfaceC1669010tX9 interfaceC1669010tX92 = interfaceC1669010tX9;
        C1692150u8T value = this.LLILLL.getValue();
        C1692150u8T c1692150u8T = this.LL;
        if (c1692150u8T != null) {
            float fFloatValue2 = this.LLILLJJLI.LIZLLL().floatValue();
            int iIntValue = this.LLILZ.getValue().intValue();
            int i = c1692150u8T.LIZIZ.LJFF;
            if (i > 0 && iIntValue >= 0 && iIntValue < i) {
                float fLJI = C1676150tif.LJI(c1692150u8T);
                if (fLJI <= 0.0f) {
                    fFloatValue = C13LZ.LIZLLL(fFloatValue2, 0.0f, 1.0f);
                } else {
                    float fLJIIIIZZ = 0.0f;
                    for (int i2 = 0; i2 < iIntValue; i2++) {
                        fLJIIIIZZ += C1676150tif.LJIIIIZZ(c1692150u8T, i2);
                    }
                    float fLJIIIIZZ2 = C1676150tif.LJIIIIZZ(c1692150u8T, iIntValue);
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
        if (value != null && value.LIZIZ.LJFF > 0 && fFloatValue > 0.0f) {
            float fLJIIIIZZ3 = C1676150tif.LJIIIIZZ(value, 0);
            if (fLJIIIIZZ3 > 0.0f) {
                float fLIZLLL = fLJIIIIZZ3 * C13LZ.LIZLLL(fFloatValue, 0.0f, 1.0f);
                float fLJIIIZ = value.LJIIIZ(0);
                float fLJIIL = value.LJIIL(0);
                float f = fLJIIIZ + fLIZLLL;
                float fLJFF = value.LJFF(0);
                C1695230uDR c1695230uDRLJLJI = interfaceC1669010tX92.LJLJI();
                long jLIZIZ = c1695230uDRLJLJI.LIZIZ();
                c1695230uDRLJLJI.LIZ().save();
                try {
                    c1695230uDRLJLJI.LIZ.LIZJ(fLJIIIZ, fLJIIL, f, fLJFF, 1);
                    interfaceC1669010tX92.LLIIJLIL();
                    c1695230uDRLJLJI.LIZ().LJIIJ();
                    c1695230uDRLJLJI.LIZJ(jLIZIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c1695230uDRLJLJI.LIZ().LJIIJ();
                    c1695230uDRLJLJI.LIZJ(jLIZIZ);
                    throw th;
                }
            }
        }
        return Unit.LIZ;
    }
}
