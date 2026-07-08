package X;

import com.ss.android.ugc.aweme.aigc.asynctask.workflowapi.AIGCArchWorkflowManager;
import com.ss.android.ugc.aweme.aigc.asynctask.workflowbuilder.AIGCArchWorkflowInput;
import com.ss.android.ugc.aweme.creative.model.edit.TextImageTaskInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LUQ, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.texttoimage.choose.Text2ImageListScene$retryRequest$1", f = "Text2ImageListScene.kt", l = {}, m = "invokeSuspend")
public final class C0LUQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C558180Luq LL;
    public final /* synthetic */ AIGCArchWorkflowInput LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LUQ(C558180Luq c558180Luq, AIGCArchWorkflowInput aIGCArchWorkflowInput, String str, String str2, InterfaceC1364105Vn<? super C0LUQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c558180Luq;
        this.LLILLJJLI = aIGCArchWorkflowInput;
        this.LLILLL = str;
        this.LLILZ = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0LUQ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C542800LQo<String> c542800LQoC1;
        String str;
        C1C7U.LIZ("Text2ImageListScene@1b50.retryRequest$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        AIGCArchWorkflowManager aIGCArchWorkflowManager = (AIGCArchWorkflowManager) this.LL.LLJILJILJ.getValue();
        if (aIGCArchWorkflowManager != null && (c542800LQoC1 = aIGCArchWorkflowManager.C1(this.LLILLJJLI)) != null && (str = (String) c542800LQoC1.LIZ) != null) {
            C558180Luq c558180Luq = this.LL;
            String str2 = this.LLILLL;
            String str3 = this.LLILZ;
            TextImageTaskInfo textImageTaskInfoLIZJ = C572250McR.LIZJ(c558180Luq.LLLIL().creativeModel.text2ImageModel);
            if (textImageTaskInfoLIZJ != null) {
                textImageTaskInfoLIZJ.setAsyncTaskId(str);
            }
            C558180Luq.LLLLIL(c558180Luq, str2, str3, EnumC554770LpL.PENDING, C2286608xc.LJ(0), null, null, str, 48);
            c558180Luq.LLLIZZ(C2286608xc.LJ(0), str, str3);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("Text2ImageListScene@1b50.retryRequest$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
