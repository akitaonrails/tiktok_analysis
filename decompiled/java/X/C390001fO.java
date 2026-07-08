package X;

/* JADX INFO: renamed from: X.01fO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.effect.board.conflict.PCSBoardEffectManager", f = "PCSBoardEffectManager.kt", l = {95, 98}, m = "resourceCheckAndApplyEffect")
public final class C390001fO extends AbstractC23140094w {
    public boolean LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C389701fL LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C390001fO(C389701fL c389701fL, InterfaceC1364105Vn<? super C390001fO> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c389701fL;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PCSBoardEffectManager@20d3.resourceCheckAndApplyEffect$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZLLL = this.LLILLL.LIZLLL(null, null, this);
        C1C7U.LIZIZ("PCSBoardEffectManager@20d3.resourceCheckAndApplyEffect$1");
        return objLIZLLL;
    }
}
