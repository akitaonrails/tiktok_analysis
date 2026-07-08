package X;

import Y.AObserverS231S0100000_29;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.album.ImportVideoInfo;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoBottomBarState;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoBottomBarViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoEditState;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoEditViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoPreviewViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoState;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoTitleBarState;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoTitleBarViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS41S0010000_29;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS622S0100000_8;
import kotlin.jvm.internal.AwS643S0100000_29;

/* JADX INFO: renamed from: X.12Wb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19768312Wb extends AbstractC1173050gdD implements InterfaceC1166920gTK, C12X5, InterfaceC574500Mg4, C12V4 {
    public final CreativeInfo LLJJIJIIJIL;
    public CutVideoViewModel LLJJL;
    public VideoEditViewModel LLJJLIIIJLLLLLLLZ;
    public CutVideoTitleBarViewModel LLJL;
    public CutVideoBottomBarViewModel LLJLIL;
    public CutVideoListViewModel LLJLILLLLZIIL;
    public CutVideoEditViewModel LLJLL;
    public CutVideoPreviewViewModel LLJLLIL;
    public long LLJLLL;
    public boolean LLL;
    public long LLLF;
    public boolean LLLFF;
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 1009));
    public final C01GW LLJJJ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 1011));
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 2633));
    public final C01GW LLJJJJ = C452501pT.LIZIZ(new AwS562S0100000_18(this, 2632));
    public final C01GW LLJJJJJIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 1010));
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 1043));
    public final int LLJZ = 3600000;
    public final ArrayList<ImportVideoInfo> LLJZIJLIL = new ArrayList<>();

    @Override // X.InterfaceC574500Mg4
    public final void LJJLIIJ() {
    }

    @Override // X.InterfaceC574500Mg4
    public final LifecycleOwner LJLZ() {
        return this;
    }

    @Override // X.InterfaceC960503pD, X.C11E6
    public final LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.C11E9
    public final C11E6 getLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.C11DL
    public final InterfaceC874803bO getReceiver() {
        return this;
    }

    @Override // X.C11E9
    public final C11DL<InterfaceC960503pD> getReceiverHolder() {
        return this;
    }

    @Override // X.C11E9
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    @Override // X.C12X5
    public final InterfaceC19767412Vs LJIJJ() {
        CutVideoViewModel cutVideoViewModel = this.LLJJL;
        if (cutVideoViewModel == null) {
            cutVideoViewModel = null;
        }
        return cutVideoViewModel.mR2() ? LLLLIILL().LLLLIILL().LLLIIIIL() : ((C1173010gd9) this.LLJJJIL.getValue()).LLLLIILL().LLLIIIIL();
    }

    @Override // X.InterfaceC574500Mg4
    public final SurfaceView LJJII() {
        return ((C12WQ) this.LLJJIJIL.getValue()).LLLIILIL();
    }

    @Override // X.C12X5
    public final int LJJJJI() {
        return ((C12WQ) this.LLJJIJIL.getValue()).LLLIILIL().getMeasuredWidth();
    }

    @Override // X.C12X5
    public final int LJJLIIIIJ() {
        return ((C12WQ) this.LLJJIJIL.getValue()).LLLIILIL().getMeasuredHeight();
    }

    @Override // X.InterfaceC574500Mg4
    public final int LJJLIIIJ() {
        CutVideoEditViewModel cutVideoEditViewModel = this.LLJLL;
        if (cutVideoEditViewModel == null) {
            cutVideoEditViewModel = null;
        }
        return cutVideoEditViewModel.LLILZIL;
    }

    @Override // X.InterfaceC574500Mg4
    public final void LLILIL() {
        CutVideoViewModel cutVideoViewModel = this.LLJJL;
        if (cutVideoViewModel == null) {
            cutVideoViewModel = null;
        }
        if (cutVideoViewModel.mR2()) {
            CutVideoPreviewViewModel cutVideoPreviewViewModel = LLLLIILL().LLJJJIL;
            CutVideoPreviewViewModel cutVideoPreviewViewModel2 = cutVideoPreviewViewModel != null ? cutVideoPreviewViewModel : null;
            cutVideoPreviewViewModel2.getClass();
            cutVideoPreviewViewModel2.setState(AFwS273S0000000_29.get$arr$(378));
        }
    }

    @Override // X.InterfaceC574500Mg4
    public final void LLILL() {
        Activity activity = this.mActivity;
        if (activity != null) {
            activity.finish();
        }
    }

    @Override // X.InterfaceC574500Mg4
    public final C19EG LLJJIJI() {
        return (C19EG) this.mActivity;
    }

    public final C1173030gdB LLLLIILL() {
        return (C1173030gdB) this.LLJJJJ.getValue();
    }

    public final VECutVideoPresenter LLLLIL() {
        return (VECutVideoPresenter) this.LLJJJJLIIL.getValue();
    }

    @Override // X.InterfaceC574500Mg4
    public final void onFirstFrameRender() {
        CutVideoViewModel cutVideoViewModel = this.LLJJL;
        if (cutVideoViewModel == null) {
            cutVideoViewModel = null;
        }
        if (cutVideoViewModel.mR2()) {
            LLLLIILL().LLLLIILL().getClass();
        } else {
            ((C1173010gd9) this.LLJJJIL.getValue()).LLLLIILL().getClass();
        }
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C0LAB c0lab = new C0LAB();
        CutVideoViewModel cutVideoViewModel2 = this.LLJJL;
        if (cutVideoViewModel2 == null) {
            cutVideoViewModel2 = null;
        }
        c0lab.LJ("shoot_way", cutVideoViewModel2.lR2().LJIIJJI);
        c0lab.LJ("type", "1");
        CutVideoViewModel cutVideoViewModel3 = this.LLJJL;
        if (cutVideoViewModel3 == null) {
            cutVideoViewModel3 = null;
        }
        c0lab.LIZ(cutVideoViewModel3.lR2().LIZ.size(), "count");
        long jCurrentTimeMillis = System.currentTimeMillis();
        CutVideoViewModel cutVideoViewModel4 = this.LLJJL;
        c0lab.LIZIZ(jCurrentTimeMillis - (cutVideoViewModel4 != null ? cutVideoViewModel4 : null).lR2().LJJII, "duration");
        C2341909Fp.LIZ("tool_performance_video_clip_first_frame", c0lab.LIZ);
    }

    @Override // X.InterfaceC574500Mg4
    public final long LJJLIIIJJIZ() {
        return LJIJJ().getMaxCutDuration();
    }

    @Override // X.InterfaceC574500Mg4
    public final void LJLIL() {
        LJIJJ().LJ();
    }

    @Override // X.C12V4
    public final float LLIIJLIL() {
        return LJIJJ().getSelectedTime();
    }

    @Override // X.InterfaceC574500Mg4
    public final C0WIY<Long, Long> LLJILJIL() {
        return LJIJJ().getPlayBoundary();
    }

    @Override // com.bytedance.scene.Scene
    public final void onAttach() {
        super.onAttach();
        LLLLIL().LIZ((C19EG) requireActivity());
    }

    public C19768312Wb(CreativeInfo creativeInfo) {
        this.LLJJIJIIJIL = creativeInfo;
    }

    public static final void LLLLILI(boolean z) {
        C0MVY c0mvy;
        C194353111z c194353111z = C194353111z.LIZ;
        if (z) {
            c0mvy = C0MVY.SHOW;
        } else {
            c0mvy = C0MVY.DISMISS;
        }
        c194353111z.LIZIZ(1108, c0mvy, C0LD3.PROGRESS_WITH_MESSAGE, C0LEP.CLOSE_GONE);
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.LLJJLIIIJLLLLLLLZ = (VideoEditViewModel) ViewModelProviders.of((C19EG) this.mActivity).get(VideoEditViewModel.class);
        ViewModelProviders.of((C19EG) this.mActivity).get(CutMultiVideoViewModel.class);
        this.LLJL = (CutVideoTitleBarViewModel) C1659650tI3.LIZ((C19EG) this.mActivity).LIZ(CutVideoTitleBarViewModel.class);
        this.LLJLIL = (CutVideoBottomBarViewModel) C1659650tI3.LIZ((C19EG) this.mActivity).LIZ(CutVideoBottomBarViewModel.class);
        this.LLJLILLLLZIIL = (CutVideoListViewModel) C1659650tI3.LIZ((C19EG) this.mActivity).LIZ(CutVideoListViewModel.class);
        this.LLJLL = (CutVideoEditViewModel) C1659650tI3.LIZ((C19EG) this.mActivity).LIZ(CutVideoEditViewModel.class);
        this.LLJLLIL = (CutVideoPreviewViewModel) C1659650tI3.LIZ((C19EG) this.mActivity).LIZ(CutVideoPreviewViewModel.class);
        CutVideoViewModel cutVideoViewModel = this.LLJJL;
        CutVideoTitleBarViewModel cutVideoTitleBarViewModel = null;
        if (cutVideoViewModel == null) {
            cutVideoViewModel = null;
        }
        subscribeEvent(cutVideoViewModel, new C2217381BqS() { // from class: X.12Wh
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((CutVideoState) obj).getQuitEvent();
            }
        }, new C1765020w20(), new AwS622S0100000_8(this, 49));
        CutVideoViewModel cutVideoViewModel2 = this.LLJJL;
        if (cutVideoViewModel2 == null) {
            cutVideoViewModel2 = null;
        }
        subscribeEvent(cutVideoViewModel2, new C2217381BqS() { // from class: X.12Wk
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((CutVideoState) obj).getNextEvent();
            }
        }, new C1765020w20(), new AwS622S0100000_8(this, 50));
        VideoEditViewModel videoEditViewModel = this.LLJJLIIIJLLLLLLLZ;
        if (videoEditViewModel == null) {
            videoEditViewModel = null;
        }
        videoEditViewModel.LLJJIJIL.observe(this, new AObserverS231S0100000_29(this, 217));
        CutVideoBottomBarViewModel cutVideoBottomBarViewModel = this.LLJLIL;
        if (cutVideoBottomBarViewModel == null) {
            cutVideoBottomBarViewModel = null;
        }
        selectNonNullSubscribe(cutVideoBottomBarViewModel, new C2217381BqS() { // from class: X.12Wr
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((CutVideoBottomBarState) obj).getSelectTime();
            }
        }, new C1765020w20(), new AwS622S0100000_8(this, 51));
        CutVideoEditViewModel cutVideoEditViewModel = this.LLJLL;
        if (cutVideoEditViewModel == null) {
            cutVideoEditViewModel = null;
        }
        selectNonNullSubscribe(cutVideoEditViewModel, new C2217381BqS() { // from class: X.12Wn
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((CutVideoEditState) obj).isEditVideoLength();
            }
        }, new C1765020w20(), new AwS622S0100000_8(this, 52));
        CutVideoViewModel cutVideoViewModel3 = this.LLJJL;
        if (cutVideoViewModel3 == null) {
            cutVideoViewModel3 = null;
        }
        if (cutVideoViewModel3.lR2().LJIIZILJ.newVideoPipelineExtraModel.isNewVideoPipelineEnabled) {
            CutVideoTitleBarViewModel cutVideoTitleBarViewModel2 = this.LLJL;
            if (cutVideoTitleBarViewModel2 == null) {
                cutVideoTitleBarViewModel2 = null;
            }
            selectNonNullSubscribe(cutVideoTitleBarViewModel2, new C2217381BqS() { // from class: X.12X6
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((CutVideoTitleBarState) obj).getTopBarSpacing();
                }
            }, new C1765020w20(), new AwS643S0100000_29(this, 118));
        }
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null && bundle2.getBoolean("extra_is_effect_aigc_v2v")) {
            CutVideoBottomBarViewModel cutVideoBottomBarViewModel2 = this.LLJLIL;
            if (cutVideoBottomBarViewModel2 == null) {
                cutVideoBottomBarViewModel2 = null;
            }
            cutVideoBottomBarViewModel2.getClass();
            cutVideoBottomBarViewModel2.setState(new AwS41S0010000_29(false, 72));
            CutVideoTitleBarViewModel cutVideoTitleBarViewModel3 = this.LLJL;
            if (cutVideoTitleBarViewModel3 != null) {
                cutVideoTitleBarViewModel = cutVideoTitleBarViewModel3;
            }
            cutVideoTitleBarViewModel.getClass();
            cutVideoTitleBarViewModel.setState(new AwS41S0010000_29(67));
        }
    }

    public final void LLLLJ(String str, String str2) {
        long jLongValue;
        String string;
        String string2;
        C0WIY<Long, Long> playBoundary = LJIJJ().getPlayBoundary();
        Long l = playBoundary.LIZ;
        long jLongValue2 = 0;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        Long l2 = playBoundary.LIZIZ;
        if (l2 != null) {
            jLongValue2 = l2.longValue();
        }
        long j = jLongValue2 - jLongValue;
        long jCurrentTimeMillis = System.currentTimeMillis();
        CutVideoViewModel cutVideoViewModel = this.LLJJL;
        CutVideoViewModel cutVideoViewModel2 = null;
        if (cutVideoViewModel == null) {
            cutVideoViewModel = null;
        }
        long j2 = jCurrentTimeMillis - cutVideoViewModel.lR2().LJJII;
        Bundle bundle = this.mArguments;
        if (bundle != null) {
            string = bundle.getString("prop_trigger_type");
        } else {
            string = null;
        }
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            string2 = bundle2.getString("shoot_tab_name");
        } else {
            string2 = null;
        }
        CutVideoViewModel cutVideoViewModel3 = this.LLJJL;
        if (cutVideoViewModel3 == null) {
            cutVideoViewModel3 = null;
        }
        String creationId = cutVideoViewModel3.lR2().LJIILLIIL.getCreationId();
        CutVideoViewModel cutVideoViewModel4 = this.LLJJL;
        if (cutVideoViewModel4 != null) {
            cutVideoViewModel2 = cutVideoViewModel4;
        }
        String str3 = cutVideoViewModel2.lR2().LJIIJJI;
        C0LAB c0labLLLLJI = LLLLJI(j2, j, jLongValue, string, creationId, str3, string2);
        c0labLLLLJI.LJ("exit_method", str);
        C20684815ws.LJIILLIIL("ttcrt_ai_prop_video_trim_page_exit", c0labLLLLJI.LIZ);
        C0LAB c0labLLLLJI2 = LLLLJI(j2, j, jLongValue, string, creationId, str3, string2);
        c0labLLLLJI2.LJ("event_element", str2);
        C20684815ws.LJIILLIIL("ttcrt_ai_prop_video_trim_page_btn_click", c0labLLLLJI2.LIZ);
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (Build.VERSION.SDK_INT >= 35) {
            C14K9.LJIJJ(view, new C0TVI() { // from class: X.0xbU
                @Override // X.C0TVI
                public final C20246014Ju onApplyWindowInsets(View view2, C20246014Ju c20246014Ju) {
                    C20244914Jj c20244914JjLIZ = c20246014Ju.LIZ(7);
                    int i = c20244914JjLIZ.LIZLLL;
                    view2.setPadding(c20244914JjLIZ.LIZ, 0, c20244914JjLIZ.LIZJ, i);
                    C20246414Jy c20246414Jy = new C20246414Jy(c20246014Ju);
                    c20246414Jy.LIZ.LIZJ(7, C20244914Jj.LIZIZ(0, c20244914JjLIZ.LIZIZ, 0, c20244914JjLIZ.LIZLLL - i));
                    return c20246414Jy.LIZ();
                }
            });
        }
        this.LLJJL = (CutVideoViewModel) C1659650tI3.LIZ((C19EG) this.mActivity).LIZ(CutVideoViewModel.class);
        show((Scene) this.LLJJIJIL.getValue());
        show((Scene) this.LLJJJ.getValue());
        CutVideoViewModel cutVideoViewModel = this.LLJJL;
        if (cutVideoViewModel == null) {
            cutVideoViewModel = null;
        }
        if (cutVideoViewModel.mR2()) {
            show(LLLLIILL());
            show((Scene) this.LLJJJJJIL.getValue());
            LLLLIL().LLJILJIL = C19733712It.LIZIZ(true, false, false, false);
        } else {
            show((Scene) this.LLJJJIL.getValue());
            show((Scene) this.LLJJJJJIL.getValue());
        }
    }

    @Override // X.C11E9
    public final <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.eni, viewGroup, false);
    }

    @Override // X.C11E9
    public final <S extends C004I> InterfaceC420801kM subscribe(JediViewModel<S> jediViewModel, C1765020w20<S> c1765020w20, Function2<? super InterfaceC960503pD, ? super S, Unit> function2) {
        return C11EA.LJIIJJI(this, jediViewModel, c1765020w20, function2);
    }

    @Override // X.InterfaceC1166920gTK
    public final <S extends C004I, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function2<? super InterfaceC1166920gTK, ? super A, Unit> function2) {
        C1170060gYO.LIZIZ(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.C11E9
    public final <S extends C004I, A> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function2<? super InterfaceC960503pD, ? super A, Unit> function2) {
        return C11EA.LJI(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.InterfaceC1166920gTK
    public final <S extends C004I, A> void subscribeEvent(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends C0LCS<? extends A>> interfaceC2217241BqE, C1765020w20<C11EC<C0LCS<A>>> c1765020w20, Function2<? super InterfaceC1166920gTK, ? super A, Unit> function2) {
        C1170060gYO.LIZLLL(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1765020w20<C11EF<A, B>> c1765020w20, InterfaceC1631620sYq<? super InterfaceC960503pD, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C11EA.LJFF(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, c1765020w20, interfaceC1631620sYq);
    }

    @Override // X.C11E9
    public final <S extends C004I, T> InterfaceC420801kM asyncSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends AbstractC1252750ihl<? extends T>> interfaceC2217241BqE, C1765020w20<C11EC<AbstractC1252750ihl<T>>> c1765020w20, Function2<? super InterfaceC960503pD, ? super Throwable, Unit> function2, Function1<? super InterfaceC960503pD, Unit> function1, Function2<? super InterfaceC960503pD, ? super T, Unit> function22) {
        return C11EA.LIZ(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2, function1, function22);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B, C> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1765020w20<C1634100scq<A, B, C>> c1765020w20, InterfaceC1631630sYr<? super InterfaceC960503pD, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C11EA.LJ(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1765020w20, interfaceC1631630sYr);
    }

    public static final C0LAB LLLLJI(long j, long j2, long j3, String str, String str2, String str3, String str4) {
        C0LAB c0lab = new C0LAB();
        C574750MgT.LIZ.getClass();
        c0lab.LJ("prop_id", C574750MgT.LJIIJJI);
        c0lab.LJ("prop_resource_id", C574750MgT.LJIIL);
        c0lab.LJ("effect_source", C574750MgT.LJIILIIL);
        c0lab.LJ("is_ai_prop", C574750MgT.LJIILJJIL);
        c0lab.LJ("ai_prop_type", C574750MgT.LJIILL);
        c0lab.LJ("is_async", C574750MgT.LJIILLIIL);
        c0lab.LJ("sub_ai_prop_type", C574750MgT.LJIIZILJ);
        c0lab.LJ("ai_prop_model_name", C574750MgT.LJIJ);
        c0lab.LJ("tab_key", C574750MgT.LJIJI);
        c0lab.LJ("prop_selected_from", C574750MgT.LJIJJ);
        c0lab.LJ("is_default_prop", C574750MgT.LJIJJLI);
        c0lab.LJ("prop_trigger_type", str);
        c0lab.LJ("creation_id", str2);
        c0lab.LJ("shoot_way", str3);
        c0lab.LJ("shoot_tab_name", str4);
        c0lab.LIZIZ(j, "duration_ms");
        c0lab.LIZIZ(j2, "trim_to_length");
        c0lab.LIZIZ(j3, "trim_start_time_point");
        return c0lab;
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B, C, D> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1765020w20<C1644460stY<A, B, C, D>> c1765020w20, InterfaceC1685420txc<? super InterfaceC960503pD, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C11EA.LIZLLL(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1765020w20, interfaceC1685420txc);
    }
}
