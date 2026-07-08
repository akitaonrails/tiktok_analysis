package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0tiE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1675880tiE extends C09AY implements Function1<InterfaceC1669010tX9, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ AbstractC1668700tWe LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ float LLILZ;
    public final /* synthetic */ float LLILZIL;
    public final /* synthetic */ long LLILZLL;
    public final /* synthetic */ long LLIZ;
    public final /* synthetic */ C1695210uDP LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1675880tiE(boolean z, AbstractC1668700tWe abstractC1668700tWe, long j, float f, float f2, long j2, long j3, C1695210uDP c1695210uDP) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = abstractC1668700tWe;
        this.LLILLL = j;
        this.LLILZ = f;
        this.LLILZIL = f2;
        this.LLILZLL = j2;
        this.LLIZ = j3;
        this.LLIZLLLIL = c1695210uDP;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC1669010tX9 interfaceC1669010tX9) {
        InterfaceC1669010tX9 interfaceC1669010tX92 = interfaceC1669010tX9;
        interfaceC1669010tX92.LLIIJLIL();
        if (this.LL) {
            C1675860tiC.LJIIJJI(interfaceC1669010tX92, this.LLILLJJLI, 0L, 0L, this.LLILLL, null, 246);
        } else {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (this.LLILLL >> 32));
            float f = this.LLILZ;
            if (fIntBitsToFloat < f) {
                float f2 = this.LLILZIL;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (interfaceC1669010tX92.LIZIZ() >> 32)) - this.LLILZIL;
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (interfaceC1669010tX92.LIZIZ() & 4294967295L)) - this.LLILZIL;
                AbstractC1668700tWe abstractC1668700tWe = this.LLILLJJLI;
                long j = this.LLILLL;
                C1695230uDR c1695230uDRLJLJI = interfaceC1669010tX92.LJLJI();
                long jLIZIZ = c1695230uDRLJLJI.LIZIZ();
                c1695230uDRLJLJI.LIZ().save();
                try {
                    c1695230uDRLJLJI.LIZ.LIZJ(f2, f2, fIntBitsToFloat2, fIntBitsToFloat3, 0);
                    C1675860tiC.LJIIJJI(interfaceC1669010tX92, abstractC1668700tWe, 0L, 0L, j, null, 246);
                    c1695230uDRLJLJI.LIZ().LJIIJ();
                    c1695230uDRLJLJI.LIZJ(jLIZIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c1695230uDRLJLJI.LIZ().LJIIJ();
                    c1695230uDRLJLJI.LIZJ(jLIZIZ);
                    throw th;
                }
            } else {
                C1675860tiC.LJIIJJI(interfaceC1669010tX92, this.LLILLJJLI, this.LLILZLL, this.LLIZ, C1675890tiF.LIZJ(f, this.LLILLL), this.LLIZLLLIL, 208);
            }
        }
        return Unit.LIZ;
    }
}
