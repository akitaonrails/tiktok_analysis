package X;

import Y.ARunnableS108S0100000_8;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter;
import com.ss.android.ugc.aweme.shortvideo.cut.model.CutVideoContext;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoEditViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoMultiBottomViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoPreviewViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.VEVideoCutterViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: renamed from: X.0gdB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1173030gdB extends AbstractC1173050gdD implements InterfaceC1166920gTK {
    public VECutVideoPresenter LLJJIJIIJIL;
    public C12X5 LLJJIJIL;
    public VideoEditViewModel LLJJJ;
    public CutVideoPreviewViewModel LLJJJIL;
    public final C01GW LLJJJJ = C452501pT.LIZIZ(new AwS562S0100000_18(this, 2630));
    public final C01GW LLJJJJJIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 2631));
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 2629));

    public final void LLLLIL() {
        List<VideoSegment> videoSegmentList;
        if (C530800Krm.LIZ(true)) {
            if (C523660KgG.LIZ() || LLLLIILL().LLLIIIIL().getMaxCutDuration() < 60000) {
                VideoEditViewModel videoEditViewModel = this.LLJJJ;
                if (videoEditViewModel == null) {
                    videoEditViewModel = null;
                }
                CutVideoContext value = videoEditViewModel.LLJJJJJIL.getValue();
                if (value == null || (videoSegmentList = value.getVideoSegmentList()) == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(videoSegmentList, 10));
                Iterator<VideoSegment> it2 = videoSegmentList.iterator();
                while (it2.hasNext()) {
                    arrayList.add(Long.valueOf(it2.next().duration));
                }
                if (C13LP.LJZL(arrayList) > 60000) {
                    HandlerHook.viewPost(LLLLIILL().LLLIIIIL(), new ARunnableS108S0100000_8(this, 129));
                }
            }
        }
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

    public final C19768212Wa LLLLIILL() {
        return (C19768212Wa) this.LLJJJJ.getValue();
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.LLJJJ = (VideoEditViewModel) ViewModelProviders.of((C19EG) this.mActivity).get(VideoEditViewModel.class);
        ViewModelProviders.of((C19EG) this.mActivity).get(VEVideoCutterViewModel.class);
        this.LLJJJIL = (CutVideoPreviewViewModel) C1659650tI3.LIZ((C19EG) this.mActivity).LIZ(CutVideoPreviewViewModel.class);
        show((Scene) this.LLJJJJLIIL.getValue());
        show(LLLLIILL());
        show((Scene) this.LLJJJJJIL.getValue());
        LLLLIL();
        C574750MgT c574750MgT = C574750MgT.LIZ;
        VideoEditViewModel videoEditViewModel = this.LLJJJ;
        if (videoEditViewModel == null) {
            videoEditViewModel = null;
        }
        List<VideoSegment> listZQ2 = videoEditViewModel.zQ2();
        c574750MgT.getClass();
        C574750MgT.LIZJ(listZQ2);
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        show((Scene) this.LLJJJJLIIL.getValue());
        show(LLLLIILL());
        show((Scene) this.LLJJJJJIL.getValue());
    }

    @Override // X.C11E9
    public final <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C1659650tI3.LIZ((C19EG) this.mActivity).LIZ(CutVideoViewModel.class);
        C1659650tI3.LIZ((C19EG) this.mActivity).LIZ(CutVideoListViewModel.class);
        C1659650tI3.LIZ((C19EG) this.mActivity).LIZ(CutVideoMultiBottomViewModel.class);
        C1659650tI3.LIZ((C19EG) this.mActivity).LIZ(CutVideoEditViewModel.class);
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.eng, viewGroup, false);
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
