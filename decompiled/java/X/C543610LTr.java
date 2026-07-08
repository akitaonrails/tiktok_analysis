package X;

import com.ss.android.vesdk.VEUtils;

/* JADX INFO: renamed from: X.0LTr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.GeneralI2VPostProcessingTask", f = "GeneralI2VPostProcessingTask.kt", l = {634, 641, 692}, m = "generateSegmentListV2")
public final class C543610LTr extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public VEUtils.VEVideoFileInfo LLILLL;
    public long LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C543560LTm LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C543610LTr(C543560LTm c543560LTm, InterfaceC1364105Vn<? super C543610LTr> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = c543560LTm;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GeneralI2VPostProcessingTask@681e.generateSegmentListV2$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objLJJJJZI = this.LLILZLL.LJJJJZI(0, null, null, null, this);
        C1C7U.LIZIZ("GeneralI2VPostProcessingTask@681e.generateSegmentListV2$1");
        return objLJJJJZI;
    }
}
