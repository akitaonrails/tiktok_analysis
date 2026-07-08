package X;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.celebration.CelebrationVideoTemplatePreviewScene;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0MQM, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MQM extends C09AY implements Function0<Unit> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ NLEModel LLILLJJLI;
    public final /* synthetic */ CelebrationVideoTemplatePreviewScene LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ Function0<Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0MQM(long j, NLEModel nLEModel, CelebrationVideoTemplatePreviewScene celebrationVideoTemplatePreviewScene, boolean z, Function0<Unit> function0) {
        super(0);
        this.LL = j;
        this.LLILLJJLI = nLEModel;
        this.LLILLL = celebrationVideoTemplatePreviewScene;
        this.LLILZ = z;
        this.LLILZIL = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C554890LpX c554890LpX = C554890LpX.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("start set nle in main thread, cost = ");
        sbLIZ.append(System.currentTimeMillis() - this.LL);
        sbLIZ.append(" ms");
        C201955140j.LIZLLL(c554890LpX, "OnThisDayVideoPreviewScene", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LLILLJJLI == null) {
            Activity activity = this.LLILLL.mActivity;
            if (activity != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(activity);
                c1389890mGx.LJIIIZ(2131829440);
                c1389890mGx.LJIIJJI();
            }
            C1AF0.LIZJ("nle model null");
        }
        CelebrationVideoTemplatePreviewScene celebrationVideoTemplatePreviewScene = this.LLILLL;
        C0MQS c0mqs = celebrationVideoTemplatePreviewScene.LLL;
        if (c0mqs != null) {
            NLEModel nLEModel = this.LLILLJJLI;
            boolean z = this.LLILZ;
            View view = celebrationVideoTemplatePreviewScene.mView;
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            if (nLEModel != null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("setData: templatePreviewScene = ");
                sbLIZ2.append(c0mqs.LJJIL().hashCode());
                C201955140j.LIZLLL(c554890LpX, "CeleAdapter", C2188811AlT.LIZIZ(sbLIZ2));
                c0mqs.LJJIL().LLLLIL(nLEModel, z, viewGroup);
            }
        }
        Function0<Unit> function0 = this.LLILZIL;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.LIZ;
    }
}
