package X;

import com.ss.android.ugc.aweme.aigc.asynctask.ImageUploadTaskOutput;

/* JADX INFO: renamed from: X.0LSh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.I2VTask", f = "I2VTask.kt", l = {228, 235, 250, 253, 257}, m = "stepServerI2V")
public final class C543250LSh extends AbstractC23140094w {
    public Object LL;
    public C0LTA LLILLJJLI;
    public ImageUploadTaskOutput LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C543210LSd LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C543250LSh(C543210LSd c543210LSd, InterfaceC1364105Vn<? super C543250LSh> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = c543210LSd;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("I2VTask@a318.stepServerI2V$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLJJJLL = this.LLILZIL.LJJJLL(null, null, null, this);
        C1C7U.LIZIZ("I2VTask@a318.stepServerI2V$1");
        return objLJJJLL;
    }
}
