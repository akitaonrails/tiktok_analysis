package X;

import Y.AObserverS231S0100000_29;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoBottomBarViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoPreviewViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoState;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoTitleBarViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.VEVideoCutterViewModel;
import com.ss.android.ugc.aweme.shortvideo.model.DuetAndStitchRouterConfig;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchIntroduceViewModel;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchState;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS622S0100000_8;
import kotlin.jvm.internal.AwS632S0100000_18;
import kotlin.jvm.internal.AwS643S0100000_29;

/* JADX INFO: renamed from: X.12Wf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19768712Wf extends AbstractC1173050gdD implements InterfaceC1166920gTK, C12X5, InterfaceC574500Mg4 {
    public final CreativeInfo LLJJIJIIJIL;
    public CutVideoViewModel LLJJIJIL;
    public CutVideoPreviewViewModel LLJJJ;
    public CutVideoTitleBarViewModel LLJJJIL;
    public VideoEditViewModel LLJJJJ;
    public StitchIntroduceViewModel LLJJJJJIL;
    public VEVideoCutterViewModel LLJJJJLIIL;
    public ProgressDialogC1397800mTi LLJJL;
    public long LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 909));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 910));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 2539));
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 2540));
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 950));

    @Override // X.InterfaceC574500Mg4
    public final int LJJLIIIJ() {
        return 0;
    }

    @Override // X.InterfaceC574500Mg4
    public final void LJJLIIJ() {
    }

    @Override // X.InterfaceC574500Mg4
    public final LifecycleOwner LJLZ() {
        return this;
    }

    @Override // X.InterfaceC574500Mg4
    public final void LLILIL() {
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

    @Override // X.InterfaceC574500Mg4
    public final SurfaceView LJJII() {
        return ((C12WQ) this.LLJL.getValue()).LLLIILIL();
    }

    @Override // X.C12X5
    public final int LJJJJI() {
        return ((C12WQ) this.LLJL.getValue()).LLLIILIL().getMeasuredWidth();
    }

    @Override // X.C12X5
    public final int LJJLIIIIJ() {
        return ((C12WQ) this.LLJL.getValue()).LLLIILIL().getMeasuredHeight();
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

    public final C1173000gd8 LLLLIILL() {
        return (C1173000gd8) this.LLJLILLLLZIIL.getValue();
    }

    public final VECutVideoPresenter LLLLIL() {
        return (VECutVideoPresenter) this.LLJLLIL.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [X.0MTo] */
    /* JADX WARN: Type inference failed for: r21v0, types: [android.content.Intent] */
    /* JADX WARN: Type inference failed for: r2v11, types: [android.os.Parcelable] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v16 */
    public final void LLLLILI() {
        CutVideoViewModel cutVideoViewModel;
        if (C19712912At.LIZ.LIZJ()) {
            C201955140j.LJ("stitch trim end, go to shoot fail, App in background");
            return;
        }
        ?? intent = new Intent();
        intent.putExtra("shoot_mode", 12);
        CutVideoViewModel cutVideoViewModel2 = this.LLJJIJIL;
        if (cutVideoViewModel2 == null) {
            cutVideoViewModel2 = null;
        }
        StitchParams stitchParams = cutVideoViewModel2.lR2().LJJIFFI;
        if (stitchParams == null) {
            stitchParams = new StitchParams(null, null, null, null, 0, false, null, null, null, null, 0L, null, null, true, false, 0L, 0L, 0, false, new ArrayList(), new ArrayList(), false, 0, 0L);
        }
        Long l = LJIJJ().getPlayBoundary().LIZ;
        stitchParams.setStartTime(l != null ? l.longValue() : 0L);
        Long l2 = LJIJJ().getPlayBoundary().LIZIZ;
        stitchParams.setEndTime(l2 != null ? l2.longValue() : 0L);
        if (stitchParams.isPGCMusic()) {
            String creationId = this.LLJJIJIIJIL.getCreationId();
            if (creationId == null) {
                creationId = "";
            }
            long duration = stitchParams.getDuration();
            long leftSeekingValue = LLLLIILL().LJIJJ().getLeftSeekingValue();
            boolean z = stitchParams.getMusicStart() >= 0;
            C0MNM c0mnm = C0MNM.LIZ;
            C0LAB c0lab = new C0LAB();
            c0lab.LJ("shoot_way", "stitch");
            c0lab.LJ("enter_from", "video_stitch_page");
            c0lab.LJ("creation_id", creationId);
            c0lab.LJ("content_source", "shoot");
            c0lab.LJ("content_type", "video");
            c0lab.LJ("pgc_stitched", z ? "1" : CardStruct.IStatusCode.DEFAULT);
            c0lab.LIZIZ(duration, "duration");
            c0lab.LIZIZ(leftSeekingValue, "duration_begin_at");
            C20684815ws.LJIILLIIL("stitch_next", c0lab.LIZ);
        } else {
            String creationId2 = this.LLJJIJIIJIL.getCreationId();
            if (creationId2 == null) {
                creationId2 = "";
            }
            long duration2 = stitchParams.getDuration();
            long leftSeekingValue2 = LLLLIILL().LJIJJ().getLeftSeekingValue();
            C0MNM c0mnm2 = C0MNM.LIZ;
            C0LAB c0lab2 = new C0LAB();
            c0lab2.LJ("shoot_way", "stitch");
            c0lab2.LJ("enter_from", "video_stitch_page");
            c0lab2.LJ("creation_id", creationId2);
            c0lab2.LJ("content_source", "shoot");
            c0lab2.LJ("content_type", "video");
            c0lab2.LIZIZ(duration2, "duration");
            c0lab2.LIZIZ(leftSeekingValue2, "duration_begin_at");
            C20684815ws.LJIILLIIL("stitch_next", c0lab2.LIZ);
        }
        if (!stitchParams.isPGCMusic() || stitchParams.getMusicStart() < 0) {
            cutVideoViewModel = null;
            C1452640nuA.LJI(null);
        } else {
            cutVideoViewModel = null;
        }
        intent.putExtra("enter_from", "video_stitch_page");
        intent.putExtra("music_origin", "stitch");
        C537520L6g.LIZLLL(intent, this.LLJJIJIIJIL);
        intent.putExtra("shoot_way", "stitch");
        intent.putExtra("content_type", "video");
        intent.putExtra("content_source", "shoot");
        intent.putExtra("stitch_params", stitchParams);
        intent.putExtra("enter_record_from_feed", stitchParams.getEnterRecordFromFeed());
        long j = this.LLJJLIIIJLLLLLLLZ;
        if (j > 0) {
            intent.putExtra("extra_duet_stitch_click_time", j);
        }
        if (((Boolean) C0A79.LIZ.getValue()).booleanValue() && C275780ArQ.LIZJ()) {
            CutVideoViewModel cutVideoViewModel3 = this.LLJJIJIL;
            if (cutVideoViewModel3 == null) {
                cutVideoViewModel3 = cutVideoViewModel;
            }
            AIGCInfo aIGCInfo = cutVideoViewModel3.lR2().LJIIZILJ.stitchModel.aigcInfo;
            boolean z2 = aIGCInfo instanceof Parcelable;
            ?? r2 = aIGCInfo;
            if (!z2) {
                r2 = cutVideoViewModel;
            }
            intent.putExtra("stitch_aigc_info", r2);
        }
        CutVideoViewModel cutVideoViewModel4 = this.LLJJIJIL;
        if (cutVideoViewModel4 == null) {
            cutVideoViewModel4 = cutVideoViewModel;
        }
        DuetAndStitchRouterConfig duetAndStitchRouterConfig = cutVideoViewModel4.lR2().LJIIZILJ.initialModel.duetAndStitchRouterConfig;
        if (duetAndStitchRouterConfig != null) {
            intent.putExtra("duet_and_stitch_router_config", duetAndStitchRouterConfig);
        }
        intent.putExtra("aweme_music", stitchParams.getMusic());
        Activity activity = this.mActivity;
        if (activity != null) {
            C1660680tJi.LIZ().LIZIZ(activity, intent);
        }
    }

    public final void LLLLJI() {
        if (!(((Boolean) C0A79.LIZ.getValue()).booleanValue() && C275780ArQ.LIZJ())) {
            CutVideoTitleBarViewModel cutVideoTitleBarViewModel = this.LLJJJIL;
            (cutVideoTitleBarViewModel != null ? cutVideoTitleBarViewModel : null).lR2(true);
            C0FNU.LIZ(this.LLJJL);
            LLLLJ(false);
            LLLLILI();
            return;
        }
        CutVideoViewModel cutVideoViewModel = this.LLJJIJIL;
        if (cutVideoViewModel == null) {
            cutVideoViewModel = null;
        }
        StitchParams stitchParams = cutVideoViewModel.lR2().LJJIFFI;
        if (stitchParams == null) {
            stitchParams = new StitchParams(null, null, null, null, 0, false, null, null, null, null, 0L, null, null, true, false, 0L, 0L, 0, false, new ArrayList(), new ArrayList(), false, 0, 0L);
        }
        MediaModel mediaModel = new MediaModel((String) null);
        mediaModel.type = 4;
        mediaModel.relativePath = stitchParams.getVideoPath();
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C574420Mfw(mediaModel, this, stitchParams, null), 3);
    }

    @Override // X.C12X5
    public final InterfaceC19767412Vs LJIJJ() {
        return LLLLIILL().LJIJJ();
    }

    @Override // X.InterfaceC574500Mg4
    public final long LJJLIIIJJIZ() {
        return LLLLIILL().LJIJJ().getMaxCutDuration();
    }

    @Override // X.InterfaceC574500Mg4
    public final void LJLIL() {
        LLLLIILL().LJIJJ().LJ();
    }

    @Override // X.InterfaceC574500Mg4
    public final C0WIY<Long, Long> LLJILJIL() {
        return LLLLIILL().LJIJJ().getPlayBoundary();
    }

    @Override // com.bytedance.scene.Scene
    public final void onAttach() {
        super.onAttach();
        LLLLIL().LIZ((C19EG) requireActivity());
    }

    @Override // X.InterfaceC574500Mg4
    public final void onFirstFrameRender() {
        LLLLIILL().LLLLIILL().getClass();
    }

    @Override // com.bytedance.scene.Scene
    public final void onResume() {
        super.onResume();
        if (C574740MgS.LIZ.getBoolean("stitch_introduce_shown", false)) {
            StitchIntroduceViewModel stitchIntroduceViewModel = this.LLJJJJJIL;
            (stitchIntroduceViewModel != null ? stitchIntroduceViewModel : null).lR2();
        } else {
            StitchIntroduceViewModel stitchIntroduceViewModel2 = this.LLJJJJJIL;
            StitchIntroduceViewModel stitchIntroduceViewModel3 = stitchIntroduceViewModel2 != null ? stitchIntroduceViewModel2 : null;
            stitchIntroduceViewModel3.getClass();
            stitchIntroduceViewModel3.setState(AFwS273S0000000_29.get$arr$(344));
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onStop() {
        super.onStop();
    }

    public C19768712Wf(CreativeInfo creativeInfo) {
        this.LLJJIJIIJIL = creativeInfo;
    }

    public static final void LLLLJ(boolean z) {
        C0MVY c0mvy;
        C194353111z c194353111z = C194353111z.LIZ;
        if (z) {
            c0mvy = C0MVY.SHOW;
        } else {
            c0mvy = C0MVY.DISMISS;
        }
        c194353111z.LIZIZ(1109, c0mvy, C0LD3.PROGRESS_WITH_MESSAGE, C0LEP.CLOSE_GONE);
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        ViewModelProviders.of((C19EG) this.mActivity).get(CutMultiVideoViewModel.class);
        this.LLJJJ = (CutVideoPreviewViewModel) C1659650tI3.LIZ((C19EG) this.mActivity).LIZ(CutVideoPreviewViewModel.class);
        this.LLJJJIL = (CutVideoTitleBarViewModel) C1659650tI3.LIZ((C19EG) this.mActivity).LIZ(CutVideoTitleBarViewModel.class);
        C1659650tI3.LIZ((C19EG) this.mActivity).LIZ(CutVideoBottomBarViewModel.class);
        VideoEditViewModel videoEditViewModel = (VideoEditViewModel) ViewModelProviders.of((C19EG) this.mActivity).get(VideoEditViewModel.class);
        this.LLJJJJ = videoEditViewModel;
        VideoEditViewModel videoEditViewModel2 = null;
        if (videoEditViewModel == null) {
            videoEditViewModel = null;
        }
        videoEditViewModel.LL = true;
        this.LLJJJJJIL = (StitchIntroduceViewModel) C1659650tI3.LIZ((C19EG) this.mActivity).LIZ(StitchIntroduceViewModel.class);
        this.LLJJJJLIIL = (VEVideoCutterViewModel) ViewModelProviders.of((C19EG) this.mActivity).get(VEVideoCutterViewModel.class);
        CutVideoViewModel cutVideoViewModel = this.LLJJIJIL;
        if (cutVideoViewModel == null) {
            cutVideoViewModel = null;
        }
        subscribeEvent(cutVideoViewModel, new C2217381BqS() { // from class: X.12Wj
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((CutVideoState) obj).getQuitEvent();
            }
        }, new C1765020w20(), new AwS632S0100000_18(this, 250));
        CutVideoViewModel cutVideoViewModel2 = this.LLJJIJIL;
        if (cutVideoViewModel2 == null) {
            cutVideoViewModel2 = null;
        }
        subscribeEvent(cutVideoViewModel2, new C2217381BqS() { // from class: X.12Wl
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((CutVideoState) obj).getNextEvent();
            }
        }, new C1765020w20(), new AwS622S0100000_8(this, 44));
        StitchIntroduceViewModel stitchIntroduceViewModel = this.LLJJJJJIL;
        if (stitchIntroduceViewModel == null) {
            stitchIntroduceViewModel = null;
        }
        subscribeEvent(stitchIntroduceViewModel, new C2217381BqS() { // from class: X.12Wp
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((StitchState) obj).getShowIntroduceEvent();
            }
        }, new C1765020w20(), new AwS643S0100000_29(this, 99));
        StitchIntroduceViewModel stitchIntroduceViewModel2 = this.LLJJJJJIL;
        if (stitchIntroduceViewModel2 == null) {
            stitchIntroduceViewModel2 = null;
        }
        subscribeEvent(stitchIntroduceViewModel2, new C2217381BqS() { // from class: X.12Wq
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((StitchState) obj).getHideIntroduceEvent();
            }
        }, new C1765020w20(), new AwS643S0100000_29(this, 100));
        StitchIntroduceViewModel stitchIntroduceViewModel3 = this.LLJJJJJIL;
        if (stitchIntroduceViewModel3 == null) {
            stitchIntroduceViewModel3 = null;
        }
        subscribeEvent(stitchIntroduceViewModel3, new C2217381BqS() { // from class: X.12Wi
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((StitchState) obj).getQuitEvent();
            }
        }, new C1765020w20(), new AwS622S0100000_8(this, 43));
        VideoEditViewModel videoEditViewModel3 = this.LLJJJJ;
        if (videoEditViewModel3 == null) {
            videoEditViewModel3 = null;
        }
        videoEditViewModel3.LLIZLLLIL.observe(this, new AObserverS231S0100000_29(this, 162));
        VideoEditViewModel videoEditViewModel4 = this.LLJJJJ;
        if (videoEditViewModel4 != null) {
            videoEditViewModel2 = videoEditViewModel4;
        }
        videoEditViewModel2.LLJIJIL.observe(this, new AObserverS231S0100000_29(this, 163));
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (Build.VERSION.SDK_INT >= 35) {
            C14K9.LJIJJ(view, new C0TVI() { // from class: X.0xbV
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
        this.LLJJIJIL = (CutVideoViewModel) C1659650tI3.LIZ((C19EG) this.mActivity).LIZ(CutVideoViewModel.class);
        show((Scene) this.LLJL.getValue());
        show((Scene) this.LLJLIL.getValue());
        show(LLLLIILL());
    }

    @Override // X.C11E9
    public final <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.erj, viewGroup, false);
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

    @Override // X.C11E9
    public final <S extends C004I, A, B, C, D> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1765020w20<C1644460stY<A, B, C, D>> c1765020w20, InterfaceC1685420txc<? super InterfaceC960503pD, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C11EA.LIZLLL(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1765020w20, interfaceC1685420txc);
    }
}
