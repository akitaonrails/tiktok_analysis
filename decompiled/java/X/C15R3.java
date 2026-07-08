package X;

import Y.ACListenerS165S0100000_31;
import Y.ARunnableS131S0100000_31;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.AVMusicWaveBean;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.ss.android.ugc.aweme.shortvideo.cutmusic.RepeatMusicPlayer;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS604S0100000_25;

/* JADX INFO: renamed from: X.15R3, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15R3 extends Scene implements InterfaceC1166920gTK, C15RL, C15K0 {
    public final Function1<Integer, Unit> LLJI;
    public ShortVideoContext LLJIJIL;
    public C15RC LLJILJIL;
    public RepeatMusicPlayer LLJILJILJ;
    public String LLJILLL;
    public int LLJJ;
    public int LLJJI;

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
    public final void onDestroyView() {
        View view;
        super.onDestroyView();
        C15RC c15rc = this.LLJILJIL;
        if (c15rc == null || (view = c15rc.LIZ) == null) {
            return;
        }
        C786410Ut5.LJJJZ(view, c15rc.LIZIZ);
        c15rc.LIZ = null;
    }

    @Override // com.bytedance.scene.Scene
    public final void onStop() {
        super.onStop();
        RepeatMusicPlayer repeatMusicPlayer = this.LLJILJILJ;
        if (repeatMusicPlayer != null) {
            repeatMusicPlayer.LIZJ();
        }
        this.LLJILJILJ = null;
    }

    public C15R3(AwS604S0100000_25 awS604S0100000_25) {
        this.LLJI = awS604S0100000_25;
    }

    @Override // X.C15RL
    public final void LJJIFFI(int i) {
        this.LLJJI = i;
        this.LLJI.invoke(Integer.valueOf(i));
        RepeatMusicPlayer repeatMusicPlayer = this.LLJILJILJ;
        if (repeatMusicPlayer != null) {
            repeatMusicPlayer.LIZJ();
        }
        this.LLJILJILJ = null;
    }

    @Override // X.C15RL
    public final void LJLJLJ(int i) {
        String str = this.LLJILLL;
        if (str == null) {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.LLJJI = i;
        LLLII(i, this.LLJJ);
    }

    @Override // com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        ShortVideoContext shortVideoContext;
        int iMin;
        ShortVideoContext shortVideoContext2;
        ShortVideoContext shortVideoContext3;
        ShortVideoContext shortVideoContext4;
        super.onActivityCreated(bundle);
        ShortVideoContext shortVideoContext5 = ((ShortVideoContextViewModel) ViewModelProviders.of((C19EG) this.mActivity).get(ShortVideoContextViewModel.class)).LL;
        this.LLJIJIL = shortVideoContext5;
        ShortVideoContext shortVideoContext6 = null;
        if (shortVideoContext5 == null) {
            shortVideoContext = null;
        } else {
            shortVideoContext = shortVideoContext5;
        }
        if (shortVideoContext.cameraComponentModel.curBackgroundVideo != null) {
            iMin = (int) C0CHQ.LIZ().LJJJJJ().getMaxDurationResolver().getMaxShootingDuration();
            ShortVideoContext shortVideoContext7 = this.LLJIJIL;
            if (shortVideoContext7 == null) {
                shortVideoContext7 = null;
            }
            if (!shortVideoContext7.cameraComponentModel.mCurrentDurationMode) {
                iMin = 15000;
            }
        } else {
            if (shortVideoContext5 == null) {
                shortVideoContext5 = null;
            }
            iMin = (int) shortVideoContext5.cameraComponentModel.mMaxDuration;
        }
        ShortVideoContext shortVideoContext8 = this.LLJIJIL;
        if (shortVideoContext8 == null) {
            shortVideoContext8 = null;
        }
        AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(shortVideoContext8.creativeModel.musicBuzModel);
        if (aVMusicExtractAVMusic != null && aVMusicExtractAVMusic.getShootDuration() > 0) {
            iMin = Math.min(iMin, aVMusicExtractAVMusic.getShootDuration());
        }
        this.LLJJ = iMin;
        ShortVideoContext shortVideoContext9 = this.LLJIJIL;
        if (shortVideoContext9 == null) {
            shortVideoContext2 = null;
        } else {
            shortVideoContext2 = shortVideoContext9;
        }
        this.LLJJI = shortVideoContext2.cameraComponentModel.mMusicStart;
        if (shortVideoContext9 == null) {
            shortVideoContext3 = null;
        } else {
            shortVideoContext3 = shortVideoContext9;
        }
        this.LLJILLL = shortVideoContext3.cameraComponentModel.mMusicPath;
        FrameLayout frameLayout = (FrameLayout) this.mView;
        C15RC c15rc = new C15RC(frameLayout, this);
        if (shortVideoContext9 == null) {
            shortVideoContext4 = null;
        } else {
            shortVideoContext4 = shortVideoContext9;
        }
        c15rc.LJ = shortVideoContext4.musicWaveBean;
        if (shortVideoContext9 != null) {
            shortVideoContext6 = shortVideoContext9;
        }
        int iLJIIJ = shortVideoContext6.LJIIJ();
        int i = this.LLJJI;
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(frameLayout.getContext()), R.layout.ad5, frameLayout, false);
        c15rc.LIZ = viewTd;
        frameLayout.addView(viewTd);
        View view = c15rc.LIZ;
        final C15R4 c15r4 = new C15R4();
        c15r4.LLJ = iMin;
        c15r4.LLJI = i;
        c15r4.LLJIJIL = iLJIIJ;
        c15r4.LLIZLLLIL = view;
        c15r4.LLILLJJLI = (C0GWO) view.findViewById(R.id.m3v);
        c15r4.LLILLL = (TextView) view.findViewById(R.id.tv_start);
        c15r4.LLILZ = (TextView) view.findViewById(R.id.zk4);
        c15r4.LLILZLL = (C15R7) view.findViewById(R.id.fef);
        c15r4.LLIZ = (RelativeLayout) view.findViewById(R.id.vjf);
        c15r4.LLILZIL = view.getContext().getResources().getString(2131850654);
        C786410Ut5.I7(new ACListenerS165S0100000_31(c15r4, 84), view.findViewById(R.id.le4));
        c15r4.LLILZ.setText(C0F3O.LIZ(c15r4.LLJIJIL));
        c15r4.LLILLL.setText(c15r4.LLILZIL);
        ImageView imageView = new ImageView(c15r4.LLIZLLLIL.getContext());
        c15r4.LL = imageView;
        imageView.setImageResource(R.drawable.bwz);
        c15r4.LL.setScaleType(ImageView.ScaleType.FIT_XY);
        c15r4.LLIZ.addView(c15r4.LL);
        C786410Ut5.Hd(c15r4.LL, c15r4.LLILLJJLI.getX() - (c15r4.LL.getWidth() / 2));
        c15r4.LLILLJJLI.setLength(c15r4.LIZIZ());
        c15r4.LL.setOnTouchListener(c15r4);
        C15R7 c15r7 = c15r4.LLILZLL;
        c15r7.setBubbleTextViewAttribute(C15R6.LIZJ(c15r7.getContext()));
        c15r4.LLILZLL.setScrollListener(new C15RV() { // from class: X.15R8
            @Override // X.C15RV
            public final void LIZ(float f) {
                c15r4.LLILZLL.setTimeBubble((int) (f * r2.LLJIJIL));
            }

            @Override // X.C15RV
            public final void LIZIZ(float f) {
                C15R4 c15r42 = c15r4;
                int i2 = (int) (f * c15r42.LLJIJIL);
                c15r42.LLJI = i2;
                C15RR c15rr = c15r42.LLJJI;
                if (c15rr != null) {
                    ((C15RC) c15rr).LIZLLL.LJLJLJ(i2);
                }
            }
        });
        c15r4.LLILZLL.LIZIZ((c15r4.LLJI * 1.0f) / c15r4.LLJIJIL);
        c15r4.LLILZLL.setTimeBubble(c15r4.LLJI);
        c15r4.LLIZLLLIL.bringToFront();
        int i2 = c15r4.LLJIJIL;
        int i3 = c15r4.LLJ;
        if (i2 > i3 && i2 < i3 + LSPassThroughRecordSizeConfig.DEFAULT) {
            c15r4.LLJILLL = true;
        }
        HandlerHook.viewPost(view, new ARunnableS131S0100000_31(c15r4, 86));
        C15RR c15rr = c15r4.LLJJI;
        if (c15rr != null) {
            ((C15RC) c15rr).LIZLLL.LJLJLJ(i);
        }
        c15r4.LLJJ = c15rc;
        c15r4.LLJJI = c15rc;
        c15rc.LIZJ = c15r4;
        AVMusicWaveBean aVMusicWaveBeanLIZIZ = C15R5.LIZIZ(c15rc.LJ);
        C15R5.LJI.LIZ(aVMusicWaveBeanLIZIZ, iMin, iLJIIJ);
        C15R5.LJ(aVMusicWaveBeanLIZIZ);
        if (aVMusicWaveBeanLIZIZ != null && c15r4.LLILZLL != null) {
            c15r4.LIZJ(false);
            c15r4.LLILZLL.setAudioWaveViewData(aVMusicWaveBeanLIZIZ);
        } else {
            c15r4.LIZJ(true);
        }
        C786410Ut5.T4(c15rc.LIZ, 0.0f);
        c15rc.LIZ.animate().alpha(1.0f).setDuration(200L).start();
        this.LLJILJIL = c15rc;
        LLLII(this.LLJJI, this.LLJJ);
    }

    @Override // X.C15K0
    public final void onProgress(int i) {
        C15R4 c15r4;
        C15R7 c15r7;
        C15RC c15rc = this.LLJILJIL;
        if (c15rc != null && (c15r4 = c15rc.LIZJ) != null && (c15r7 = c15r4.LLILZLL) != null && c15r7.getVisibility() == 0) {
            c15r4.LLILZLL.LIZJ(((i - c15r4.LLJI) * 1.0f) / c15r4.LLJIJIL);
        }
    }

    public final void LLLII(int i, int i2) {
        String str = this.LLJILLL;
        String str2 = null;
        if (str == null) {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (this.LLJILJILJ == null) {
            String str3 = this.LLJILLL;
            if (str3 != null) {
                str2 = str3;
            }
            this.LLJILJILJ = new RepeatMusicPlayer(i2, this, str2);
        }
        RepeatMusicPlayer repeatMusicPlayer = this.LLJILJILJ;
        C15K3 c15k3 = repeatMusicPlayer.LLIZ;
        if (c15k3 != null) {
            c15k3.LIZIZ = 0;
        }
        repeatMusicPlayer.LIZIZ(i, repeatMusicPlayer.LLILLL);
        this.LLJILJILJ.LLJI = this;
    }

    @Override // X.C11E9
    public final <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    @Override // com.bytedance.scene.Scene
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.ccg, viewGroup, false);
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
