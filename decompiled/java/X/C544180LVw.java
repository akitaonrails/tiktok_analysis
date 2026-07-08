package X;

import com.ss.android.ugc.aweme.aigc.asynctask.I2VServerTaskInput;

/* JADX INFO: renamed from: X.0LVw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.EditorProT2VTask", f = "EditorProT2VTask.kt", l = {219, 230, 233, 236}, m = "stepLoopProgress")
public final class C544180LVw extends AbstractC23140094w {
    public I2VServerTaskInput LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C543970LVb LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C544180LVw(C543970LVb c543970LVb, InterfaceC1364105Vn<? super C544180LVw> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c543970LVb;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EditorProT2VTask@7008.stepLoopProgress$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLJJJLIIL = this.LLILZ.LJJJLIIL(null, this);
        C1C7U.LIZIZ("EditorProT2VTask@7008.stepLoopProgress$1");
        return objLJJJLIIL;
    }
}
