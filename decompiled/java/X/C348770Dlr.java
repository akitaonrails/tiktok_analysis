package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.AFwS288S0000000_5;

/* JADX INFO: renamed from: X.0Dlr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C348770Dlr extends AbstractC350210DoB implements InterfaceC350250DoF {
    public final C348760Dlq LLILLJJLI = C350200DoA.LIZ(this, AFwS288S0000000_5.get$arr$(9));
    public final C348760Dlq LLILLL = C350200DoA.LIZ(this, AFwS288S0000000_5.get$arr$(8));
    public final C348760Dlq LLILZ = C350200DoA.LIZ(this, AFwS288S0000000_5.get$arr$(7));

    @Override // X.InterfaceC350250DoF
    public final void LJFF(C348820Dlw c348820Dlw) {
        VideoPublishEditModel videoPublishEditModel;
        NLEModel nLEModelLIZ = c348820Dlw.LIZ();
        if (nLEModelLIZ == null || (videoPublishEditModel = c348820Dlw.LIZIZ) == null) {
            return;
        }
        new C348830Dlx();
        C348830Dlx.LIZ(nLEModelLIZ, videoPublishEditModel, this.LLILLJJLI, this.LLILLL);
        C347140DjE.LIZ(nLEModelLIZ, videoPublishEditModel, this.LLILZ);
    }
}
