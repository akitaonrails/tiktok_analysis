package X;

/* JADX INFO: renamed from: X.01fR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.effect.board.conflict.PCSBoardEffectManager$checkBoardConflicts$$inlined$map$1$2", f = "PCSBoardEffectManager.kt", l = {223}, m = "emit")
public final class C390301fR extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ C517001zs LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C390301fR(C517001zs c517001zs, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c517001zs;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PCSBoardEffectManager@20d3.checkBoardConflicts$$inlined$map$1$2$1");
        this.LL = obj;
        this.LLILLJJLI |= Integer.MIN_VALUE;
        Object objEmit = this.LLILLL.emit(null, this);
        C1C7U.LIZIZ("PCSBoardEffectManager@20d3.checkBoardConflicts$$inlined$map$1$2$1");
        return objEmit;
    }
}
