package X;

import androidx.lifecycle.MutableLiveData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.vesdk.VEEditor;
import dmt.av.video.VEPreviewParams;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0MSg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C568720MSg {
    public final VideoPublishEditModel LIZ;
    public int LIZIZ;
    public int LIZJ;
    public final C1441830ncj LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public boolean LJI;
    public boolean LJII;
    public final MutableLiveData<VEPreviewParams> LJIIIIZZ = new MutableLiveData<>();

    public final void LIZ() {
        C554890LpX c554890LpX = C554890LpX.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CelePlayer, pause, isPlaying = ");
        sbLIZ.append(this.LJ);
        C201955140j.LIZJ(c554890LpX, C2188811AlT.LIZIZ(sbLIZ));
        if (this.LJ) {
            C201955140j.LIZJ(c554890LpX, "CelePlayer, pause");
            this.LIZLLL.LIZLLL();
            this.LJ = false;
        }
    }

    public final void LIZIZ() {
        Object c098200Yq;
        C201955140j.LIZJ(C554890LpX.LIZIZ, "CelePlayer, pause and block");
        this.LJFF = false;
        LIZ();
        try {
            InterfaceC1452170ntP interfaceC1452170ntP = this.LIZLLL.LJIIIZ;
            if (interfaceC1452170ntP != null) {
                interfaceC1452170ntP.nf(0, VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek);
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C201955140j.LJIIJ(C554890LpX.LIZIZ, "CelePlayer, seekTime error", thM5exceptionOrNullimpl);
        }
    }

    public final void LIZJ() {
        Object c098200Yq;
        C554890LpX c554890LpX = C554890LpX.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CelePlayer, play, hasSetupData = ");
        sbLIZ.append(this.LJFF);
        C201955140j.LIZJ(c554890LpX, C2188811AlT.LIZIZ(sbLIZ));
        if (this.LJII) {
            C201955140j.LIZLLL(c554890LpX, "CelePlayer", "return because of lifecycle");
            return;
        }
        if (this.LJ || !this.LJFF) {
            return;
        }
        C201955140j.LIZJ(c554890LpX, "CelePlayer, play, resume preview");
        try {
            this.LIZLLL.LJ();
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C554890LpX c554890LpX2 = C554890LpX.LIZIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("play error, ");
            sbLIZ2.append(thM5exceptionOrNullimpl);
            C201955140j.LJIIIIZZ(c554890LpX2, "CelePlayer", C2188811AlT.LIZIZ(sbLIZ2));
        }
        this.LJ = true;
    }

    public C568720MSg(int i, int i2, VideoPublishEditModel videoPublishEditModel) {
        this.LIZ = videoPublishEditModel;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = new C1441830ncj(videoPublishEditModel.getVideoEditorType(), EnumC1441790ncf.UGC_TEMPLATE.getValue(), EnumC1441860ncm.UPLOAD_OTHER.getValue(), "CelebrationTemplateVideoPreview", ((Boolean) C272770AmZ.LIZ.getValue()).booleanValue());
    }
}
