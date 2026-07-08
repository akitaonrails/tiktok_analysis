package X;

import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;

/* JADX INFO: renamed from: X.0LKN, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.AutoPickFrameUploadTask", f = "AutoPickFrameUploadTask.kt", l = {DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL}, m = "createFramePackage")
public final class C0LKN extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C0LKL LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LKN(C0LKL c0lkl, InterfaceC1364105Vn<? super C0LKN> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = c0lkl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("AutoPickFrameUploadTask@d4a9.createFramePackage$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objLJJJJL = this.LLILZLL.LJJJJL(null, this);
        C1C7U.LIZIZ("AutoPickFrameUploadTask@d4a9.createFramePackage$1");
        return objLJJJJL;
    }
}
