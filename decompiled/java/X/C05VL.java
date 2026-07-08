package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05VL, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.login.auth.ui.login.ComposeLoginChannelColumnKt$ChannelContainer$2$2$1$2", f = "ComposeLoginChannelColumn.kt", l = {}, m = "invokeSuspend")
public final class C05VL extends C09AX implements Function2<List<? extends C06XG>, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ InterfaceC1665500tRU<C1687890u1b> LLILLJJLI;
    public final /* synthetic */ C1690080u58 LLILLL;
    public final /* synthetic */ InterfaceC1690500u5o LLILZ;
    public final /* synthetic */ InterfaceC497601wk LLILZIL;
    public final /* synthetic */ C05P0<C1668650tWZ> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C05VL(InterfaceC1665500tRU<? extends C1687890u1b> interfaceC1665500tRU, C1690080u58 c1690080u58, InterfaceC1690500u5o interfaceC1690500u5o, InterfaceC497601wk interfaceC497601wk, C05P0<C1668650tWZ> c05p0, InterfaceC1364105Vn<? super C05VL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC1665500tRU;
        this.LLILLL = c1690080u58;
        this.LLILZ = interfaceC1690500u5o;
        this.LLILZIL = interfaceC497601wk;
        this.LLILZLL = c05p0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C05VL c05vl = new C05VL(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c05vl.LL = obj;
        return c05vl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ComposeLoginChannelColumnKt@5bbb.ChannelContainer$2$2$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List list = (List) this.LL;
        if (list.size() == this.LLILLJJLI.size()) {
            C06XG c06xg = (C06XG) C13LP.LJJLIIIJL(list);
            if (c06xg == null) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("ComposeLoginChannelColumnKt@5bbb.ChannelContainer$2$2$1$2");
                return unit;
            }
            int iLIZ = (((int) (this.LLILLL.LJIIIZ().LIZ() & 4294967295L)) - c06xg.getOffset()) - c06xg.getSize();
            if (iLIZ > 0) {
                this.LLILZLL.setValue(new C1668650tWZ(this.LLILZ.LJJI(iLIZ)));
            }
            C2296808zG.LIZJ(this.LLILZIL, null);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ComposeLoginChannelColumnKt@5bbb.ChannelContainer$2$2$1$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(List<? extends C06XG> list, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(list, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
