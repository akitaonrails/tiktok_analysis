package Y;

import X.C098200Yq;
import X.C11ES;
import X.C128B;
import X.C128C;
import X.C12DM;
import X.C12NV;
import X.C1524805y2;
import X.C1558520qew;
import X.C15M8;
import X.C1858060yS4;
import X.C189200o6;
import X.C194442115k;
import X.C1C7U;
import X.C259800zU;
import X.C786410Ut5;
import android.os.SystemClock;
import android.view.View;
import android.widget.PopupWindow;
import com.bytedance.router.SmartRoute;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.common.util.concurrent.ListenableFuture;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.prop.fragment.StickerPropDetailFragment;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import com.ss.android.ugc.aweme.tako.botpage.components.sug.TakoContainerSugAssem;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS157S0400000_29;

/* JADX INFO: loaded from: classes30.dex */
public class ARunnableS37S0400000_29 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        long jElapsedRealtime;
        ((MusicModel) this.l0).setMusicWaveBean((MusicWaveBean) this.l1);
        ((C128C) this.l2).LIZLLL.LIZ((MusicModel) this.l0);
        Long l = ((C128B) this.l3).LIZ;
        if (l != null) {
            jElapsedRealtime = SystemClock.elapsedRealtime() - l.longValue();
        } else {
            jElapsedRealtime = -1;
        }
        new C15M8().LJIIJJI(jElapsedRealtime);
    }

    public final void LIZ$1() {
        Object c098200Yq;
        C194442115k c194442115k = (C194442115k) this.l0;
        View view = (View) this.l1;
        PopupWindow popupWindow = (PopupWindow) this.l2;
        View view2 = (View) this.l3;
        c194442115k.LJII = null;
        c194442115k.LJIIIIZZ = null;
        if (c194442115k.LIZIZ == popupWindow && view.isAttachedToWindow()) {
            if (popupWindow.isShowing()) {
                c194442115k.LIZLLL(view, view2, popupWindow);
                return;
            }
            if (view.isLayoutRequested() || view.getWidth() <= 0 || view.getHeight() <= 0) {
                c194442115k.LIZJ(view, view2, popupWindow);
                return;
            }
            Pair pairLIZ = C194442115k.LIZ(view, view2);
            try {
                C786410Ut5.k3(popupWindow, view, 0, ((Number) pairLIZ.getFirst()).intValue(), ((Number) pairLIZ.getSecond()).intValue());
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m8isSuccessimpl(c098200Yq)) {
                view2.animate().alpha(1.0f).setDuration(250L).setInterpolator(new C12DM()).start();
            }
        }
    }

    public static final void run$0(ARunnableS37S0400000_29 aRunnableS37S0400000_29) {
        boolean zLIZ;
        C1C7U.LIZ("MusicDownloadHelper@b970.doDownload$1$onSuccess$1");
        try {
            aRunnableS37S0400000_29.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MusicDownloadHelper@b970.doDownload$1$onSuccess$1");
    }

    public static final void run$1(ARunnableS37S0400000_29 aRunnableS37S0400000_29) {
        boolean zLIZ;
        C1C7U.LIZ("TakoContainerSugAssem@c821.onBind$1$1$2");
        try {
            IMessageAbility iMessageAbility = (IMessageAbility) ((TakoContainerSugAssem) aRunnableS37S0400000_29.l0).LLJL.getValue();
            if (iMessageAbility != null && iMessageAbility.oj()) {
                C1858060yS4.LJ((C12NV) aRunnableS37S0400000_29.l1, C1558520qew.LJIIL((TakoContainerSugAssem) aRunnableS37S0400000_29.l0), (View) aRunnableS37S0400000_29.l2, (Message) aRunnableS37S0400000_29.l3, null, null, 24);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TakoContainerSugAssem@c821.onBind$1$1$2");
    }

    public static final void run$2(ARunnableS37S0400000_29 aRunnableS37S0400000_29) {
        boolean zLIZ;
        C1C7U.LIZ("BannerViewHolder@3e1e.clickCover$1");
        try {
            C1524805y2.LIZIZ(0L, new AwS157S0400000_29((ListenableFuture) aRunnableS37S0400000_29.l0, (ListenableFuture<Challenge>) aRunnableS37S0400000_29.l1, (C259800zU<SmartRoute>) aRunnableS37S0400000_29.l2, (C11ES) aRunnableS37S0400000_29.l3, (StringBuilder) 15));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BannerViewHolder@3e1e.clickCover$1");
    }

    public static final void run$3(ARunnableS37S0400000_29 aRunnableS37S0400000_29) {
        StickerPropDetailFragment stickerPropDetailFragment = (StickerPropDetailFragment) aRunnableS37S0400000_29.l0;
        boolean[] zArr = (boolean[]) aRunnableS37S0400000_29.l1;
        Runnable[] runnableArr = (Runnable[]) aRunnableS37S0400000_29.l2;
        Runnable runnable = (Runnable) aRunnableS37S0400000_29.l3;
        String str = StickerPropDetailFragment._pnsPageId;
        stickerPropDetailFragment.getClass();
        C1C7U.LIZ("StickerPropDetailFragment@b9bc.ensureLyricsThen$1L");
        if (zArr[0]) {
            C1C7U.LIZIZ("StickerPropDetailFragment@b9bc.ensureLyricsThen$1L");
            return;
        }
        zArr[0] = true;
        Runnable runnable2 = runnableArr[0];
        if (runnable2 != null) {
            stickerPropDetailFragment.LLZLI.removeCallbacks(runnable2);
        }
        if (stickerPropDetailFragment.isAdded() && stickerPropDetailFragment.getActivity() != null && !stickerPropDetailFragment.getActivity().isFinishing()) {
            View view = stickerPropDetailFragment.LLIZLLLIL;
            if (view != null) {
                view.setEnabled(true);
            }
            runnable.run();
            C1C7U.LIZIZ("StickerPropDetailFragment@b9bc.ensureLyricsThen$1L");
            return;
        }
        C1C7U.LIZIZ("StickerPropDetailFragment@b9bc.ensureLyricsThen$1L");
    }

    public static final void run$4(ARunnableS37S0400000_29 aRunnableS37S0400000_29) {
        boolean zLIZ;
        C1C7U.LIZ("BulletinVoiceTopChipFloatingPopup@33e7.postShowInternal$runnable$1");
        try {
            aRunnableS37S0400000_29.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BulletinVoiceTopChipFloatingPopup@33e7.postShowInternal$runnable$1");
    }

    public static final void run$5(ARunnableS37S0400000_29 aRunnableS37S0400000_29) {
        boolean zLIZ;
        C1C7U.LIZ("BulletinVoiceTopChipFloatingPopup@33e7.updatePosition$1");
        try {
            if (((View) aRunnableS37S0400000_29.l0).getParent() != null) {
                PopupWindow popupWindow = ((C194442115k) aRunnableS37S0400000_29.l1).LIZIZ;
                PopupWindow popupWindow2 = (PopupWindow) aRunnableS37S0400000_29.l2;
                if (popupWindow == popupWindow2 && popupWindow2.isShowing()) {
                    ((C194442115k) aRunnableS37S0400000_29.l1).LIZLLL((View) aRunnableS37S0400000_29.l0, (View) aRunnableS37S0400000_29.l3, (PopupWindow) aRunnableS37S0400000_29.l2);
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BulletinVoiceTopChipFloatingPopup@33e7.updatePosition$1");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ARunnableS37S0400000_29(android.view.View r2, android.view.View r3, android.widget.PopupWindow r4, X.C194442115k r5, int r6) {
        /*
            r1 = this;
            r1.$t = r6
            int r6 = 4 - r6
            if (r6 == 0) goto L13
            r0 = r1
            r0.l0 = r2
            r0.l1 = r5
            r0.l2 = r4
            r0.l3 = r3
        Lf:
            r0.<init>()
            return
        L13:
            r0 = r1
            r0.l0 = r5
            r0.l1 = r2
            r0.l2 = r4
            r0.l3 = r3
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS37S0400000_29.<init>(android.view.View, android.view.View, android.widget.PopupWindow, X.115k, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ARunnableS37S0400000_29(Object obj, ListenableFuture<Challenge> listenableFuture, C259800zU<SmartRoute> c259800zU, C11ES c11es, StringBuilder sb) {
        this.$t = sb;
        this.l0 = obj;
        this.l1 = listenableFuture;
        this.l2 = c259800zU;
        this.l3 = c11es;
    }

    public ARunnableS37S0400000_29(MusicModel musicModel, MusicWaveBean musicWaveBean, C128C c128c, String str, C128B c128b, int i) {
        this.$t = i;
        this.l0 = musicModel;
        this.l1 = musicWaveBean;
        this.l2 = c128c;
        this.l3 = c128b;
    }
}
