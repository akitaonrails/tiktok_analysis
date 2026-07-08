package X;

import Y.AObserverS212S0100000_8;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.VEVideoCutterViewModel;
import com.ss.android.vesdk.VEEditor;
import dmt.av.video.VEEditorAutoStartStopArbiter;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: renamed from: X.0MgK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C574660MgK implements InterfaceC379610EuV, LifecycleOwner, InterfaceC1463550oBl {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZ;
    public final LifecycleOwner LL;
    public final C1DRG LLILLJJLI;
    public InterfaceC1452170ntP LLILLL;
    public final C1664750tQH LLILZ;
    public final C1664750tQH LLILZIL;
    public C574620MgG LLILZLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C574660MgK.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C574660MgK.class, "editCutterViewModel", "getEditCutterViewModel()Lcom/ss/android/ugc/aweme/shortvideo/cut/viewmodel/VEVideoCutterViewModel;", 0);
        c09r3.getClass();
        LLIZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public final VEVideoCutterViewModel LIZ() {
        return (VEVideoCutterViewModel) this.LLILZIL.getValue(this, LLIZ[1]);
    }

    public final InterfaceC574650MgJ LJ() {
        if (this.LLILZLL == null) {
            InterfaceC1452170ntP interfaceC1452170ntP = this.LLILLL;
            VEEditorAutoStartStopArbiter value = ((InterfaceC1455860nzM) this.LLILZ.getValue(this, LLIZ[0])).b10().getValue();
            if (interfaceC1452170ntP != null && value != null) {
                this.LLILZLL = new C574620MgG(interfaceC1452170ntP, new AwS552S0100000_8(value, 180));
            }
        }
        return this.LLILZLL;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LL.getLifecycle();
    }

    @Override // X.InterfaceC1463550oBl
    public final long LIZIZ() {
        InterfaceC574650MgJ interfaceC574650MgJLJ = LJ();
        if (interfaceC574650MgJLJ != null) {
            return ((C574620MgG) interfaceC574650MgJLJ).LIZ();
        }
        return 0L;
    }

    @Override // X.InterfaceC1463550oBl
    public final boolean LIZJ() {
        InterfaceC574650MgJ interfaceC574650MgJLJ = LJ();
        if (interfaceC574650MgJLJ == null || !((C574620MgG) interfaceC574650MgJLJ).LIZLLL()) {
            LIZ().vQ2(new C574630MgH(1, true));
            return true;
        }
        LIZ().vQ2(new C574630MgH(2, true));
        return false;
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLILLJJLI;
    }

    public C574660MgK(AbstractC1463010oAt abstractC1463010oAt, C1DRG c1drg) {
        this.LL = abstractC1463010oAt;
        this.LLILLJJLI = c1drg;
        C1664750tQH c1664750tQHLIZ = C1664770tQJ.LIZ(c1drg, InterfaceC1455860nzM.class, null);
        this.LLILZ = c1664750tQHLIZ;
        this.LLILZIL = C1664770tQJ.LIZ(c1drg, VEVideoCutterViewModel.class, null);
        ((InterfaceC1455860nzM) c1664750tQHLIZ.getValue(this, LLIZ[0])).g().observe(this, new AObserverS212S0100000_8(this, 33));
        ((LiveData) LIZ().LL.getValue()).observe(this, new AObserverS212S0100000_8(this, 34));
    }

    @Override // X.InterfaceC1463550oBl
    public final void LIZLLL(long j, VEEditor.SEEK_MODE seek_mode, boolean z) {
        InterfaceC1464180oCm interfaceC1464180oCm;
        if (j >= 0) {
            VEVideoCutterViewModel vEVideoCutterViewModelLIZ = LIZ();
            if (seek_mode != VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_OnGoing && z) {
                interfaceC1464180oCm = new InterfaceC1464180oCm() { // from class: X.0MgL
                    @Override // X.InterfaceC1464180oCm
                    public final void onSeekDone(int i) {
                        C01TT.LIZLLL(new AwS552S0100000_8(this.LIZ, 179));
                    }
                };
            } else {
                interfaceC1464180oCm = null;
            }
            vEVideoCutterViewModelLIZ.vQ2(new C574630MgH(j, seek_mode, interfaceC1464180oCm));
            return;
        }
        if (getLifecycle().getCurrentState() == Lifecycle.State.RESUMED) {
            LIZ().vQ2(new C574630MgH(1, false));
        }
    }
}
