package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.gamora.editorpro.components.asyncedit.logic.AsyncTasksPanelViewModel;

/* JADX INFO: renamed from: X.0Eqp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.components.asyncedit.logic.AsyncTasksPanelViewModel", f = "AsyncTasksPanelViewModel.kt", l = {581}, m = "buildProgressMapFromTaskManager")
public final class C377330Eqp extends AbstractC23140094w {
    public Object LL;
    public NLEModel LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ AsyncTasksPanelViewModel LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C377330Eqp(AsyncTasksPanelViewModel asyncTasksPanelViewModel, InterfaceC1364105Vn<? super C377330Eqp> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = asyncTasksPanelViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AsyncTasksPanelViewModel@6d48.buildProgressMapFromTaskManager$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objVQ2 = this.LLILZ.vQ2(null, this);
        C1C7U.LIZIZ("AsyncTasksPanelViewModel@6d48.buildProgressMapFromTaskManager$1");
        return objVQ2;
    }
}
