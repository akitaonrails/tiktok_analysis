package X;

import com.bytedance.tux.input.TuxTextView;

/* JADX INFO: renamed from: X.0Evj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.components.asyncedit.AsyncTasksScene", f = "AsyncTasksScene.kt", l = {392, 394, 398, 402, 403}, m = "showProcessingTextAnimation")
public final class C380370Evj extends AbstractC23140094w {
    public TuxTextView LL;
    public boolean LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C380350Evh LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C380370Evj(C380350Evh c380350Evh, InterfaceC1364105Vn<? super C380370Evj> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c380350Evh;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AsyncTasksScene@382.showProcessingTextAnimation$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLLLLLLJ = this.LLILZ.LLLLLLJ(null, false, this);
        C1C7U.LIZIZ("AsyncTasksScene@382.showProcessingTextAnimation$1");
        return objLLLLLLJ;
    }
}
