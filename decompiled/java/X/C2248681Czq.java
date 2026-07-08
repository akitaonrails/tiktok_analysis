package X;

import Y.ACListenerS168S0100000_34;
import Y.AObserverS236S0100000_34;
import Y.ARunnableS119S0100000_19;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.SeekBar;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.feed.landscape.LandscapeFragmentPanel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.panel.IBaseListFragmentPanel;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS613S0100000_34;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: renamed from: X.1Czq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public class C2248681Czq implements C0JO2, InterfaceC692730RFf {
    public final C12P2 LL;
    public final ViewGroup LLILLJJLI;
    public final TuxTextView LLILLL;
    public final TuxTextView LLILZ;
    public final TuxIconView LLILZIL;
    public final ImageView LLILZLL;
    public final DataCenter LLIZLLLIL;
    public final IBaseListFragmentPanel LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILLL;
    public Aweme LLJJ;
    public Aweme LLJJI;
    public int LLJJIII;
    public boolean LLJJIJI;
    public boolean LLJJIJIIJIL;
    public int LLJJIJIL;
    public long LLJJJ;
    public int LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public int LLJLIL;
    public boolean LLJLILLLLZIIL;
    public int LLJLL;
    public boolean LLJLLIL;
    public boolean LLJZ;
    public C09MI LLJZIJLIL;
    public C2248761Czy LLL;
    public final ARunnableS119S0100000_19 LLLFFI;
    public final ScrollSwitchStateManager LLIZ = null;
    public final C01GW LLJILJIL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(364));
    public final BPEAHandler LLJILJILJ = new BPEAHandler(Looper.getMainLooper());
    public String LLJJJIL = "";
    public int LLJJJJ = -1;
    public final boolean LLJJL = true;
    public boolean LLJL = true;
    public boolean LLJLLL = true;
    public final C01GW LLLF = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(366));
    public final C01GW LLLFF = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(365));

    public static int LJFF() {
        return C0SXJ.LIZ ? 102 : 100;
    }

    public final boolean LIZLLL() {
        Video video;
        IBaseListFragmentPanel iBaseListFragmentPanel = this.LLJ;
        String strC7 = iBaseListFragmentPanel != null ? iBaseListFragmentPanel.C7(true) : null;
        if (((Number) C04VS.LIZ.getValue()).intValue() == 1) {
            return true;
        }
        Aweme aweme = this.LLJJ;
        return C1867340yh2.LIZIZ((aweme == null || (video = aweme.getVideo()) == null) ? 0L : (long) video.getDuration(), strC7);
    }

    public final C2248761Czy LJ() {
        C2248761Czy c2248761Czy = this.LLL;
        if (c2248761Czy != null) {
            return c2248761Czy;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [X.09AY, kotlin.jvm.functions.Function1] */
    public final void LJIIIZ() {
        Video video;
        Video video2;
        C19EG c19egLIZIZ;
        if (!this.LLJJJJLIIL && (c19egLIZIZ = C1388190mED.LIZIZ(this.LL.getContext())) != null) {
            this.LLJJJJLIIL = true;
            ScrollSwitchStateManager scrollSwitchStateManager = this.LLIZ;
            if (scrollSwitchStateManager != null) {
                scrollSwitchStateManager.HQ2(c19egLIZIZ, new AObserverS236S0100000_34(this, 24));
            }
            ScrollSwitchStateManager scrollSwitchStateManager2 = this.LLIZ;
            if (scrollSwitchStateManager2 != null) {
                scrollSwitchStateManager2.LLJJJJJIL.observe(c19egLIZIZ, new AObserverS236S0100000_34(this, 25));
            }
        }
        C12P2 c12p2 = this.LL;
        Float fLIZJ = C705490Rlr.LIZJ(this.LLJJ);
        Float fLIZ = C705490Rlr.LIZ(this.LLJJ);
        C19749612Ow c19749612Ow = c12p2.LLILLJJLI;
        if (c19749612Ow != null) {
            C19749712Ox c19749712Ox = c19749612Ow.LLILZ;
            c19749712Ox.LJIIIZ = fLIZJ;
            c19749712Ox.LJIIJ = fLIZ;
            c19749712Ox.invalidateSelf();
        }
        this.LL.setProgress(0.0f);
        this.LL.setPageType(this.LLJJJJ);
        this.LLILLL.setText(C0QBT.LIZ(0, false));
        TuxTextView tuxTextView = this.LLILZ;
        Aweme aweme = this.LLJJ;
        tuxTextView.setText(C0QBT.LIZ(C0QBT.LIZJ((aweme == null || (video2 = aweme.getVideo()) == null) ? 0 : video2.getDuration()), false));
        C12P2 c12p22 = this.LL;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c12p22);
        c12p22.setAlpha(1.0f);
        C786410Ut5.a0(this.LL, 0);
        LJ().LIZ();
        Aweme aweme2 = this.LLJJ;
        this.LLJJIII = C0QBT.LIZJ((aweme2 == null || (video = aweme2.getVideo()) == null) ? 0 : video.getDuration());
        Aweme aweme3 = this.LLJJ;
        if (aweme3 != null) {
            C20703515zt.LJIIIIZZ(aweme3);
        }
        for (C1D03 c1d03 : LJ().LIZ) {
            ?? r1 = c1d03.LIZLLL;
            if (r1 != 0) {
                r1.invoke(c1d03.LIZ);
            }
        }
        this.LL.LIZIZ(0.0f, false);
        this.LL.setSeekBarShowType(LJFF());
        LIZIZ();
    }

    @Override // X.InterfaceC692730RFf
    public final void LIZIZ() {
        if (C692480REg.LIZ()) {
            this.LLJJIJIL = 2;
            this.LL.setPauseStatus(false);
            this.LLILZIL.setIconRes(R.raw.icon_pause_fill1);
        }
    }

    public final boolean LJII() {
        C09MI c09mi;
        return LIZLLL() && (c09mi = this.LLJZIJLIL) != null && c09mi.LIZ();
    }

    @Override // X.InterfaceC692730RFf
    public final void onDestroy() {
        EventBus.LIZLLL().LJJI(this);
        this.LLJILJILJ.removeCallbacks(this.LLLFFI);
        C09MI c09mi = this.LLJZIJLIL;
        if (c09mi != null) {
            C11LR c11lr = c09mi.LJIIL;
            if (c11lr != null) {
                c11lr.cancel();
            }
            c09mi.LJIIJJI = null;
            c09mi.LJI = null;
            if (c09mi.LJIIIZ) {
                c09mi.LJIIIIZZ.clear();
            }
        }
    }

    @Override // X.InterfaceC692730RFf
    public final void LIZJ(boolean z) {
        if (z) {
            if (this.LLJLILLLLZIIL) {
                C786410Ut5.a0(this.LL, 0);
            }
            this.LLJJIJIL = 1;
            this.LLJLIL = 0;
            this.LL.setPauseStatus(true);
            this.LL.setSeekBarShowType(LJFF());
            this.LLJILJILJ.removeCallbacks(this.LLLFFI);
            this.LLJJLIIIJLLLLLLLZ = false;
            this.LLILZIL.setIconRes(R.raw.icon_play_fill);
            return;
        }
        this.LLJJIJIL = 2;
        this.LL.setPauseStatus(false);
        if (this.LLJJL && !this.LLJJLIIIJLLLLLLLZ) {
            this.LL.setSeekBarShowType(LJFF());
        }
        this.LLILZIL.setIconRes(R.raw.icon_pause_fill1);
    }

    public final void LJI(Aweme aweme) {
        String aid;
        String aid2 = null;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        Aweme aweme2 = this.LLJJI;
        if (aweme2 != null) {
            aid2 = aweme2.getAid();
        }
        if (!TextUtils.equals(aid, aid2)) {
            this.LLJJI = aweme;
            LJIIIZ();
        }
    }

    @Override // X.InterfaceC692730RFf
    public final void LJLJJI(Aweme aweme) {
        this.LLJJ = aweme;
    }

    @C14EU
    public final void onFullFeedFragmentPageStateChangeEvent(C588040N4o c588040N4o) {
        LJIIIIZZ(c588040N4o.LIZ, c588040N4o.LIZIZ, true);
    }

    @C14EU
    public final void onFullFeedVideoChangeEvent(C1D01 c1d01) {
        if (C692480REg.LIZ() && !(c1d01.LIZLLL instanceof LandscapeFragmentPanel)) {
            return;
        }
        String str = c1d01.LIZIZ;
        if (str == null) {
            str = "";
        }
        this.LLJJJIL = str;
        this.LLJJJJ = c1d01.LIZJ;
        this.LLJJIJIL = 0;
        if (!this.LLJJL) {
            this.LLJL = false;
        }
        Intrinsics.LJFF(this.LLJJ, c1d01.LIZ);
    }

    @C14EU
    public final void onPlayerControllerVideoPlayProgressChange(C2248751Czx c2248751Czx) {
        String aid;
        String aid2;
        String aid3;
        String aid4;
        this.LLJLILLLLZIIL = c2248751Czx.LJI;
        if (!this.LLJJIJI) {
            Aweme aweme = this.LLJJ;
            String aid5 = null;
            if (aweme != null) {
                aid = aweme.getAid();
            } else {
                aid = null;
            }
            Aweme aweme2 = c2248751Czx.LIZ;
            if (aweme2 != null) {
                aid2 = aweme2.getAid();
            } else {
                aid2 = null;
            }
            if (!Intrinsics.LJFF(aid, aid2)) {
                return;
            }
            if (this.LLJJI == null) {
                Aweme aweme3 = this.LLJJ;
                if (aweme3 != null) {
                    aid3 = aweme3.getAid();
                } else {
                    aid3 = null;
                }
                Aweme aweme4 = c2248751Czx.LIZ;
                if (aweme4 != null) {
                    aid4 = aweme4.getAid();
                } else {
                    aid4 = null;
                }
                if (Intrinsics.LJFF(aid3, aid4)) {
                    LJI(c2248751Czx.LIZ);
                }
            }
            if (this.LLJJIJIL == 1) {
                int i = this.LLJLIL + 1;
                this.LLJLIL = i;
                if (i > 3) {
                    this.LLJLIL = 0;
                    this.LL.setSeekBarShowType(LJFF());
                }
            }
            if (this.LLJJJ == 0 || SystemClock.elapsedRealtime() > this.LLJJJ + ((long) 600)) {
                C586630Mzd c586630Mzd = C586630Mzd.LIZ;
                float f = c2248751Czx.LIZJ;
                Aweme aweme5 = c2248751Czx.LIZ;
                if (aweme5 != null) {
                    aid5 = aweme5.getAid();
                }
                String str = c2248751Czx.LIZIZ;
                c586630Mzd.getClass();
                C586630Mzd.LIZ(f, aid5, str, "seekBar_setProgress");
                C12P2 c12p2 = this.LL;
                float f2 = c2248751Czx.LIZJ;
                float f3 = C12P2.LLJJIJIIJIL;
                c12p2.LIZIZ(f2, false);
                TuxTextView tuxTextView = this.LLILLL;
                if ((tuxTextView instanceof TuxTextView) && tuxTextView != null) {
                    tuxTextView.setText(C0QBT.LIZLLL(c2248751Czx.LIZJ, this.LLJJIII));
                }
            }
        }
    }

    @C14EU
    public final void onPlayerControllerVideoStatusEvent(C722910SXh c722910SXh) {
        String aid;
        Aweme aweme = this.LLJJ;
        String aid2 = null;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        Aweme aweme2 = c722910SXh.LIZ;
        if (aweme2 != null) {
            aid2 = aweme2.getAid();
        }
        if (!Intrinsics.LJFF(aid, aid2)) {
            return;
        }
        boolean z = c722910SXh.LJ;
        this.LLJLILLLLZIIL = z;
        int i = c722910SXh.LIZJ;
        if (i != 1) {
            if (i == 2) {
                this.LLJJIJIL = 2;
                this.LL.setPauseStatus(false);
                if (this.LLJJL && !this.LLJJLIIIJLLLLLLLZ) {
                    this.LL.setSeekBarShowType(LJFF());
                }
                this.LLILZIL.setIconRes(R.raw.icon_pause_fill1);
                return;
            }
            return;
        }
        if (z) {
            C786410Ut5.a0(this.LL, 0);
        }
        this.LLJJIJIL = 1;
        this.LLJLIL = 0;
        this.LL.setPauseStatus(true);
        this.LL.setSeekBarShowType(LJFF());
        this.LLJILJILJ.removeCallbacks(this.LLLFFI);
        this.LLJJLIIIJLLLLLLLZ = false;
        this.LLILZIL.setIconRes(R.raw.icon_play_fill);
    }

    @C14EU
    public final void onRenderFirstFrame(C1584420rKi c1584420rKi) {
        LJI(c1584420rKi.LIZ);
        LJIIIZ();
    }

    @Override // X.C0JO2
    public final void onStartTrackingTouch(SeekBar seekBar) {
        long j;
        int progress;
        IBaseListFragmentPanel iBaseListFragmentPanel;
        ViewPropertyAnimator viewPropertyAnimatorAlpha;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator viewPropertyAnimatorAlpha2;
        ViewPropertyAnimator duration2;
        IBaseListFragmentPanel iBaseListFragmentPanel2;
        this.LLJJIJIIJIL = true;
        if (!this.LLJLLIL) {
            WeakReference weakReference = null;
            if (C1591220rVg.LIZLLL()) {
                iBaseListFragmentPanel2 = null;
                weakReference = new WeakReference(this.LLJ);
            } else {
                iBaseListFragmentPanel2 = this.LLJ;
            }
            C1440005kM.LIZ(new C0SYF(true, this.LLJJ, iBaseListFragmentPanel2, weakReference));
            this.LLJLLIL = true;
        }
        if (C1867340yh2.LIZ()) {
            j = 300;
        } else {
            j = 200;
        }
        if (C1591860rWi.LIZIZ(this.LLJJ) && this.LLILLJJLI.getVisibility() != 0 && this.LL.getVisibility() == 0) {
            LJ().LIZIZ();
            C786410Ut5.R4(0.0f, this.LLILLJJLI);
            ViewPropertyAnimator viewPropertyAnimatorAnimate = this.LLILLJJLI.animate();
            if (viewPropertyAnimatorAnimate != null && (viewPropertyAnimatorAlpha2 = viewPropertyAnimatorAnimate.alpha(1.0f)) != null && (duration2 = viewPropertyAnimatorAlpha2.setDuration(j)) != null) {
                duration2.start();
            }
            C786410Ut5.V4(this.LLILZLL, 0.0f);
            ViewPropertyAnimator viewPropertyAnimatorAnimate2 = this.LLILZLL.animate();
            if (viewPropertyAnimatorAnimate2 != null && (viewPropertyAnimatorAlpha = viewPropertyAnimatorAnimate2.alpha(1.0f)) != null && (duration = viewPropertyAnimatorAlpha.setDuration(j)) != null) {
                duration.start();
            }
        }
        this.LLJJIJI = true;
        if (seekBar != null) {
            progress = seekBar.getProgress();
        } else {
            progress = 0;
        }
        this.LLJLL = progress;
        if (this.LLJJIJIL == 1 && (iBaseListFragmentPanel = this.LLJ) != null) {
            iBaseListFragmentPanel.hideIvPlay();
        }
        if (seekBar != null) {
            this.LLJJJJJIL = seekBar.getProgress();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x027d A[PHI: r1
      0x027d: PHI (r1v45 java.lang.String) = (r1v33 java.lang.String), (r1v46 java.lang.String) binds: [B:88:0x021f, B:86:0x021c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0234 A[PHI: r1
      0x0234: PHI (r1v43 java.lang.String) = (r1v35 java.lang.String), (r1v44 java.lang.String) binds: [B:95:0x0232, B:93:0x022f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.C0JO2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onStopTrackingTouch(android.widget.SeekBar r12) {
        /*
            Method dump skipped, instruction units count: 690
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2248681Czq.onStopTrackingTouch(android.widget.SeekBar):void");
    }

    @C14EU
    public final void onVideoBufferProgressChange(C586420MzI c586420MzI) {
        String aid;
        boolean z = C0SXJ.LIZ;
        if (!C0SXJ.LIZ) {
            return;
        }
        Aweme aweme = this.LLJJ;
        String aid2 = null;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        Aweme aweme2 = c586420MzI.LIZ;
        if (aweme2 != null) {
            aid2 = aweme2.getAid();
        }
        if (!Intrinsics.LJFF(aid, aid2)) {
            return;
        }
        if (this.LLJZ) {
            this.LLJZ = false;
        } else {
            this.LL.setSecondaryProgress((int) c586420MzI.LIZJ);
        }
    }

    @C14EU
    public final void onVideoMaskEvent(C0RO7 c0ro7) {
        String aid;
        String str = c0ro7.LIZIZ;
        Aweme aweme = this.LLJJ;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        if (Intrinsics.LJFF(str, aid)) {
            if (c0ro7.LIZ) {
                C12P2 c12p2 = this.LL;
                C679360Qko.LIZ(c12p2.getAlpha(), 0.0f, c12p2);
            } else {
                C679360Qko.LIZ(0.0f, 1.0f, this.LL);
            }
        }
        if (c0ro7.LIZJ) {
            C12P2 c12p22 = this.LL;
            C679360Qko.LIZ(c12p22.getAlpha(), 0.0f, c12p22);
            LJ().LIZ();
        }
    }

    @C14EU
    public final void onVideoProgressVolumeKeyEvent(C16ED c16ed) {
        if (this.LLJJL) {
            if (c16ed.LIZJ) {
                C786410Ut5.a0(this.LL, 4);
            } else {
                C786410Ut5.a0(this.LL, 0);
            }
        }
    }

    @Override // X.InterfaceC692730RFf
    public final void LIZ(float f, boolean z) {
        int i;
        float progress;
        C19749612Ow mutableSeekBar;
        IBaseListFragmentPanel iBaseListFragmentPanel;
        if (!this.LLJLLIL) {
            WeakReference weakReference = null;
            if (C1591220rVg.LIZLLL()) {
                iBaseListFragmentPanel = null;
                weakReference = new WeakReference(this.LLJ);
            } else {
                iBaseListFragmentPanel = this.LLJ;
            }
            C1440005kM.LIZ(new C0SYF(true, this.LLJJ, iBaseListFragmentPanel, weakReference));
            this.LLJLLIL = true;
        }
        this.LLJLLL = false;
        C12P2 c12p2 = this.LL;
        if (C0SXJ.LIZ) {
            i = 102;
        } else {
            i = 101;
        }
        c12p2.setSeekBarShowType(i);
        float fLJIIJ = (f / C12ES.LJIIJ(this.LL.getContext())) * 100.0f;
        C12P2 c12p22 = this.LL;
        float f2 = 0.0f;
        if (c12p22 != null && (mutableSeekBar = c12p22.getMutableSeekBar()) != null) {
            progress = mutableSeekBar.getProgress() / 100.0f;
        } else {
            progress = 0.0f;
        }
        float f3 = progress + fLJIIJ;
        if (f3 >= 0.0f) {
            if (f3 > 100.0f) {
                f2 = 100.0f;
            } else {
                f2 = f3;
            }
        }
        this.LL.setProgress(f2);
        if (!this.LLJJIJI) {
            onStartTrackingTouch(this.LL.getMutableSeekBar());
        }
        onProgressChanged(this.LL.getMutableSeekBar(), (int) (f2 * 100.0f), true);
        if (z) {
            onStopTrackingTouch(this.LL.getMutableSeekBar());
            this.LLJLLL = true;
        }
    }

    public final void LJIIIIZZ(Aweme aweme, int i, boolean z) {
        if (!z) {
            C786410Ut5.a0(this.LL, 4);
            return;
        }
        if (i == 0) {
            C786410Ut5.a0(this.LL, 0);
            this.LLJJIJIL = 2;
            if (this.LLJJIJI) {
                LJ().LIZIZ();
                return;
            }
        } else {
            C786410Ut5.a0(this.LL, 4);
        }
        LJ().LIZ();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.09AY, kotlin.jvm.functions.Function2] */
    @Override // X.C0JO2
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (this.LLJJIJI) {
            for (C1D03 c1d03 : LJ().LIZ) {
                ?? r2 = c1d03.LIZIZ;
                if (r2 != 0) {
                    r2.invoke(Integer.valueOf(i), c1d03.LIZ);
                }
            }
        }
    }

    public C2248681Czq(C12P2 c12p2, ViewGroup viewGroup, TuxTextView tuxTextView, TuxTextView tuxTextView2, TuxIconView tuxIconView, ImageView imageView, DataCenter dataCenter, LandscapeFragmentPanel landscapeFragmentPanel) {
        this.LL = c12p2;
        this.LLILLJJLI = viewGroup;
        this.LLILLL = tuxTextView;
        this.LLILZ = tuxTextView2;
        this.LLILZIL = tuxIconView;
        this.LLILZLL = imageView;
        this.LLIZLLLIL = dataCenter;
        this.LLJ = landscapeFragmentPanel;
        C2248711Czt c2248711Czt = (C2248711Czt) this;
        this.LLJI = C452501pT.LIZIZ(new AwS563S0100000_19(c2248711Czt, 2953));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS563S0100000_19(c2248711Czt, 2952));
        this.LLJILLL = C452501pT.LIZIZ(new AwS563S0100000_19(c2248711Czt, 2954));
        c12p2.setOnSeekBarChangeListener(this);
        EventBus.LIZLLL().LJIJJ(this);
        C786410Ut5.a9(tuxIconView, new ACListenerS168S0100000_34(c2248711Czt, 32));
        C1D03 c1d03 = new C1D03(imageView);
        new AwS613S0100000_34(c2248711Czt, 94).invoke(c1d03);
        C1D03 c1d032 = new C1D03(viewGroup);
        new AwS613S0100000_34(c2248711Czt, 95).invoke(c1d032);
        C1D03 c1d033 = new C1D03(viewGroup.findViewById(R.id.fbf));
        new AwS613S0100000_34(c2248711Czt, 96).invoke(c1d033);
        C1D03 c1d034 = new C1D03(viewGroup.findViewById(R.id.yg3));
        new AwS613S0100000_34(c2248711Czt, 98).invoke(c1d034);
        C1D03 c1d035 = new C1D03(viewGroup.findViewById(R.id.fbg));
        new AwS613S0100000_34(c2248711Czt, 100).invoke(c1d035);
        this.LLL = new C2248761Czy(c1d03, c1d032, c1d033, c1d034, c1d035);
        LJ().LIZ();
        this.LLLFFI = new ARunnableS119S0100000_19(c2248711Czt, 157);
    }
}
