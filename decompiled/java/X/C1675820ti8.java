package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0ti8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1675820ti8 extends C09AY implements Function1<InterfaceC1675870tiD, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ C1677480tko<Float, C1677280tkU> LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ long LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1675820ti8(boolean z, C1677480tko<Float, C1677280tkU> c1677480tko, long j, long j2, long j3) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = c1677480tko;
        this.LLILLL = j;
        this.LLILZ = j2;
        this.LLILZIL = j3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC1675870tiD interfaceC1675870tiD) {
        InterfaceC1675870tiD interfaceC1675870tiD2 = interfaceC1675870tiD;
        if (this.LL) {
            C1677480tko<Float, C1677280tkU> c1677480tko = this.LLILLJJLI;
            long j = this.LLILLL;
            long j2 = this.LLILZ;
            long j3 = this.LLILZIL;
            long jLJIJI = interfaceC1675870tiD2.LJIJI();
            C1695230uDR c1695230uDRLJLJI = interfaceC1675870tiD2.LJLJI();
            long jLIZIZ = c1695230uDRLJLJI.LIZIZ();
            c1695230uDRLJLJI.LIZ().save();
            try {
                c1695230uDRLJLJI.LIZ.LIZ(-1.0f, 1.0f, jLJIJI);
                C1675780ti4.LIZIZ(interfaceC1675870tiD2, c1677480tko.LIZLLL().floatValue(), j, j2, j3);
                c1695230uDRLJLJI.LIZ().LJIIJ();
                c1695230uDRLJLJI.LIZJ(jLIZIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c1695230uDRLJLJI.LIZ().LJIIJ();
                c1695230uDRLJLJI.LIZJ(jLIZIZ);
                throw th;
            }
        } else {
            C1675780ti4.LIZIZ(interfaceC1675870tiD2, this.LLILLJJLI.LIZLLL().floatValue(), this.LLILLL, this.LLILZ, this.LLILZIL);
        }
        return Unit.LIZ;
    }
}
