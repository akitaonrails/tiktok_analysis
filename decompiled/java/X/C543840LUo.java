package X;

import com.ss.android.ugc.aweme.aigc.asynctask.I2VServerTaskInput;

/* JADX INFO: renamed from: X.0LUo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.GeneralI2VServerTask", f = "GeneralI2VServerTask.kt", l = {256, 266, 269, 270, 271, 274}, m = "stepLoopProgress")
public final class C543840LUo extends AbstractC23140094w {
    public I2VServerTaskInput LL;
    public long LLILLJJLI;
    public long LLILLL;
    public int LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C543820LUm LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C543840LUo(C543820LUm c543820LUm, InterfaceC1364105Vn<? super C543840LUo> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = c543820LUm;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GeneralI2VServerTask@4e5.stepLoopProgress$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objLJJJLZIJ = this.LLILZLL.LJJJLZIJ(null, this);
        C1C7U.LIZIZ("GeneralI2VServerTask@4e5.stepLoopProgress$1");
        return objLJJJLZIJ;
    }
}
