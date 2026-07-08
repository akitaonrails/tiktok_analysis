package X;

import Y.AObserverS223S0100000_19;
import Y.AObserverS225S0100000_22;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.ftc.components.toolbar.FTCEditToolbarState;
import com.ss.android.ugc.aweme.ftc.components.toolbar.FTCEditToolbarViewModel;
import com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.zhiliaoapp.musically.R;
import irm.AkS90S0100000_22;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS636S0100000_22;

/* JADX INFO: renamed from: X.0oD7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1464390oD7 extends Scene implements InterfaceC1166920gTK, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public final C1DRG LLJI;
    public ConstraintLayout LLJIJIL;
    public final C1664750tQH LLJILJILJ;
    public ImageView LLJILLL;
    public TextView LLJJ;
    public ViewGroup LLJJI;
    public C1464400oD8 LLJJIJI;
    public C1464310oCz LLJJIJIIJIL;
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 888));
    public final Map<Integer, View> LLJJIII = new LinkedHashMap();
    public final C01GW LLJJIJIL = C1449630npJ.LIZ(this, InterfaceC1455860nzM.class);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1464390oD7.class, "mModel", "getMModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
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

    public final FTCEditToolbarViewModel LLLII() {
        return (FTCEditToolbarViewModel) this.LLJILJIL.getValue();
    }

    public final VideoPublishEditModel LLLIIIIL() {
        return (VideoPublishEditModel) this.LLJILJILJ.getValue(this, LLJJJ[0]);
    }

    @Override // com.bytedance.scene.Scene
    public final void onDestroyView() {
        super.onDestroyView();
        C1464310oCz c1464310oCz = this.LLJJIJIIJIL;
        if (c1464310oCz != null) {
            c1464310oCz.LIZ();
        }
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLJI;
    }

    public C1464390oD7(C1DRG c1drg) {
        this.LLJI = c1drg;
        this.LLJILJILJ = C1664770tQJ.LIZ(c1drg, VideoPublishEditModel.class, null);
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        int size;
        boolean z;
        int i;
        boolean z2;
        ArrayList<String> arrayList;
        super.onViewCreated(view, bundle);
        ImageView imageView = (ImageView) requireViewById(R.id.bmy);
        this.LLJILLL = imageView;
        TextView textView = null;
        if (imageView == null) {
            imageView = null;
        }
        imageView.setImageResource(R.drawable.bx6);
        ImageView imageView2 = this.LLJILLL;
        if (imageView2 == null) {
            imageView2 = null;
        }
        C786410Ut5.Q7(imageView2, new AkS90S0100000_22(this, 26));
        TextView textView2 = (TextView) requireViewById(R.id.z_y);
        this.LLJJ = textView2;
        if (textView2 != null) {
            textView = textView2;
        }
        C786410Ut5.T7(textView, new AkS90S0100000_22(this, 27));
        this.LLJJI = (ViewGroup) requireViewById(R.id.mgz);
        selectNonNullSubscribe(LLLII(), new C2217381BqS() { // from class: X.0oDA
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((FTCEditToolbarState) obj).getBackVisible();
            }
        }, new C1765020w20(), new AwS636S0100000_22(this, 47));
        selectNonNullSubscribe(LLLII(), new C2217381BqS() { // from class: X.0oDB
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((FTCEditToolbarState) obj).getBackTipVisible();
            }
        }, new C1765020w20(), new AwS636S0100000_22(this, 48));
        selectNonNullSubscribe(LLLII(), new C2217381BqS() { // from class: X.0oDE
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((FTCEditToolbarState) obj).getBackTipText();
            }
        }, new C1765020w20(), new AwS636S0100000_22(this, 49));
        selectNonNullSubscribe(LLLII(), new C2217381BqS() { // from class: X.0oDF
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((FTCEditToolbarState) obj).getTitleBarItems();
            }
        }, new C1765020w20(), new AwS636S0100000_22(this, 50));
        subscribeEvent(LLLII(), new C2217381BqS() { // from class: X.0oDC
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((FTCEditToolbarState) obj).getHideMoreEvent();
            }
        }, new C1765020w20(), new AwS636S0100000_22(this, 45));
        LLLII().lR2().observe(C372650EjH.LIZIZ(this), new AObserverS223S0100000_19(this, 64));
        selectNonNullSubscribe(LLLII(), new C2217381BqS() { // from class: X.0oD9
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((FTCEditToolbarState) obj).getTopMargin();
            }
        }, new C1765020w20(), new AwS636S0100000_22(this, 46));
        ArrayList arrayList2 = new ArrayList();
        MvCreateVideoData mvCreateVideoData = LLLIIIIL().getMvCreateVideoData();
        boolean z3 = false;
        if (mvCreateVideoData != null && (arrayList = mvCreateVideoData.selectMediaList) != null) {
            size = arrayList.size();
        } else {
            size = 0;
        }
        if (size > 1) {
            z = true;
        } else {
            z = false;
        }
        if ("slideshow".equals(C1428470nHB.LJIILL(LLLIIIIL())) && z && C1459840o5m.LIZ() && !C1429350nIb.LIZ) {
            i = -1;
            arrayList2.add(new C1460620o72(5, -1, R.string.jlc, (String) null, R.raw.icon_camera_filter_fill, (Function1) null, false, 0, (EnumC1462540oA8) null, (C1659490tHn) null, false, 0, 8168));
            LLLII().sR2(arrayList2);
        } else {
            if (!C1429350nIb.LIZ) {
                arrayList2.add(new C1460620o72(5, -1, R.string.jlc, (String) null, R.raw.icon_camera_filter_fill, (Function1) null, false, 0, (EnumC1462540oA8) null, (C1659490tHn) null, false, 0, 8168));
            }
            if (C1428470nHB.LJJJLZIJ(LLLIIIIL())) {
                arrayList2.add(new C1460620o72(15, -1, 2131833230, (String) null, R.raw.icon_video_play_split_fill, (Function1) null, false, 0, (EnumC1462540oA8) null, (C1659490tHn) null, false, 0, 8168));
            }
            if (C1428520nHG.LJIIJJI(LLLIIIIL())) {
                arrayList2.add(new C1460620o72(6, -1, 2131826991, (String) null, R.raw.icon_audio_editing, (Function1) null, false, 0, (EnumC1462540oA8) null, (C1659490tHn) null, false, 0, 8168));
            }
            if (u4.LJI(LLLIIIIL())) {
                arrayList2.add(new C1460620o72(10, -1, 2131829849, (String) null, R.raw.icon_mic_fill, (Function1) null, false, 0, (EnumC1462540oA8) null, (C1659490tHn) null, false, 0, 8168));
            }
            arrayList2.add(new C1460620o72(8, R.drawable.c56, 2131830418, (String) null, 0, (Function1) null, false, 0, (EnumC1462540oA8) null, (C1659490tHn) null, false, 0, 8184));
            i = -1;
            z3 = false;
            arrayList2.add(new C1460620o72(7, -1, 2131848616, (String) null, R.raw.icon_speaker_2_fill_ltr, (Function1) null, false, 0, (EnumC1462540oA8) null, (C1659490tHn) null, false, 0, 8168));
            LLLII().sR2(arrayList2);
        }
        if (LLLIIIIL().mIsFromDraft) {
            if (LLLIIIIL().isUploadVideo()) {
                LLLII().zz0(z3);
            } else {
                LLLII().zz0(true);
            }
            if (LLLIIIIL().isPhotoMvMode() && LLLIIIIL().getOriginal() == 1) {
                LLLII().zz0(true);
                LLLII().Hp1(this.mActivity.getResources().getString(2131829990));
            }
        }
        if (C1428520nHG.LJIIIIZZ(LLLIIIIL())) {
            AudioRecorderParam veAudioRecorderParam = LLLIIIIL().getVeAudioRecorderParam();
            if (veAudioRecorderParam != null && veAudioRecorderParam.hasRecord()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                LLLII().tR2(6, true);
            } else {
                LLLII().tR2(6, z3);
            }
        }
        if (LLLIIIIL().getMMusicPath() != null) {
            z3 = true;
        }
        LLLII().Uh1(8, z3);
        ((InterfaceC1455860nzM) this.LLJJIJIL.getValue()).g().observe(C372650EjH.LIZIZ(this), new AObserverS225S0100000_22(this, 166));
        if (!C1428520nHG.LJIIJJI(LLLIIIIL())) {
            C1459710o5Z.LIZLLL(i, "voice");
        } else {
            C1459710o5Z.LIZLLL(C1459710o5Z.LJI, "voice");
        }
    }

    @Override // X.C11E9
    public final <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    @Override // com.bytedance.scene.Scene
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ConstraintLayout constraintLayout = (ConstraintLayout) C786410Ut5.Td(layoutInflater, R.layout.eq2, viewGroup, false);
        this.LLJIJIL = constraintLayout;
        return constraintLayout;
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
