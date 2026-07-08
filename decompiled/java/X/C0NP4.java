package X;

import com.ss.android.ugc.aweme.internalshare.impl.chatroomeasteregg.vm.IMEffectNoticeViewModel;

/* JADX INFO: renamed from: X.0NP4, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.internalshare.impl.chatroomeasteregg.vm.IMEffectNoticeViewModel", f = "IMEffectNoticeViewModel.kt", l = {277, 292}, m = "checkAndTriggerExplosion")
public final class C0NP4 extends AbstractC23140094w {
    public C0NPA LL;
    public Object LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ IMEffectNoticeViewModel LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NP4(IMEffectNoticeViewModel iMEffectNoticeViewModel, InterfaceC1364105Vn<? super C0NP4> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = iMEffectNoticeViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMEffectNoticeViewModel@2d.checkAndTriggerExplosion$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objVQ2 = this.LLILZ.vQ2(null, null, 0L, 0L, null, this);
        C1C7U.LIZIZ("IMEffectNoticeViewModel@2d.checkAndTriggerExplosion$1");
        return objVQ2;
    }
}
