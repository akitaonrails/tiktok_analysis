package X;

import android.app.Activity;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06aV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.viewmodel.BotDetailViewModel$deleteBot$2$2", f = "BotDetailViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1633706aV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Activity LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1633706aV(Activity activity, InterfaceC1364105Vn<? super C1633706aV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = activity;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1633706aV(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BotDetailViewModel@6175.deleteBot$2$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1389910mGz c1389910mGz = new C1389910mGz(this.LL);
        c1389910mGz.LJIIIZ(2131848508);
        c1389910mGz.LJ(3000L);
        C1360890lWB c1360890lWB = c1389910mGz.LIZ;
        c1360890lWB.LIZIZ = 0;
        c1360890lWB.LIZLLL = 3;
        c1389910mGz.LJI(R.style.z4);
        c1389910mGz.LIZIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(C2286608xc.LJ(60))));
        c1389910mGz.LIZ(true);
        c1389910mGz.LJIIJJI();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BotDetailViewModel@6175.deleteBot$2$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
