package Y;

import X.C0IEB;
import X.C0IEQ;
import X.C0IEU;
import X.C0IF9;
import X.C0KYR;
import X.C0UQX;
import X.C1161920gLG;
import X.C1C7U;
import X.C20441214yg;
import X.C2188811AlT;
import X.C786410Ut5;
import X.C937970aW3;
import X.InterfaceC464450IJf;
import android.os.SystemClock;
import com.bytedance.android.livesdk.api.revenue.goodybag.IGoodyBagService;
import com.bytedance.android.livesdk.broadcast.preview.LiveBroadcastPreviewFragment;
import com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment;
import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes8.dex */
public class ARunnableS12S0200100_7 implements Runnable {
    public final int $t;
    public long j2;
    public Object l0;
    public Object l1;

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
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$2() {
        String strLIZLLL = C0KYR.LIZLLL((Throwable) this.l0);
        if (((Throwable) this.l0) instanceof IllegalStateException) {
            StringBuilder sb = new StringBuilder(strLIZLLL);
            StackTraceElement[] stackTrace = ((Throwable) this.l0).getStackTrace();
            int length = stackTrace.length;
            for (int i = 0; i < length; i++) {
                StackTraceElement stackTraceElement = stackTrace[i];
                if (i == 0) {
                    ((LiveBroadcastPreviewFragment) this.l1).getContext();
                }
                sb.append("|");
                sb.append(stackTraceElement.toString());
            }
            strLIZLLL = sb.toString();
        }
        ((LiveBroadcastPreviewFragment) this.l1).getContext();
        C0UQX.LJIILLIIL(0, strLIZLLL, SystemClock.elapsedRealtime() - this.j2);
    }

    public final void LIZ$0() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("low device -> ICustomPollManager.enterInteractionRoom is invoked on ");
        sbLIZ.append(C786410Ut5.u3().getName());
        sbLIZ.append(" delay ");
        sbLIZ.append(SystemClock.elapsedRealtime() - this.j2);
        C20441214yg.LIZIZ("AbsInteractionFragment", C2188811AlT.LIZIZ(sbLIZ));
        ((InterfaceC464450IJf) this.l0).LIZ(((AbsAudienceInteractionFragment) this.l1).LLJILJIL);
    }

    public final void LIZ$1() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("low device -> GoodyBagService.getRoomGoodyBag is invoked on ");
        sbLIZ.append(C786410Ut5.u3().getName());
        sbLIZ.append(" delay ");
        sbLIZ.append(SystemClock.elapsedRealtime() - this.j2);
        C20441214yg.LIZIZ("AbsInteractionFragment", C2188811AlT.LIZIZ(sbLIZ));
        IGoodyBagService iGoodyBagService = (IGoodyBagService) this.l0;
        String idStr = ((AbsAudienceInteractionFragment) this.l1).LLJILJIL.getIdStr();
        AbsAudienceInteractionFragment absAudienceInteractionFragment = (AbsAudienceInteractionFragment) this.l1;
        iGoodyBagService.B51(idStr, absAudienceInteractionFragment.LLJIJIL, absAudienceInteractionFragment, absAudienceInteractionFragment.LLLLZIL);
    }

    public static final void run$0(ARunnableS12S0200100_7 aRunnableS12S0200100_7) {
        boolean zLIZ;
        C1C7U.LIZ("AbsAudienceInteractionFragment@61ad.enterInteractionRoom$1");
        try {
            aRunnableS12S0200100_7.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AbsAudienceInteractionFragment@61ad.enterInteractionRoom$1");
    }

    public static final void run$1(ARunnableS12S0200100_7 aRunnableS12S0200100_7) {
        LivePlayFragment livePlayFragment = (LivePlayFragment) aRunnableS12S0200100_7.l0;
        C0IEQ c0ieq = (C0IEQ) aRunnableS12S0200100_7.l1;
        long j = aRunnableS12S0200100_7.j2;
        String str = LivePlayFragment._pnsPageId;
        livePlayFragment.getClass();
        C1C7U.LIZ("LivePlayFragment@afba.startRoom$1L");
        if (c0ieq == null) {
            C1C7U.LIZIZ("LivePlayFragment@afba.startRoom$1L");
            return;
        }
        if (livePlayFragment.isAdded() && !livePlayFragment.isDetached() && livePlayFragment.getContext() != null && livePlayFragment.LLILLJJLI == j) {
            c0ieq.LIZ();
            C1C7U.LIZIZ("LivePlayFragment@afba.startRoom$1L");
            return;
        }
        synchronized (c0ieq.LIZ) {
            try {
                c0ieq.LIZLLL = true;
                c0ieq.LIZJ = false;
                c0ieq.LIZIZ.clear();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C1C7U.LIZIZ("LivePlayFragment@afba.startRoom$1L");
    }

    public static final void run$2(ARunnableS12S0200100_7 aRunnableS12S0200100_7) {
        AObjectS350S0100000_7 aObjectS350S0100000_7 = (AObjectS350S0100000_7) aRunnableS12S0200100_7.l0;
        long j = aRunnableS12S0200100_7.j2;
        C0IEU c0ieu = (C0IEU) aRunnableS12S0200100_7.l1;
        aObjectS350S0100000_7.getClass();
        C1C7U.LIZ("LivePlayFragment@afba.<field>$5$invoke$1L");
        LivePlayFragment livePlayFragment = (LivePlayFragment) aObjectS350S0100000_7.l0;
        if (j == livePlayFragment.LLILLJJLI && livePlayFragment.LLLLIILLL.LIZ.getWidth() > 0 && ((LivePlayFragment) aObjectS350S0100000_7.l0).LLLLIILLL.LIZ.getHeight() > 0) {
            LivePlayFragment livePlayFragment2 = (LivePlayFragment) aObjectS350S0100000_7.l0;
            C0IF9 c0if9 = livePlayFragment2.LLILZLL;
            c0if9.LIZLLL = true;
            c0if9.LJ = j;
            livePlayFragment2.tW();
        }
        if (c0ieu.LJIIIIZZ != null) {
            int[] iArr = new int[2];
            C0IEB c0ieb = ((LivePlayFragment) aObjectS350S0100000_7.l0).LLLFZ;
            if (c0ieb != null) {
                c0ieb.getVideoSize(iArr);
            }
            C937970aW3 c937970aW3 = new C937970aW3(iArr[0], iArr[1], c0ieu.LIZLLL, c0ieu.LIZJ, c0ieu.LIZ, c0ieu.LIZIZ, ((LivePlayFragment) aObjectS350S0100000_7.l0).LLLLIILLL.LIZ.getLeft(), ((LivePlayFragment) aObjectS350S0100000_7.l0).LLLLIILLL.LIZ.getTop(), ((LivePlayFragment) aObjectS350S0100000_7.l0).LLLLIILLL.LIZ.getWidth(), ((LivePlayFragment) aObjectS350S0100000_7.l0).LLLLIILLL.LIZ.getHeight());
            if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isOffline()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("mAudienceVideoViewParamsObserve,,streamSize =");
                sbLIZ.append(iArr);
                sbLIZ.append("expectedX =");
                sbLIZ.append(c0ieu.LIZLLL);
                sbLIZ.append("expectedY =");
                sbLIZ.append(c0ieu.LIZJ);
                sbLIZ.append("expectedW =");
                sbLIZ.append(c0ieu.LIZ);
                sbLIZ.append("expectedH =");
                sbLIZ.append(c0ieu.LIZIZ);
                sbLIZ.append("realX =");
                sbLIZ.append(((LivePlayFragment) aObjectS350S0100000_7.l0).LLLLIILLL.LIZ.getLeft());
                sbLIZ.append("realY =");
                sbLIZ.append(((LivePlayFragment) aObjectS350S0100000_7.l0).LLLLIILLL.LIZ.getTop());
                sbLIZ.append("realW =");
                sbLIZ.append(((LivePlayFragment) aObjectS350S0100000_7.l0).LLLLIILLL.LIZ.getWidth());
                sbLIZ.append("realH =");
                sbLIZ.append(((LivePlayFragment) aObjectS350S0100000_7.l0).LLLLIILLL.LIZ.getHeight());
                C20441214yg.LIZIZ("live_renderview", C2188811AlT.LIZIZ(sbLIZ));
            }
            c0ieu.LJIIIIZZ.zl(c937970aW3);
        }
        C1C7U.LIZIZ("LivePlayFragment@afba.<field>$5$invoke$1L");
    }

    public static final void run$3(ARunnableS12S0200100_7 aRunnableS12S0200100_7) {
        boolean zLIZ;
        C1C7U.LIZ("AbsAudienceInteractionFragment@61ad.lambda$loadGoodyBagWidetAfterGetAuth$94$1");
        try {
            aRunnableS12S0200100_7.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AbsAudienceInteractionFragment@61ad.lambda$loadGoodyBagWidetAfterGetAuth$94$1");
    }

    public static final void run$4(ARunnableS12S0200100_7 aRunnableS12S0200100_7) {
        boolean zLIZ;
        C1C7U.LIZ("LiveBroadcastPreviewFragment@146.requestCreateInfoInPreview$3$2");
        try {
            aRunnableS12S0200100_7.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveBroadcastPreviewFragment@146.requestCreateInfoInPreview$3$2");
    }

    public ARunnableS12S0200100_7(Object obj, long j, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.j2 = j;
        this.l1 = obj2;
    }
}
