package X;

import com.bytedance.android.livesdk.model.message.BaseSyncMessage;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ti1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.strategy.LiveRevenueStrategyOuterService$onByteSyncMessageReceived$1", f = "LiveRevenueStrategyOuterService.kt", l = {}, m = "invokeSuspend")
public final class C754070Ti1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ byte[] LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C754070Ti1(byte[] bArr, InterfaceC1364105Vn<? super C754070Ti1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = bArr;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C754070Ti1(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Integer numLJ;
        C1C7U.LIZ("LiveRevenueStrategyOuterService@d6ec.onByteSyncMessageReceived$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            C1840100xz6 c1840100xz6 = C1840100xz6.LIZ;
            byte[] bArr = this.LL;
            c1840100xz6.getClass();
            BaseSyncMessage baseSyncMessage = (BaseSyncMessage) C1840100xz6.LJFF(bArr, BaseSyncMessage.class);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onByteSyncMessageReceived sync message: ");
            if (baseSyncMessage == null) {
                numLJ = null;
            } else {
                numLJ = C2286608xc.LJ(baseSyncMessage.methodType);
            }
            sbLIZ.append(numLJ);
            C20441214yg.LIZIZ("RevenueStrategyAppInit", C2188811AlT.LIZIZ(sbLIZ));
            if (baseSyncMessage != null) {
                C1840100xz6.LJI(baseSyncMessage);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onByteSyncMessageReceived sync message decode failed: ");
            sbLIZ2.append(th);
            C20441214yg.LIZIZ("RevenueStrategyAppInit", C2188811AlT.LIZIZ(sbLIZ2));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveRevenueStrategyOuterService@d6ec.onByteSyncMessageReceived$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
