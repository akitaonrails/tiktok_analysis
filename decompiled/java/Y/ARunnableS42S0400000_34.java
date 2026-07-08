package Y;

import X.C0W3J;
import X.C1177960gl8;
import X.C1178480gly;
import X.C1B72;
import X.C1BS0;
import X.C1C7U;
import X.C2204981BRo;
import X.C2204991BRp;
import X.C2205091BRz;
import X.C2214041Bl4;
import X.C2214051Bl5;
import X.C2238251Cj1;
import X.C637220Oz2;
import X.C829150Wfp;
import X.InterfaceC2205021BRs;
import X.InterfaceC2205031BRt;
import android.os.RemoteException;
import android.util.SparseArray;
import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.maps.model.LatLng;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.profilebanner.data.ProfileBannerModel;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.AFwS281S0000000_34;

/* JADX INFO: loaded from: classes35.dex */
public class ARunnableS42S0400000_34 implements Runnable {
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
            case 6:
                run$6(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x034d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$0() {
        /*
            Method dump skipped, instruction units count: 1157
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS42S0400000_34.LIZ$0():void");
    }

    public final void LIZ$1() {
        SparseArray sparseArray;
        SparseArray sparseArray2 = (SparseArray) this.l0;
        if (sparseArray2 != null) {
            synchronized (sparseArray2) {
                for (int i = 0; i < ((SparseArray) this.l0).size(); i++) {
                    try {
                        IDownloadListener iDownloadListener = (IDownloadListener) ((SparseArray) this.l0).get(((SparseArray) this.l0).keyAt(i));
                        if (iDownloadListener != null) {
                            iDownloadListener.onCanceled((DownloadInfo) this.l1);
                            ((DownloadTask) this.l2).removeCallback(C1B72.MAIN, iDownloadListener);
                        }
                    } finally {
                    }
                }
            }
        }
        DownloadInfo downloadInfo = (DownloadInfo) this.l1;
        if (downloadInfo == null || !downloadInfo.canShowNotification() || (sparseArray = (SparseArray) this.l3) == null) {
            return;
        }
        synchronized (sparseArray) {
            for (int i2 = 0; i2 < ((SparseArray) this.l3).size(); i2++) {
                try {
                    IDownloadListener iDownloadListener2 = (IDownloadListener) ((SparseArray) this.l3).get(((SparseArray) this.l3).keyAt(i2));
                    if (iDownloadListener2 != null) {
                        iDownloadListener2.onCanceled((DownloadInfo) this.l1);
                        ((DownloadTask) this.l2).removeCallback(C1B72.NOTIFICATION, iDownloadListener2);
                    }
                } finally {
                }
            }
        }
    }

    public final void LIZ$2() {
        SparseArray sparseArray;
        SparseArray sparseArray2 = (SparseArray) this.l0;
        if (sparseArray2 != null) {
            synchronized (sparseArray2) {
                for (int i = 0; i < ((SparseArray) this.l0).size(); i++) {
                    try {
                        IDownloadListener iDownloadListener = (IDownloadListener) ((SparseArray) this.l0).get(((SparseArray) this.l0).keyAt(i));
                        if (iDownloadListener != null) {
                            iDownloadListener.onCanceled((DownloadInfo) this.l1);
                            ((DownloadTask) this.l2).removeCallback(C1B72.MAIN, iDownloadListener);
                        }
                    } finally {
                    }
                }
            }
        }
        DownloadInfo downloadInfo = (DownloadInfo) this.l1;
        if (downloadInfo == null || !downloadInfo.canShowNotification() || (sparseArray = (SparseArray) this.l3) == null) {
            return;
        }
        synchronized (sparseArray) {
            for (int i2 = 0; i2 < ((SparseArray) this.l3).size(); i2++) {
                try {
                    IDownloadListener iDownloadListener2 = (IDownloadListener) ((SparseArray) this.l3).get(((SparseArray) this.l3).keyAt(i2));
                    if (iDownloadListener2 != null) {
                        iDownloadListener2.onCanceled((DownloadInfo) this.l1);
                        ((DownloadTask) this.l2).removeCallback(C1B72.NOTIFICATION, iDownloadListener2);
                    }
                } finally {
                }
            }
        }
    }

    public final void LIZ$3() {
        if (((IDownloadListener) this.l0) != null) {
            if (((DownloadInfo) this.l1).getStatus() == -3) {
                ((IDownloadListener) this.l0).onSuccessed((DownloadInfo) this.l1);
                ((DownloadTask) this.l2).removeCallback((C1B72) this.l3, (IDownloadListener) this.l0);
            } else if (((DownloadInfo) this.l1).getStatus() == -1) {
                ((IDownloadListener) this.l0).onFailed((DownloadInfo) this.l1, new BaseException(LSPassThroughRecordSizeConfig.DEFAULT, "try add listener for failed task"));
                ((DownloadTask) this.l2).removeCallback((C1B72) this.l3, (IDownloadListener) this.l0);
            }
        }
    }

    public final void LIZ$4() {
        Float f = (Float) this.l0;
        float fFloatValue = f != null ? f.floatValue() : ((C1BS0) this.l1).LJIJJ();
        C1177960gl8 c1177960gl8 = (C1177960gl8) this.l2;
        LatLng latLng = new LatLng(c1177960gl8.lat, c1177960gl8.lon);
        try {
            InterfaceC2205031BRt interfaceC2205031BRt = C2204991BRp.LIZ;
            C0W3J.LJIIIZ(interfaceC2205031BRt, "CameraUpdateFactory is not initialized");
            C2204981BRo c2204981BRo = new C2204981BRo(interfaceC2205031BRt.LLLLJI(latLng, fFloatValue));
            final C1178480gly c1178480gly = (C1178480gly) this.l3;
            final C1BS0 c1bs0 = (C1BS0) this.l1;
            InterfaceC2205021BRs interfaceC2205021BRs = new InterfaceC2205021BRs() { // from class: X.1BRv
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
                    c1bs0.LJIL(c2204981BRo, c1178480gly.LIZIZ, interfaceC2205021BRs);
                    return;
                } else if (c1178480gly.LIZ && c1bs0.LIZLLL) {
                    C2205091BRz c2205091BRz = C2205091BRz.LIZ;
                    c2205091BRz.getClass();
                    c2205091BRz.LIZJ("google_map_anim_camera_recall", AFwS281S0000000_34.get$arr$(61));
                }
            }
            c1bs0.LJJ(c2204981BRo);
            if (c1178480gly == null || !c1178480gly.LJ) {
                return;
            }
            interfaceC2205021BRs.LIZLLL();
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new C829150Wfp(e);
        }
    }

    public static final void run$0(ARunnableS42S0400000_34 aRunnableS42S0400000_34) {
        boolean zLIZ;
        C1C7U.LIZ("VideoQualityThreadUtil@6628.invokeAtFrontUninterruptibly$5");
        try {
            try {
                ((C2214051Bl5) aRunnableS42S0400000_34.l0).LIZ = ((Callable) aRunnableS42S0400000_34.l1).call();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                ((C2214041Bl4) aRunnableS42S0400000_34.l2).LIZ = e;
            }
            ((CountDownLatch) aRunnableS42S0400000_34.l3).countDown();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("VideoQualityThreadUtil@6628.invokeAtFrontUninterruptibly$5");
    }

    public static final void run$1(ARunnableS42S0400000_34 aRunnableS42S0400000_34) {
        boolean zLIZ;
        C1C7U.LIZ("ReRankCallback@1218.onSuccess$2");
        try {
            aRunnableS42S0400000_34.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ReRankCallback@1218.onSuccess$2");
    }

    public static final void run$2(ARunnableS42S0400000_34 aRunnableS42S0400000_34) {
        boolean zLIZ;
        C1C7U.LIZ("AbsDownloadEngine@9f1b.cancel$1");
        try {
            aRunnableS42S0400000_34.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AbsDownloadEngine@9f1b.cancel$1");
    }

    public static final void run$3(ARunnableS42S0400000_34 aRunnableS42S0400000_34) {
        boolean zLIZ;
        C1C7U.LIZ("AbsDownloadEngine@9f1b.cancelImpl$1");
        try {
            aRunnableS42S0400000_34.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AbsDownloadEngine@9f1b.cancelImpl$1");
    }

    public static final void run$4(ARunnableS42S0400000_34 aRunnableS42S0400000_34) {
        boolean zLIZ;
        C1C7U.LIZ("AbsDownloadEngine@9f1b.addDownloadListenerImpl$1");
        try {
            aRunnableS42S0400000_34.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AbsDownloadEngine@9f1b.addDownloadListenerImpl$1");
    }

    public static final void run$5(ARunnableS42S0400000_34 aRunnableS42S0400000_34) {
        boolean zLIZ;
        C1C7U.LIZ("GoogleMapHandler@f4b9.moveCamera$1");
        try {
            aRunnableS42S0400000_34.LIZ$4();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GoogleMapHandler@f4b9.moveCamera$1");
    }

    public static final void run$6(ARunnableS42S0400000_34 aRunnableS42S0400000_34) {
        boolean zLIZ;
        C1C7U.LIZ("ProfileBannerPrioritizer@3469.decide$1$1");
        try {
            if (((ProfileBannerModel) aRunnableS42S0400000_34.l0) != null) {
                C2238251Cj1 c2238251Cj1 = (C2238251Cj1) aRunnableS42S0400000_34.l1;
                if (c2238251Cj1 == null || !c2238251Cj1.LIZLLL((ProfileBannerModel) aRunnableS42S0400000_34.l0)) {
                    C637220Oz2 c637220Oz2 = (C637220Oz2) aRunnableS42S0400000_34.l2;
                    Fragment fragment = (Fragment) aRunnableS42S0400000_34.l3;
                    c637220Oz2.getClass();
                    C637220Oz2.LIZ(fragment);
                }
            } else {
                C637220Oz2 c637220Oz22 = (C637220Oz2) aRunnableS42S0400000_34.l2;
                Fragment fragment2 = (Fragment) aRunnableS42S0400000_34.l3;
                c637220Oz22.getClass();
                C637220Oz2.LIZ(fragment2);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ProfileBannerPrioritizer@3469.decide$1$1");
    }

    public ARunnableS42S0400000_34(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}
