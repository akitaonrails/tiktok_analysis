package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05k8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.resultspage.v2.view.AliveButtonView$1$3$1", f = "AliveButtonView.kt", l = {}, m = "invokeSuspend")
public final class C1438605k8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C440750HQb LL;
    public final /* synthetic */ Context LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1438605k8(C440750HQb c440750HQb, Context context, InterfaceC1364105Vn<? super C1438605k8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c440750HQb;
        this.LLILLJJLI = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1438605k8(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AliveButtonView@476a.<init>$1$3$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1389880mGw c1389880mGw = new C1389880mGw(this.LL);
        c1389880mGw.LJIIIZ(this.LLILLJJLI.getString(2131828707));
        c1389880mGw.LJIIJ();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AliveButtonView@476a.<init>$1$3$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
