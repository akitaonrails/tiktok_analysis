package X;

import com.ss.android.ugc.aweme.aigc.asynctask.I2VServerTaskInput;

/* JADX INFO: renamed from: X.0LVU, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.EditI2VServerTask", f = "EditI2VServerTask.kt", l = {187, 197, 201, 204, 205, 207, 210}, m = "stepLoopProgress")
public final class C0LVU extends AbstractC23140094w {
    public I2VServerTaskInput LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C0LVQ LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LVU(C0LVQ c0lvq, InterfaceC1364105Vn<? super C0LVU> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c0lvq;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EditI2VServerTask@cf5c.stepLoopProgress$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLJJJJZI = this.LLILZ.LJJJJZI(null, this);
        C1C7U.LIZIZ("EditI2VServerTask@cf5c.stepLoopProgress$1");
        return objLJJJJZI;
    }
}
