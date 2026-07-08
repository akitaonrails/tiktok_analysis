package X;

/* JADX INFO: renamed from: X.01lB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.aigc.usecase.AIGCProgressCalculationUseCase", f = "AIGCProgressCalculationUseCase.kt", l = {126}, m = "runProgressStage")
public final class C425901lB extends AbstractC23140094w {
    public int LL;
    public int LLILLJJLI;
    public long LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C426001lC LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C425901lB(C426001lC c426001lC, InterfaceC1364105Vn<? super C425901lB> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = c426001lC;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIGCProgressCalculationUseCase@cc45.runProgressStage$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILZIL.LIZ(0, 0, 0L, this);
        C1C7U.LIZIZ("AIGCProgressCalculationUseCase@cc45.runProgressStage$1");
        return objLIZ;
    }
}
