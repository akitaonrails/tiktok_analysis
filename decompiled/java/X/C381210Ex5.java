package X;

import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import kotlin.Pair;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0Ex5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.task.template.tasks.TemplateFL2VPreTask", f = "TemplateFL2VPreTask.kt", l = {314}, m = "submitTransitionFrameTask")
public final class C381210Ex5 extends AbstractC23140094w {
    public CreativeInfo LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public Pair LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ C381150Ewz LLIZ;
    public int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C381210Ex5(C381150Ewz c381150Ewz, InterfaceC1364105Vn<? super C381210Ex5> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZ = c381150Ewz;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        C1C7U.LIZ("TemplateFL2VPreTask@ddb5.submitTransitionFrameTask$1");
        this.LLILZLL = obj;
        this.LLIZLLLIL |= Integer.MIN_VALUE;
        Object objLJJIJIIJIL = this.LLIZ.LJJIJIIJIL(null, null, null, null, null, this);
        C1C7U.LIZIZ("TemplateFL2VPreTask@ddb5.submitTransitionFrameTask$1");
        return objLJJIJIIJIL;
    }
}
