package X;

import Y.ACListenerS163S0100000_29;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.ftc.components.sticker.core.FTCEditStickerViewModel;
import com.ss.android.ugc.aweme.ftc.components.volume.FTCEditVolumeState;
import com.ss.android.ugc.aweme.ftc.components.volume.FTCEditVolumeViewModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS643S0100000_29;

/* JADX INFO: renamed from: X.12XS, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12XS extends Scene implements InterfaceC1166920gTK, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJI;
    public final C1DRG LLJI;
    public final C1664750tQH LLJIJIL;
    public FTCEditStickerViewModel LLJILJIL;
    public FTCEditVolumeViewModel LLJILJILJ;
    public ViewGroup LLJILLL;
    public C12XT LLJJ;
    public final C01GW LLJJI = C1449630npJ.LIZ(this, InterfaceC1455860nzM.class);
    public FrameLayout LLJJIII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C12XS.class, "mModel", "getMModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIJI = new InterfaceC2217461Bqa[]{c2217381BqS};
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

    public final InterfaceC1455860nzM LLLII() {
        return (InterfaceC1455860nzM) this.LLJJI.getValue();
    }

    public final VideoPublishEditModel LLLIIIIL() {
        return (VideoPublishEditModel) this.LLJIJIL.getValue(this, LLJJIJI[0]);
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLJI;
    }

    public C12XS(C1DRG c1drg) {
        this.LLJI = c1drg;
        this.LLJIJIL = C1664770tQJ.LIZ(c1drg, VideoPublishEditModel.class, null);
    }

    public final void LLLIILIL(boolean z) {
        boolean enableMic;
        boolean z2;
        C12MC c12mc;
        C12MC c12mc2;
        C12XT c12xt = this.LLJJ;
        C12XT c12xt2 = null;
        if (c12xt == null) {
            c12xt = null;
        }
        float f = 100;
        int musicVolume = (int) (LLLIIIIL().getMusicVolume() * f);
        c12xt.LJII = musicVolume;
        if (c12xt.LJIIIZ && (c12mc2 = c12xt.LIZJ) != null) {
            c12mc2.setProgress(musicVolume);
        }
        C12XT c12xt3 = this.LLJJ;
        if (c12xt3 == null) {
            c12xt3 = null;
        }
        int voiceVolume = (int) (LLLIIIIL().getVoiceVolume() * f);
        c12xt3.LJIIIIZZ = voiceVolume;
        if (c12xt3.LJIIIZ && (c12mc = c12xt3.LIZIZ) != null) {
            c12mc.setProgress(voiceVolume);
        }
        boolean z3 = false;
        if ((LLLIIIIL().isFastImport() || LLLIIIIL().isCutSameVideoType() || LLLIIIIL().hasOriginalSound()) && !LLLIIIIL().isMuted()) {
            if (LLLIIIIL().isStitchMode()) {
                C12XT c12xt4 = this.LLJJ;
                if (c12xt4 == null) {
                    c12xt4 = null;
                }
                c12xt4.LIZ(true);
                StitchParams stitchParams = LLLIIIIL().getStitchParams();
                if (stitchParams != null) {
                    enableMic = stitchParams.getEnableMic();
                } else {
                    enableMic = true;
                }
                c12xt4.LIZIZ(enableMic);
            } else {
                C12XT c12xt5 = this.LLJJ;
                if (c12xt5 == null) {
                    c12xt5 = null;
                }
                if (LLLIIIIL().getMMusicPath() != null) {
                    z3 = true;
                }
                c12xt5.LIZ(z3);
                c12xt5.LIZIZ(true);
            }
        } else if (LLLIIIIL().isUseMusicBeforeEdit()) {
            C12XT c12xt6 = this.LLJJ;
            if (c12xt6 == null) {
                c12xt6 = null;
            }
            if (LLLIIIIL().getMMusicPath() != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            c12xt6.LIZ(z2);
            c12xt6.LIZIZ(false);
        } else {
            C12XT c12xt7 = this.LLJJ;
            if (c12xt7 == null) {
                c12xt7 = null;
            }
            c12xt7.LIZ(true);
            c12xt7.LIZIZ(false);
        }
        if (z) {
            C12XT c12xt8 = this.LLJJ;
            if (c12xt8 != null) {
                c12xt2 = c12xt8;
            }
            c12xt2.LIZLLL(true);
        }
        C1456140nzo.LIZIZ(LLLII(), false, false, false, false, 12);
    }

    @Override // com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        C12XT c12xt;
        C12XT c12xt2;
        C12XT c12xt3;
        int i;
        C12XT c12xt4;
        String string;
        View view;
        super.onActivityCreated(bundle);
        this.LLJILJILJ = (FTCEditVolumeViewModel) C1659640tI2.LIZLLL(this).LIZ(FTCEditVolumeViewModel.class);
        this.LLJILJIL = (FTCEditStickerViewModel) C1659640tI2.LIZLLL(this).LIZ(FTCEditStickerViewModel.class);
        this.LLJJ = new C12XT(LLLIIIIL());
        InterfaceC524950KiL interfaceC524950KiLLIZ = C0MWZ.LIZ(this);
        C12XT c12xt5 = this.LLJJ;
        FTCEditVolumeViewModel fTCEditVolumeViewModel = null;
        if (c12xt5 == null) {
            c12xt = null;
        } else {
            c12xt = c12xt5;
        }
        c12xt.LJI = (C19EG) this.mActivity;
        c12xt.LJIILIIL = interfaceC524950KiLLIZ;
        if (c12xt5 == null) {
            c12xt2 = null;
        } else {
            c12xt2 = c12xt5;
        }
        c12xt2.LJIILL = this.LLJJIII;
        if (c12xt5 == null) {
            c12xt3 = null;
        } else {
            c12xt3 = c12xt5;
        }
        ViewGroup viewGroup = this.LLJILLL;
        if (viewGroup == null) {
            viewGroup = null;
        }
        c12xt3.LIZ = viewGroup;
        if (c12xt5 == null) {
            c12xt5 = null;
        }
        boolean zIsMuted = LLLIIIIL().isMuted();
        c12xt5.getClass();
        if (zIsMuted) {
            i = 0;
        } else {
            i = 100;
        }
        c12xt5.LJIIIIZZ = i;
        C12XT c12xt6 = this.LLJJ;
        if (c12xt6 == null) {
            c12xt6 = null;
        }
        if (!c12xt6.LJIIIZ) {
            c12xt6.LJIILLIIL = false;
            View view2 = c12xt6.LIZ;
            if (view2 != null) {
                c12xt6.LIZIZ = (C12MC) view2.findViewById(R.id.ujf);
                c12xt6.LIZJ = (C12MC) c12xt6.LIZ.findViewById(R.id.ujg);
                c12xt6.LIZIZ.setDisplayPercent(true);
                c12xt6.LIZJ.setDisplayPercent(true);
                c12xt6.LIZLLL = (TextView) c12xt6.LIZ.findViewById(R.id.tv_people);
                c12xt6.LJ = (TextView) c12xt6.LIZ.findViewById(R.id.tv_people2);
                c12xt6.LJFF = c12xt6.LIZ.findViewById(R.id.lb_);
                c12xt6.LIZIZ.setMax(200);
                c12xt6.LIZJ.setMax(200);
            }
            C12MC c12mc = c12xt6.LIZJ;
            if (c12mc != null) {
                SeekBar.OnSeekBarChangeListener c12ym = new C12YM(c12xt6, 6);
                if (C1848410yCV.LIZ) {
                    c12ym = new C786820Utk(c12ym);
                }
                c12mc.setOnSeekBarChangeListener(c12ym);
                C12MC c12mc2 = c12xt6.LIZIZ;
                SeekBar.OnSeekBarChangeListener c12ym2 = new C12YM(c12xt6, 7);
                if (C1848410yCV.LIZ) {
                    c12ym2 = new C786820Utk(c12ym2);
                }
                c12mc2.setOnSeekBarChangeListener(c12ym2);
                View view3 = c12xt6.LJFF;
                if (view3 != null) {
                    C786410Ut5.I7(new ACListenerS163S0100000_29(c12xt6, 179), view3);
                }
                if (c12xt6.LJIILLIIL && (view = c12xt6.LJIILL) != null) {
                    C786410Ut5.I7(new ACListenerS163S0100000_29(c12xt6, 178), view);
                    View view4 = c12xt6.LIZ;
                    if (view4 != null) {
                        C786410Ut5.I7(new C0IJO(), view4);
                    }
                }
            }
            c12xt6.LJIIIZ = true;
        }
        C12XT c12xt7 = this.LLJJ;
        if (c12xt7 == null) {
            c12xt4 = null;
        } else {
            c12xt4 = c12xt7;
        }
        c12xt4.LJIIJJI = new C12XZ(this);
        if (c12xt7 == null) {
            c12xt7 = null;
        }
        c12xt7.LJIIL = new C12XU(this);
        FTCEditVolumeViewModel fTCEditVolumeViewModel2 = this.LLJILJILJ;
        if (fTCEditVolumeViewModel2 == null) {
            fTCEditVolumeViewModel2 = null;
        }
        selectNonNullSubscribe(fTCEditVolumeViewModel2, new C2217381BqS() { // from class: X.12XX
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((FTCEditVolumeState) obj).getMusicTitle();
            }
        }, new C1765020w20(), new AwS643S0100000_29(this, 96));
        FTCEditVolumeViewModel fTCEditVolumeViewModel3 = this.LLJILJILJ;
        if (fTCEditVolumeViewModel3 == null) {
            fTCEditVolumeViewModel3 = null;
        }
        selectNonNullSubscribe(fTCEditVolumeViewModel3, new C2217381BqS() { // from class: X.12XY
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((FTCEditVolumeState) obj).getVoiceTitle();
            }
        }, new C1765020w20(), new AwS643S0100000_29(this, 97));
        FTCEditVolumeViewModel fTCEditVolumeViewModel4 = this.LLJILJILJ;
        if (fTCEditVolumeViewModel4 == null) {
            fTCEditVolumeViewModel4 = null;
        }
        selectNonNullSubscribe(fTCEditVolumeViewModel4, new C2217381BqS() { // from class: X.12XW
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((FTCEditVolumeState) obj).getMusicVolume();
            }
        }, new C1765020w20(), new AwS643S0100000_29(this, 98));
        FTCEditVolumeViewModel fTCEditVolumeViewModel5 = this.LLJILJILJ;
        if (fTCEditVolumeViewModel5 == null) {
            fTCEditVolumeViewModel5 = null;
        }
        fTCEditVolumeViewModel5.ro(getString(2131824473));
        FTCEditVolumeViewModel fTCEditVolumeViewModel6 = this.LLJILJILJ;
        if (fTCEditVolumeViewModel6 != null) {
            fTCEditVolumeViewModel = fTCEditVolumeViewModel6;
        }
        if (LLLIIIIL().isStitchMode()) {
            string = getString(2131833277);
        } else {
            string = getString(2131837016);
        }
        fTCEditVolumeViewModel.Ei(string);
        LLLIILIL(false);
    }

    @Override // X.C11E9
    public final <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    @Override // com.bytedance.scene.Scene
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = (FrameLayout) C786410Ut5.Td(layoutInflater, R.layout.eq3, viewGroup, false);
        this.LLJJIII = frameLayout;
        this.LLJILLL = (ViewGroup) frameLayout.findViewById(R.id.nbl);
        return this.LLJJIII;
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
