package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;

/* JADX INFO: renamed from: X.0LTn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.GeneralI2VPostProcessingTask", f = "GeneralI2VPostProcessingTask.kt", l = {207, 208, 217, 220, 221, 228, 237, 238, 254, 261, 265, 269, 272, 275, 276}, m = "runV2")
public final class C543570LTn extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public NLEEditor LLILLL;
    public NLETemplateModel LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C543560LTm LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C543570LTn(C543560LTm c543560LTm, InterfaceC1364105Vn<? super C543570LTn> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = c543560LTm;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GeneralI2VPostProcessingTask@681e.runV2$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objLJJLIIIIJ = this.LLILZLL.LJJLIIIIJ(null, this);
        C1C7U.LIZIZ("GeneralI2VPostProcessingTask@681e.runV2$1");
        return objLJJLIIIIJ;
    }
}
