package X;

import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0DvK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.editcut.TemplateMattingTask", f = "TemplateMattingTask.kt", l = {131, 134, 145}, m = "start")
public final class C354640DvK extends AbstractC23140094w {
    public NLETemplateModel LL;
    public Function1 LLILLJJLI;
    public Object LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C354610DvH LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C354640DvK(C354610DvH c354610DvH, InterfaceC1364105Vn<? super C354640DvK> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = c354610DvH;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TemplateMattingTask@e9a9.start$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLJJIJIIJIL = this.LLILZIL.LJJIJIIJIL(null, null, this);
        C1C7U.LIZIZ("TemplateMattingTask@e9a9.start$1");
        return objLJJIJIIJIL;
    }
}
