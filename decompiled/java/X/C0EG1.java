package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Pair;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS90S1200000_5;

/* JADX INFO: renamed from: X.0EG1, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EG1 {
    public final C1DRG LIZ;
    public final C372480Ej0 LIZIZ;
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 893));

    public C0EG1(C1DRG c1drg, C372480Ej0 c372480Ej0) {
        this.LIZ = c1drg;
        this.LIZIZ = c372480Ej0;
    }

    public final void LIZ(int i, VideoPublishEditModel videoPublishEditModel, C0E48 c0e48, String str) {
        C1397580mTM c1397580mTM = new C1397580mTM(this.LIZIZ.requireSceneContext());
        c1397580mTM.LJFF(2131829626);
        c1397580mTM.LIZ(i);
        C985403tE.LIZ(c1397580mTM, new AwS90S1200000_5(videoPublishEditModel, c0e48, str, 3));
        new C1397510mTF(c1397580mTM).LIZLLL();
        if (videoPublishEditModel != null) {
            C0LAB c0labLJFF = C361680EFy.LJFF(-1L, videoPublishEditModel, c0e48, new Pair(-1, -1));
            c0labLJFF.LJ("error_type", str);
            C20684815ws.LJIILLIIL("create_template_error_popup_show", c0labLJFF.LIZ);
        }
    }
}
