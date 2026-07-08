package X;

import com.ss.android.ugc.gamora.recorder.sticker.aigc.AIGCOfflineProcessingViewModel;

/* JADX INFO: renamed from: X.0LY9, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.aigc.AIGCOfflineProcessingViewModel", f = "AIGCOfflineProcessingViewModel.kt", l = {298, 331, 342, 347, 358, 360, 372, 383, 386, 393, 395, 397, 401, 404}, m = "processViewEvents")
public final class C0LY9 extends AbstractC23140094w {
    public C0LYM LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ AIGCOfflineProcessingViewModel LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LY9(AIGCOfflineProcessingViewModel aIGCOfflineProcessingViewModel, InterfaceC1364105Vn<? super C0LY9> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = aIGCOfflineProcessingViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("AIGCOfflineProcessingViewModel@fe8e.processViewEvents$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objCQ2 = this.LLILLL.CQ2(null, this);
        C1C7U.LIZIZ("AIGCOfflineProcessingViewModel@fe8e.processViewEvents$1");
        return objCQ2;
    }
}
