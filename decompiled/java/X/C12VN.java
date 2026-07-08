package X;

import Y.AObserverS231S0100000_29;
import Y.ARunnableS129S0100000_29;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LiveData;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.VEVideoCutterViewModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.editcut.EditAdjustClipsBottomViewModel;
import com.ss.android.ugc.aweme.shortvideo.editcut.EditAdjustClipsBottomViewState;
import com.ss.android.vesdk.VEEditor;
import com.zhiliaoapp.musically.R;
import irm.AkS95S0100000_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.12VN, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public abstract class C12VN extends C19A3 implements InterfaceC19670711xh, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLILLLLZIIL;
    public final C1DRG LLJILLL;
    public final C19A3 LLJJ;
    public View LLJJIII;
    public AbstractC19763912Uj LLJJIJI;
    public final C1664750tQH LLJJIJIIJIL;
    public final C1664750tQH LLJJIJIL;
    public final C1664750tQH LLJJJ;
    public final C1664750tQH LLJJJIL;
    public final C1664750tQH LLJJJJ;
    public final C1664750tQH LLJJJJJIL;
    public final C1664750tQH LLJJJJLIIL;
    public final C1664750tQH LLJJL;
    public final int LLJJI = R.id.chv;
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 982));
    public final ARunnableS129S0100000_29 LLJL = new ARunnableS129S0100000_29(this, 181);
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 981));

    public abstract int LLLLIL();

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C12VN.class, "editAdjustClipsModel", "getEditAdjustClipsModel()Lcom/ss/android/ugc/aweme/shortvideo/editcut/model/EditAdjustClipsModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C12VN.class, "cutMultiVideoViewModel", "getCutMultiVideoViewModel()Lcom/ss/android/ugc/aweme/shortvideo/cut/CutMultiVideoViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C12VN.class, "videoEditViewModel", "getVideoEditViewModel()Lcom/ss/android/ugc/aweme/shortvideo/cut/videoedit/VideoEditViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C12VN.class, "bottomViewModel", "getBottomViewModel()Lcom/ss/android/ugc/aweme/shortvideo/editcut/EditAdjustClipsBottomViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C12VN.class, "editCutterViewModel", "getEditCutterViewModel()Lcom/ss/android/ugc/aweme/shortvideo/cut/viewmodel/VEVideoCutterViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C12VN.class, "editCutInternalApi", "getEditCutInternalApi()Lcom/ss/android/ugc/aweme/shortvideo/editcut/EditCutInternalApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(C12VN.class, "playerController", "getPlayerController()Lcom/ss/android/ugc/aweme/shortvideo/editcut/IPlayerController;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS8 = new C2217381BqS(C12VN.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        LLJLILLLLZIIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7, c2217381BqS8};
    }

    public final EditAdjustClipsBottomViewModel LLLLIIIILLL() {
        return (EditAdjustClipsBottomViewModel) this.LLJJJIL.getValue(this, LLJLILLLLZIIL[3]);
    }

    public final CutMultiVideoViewModel LLLLIILL() {
        return (CutMultiVideoViewModel) this.LLJJIJIL.getValue(this, LLJLILLLLZIIL[1]);
    }

    public final AbstractC19763912Uj LLLLILI() {
        AbstractC19763912Uj abstractC19763912Uj = this.LLJJIJI;
        if (abstractC19763912Uj != null) {
            return abstractC19763912Uj;
        }
        return null;
    }

    public final VideoEditViewModel LLLLJ() {
        return (VideoEditViewModel) this.LLJJJ.getValue(this, LLJLILLLLZIIL[2]);
    }

    public void LLLLJI() {
        View viewRequireViewById = requireViewById(R.id.ltt);
        this.LLJJIII = viewRequireViewById;
        if (viewRequireViewById == null) {
            viewRequireViewById = null;
        }
        C786410Ut5.I7(new AkS95S0100000_29(this, 80), viewRequireViewById);
    }

    @Override // com.bytedance.scene.Scene
    public final void onStart() {
        super.onStart();
        ((Handler) this.LLJJLIIIJLLLLLLLZ.getValue()).post(this.LLJL);
    }

    @Override // com.bytedance.scene.Scene
    public final void onStop() {
        super.onStop();
        ((Handler) this.LLJJLIIIJLLLLLLLZ.getValue()).removeCallbacks(this.LLJL);
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLJILLL;
    }

    @Override // com.bytedance.scene.Scene
    public void onActivityCreated(Bundle bundle) {
        boolean zBooleanValue;
        super.onActivityCreated(bundle);
        LLLLJI();
        if (this.LLJJIJI != null) {
            LLLLILI().setMaxVideoLength(C12VL.LIZJ());
            C1664750tQH c1664750tQH = this.LLJJIJIIJIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLILLLLZIIL;
            boolean z = ((C1463500oBg) c1664750tQH.getValue(this, interfaceC2217461BqaArr[0])).LIZIZ;
            LLLLILI().setMultiEditEnableForStickPointMode(true);
            LLLLILI().setExtractFramesInRoughMode(true);
            LLLLILI().setLayoutDirection(0);
            AbstractC19763912Uj abstractC19763912UjLLLLILI = LLLLILI();
            Boolean boolIsMusicSyncMode = LLLLIIIILLL().nR2().isMusicSyncMode();
            if (boolIsMusicSyncMode != null) {
                zBooleanValue = boolIsMusicSyncMode.booleanValue();
            } else {
                zBooleanValue = false;
            }
            abstractC19763912UjLLLLILI.setDefaultMode(zBooleanValue);
            LLLLILI().LJI(C372650EjH.LIZIZ(this), C1659630tI1.LJIIIIZZ(this, null, null, 6), LLLLIILL(), LLLLJ(), ((C12VU) this.LLJJJJJIL.getValue(this, interfaceC2217461BqaArr[5])).R8(), z ? 1 : 0);
            LLLLILI().setEditViewHeight(!((C1463500oBg) this.LLJJIJIIJIL.getValue(this, interfaceC2217461BqaArr[0])).LIZIZ);
            ((C12VU) this.LLJJJJJIL.getValue(this, interfaceC2217461BqaArr[5])).NU0(LLLLILI());
        }
        ((LiveData) ((VEVideoCutterViewModel) this.LLJJJJ.getValue(this, LLJLILLLLZIIL[4])).LL.getValue()).observe(this, new AObserverS231S0100000_29(this, 200));
        BaseJediViewModel.iR2(LLLLIIIILLL(), this, new C2217381BqS() { // from class: X.12VP
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((EditAdjustClipsBottomViewState) obj).isMusicSyncMode();
            }
        }, new AwS608S0100000_29(this, 708));
        BaseJediViewModel.iR2(LLLLIIIILLL(), this, new C2217381BqS() { // from class: X.12VQ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((EditAdjustClipsBottomViewState) obj).getRestoreEditEvent();
            }
        }, new AwS608S0100000_29(this, 709));
        LLLLJ().LLILLJJLI.observe(this, new AObserverS231S0100000_29(this, 201));
        LLLLJ().LLILLL.observe(this, new AObserverS231S0100000_29(this, 202));
        LLLLJ().LLILZIL.observe(this, new AObserverS231S0100000_29(this, 203));
        LLLLJ().LLILZ.observe(this, new AObserverS231S0100000_29(this, 204));
        LLLLJ().LLIZ.observe(this, new AObserverS231S0100000_29(this, 191));
        LLLLJ().LLILZLL.observe(this, new AObserverS231S0100000_29(this, 192));
        LLLLJ().LLIZLLLIL.observe(this, new AObserverS231S0100000_29(this, 193));
        LLLLJ().LLJIJIL.observe(this, new AObserverS231S0100000_29(this, 194));
        LLLLJ().LLJILJILJ.observe(this, new AObserverS231S0100000_29(this, 195));
        LLLLJ().LLJILLL.observe(this, new AObserverS231S0100000_29(this, 196));
        LLLLJ().LLJ.observe(this, new AObserverS231S0100000_29(this, 197));
        LLLLJ().LLJI.observe(this, new AObserverS231S0100000_29(this, 198));
        LLLLJ().LLJJIJIL.observe(this, new AObserverS231S0100000_29(this, 199));
    }

    public C12VN(C1DRG c1drg, C12VT c12vt) {
        this.LLJILLL = c1drg;
        this.LLJJ = c12vt;
        this.LLJJIJIIJIL = C1664770tQJ.LIZ(c1drg, C1463500oBg.class, null);
        this.LLJJIJIL = C1664770tQJ.LIZ(c1drg, CutMultiVideoViewModel.class, null);
        this.LLJJJ = C1664770tQJ.LIZ(c1drg, VideoEditViewModel.class, null);
        this.LLJJJIL = C1664770tQJ.LIZ(c1drg, EditAdjustClipsBottomViewModel.class, null);
        this.LLJJJJ = C1664770tQJ.LIZ(c1drg, VEVideoCutterViewModel.class, null);
        this.LLJJJJJIL = C1664770tQJ.LIZ(c1drg, C12VU.class, null);
        this.LLJJJJLIIL = C1664770tQJ.LIZ(c1drg, InterfaceC1463550oBl.class, null);
        this.LLJJL = C1664770tQJ.LIZ(c1drg, VideoPublishEditModel.class, null);
    }

    public final void LLLLL(long j, VEEditor.SEEK_MODE seek_mode, boolean z) {
        ((InterfaceC1463550oBl) this.LLJJJJLIIL.getValue(this, LLJLILLLLZIIL[6])).LIZLLL(j, seek_mode, true);
        if (z) {
            LLLLIIIILLL().oR2(LLLLILI().getSelectedTime());
        }
    }

    @Override // X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.tg, viewGroup, false);
        C786410Ut5.Td(layoutInflater, LLLLIL(), (ViewGroup) viewTd.findViewById(R.id.i3p), true);
        return (ViewGroup) viewTd;
    }

    @Override // X.C19A3, com.bytedance.scene.Scene
    public final /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return onCreateView(layoutInflater, viewGroup, bundle);
    }
}
