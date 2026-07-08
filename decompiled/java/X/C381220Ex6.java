package X;

import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0Ex6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.task.template.tasks.TemplateI2IPreTask", f = "TemplateI2IPreTask.kt", l = {246}, m = "submitI2ITask")
public final class C381220Ex6 extends AbstractC23140094w {
    public CreativeInfo LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public NLETrackSlot LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ C381170Ex1 LLIZ;
    public int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C381220Ex6(C381170Ex1 c381170Ex1, InterfaceC1364105Vn<? super C381220Ex6> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZ = c381170Ex1;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        C1C7U.LIZ("TemplateI2IPreTask@63f9.submitI2ITask$1");
        this.LLILZLL = obj;
        this.LLIZLLLIL |= Integer.MIN_VALUE;
        Object objLJJIJIIJI = this.LLIZ.LJJIJIIJI(null, null, null, null, null, this);
        C1C7U.LIZIZ("TemplateI2IPreTask@63f9.submitI2ITask$1");
        return objLJJIJIIJI;
    }
}
