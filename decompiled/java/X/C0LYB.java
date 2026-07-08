package X;

import com.ss.android.ugc.gamora.recorder.sticker.aigc.AIGCOfflineProcessingViewModel;

/* JADX INFO: renamed from: X.0LYB, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.aigc.AIGCOfflineProcessingViewModel", f = "AIGCOfflineProcessingViewModel.kt", l = {708, 713}, m = "isQuotaValid")
public final class C0LYB extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ AIGCOfflineProcessingViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LYB(AIGCOfflineProcessingViewModel aIGCOfflineProcessingViewModel, InterfaceC1364105Vn<? super C0LYB> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = aIGCOfflineProcessingViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("AIGCOfflineProcessingViewModel@fe8e.isQuotaValid$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objBQ2 = this.LLILLJJLI.BQ2(null, this);
        C1C7U.LIZIZ("AIGCOfflineProcessingViewModel@fe8e.isQuotaValid$1");
        return objBQ2;
    }
}
