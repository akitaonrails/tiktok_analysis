package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.play.topguest.common.BaseTopGuestGamePlayWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Zt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.multiguestv3.main.play.topguest.common.BaseTopGuestGamePlayWidget$onCreate$1$1$1", f = "BaseTopGuestGamePlayWidget.kt", l = {57}, m = "invokeSuspend")
public final class C355901Zt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ BaseTopGuestGamePlayWidget<VM> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C355901Zt(BaseTopGuestGamePlayWidget<VM> baseTopGuestGamePlayWidget, InterfaceC1364105Vn<? super C355901Zt> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = baseTopGuestGamePlayWidget;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C355901Zt(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C01S9 c01s9;
        C1C7U.LIZ("BaseTopGuestGamePlayWidget@17c1.onCreate$1$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            VM vm = this.LLILLJJLI.LL;
            if (vm != 0 && (c01s9 = (C01S9) vm.LLILLL.getValue()) != null) {
                C517001zs c517001zs = new C517001zs(this.LLILLJJLI, 4);
                this.LL = 1;
                if (c01s9.collect(c517001zs, this) == objLJFF) {
                    C1C7U.LIZIZ("BaseTopGuestGamePlayWidget@17c1.onCreate$1$1$1");
                    return objLJFF;
                }
            } else {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("BaseTopGuestGamePlayWidget@17c1.onCreate$1$1$1");
                return unit;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
