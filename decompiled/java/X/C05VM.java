package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS546S0100000_2;
import njp.a;

/* JADX INFO: renamed from: X.05VM, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.login.auth.ui.login.ComposeLoginChannelColumnKt$ChannelContainer$2$2$1", f = "ComposeLoginChannelColumn.kt", l = {205}, m = "invokeSuspend")
public final class C05VM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1690080u58 LLILLL;
    public final /* synthetic */ InterfaceC1665500tRU<C1687890u1b> LLILZ;
    public final /* synthetic */ InterfaceC1690500u5o LLILZIL;
    public final /* synthetic */ C05P0<C1668650tWZ> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C05VM(C1690080u58 c1690080u58, InterfaceC1665500tRU<? extends C1687890u1b> interfaceC1665500tRU, InterfaceC1690500u5o interfaceC1690500u5o, C05P0<C1668650tWZ> c05p0, InterfaceC1364105Vn<? super C05VM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1690080u58;
        this.LLILZ = interfaceC1665500tRU;
        this.LLILZIL = interfaceC1690500u5o;
        this.LLILZLL = c05p0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C05VM c05vm = new C05VM(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c05vm.LLILLJJLI = obj;
        return c05vm;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ComposeLoginChannelColumnKt@5bbb.ChannelContainer$2$2$1");
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
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            C095D c095dLJIIIZ = C20028913Yh.LJIIIZ(new AwS546S0100000_2(this.LLILLL, 1235));
            C05VL c05vl = new C05VL(this.LLILZ, this.LLILLL, this.LLILZIL, interfaceC497601wk, this.LLILZLL, null);
            this.LL = 1;
            if (C09IC.LJII(c095dLJIIIZ, this, c05vl) == objLJFF) {
                C1C7U.LIZIZ("ComposeLoginChannelColumnKt@5bbb.ChannelContainer$2$2$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ComposeLoginChannelColumnKt@5bbb.ChannelContainer$2$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
