package X;

import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.062f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ui.AiMojiManageViewHolder$enterManagePage$1$1", f = "AiMojiBannerEntranceViewHolder.kt", l = {}, m = "invokeSuspend")
public final class C15427062f extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Integer LL;
    public final /* synthetic */ C0HYK LLILLJJLI;
    public final /* synthetic */ DialogC1389620mGW LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15427062f(Integer num, C0HYK c0hyk, DialogC1389620mGW dialogC1389620mGW, InterfaceC1364105Vn<? super C15427062f> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = num;
        this.LLILLJJLI = c0hyk;
        this.LLILLL = dialogC1389620mGW;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C15427062f(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AiMojiManageViewHolder@e077.enterManagePage$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL != null) {
            this.LLILLJJLI.LLILLJJLI.ji("favourite_tab", false, false);
        } else {
            C1389890mGx c1389890mGx = new C1389890mGx(this.LLILLJJLI.LL);
            c1389890mGx.LJIIIZ(R.string.m25);
            c1389890mGx.LJIIJJI();
        }
        C786410Ut5.LJIIJ(this.LLILLL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AiMojiManageViewHolder@e077.enterManagePage$1$1");
        return unit;
    }
}
