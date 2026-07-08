package X;

import Y.ARunnableS40S0101000_29;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.AVMusicWaveBean;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.ss.android.ugc.aweme.shortvideo.countdown.CountdownState;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.11AM, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11AM extends C19A3 implements InterfaceC1166920gTK {
    public final C11AW LLJILLL;
    public C11AT LLJJ;
    public C11AP LLJJI;
    public long LLJJIII;
    public long LLJJIJI;
    public int LLJJIJIL;
    public C194304110c LLJJJ;
    public boolean LLJJJIL;
    public long LLJJIJIIJIL = 15000;
    public final C11AZ LLJJJJ = new C11AD() { // from class: X.11AZ
        @Override // X.C11AD
        public final void onSwitch(int i) {
            this.LIZ.LLJILLL.LIZJ(i);
        }
    };
    public final C11AN LLJJJJJIL = new C11AC() { // from class: X.11AN
        @Override // X.C11AC
        public final void LIZ() {
            if (C0BXT.LIZ()) {
                C19456911Ah c19456911AhLJFF = this.LIZ.LLJILLL.LJFF();
                if (c19456911AhLJFF != null) {
                    c19456911AhLJFF.LJ();
                }
                this.LIZ.LLJJJIL = false;
            }
            C11AT c11at = this.LIZ.LLJJ;
            if (c11at != null) {
                c11at.LIZ();
            }
        }

        @Override // X.C11AC
        public final void LIZIZ(int i, int i2, String str) {
            if (str != null && C545820Lau.LIZIZ(this.LIZ) != null) {
                if (C0BXT.LIZ()) {
                    C11AM c11am = this.LIZ;
                    c11am.LLJJJIL = true;
                    C19456911Ah c19456911AhLJFF = c11am.LLJILLL.LJFF();
                    if (c19456911AhLJFF != null) {
                        c19456911AhLJFF.LIZIZ(i, i2);
                    }
                    C19456911Ah c19456911AhLJFF2 = this.LIZ.LLJILLL.LJFF();
                    if (c19456911AhLJFF2 != null) {
                        c19456911AhLJFF2.LIZLLL(new C11AQ(i2, this.LIZ));
                        return;
                    }
                    return;
                }
                C11AT c11at = this.LIZ.LLJJ;
                if (c11at != null) {
                    c11at.LIZ();
                }
                C11AM c11am2 = this.LIZ;
                c11am2.LLJJ = new C11AT(c11am2.requireSceneContext(), UriProtector.parse(str));
                C11AM c11am3 = this.LIZ;
                C11AT c11at2 = c11am3.LLJJ;
                if (c11at2 == null) {
                    return;
                }
                c11at2.LIZJ = new C19456611Ae(c11am3);
                MediaPlayer mediaPlayer = c11at2.LIZ;
                if (mediaPlayer == null) {
                    return;
                }
                mediaPlayer.seekTo(i);
                c11at2.LIZ.start();
                ARunnableS40S0101000_29 aRunnableS40S0101000_29 = new ARunnableS40S0101000_29(c11at2, i2, 7);
                c11at2.LIZLLL = aRunnableS40S0101000_29;
                C786410Ut5.LJJZZIII(c11at2.LIZIZ, aRunnableS40S0101000_29);
            }
        }

        @Override // X.C11AC
        public final void LIZJ(int i, long j, long j2) {
            C11AM c11am = this.LIZ;
            c11am.LLJJIJIL = i;
            c11am.LLJJIII = Math.min(c11am.LLJJIJIIJIL, j);
            C11AM c11am2 = this.LIZ;
            c11am2.LLJJIJI = j2;
            C11AP c11ap = c11am2.LLJJI;
            if (c11ap != null) {
                c11ap.LIZJ(i, 0, false);
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

    public final void LLLLIIIILLL() {
        MediaPlayer mediaPlayer;
        C19456911Ah c19456911AhLJFF;
        if (C0BXT.LIZ() && (c19456911AhLJFF = this.LLJILLL.LJFF()) != null) {
            c19456911AhLJFF.LIZ();
        }
        C11AT c11at = this.LLJJ;
        if (c11at != null && (mediaPlayer = c11at.LIZ) != null) {
            try {
                mediaPlayer.pause();
                ARunnableS40S0101000_29 aRunnableS40S0101000_29 = c11at.LIZLLL;
                if (aRunnableS40S0101000_29 != null) {
                    c11at.LIZIZ.removeCallbacks(aRunnableS40S0101000_29);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        C11AP c11ap = this.LLJJI;
        if (c11ap != null) {
            c11ap.LIZIZ();
        }
        C194304110c c194304110c = this.LLJJJ;
        if (c194304110c != null) {
            c194304110c.release();
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onPause() {
        super.onPause();
        LLLLIIIILLL();
    }

    @Override // com.bytedance.scene.Scene
    public final void onResume() {
        C19456911Ah c19456911AhLJFF;
        MediaPlayer mediaPlayer;
        super.onResume();
        C11AT c11at = this.LLJJ;
        if (c11at != null && (mediaPlayer = c11at.LIZ) != null) {
            try {
                mediaPlayer.start();
                ARunnableS40S0101000_29 aRunnableS40S0101000_29 = c11at.LIZLLL;
                if (aRunnableS40S0101000_29 != null) {
                    C786410Ut5.LJJZZIII(c11at.LIZIZ, aRunnableS40S0101000_29);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        if (C0BXT.LIZ() && this.LLJJJIL && (c19456911AhLJFF = this.LLJILLL.LJFF()) != null) {
            c19456911AhLJFF.LIZJ();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.11AZ] */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.11AN] */
    public C11AM(C1653020t7M c1653020t7M) {
        this.LLJILLL = c1653020t7M;
    }

    @Override // com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        InterfaceC19456211Aa interfaceC19456211Aa = new InterfaceC19456211Aa() { // from class: X.11AV
            @Override // X.InterfaceC19456211Aa
            public final void LIZ() {
                this.LIZ.LLJILLL.close();
                C11AM c11am = this.LIZ;
                c11am.LLJILLL.LIZJ(c11am.LLJJIJIL);
                C11AM c11am2 = this.LIZ;
                c11am2.LLJILLL.LJ(c11am2.LLJJIII, c11am2.LLJJIJI);
            }

            @Override // X.InterfaceC19456211Aa
            public final void LIZIZ() {
                this.LIZ.LLJILLL.LIZ();
            }

            @Override // X.InterfaceC19456211Aa
            public final void LIZJ() {
                this.LIZ.LLJILLL.LIZLLL();
            }
        };
        C194304110c c194304110c = new C194304110c(requireActivity());
        this.LLJJJ = c194304110c;
        this.LLJJI = new C11AP((FrameLayout) this.mView, interfaceC19456211Aa, c194304110c);
        ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) C1659630tI1.LJIIIIZZ(this, null, null, 6).get(ShortVideoContextViewModel.class)).LL;
        this.LLJJIJIIJIL = shortVideoContext.LJIILIIL();
        new C1436840nUg(requireActivity()).LIZJ().edit().putBoolean("count_down_new_tag", false).apply();
        AVMusicWaveBean aVMusicWaveBeanLIZIZ = C15R5.LIZIZ(shortVideoContext.musicWaveBean);
        C11AE c11ae = new C11AE() { // from class: X.11AU
            @Override // X.C11AE
            public final void close() {
                this.LIZ.LLJILLL.close();
                onDismiss();
            }

            @Override // X.C11AE
            public final void onDismiss() {
                C11AM c11am;
                C11AP c11ap;
                if (C545820Lau.LIZIZ(this.LIZ) == null || (c11ap = (c11am = this.LIZ).LLJJI) == null || c11ap.LLIZ) {
                    return;
                }
                c11am.LLJILLL.LIZIZ(false);
            }
        };
        C11A9 c11a9 = new C11A9(new CountdownState(shortVideoContext.cameraComponentModel.mMusicPath, shortVideoContext.LJII(), shortVideoContext.LJIILJJIL(), shortVideoContext.LJIIJ(), shortVideoContext.LJIILIIL(), shortVideoContext.LJJJJZ(), aVMusicWaveBeanLIZIZ));
        c11a9.LLJILJIL = this.LLJJJJJIL;
        c11a9.LLJILJILJ = c11ae;
        c11a9.LLJLIL = this.LLJJJJ;
        add(R.id.syq, c11a9, "count_down");
        this.LLJILLL.LIZIZ(true);
    }

    @Override // X.C11E9
    public final <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    @Override // X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.i95, viewGroup, false);
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
