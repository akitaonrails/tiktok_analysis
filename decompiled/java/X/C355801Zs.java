package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.play.topguest.common.BaseTopGuestGamePlayWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Zs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.multiguestv3.main.play.topguest.common.BaseTopGuestGamePlayWidget$onCreate$1$1", f = "BaseTopGuestGamePlayWidget.kt", l = {}, m = "invokeSuspend")
public final class C355801Zs extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ BaseTopGuestGamePlayWidget<VM> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C355801Zs(BaseTopGuestGamePlayWidget<VM> baseTopGuestGamePlayWidget, InterfaceC1364105Vn<? super C355801Zs> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = baseTopGuestGamePlayWidget;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C355801Zs c355801Zs = new C355801Zs(this.LLILLJJLI, interfaceC1364105Vn);
        c355801Zs.LL = obj;
        return c355801Zs;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BaseTopGuestGamePlayWidget@17c1.onCreate$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LL;
        C23250099c.LIZLLL(interfaceC497601wk, null, null, new C355901Zt(this.LLILLJJLI, null), 3);
        C23250099c.LIZLLL(interfaceC497601wk, null, null, new C355701Zr(this.LLILLJJLI, null), 3);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BaseTopGuestGamePlayWidget@17c1.onCreate$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
