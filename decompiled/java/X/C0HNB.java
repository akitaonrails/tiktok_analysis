package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HNB, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.resultspage.v2.view.AliveButtonView$1$1$1$1", f = "AliveButtonView.kt", l = {}, m = "invokeSuspend")
public final class C0HNB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ C440750HQb LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HNB(boolean z, boolean z2, C440750HQb c440750HQb, InterfaceC1364105Vn<? super C0HNB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = z;
        this.LLILLJJLI = z2;
        this.LLILLL = c440750HQb;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HNB(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AliveButtonView@476a.<init>$1$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL) {
            if (this.LLILLJJLI) {
                C0HSG.LIZ.getClass();
                C0HSG.LIZIZ().storeBoolean("alive_switch_click_tooltip_shown", true);
                C1389880mGw c1389880mGw = new C1389880mGw(this.LLILLL);
                c1389880mGw.LJIIIIZZ(2131833906);
                c1389880mGw.LJIIJ();
            }
        } else {
            C1389880mGw c1389880mGw2 = new C1389880mGw(this.LLILLL);
            c1389880mGw2.LJIIIIZZ(2131833907);
            c1389880mGw2.LJIIJ();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AliveButtonView@476a.<init>$1$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
