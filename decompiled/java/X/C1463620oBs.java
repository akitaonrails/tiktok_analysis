package X;

import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.vesdk.VEEditor;
import dmt.av.video.VEEditorAutoStartStopArbiter;

/* JADX INFO: renamed from: X.0oBs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1463620oBs implements C10FX {
    public final VideoPublishEditModel LIZ;
    public final C1463630oBt LIZIZ = new InterfaceC1462000o9G() { // from class: X.0oBt
        @Override // X.InterfaceC1462000o9G
        public final boolean LJL(boolean z) {
            return false;
        }

        @Override // X.InterfaceC1462000o9G
        public final boolean LLIIIJ() {
            return false;
        }

        @Override // X.InterfaceC1462000o9G
        public final boolean b0() {
            return true;
        }

        @Override // X.InterfaceC1462000o9G
        public final boolean x0() {
            return false;
        }
    };
    public C1441830ncj LIZJ;
    public boolean LIZLLL;

    @Override // X.C10FX
    public final void onDestroy() {
        InterfaceC1452170ntP interfaceC1452170ntP;
        this.LIZLLL = false;
        C1441830ncj c1441830ncj = this.LIZJ;
        if (c1441830ncj != null && (interfaceC1452170ntP = c1441830ncj.LJIIIZ) != null) {
            interfaceC1452170ntP.stop();
        }
        C1441830ncj c1441830ncj2 = this.LIZJ;
        if (c1441830ncj2 != null) {
            c1441830ncj2.LIZJ();
        }
    }

    @Override // X.C10FX
    public final void LIZIZ() {
        C1441830ncj c1441830ncj = this.LIZJ;
        if (c1441830ncj != null) {
            c1441830ncj.LIZLLL();
        }
    }

    @Override // X.C10FX
    public final Integer LIZJ() {
        InterfaceC1452170ntP interfaceC1452170ntP;
        C1441830ncj c1441830ncj = this.LIZJ;
        if (c1441830ncj == null || (interfaceC1452170ntP = c1441830ncj.LJIIIZ) == null) {
            return null;
        }
        return Integer.valueOf(interfaceC1452170ntP.LLL());
    }

    @Override // X.C10FX
    public final Integer LIZLLL() {
        AbstractC1452680nuE abstractC1452680nuE;
        C1441830ncj c1441830ncj = this.LIZJ;
        if (c1441830ncj == null || (abstractC1452680nuE = c1441830ncj.LJIILJJIL) == null) {
            return null;
        }
        return Integer.valueOf(abstractC1452680nuE.LJIJJ());
    }

    @Override // X.C10FX
    public final void LJ() {
        C1441830ncj c1441830ncj = this.LIZJ;
        if (c1441830ncj != null) {
            c1441830ncj.LJ();
        }
    }

    @Override // X.C10FX
    public final boolean isInitialized() {
        return this.LIZLLL;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0oBt] */
    public C1463620oBs(VideoPublishEditModel videoPublishEditModel) {
        this.LIZ = videoPublishEditModel;
    }

    @Override // X.C10FX
    public final void LJFF(float f) {
        C1441830ncj c1441830ncj = this.LIZJ;
        if (c1441830ncj != null) {
            int iLIZJ = (int) C10FS.LIZJ(f);
            InterfaceC1452170ntP interfaceC1452170ntP = c1441830ncj.LJIIIZ;
            if (interfaceC1452170ntP != null) {
                interfaceC1452170ntP.nf(iLIZJ, VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek);
            }
        }
    }

    @Override // X.C10FX
    public final void LIZ(LifecycleOwner lifecycleOwner, AbstractC1211760hde abstractC1211760hde) {
        VEEditorAutoStartStopArbiter vEEditorAutoStartStopArbiter;
        if (!(abstractC1211760hde instanceof C1211770hdf)) {
            return;
        }
        this.LIZLLL = true;
        C1441830ncj c1441830ncjLIZJ = C1439880nZa.LIZJ(this.LIZ, lifecycleOwner, ((C1211770hdf) abstractC1211760hde).LIZ);
        this.LIZJ = c1441830ncjLIZJ;
        AbstractC1452680nuE abstractC1452680nuE = c1441830ncjLIZJ.LJIILJJIL;
        if (abstractC1452680nuE != null && (vEEditorAutoStartStopArbiter = abstractC1452680nuE.LJFF) != null) {
            vEEditorAutoStartStopArbiter.LLJILJIL = this.LIZIZ;
        }
    }
}
