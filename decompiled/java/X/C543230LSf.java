package X;

import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.ss.android.ugc.aweme.aigc.asynctask.I2VTaskInput;

/* JADX INFO: renamed from: X.0LSf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.I2VTask", f = "I2VTask.kt", l = {178, 191, 192}, m = "stepRefreshFrame")
public final class C543230LSf extends AbstractC23140094w {
    public Object LL;
    public I2VTaskInput LLILLJJLI;
    public NLEEditor LLILLL;
    public INLEMediaSession LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C543210LSd LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C543230LSf(C543210LSd c543210LSd, InterfaceC1364105Vn<? super C543230LSf> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = c543210LSd;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("I2VTask@a318.stepRefreshFrame$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objLJJJLIIL = this.LLILZLL.LJJJLIIL(null, this);
        C1C7U.LIZIZ("I2VTask@a318.stepRefreshFrame$1");
        return objLJJJLIIL;
    }
}
