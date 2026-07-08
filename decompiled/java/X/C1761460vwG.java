package X;

import Y.ARunnableS113S0100000_13;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.SeekBar;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.ecommerce.base.review.gallery.GalleryViewerFragment;
import com.ss.android.ugc.aweme.ecommerce.base.review.gallery.GalleryViewerViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS570S0100000_26;

/* JADX INFO: renamed from: X.0vwG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1761460vwG implements InterfaceC1761370vw7 {
    public final GalleryViewerFragment LL;
    public final GalleryViewerViewModel LLILLJJLI;
    public final int LLILLL;
    public View LLILZ;
    public Integer LLIZLLLIL;
    public Integer LLJ;
    public Integer LLJI;
    public C1508330pLz LLJIJIL;
    public boolean LLJILJIL;
    public ARunnableS113S0100000_13 LLJILJILJ;
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1635));
    public EnumC1407150min LLILZLL = EnumC1407150min.NONE;
    public final int LLIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
    public final C1761510vwL LLJILLL = new InterfaceC588410N5z() { // from class: X.0vwL
        @Override // X.InterfaceC588410N5z
        public final void LJII() {
        }

        @Override // X.InterfaceC588410N5z
        public final void LJLLI(String str) {
        }

        @Override // X.InterfaceC588410N5z
        public final void LL(String str) {
        }

        @Override // X.InterfaceC588410N5z
        public final void onBufferedPercent(String str, long j, int i) {
        }

        @Override // X.InterfaceC588410N5z
        public final void onBuffering(boolean z) {
        }

        @Override // X.InterfaceC588410N5z
        public final void onPausePlay(String str) {
        }

        @Override // X.InterfaceC588410N5z
        public final void onPreparePlay(String str) {
        }

        @Override // X.InterfaceC588410N5z
        public final void onResumePlay(String str) {
        }

        @Override // X.InterfaceC588410N5z
        public final void onPlayCompleted(String str) {
            SeekBar seekBarLIZIZ = this.LL.LIZIZ();
            if (seekBarLIZIZ != null) {
                seekBarLIZIZ.setProgress(0);
            }
            C1761460vwG c1761460vwG = this.LL;
            C19736512Jv c19736512JvLIZJ = c1761460vwG.LIZJ();
            if (c19736512JvLIZJ != null) {
                C786410Ut5.LJLLLLLL(0, c19736512JvLIZJ);
            }
            c1761460vwG.LIZ();
            SeekBar seekBarLIZIZ2 = c1761460vwG.LIZIZ();
            if (seekBarLIZIZ2 != null) {
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(seekBarLIZIZ2);
                seekBarLIZIZ2.setAlpha(1.0f);
            }
        }

        @Override // X.InterfaceC588410N5z
        public final void onPlayProgressChange(float f) {
            C1508330pLz c1508330pLz;
            C1761460vwG c1761460vwG = this.LL;
            if (!c1761460vwG.LLJILJIL && f > 0.0f && (c1508330pLz = c1761460vwG.LLJIJIL) != null) {
                long jLIZJ = c1508330pLz.LIZJ();
                long currentPosition = 0;
                if (jLIZJ > 0) {
                    SeekBar seekBarLIZIZ = c1761460vwG.LIZIZ();
                    if (seekBarLIZIZ != null) {
                        InterfaceC1508380pM4 interfaceC1508380pM4 = c1508330pLz.LJIIIIZZ;
                        if (interfaceC1508380pM4 != null) {
                            currentPosition = interfaceC1508380pM4.getCurrentPosition();
                        }
                        seekBarLIZIZ.setProgress((int) ((currentPosition / jLIZJ) * 100));
                        return;
                    }
                    return;
                }
                SeekBar seekBarLIZIZ2 = c1761460vwG.LIZIZ();
                if (seekBarLIZIZ2 == null) {
                    return;
                }
                seekBarLIZIZ2.setProgress(0);
            }
        }
    };

    public final void LIZ() {
        SeekBar seekBarLIZIZ;
        ARunnableS113S0100000_13 aRunnableS113S0100000_13 = this.LLJILJILJ;
        if (aRunnableS113S0100000_13 != null && (seekBarLIZIZ = LIZIZ()) != null) {
            HandlerHook.viewRemoveCallbacks(seekBarLIZIZ, aRunnableS113S0100000_13);
        }
        this.LLJILJILJ = null;
    }

    public final SeekBar LIZIZ() {
        View view = this.LLILZ;
        if (view != null) {
            return (SeekBar) view.findViewById(R.id.u0g);
        }
        return null;
    }

    public final C19736512Jv LIZJ() {
        View view = this.LLILZ;
        if (view != null) {
            return (C19736512Jv) view.findViewById(R.id.view_play_state);
        }
        return null;
    }

    public final void LIZLLL() {
        View viewFindViewById;
        View viewFindViewById2;
        View view = this.LLILZ;
        View viewFindViewById3 = view != null ? view.findViewById(R.id.tv_play_progress_seek_current) : null;
        if (viewFindViewById3 != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById3);
        }
        View view2 = this.LLILZ;
        if (view2 != null && (viewFindViewById2 = view2.findViewById(R.id.tv_play_progress_seek_separator)) != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById2);
        }
        View view3 = this.LLILZ;
        if (view3 == null || (viewFindViewById = view3.findViewById(R.id.tv_play_progress_seek_total)) == null) {
            return;
        }
        C786410Ut5.LJLLLLLL(8, viewFindViewById);
    }

    public final void LJ() {
        C19ME c19me;
        View viewFindViewById;
        Integer num = this.LLIZLLLIL;
        if (num != null) {
            int iIntValue = num.intValue();
            View view = this.LLILZ;
            ViewGroup.LayoutParams layoutParams = null;
            if (view != null && (viewFindViewById = view.findViewById(R.id.jbl)) != null) {
                layoutParams = viewFindViewById.getLayoutParams();
            }
            if (!(layoutParams instanceof C19ME) || (c19me = (C19ME) layoutParams) == null) {
                return;
            }
            c19me.guideEnd = iIntValue;
        }
    }

    @Override // X.InterfaceC1761370vw7
    public final void LJFF() {
        ViewGroup viewGroup;
        View view = this.LLILZ;
        ViewParent parent = view != null ? view.getParent() : null;
        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
            C786410Ut5.LJJJLZIJ(this.LLILZ, viewGroup);
        }
        LIZ();
    }

    public final void LJIIIIZZ() {
        View viewFindViewById;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        View view = this.LLILZ;
        if (view == null || (viewFindViewById = view.findViewById(R.id.jd6)) == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null) {
            return;
        }
        Integer num = this.LLJI;
        int iIntValue = num != null ? num.intValue() : 0;
        Integer num2 = this.LLJ;
        marginLayoutParams.topMargin = iIntValue - (num2 != null ? num2.intValue() : 0);
    }

    public final void LJI() {
        View viewFindViewById;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        LJIIIIZZ();
        Integer num = this.LLJ;
        if (num != null) {
            int iIntValue = num.intValue();
            View view = this.LLILZ;
            if (view == null || (viewFindViewById = view.findViewById(R.id.tgr)) == null) {
                return;
            }
            ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null) {
                return;
            }
            marginLayoutParams.bottomMargin = C0H9H.LIZIZ(12) + iIntValue;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:222:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:306:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c3  */
    @Override // X.InterfaceC1761370vw7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onPageSelected(int r25) {
        /*
            Method dump skipped, instruction units count: 1126
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1761460vwG.onPageSelected(int):void");
    }

    @Override // X.InterfaceC1761370vw7
    public final void onShow(int i) {
        View view = this.LLILZ;
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
    }

    @Override // X.InterfaceC1761370vw7
    public final void setAlpha(float f) {
        View view = this.LLILZ;
        if (view != null) {
            C786410Ut5.T4(view, f);
        }
    }

    @Override // X.InterfaceC1761370vw7
    public final void LJII(FrameLayout frameLayout, InterfaceC1763860w08 interfaceC1763860w08) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        Integer numValueOf = null;
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(frameLayout.getContext()), R.layout.axe, null, false);
        ((C0DJG) viewTd.findViewById(R.id.srx)).setStarSize(14);
        viewTd.findViewById(R.id.view_mask).setBackground(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{C0HEZ.LIZ(R.attr.zd, frameLayout.getContext()), 0}));
        this.LLILZ = viewTd;
        View viewFindViewById = viewTd.findViewById(R.id.jd6);
        if (viewFindViewById != null) {
            layoutParams = viewFindViewById.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            numValueOf = Integer.valueOf(marginLayoutParams.topMargin);
        }
        this.LLJI = numValueOf;
        LJ();
        LJI();
        View view = this.LLILZ;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.gravity = 80;
        frameLayout.addView(view, layoutParams2);
        SeekBar seekBarLIZIZ = LIZIZ();
        if (seekBarLIZIZ != null) {
            seekBarLIZIZ.setSplitTrack(false);
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0vwL] */
    public C1761460vwG(GalleryViewerFragment galleryViewerFragment, GalleryViewerViewModel galleryViewerViewModel, int i) {
        this.LL = galleryViewerFragment;
        this.LLILLJJLI = galleryViewerViewModel;
        this.LLILLL = i;
    }
}
