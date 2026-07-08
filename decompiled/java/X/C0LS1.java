package X;

import com.ss.android.ugc.aweme.aigc.asynctask.ImageUploadTaskOutput;

/* JADX INFO: renamed from: X.0LS1, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.AILiveI2VTask", f = "AILiveI2VTask.kt", l = {318, 330, 357, 360, 363}, m = "stepServerI2V")
public final class C0LS1 extends AbstractC23140094w {
    public Object LL;
    public ImageUploadTaskOutput LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C543160LRy LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LS1(C543160LRy c543160LRy, InterfaceC1364105Vn<? super C0LS1> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c543160LRy;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AILiveI2VTask@dffe.stepServerI2V$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLJJJLZIJ = this.LLILZ.LJJJLZIJ(null, null, this);
        C1C7U.LIZIZ("AILiveI2VTask@dffe.stepServerI2V$1");
        return objLJJJLZIJ;
    }
}
