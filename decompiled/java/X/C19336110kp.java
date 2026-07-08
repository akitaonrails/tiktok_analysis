package X;

import Y.AfS162S0200000_28;
import android.app.Activity;
import android.text.TextUtils;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.touchpoint.api.model.TouchPoint;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import com.ss.android.ugc.aweme.utils.StorageCleanConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.10kp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public class C19336110kp implements InterfaceC1478005qU {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1478005qU
    public final void subscribe(C09AJ<TouchPoint> c09aj) throws Exception {
        switch (this.$t) {
            case 0:
                subscribe$0(this, c09aj);
                break;
            case 1:
                subscribe$1(this, c09aj);
                break;
            case 2:
                subscribe$2(this, c09aj);
                break;
            case 3:
                subscribe$3(this, c09aj);
                break;
            case 4:
                subscribe$4(this, c09aj);
                break;
            case 5:
                subscribe$5(this, c09aj);
                break;
        }
    }

    public C19336110kp(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void subscribe$0(X.C19336110kp r11, X.C09AJ r12) {
        /*
            java.lang.String r3 = "BaseTimerPendantManager@8265.clickBubbleAction$1"
            X.C1C7U.LIZ(r3)
            r1 = 0
            X.0sFe r0 = X.C1619720sFe.LIZ     // Catch: java.lang.InterruptedException -> L3e java.util.concurrent.ExecutionException -> L43 java.lang.Exception -> L48
            X.0zTI r0 = r0.LIZIZ()     // Catch: java.lang.InterruptedException -> L3e java.util.concurrent.ExecutionException -> L43 java.lang.Exception -> L48
            if (r0 == 0) goto L4c
            com.bytedance.touchpoint.api.interfaces.INetworkApi r4 = r0.LIZJ()     // Catch: java.lang.InterruptedException -> L3e java.util.concurrent.ExecutionException -> L43 java.lang.Exception -> L48
            if (r4 == 0) goto L4c
            java.lang.Object r0 = r11.l0     // Catch: java.lang.InterruptedException -> L3e java.util.concurrent.ExecutionException -> L43 java.lang.Exception -> L48
            com.bytedance.touchpoint.api.model.Bubble r0 = (com.bytedance.touchpoint.api.model.Bubble) r0     // Catch: java.lang.InterruptedException -> L3e java.util.concurrent.ExecutionException -> L43 java.lang.Exception -> L48
            java.lang.String r5 = r0.bubbleId     // Catch: java.lang.InterruptedException -> L3e java.util.concurrent.ExecutionException -> L43 java.lang.Exception -> L48
            java.lang.String r7 = r0.notificationName     // Catch: java.lang.InterruptedException -> L3e java.util.concurrent.ExecutionException -> L43 java.lang.Exception -> L48
            if (r7 != 0) goto L20
            java.lang.String r7 = ""
        L20:
            java.lang.String r8 = ""
            java.util.UUID r0 = java.util.UUID.randomUUID()     // Catch: java.lang.InterruptedException -> L3e java.util.concurrent.ExecutionException -> L43 java.lang.Exception -> L48
            java.lang.String r11 = r0.toString()     // Catch: java.lang.InterruptedException -> L3e java.util.concurrent.ExecutionException -> L43 java.lang.Exception -> L48
            r0 = 0
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.InterruptedException -> L3e java.util.concurrent.ExecutionException -> L43 java.lang.Exception -> L48
            r6 = 0
            r9 = 1
            com.google.common.util.concurrent.ListenableFuture r0 = r4.requestOnNotificationAction(r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.InterruptedException -> L3e java.util.concurrent.ExecutionException -> L43 java.lang.Exception -> L48
            if (r0 == 0) goto L4c
            java.lang.Object r2 = r0.get()     // Catch: java.lang.InterruptedException -> L3e java.util.concurrent.ExecutionException -> L43 java.lang.Exception -> L48
            com.bytedance.touchpoint.api.model.TaskDoneReponse r2 = (com.bytedance.touchpoint.api.model.TaskDoneReponse) r2     // Catch: java.lang.InterruptedException -> L3e java.util.concurrent.ExecutionException -> L43 java.lang.Exception -> L48
            goto L4d
        L3e:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            goto L4c
        L43:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            goto L4c
        L48:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L4c:
            r2 = r1
        L4d:
            java.lang.String r1 = "touch points failed"
            if (r2 == 0) goto L81
            int r0 = r2.statusCode
            if (r0 != 0) goto L81
            com.bytedance.touchpoint.api.model.TaskDoneData r0 = r2.data
            if (r0 == 0) goto L78
            java.util.List<com.bytedance.touchpoint.api.model.TouchPoint> r0 = r0.touchPointData
            if (r0 == 0) goto L78
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L78
            com.bytedance.touchpoint.api.model.TaskDoneData r0 = r2.data
            if (r0 == 0) goto L74
            java.util.List<com.bytedance.touchpoint.api.model.TouchPoint> r0 = r0.touchPointData
            if (r0 == 0) goto L74
            java.lang.Object r0 = X.C13LP.LJJJLL(r0)
            if (r0 == 0) goto L74
            r12.onNext(r0)
        L74:
            X.C1C7U.LIZIZ(r3)
            return
        L78:
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>(r1)
            r12.tryOnError(r0)
            goto L74
        L81:
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>(r1)
            r12.tryOnError(r0)
            goto L74
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19336110kp.subscribe$0(X.10kp, X.09AJ):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void subscribe$1(X.C19336110kp r4, X.C09AJ r5) {
        /*
            java.lang.String r3 = "TaskEventReporter@56c4.reportTaskEvent$1"
            X.C1C7U.LIZ(r3)
            X.0sFe r0 = X.C1619720sFe.LIZ     // Catch: java.lang.Throwable -> L26
            X.0zTI r0 = r0.LIZIZ()     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto L2a
            com.bytedance.touchpoint.api.interfaces.INetworkApi r1 = r0.LIZJ()     // Catch: java.lang.Throwable -> L26
            if (r1 == 0) goto L2a
            java.lang.Object r0 = r4.l0     // Catch: java.lang.Throwable -> L26
            com.bytedance.touchpoint.api.model.TaskEventContent r0 = (com.bytedance.touchpoint.api.model.TaskEventContent) r0     // Catch: java.lang.Throwable -> L26
            com.google.common.util.concurrent.ListenableFuture r0 = r1.reportTaskEvent(r0)     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto L2a
            java.lang.Object r2 = r0.get()     // Catch: java.lang.Throwable -> L26
            com.bytedance.touchpoint.api.model.TaskEventResponse r2 = (com.bytedance.touchpoint.api.model.TaskEventResponse) r2     // Catch: java.lang.Throwable -> L26
            if (r2 == 0) goto L2a
            goto L35
        L26:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L2a:
            java.lang.Throwable r1 = new java.lang.Throwable
            java.lang.String r0 = "100000"
            r1.<init>(r0)
            r5.tryOnError(r1)
            goto L44
        L35:
            int r1 = r2.statusCode
            r0 = -1
            if (r1 != r0) goto L48
            java.lang.Throwable r1 = new java.lang.Throwable
            java.lang.String r0 = r2.statusMsg
            r1.<init>(r0)
            r5.tryOnError(r1)
        L44:
            X.C1C7U.LIZIZ(r3)
            return
        L48:
            X.0zVy r1 = new X.0zVy
            java.lang.String r0 = r2.statusMsg
            r1.<init>(r0, r2)
            r5.onNext(r1)
            goto L44
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19336110kp.subscribe$1(X.10kp, X.09AJ):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void subscribe$2(X.C19336110kp r3, X.C09AJ r4) {
        /*
            java.lang.String r2 = "IncentiveReportManager@423f.getIncentiveReportResult$1"
            X.C1C7U.LIZ(r2)
            X.0sFe r0 = X.C1619720sFe.LIZ     // Catch: java.lang.InterruptedException -> L26 java.util.concurrent.ExecutionException -> L2e
            X.0zTI r0 = r0.LIZIZ()     // Catch: java.lang.InterruptedException -> L26 java.util.concurrent.ExecutionException -> L2e
            if (r0 == 0) goto L35
            com.bytedance.touchpoint.api.interfaces.INetworkApi r1 = r0.LIZJ()     // Catch: java.lang.InterruptedException -> L26 java.util.concurrent.ExecutionException -> L2e
            if (r1 == 0) goto L35
            java.lang.Object r0 = r3.l0     // Catch: java.lang.InterruptedException -> L26 java.util.concurrent.ExecutionException -> L2e
            com.bytedance.touchpoint.api.model.AttributionBody r0 = (com.bytedance.touchpoint.api.model.AttributionBody) r0     // Catch: java.lang.InterruptedException -> L26 java.util.concurrent.ExecutionException -> L2e
            com.google.common.util.concurrent.ListenableFuture r0 = r1.confirmAttribution(r0)     // Catch: java.lang.InterruptedException -> L26 java.util.concurrent.ExecutionException -> L2e
            if (r0 == 0) goto L35
            java.lang.Object r1 = r0.get()     // Catch: java.lang.InterruptedException -> L26 java.util.concurrent.ExecutionException -> L2e
            com.bytedance.touchpoint.api.model.AttributionResponse r1 = (com.bytedance.touchpoint.api.model.AttributionResponse) r1     // Catch: java.lang.InterruptedException -> L26 java.util.concurrent.ExecutionException -> L2e
            if (r1 == 0) goto L35
            goto L40
        L26:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r4.onError(r0)
            goto L35
        L2e:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r4.onError(r0)
        L35:
            java.lang.Exception r1 = new java.lang.Exception
            java.lang.String r0 = "request fail"
            r1.<init>(r0)
            r4.onError(r1)
            goto L47
        L40:
            int r0 = r1.statusCode
            if (r0 != 0) goto L35
            r4.onNext(r1)
        L47:
            X.C1C7U.LIZIZ(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19336110kp.subscribe$2(X.10kp, X.09AJ):void");
    }

    public static final void subscribe$3(C19336110kp c19336110kp, C09AJ c09aj) throws Exception {
        C1C7U.LIZ("LottieFileManager@375d.downloadFile$1");
        String strLIZ = ((C1911980zr2) c19336110kp.l0).LIZ();
        C2137908Zd c2137908Zd = C2137908Zd.LIZJ;
        c2137908Zd.LIZLLL(strLIZ);
        c2137908Zd.LIZIZ(((C1911980zr2) c19336110kp.l0).LIZLLL());
        final C1911980zr2 c1911980zr2 = (C1911980zr2) c19336110kp.l0;
        final C19482611Ke c19482611Ke = (C19482611Ke) c09aj;
        AbsDownloadListener absDownloadListener = new AbsDownloadListener() { // from class: X.0zrA
            @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onSuccessed(DownloadInfo downloadInfo) throws Exception {
                String strLJ = c1911980zr2.LJ();
                C0VSJ c0vsj = new C0VSJ(strLJ);
                String str = c1911980zr2.LIZJ;
                if (c0vsj.exists() && TextUtils.equals(C08HM.LIZIZ(c0vsj), str)) {
                    c19482611Ke.onNext(strLJ);
                    return;
                }
                C09AJ<String> c09aj2 = c19482611Ke;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("FIle in  ");
                sbLIZ.append(c1911980zr2.LIZLLL);
                sbLIZ.append(" doesnot match md5");
                c09aj2.onError(new Exception(C2188811AlT.LIZIZ(sbLIZ)));
            }

            @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                c19482611Ke.onError(baseException);
            }
        };
        AbstractC2199801B7q abstractC2199801B7qWith = DownloadServiceManager.INSTANCE.getDownloadService().with(((C1911980zr2) c19336110kp.l0).LIZIZ());
        abstractC2199801B7qWith.LJ = ((C1911980zr2) c19336110kp.l0).LIZ();
        C1911980zr2 c1911980zr22 = (C1911980zr2) c19336110kp.l0;
        c1911980zr22.LIZIZ();
        abstractC2199801B7qWith.LIZJ = c1911980zr22.LIZJ(true);
        abstractC2199801B7qWith.LJIIJ = "legacy_lottie_file";
        abstractC2199801B7qWith.LJIIL = absDownloadListener;
        abstractC2199801B7qWith.LIZJ();
        C1C7U.LIZIZ("LottieFileManager@375d.downloadFile$1");
    }

    public static final void subscribe$4(C19336110kp c19336110kp, C09AJ c09aj) {
        C2177241AIw c2177241AIw;
        C1C7U.LIZ("RelationLabelTextBuilder@18ec.update$1");
        C10KK c10kk = (C10KK) c19336110kp.l0;
        if (c10kk.LIZIZ.LIZIZ && (c2177241AIw = c10kk.LJI) != null) {
            c10kk.LJIIZILJ = true;
            if (!c10kk.LJIIIZ) {
                c10kk.LJIJ = false;
                C19482611Ke c19482611Ke = (C19482611Ke) c09aj;
                c2177241AIw.LIZIZ().LJL(C11S5.LIZLLL).LJJZ(new AfS162S0200000_28(c10kk, (MutableLiveData<Integer>) c19482611Ke, (Function0<Unit>) 18), new AfS162S0200000_28(c10kk, (MutableLiveData<Integer>) c19482611Ke, (Function0<Unit>) 19), new C19334110kV(c19482611Ke, 7));
            } else {
                c10kk.LJIJ = true;
                c09aj.onComplete();
            }
        } else {
            c10kk.LJIIZILJ = false;
            c09aj.onComplete();
        }
        C1C7U.LIZIZ("RelationLabelTextBuilder@18ec.update$1");
    }

    public static final void subscribe$5(C19336110kp c19336110kp, C09AJ c09aj) {
        C1C7U.LIZ("CleanCacheDialog@a56d.show$disposable$1");
        C2018507vT.LIZ().storeLong("last_check_storage_time", System.currentTimeMillis());
        Activity activity = (Activity) c19336110kp.l0;
        StorageCleanConfig storageCleanConfigLIZ = C10HN.LIZ();
        long jLJ = C0WYJ.LJ(activity);
        long jLJFF = C0WYJ.LJFF(activity);
        int i = storageCleanConfigLIZ.diskFreeSpaceThreshold;
        if (jLJ > ((long) storageCleanConfigLIZ.appUsageValueThreshold) * 1048576 && jLJFF < ((long) i) * 1048576) {
            c09aj.onNext(1);
        } else {
            Activity activity2 = (Activity) c19336110kp.l0;
            StorageCleanConfig storageCleanConfigLIZ2 = C10HN.LIZ();
            long jLJ2 = C0WYJ.LJ(activity2);
            long jLJFF2 = C0WYJ.LJFF(activity2);
            int i2 = storageCleanConfigLIZ2.diskFreeSpaceThreshold;
            if (jLJ2 < ((long) storageCleanConfigLIZ2.appUsageValueThreshold) * 1048576 && jLJFF2 < ((long) i2) * 1048576) {
                c09aj.onNext(2);
            } else {
                c09aj.onComplete();
            }
        }
        C1C7U.LIZIZ("CleanCacheDialog@a56d.show$disposable$1");
    }
}
