package X;

import Y.ACallableS434S0100000_31;
import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.widget.Toast;
import androidx.lifecycle.LiveData;
import com.bytedance.tux.common.live_data.NextLiveData;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15hm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20591215hm implements InterfaceC20528082k {
    public static final C20591215hm LIZ = new C20591215hm();
    public static int LIZIZ = -1;
    public static int LIZJ = -1;
    public static long LIZLLL = -1;
    public static final ArrayList<String> LJ = C1697810uHb.LJ("com.ss.android.ugc.aweme.feed.landscape.LandscapeFeedActivity", "com.ss.android.ugc.aweme.feed.landscape.Landscape270FeedActivity", "com.ss.android.ugc.aweme.live.LivePlayActivity", "com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity", "com.bytedance.hybrid.spark.page.SparkActivity", "com.ss.android.ugc.aweme.live.LiveBgBroadcastActivity");

    @Override // X.InterfaceC20528082k
    public final void LIZIZ() {
        C20591515hp.LIZ.getClass();
        int i = C20591515hp.LIZLLL;
        if (i > 0) {
            int i2 = i - 1;
            C20591515hp.LIZLLL = i2;
            if (i2 == 0) {
                C20591515hp.LIZ();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035 A[PHI: r1
      0x0035: PHI (r1v13 X.15ms) = (r1v17 X.15ms), (r1v18 X.15ms) binds: [B:29:0x0059, B:17:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0073 A[PHI: r1
      0x0073: PHI (r1v6 X.15ms) = (r1v19 X.15ms), (r1v20 X.15ms) binds: [B:51:0x0097, B:39:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZLLL(android.app.Activity r3) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20591215hm.LIZLLL(android.app.Activity):void");
    }

    public static void LJFF(Activity activity) {
        Activity activity2;
        View decorView;
        Activity activity3;
        View decorView2;
        LiveData liveData;
        WeakReference<Activity> weakReference;
        WeakReference<Activity> weakReference2;
        Activity activity4;
        Activity activity5 = null;
        C1389350mG5 c1389350mG5LIZJ = C1389340mG4.LIZJ(activity, null);
        Rect rect = new Rect(0, 0, c1389350mG5LIZJ.LIZIZ, c1389350mG5LIZJ.LIZJ);
        C20590915hj c20590915hj = C20589915hZ.LIZ;
        WeakReference<Activity> weakReference3 = c20590915hj.LL;
        if (weakReference3 != null) {
            activity2 = weakReference3.get();
        } else {
            activity2 = null;
        }
        if (!Intrinsics.LJFF(activity2, activity)) {
            c20590915hj.LL = new WeakReference<>(activity);
        }
        C20591715hr c20591715hr = C20591715hr.LIZ;
        if (!c20591715hr.isPad() && !c20591715hr.LIZ()) {
            if (c20591715hr.isDebug() && (weakReference2 = c20590915hj.LL) != null && weakReference2.get() != null) {
                WeakReference<Activity> weakReference4 = c20590915hj.LL;
                if (weakReference4 != null) {
                    activity4 = weakReference4.get();
                } else {
                    activity4 = null;
                }
                C786410Ut5.re(Toast.makeText(activity4, "Error:only support pad or fold!", 0));
            }
        } else {
            Window window = activity.getWindow();
            if (window != null && (decorView = window.getDecorView()) != null && C20591015hk.LIZLLL(decorView) == null) {
                c20590915hj.LIZIZ(EnumC20591315hn.ALL, decorView, rect, rect);
            }
        }
        C20590815hi c20590815hi = C20589915hZ.LIZIZ;
        if (!Intrinsics.LJFF(c20590915hj, c20590815hi)) {
            c20590815hi.getClass();
            WeakReference<Activity> weakReference5 = C20590815hi.LLILLJJLI;
            if (weakReference5 != null) {
                activity3 = weakReference5.get();
            } else {
                activity3 = null;
            }
            if (!Intrinsics.LJFF(activity3, activity)) {
                C20590815hi.LLILLJJLI = new WeakReference<>(activity);
            }
            Window window2 = activity.getWindow();
            if (window2 != null && (decorView2 = window2.getDecorView()) != null) {
                Object obj = C20591015hk.LJFF(decorView2).get(Integer.valueOf(R.id.z1u));
                if ((obj instanceof View.OnLayoutChangeListener) && obj != null) {
                    return;
                }
                if (!c20591715hr.isPad() && !c20591715hr.LIZ()) {
                    if (!c20591715hr.isDebug() || (weakReference = C20590815hi.LLILLJJLI) == null || weakReference.get() == null) {
                        return;
                    }
                    WeakReference<Activity> weakReference6 = C20590815hi.LLILLJJLI;
                    if (weakReference6 != null) {
                        activity5 = weakReference6.get();
                    }
                    C786410Ut5.re(Toast.makeText(activity5, "Error:only support pad or fold!", 0));
                    return;
                }
                float f = ((DisplayMetrics) C20590815hi.LLILLL.getValue()).density;
                int iWidth = rect.width();
                int iHeight = rect.height();
                if (f > 0.0f && iWidth > 0 && iHeight > 0) {
                    EnumC20591315hn enumC20591315hnOr = EnumC20591315hn.NONE;
                    if (iWidth != rect.width()) {
                        enumC20591315hnOr = enumC20591315hnOr.or(EnumC20591315hn.HORIZONTAL);
                    }
                    if (iHeight != rect.height()) {
                        enumC20591315hnOr = enumC20591315hnOr.or(EnumC20591315hn.VERTICAL);
                    }
                    C20591115hl c20591115hlLIZJ = C20591015hk.LIZJ(decorView2);
                    C20591115hl c20591115hl = new C20591115hl(enumC20591315hnOr, new C19389510tR(iWidth / f, iHeight / f), c20591115hlLIZJ.LIZJ, c20591115hlLIZJ.LIZLLL, c20591115hlLIZJ.LJ, c20591115hlLIZJ.LJFF, c20591115hlLIZJ.LJI, c20591115hlLIZJ.LJII, c20591115hlLIZJ.LJIIIIZZ, c20591115hlLIZJ.LJIIIZ, c20591115hlLIZJ.LJIIJ, new WeakReference(decorView2));
                    C20590215hc c20590215hc = C20590915hj.LLILLL;
                    if (C0T4G.LIZ(decorView2) != null) {
                        C20591015hk.LIZIZ.put(Integer.valueOf(System.identityHashCode(decorView2)), c20591115hl);
                    }
                    Object obj2 = C20591015hk.LJFF(decorView2).get(Integer.valueOf(R.id.z1x));
                    if ((obj2 instanceof NextLiveData) && (liveData = (LiveData) obj2) != null) {
                        liveData.postValue(c20591115hl);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("onViewSizeUpdate: updateLiveData updateOrientation=");
                        sbLIZ.append(enumC20591315hnOr);
                        C2188811AlT.LIZIZ(sbLIZ);
                        return;
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("onViewSizeUpdate: No LiveData updateOrientation=");
                    sbLIZ2.append(enumC20591315hnOr);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    return;
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("updateViewSize: size error! density=");
                sbLIZ3.append(f);
                sbLIZ3.append(",width=");
                sbLIZ3.append(iWidth);
                sbLIZ3.append(",height=");
                sbLIZ3.append(iHeight);
                C2188811AlT.LIZIZ(sbLIZ3);
            }
        }
    }

    @Override // X.InterfaceC20528082k
    public final void LIZ(Activity activity) {
        C20591515hp.LIZ.getClass();
        if (!C20591515hp.LJ) {
            C20593115i5.LIZ.getClass();
            C20591515hp.LIZJ = C20593115i5.LIZIZ(activity);
            C20591515hp.LJ = true;
        }
        if (C20591515hp.LIZLLL <= 0) {
            C20591515hp.LIZIZ = SystemClock.uptimeMillis();
            C20593115i5.LIZ.getClass();
            C20591515hp.LIZJ = C20593115i5.LIZIZ(activity);
            C20591515hp.LIZLLL = 0;
        }
        C20591515hp.LIZLLL++;
    }

    @Override // X.InterfaceC20528082k
    public final void LIZJ(Activity activity, Bundle bundle) {
        int requestedOrientation = activity.getRequestedOrientation();
        int i = LIZIZ;
        if (i != requestedOrientation) {
            if (i != -1) {
                C1389340mG4.LIZJ(activity, null);
                C14KQ.LIZ = -1;
                C14KQ.LIZIZ = -1;
                C1E95.LIZIZ.LJIL();
            }
            LIZIZ = requestedOrientation;
        }
        LJFF(activity);
        C15O7.LIZJ(new ACallableS434S0100000_31(activity, 0));
    }

    @Override // X.InterfaceC20528082k
    public final void onConfigurationChanged(Activity activity, Configuration configuration) {
        DisplayMetrics displayMetrics;
        int i;
        Configuration configuration2;
        int iLIZ = C341940Daq.LIZ(configuration.screenWidthDp);
        Resources resources = activity.getResources();
        if (resources != null) {
            displayMetrics = resources.getDisplayMetrics();
        } else {
            displayMetrics = null;
        }
        if (displayMetrics != null) {
            i = displayMetrics.widthPixels;
        } else {
            i = 0;
        }
        Resources resources2 = activity.getResources();
        if (resources2 == null || (configuration2 = resources2.getConfiguration()) == null || configuration.orientation != configuration2.orientation || Math.abs(iLIZ - i) > 100) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LIZJ(iLIZ, "config_width_dp");
            c2344009Gk.LIZJ(i, "activity_width_dp");
            C20684815ws.LJIILLIIL("tablet_screen_size_not_update", c2344009Gk.LIZ);
        }
        C1389340mG4.LIZJ(activity, null);
        C14KQ.LIZ = -1;
        C14KQ.LIZIZ = -1;
        C1E95.LIZIZ.LJIL();
        C20591515hp.LIZ.getClass();
        if (C20591515hp.LIZLLL > 0) {
            C20593115i5.LIZ.getClass();
            int iLIZIZ = C20593115i5.LIZIZ(activity);
            if (iLIZIZ != C20591515hp.LIZJ) {
                C20591515hp.LIZ();
                C20591515hp.LIZJ = iLIZIZ;
            }
        }
        Bundle bundle = new Bundle();
        C20593215i6.LIZ(bundle, activity, configuration);
        AppLog.setCustomerHeader(bundle);
        LJ(configuration.orientation, activity, "on_config_change");
        LIZLLL(activity);
        LJFF(activity);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJ(int i, Activity activity, String str) {
        Object obj;
        int i2 = LIZJ;
        if (i2 == -1) {
            LIZJ = i;
            LIZLLL = System.currentTimeMillis();
            return;
        }
        if (i2 != i) {
            long j = -1;
            if (Intrinsics.LJFF(str, "on_config_change")) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j2 = LIZLLL;
                if (j2 != -1) {
                    j = (jCurrentTimeMillis - j2) / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                }
                LIZLLL = jCurrentTimeMillis;
            }
            boolean z = activity instanceof InterfaceC214897198d;
            Object obj2 = activity;
            if (z) {
                Object objLIZJ = C20629915o1.LIZJ((InterfaceC20622815ms) activity);
                obj2 = activity;
                if (objLIZJ != null) {
                    obj2 = objLIZJ;
                }
            }
            C2241008qG c2241008qG = new C2241008qG();
            c2241008qG.LIZ.put("page_name", obj2.getClass().getSimpleName());
            c2241008qG.LIZ.put("class_name", obj2.getClass().getCanonicalName());
            String str2 = "3";
            if (LIZJ == 2) {
                obj = "3";
            } else {
                obj = "1";
            }
            c2241008qG.LIZ.put("last_orientation", obj);
            if (i != 2) {
                str2 = "1";
            }
            c2241008qG.LIZ.put("now_orientation", str2);
            c2241008qG.LIZ.put("enter_method", str);
            c2241008qG.LIZ.put("rotation_interval_duration", Long.valueOf(j));
            C20684815ws.LJIJ("screen_rotate", c2241008qG.LJ());
            LIZJ = i;
        }
    }
}
