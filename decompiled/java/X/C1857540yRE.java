package X;

import com.ss.android.ugc.aweme.tako.botpage.components.action.multiple.TakoMultipleSelectVM;

/* JADX INFO: renamed from: X.0yRE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.components.action.multiple.TakoMultipleSelectVM", f = "TakoMultipleSelectVM.kt", l = {103}, m = "awaitAllCapturesReady")
public final class C1857540yRE extends AbstractC23140094w {
    public long LL;
    public long LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ TakoMultipleSelectVM LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1857540yRE(TakoMultipleSelectVM takoMultipleSelectVM, InterfaceC1364105Vn<? super C1857540yRE> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = takoMultipleSelectVM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoMultipleSelectVM@4cd6.awaitAllCapturesReady$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objWQ2 = this.LLILZ.wQ2(0L, this);
        C1C7U.LIZIZ("TakoMultipleSelectVM@4cd6.awaitAllCapturesReady$1");
        return objWQ2;
    }
}
