package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS226S0300000_17;
import kotlin.jvm.internal.AwS418S0200000_17;

/* JADX INFO: renamed from: X.0fgn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1136830fgn extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1135930ffL LL;
    public final /* synthetic */ InterfaceC1136020ffU LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ InterfaceC1135310feL LLILZ;
    public final /* synthetic */ C1135920ffK LLILZIL;
    public final /* synthetic */ boolean LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1136830fgn(C1135930ffL c1135930ffL, InterfaceC1136020ffU interfaceC1136020ffU, boolean z, InterfaceC1135310feL interfaceC1135310feL, C1135920ffK c1135920ffK, boolean z2) {
        super(0);
        this.LL = c1135930ffL;
        this.LLILLJJLI = interfaceC1136020ffU;
        this.LLILLL = z;
        this.LLILZ = interfaceC1135310feL;
        this.LLILZIL = c1135920ffK;
        this.LLILZLL = z2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        try {
            C1135930ffL c1135930ffL = this.LL;
            InterfaceC1136020ffU interfaceC1136020ffU = this.LLILLJJLI;
            this.LLILZ.LIZIZ("GiftTrayMessageQueue.tryDirectShow.fallback", new C1137520fhu(this.LLILZIL, c1135930ffL.LJIILLIIL(interfaceC1136020ffU, this.LLILLL, new AwS418S0200000_17(this.LLILZIL, interfaceC1136020ffU, 65), new AwS226S0300000_17(this.LLILZ, this.LLILZIL, this.LLILLJJLI, 10)), this.LLILLJJLI, this.LLILZLL));
            return Unit.LIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLILZ.LIZIZ("GiftTrayMessageQueue.tryDirectShow.fallback", new C1137520fhu(this.LLILZIL, false, this.LLILLJJLI, this.LLILZLL));
            throw th;
        }
    }
}
