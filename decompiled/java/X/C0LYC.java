package X;

import com.ss.android.ugc.gamora.recorder.sticker.aigc.AIGCOfflineProcessingViewModel;

/* JADX INFO: renamed from: X.0LYC, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.aigc.AIGCOfflineProcessingViewModel", f = "AIGCOfflineProcessingViewModel.kt", l = {893, 894}, m = "resetComponent")
public final class C0LYC extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ AIGCOfflineProcessingViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LYC(AIGCOfflineProcessingViewModel aIGCOfflineProcessingViewModel, InterfaceC1364105Vn<? super C0LYC> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = aIGCOfflineProcessingViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIGCOfflineProcessingViewModel@fe8e.resetComponent$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objDQ2 = this.LLILLJJLI.DQ2(false, false, this);
        C1C7U.LIZIZ("AIGCOfflineProcessingViewModel@fe8e.resetComponent$1");
        return objDQ2;
    }
}
