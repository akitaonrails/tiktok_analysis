package X;

import com.ss.android.ugc.aweme.aigc.asynctask.ImagesUploadTaskOutput;

/* JADX INFO: renamed from: X.0LSk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.TemplateFL2VTask", f = "TemplateFL2VTask.kt", l = {164, 170, 189, 193, 194, 198}, m = "stepServerI2V")
public final class C543280LSk extends AbstractC23140094w {
    public Object LL;
    public ImagesUploadTaskOutput LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C543190LSb LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C543280LSk(C543190LSb c543190LSb, InterfaceC1364105Vn<? super C543280LSk> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c543190LSb;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TemplateFL2VTask@409a.stepServerI2V$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLJJJLIIL = this.LLILZ.LJJJLIIL(null, null, this);
        C1C7U.LIZIZ("TemplateFL2VTask@409a.stepServerI2V$1");
        return objLJJJLIIL;
    }
}
