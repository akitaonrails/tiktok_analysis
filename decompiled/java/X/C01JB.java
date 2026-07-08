package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.BaseCountDownForAllV2ViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01JB, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.BaseCountDownForAllV2ViewModel$observeStatus$1", f = "BaseCountDownForAllV2ViewModel.kt", l = {35}, m = "invokeSuspend")
public final class C01JB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ BaseCountDownForAllV2ViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01JB(BaseCountDownForAllV2ViewModel baseCountDownForAllV2ViewModel, InterfaceC1364105Vn<? super C01JB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = baseCountDownForAllV2ViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01JB(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BaseCountDownForAllV2ViewModel@bc82.observeStatus$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            AnonymousClass0951 anonymousClass0951 = this.LLILLJJLI.vQ2().LIZLLL;
            C517001zs c517001zs = new C517001zs(this.LLILLJJLI, 0);
            this.LL = 1;
            if (anonymousClass0951.collect(c517001zs, this) == objLJFF) {
                C1C7U.LIZIZ("BaseCountDownForAllV2ViewModel@bc82.observeStatus$1");
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
