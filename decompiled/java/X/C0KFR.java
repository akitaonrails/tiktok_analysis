package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS373S0200000_7;
import njp.a;

/* JADX INFO: renamed from: X.0KFR, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.subscription.pgc.jsbridge.impl.IapForSubscriptionV2PGCMethod$handle$3", f = "IapForSubscriptionV2PGCMethod.kt", l = {334}, m = "invokeSuspend")
public final class C0KFR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0KFL LLILLJJLI;
    public final /* synthetic */ CompletionBlock<C0KFT> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0KFR(C0KFL c0kfl, CompletionBlock<C0KFT> completionBlock, InterfaceC1364105Vn<? super C0KFR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0kfl;
        this.LLILLL = completionBlock;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0KFR(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IapForSubscriptionV2PGCMethod@9da2.handle$3");
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
            InterfaceC514320KFa interfaceC514320KFa = (InterfaceC514320KFa) this.LLILLJJLI.LLIZ.getValue();
            if (interfaceC514320KFa != null && interfaceC514320KFa.LIZ() != null) {
                AwS373S0200000_7 awS373S0200000_7 = new AwS373S0200000_7(this.LLILLJJLI, (C0KFL) this.LLILLL, (CompletionBlock<C0KFT>) 86);
                this.LL = 1;
                if (C0KL4.LJFF(this, awS373S0200000_7) == objLJFF) {
                    C1C7U.LIZIZ("IapForSubscriptionV2PGCMethod@9da2.handle$3");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IapForSubscriptionV2PGCMethod@9da2.handle$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
