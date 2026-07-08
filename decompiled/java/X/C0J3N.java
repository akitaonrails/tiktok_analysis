package X;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.browser.ILiveSparkService;
import com.bytedance.android.livesdk.internal.Live;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarReuseOptimizeSetting;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.ies.sdk.widgets.recycleelement.RecycleLayeredElementManger;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.HashSet;
import kotlin.jvm.internal.AFwS237S0000000_7;

/* JADX INFO: renamed from: X.0J3N, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J3N {
    public static C0J3O LIZLLL;
    public static VelocityTracker LJ;
    public static float LJFF;
    public static float LJI;
    public static final C0J3N LIZ = new C0J3N();
    public static String LIZIZ = "";
    public static boolean LIZJ = true;
    public static boolean LJII = true;

    public static boolean LIZIZ() {
        InterfaceC20673515v3 interfaceC20673515v3K4 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4();
        return !interfaceC20673515v3K4.o1() && interfaceC20673515v3K4.getScreenOrientation() == 1;
    }

    public static void LIZLLL(Context context) {
        Activity activityLIZ;
        C0J3Y.LIZ.getClass();
        C0J3Y.LJIJ();
        RecycleLayeredElementManger.INSTANCE.release();
        C1AKK service = Live.getService();
        LifecycleOwner lifecycleOwner = null;
        if (context != null) {
            activityLIZ = C06MM.LIZ(context);
        } else {
            activityLIZ = null;
        }
        if (activityLIZ instanceof LifecycleOwner) {
            lifecycleOwner = (LifecycleOwner) activityLIZ;
        }
        service.LJJIJL(lifecycleOwner);
        ((ILiveSparkService) C1161920gLG.LIZJ(ILiveSparkService.class)).Nv1(false);
        ((HashSet) C0IH1.LIZ).clear();
    }

    public static boolean LJ(Aweme aweme) {
        long j;
        LiveRoomStruct newLiveRoomDataExt;
        if (aweme != null && (newLiveRoomDataExt = AwemeExtKt.getNewLiveRoomDataExt(aweme)) != null) {
            j = newLiveRoomDataExt.id;
        } else {
            j = 0;
        }
        long j2 = C0IUA.LIZLLL;
        if (j > 0 && j == j2) {
            return false;
        }
        return true;
    }

    public static void LJFF(MotionEvent motionEvent) {
        float xVelocity;
        float yVelocity;
        if (LJ == null) {
            LJ = VelocityTracker.obtain();
        }
        VelocityTracker velocityTracker = LJ;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        InterfaceC20673515v3 interfaceC20673515v3K4 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4();
        if (motionEvent != null) {
            if (motionEvent.getAction() == 0) {
                LJFF = motionEvent.getX();
                return;
            }
            if (2 == motionEvent.getAction()) {
                LJI = motionEvent.getX();
                return;
            }
            if (1 != motionEvent.getAction()) {
                return;
            }
            VelocityTracker velocityTracker2 = LJ;
            if (velocityTracker2 != null) {
                velocityTracker2.computeCurrentVelocity(LSPassThroughRecordSizeConfig.DEFAULT);
            }
            float f = LJFF;
            float f2 = LJI;
            VelocityTracker velocityTracker3 = LJ;
            if (velocityTracker3 != null) {
                xVelocity = velocityTracker3.getXVelocity();
            } else {
                xVelocity = 0.0f;
            }
            VelocityTracker velocityTracker4 = LJ;
            if (velocityTracker4 != null) {
                yVelocity = velocityTracker4.getYVelocity();
            } else {
                yVelocity = 0.0f;
            }
            interfaceC20673515v3K4.N6(f, f2, xVelocity, yVelocity);
            LJFF = 0.0f;
            LJI = 0.0f;
            VelocityTracker velocityTracker5 = LJ;
            if (velocityTracker5 != null) {
                velocityTracker5.clear();
            }
            VelocityTracker velocityTracker6 = LJ;
            if (velocityTracker6 != null) {
                velocityTracker6.recycle();
            }
            LJ = null;
        }
    }

    public static void LIZ(Context context, Fragment fragment) {
        int i;
        LifecycleOwner lifecycleOwner;
        C0J3Y.LIZ.getClass();
        C0J3Y.LJIIJJI(context);
        C477570Io7.LIZ.W7(context);
        C1AKK service = Live.getService();
        if (LiveToolbarReuseOptimizeSetting.INSTANCE.enable()) {
            i = 2;
        } else {
            i = 4;
        }
        service.LJIILJJIL(i, context);
        ((ILiveSparkService) C1161920gLG.LIZJ(ILiveSparkService.class)).mT1(false);
        ComponentCallbacks2 componentCallbacks2LIZ = C1388190mED.LIZ(context);
        if (componentCallbacks2LIZ != null) {
            Fragment detailSafRootFragment = ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).getDetailSafRootFragment(fragment);
            if (detailSafRootFragment != null) {
                if (detailSafRootFragment instanceof BaseFragment) {
                    ((BaseFragment) detailSafRootFragment).NR(AFwS237S0000000_7.get$arr$(242));
                }
                Live.getService().LJJJLZIJ(detailSafRootFragment);
                return;
            }
            if (componentCallbacks2LIZ instanceof BaseActivity) {
                ((BaseActivity) componentCallbacks2LIZ).activityConfiguration(AFwS237S0000000_7.get$arr$(243));
            }
            C1AKK service2 = Live.getService();
            if (componentCallbacks2LIZ instanceof LifecycleOwner) {
                lifecycleOwner = (LifecycleOwner) componentCallbacks2LIZ;
            } else {
                lifecycleOwner = null;
            }
            service2.LJJJLZIJ(lifecycleOwner);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0077 A[Catch: Exception -> 0x00e9, PHI: r2
      0x0077: PHI (r2v6 androidx.fragment.app.FragmentManager) = (r2v3 androidx.fragment.app.FragmentManager), (r2v7 androidx.fragment.app.FragmentManager) binds: [B:42:0x0075, B:32:0x005d] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x00e9, blocks: (B:4:0x0003, B:6:0x0009, B:8:0x0012, B:10:0x0018, B:11:0x0020, B:13:0x0026, B:15:0x002a, B:17:0x002e, B:20:0x0033, B:22:0x0037, B:24:0x003b, B:26:0x0043, B:28:0x0049, B:29:0x004b, B:31:0x0059, B:43:0x0077, B:44:0x007b, B:46:0x0092, B:47:0x0096, B:51:0x00ad, B:53:0x00b7, B:57:0x00ce, B:60:0x00de, B:54:0x00bb, B:37:0x0065, B:39:0x006b, B:41:0x0071), top: B:65:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C0IEG LIZJ(android.view.View r9, androidx.fragment.app.Fragment r10, com.bytedance.android.livesdkapi.session.EnterRoomConfig r11, int r12, int r13) {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0J3N.LIZJ(android.view.View, androidx.fragment.app.Fragment, com.bytedance.android.livesdkapi.session.EnterRoomConfig, int, int):X.0IEG");
    }
}
