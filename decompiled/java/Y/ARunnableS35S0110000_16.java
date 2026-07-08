package Y;

import X.AbstractC1908820zlw;
import X.C1016120cY6;
import X.C1032800cz0;
import X.C1388190mED;
import X.C1389890mGx;
import X.C1697810uHb;
import X.C1C7U;
import X.C21566519ah;
import X.C21566919al;
import X.C2187701Ajg;
import X.C2230608oa;
import X.InterfaceC1032600cyg;
import X.InterfaceC442640HXi;
import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.lifecycle.Lifecycle;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.tracker.TrackerImpl;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: loaded from: classes17.dex */
public class ARunnableS35S0110000_16 implements Runnable {
    public final int $t;
    public Object l0;
    public boolean z1;

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
            case 6:
                run$6(this);
                break;
            case 7:
                run$7(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        ViewTreeObserver viewTreeObserver;
        final TrackerImpl trackerImpl = (TrackerImpl) this.l0;
        final boolean z = this.z1;
        View view = trackerImpl.LLILZ;
        if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null) {
            return;
        }
        ViewTreeObserver.OnDrawListener onDrawListener = new ViewTreeObserver.OnDrawListener() { // from class: X.0btd
            @Override // android.view.ViewTreeObserver.OnDrawListener
            public final void onDraw() {
                TrackerImpl trackerImpl2 = trackerImpl;
                if (trackerImpl2.LLJI || trackerImpl2.LLJILJILJ || trackerImpl2.LL.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED || !trackerImpl.LJJJJZI()) {
                    return;
                }
                TrackerImpl trackerImpl3 = trackerImpl;
                new AwS560S0100000_16(trackerImpl3, 829);
                trackerImpl3.getClass();
                trackerImpl.LJJLIIIJ(System.currentTimeMillis(), z);
            }
        };
        viewTreeObserver.addOnDrawListener(onDrawListener);
        C2187701Ajg.LIZ(viewTreeObserver, onDrawListener, ViewTreeObserver.OnDrawListener.class);
        trackerImpl.LLJLLIL.put(onDrawListener, view);
        trackerImpl.LLJLL.put(onDrawListener, C1697810uHb.LJIILJJIL(viewTreeObserver));
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$2() {
        /*
            Method dump skipped, instruction units count: 499
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS35S0110000_16.LIZ$2():void");
    }

    public final void LIZ$1() {
        C2230608oa<Integer> privacyAccountFollowCount = SharePrefCache.inst().getPrivacyAccountFollowCount();
        Integer numLIZ = privacyAccountFollowCount.LIZ();
        if (numLIZ == null || numLIZ.intValue() != 0) {
            int iIntValue = numLIZ.intValue();
            if ((1 <= iIntValue && iIntValue < 4) || this.z1) {
                Activity activityLIZ = C1388190mED.LIZ(((AbstractC1908820zlw) this.l0).LL.getCtx());
                if (activityLIZ == null) {
                    "activity in RelationViewDelegate is null".toString();
                    throw new IllegalArgumentException("activity in RelationViewDelegate is null");
                }
                C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                c1389890mGx.LJIIIZ(2131845227);
                c1389890mGx.LJIIJJI();
            }
        } else {
            C21566919al c21566919al = new C21566919al(((AbstractC1908820zlw) this.l0).LL.getCtx());
            c21566919al.LIZ(2131845226);
            c21566919al.LJIIJ(2131835646, null, false);
            new C21566519ah(c21566919al).LIZLLL();
        }
        privacyAccountFollowCount.LJ(Integer.valueOf(numLIZ.intValue() + 1));
    }

    public static final void run$0(ARunnableS35S0110000_16 aRunnableS35S0110000_16) {
        boolean zLIZ;
        C1C7U.LIZ("TrackerImpl@f2d4.endRender$3");
        try {
            aRunnableS35S0110000_16.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TrackerImpl@f2d4.endRender$3");
    }

    public static final void run$1(ARunnableS35S0110000_16 aRunnableS35S0110000_16) {
        InterfaceC442640HXi interfaceC442640HXi = (InterfaceC442640HXi) aRunnableS35S0110000_16.l0;
        boolean z = aRunnableS35S0110000_16.z1;
        C1C7U.LIZ("FrescoCache@d725.hasCachedFileAsync$1L$1L");
        interfaceC442640HXi.onResult(Boolean.valueOf(z));
        C1C7U.LIZIZ("FrescoCache@d725.hasCachedFileAsync$1L$1L");
    }

    public static final void run$2(ARunnableS35S0110000_16 aRunnableS35S0110000_16) {
        InterfaceC442640HXi interfaceC442640HXi = (InterfaceC442640HXi) aRunnableS35S0110000_16.l0;
        boolean z = aRunnableS35S0110000_16.z1;
        C1C7U.LIZ("FrescoCache@d725.isInMemoryCacheAsync$3L$1L");
        interfaceC442640HXi.onResult(Boolean.valueOf(z));
        C1C7U.LIZIZ("FrescoCache@d725.isInMemoryCacheAsync$3L$1L");
    }

    public static final void run$3(ARunnableS35S0110000_16 aRunnableS35S0110000_16) {
        boolean zLIZ;
        C1C7U.LIZ("RelationViewDelegate@39c.popupOrToastForPrivacyAccount$1");
        try {
            aRunnableS35S0110000_16.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("RelationViewDelegate@39c.popupOrToastForPrivacyAccount$1");
    }

    public static final void run$4(ARunnableS35S0110000_16 aRunnableS35S0110000_16) {
        boolean zLIZ;
        C1C7U.LIZ("CommerceVideoDelegateKt@740c.showCommonAdLayoutOriginal$2");
        try {
            aRunnableS35S0110000_16.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CommerceVideoDelegateKt@740c.showCommonAdLayoutOriginal$2");
    }

    public static final void run$5(ARunnableS35S0110000_16 aRunnableS35S0110000_16) {
        boolean zLIZ;
        C1C7U.LIZ("FrescoCacheDetector@f0a1.checkIfInCache$2$1$1");
        try {
            ((InterfaceC1032600cyg) aRunnableS35S0110000_16.l0).LIZ(aRunnableS35S0110000_16.z1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FrescoCacheDetector@f0a1.checkIfInCache$2$1$1");
    }

    public static final void run$6(ARunnableS35S0110000_16 aRunnableS35S0110000_16) {
        boolean zLIZ;
        C1C7U.LIZ("GmtRewardAdManager@3447.taskCompleted$2");
        try {
            ((C1032800cz0) aRunnableS35S0110000_16.l0).notifyContainerEvent(new C1016120cY6(aRunnableS35S0110000_16.z1));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GmtRewardAdManager@3447.taskCompleted$2");
    }

    public static final void run$7(ARunnableS35S0110000_16 aRunnableS35S0110000_16) {
        InterfaceC442640HXi interfaceC442640HXi = (InterfaceC442640HXi) aRunnableS35S0110000_16.l0;
        boolean z = aRunnableS35S0110000_16.z1;
        C1C7U.LIZ("LightenHelper@aa44.isImageDownloadedAsync$2L$1L");
        interfaceC442640HXi.onResult(Boolean.valueOf(z));
        C1C7U.LIZIZ("LightenHelper@aa44.isImageDownloadedAsync$2L$1L");
    }

    public ARunnableS35S0110000_16(Object obj, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z1 = z;
    }

    public ARunnableS35S0110000_16(InterfaceC1032600cyg interfaceC1032600cyg, String str, boolean z, int i) {
        this.$t = i;
        this.l0 = interfaceC1032600cyg;
        this.z1 = z;
    }
}
