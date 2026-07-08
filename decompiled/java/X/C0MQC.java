package X;

import com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.celebration.CelebrationVideoTemplatePreviewScene;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0MQC, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MQC extends C09AY implements Function0<Unit> {
    public final /* synthetic */ CelebrationVideoTemplatePreviewScene LL;
    public final /* synthetic */ long LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0MQC(long j, CelebrationVideoTemplatePreviewScene celebrationVideoTemplatePreviewScene) {
        super(0);
        this.LL = celebrationVideoTemplatePreviewScene;
        this.LLILLJJLI = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.LLLLLJLJLL(true);
        C554890LpX c554890LpX = C554890LpX.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OnThisDayVideoPreviewScene hashCode = ");
        sbLIZ.append(this.LL.hashCode());
        sbLIZ.append(", [end] setVideoData, cost = ");
        sbLIZ.append(System.currentTimeMillis() - this.LLILLJJLI);
        sbLIZ.append(" ms");
        C201955140j.LJIILJJIL(c554890LpX, C2188811AlT.LIZIZ(sbLIZ));
        CelebrationVideoTemplatePreviewScene celebrationVideoTemplatePreviewScene = this.LL;
        C0MHP c0mhp = celebrationVideoTemplatePreviewScene.LLLFFI;
        if (c0mhp != null) {
            c0mhp.CR0(celebrationVideoTemplatePreviewScene.LLJJJIL.getNleModel() != null, true, System.currentTimeMillis() - this.LLILLJJLI, "total");
        }
        if (C0L2Z.LIZ()) {
            C365090ETb.LIZIZ();
        }
        return Unit.LIZ;
    }
}
