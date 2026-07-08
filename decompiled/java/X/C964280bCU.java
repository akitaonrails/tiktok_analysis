package X;

import com.bytedance.android.live.liveinteract.multihost.biz.link.features.followprompt.MultiCoHostFollowPromptViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS250S0000000_15;
import njp.a;

/* JADX INFO: renamed from: X.0bCU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.multihost.biz.link.features.followprompt.MultiCoHostFollowPromptViewModel$initAutoExitTime$1$1", f = "MultiCoHostFollowPromptViewModel.kt", l = {65}, m = "invokeSuspend")
public final class C964280bCU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MultiCoHostFollowPromptViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C964280bCU(MultiCoHostFollowPromptViewModel multiCoHostFollowPromptViewModel, InterfaceC1364105Vn<? super C964280bCU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = multiCoHostFollowPromptViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C964280bCU(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MultiCoHostFollowPromptViewModel@4d59.initAutoExitTime$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            long j = this.LLILLJJLI.vQ2().LLILLJJLI.LIZIZ;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("MultiCoHostFollowPromptViewModel@4d59.initAutoExitTime$1$1");
                return objLJFF;
            }
        }
        this.LLILLJJLI.setStateImmediate(AFwS250S0000000_15.get$arr$(149));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MultiCoHostFollowPromptViewModel@4d59.initAutoExitTime$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
