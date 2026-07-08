package X;

import Y.AObjectS241S0100000_8;
import Y.AObjectS247S0100000_29;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.ugc.aweme.shortvideo.editcut.EditAdjustClipsBottomViewModel;
import com.ss.android.ugc.aweme.shortvideo.editcut.EditAdjustClipsBottomViewState;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS430S0200000_29;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.12VS, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12VS extends C12VN {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLILZ;
    public final String LLJLL;
    public boolean LLJLLIL;
    public final C01GW LLJLLL;
    public final C01GW LLJZ;
    public final C01GW LLJZIJLIL;
    public final C01GW LLL;
    public final C01GW LLLF;
    public int LLLFF;
    public boolean LLLFFI;
    public int LLLFZ;
    public int LLLI;
    public final C1664750tQH LLLII;
    public final C1664750tQH LLLIIII;
    public final C1664750tQH LLLIIIIL;
    public final C1664750tQH LLLIIIL;
    public final C1664750tQH LLLIIL;
    public View LLLIILIL;
    public TextView LLLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C12VS.class, "adjustClipsModel", "getAdjustClipsModel()Lcom/ss/android/ugc/aweme/shortvideo/editcut/model/EditAdjustClipsModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C12VS.class, "videoEditViewModel", "getVideoEditViewModel()Lcom/ss/android/ugc/aweme/shortvideo/cut/videoedit/VideoEditViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C12VS.class, "editAdjustApi", "getEditAdjustApi()Lcom/ss/android/ugc/aweme/shortvideo/editcut/EditAdjustClipsApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C12VS.class, "editCutInternalApi", "getEditCutInternalApi()Lcom/ss/android/ugc/aweme/shortvideo/editcut/EditCutInternalApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C12VS.class, "bottomViewModel", "getBottomViewModel()Lcom/ss/android/ugc/aweme/shortvideo/editcut/EditAdjustClipsBottomViewModel;", 0);
        c09r3.getClass();
        LLLILZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5};
    }

    @Override // X.C12VN
    public final int LLLLIL() {
        return R.layout.ti;
    }

    private final EditAdjustClipsBottomViewModel LLLLIIIILLL() {
        return (EditAdjustClipsBottomViewModel) this.LLLIIL.getValue(this, LLLILZ[4]);
    }

    private final VideoEditViewModel LLLLJ() {
        return (VideoEditViewModel) this.LLLIIII.getValue(this, LLLILZ[1]);
    }

    public final boolean LLLLLILLIL() {
        C1664750tQH c1664750tQH = this.LLLII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLILZ;
        return ((C1463500oBg) c1664750tQH.getValue(this, interfaceC2217461BqaArr[0])).LIZ == 0 && C1444820nhY.LIZIZ && this.LLJLLIL && !u4.LJIIIIZZ(((C1463500oBg) this.LLLII.getValue(this, interfaceC2217461BqaArr[0])).LIZJ);
    }

    @Override // X.C12VN
    public final void LLLLJI() {
        super.LLLLJI();
        this.LLLIILIL = requireViewById(R.id.i5h);
        this.LLJJIJI = (AbstractC19763912Uj) requireViewById(R.id.videoEditView);
        this.LLLIL = (TextView) requireViewById(R.id.zjg);
    }

    public final void LLLLLJLJLL() {
        if ((LLLLIIIILLL().nR2().getCurrentTabIndex() == 0) && this.LLLFF != 1) {
            View view = this.LLLIILIL;
            C786410Ut5.LJLLLLLL(8, view != null ? view : null);
            ((AbstractC19670611xg) this.LLLF.getValue()).show();
            ((AbstractC19670611xg) this.LLJZIJLIL.getValue()).hide();
            ((AbstractC19670611xg) this.LLJLLL.getValue()).hide();
            if (LLLLLILLIL()) {
                ((AbstractC19670611xg) this.LLJZ.getValue()).show();
                return;
            }
            return;
        }
        View view2 = this.LLLIILIL;
        if (view2 == null) {
            view2 = null;
        }
        C786410Ut5.LJLLLLLL(0, view2);
        ((AbstractC19670611xg) this.LLLF.getValue()).hide();
        if (LLLLLILLIL()) {
            ((AbstractC19670611xg) this.LLJZ.getValue()).show();
        } else {
            ((AbstractC19670611xg) this.LLJLLL.getValue()).show();
        }
        ((AbstractC19670611xg) this.LLJZIJLIL.getValue()).show();
        TextView textView = this.LLLIL;
        C786410Ut5.LLIL(textView != null ? textView : null, LLLLLILLIL() ? 0 : 8);
    }

    @Override // X.InterfaceC19670711xh
    public final String getTag() {
        return this.LLJLL;
    }

    public final void LLLLLLIL(Pair<Integer, Integer> pair) {
        String strLJFF;
        TextView textView = this.LLLIL;
        C1322110kVd c1322110kVd = null;
        if (textView == null) {
            textView = null;
        }
        C786410Ut5.LLIL(textView, 8);
        VideoSegment videoSegment = (VideoSegment) ListProtector.get(LLLLJ().zQ2(), pair.getSecond().intValue());
        this.LLJLLIL = false;
        ((AbstractC19670611xg) this.LLJZ.getValue()).hide();
        ((AbstractC19670611xg) this.LLJZIJLIL.getValue()).hide();
        ((AbstractC19670611xg) this.LLJLLL.getValue()).show();
        if (LLLLIIIILLL().nR2().getCurrentTabIndex() == 0) {
            C12V1 c12v1 = (C12V1) this.LLJLIL.getValue();
            if (c12v1.LLJJIJI.isShowing(c12v1)) {
                c12v1.LLJJIJI.remove(c12v1);
            }
        } else {
            ((C12V1) this.LLJLIL.getValue()).show();
        }
        C12VZ c12vz = (C12VZ) this.LLL.getValue();
        c12vz.show();
        if (TextUtils.isEmpty(videoSegment.thumbnail)) {
            strLJFF = videoSegment.LJFF(false);
        } else {
            strLJFF = videoSegment.thumbnail;
        }
        C1322110kVd c1322110kVd2 = c12vz.LLJILLL;
        if (c1322110kVd2 != null) {
            c1322110kVd = c1322110kVd2;
        }
        C1463700oC0.LIZIZ(c1322110kVd, strLJFF, C426580Go4.LIZJ(637534207, 637534207, 0, C366700EZg.LIZ(2.0d)), C366700EZg.LIZ(48.0d), (C386930FFb) c12vz.LLJJIJIIJIL.getValue(c12vz, C12VZ.LLJJIJIL[2]));
        ((C12VU) this.LLLIIIL.getValue(this, LLLILZ[3])).Z52(pair.getFirst().intValue(), pair.getSecond().intValue());
    }

    @Override // X.C12VN, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        BaseJediViewModel.iR2(LLLLIIIILLL(), this, new C2217381BqS() { // from class: X.12Vb
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((EditAdjustClipsBottomViewState) obj).getAddVideosEvent();
            }
        }, new AwS608S0100000_29(this, 704));
        BaseJediViewModel.iR2(LLLLIIIILLL(), this, new C2217381BqS() { // from class: X.12Vd
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((EditAdjustClipsBottomViewState) obj).getModeChangeEvent();
            }
        }, new AwS608S0100000_29(this, 705));
        BaseJediViewModel.iR2(LLLLIIIILLL(), this, new C2217381BqS() { // from class: X.110v
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((EditAdjustClipsBottomViewState) obj).getStickPointStatus());
            }
        }, new AwS608S0100000_29(this, 706));
        BaseJediViewModel.iR2(LLLLIIIILLL(), this, new C2217381BqS() { // from class: X.110Y
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((EditAdjustClipsBottomViewState) obj).getCurrentTabIndex());
            }
        }, new AwS608S0100000_29(this, 707));
        BaseJediViewModel.iR2(LLLLIIIILLL(), this, new C2217381BqS() { // from class: X.12Vq
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((EditAdjustClipsBottomViewState) obj).getSelectTime();
            }
        }, new C5183020f(this, 245));
        LLLLJ().LLJJI.observe(this, new AObjectS247S0100000_29(this, 95));
        LLLLJ().LLJJIII.observe(this, new AObjectS247S0100000_29(this, 96));
        LLLLJ().LLJJIJI.observe(this, new AObjectS247S0100000_29(this, 97));
        LLLLJ().LLJJIJIIJIL.observe(this, new AObjectS247S0100000_29(this, 98));
        LLLLIILL().LLJIJIL.observe(this, new AObjectS241S0100000_8(this, 99));
        LLLLLJLJLL();
    }

    public C12VS(C1DRG c1drg, C12VT c12vt) {
        super(c1drg, c12vt);
        this.LLJLL = "MultiClipsAdjustBottomScene";
        this.LLJLLIL = true;
        this.LLJLLL = C452501pT.LIZIZ(new AwS430S0200000_29(c1drg, this, 113));
        this.LLJZ = C452501pT.LIZIZ(new AwS430S0200000_29(c1drg, this, 108));
        this.LLJZIJLIL = C452501pT.LIZIZ(new AwS430S0200000_29(c1drg, this, 109));
        this.LLL = C452501pT.LIZIZ(new AwS430S0200000_29(c1drg, this, 110));
        this.LLLF = C452501pT.LIZIZ(new AwS430S0200000_29(c1drg, this, 111));
        this.LLLFF = 1;
        this.LLLFFI = true;
        this.LLLFZ = -1;
        this.LLLI = -1;
        this.LLLII = C1664770tQJ.LIZ(this.LLJILLL, C1463500oBg.class, null);
        this.LLLIIII = C1664770tQJ.LIZ(this.LLJILLL, VideoEditViewModel.class, null);
        this.LLLIIIIL = C1664770tQJ.LIZ(this.LLJILLL, InterfaceC1419190n2D.class, null);
        this.LLLIIIL = C1664770tQJ.LIZ(this.LLJILLL, C12VU.class, null);
        this.LLLIIL = C1664770tQJ.LIZ(this.LLJILLL, EditAdjustClipsBottomViewModel.class, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    public final void LLLLLL(boolean z, boolean z2) {
        int i;
        ?? arrayList;
        if (z2) {
            List<VideoSegment> listDQ2 = LLLLJ().DQ2();
            if (listDQ2 != null) {
                arrayList = new ArrayList();
                for (VideoSegment videoSegment : listDQ2) {
                    if (!videoSegment.isDeleted) {
                        arrayList.add(videoSegment);
                    }
                }
            } else {
                arrayList = C13BV.INSTANCE;
            }
            if (arrayList.isEmpty()) {
                ((C12VU) this.LLLIIIIL.getValue(this, LLLILZ[2])).le2();
                return;
            }
        }
        this.LLJLLIL = true;
        C12V1 c12v1 = (C12V1) this.LLJLIL.getValue();
        if (c12v1.LLJJIJI.isShowing(c12v1)) {
            c12v1.LLJJIJI.remove(c12v1);
        }
        ((AbstractC19670611xg) this.LLL.getValue()).hide();
        if (LLLLLILLIL()) {
            ((AbstractC19670611xg) this.LLJLLL.getValue()).hide();
            ((AbstractC19670611xg) this.LLJZ.getValue()).show();
        }
        ((AbstractC19670611xg) this.LLJZIJLIL.getValue()).show();
        ((C12VU) this.LLLIIIL.getValue(this, LLLILZ[3])).vW0(z, z2);
        TextView textView = this.LLLIL;
        if (textView == null) {
            textView = null;
        }
        if (LLLLLILLIL()) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LLIL(textView, i);
    }

    public final void LLLLLJIL(Pair<Integer, Integer> pair, Pair<Integer, Integer> pair2, boolean z) {
        LLLLILI().LJIIIIZZ();
        ((C12VU) this.LLLIIIL.getValue(this, LLLILZ[3])).HJ2(pair, pair2, z);
    }
}
