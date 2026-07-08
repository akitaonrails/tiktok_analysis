package Y;

import X.C0WZX;
import X.C1177960gl8;
import X.C1178480gly;
import X.C1BS0;
import X.C1C7U;
import X.C2204961BRm;
import X.C2204971BRn;
import X.C2204981BRo;
import X.C2205091BRz;
import X.C2212071Bht;
import X.C2212141Bi0;
import X.InterfaceC2205021BRs;
import android.app.Notification;
import android.app.NotificationManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.maps.model.LatLng;
import com.ss.android.socialbase.downloader.notification.DownloadNotificationService;
import kotlin.jvm.internal.AFwS281S0000000_34;

/* JADX INFO: loaded from: classes35.dex */
public class ARunnableS18S0301000_34 implements Runnable {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

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
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x026f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$0() {
        /*
            Method dump skipped, instruction units count: 902
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS18S0301000_34.LIZ$0():void");
    }

    public final void LIZ$1() throws Throwable {
        C2204971BRn c2204971BRn = new C2204971BRn();
        for (C1177960gl8 c1177960gl8 : (C1177960gl8[]) this.l2) {
            C2204961BRm.LLLLLLZZ(c2204971BRn, new LatLng(c1177960gl8.lat, c1177960gl8.lon), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOepc9HN0yDVHkdQvRCEcOY+CmR5z2qoX/E=", null));
        }
        C2204981BRo c2204981BRoLLLLLLL = C2204961BRm.LLLLLLL(c2204971BRn.LIZ(), this.i3, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOepc9HN0yDVHkdQvRCEcOY+CmR5z2qoX/E=", null));
        final C1178480gly c1178480gly = (C1178480gly) this.l0;
        final C1BS0 c1bs0 = (C1BS0) this.l1;
        InterfaceC2205021BRs interfaceC2205021BRs = new InterfaceC2205021BRs() { // from class: X.1BRw
            /* JADX WARN: Type inference failed for: r0v2, types: [X.09AY, kotlin.jvm.functions.Function0] */
            @Override // X.InterfaceC2205021BRs
            public final void LIZLLL() {
                ?? r0;
                C1178480gly c1178480gly2 = c1178480gly;
                if (c1178480gly2 != null && (r0 = c1178480gly2.LIZJ) != 0) {
                    r0.invoke();
                }
                c1bs0.LIZLLL = false;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [X.09AY, kotlin.jvm.functions.Function0] */
            @Override // X.InterfaceC2205021BRs
            public final void onCancel() {
                ?? r0;
                C1178480gly c1178480gly2 = c1178480gly;
                if (c1178480gly2 != null && (r0 = c1178480gly2.LIZLLL) != 0) {
                    r0.invoke();
                }
                c1bs0.LIZLLL = false;
            }
        };
        if (c1178480gly != null) {
            if (c1178480gly.LIZ && (!c1bs0.LIZLLL)) {
                c1bs0.LIZLLL = true;
                c1bs0.LJIL(c2204981BRoLLLLLLL, c1178480gly.LIZIZ, interfaceC2205021BRs);
                return;
            } else if (c1178480gly.LIZ && c1bs0.LIZLLL) {
                C2205091BRz c2205091BRz = C2205091BRz.LIZ;
                c2205091BRz.getClass();
                c2205091BRz.LIZJ("google_map_anim_camera_recall", AFwS281S0000000_34.get$arr$(61));
            }
        }
        c1bs0.LJJ(c2204981BRoLLLLLLL);
    }

    public static final void run$0(ARunnableS18S0301000_34 aRunnableS18S0301000_34) {
        boolean zLIZ;
        C1C7U.LIZ("MinisFragment@a9ca.onMinisLoadError$1$1");
        try {
            aRunnableS18S0301000_34.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MinisFragment@a9ca.onMinisLoadError$1$1");
    }

    public static final void run$1(ARunnableS18S0301000_34 aRunnableS18S0301000_34) {
        boolean zLIZ;
        C1C7U.LIZ("GoogleMapHandler@f4b9.moveCamera$4");
        try {
            aRunnableS18S0301000_34.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GoogleMapHandler@f4b9.moveCamera$4");
    }

    public static final void run$2(ARunnableS18S0301000_34 aRunnableS18S0301000_34) {
        boolean zLIZ;
        C1C7U.LIZ("DownloadNotificationService@f064.handleIntent$1$1");
        try {
            DownloadNotificationService downloadNotificationService = (DownloadNotificationService) ((ARunnableS36S1200000_34) aRunnableS18S0301000_34.l2).l2;
            NotificationManager notificationManager = (NotificationManager) aRunnableS18S0301000_34.l0;
            int i = aRunnableS18S0301000_34.i3;
            Notification notification = (Notification) aRunnableS18S0301000_34.l1;
            downloadNotificationService.getClass();
            DownloadNotificationService.LIZJ(notificationManager, i, notification);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DownloadNotificationService@f064.handleIntent$1$1");
    }

    public static final void run$3(ARunnableS18S0301000_34 aRunnableS18S0301000_34) {
        C2212071Bht c2212071Bht = (C2212071Bht) aRunnableS18S0301000_34.l0;
        long[] jArr = (long[]) aRunnableS18S0301000_34.l1;
        long[][] jArr2 = (long[][]) aRunnableS18S0301000_34.l2;
        int i = aRunnableS18S0301000_34.i3;
        c2212071Bht.getClass();
        C1C7U.LIZ("SplashAdCallBackManager@93f5.callBackSplashAdAndTimePeriod$1L");
        try {
            C2212071Bht.LIZJ(C2212141Bi0.LJIIIIZZ().LJIIL(), jArr, jArr2, false, i);
            C2212071Bht.LIZJ(C2212141Bi0.LJIIIIZZ().LIZJ.LIZLLL("splash_ad_first_show_data"), jArr, jArr2, true, i);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        C1C7U.LIZIZ("SplashAdCallBackManager@93f5.callBackSplashAdAndTimePeriod$1L");
    }

    public ARunnableS18S0301000_34(C2212071Bht c2212071Bht, long[] jArr, long[][] jArr2, int i) {
        this.$t = i;
        this.l0 = c2212071Bht;
        this.l1 = jArr;
        this.l2 = jArr2;
        this.i3 = 10016;
    }

    public ARunnableS18S0301000_34(int i, Object obj, Object obj2, Object obj3, int i2) {
        this.$t = i2;
        this.i3 = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
