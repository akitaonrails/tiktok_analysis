package X;

import com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager;

/* JADX INFO: renamed from: X.0LDB, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.exit.EditExitController", f = "EditExitController.kt", l = {696}, m = "updateAsyncTaskCreationId")
public final class C0LDB extends AbstractC23140094w {
    public Object LL;
    public ICreationAsyncTaskManager LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C0M7N LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LDB(C0M7N c0m7n, InterfaceC1364105Vn<? super C0LDB> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c0m7n;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EditExitController@7e76.updateAsyncTaskCreationId$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLJIILL = this.LLILZ.LJIILL(null, null, this);
        C1C7U.LIZIZ("EditExitController@7e76.updateAsyncTaskCreationId$1");
        return objLJIILL;
    }
}
