package X;

import com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput;

/* JADX INFO: renamed from: X.0LSi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.I2VTask", f = "I2VTask.kt", l = {203, 213, 214, 217}, m = "stepImageUpload")
public final class C543260LSi extends AbstractC23140094w {
    public AbsTaskOutput LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C543210LSd LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C543260LSi(C543210LSd c543210LSd, InterfaceC1364105Vn<? super C543260LSi> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c543210LSd;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("I2VTask@a318.stepImageUpload$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJJJJZI = this.LLILLL.LJJJJZI(null, null, this);
        C1C7U.LIZIZ("I2VTask@a318.stepImageUpload$1");
        return objLJJJJZI;
    }
}
