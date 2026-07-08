package X;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.bytedance.scene.SceneActivityCompatibilityLayerFragment;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.ugc.aweme.shortvideo.editcut.EditAdjustClipsBottomViewModel;
import com.ss.android.ugc.aweme.shortvideo.editcut.EditAdjustClipsBottomViewState;
import com.zhiliaoapp.musically.R;
import java.util.HashSet;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.AwS643S0100000_29;

/* JADX INFO: renamed from: X.12Vx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19767912Vx extends AbstractC19670611xg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJLIIL;
    public final String LLJILJILJ;
    public final C1664750tQH LLJILLL;
    public final C1664750tQH LLJJ;
    public final C1664750tQH LLJJI;
    public final C1664750tQH LLJJIII;
    public final C1664750tQH LLJJIJI;
    public final C1664750tQH LLJJIJIIJIL;
    public TextView LLJJIJIL;
    public RecyclerView LLJJJ;
    public View LLJJJIL;
    public C12W9 LLJJJJ;
    public C12W6 LLJJJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C19767912Vx.class, "editViewModel", "getEditViewModel()Lcom/ss/android/ugc/aweme/shortvideo/cut/videoedit/VideoEditViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C19767912Vx.class, "adjustClipsModel", "getAdjustClipsModel()Lcom/ss/android/ugc/aweme/shortvideo/editcut/model/EditAdjustClipsModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C19767912Vx.class, "cutMultiVideoViewModel", "getCutMultiVideoViewModel()Lcom/ss/android/ugc/aweme/shortvideo/cut/CutMultiVideoViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C19767912Vx.class, "editCutInternalApi", "getEditCutInternalApi()Lcom/ss/android/ugc/aweme/shortvideo/editcut/EditCutInternalApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C19767912Vx.class, "bottomViewModel", "getBottomViewModel()Lcom/ss/android/ugc/aweme/shortvideo/editcut/EditAdjustClipsBottomViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C19767912Vx.class, "thumbnailCache", "getThumbnailCache()Lcom/ss/android/ugc/aweme/utils/FrameCache;", 0);
        c09r3.getClass();
        LLJJJJLIIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6};
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.12W0, X.12WN] */
    public final void LLLIL() throws Throwable {
        C12W6 c12w6;
        Activity activity;
        RecyclerView recyclerView = this.LLJJJ;
        if (recyclerView == null) {
            recyclerView = null;
        }
        AbstractC21673619ry adapter = recyclerView.getAdapter();
        if (!(adapter instanceof C12W6) || (c12w6 = (C12W6) adapter) == null) {
            return;
        }
        boolean z = C1444820nhY.LIZ;
        Bundle bundleLIZ = C1444820nhY.LIZ(this.mActivity, c12w6.LLLILZ(), c12w6.LLLIL(), LLLII().LIZJ.getCreativeInfo());
        if (bundleLIZ == null || (activity = this.mActivity) == null) {
            return;
        }
        bundleLIZ.putInt("key_choose_scene", 13);
        final Intent intentLJIJJLI = C1660680tJi.LIZ().LJIJJLI(activity, bundleLIZ);
        final AwS643S0100000_29 awS643S0100000_29 = new AwS643S0100000_29(this, 140);
        final Activity activity2 = this.mActivity;
        if (activity2 != null) {
            final ?? r7 = new C12WN() { // from class: X.12W0
                @Override // X.C12WN
                public final void onResult(int i, Intent intent) {
                    awS643S0100000_29.invoke(Integer.valueOf(i), intent);
                }
            };
            C12WP.LIZ();
            if (C12WM.LIZIZ(activity2, this)) {
                return;
            }
            final SceneActivityCompatibilityLayerFragment sceneActivityCompatibilityLayerFragmentLIZ = C12WM.LIZ(activity2);
            if (sceneActivityCompatibilityLayerFragmentLIZ.isAdded()) {
                sceneActivityCompatibilityLayerFragmentLIZ.LJ(this, intentLJIJJLI, 1001, r7);
            } else {
                ((HashSet) sceneActivityCompatibilityLayerFragmentLIZ.LLILZ).add(new C12WJ() { // from class: X.12Vz
                    public final /* synthetic */ int LJ = 1001;

                    @Override // X.C12WJ
                    public final void LIZ() throws Throwable {
                        ((HashSet) sceneActivityCompatibilityLayerFragmentLIZ.LLILZ).remove(this);
                        if (C12WM.LIZIZ(activity2, this)) {
                            return;
                        }
                        sceneActivityCompatibilityLayerFragmentLIZ.LJ(this, intentLJIJJLI, this.LJ, r7);
                    }
                });
            }
        }
    }

    public final C1463500oBg LLLII() {
        return (C1463500oBg) this.LLJJ.getValue(this, LLJJJJLIIL[1]);
    }

    public final EditAdjustClipsBottomViewModel LLLIIIIL() {
        return (EditAdjustClipsBottomViewModel) this.LLJJIJI.getValue(this, LLJJJJLIIL[4]);
    }

    public final void LLLIILIL() {
        C12W6 c12w6 = this.LLJJJJJIL;
        if ((c12w6 != null ? c12w6.getItemCount() : 0) <= 1) {
            TextView textView = this.LLJJIJIL;
            (textView != null ? textView : null).setText(getResources().getString(2131833235));
        } else {
            TextView textView2 = this.LLJJIJIL;
            (textView2 != null ? textView2 : null).setText(getResources().getString(2131837614));
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onDestroyView() {
        super.onDestroyView();
        C12W9 c12w9 = this.LLJJJJ;
        if (c12w9 != null) {
            ValueAnimator valueAnimator = c12w9.LJI;
            if (valueAnimator != null) {
                valueAnimator.removeAllUpdateListeners();
            }
            ValueAnimator valueAnimator2 = c12w9.LJI;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
        }
    }

    @Override // X.InterfaceC19670711xh
    public final String getTag() {
        return this.LLJILJILJ;
    }

    @Override // com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        C12W5 c12w5;
        super.onActivityCreated(bundle);
        this.LLJJIJIL = (TextView) requireViewById(R.id.zhs);
        this.LLJJJ = (RecyclerView) requireViewById(R.id.videoRecyclerView);
        this.LLJJJIL = requireViewById(R.id.b3k);
        Activity activityRequireActivity = requireActivity();
        C1664750tQH c1664750tQH = this.LLJILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJLIIL;
        C12W9 c12w9 = new C12W9(activityRequireActivity, this, (VideoEditViewModel) c1664750tQH.getValue(this, interfaceC2217461BqaArr[0]), (CutMultiVideoViewModel) this.LLJJI.getValue(this, interfaceC2217461BqaArr[2]));
        this.LLJJJJ = c12w9;
        RecyclerView recyclerView = this.LLJJJ;
        if (recyclerView == null) {
            recyclerView = null;
        }
        View view = this.LLJJJIL;
        if (view == null) {
            view = null;
        }
        boolean z = true;
        if (LLLII().LIZ != 0 || !C1444820nhY.LIZIZ || u4.LJIIIIZZ(LLLII().LIZJ)) {
            z = false;
        }
        c12w9.LIZ(recyclerView, view, new C12WE(z, C1462990oAr.LIZ(LLLII()), false), new InterfaceC19767112Vp() { // from class: X.12Vy
            @Override // X.InterfaceC19767112Vp
            public final void LIZ(int i, String str) throws Throwable {
                if (i == 10003) {
                    this.LIZ.LLLIL();
                    return;
                }
                C19767912Vx c19767912Vx = this.LIZ;
                C1664750tQH c1664750tQH2 = c19767912Vx.LLJILLL;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = C19767912Vx.LLJJJJLIIL;
                int iYQ2 = ((VideoEditViewModel) c1664750tQH2.getValue(c19767912Vx, interfaceC2217461BqaArr2[0])).yQ2(str);
                if (iYQ2 < 0) {
                    return;
                }
                C19767912Vx c19767912Vx2 = this.LIZ;
                ((CutMultiVideoViewModel) c19767912Vx2.LLJJI.getValue(c19767912Vx2, interfaceC2217461BqaArr2[2])).vQ2(i, iYQ2);
            }
        });
        RecyclerView recyclerView2 = this.LLJJJ;
        if (recyclerView2 == null) {
            recyclerView2 = null;
        }
        C12W6 c12w6 = (C12W6) recyclerView2.getAdapter();
        this.LLJJJJJIL = c12w6;
        if (c12w6 != null) {
            c12w6.LLIZ = (C386930FFb) this.LLJJIJIIJIL.getValue(this, interfaceC2217461BqaArr[5]);
        }
        C12W6 c12w62 = this.LLJJJJJIL;
        if ((c12w62 instanceof C12W5) && (c12w5 = (C12W5) c12w62) != null) {
            c12w5.LLJ = this;
        }
        LLLIILIL();
        BaseJediViewModel.iR2(LLLIIIIL(), this, new C2217381BqS() { // from class: X.12W1
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((EditAdjustClipsBottomViewState) obj).getDeleteVideoEvent();
            }
        }, new AwS608S0100000_29(this, 741));
        BaseJediViewModel.iR2(LLLIIIIL(), this, new C2217381BqS() { // from class: X.12W2
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((EditAdjustClipsBottomViewState) obj).getUpdateVideoEvent();
            }
        }, new AwS608S0100000_29(this, 742));
        BaseJediViewModel.iR2(LLLIIIIL(), this, new C2217381BqS() { // from class: X.12Vc
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((EditAdjustClipsBottomViewState) obj).getAddVideosEvent();
            }
        }, new AwS608S0100000_29(this, 743));
        BaseJediViewModel.iR2(LLLIIIIL(), this, new C2217381BqS() { // from class: X.12Vj
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((EditAdjustClipsBottomViewState) obj).isMusicSyncMode();
            }
        }, new AwS608S0100000_29(this, 744));
        BaseJediViewModel.iR2(LLLIIIIL(), this, new C2217381BqS() { // from class: X.12VR
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((EditAdjustClipsBottomViewState) obj).getRestoreEditEvent();
            }
        }, new AwS608S0100000_29(this, 739));
        BaseJediViewModel.iR2(LLLIIIIL(), this, new C2217381BqS() { // from class: X.12Ve
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((EditAdjustClipsBottomViewState) obj).getModeChangeEvent();
            }
        }, new AwS608S0100000_29(this, 740));
    }

    public C19767912Vx(C1DRG c1drg, C12VS c12vs) {
        super(c1drg, c12vs, R.id.i3k);
        this.LLJILJILJ = "MultiEditModeBottomScene";
        this.LLJILLL = C1664770tQJ.LIZ(this.LLJI, VideoEditViewModel.class, null);
        this.LLJJ = C1664770tQJ.LIZ(this.LLJI, C1463500oBg.class, null);
        this.LLJJI = C1664770tQJ.LIZ(this.LLJI, CutMultiVideoViewModel.class, null);
        this.LLJJIII = C1664770tQJ.LIZ(this.LLJI, C12VU.class, null);
        this.LLJJIJI = C1664770tQJ.LIZ(this.LLJI, EditAdjustClipsBottomViewModel.class, null);
        this.LLJJIJIIJIL = C1664770tQJ.LIZ(this.LLJI, C386930FFb.class, null);
    }

    @Override // com.bytedance.scene.Scene
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.t3, viewGroup, false);
    }
}
