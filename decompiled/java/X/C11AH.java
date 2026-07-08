package X;

import Y.ARunnableS40S0101000_29;
import android.content.ContentResolver;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.Settings;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ftc.countdown.FTCCountdownState;
import com.ss.android.ugc.aweme.shortvideo.AVMusicWaveBean;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.11AH, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11AH extends C19A3 implements InterfaceC1166920gTK {
    public final C11AL LLJILLL;
    public C11AS LLJJ;
    public C11AR LLJJI;
    public int LLJJIII;
    public int LLJJIJIIJIL;
    public C194303110b LLJJIJIL;
    public long LLJJIJI = 15000;
    public final C11AK LLJJJ = new C11A5() { // from class: X.11AK
        @Override // X.C11A5
        public final void onSwitch(int i) {
            this.LIZ.LLJILLL.LIZJ(i);
        }
    };
    public final C11AO LLJJJIL = new C11A6() { // from class: X.11AO
        @Override // X.C11A6
        public final void LIZ() {
            C11AS c11as = this.LIZ.LLJJ;
            if (c11as != null) {
                c11as.LIZ();
            }
        }

        @Override // X.C11A6
        public final void LIZJ(int i, int i2) {
            String str;
            C11AH c11ah = this.LIZ;
            c11ah.LLJJIJIIJIL = i2;
            c11ah.LLJJIII = (int) Math.min(c11ah.LLJJIJI, i);
            C11AR c11ar = this.LIZ.LLJJI;
            if (c11ar != null) {
                c11ar.LLILZIL = i2;
                c11ar.LLILZLL = true;
                c11ar.LL.LIZJ();
                C1295960jpS c1295960jpS = (C1295960jpS) C786410Ut5.Td(C786410Ut5.ne(c11ar.LLILLL.getContext()), R.layout.fvf, c11ar.LLILLL, false);
                c11ar.LLILZ = c1295960jpS;
                c11ar.LLILLL.addView(c1295960jpS);
                c11ar.LLILZ.setIgnoreDisabledSystemAnimations(true);
                c11ar.LLILZ.removeAllAnimatorListeners();
                c11ar.LLILZ.addAnimatorListener(c11ar);
                C1295960jpS c1295960jpS2 = c11ar.LLILZ;
                if (i2 == 3) {
                    str = "countdown_3_lottie.json";
                } else {
                    str = "countdown_10_lottie.json";
                }
                c1295960jpS2.setAnimation(str);
                c11ar.LLILZ.playAnimation();
                C786410Ut5.LLD(0, c11ar.LLILZ);
                ContentResolver contentResolver = c11ar.LLILLL.getContext().getContentResolver();
                if (contentResolver != null) {
                    float f = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
                    float f2 = Settings.Global.getFloat(contentResolver, "transition_animation_scale", 1.0f);
                    float f3 = Settings.Global.getFloat(contentResolver, "window_animation_scale", 1.0f);
                    C201967140v c201967140v = C201967140v.LIZIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("anim_duration_scale =");
                    sbLIZ.append(f);
                    C201955140j.LIZJ(c201967140v, C2188811AlT.LIZIZ(sbLIZ));
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("transition_anim_scale =");
                    sbLIZ2.append(f2);
                    C201955140j.LIZJ(c201967140v, C2188811AlT.LIZIZ(sbLIZ2));
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("window_anim_scale =");
                    sbLIZ3.append(f3);
                    C201955140j.LIZJ(c201967140v, C2188811AlT.LIZIZ(sbLIZ3));
                }
            }
        }

        @Override // X.C11A6
        public final void LIZIZ(int i, int i2, String str) {
            if (str != null) {
                C11AH c11ah = this.LIZ;
                if (c11ah.mActivity != null) {
                    C11AS c11as = c11ah.LLJJ;
                    if (c11as != null) {
                        c11as.LIZ();
                    }
                    C11AH c11ah2 = this.LIZ;
                    c11ah2.LLJJ = new C11AS(c11ah2.requireActivity(), UriProtector.parse(str));
                    C11AH c11ah3 = this.LIZ;
                    C11AS c11as2 = c11ah3.LLJJ;
                    if (c11as2 != null) {
                        c11as2.LIZJ = new C19456511Ad(c11ah3);
                        MediaPlayer mediaPlayer = c11as2.LIZ;
                        if (mediaPlayer != null) {
                            mediaPlayer.seekTo(i);
                            c11as2.LIZ.start();
                            ARunnableS40S0101000_29 aRunnableS40S0101000_29 = new ARunnableS40S0101000_29(c11as2, i2, 5);
                            c11as2.LIZLLL = aRunnableS40S0101000_29;
                            C786410Ut5.LJJZZIII(c11as2.LIZIZ, aRunnableS40S0101000_29);
                        }
                    }
                }
            }
        }
    };

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

    @Override // com.bytedance.scene.Scene
    public final void onPause() {
        C1295960jpS c1295960jpS;
        MediaPlayer mediaPlayer;
        super.onPause();
        C11AS c11as = this.LLJJ;
        if (c11as != null && (mediaPlayer = c11as.LIZ) != null) {
            try {
                mediaPlayer.pause();
                ARunnableS40S0101000_29 aRunnableS40S0101000_29 = c11as.LIZLLL;
                if (aRunnableS40S0101000_29 != null) {
                    c11as.LIZIZ.removeCallbacks(aRunnableS40S0101000_29);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        C11AR c11ar = this.LLJJI;
        if (c11ar != null && (c1295960jpS = c11ar.LLILZ) != null && c11ar.LLILLL != null && c1295960jpS.isAnimating()) {
            c11ar.LLILZ.cancelAnimation();
            C786410Ut5.LLD(8, c11ar.LLILZ);
        }
        C194303110b c194303110b = this.LLJJIJIL;
        if (c194303110b != null) {
            c194303110b.release();
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onResume() {
        MediaPlayer mediaPlayer;
        super.onResume();
        C11AS c11as = this.LLJJ;
        if (c11as == null || (mediaPlayer = c11as.LIZ) == null) {
            return;
        }
        try {
            mediaPlayer.start();
            ARunnableS40S0101000_29 aRunnableS40S0101000_29 = c11as.LIZLLL;
            if (aRunnableS40S0101000_29 != null) {
                C786410Ut5.LJJZZIII(c11as.LIZIZ, aRunnableS40S0101000_29);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.11AK] */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.11AO] */
    public C11AH(C11AL c11al) {
        this.LLJILLL = c11al;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.11AJ] */
    @Override // com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        ?? r3 = new InterfaceC19456411Ac() { // from class: X.11AJ
            @Override // X.InterfaceC19456411Ac
            public final void LIZ() {
                this.LIZ.LLJILLL.close();
                C11AH c11ah = this.LIZ;
                c11ah.LLJILLL.LIZJ(c11ah.LLJJIJIIJIL);
                this.LIZ.LLJILLL.LJ(r0.LLJJIII);
            }

            @Override // X.InterfaceC19456411Ac
            public final void LIZIZ() {
                this.LIZ.LLJILLL.LIZ();
            }

            @Override // X.InterfaceC19456411Ac
            public final void LIZJ() {
                this.LIZ.LLJILLL.LIZLLL();
            }
        };
        C194303110b c194303110b = new C194303110b(requireActivity());
        this.LLJJIJIL = c194303110b;
        this.LLJJI = new C11AR((FrameLayout) this.mView, r3, c194303110b);
        ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) ViewModelProviders.of((C19EG) requireActivity()).get(ShortVideoContextViewModel.class)).LL;
        this.LLJJIJI = shortVideoContext.LJIILIIL();
        new C1436840nUg(requireActivity()).LIZJ().edit().putBoolean("count_down_new_tag", false).apply();
        AVMusicWaveBean aVMusicWaveBeanLIZIZ = C15R5.LIZIZ(shortVideoContext.musicWaveBean);
        C11A8 c11a8 = new C11A8() { // from class: X.11AI
            @Override // X.C11A8
            public final void close() {
                this.LIZ.LLJILLL.close();
                onDismiss();
            }

            @Override // X.C11A8
            public final void onDismiss() {
                C11AR c11ar;
                C11AH c11ah = this.LIZ;
                if (c11ah.mActivity == null || (c11ar = c11ah.LLJJI) == null || c11ar.LLILZLL) {
                    return;
                }
                c11ah.LLJILLL.LIZIZ(false);
            }
        };
        C11A3 c11a3 = new C11A3(new FTCCountdownState(shortVideoContext.cameraComponentModel.mMusicPath, shortVideoContext.LJII(), shortVideoContext.LJIILJJIL(), shortVideoContext.LJIIJ(), shortVideoContext.LJIILIIL(), aVMusicWaveBeanLIZIZ));
        c11a3.LLJIJIL = this.LLJJJIL;
        c11a3.LLJILJIL = c11a8;
        c11a3.LLJJLIIIJLLLLLLLZ = this.LLJJJ;
        add(R.id.syq, c11a3, "count_down");
        this.LLJILLL.LIZIZ(true);
    }

    @Override // X.C11E9
    public final <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    @Override // X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.ccd, viewGroup, false);
    }

    @Override // X.C11E9
    public final <S extends C004I> InterfaceC420801kM subscribe(JediViewModel<S> jediViewModel, C1765020w20<S> c1765020w20, Function2<? super InterfaceC960503pD, ? super S, Unit> function2) {
        return C11EA.LJIIJJI(this, jediViewModel, c1765020w20, function2);
    }

    @Override // X.C19A3, com.bytedance.scene.Scene
    public final /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return onCreateView(layoutInflater, viewGroup, bundle);
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
