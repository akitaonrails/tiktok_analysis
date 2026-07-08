package X;

import com.bytedance.tux.input.TuxTextView;

/* JADX INFO: renamed from: X.0Evi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.components.asyncedit.AsyncTasksScene", f = "AsyncTasksScene.kt", l = {348, 350, 351}, m = "showFailedTaskAnimation")
public final class C380360Evi extends AbstractC23140094w {
    public boolean LL;
    public TuxTextView LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C380350Evh LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C380360Evi(C380350Evh c380350Evh, InterfaceC1364105Vn<? super C380360Evi> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c380350Evh;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AsyncTasksScene@382.showFailedTaskAnimation$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLLLLLL = this.LLILZ.LLLLLL(false, this);
        C1C7U.LIZIZ("AsyncTasksScene@382.showFailedTaskAnimation$1");
        return objLLLLLL;
    }
}
