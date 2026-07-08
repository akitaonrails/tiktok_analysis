package X;

import com.ss.android.ugc.aweme.offlinepush.signal.OfflinePushSignalCollectComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AwS54S0000100_24;
import njp.a;

/* JADX INFO: renamed from: X.0qrT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.offlinepush.signal.OfflinePushSignalCollectComponent$startStuckTiming$1", f = "OfflinePushSignalCollectComponent.kt", l = {95}, m = "invokeSuspend")
public final class C1566290qrT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ OfflinePushSignalCollectComponent LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1566290qrT(long j, OfflinePushSignalCollectComponent offlinePushSignalCollectComponent, InterfaceC1364105Vn<? super C1566290qrT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = offlinePushSignalCollectComponent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1566290qrT(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OfflinePushSignalCollectComponent@fc5b.startStuckTiming$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            long j = this.LLILLJJLI;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("OfflinePushSignalCollectComponent@fc5b.startStuckTiming$1");
                return objLJFF;
            }
        }
        this.LLILLL.LL.LJIIJJI(new AwS54S0000100_24(this.LLILLJJLI, 2));
        this.LLILLL.LLILZ = null;
        if (C1906580ziK.LJI()) {
            this.LLILLL.LL.LJIIJJI(AFwS213S0000000_24.get$arr$(449));
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("OfflinePushSignalCollectComponent@fc5b.startStuckTiming$1");
            return unit;
        }
        C1576970r8h.LIZ.getClass();
        C1566300qrU.LIZ = System.currentTimeMillis();
        C1566300qrU.LIZIZ = "stuck";
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("OfflinePushSignalCollectComponent@fc5b.startStuckTiming$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
