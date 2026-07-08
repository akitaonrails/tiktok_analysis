package X;

import com.ss.android.ugc.aweme.aigc.asynctask.ImageUploadTaskOutput;

/* JADX INFO: renamed from: X.0LRH, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.GeneralI2VTask", f = "GeneralI2VTask.kt", l = {187, 201, 227, 233, 240}, m = "stepServerI2V")
public final class C0LRH extends AbstractC23140094w {
    public Object LL;
    public ImageUploadTaskOutput LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C0LRF LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LRH(C0LRF c0lrf, InterfaceC1364105Vn<? super C0LRH> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c0lrf;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GeneralI2VTask@5977.stepServerI2V$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLJJJJZI = this.LLILZ.LJJJJZI(null, null, this);
        C1C7U.LIZIZ("GeneralI2VTask@5977.stepServerI2V$1");
        return objLJJJJZI;
    }
}
