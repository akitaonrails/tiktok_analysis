package X;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.text.TextUtils;
import android.view.VelocityTracker;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.SAFTikTokFragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.browser.ILiveSparkService;
import com.bytedance.android.livesdk.internal.Live;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarReuseOptimizeSetting;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.ies.sdk.widgets.recycleelement.RecycleLayeredElementManger;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.search.ISearchService;
import java.util.HashMap;
import java.util.HashSet;
import kotlin.jvm.internal.AFwS237S0000000_7;

/* JADX INFO: renamed from: X.0J3P, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J3P {
    public static C0J3O LIZIZ;
    public static VelocityTracker LIZLLL;
    public static float LJ;
    public static float LJFF;
    public static boolean LJIIIZ;
    public static final C0J3P LIZ = new C0J3P();
    public static String LIZJ = "";
    public static boolean LJI = true;
    public static boolean LJII = true;
    public static String LJIIIIZZ = "";
    public static final HashMap<String, C0J3T> LJIIJ = new HashMap<>();

    public static boolean LIZLLL() {
        InterfaceC20673515v3 interfaceC20673515v3K4 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4();
        return !interfaceC20673515v3K4.o1() && interfaceC20673515v3K4.getScreenOrientation() == 1;
    }

    public static String LIZ(Aweme aweme) {
        if (!TextUtils.isEmpty(LIZJ)) {
            return LIZJ;
        }
        String strLLLLZLL = ((ISearchService) ServiceManager.get().getService(ISearchService.class)).LLLLZLL(aweme);
        LIZJ = strLLLLZLL;
        return strLLLLZLL;
    }

    public static C0J3T LIZIZ(Aweme aweme) {
        String aid;
        if (aweme == null || (aid = aweme.getAid()) == null) {
            return null;
        }
        return LJIIJ.get(aid);
    }

    public static void LJI(Context context) {
        Activity activityLIZ;
        C0J3Y.LIZ.getClass();
        C0J3Y.LJIJ();
        RecycleLayeredElementManger.INSTANCE.release();
        C467800IWc.LJIJ.LIZ();
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

    public static boolean LJII(Aweme aweme) {
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

    public static void LIZJ(Context context, Fragment fragment) {
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
                if (detailSafRootFragment instanceof SAFTikTokFragment) {
                    ((SAFTikTokFragment) detailSafRootFragment).aS(AFwS237S0000000_7.get$arr$(240));
                }
                Live.getService().LJJJLZIJ(detailSafRootFragment);
                return;
            }
            if (componentCallbacks2LIZ instanceof BaseActivity) {
                ((BaseActivity) componentCallbacks2LIZ).activityConfiguration(AFwS237S0000000_7.get$arr$(241));
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

    /* JADX WARN: Removed duplicated region for block: B:47:0x0092 A[Catch: Exception -> 0x0139, PHI: r2
      0x0092: PHI (r2v6 androidx.fragment.app.FragmentManager) = (r2v2 androidx.fragment.app.FragmentManager), (r2v7 androidx.fragment.app.FragmentManager) binds: [B:46:0x0090, B:36:0x0078] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x0139, blocks: (B:4:0x0005, B:6:0x000b, B:8:0x0014, B:10:0x001a, B:11:0x0022, B:13:0x0032, B:15:0x0038, B:17:0x003e, B:19:0x0044, B:21:0x0048, B:23:0x004c, B:24:0x004e, B:26:0x0052, B:28:0x0056, B:30:0x005e, B:32:0x0064, B:33:0x0066, B:35:0x0074, B:47:0x0092, B:48:0x0096, B:50:0x00b0, B:51:0x00b4, B:55:0x00cb, B:57:0x00d5, B:61:0x00ec, B:65:0x0108, B:67:0x010c, B:69:0x0110, B:72:0x011a, B:74:0x0120, B:63:0x00fc, B:58:0x00d9, B:41:0x0080, B:43:0x0086, B:45:0x008c), top: B:79:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C0IEG LJ(android.view.View r11, androidx.fragment.app.Fragment r12, com.bytedance.android.livesdkapi.session.EnterRoomConfig r13, int r14, int r15) {
        /*
            Method dump skipped, instruction units count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0J3P.LJ(android.view.View, androidx.fragment.app.Fragment, com.bytedance.android.livesdkapi.session.EnterRoomConfig, int, int):X.0IEG");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.bytedance.android.livesdkapi.session.EnterRoomConfig LJFF(com.ss.android.ugc.aweme.feed.model.Aweme r28, java.lang.String r29, boolean r30, java.lang.String r31, X.C2189821An6 r32) {
        /*
            Method dump skipped, instruction units count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0J3P.LJFF(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, boolean, java.lang.String, X.1An6):com.bytedance.android.livesdkapi.session.EnterRoomConfig");
    }
}
