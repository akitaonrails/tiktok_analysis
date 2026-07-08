package X;

import com.ss.android.ugc.aweme.aigc.asynctask.I2VServerTaskInput;

/* JADX INFO: renamed from: X.0LVu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.EditorProR2VTask", f = "EditorProR2VTask.kt", l = {193, 202, 204, 205}, m = "stepLoopProgress")
public final class C544160LVu extends AbstractC23140094w {
    public I2VServerTaskInput LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C543980LVc LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C544160LVu(C543980LVc c543980LVc, InterfaceC1364105Vn<? super C544160LVu> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c543980LVc;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EditorProR2VTask@7046.stepLoopProgress$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLJJJLIIL = this.LLILZ.LJJJLIIL(null, this);
        C1C7U.LIZIZ("EditorProR2VTask@7046.stepLoopProgress$1");
        return objLJJJLIIL;
    }
}
