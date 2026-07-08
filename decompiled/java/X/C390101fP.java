package X;

/* JADX INFO: renamed from: X.01fP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.effect.board.conflict.PCSBoardEffectManager", f = "PCSBoardEffectManager.kt", l = {325}, m = "doOnRealApply")
public final class C390101fP extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C389701fL LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C390101fP(C389701fL c389701fL, InterfaceC1364105Vn<? super C390101fP> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c389701fL;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PCSBoardEffectManager@20d3.doOnRealApply$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLJJLI.LIZIZ(this);
        C1C7U.LIZIZ("PCSBoardEffectManager@20d3.doOnRealApply$1");
        return objLIZIZ;
    }
}
