package X;

import com.ss.android.ugc.aweme.internalshare.impl.chatroomeasteregg.vm.IMEffectNoticeViewModel;

/* JADX INFO: renamed from: X.0HAg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.internalshare.impl.chatroomeasteregg.vm.IMEffectNoticeViewModel", f = "IMEffectNoticeViewModel.kt", l = {328}, m = "tryTriggerExplosion")
public final class C436640HAg extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ IMEffectNoticeViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C436640HAg(IMEffectNoticeViewModel iMEffectNoticeViewModel, InterfaceC1364105Vn<? super C436640HAg> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = iMEffectNoticeViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMEffectNoticeViewModel@2d.tryTriggerExplosion$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objAQ2 = this.LLILLJJLI.AQ2(null, null, null, this);
        C1C7U.LIZIZ("IMEffectNoticeViewModel@2d.tryTriggerExplosion$1");
        return objAQ2;
    }
}
