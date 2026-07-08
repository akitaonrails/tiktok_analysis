package X;

import com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene;
import kotlin.jvm.internal.AwS391S0200000_25;

/* JADX INFO: renamed from: X.0MAq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C564140MAq {
    public final C523470Kfx LIZ = new C523470Kfx("record_register");
    public final C523470Kfx LIZIZ = new C523470Kfx("record_ui_first_frame");
    public final C523470Kfx LIZJ = new C523470Kfx("record_first_frame");
    public final C523470Kfx LIZLLL = new C523470Kfx("record_not_executed_node");

    public final C523470Kfx LIZ(InterfaceC1408530ml1 interfaceC1408530ml1) {
        int i = C564130MAp.LIZ[interfaceC1408530ml1.LIZJ().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return this.LIZLLL;
                }
                return this.LIZJ;
            }
            return this.LIZJ;
        }
        return this.LIZ;
    }

    public final void LIZIZ(C539960LFq c539960LFq, TikTokCameraBaseGroupScene tikTokCameraBaseGroupScene) {
        this.LIZ.LIZ(this.LIZIZ);
        this.LIZIZ.LIZ(this.LIZJ);
        this.LIZJ.LIZ(this.LIZLLL);
        C525710KjZ.LIZ(c539960LFq, this.LIZ, new AwS391S0200000_25(tikTokCameraBaseGroupScene, this, 66));
    }
}
