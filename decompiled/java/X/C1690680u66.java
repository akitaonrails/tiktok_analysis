package X;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0u66, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.login.auth.factory.SignupPagerKt$AlwaysUseTargetPageHeightPager$1$1$2", f = "SignupPager.kt", l = {}, m = "invokeSuspend")
public final class C1690680u66 extends C09AX implements Function2<List<? extends InterfaceC1690900u6S>, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ InterfaceC497601wk LLILLJJLI;
    public final /* synthetic */ AbstractC1690640u62 LLILLL;
    public final /* synthetic */ InterfaceC1676320tiw LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1690680u66(InterfaceC497601wk interfaceC497601wk, AbstractC1690640u62 abstractC1690640u62, InterfaceC1676320tiw interfaceC1676320tiw, InterfaceC1364105Vn<? super C1690680u66> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC497601wk;
        this.LLILLL = abstractC1690640u62;
        this.LLILZ = interfaceC1676320tiw;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1690680u66 c1690680u66 = new C1690680u66(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c1690680u66.LL = obj;
        return c1690680u66;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object next;
        C1C7U.LIZ("SignupPagerKt@6476.AlwaysUseTargetPageHeightPager$1$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List list = (List) this.LL;
        AbstractC1690640u62 abstractC1690640u62 = this.LLILLL;
        Iterator it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (((InterfaceC1690900u6S) next).getIndex() == ((Number) abstractC1690640u62.LJIJJLI.getValue()).intValue()) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        InterfaceC1690900u6S interfaceC1690900u6S = (InterfaceC1690900u6S) next;
        if (interfaceC1690900u6S != null) {
            C1690300u5U c1690300u5U = (C1690300u5U) interfaceC1690900u6S;
            Iterator it3 = list.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Object next2 = it3.next();
                if (((C1690300u5U) ((InterfaceC1690900u6S) next2)).LJIIJ > c1690300u5U.LJIIJ) {
                    if (next2 != null) {
                        this.LLILZ.LJIIJ(c1690300u5U.LJIIJ);
                    }
                }
            }
            C2296808zG.LIZJ(this.LLILLJJLI, null);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SignupPagerKt@6476.AlwaysUseTargetPageHeightPager$1$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(List<? extends InterfaceC1690900u6S> list, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(list, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
