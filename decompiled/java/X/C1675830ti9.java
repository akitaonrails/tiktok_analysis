package X;

import android.graphics.Matrix;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0ti9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1675830ti9 extends C09AY implements Function1<InterfaceC1675870tiD, Unit> {
    public final /* synthetic */ C1377105aD LL;
    public final /* synthetic */ C05P0<C09AE> LLILLJJLI;
    public final /* synthetic */ C1677480tko<Float, C1677280tkU> LLILLL;
    public final /* synthetic */ C1677480tko<C1378605aS, C1677270tkT> LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final /* synthetic */ C1677480tko<Float, C1677280tkU> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1675830ti9(C1377105aD c1377105aD, C05P0<C09AE> c05p0, C1677480tko<Float, C1677280tkU> c1677480tko, C1677480tko<C1378605aS, C1677270tkT> c1677480tko2, long j, C1677480tko<Float, C1677280tkU> c1677480tko3) {
        super(1);
        this.LL = c1377105aD;
        this.LLILLJJLI = c05p0;
        this.LLILLL = c1677480tko;
        this.LLILZ = c1677480tko2;
        this.LLILZIL = j;
        this.LLILZLL = c1677480tko3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC1675870tiD interfaceC1675870tiD) throws Throwable {
        float fLIZIZ;
        long jLIZIZ;
        InterfaceC1675870tiD interfaceC1675870tiD2 = interfaceC1675870tiD;
        C1683130ttv c1683130ttvLIZ = this.LL.LIZ();
        if (c1683130ttvLIZ.LIZJ - c1683130ttvLIZ.LIZ > 0.0f && c1683130ttvLIZ.LIZLLL - c1683130ttvLIZ.LIZIZ > 0.0f) {
            if (this.LLILLJJLI.getValue() != null) {
                fLIZIZ = this.LLILLL.LIZLLL().floatValue();
                jLIZIZ = this.LLILZ.LIZLLL().LIZ;
            } else {
                fLIZIZ = ((C13FI) this.LL.LIZIZ).LIZIZ();
                jLIZIZ = this.LL.LIZIZ();
            }
            float fMax = fLIZIZ * Math.max((c1683130ttvLIZ.LIZJ - c1683130ttvLIZ.LIZ) / this.LL.LIZ.getWidth(), (c1683130ttvLIZ.LIZLLL - c1683130ttvLIZ.LIZIZ) / this.LL.LIZ.getHeight());
            long jLIZIZ2 = C1671580tbI.LIZIZ(interfaceC1675870tiD2.LIZIZ());
            C1377105aD c1377105aD = this.LL;
            C1695230uDR c1695230uDRLJLJI = interfaceC1675870tiD2.LJLJI();
            long jLIZIZ3 = c1695230uDRLJLJI.LIZIZ();
            c1695230uDRLJLJI.LIZ().save();
            try {
                C1686260tyy c1686260tyy = c1695230uDRLJLJI.LIZ;
                c1686260tyy.LJII(Float.intBitsToFloat((int) (jLIZIZ >> 32)), Float.intBitsToFloat((int) (jLIZIZ & 4294967295L)));
                c1686260tyy.LIZ(fMax, fMax, jLIZIZ2);
                c1686260tyy.LJII(Float.intBitsToFloat((int) (jLIZIZ2 >> 32)), Float.intBitsToFloat((int) (jLIZIZ2 & 4294967295L)));
                c1686260tyy.LJII((-c1377105aD.LIZ.getWidth()) / 2.0f, (-c1377105aD.LIZ.getHeight()) / 2.0f);
                C1675860tiC.LJFF(interfaceC1675870tiD2, new C1696790uFx(c1377105aD.LIZ), null, 62);
                c1695230uDRLJLJI.LIZ().LJIIJ();
                c1695230uDRLJLJI.LIZJ(jLIZIZ3);
                float f = c1683130ttvLIZ.LIZJ - c1683130ttvLIZ.LIZ;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(c1683130ttvLIZ.LIZLLL - c1683130ttvLIZ.LIZIZ)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
                C1695950uEb c1695950uEb = C1674780tgS.LIZ;
                C1695950uEb c1695950uEbLIZ = C1695940uEa.LIZ();
                C1675840tiA.LIZIZ(c1695950uEbLIZ, c1695950uEb);
                C1683130ttv bounds = c1695950uEbLIZ.getBounds();
                float f2 = bounds.LIZJ;
                float f3 = bounds.LIZ;
                float f4 = f2 - f3;
                if (f4 > 0.0f) {
                    float f5 = bounds.LIZLLL;
                    float f6 = bounds.LIZIZ;
                    float f7 = f5 - f6;
                    if (f7 > 0.0f) {
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) / (f7 + (f6 * 2.0f));
                        float[] fArrLIZ = C1696000uEg.LIZ();
                        C1696000uEg.LJ(fIntBitsToFloat / (f4 + (f3 * 2.0f)), fIntBitsToFloat2, 1.0f, fArrLIZ);
                        if (c1695950uEbLIZ.LJ == null) {
                            c1695950uEbLIZ.LJ = new Matrix();
                        }
                        C1697320uGo.LIZ(c1695950uEbLIZ.LJ, fArrLIZ);
                        c1695950uEbLIZ.LIZIZ.transform(c1695950uEbLIZ.LJ);
                    }
                }
                c1695950uEbLIZ.LJIJ((((long) Float.floatToRawIntBits(c1683130ttvLIZ.LIZ)) << 32) | (((long) Float.floatToRawIntBits(c1683130ttvLIZ.LIZIZ)) & 4294967295L));
                long j = this.LLILZIL;
                C1677480tko<Float, C1677280tkU> c1677480tko = this.LLILZLL;
                C1695230uDR c1695230uDRLJLJI2 = interfaceC1675870tiD2.LJLJI();
                long jLIZIZ4 = c1695230uDRLJLJI2.LIZIZ();
                c1695230uDRLJLJI2.LIZ().save();
                try {
                    c1695230uDRLJLJI2.LIZ.LIZIZ(c1695950uEbLIZ, 0);
                    try {
                        C1675860tiC.LJIIJ(interfaceC1675870tiD2, C1685910tyP.LIZJ(c1677480tko.LIZLLL().floatValue(), j), 0L, 0L, 0.0f, null, null, 0, 126);
                        c1695230uDRLJLJI2.LIZ().LJIIJ();
                        c1695230uDRLJLJI2.LIZJ(jLIZIZ4);
                    } catch (Throwable th) {
                        th = th;
                        while (true) {
                            try {
                                TryCatchGuardChecker.doCheck(th);
                                c1695230uDRLJLJI2.LIZ().LJIIJ();
                                c1695230uDRLJLJI2.LIZJ(jLIZIZ4);
                                throw th;
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                TryCatchGuardChecker.doCheck(th4);
                c1695230uDRLJLJI.LIZ().LJIIJ();
                c1695230uDRLJLJI.LIZJ(jLIZIZ3);
                throw th4;
            }
        }
        return Unit.LIZ;
    }
}
