package X;

import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLEVideoEffect;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;

/* JADX INFO: renamed from: X.0Ex3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.task.template.tasks.TemplateI2VPreTask", f = "TemplateI2VPreTask.kt", l = {253}, m = "submitI2VTask")
public final class C381190Ex3 extends AbstractC23140094w {
    public CreativeInfo LL;
    public Object LLILLJJLI;
    public INLEMediaSession LLILLL;
    public NLEEditor LLILZ;
    public NLETrackSlot LLILZIL;
    public NLEVideoEffect LLILZLL;
    public /* synthetic */ Object LLIZ;
    public final /* synthetic */ C381160Ex0 LLIZLLLIL;
    public int LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C381190Ex3(C381160Ex0 c381160Ex0, InterfaceC1364105Vn<? super C381190Ex3> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZLLLIL = c381160Ex0;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TemplateI2VPreTask@d636.submitI2VTask$1");
        this.LLIZ = obj;
        this.LLJ |= Integer.MIN_VALUE;
        Object objLJJIJIIJI = this.LLIZLLLIL.LJJIJIIJI(null, null, null, null, null, null, this);
        C1C7U.LIZIZ("TemplateI2VPreTask@d636.submitI2VTask$1");
        return objLJJIJIIJI;
    }
}
