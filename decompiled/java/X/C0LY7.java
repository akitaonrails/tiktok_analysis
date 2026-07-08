package X;

import Y.AgS100S1100000_8;

/* JADX INFO: renamed from: X.0LY7, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.aigc.AIGCOfflineProcessingViewModel$observeGenerationState$1$1", f = "AIGCOfflineProcessingViewModel.kt", l = {620, 621}, m = "emit")
public final class C0LY7 extends AbstractC23140094w {
    public C0LY5 LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ AgS100S1100000_8<T> LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0LY7(AgS100S1100000_8<? super T> agS100S1100000_8, InterfaceC1364105Vn<? super C0LY7> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = agS100S1100000_8;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIGCOfflineProcessingViewModel@fe8e.observeGenerationState$1$1$emit$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZ$1 = this.LLILLL.LIZ$1(null, this);
        C1C7U.LIZIZ("AIGCOfflineProcessingViewModel@fe8e.observeGenerationState$1$1$emit$1");
        return objLIZ$1;
    }
}
