package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.editcut.EditAdjustClipsBottomViewModel;
import com.ss.android.ugc.aweme.shortvideo.editcut.EditAdjustClipsBottomViewState;
import com.zhiliaoapp.musically.R;
import irm.AkS95S0100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.12VZ, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12VZ extends AbstractC19670611xg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public final String LLJILJILJ;
    public C1322110kVd LLJILLL;
    public View LLJJ;
    public View LLJJI;
    public final C1664750tQH LLJJIII;
    public final C1664750tQH LLJJIJI;
    public final C1664750tQH LLJJIJIIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C12VZ.class, "cutMultiVideoViewModel", "getCutMultiVideoViewModel()Lcom/ss/android/ugc/aweme/shortvideo/cut/CutMultiVideoViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C12VZ.class, "bottomViewModel", "getBottomViewModel()Lcom/ss/android/ugc/aweme/shortvideo/editcut/EditAdjustClipsBottomViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C12VZ.class, "thumbnailCache", "getThumbnailCache()Lcom/ss/android/ugc/aweme/utils/FrameCache;", 0);
        c09r3.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    @Override // X.InterfaceC19670711xh
    public final String getTag() {
        return this.LLJILJILJ;
    }

    @Override // com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C1322110kVd c1322110kVd = (C1322110kVd) requireViewById(R.id.video_cover);
        this.LLJILLL = c1322110kVd;
        View view = null;
        if (c1322110kVd == null) {
            c1322110kVd = null;
        }
        int i = C12UY.LIZ;
        c1322110kVd.setOutlineProvider(new C1151470g4P(3));
        c1322110kVd.setClipToOutline(true);
        View viewRequireViewById = requireViewById(R.id.l5q);
        this.LLJJ = viewRequireViewById;
        if (viewRequireViewById == null) {
            viewRequireViewById = null;
        }
        C786410Ut5.I7(new AkS95S0100000_29(this, 87), viewRequireViewById);
        View viewRequireViewById2 = requireViewById(R.id.l7f);
        this.LLJJI = viewRequireViewById2;
        if (viewRequireViewById2 != null) {
            view = viewRequireViewById2;
        }
        C786410Ut5.I7(new AkS95S0100000_29(this, 88), view);
        BaseJediViewModel.iR2((BaseJediViewModel) this.LLJJIJI.getValue(this, LLJJIJIL[1]), this, new C2217381BqS() { // from class: X.12VY
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((EditAdjustClipsBottomViewState) obj).getFocusEditMode();
            }
        }, new AwS608S0100000_29(this, 745));
    }

    public C12VZ(C1DRG c1drg, C12VS c12vs) {
        super(c1drg, c12vs, R.id.i3k);
        this.LLJILJILJ = "SingleEditModeBottomScene";
        this.LLJJIII = C1664770tQJ.LIZ(this.LLJI, CutMultiVideoViewModel.class, null);
        this.LLJJIJI = C1664770tQJ.LIZ(this.LLJI, EditAdjustClipsBottomViewModel.class, null);
        this.LLJJIJIIJIL = C1664770tQJ.LIZ(this.LLJI, C386930FFb.class, null);
    }

    @Override // com.bytedance.scene.Scene
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.sx, viewGroup, false);
    }
}
