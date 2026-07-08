package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.celebration.CelebrationVideoTemplatePreviewScene;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0MQN, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MQN extends C09AY implements Function1<NLEModel, Unit> {
    public final /* synthetic */ CelebrationVideoTemplatePreviewScene LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0MQN(CelebrationVideoTemplatePreviewScene celebrationVideoTemplatePreviewScene, long j, boolean z, Function0<Unit> function0) {
        super(1);
        this.LL = celebrationVideoTemplatePreviewScene;
        this.LLILLJJLI = j;
        this.LLILLL = z;
        this.LLILZ = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(NLEModel nLEModel) {
        boolean z;
        NLEModel nLEModel2 = nLEModel;
        this.LL.LLJJJIL.setNleModel(nLEModel2);
        C554890LpX c554890LpX = C554890LpX.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("nleModel = ");
        if (nLEModel2 == null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        C201955140j.LIZLLL(c554890LpX, "OnThisDayVideoPreviewScene", C2188811AlT.LIZIZ(sbLIZ));
        C1524705y1.LIZJ(new C0MQM(this.LLILLJJLI, nLEModel2, this.LL, this.LLILLL, this.LLILZ));
        return Unit.LIZ;
    }
}
