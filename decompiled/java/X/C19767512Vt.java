package X;

import Y.AObserverS231S0100000_29;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import avg.f;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.editcut.EditAdjustClipsBottomViewModel;
import com.ss.android.ugc.aweme.shortvideo.editcut.EditAdjustClipsBottomViewState;
import com.zhiliaoapp.musically.R;
import irm.AkS95S0100000_29;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS608S0100000_29;
import mf.a;

/* JADX INFO: renamed from: X.12Vt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19767512Vt extends AbstractC19670611xg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJ;
    public final String LLJILJILJ;
    public TextView LLJILLL;
    public C19767612Vu LLJJ;
    public View LLJJI;
    public View LLJJIII;
    public boolean LLJJIJI;
    public final C1664750tQH LLJJIJIIJIL;
    public final C1664750tQH LLJJIJIL;
    public final C1664750tQH LLJJJ;
    public final C1664750tQH LLJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C19767512Vt.class, "adjustClipsModel", "getAdjustClipsModel()Lcom/ss/android/ugc/aweme/shortvideo/editcut/model/EditAdjustClipsModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C19767512Vt.class, "editViewModel", "getEditViewModel()Lcom/ss/android/ugc/aweme/shortvideo/cut/videoedit/VideoEditViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C19767512Vt.class, "bottomViewModel", "getBottomViewModel()Lcom/ss/android/ugc/aweme/shortvideo/editcut/EditAdjustClipsBottomViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C19767512Vt.class, "editCutInternalApi", "getEditCutInternalApi()Lcom/ss/android/ugc/aweme/shortvideo/editcut/EditCutInternalApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C19767512Vt.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        LLJJJJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5};
    }

    public final boolean LLLII() {
        Integer value;
        return !C1462990oAr.LIZ((C1463500oBg) this.LLJJIJIIJIL.getValue(this, LLJJJJ[0])) && (value = LLLIL().LLILLJJLI.getValue()) != null && value.intValue() == 2 && LLLILZ();
    }

    public final EditAdjustClipsBottomViewModel LLLIIIIL() {
        return (EditAdjustClipsBottomViewModel) this.LLJJJ.getValue(this, LLJJJJ[2]);
    }

    public final C12VU LLLIILIL() {
        return (C12VU) this.LLJJJIL.getValue(this, LLJJJJ[3]);
    }

    public final VideoEditViewModel LLLIL() {
        return (VideoEditViewModel) this.LLJJIJIL.getValue(this, LLJJJJ[1]);
    }

    public final boolean LLLILZ() {
        List<VideoSegment> listR8 = LLLIILIL().R8();
        ArrayList arrayList = new ArrayList();
        for (VideoSegment videoSegment : listR8) {
            if (true ^ videoSegment.isDeleted) {
                arrayList.add(videoSegment);
            }
        }
        return arrayList.size() > 1;
    }

    @Override // X.InterfaceC19670711xh
    public final String getTag() {
        return this.LLJILJILJ;
    }

    @Override // com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.LLJILLL = (TextView) requireViewById(R.id.tv_selected_duration);
        this.LLJJ = (C19767612Vu) requireViewById(R.id.lvc);
        this.LLJJI = requireViewById(R.id.lea);
        this.LLJJIII = requireViewById(R.id.ltd);
        LLLIL().LLILLJJLI.observe(this, new AObserverS231S0100000_29(this, 230));
        BaseJediViewModel.iR2(LLLIIIIL(), this, new C2217381BqS() { // from class: X.12Vk
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((EditAdjustClipsBottomViewState) obj).isMusicSyncMode();
            }
        }, new AwS608S0100000_29(this, 735));
        BaseJediViewModel.iR2(LLLIIIIL(), this, new C2217381BqS() { // from class: X.12Vr
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((EditAdjustClipsBottomViewState) obj).getSelectTime();
            }
        }, new AwS608S0100000_29(this, 736));
        BaseJediViewModel.iR2(LLLIIIIL(), this, new C2217381BqS() { // from class: X.12VX
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((EditAdjustClipsBottomViewState) obj).getFocusEditMode();
            }
        }, new AwS608S0100000_29(this, 737));
        BaseJediViewModel.iR2(LLLIIIIL(), this, new C2217381BqS() { // from class: X.12Vv
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((EditAdjustClipsBottomViewState) obj).getCurrentEditOriginIndex());
            }
        }, new AwS608S0100000_29(this, 738));
        C19767612Vu c19767612Vu = this.LLJJ;
        View view = null;
        if (c19767612Vu == null) {
            c19767612Vu = null;
        }
        View.OnClickListener akS95S0100000_29 = new AkS95S0100000_29(this, 89);
        if (C1848410yCV.LIZ) {
            akS95S0100000_29 = new f(akS95S0100000_29);
        }
        a aVar = new a(akS95S0100000_29);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c19767612Vu);
        }
        c19767612Vu.setOnClickListener(aVar);
        View view2 = this.LLJJI;
        if (view2 == null) {
            view2 = null;
        }
        C786410Ut5.I7(new AkS95S0100000_29(this, 90), view2);
        View view3 = this.LLJJIII;
        if (view3 != null) {
            view = view3;
        }
        C786410Ut5.I7(new AkS95S0100000_29(this, 91), view);
    }

    public C19767512Vt(C1DRG c1drg, C12VN c12vn) {
        super(c1drg, c12vn, R.id.iat);
        this.LLJILJILJ = "EditToolbarScene";
        this.LLJJIJIIJIL = C1664770tQJ.LIZ(this.LLJI, C1463500oBg.class, null);
        this.LLJJIJIL = C1664770tQJ.LIZ(this.LLJI, VideoEditViewModel.class, null);
        this.LLJJJ = C1664770tQJ.LIZ(this.LLJI, EditAdjustClipsBottomViewModel.class, null);
        this.LLJJJIL = C1664770tQJ.LIZ(this.LLJI, C12VU.class, null);
        C1664770tQJ.LIZ(this.LLJI, VideoPublishEditModel.class, null);
    }

    @Override // com.bytedance.scene.Scene
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.sy, viewGroup, false);
    }
}
