package X;

import Y.AgS208S0200000_25;
import androidx.viewpager.widget.ViewPager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0sw8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.DMPlaygroundViewPagerComponent$onCreate$3", f = "DMPlaygroundViewPagerComponent.kt", l = {107}, m = "invokeSuspend")
public final class C1646060sw8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1646050sw7 LLILLJJLI;
    public final /* synthetic */ ViewPager LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1646060sw8(C1646050sw7 c1646050sw7, ViewPager viewPager, InterfaceC1364105Vn<? super C1646060sw8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1646050sw7;
        this.LLILLL = viewPager;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1646060sw8(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DMPlaygroundViewPagerComponent@a94f.onCreate$3");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C05YD<AbstractC540910LJh> c05ydAt2 = this.LLILLJJLI.at2();
            AgS208S0200000_25 agS208S0200000_25 = new AgS208S0200000_25(this.LLILLL, this.LLILLJJLI, 9);
            this.LL = 1;
            if (c05ydAt2.collect(agS208S0200000_25, this) == objLJFF) {
                C1C7U.LIZIZ("DMPlaygroundViewPagerComponent@a94f.onCreate$3");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
