package X;

import Y.AgS196S0200000_5;

/* JADX INFO: renamed from: X.0E0O, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.components.asyncedit.logic.AsyncTasksPanelViewModel$getAllTasks$$inlined$map$1$2", f = "AsyncTasksPanelViewModel.kt", l = {223}, m = "emit")
public final class C0E0O extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ AgS196S0200000_5 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0E0O(AgS196S0200000_5 agS196S0200000_5, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = agS196S0200000_5;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AsyncTasksPanelViewModel@6d48.getAllTasks$$inlined$map$1$2$1");
        this.LL = obj;
        this.LLILLJJLI |= Integer.MIN_VALUE;
        Object objEmit = this.LLILLL.emit(null, this);
        C1C7U.LIZIZ("AsyncTasksPanelViewModel@6d48.getAllTasks$$inlined$map$1$2$1");
        return objEmit;
    }
}
