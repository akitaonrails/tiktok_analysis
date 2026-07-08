package X;

import Y.ARunnableS122S0100000_22;
import Y.ARunnableS27S1100000_22;
import android.graphics.Bitmap;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.scheduler.ParallelPublishCallback;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModelKt;
import com.ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.story.publish.ISocialPublishBridgeService;
import com.ss.android.ugc.aweme.wavepublish.experiment.EnableParallelPublishSchedulerV2Exp;
import dtj.u7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nPf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1433730nPf {
    public static final C1433730nPf LIZ = new C1433730nPf();
    public static final boolean LIZIZ;
    public static final int LIZJ;
    public static final C1433660nPY LIZLLL;
    public static final C1433660nPY LJ;
    public static final C1433740nPg LJFF;
    public static final ExecutorService LJI;
    public static final ParallelPublishCallback LJII;
    public static C855020XgS LJIIIIZZ;
    public static volatile C1433500nPI LJIIIZ;

    static {
        C157K c157k = C157K.LJIIIIZZ;
        List listLJIIJJI = C1697810uHb.LJIIJJI(C1433780nPk.LIZ, C1433780nPk.LIZIZ, C1433780nPk.LIZJ, C1433780nPk.LIZLLL);
        C0C64.LJIILLIIL().LJIIIZ(31744, "enable_wave_scheduler_debug_mode", true, false);
        C0C64.LJIILLIIL().LJIIIZ(31744, "enable_wave_scheduler_debug_mode", true, false);
        C20334814hW c20334814hW = new C20334814hW(listLJIIJJI, EnableParallelPublishSchedulerV2Exp.LIZ().timeoutCheckIntervalTime, 2);
        c157k.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setWaveTaskConfig: ");
        sbLIZ.append(c20334814hW);
        C157K.LJFF(C2188811AlT.LIZIZ(sbLIZ));
        C157K.LIZJ = c20334814hW;
        C0MZY.LIZ.getClass();
        C0MZY.LIZJ();
        C157K.LIZ = new C157Q() { // from class: X.0nPj
            @Override // X.C157Q
            public final void log(String str) {
                C201955140j.LIZLLL(C830690WiJ.LIZIZ, "WaveTaskGlobalScheduler", str);
            }
        };
        boolean z = EnableParallelPublishSchedulerV2Exp.LIZ().enable;
        LIZIZ = z;
        int i = EnableParallelPublishSchedulerV2Exp.LIZ().maxTaskSize;
        LIZJ = i;
        LIZLLL = new C1433660nPY(i, "normal_records", !z);
        LJ = new C1433660nPY(1, "pre_publish_records", true);
        C1433740nPg c1433740nPg = new C1433740nPg();
        LJFF = c1433740nPg;
        C2123408To c2123408To = new C2123408To(C0WQX.SERIAL);
        c2123408To.LIZIZ = "PublishScheduler";
        LJI = C823050WQl.LIZ(new C2123508Tp(c2123408To));
        LJII = new ParallelPublishCallback(c1433740nPg, new C855220Xgm());
    }

    public static final List<PublishModel> LJII() {
        C830690WiJ c830690WiJ = C830690WiJ.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getAllPublishModel size=");
        C1433740nPg c1433740nPg = LJFF;
        sbLIZ.append(c1433740nPg.LJ());
        C201955140j.LIZJ(c830690WiJ, C2188811AlT.LIZIZ(sbLIZ));
        return c1433740nPg.LIZJ();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LJIIIZ() {
        /*
            X.0nPg r3 = X.C1433730nPf.LJFF
            monitor-enter(r3)
            java.util.List<X.0nPL> r0 = r3.LIZ     // Catch: java.lang.Throwable -> L2b
            java.util.Iterator r2 = r0.iterator()     // Catch: java.lang.Throwable -> L2b
        L9:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto L27
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Throwable -> L2b
            r0 = r1
            X.0nPL r0 = (X.C1433530nPL) r0     // Catch: java.lang.Throwable -> L2b
            X.0nOn r0 = r0.LIZLLL     // Catch: java.lang.Throwable -> L2b
            boolean r0 = r0 instanceof X.C1433490nPH     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto L9
        L1c:
            X.0nPL r1 = (X.C1433530nPL) r1     // Catch: java.lang.Throwable -> L2b
            if (r1 == 0) goto L24
            java.lang.String r0 = r1.LIZIZ     // Catch: java.lang.Throwable -> L2b
            if (r0 != 0) goto L29
        L24:
            java.lang.String r0 = ""
            goto L29
        L27:
            r1 = 0
            goto L1c
        L29:
            monitor-exit(r3)
            return r0
        L2b:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1433730nPf.LJIIIZ():java.lang.String");
    }

    public static final List<PublishModel> LJIIJJI() {
        List<PublishModel> listLIZJ = LJFF.LIZJ();
        ArrayList arrayList = new ArrayList();
        for (PublishModel publishModel : listLIZJ) {
            if (LJIJ(publishModel)) {
                arrayList.add(publishModel);
            }
        }
        return arrayList;
    }

    public static final int LJIILL() {
        return LJFF.LJ();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJIJJ() {
        /*
            X.0nPg r2 = X.C1433730nPf.LJFF
            monitor-enter(r2)
            java.util.List<X.0nPL> r1 = r2.LIZ     // Catch: java.lang.Throwable -> L8c
            boolean r0 = r1 instanceof java.util.Collection     // Catch: java.lang.Throwable -> L8c
            r5 = 0
            if (r0 == 0) goto L11
            boolean r0 = r1.isEmpty()     // Catch: java.lang.Throwable -> L8c
            if (r0 == 0) goto L11
            goto L31
        L11:
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L8c
            r4 = 0
        L16:
            boolean r0 = r1.hasNext()     // Catch: java.lang.Throwable -> L8c
            if (r0 == 0) goto L32
            java.lang.Object r0 = r1.next()     // Catch: java.lang.Throwable -> L8c
            X.0nPL r0 = (X.C1433530nPL) r0     // Catch: java.lang.Throwable -> L8c
            X.0nOn r0 = r0.LIZLLL     // Catch: java.lang.Throwable -> L8c
            boolean r0 = r0 instanceof X.C1433490nPH     // Catch: java.lang.Throwable -> L8c
            if (r0 == 0) goto L16
            int r4 = r4 + 1
            if (r4 >= 0) goto L16
            X.C1697810uHb.LJIJ()     // Catch: java.lang.Throwable -> L8c
            r0 = 0
            throw r0     // Catch: java.lang.Throwable -> L8c
        L31:
            r4 = 0
        L32:
            monitor-exit(r2)
            X.0nPI r0 = X.C1433730nPf.LJIIIZ
            if (r0 == 0) goto L8a
            X.0nPL r0 = r0.LLILZIL
            X.0nOn r1 = r0.LIZLLL
            boolean r0 = r1 instanceof X.C1433220nOq
            if (r0 != 0) goto L47
            boolean r0 = r1 instanceof X.C1433490nPH
            if (r0 != 0) goto L47
            boolean r0 = r1 instanceof X.C1433200nOo
            if (r0 == 0) goto L8a
        L47:
            r1 = 1
        L48:
            int r3 = r4 + r1
            java.lang.StringBuilder r2 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "isReachTheLimitedRunningTaskNum: normal="
            r2.append(r0)
            r2.append(r4)
            java.lang.String r0 = ", pre="
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = ", total="
            r2.append(r0)
            r2.append(r3)
            java.lang.String r0 = ", max="
            r2.append(r0)
            int r1 = X.C1433730nPf.LIZJ
            r2.append(r1)
            java.lang.String r0 = ", enableParallelRun="
            r2.append(r0)
            boolean r0 = X.C1433730nPf.LIZIZ
            r2.append(r0)
            r0 = 32
            r2.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r2)
            X.C577950Mld.LIZ(r0)
            if (r3 < r1) goto L89
            r5 = 1
        L89:
            return r5
        L8a:
            r1 = 0
            goto L48
        L8c:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1433730nPf.LJIJJ():boolean");
    }

    public static final synchronized void LJJII() {
        C1433500nPI c1433500nPI;
        C1433500nPI c1433500nPI2;
        if (LIZIZ) {
            return;
        }
        C1433740nPg c1433740nPg = LJFF;
        if (c1433740nPg.LJ() <= 0) {
            C577950Mld.LIZ("PublishSchedule startCacheTask PublishTaskList size zero, skip");
            return;
        }
        if (c1433740nPg.LJIIJJI()) {
            C577950Mld.LIZ("PublishSchedule startCacheTask taskIsRunning skip");
            return;
        }
        C1433530nPL c1433530nPLLJI = c1433740nPg.LJI();
        if (c1433530nPLLJI == null) {
            C577950Mld.LIZ("PublishSchedule startCacheTask not found PublishRecord, skip");
            return;
        }
        AbstractC1433190nOn abstractC1433190nOn = c1433530nPLLJI.LIZLLL;
        if (!Intrinsics.LJFF(abstractC1433190nOn, C1433220nOq.LIZ)) {
            if (!abstractC1433190nOn.LIZIZ() && !abstractC1433190nOn.LIZ()) {
                C0CHQ.LIZ().isDebugConfigOpen();
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Continue type, PublishRecord state incorrect ");
            sbLIZ.append(abstractC1433190nOn);
            sbLIZ.append(", task = ");
            sbLIZ.append(c1433530nPLLJI);
            sbLIZ.append(".task, PublishTaskList size = ");
            sbLIZ.append(c1433740nPg.LJ());
            C1433760nPi.LIZ(new C1433790nPl(C2188811AlT.LIZIZ(sbLIZ)));
            c1433740nPg.LJIIIZ(c1433530nPLLJI);
            LJJII();
            return;
        }
        String str = c1433530nPLLJI.LIZIZ;
        InterfaceRunnableC1433480nPG interfaceRunnableC1433480nPG = c1433530nPLLJI.LJI;
        if (!(interfaceRunnableC1433480nPG instanceof C1433500nPI) || (c1433500nPI2 = (C1433500nPI) interfaceRunnableC1433480nPG) == null) {
            LIZ.getClass();
            C1433500nPI c1433500nPI3 = new C1433500nPI(new C1434140nQK(), LIZLLL, c1433530nPLLJI, c1433740nPg, LJI);
            c1433530nPLLJI.LJI = c1433500nPI3;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("PublishParallel startCacheTask create new task  id=");
            sbLIZ2.append(str);
            C577950Mld.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
            List listLLIIII = C13LP.LLIIII(c1433530nPLLJI.LIZJ);
            c1433530nPLLJI.LIZJ.clear();
            C830690WiJ c830690WiJ = C830690WiJ.LIZIZ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("cancelTaskCallbackList size=");
            sbLIZ3.append(listLLIIII.size());
            C201955140j.LIZJ(c830690WiJ, C2188811AlT.LIZIZ(sbLIZ3));
            Iterator it2 = listLLIIII.iterator();
            while (it2.hasNext()) {
                c1433500nPI3.LJZI((AbstractC1433570nPP) it2.next());
            }
        } else {
            if (c1433500nPI2.LLJILLL) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("PublishParallel startCacheTask skip execute already scheduled task id=");
                sbLIZ4.append(str);
                C577950Mld.LIZ(C2188811AlT.LIZIZ(sbLIZ4));
                return;
            }
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("PublishParallel startCacheTask reuse task id=");
            sbLIZ5.append(str);
            C577950Mld.LIZ(C2188811AlT.LIZIZ(sbLIZ5));
        }
        C577950Mld.LIZ("PublishParallel startCacheTask execute task id=" + str);
        InterfaceRunnableC1433480nPG interfaceRunnableC1433480nPG2 = c1433530nPLLJI.LJI;
        if ((interfaceRunnableC1433480nPG2 instanceof C1433500nPI) && (c1433500nPI = (C1433500nPI) interfaceRunnableC1433480nPG2) != null) {
            c1433500nPI.LLJILLL = true;
        }
        LJI.execute(c1433530nPLLJI.LJI);
    }

    public static final int LJIIL() {
        return ((ArrayList) LJIIJJI()).size();
    }

    public static final String LIZJ(Bundle bundle) {
        String strLIZLLL;
        synchronized (C1433730nPf.class) {
            strLIZLLL = LIZLLL(C1433610nPT.LIZ(bundle), false);
        }
        return strLIZLLL;
    }

    public static C1433500nPI LJI(PublishModel publishModel) {
        return new C1433500nPI(publishModel, new C1434140nQK(), LIZLLL, LJFF, LJI);
    }

    public static final Bitmap LJIIIIZZ(PublishModel publishModel) {
        Bitmap bitmapLJIILJJIL;
        BaseShortVideoContext baseShortVideoContext = publishModel.editModel;
        if (baseShortVideoContext instanceof VideoPublishEditModel) {
            bitmapLJIILJJIL = C1429670nJ7.LJIILJJIL((VideoPublishEditModel) baseShortVideoContext);
        } else {
            bitmapLJIILJJIL = null;
        }
        C0CHQ.LIZ().isDebugConfigOpen();
        return bitmapLJIILJJIL;
    }

    public static final String LJIILIIL(PublishModel publishModel) {
        for (C1433530nPL c1433530nPL : LJFF.LIZ) {
            if (Intrinsics.LJFF(c1433530nPL.LIZ, publishModel)) {
                return c1433530nPL.LIZIZ;
            }
        }
        return "";
    }

    public static final PublishModel LJIILJJIL(String str) {
        return LJFF.LIZLLL(str);
    }

    public static final boolean LJIILLIIL(String str) {
        C1433500nPI c1433500nPI;
        InterfaceC1433580nPQ interfaceC1433580nPQ;
        String str2;
        C1433530nPL c1433530nPL;
        if (LJIIIZ == null || (c1433500nPI = LJIIIZ) == null || (interfaceC1433580nPQ = c1433500nPI.LLIZ) == null || !interfaceC1433580nPQ.LJIILLIIL()) {
            return false;
        }
        if (str == null) {
            return true;
        }
        C1433500nPI c1433500nPI2 = LJIIIZ;
        if (c1433500nPI2 != null && (c1433530nPL = c1433500nPI2.LLILZIL) != null) {
            str2 = c1433530nPL.LIZIZ;
        } else {
            str2 = null;
        }
        return Intrinsics.LJFF(str2, str);
    }

    public static final boolean LJIIZILJ(String str) {
        String str2;
        C1433530nPL c1433530nPL;
        if (str != null) {
            C1433500nPI c1433500nPI = LJIIIZ;
            if (c1433500nPI != null && (c1433530nPL = c1433500nPI.LLILZIL) != null) {
                str2 = c1433530nPL.LIZIZ;
            } else {
                str2 = null;
            }
            return Intrinsics.LJFF(str2, str);
        }
        if (LJIIIZ != null) {
            return true;
        }
        return false;
    }

    public static final boolean LJIJ(PublishModel publishModel) {
        if (publishModel.LIZ || publishModel.nowsShootData != null || C1618440sDa.LIZIZ.LJJIFFI().LIZIZ(publishModel)) {
            return false;
        }
        return true;
    }

    public static final boolean LJIJI(String str) {
        if (str != null) {
            if (LJFF.LIZLLL(str) == null) {
                return false;
            }
            return true;
        }
        if (!LJFF.LJIIJJI() && LJIIIZ == null) {
            return false;
        }
        return true;
    }

    public static void LJIJJLI(String str) {
        C830690WiJ c830690WiJ = C830690WiJ.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PublishScheduler | ");
        sbLIZ.append(str);
        C201955140j.LJIILJJIL(c830690WiJ, C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void LJJI(InterfaceC1433360nP4 interfaceC1433360nP4) {
        C830690WiJ c830690WiJ = C830690WiJ.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PublishScheduler | removeCallback call ");
        sbLIZ.append((String) null);
        C201955140j.LJIILJJIL(c830690WiJ, C2188811AlT.LIZIZ(sbLIZ));
        LJI.execute(new ARunnableS27S1100000_22(interfaceC1433360nP4, (String) null, 6));
    }

    public static final void LJJIFFI(String str) {
        C830690WiJ c830690WiJ = C830690WiJ.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PublishScheduler | ");
        sbLIZ.append(str);
        C201955140j.LJII(c830690WiJ, C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("PublishScheduler|");
        sbLIZ2.append(str);
        C571900Mbs.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
    }

    public static final synchronized String LJJIIJZLJL(Bundle bundle) {
        String str;
        C1433530nPL c1433530nPL;
        C1433530nPL c1433530nPL2;
        C1433530nPL c1433530nPL3;
        C1433530nPL c1433530nPL4;
        PublishModel publishModel;
        String str2;
        C1433530nPL c1433530nPL5;
        LIZ.getClass();
        boolean zLJIJJ = LJIJJ();
        String str3 = null;
        if (LJIILL() != 0 && (!LIZIZ || zLJIJJ)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("startPrePublishTaskIfNeeded: condition not met, publishTaskListSize=");
            sbLIZ.append(LJIILL());
            sbLIZ.append(", will not start pre publish task");
            C577950Mld.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("startPrePublishTaskIfNeeded: condition met, publishTaskListSize=");
        sbLIZ2.append(LJIILL());
        sbLIZ2.append(", will start pre publish task");
        C577950Mld.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
        PublishModel publishModelLIZ = C1433610nPT.LIZ(bundle);
        C1434140nQK c1434140nQK = new C1434140nQK();
        C1433660nPY c1433660nPY = LIZLLL;
        C1433740nPg c1433740nPg = LJFF;
        ExecutorService executorService = LJI;
        LJIIIZ = new C1433500nPI(publishModelLIZ, c1434140nQK, c1433660nPY, c1433740nPg, executorService);
        C1433500nPI c1433500nPI = LJIIIZ;
        if (c1433500nPI != null && (c1433530nPL4 = c1433500nPI.LLILZIL) != null && (publishModel = c1433530nPL4.LIZ) != null) {
            C1433500nPI c1433500nPI2 = LJIIIZ;
            if (c1433500nPI2 == null || (c1433530nPL5 = c1433500nPI2.LLILZIL) == null || (str2 = c1433530nPL5.LIZIZ) == null) {
                str2 = "";
            }
            publishModel.publishId = str2;
        }
        C1433500nPI c1433500nPI3 = LJIIIZ;
        if (c1433500nPI3 != null && (c1433530nPL3 = c1433500nPI3.LLILZIL) != null) {
            c1433530nPL3.LJIIIIZZ = true;
            LJ.LIZ(c1433530nPL3);
        }
        LJIIIZ.LJZI(LJII);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("PublishParallel PublishScheduler PrePublishTask id=");
        C1433500nPI c1433500nPI4 = LJIIIZ;
        if (c1433500nPI4 != null && (c1433530nPL2 = c1433500nPI4.LLILZIL) != null) {
            str = c1433530nPL2.LIZIZ;
        } else {
            str = null;
        }
        sbLIZ3.append(str);
        C577950Mld.LIZ(C2188811AlT.LIZIZ(sbLIZ3));
        executorService.execute(LJIIIZ);
        C1433500nPI c1433500nPI5 = LJIIIZ;
        if (c1433500nPI5 != null && (c1433530nPL = c1433500nPI5.LLILZIL) != null) {
            str3 = c1433530nPL.LIZIZ;
        }
        return str3;
    }

    public static final void LIZ(String str, AbstractC1433570nPP abstractC1433570nPP) {
        C830690WiJ c830690WiJ = C830690WiJ.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PublishScheduler | addCallback call ");
        sbLIZ.append(str);
        C201955140j.LJIILJJIL(c830690WiJ, C2188811AlT.LIZIZ(sbLIZ));
        LJI.execute(new ARunnableS27S1100000_22(str, abstractC1433570nPP, 4));
    }

    public static void LIZIZ(String str, AbstractC1433570nPP abstractC1433570nPP) {
        String str2;
        InterfaceRunnableC1433480nPG interfaceRunnableC1433480nPG;
        C1433530nPL c1433530nPL;
        if (str != null) {
            C1433500nPI c1433500nPI = LJIIIZ;
            if (c1433500nPI != null && (c1433530nPL = c1433500nPI.LLILZIL) != null) {
                str2 = c1433530nPL.LIZIZ;
            } else {
                str2 = null;
            }
            if (Intrinsics.LJFF(str2, str)) {
                LJI.execute(new ARunnableS122S0100000_22(abstractC1433570nPP, 121));
            }
            C1433740nPg c1433740nPg = LJFF;
            synchronized (c1433740nPg) {
                for (C1433530nPL c1433530nPL2 : c1433740nPg.LIZ) {
                    if (Intrinsics.LJFF(c1433530nPL2.LIZIZ, str) && (interfaceRunnableC1433480nPG = c1433530nPL2.LJI) != null) {
                        interfaceRunnableC1433480nPG.LJZI(abstractC1433570nPP);
                    }
                }
            }
        }
    }

    public static final synchronized String LIZLLL(PublishModel publishModel, boolean z) {
        C201955140j.LIZJ(C830690WiJ.LIZIZ, "PublishScheduler addPublishTask");
        LIZ.getClass();
        return LJ(LJI(publishModel), z);
    }

    public static final synchronized String LJ(C1433500nPI c1433500nPI, boolean z) {
        boolean z2;
        BaseShortVideoContext baseShortVideoContext = c1433500nPI.LLILZIL.LIZ.editModel;
        if ((baseShortVideoContext instanceof VideoPublishEditModel) && !C1428470nHB.LJJJLL((VideoPublishEditModel) baseShortVideoContext) && !c1433500nPI.LLILZIL.LIZ.LIZ) {
            C0CHQ.LIZ().getPublishService().LJIIL();
            C1436830nUf.LJII(new C572660Md6((VideoPublishEditModel) baseShortVideoContext));
        }
        c1433500nPI.LJZI(LJII);
        PublishModel publishModel = c1433500nPI.LLILZIL.LIZ;
        C1433530nPL c1433530nPL = c1433500nPI.LLILZIL;
        publishModel.publishId = c1433530nPL.LIZIZ;
        if (c1433530nPL.LIZ.storyGroupPublishModel != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        c1433530nPL.LJIIIZ = z2;
        C830690WiJ c830690WiJ = C830690WiJ.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ParallelPublish  PublishScheduler  addPublishTask id=");
        sbLIZ.append(c1433500nPI.LLILZIL.LIZIZ);
        C201955140j.LIZJ(c830690WiJ, C2188811AlT.LIZIZ(sbLIZ));
        if (!z) {
            LJFF.LIZIZ(c1433500nPI.LLILZIL, true);
        } else {
            LJFF.LIZ(c1433500nPI.LLILZIL);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("PublishSchedule addPublishTask task id = ");
        sbLIZ2.append(c1433500nPI.LLILZIL.LIZIZ);
        C577950Mld.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
        C1447680nmA c1447680nmA = C1447680nmA.LL;
        c1447680nmA.getClass();
        if (!C1447680nmA.LLILZ) {
            ((ISocialPublishBridgeService) ServiceManager.get().getService(ISocialPublishBridgeService.class)).Kg(c1447680nmA, new C565120MEk());
            C1447680nmA.LLILZ = true;
        }
        return c1433500nPI.LLILZIL.LIZIZ;
    }

    public static void LJFF(C1433230nOr c1433230nOr, String str) {
        String creationId;
        VideoPublishEditModel videoPublishEditModel;
        C1433500nPI c1433500nPILJFF = LJFF.LJFF(str);
        if (c1433500nPILJFF == null) {
            return;
        }
        BaseShortVideoContext baseShortVideoContext = c1433500nPILJFF.LLILZIL.LIZ.editModel;
        if (!(baseShortVideoContext instanceof VideoPublishEditModel) || baseShortVideoContext == null || (creationId = baseShortVideoContext.getCreationId()) == null) {
            creationId = "";
        }
        c1433500nPILJFF.LJIILL(c1433230nOr);
        C0CHQ.LIZ().getPublishService().LJIIL();
        BaseShortVideoContext baseShortVideoContext2 = c1433500nPILJFF.LLILZIL.LIZ.editModel;
        if ((baseShortVideoContext2 instanceof VideoPublishEditModel) && (videoPublishEditModel = (VideoPublishEditModel) baseShortVideoContext2) != null) {
            C1436830nUf.LJIJI(new C572660Md6(videoPublishEditModel));
        }
        C1436830nUf.LJIIZILJ(creationId);
    }

    public static int LJIIJ(C1433730nPf c1433730nPf, String str) {
        AbstractC1433190nOn abstractC1433190nOn;
        C1433490nPH c1433490nPH;
        int i;
        C1434900nRY c1434900nRY;
        C1433530nPL c1433530nPL;
        c1433730nPf.getClass();
        C1433500nPI c1433500nPILJFF = LJFF.LJFF(str);
        if (c1433500nPILJFF != null && (c1433530nPL = c1433500nPILJFF.LLILZIL) != null) {
            abstractC1433190nOn = c1433530nPL.LIZLLL;
        } else {
            abstractC1433190nOn = null;
        }
        if (abstractC1433190nOn instanceof C1433490nPH) {
            c1433490nPH = (C1433490nPH) abstractC1433190nOn;
        } else {
            c1433490nPH = null;
        }
        if (c1433490nPH == null) {
            return 0;
        }
        Object obj = c1433490nPH.LIZIZ;
        if ((obj instanceof C1434900nRY) && (c1434900nRY = (C1434900nRY) obj) != null && c1434900nRY.LJ) {
            i = c1434900nRY.LJFF;
        } else {
            i = c1433490nPH.LIZ;
        }
        Integer numValueOf = Integer.valueOf(i);
        if (numValueOf == null) {
            return 0;
        }
        return numValueOf.intValue();
    }

    public static void LJIL(String str, String str2) {
        if (u7.LIZ() && !u7.LIZIZ()) {
            return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ(Scene.SCENE_SERVICE, "enter_publish_page");
        c2344009Gk.LJIIIIZZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str);
        c2344009Gk.LJIIIIZZ("msg", str2);
        C20684815ws.LJIILLIIL("tool_performance_edit_pre_publish", c2344009Gk.LIZ);
    }

    public static final void LJJ(String str, AbstractC1433570nPP abstractC1433570nPP) {
        C830690WiJ c830690WiJ = C830690WiJ.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PublishScheduler | removeCallback call ");
        sbLIZ.append(str);
        C201955140j.LJIILJJIL(c830690WiJ, C2188811AlT.LIZIZ(sbLIZ));
        if (str == null) {
            return;
        }
        LJI.execute(new ARunnableS27S1100000_22(str, abstractC1433570nPP, 5));
    }

    public static void LJJIIZ(PublishModel publishModel, PublishModel publishModel2) {
        List<SingleImageData> imageList;
        List<SingleImageData> imageList2;
        ImageAlbumData imageAlbumData = ((VideoPublishEditModelKt) publishModel2.editModel).getImageAlbumData();
        List<String> imageModeLocalPaths = null;
        if (imageAlbumData != null) {
            imageList = imageAlbumData.getImageList();
        } else {
            imageList = null;
        }
        ImageAlbumData imageAlbumData2 = ((VideoPublishEditModelKt) publishModel.editModel).getImageAlbumData();
        if (imageAlbumData2 != null && (imageList2 = imageAlbumData2.getImageList()) != null) {
            ArrayList arrayList = new ArrayList(imageList2);
            int i = 0;
            if (arrayList != null && !arrayList.isEmpty()) {
                for (SingleImageData singleImageData : new ArrayList(arrayList)) {
                    int i2 = i + 1;
                    if (imageList != null) {
                        Iterator<SingleImageData> it2 = imageList.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                SingleImageData next = it2.next();
                                if (Intrinsics.LJFF(next.getId(), singleImageData.getId())) {
                                    if (next != null) {
                                        ListProtector.set(arrayList, i, next);
                                    }
                                }
                            }
                        }
                    }
                    i = i2;
                }
            }
        }
        AVUploadSaveModel saveModel = ((VideoPublishEditModelKt) publishModel.editModel).getSaveModel();
        if (saveModel != null) {
            AVUploadSaveModel saveModel2 = ((VideoPublishEditModelKt) publishModel2.editModel).getSaveModel();
            if (saveModel2 != null) {
                imageModeLocalPaths = saveModel2.getImageModeLocalPaths();
            }
            saveModel.setImageModeLocalPaths(imageModeLocalPaths);
        }
    }

    public static String LJJIII(PublishModel publishModel, final Function2 function2, final Function2 function22) {
        C1433500nPI c1433500nPILJI = LJI(publishModel);
        if (function2 != null) {
            c1433500nPILJI.LJZI(new AbstractC1433570nPP() { // from class: X.0nOm
                @Override // X.AbstractC1433570nPP
                public final void onProgress(int i, Object obj) {
                    Function2<Integer, Object, Unit> function23 = function22;
                    if (function23 != null) {
                        function23.invoke(Integer.valueOf(i), obj);
                    }
                }

                @Override // X.AbstractC1433570nPP
                public final void onFinish(AbstractC1433460nPE abstractC1433460nPE, Object obj, PublishModel publishModel2) {
                    if ((obj instanceof String) && obj != null) {
                        if (abstractC1433460nPE instanceof C492390JSr) {
                            function2.invoke(Boolean.TRUE, obj);
                        } else {
                            function2.invoke(Boolean.FALSE, obj);
                        }
                    }
                }
            });
        }
        if (LIZLLL.LIZ(c1433500nPILJI.LLILZIL)) {
            LJI.execute(c1433500nPILJI);
            C830690WiJ c830690WiJ = C830690WiJ.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PublishScheduler | startNewPublish creationId:");
            sbLIZ.append(publishModel.creationId);
            sbLIZ.append(" publishId:");
            sbLIZ.append(c1433500nPILJI.LLILZIL.LIZIZ);
            C201955140j.LIZJ(c830690WiJ, C2188811AlT.LIZIZ(sbLIZ));
            return c1433500nPILJI.LLILZIL.LIZIZ;
        }
        return null;
    }
}
