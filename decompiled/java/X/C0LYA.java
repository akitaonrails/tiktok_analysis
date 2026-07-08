package X;

import com.ss.android.ugc.gamora.recorder.sticker.aigc.AIGCOfflineProcessingViewModel;

/* JADX INFO: renamed from: X.0LYA, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.aigc.AIGCOfflineProcessingViewModel", f = "AIGCOfflineProcessingViewModel.kt", l = {972, 973}, m = "checkQuotaLimit")
public final class C0LYA extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ AIGCOfflineProcessingViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LYA(AIGCOfflineProcessingViewModel aIGCOfflineProcessingViewModel, InterfaceC1364105Vn<? super C0LYA> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = aIGCOfflineProcessingViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIGCOfflineProcessingViewModel@fe8e.checkQuotaLimit$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objXQ2 = this.LLILLJJLI.xQ2(null, this);
        C1C7U.LIZIZ("AIGCOfflineProcessingViewModel@fe8e.checkQuotaLimit$1");
        return objXQ2;
    }
}
