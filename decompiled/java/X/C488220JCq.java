package X;

import com.ss.android.ugc.aweme.biz.wallet.biz.commonpage.WalletCommonStepAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS551S0100000_7;
import njp.a;

/* JADX INFO: renamed from: X.0JCq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.biz.wallet.biz.commonpage.WalletCommonStepAssem$doExecute$1$1$1$1$onResult$2", f = "WalletCommonStepAssem.kt", l = {}, m = "invokeSuspend")
public final class C488220JCq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ WalletCommonStepAssem LL;
    public final /* synthetic */ Object LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C488220JCq(WalletCommonStepAssem walletCommonStepAssem, Object obj, InterfaceC1364105Vn<? super C488220JCq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = walletCommonStepAssem;
        this.LLILLJJLI = obj;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C488220JCq(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("WalletCommonStepAssem@75b9.doExecute$1$1$1$1$onResult$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1749280vcc c1749280vccLo = this.LL.Lo();
        C1722300uv6 c1722300uv6 = new C1722300uv6();
        Object obj2 = this.LLILLJJLI;
        if (obj2 == null) {
            obj2 = "";
        }
        C1719940urI.LIZIZ(c1722300uv6, obj2.toString(), new AwS551S0100000_7(this.LL, 126));
        c1749280vccLo.setStatus(c1722300uv6);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("WalletCommonStepAssem@75b9.doExecute$1$1$1$1$onResult$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
