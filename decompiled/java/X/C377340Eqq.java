package X;

import com.ss.android.ugc.gamora.editorpro.components.asyncedit.logic.AsyncTasksPanelViewModel;

/* JADX INFO: renamed from: X.0Eqq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.components.asyncedit.logic.AsyncTasksPanelViewModel", f = "AsyncTasksPanelViewModel.kt", l = {275, 277, 282}, m = "closePreviousPanelAndShowAsyncPanel")
public final class C377340Eqq extends AbstractC23140094w {
    public C19EG LL;
    public C362580EJk LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ AsyncTasksPanelViewModel LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C377340Eqq(AsyncTasksPanelViewModel asyncTasksPanelViewModel, InterfaceC1364105Vn<? super C377340Eqq> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = asyncTasksPanelViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AsyncTasksPanelViewModel@6d48.closePreviousPanelAndShowAsyncPanel$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objXQ2 = this.LLILZ.xQ2(null, null, this);
        C1C7U.LIZIZ("AsyncTasksPanelViewModel@6d48.closePreviousPanelAndShowAsyncPanel$1");
        return objXQ2;
    }
}
