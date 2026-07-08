package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: renamed from: X.0nSN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1435410nSN implements C0JHI {
    public static final C1435410nSN LIZ = new C1435410nSN();
    public static final Map<String, PublishModel> LIZIZ = new LinkedHashMap();
    public static final LinkedBlockingQueue<RunnableC1435450nSR> LIZJ = new LinkedBlockingQueue<>();
    public static volatile RunnableC1435450nSR LIZLLL;
    public static final ExecutorService LJ;

    static {
        C2123408To c2123408ToLIZ = C2123508Tp.LIZ(C0WQX.SERIAL);
        c2123408ToLIZ.LIZIZ = "PcsCourseVideoPublishScheduler";
        LJ = C823050WQl.LIZ(c2123408ToLIZ.LIZ());
    }

    @Override // X.C0JHI
    public final void LIZ() {
        synchronized ("lock") {
            try {
                LIZJ.clear();
                RunnableC1435450nSR runnableC1435450nSR = LIZLLL;
                if (runnableC1435450nSR != null) {
                    runnableC1435450nSR.LLILZ.LJIILL(new C1433230nOr("cancel all watermark", null, 6));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.C0JHI
    public final String LIZIZ(String str, C0JHH c0jhh) {
        PublishModel publishModel = (PublishModel) ((LinkedHashMap) LIZIZ).get(str);
        if (publishModel == null) {
            c0jhh.getClass();
            return null;
        }
        LIZLLL(publishModel, c0jhh, C0JHN.RESTART_FAILED_TASK);
        return publishModel.publishId;
    }

    @Override // X.C0JHI
    public final void LIZJ(PublishModel publishModel, C0JHP c0jhp) {
        InterfaceC1433580nPQ interfaceC1433580nPQLIZ = new C1434140nQK().LIZ(new C1433530nPL(publishModel, null), C309040C9m.LIZ(), new C1430790nKv());
        new CountDownTimerC1466530oGZ(interfaceC1433580nPQLIZ, 1).start();
        interfaceC1433580nPQLIZ.LJIIZILJ(c0jhp);
    }

    @Override // X.C0JHI
    public final String LIZLLL(PublishModel publishModel, C0JHH c0jhh, C0JHN c0jhn) {
        String strLIZ;
        int i = C0JHO.LIZ[c0jhn.ordinal()];
        boolean z = true;
        if (i != 1) {
            if (i == 2) {
                strLIZ = publishModel.publishId;
            } else {
                throw new C1954807lC();
            }
        } else {
            strLIZ = C309040C9m.LIZ();
        }
        if (strLIZ.length() != 0) {
            z = false;
        }
        if (z) {
            c0jhh.getClass();
            return null;
        }
        RunnableC1435450nSR runnableC1435450nSR = new RunnableC1435450nSR(publishModel, LJ, c0jhh, strLIZ);
        String str = runnableC1435450nSR.LLILLL;
        LIZIZ.put(str, publishModel);
        if (LIZLLL == null) {
            C1430240nK2 c1430240nK2 = C1430240nK2.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PcsCourseVideoPublishScheduler | startNewPublish creationId:");
            sbLIZ.append(publishModel.creationId);
            sbLIZ.append(" publishId:");
            sbLIZ.append(runnableC1435450nSR.LLILLL);
            C201955140j.LIZJ(c1430240nK2, C2188811AlT.LIZIZ(sbLIZ));
            LIZLLL = runnableC1435450nSR;
            C0JHH.LIZ(publishModel);
            LJ.execute(runnableC1435450nSR);
        } else {
            LIZJ.offer(runnableC1435450nSR);
            C0JHH.LIZ(publishModel);
        }
        C1435480nSU c1435480nSU = C1435480nSU.LIZ;
        EnumC1434950nRd enumC1434950nRd = EnumC1434950nRd.ADDED_TO_QUEUE;
        int size = LIZJ.size();
        c1435480nSU.getClass();
        C1435480nSU.LIZ(enumC1434950nRd, null, null, null, null, size);
        return str;
    }
}
