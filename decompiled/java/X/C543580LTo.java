package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;

/* JADX INFO: renamed from: X.0LTo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.GeneralI2VPostProcessingTask", f = "GeneralI2VPostProcessingTask.kt", l = {163, 164, 173, 176, 193, 197, 200, 201}, m = "runV1")
public final class C543580LTo extends AbstractC23140094w {
    public Object LL;
    public NLEEditor LLILLJJLI;
    public NLETemplateModel LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C543560LTm LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C543580LTo(C543560LTm c543560LTm, InterfaceC1364105Vn<? super C543580LTo> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = c543560LTm;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GeneralI2VPostProcessingTask@681e.runV1$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLJJLI = this.LLILZIL.LJJLI(null, this);
        C1C7U.LIZIZ("GeneralI2VPostProcessingTask@681e.runV1$1");
        return objLJJLI;
    }
}
