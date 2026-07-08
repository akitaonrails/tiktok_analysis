package X;

import Y.ACListenerS108S0200000_4;
import android.content.Context;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0DZp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.TakoServiceImpl$showShareToast$1", f = "TakoServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C341310DZp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ C19EG LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ Context LLILZ;
    public final /* synthetic */ C1388100mE4 LLILZIL;
    public final /* synthetic */ C1863380yae LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C341310DZp(String str, C19EG c19eg, int i, Context context, C1388100mE4 c1388100mE4, C1863380yae c1863380yae, InterfaceC1364105Vn<? super C341310DZp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = c19eg;
        this.LLILLL = i;
        this.LLILZ = context;
        this.LLILZIL = c1388100mE4;
        this.LLILZLL = c1863380yae;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C341310DZp(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoServiceImpl@d56d.showShareToast$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String str = this.LL;
        if (str != null) {
            C19EG c19eg = this.LLILLJJLI;
            int i = this.LLILLL;
            Context context = this.LLILZ;
            C1388100mE4 c1388100mE4 = this.LLILZIL;
            C1389910mGz c1389910mGz = new C1389910mGz(c19eg);
            c1389910mGz.LJIIJ(str);
            c1389910mGz.LJI(R.style.y0);
            c1389910mGz.LJ(3000L);
            c1389910mGz.LIZIZ(i);
            ACListenerS108S0200000_4 aCListenerS108S0200000_4 = new ACListenerS108S0200000_4(context, c1388100mE4, 16);
            C1360890lWB c1360890lWB = c1389910mGz.LIZ;
            c1360890lWB.LJIIIIZZ = aCListenerS108S0200000_4;
            c1360890lWB.LIZLLL = 0;
            c1360890lWB.LIZIZ = 0;
            c1389910mGz.LJIIJJI();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoServiceImpl@d56d.showShareToast$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
