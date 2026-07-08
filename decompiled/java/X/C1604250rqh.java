package X;

import android.os.HandlerThread;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS108S1000000_24;

/* JADX INFO: renamed from: X.0rqh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1604250rqh {
    public static final C1604250rqh LIZ = new C1604250rqh();
    public static final BPEAHandler LIZIZ;
    public static final LinkedList<String> LIZJ;
    public static int LIZLLL;

    static {
        HandlerThread handlerThread = new HandlerThread("MockPluginDownload");
        handlerThread.start();
        LIZIZ = new BPEAHandler(C786410Ut5.W2(handlerThread));
        LIZJ = new LinkedList<>();
    }

    public static void LIZJ() {
        try {
            Thread.sleep((long) (AbstractC19994813Le.Default.nextDouble(0.2d, 0.3d) * 1000));
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static void LIZ(String str, boolean z) {
        LIZJ();
        C1604200rqc c1604200rqc = C1604270rqj.LIZ;
        if (c1604200rqc != null) {
            c1604200rqc.LIZIZ(str, false);
        }
        int i = 0;
        do {
            LIZJ();
            C1604200rqc c1604200rqc2 = C1604270rqj.LIZ;
            if (c1604200rqc2 != null) {
                c1604200rqc2.LJFF(i, 100L, str, false);
            }
            i++;
        } while (i < 101);
        LIZJ();
        C1604200rqc c1604200rqc3 = C1604270rqj.LIZ;
        if (c1604200rqc3 != null) {
            c1604200rqc3.LJI(str, false);
        }
        LIZJ();
        if (z) {
            C1604200rqc c1604200rqc4 = C1604270rqj.LIZ;
            if (c1604200rqc4 != null) {
                c1604200rqc4.LJ(str, false);
            }
        } else {
            C1604200rqc c1604200rqc5 = C1604270rqj.LIZ;
            if (c1604200rqc5 != null) {
                c1604200rqc5.LIZJ(str, false, 1, new AwS108S1000000_24(str, 2));
            }
        }
        LIZJ.poll();
    }

    public static void LIZIZ(C19EG c19eg, final boolean z) {
        C1604240rqg.LIZ.getClass();
        List<String> list = C1604240rqg.LIZIZ;
        int i = LIZLLL;
        LIZLLL = i + 1;
        final String str = (String) ListProtector.get(list, i % list.size());
        LIZJ.offer(str);
        C786410Ut5.LJJZZIII(LIZIZ, new Runnable() { // from class: X.0rqi
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("PluginMock$MockHelper@c19.mockDownload$1");
                try {
                    C1604250rqh c1604250rqh = C1604250rqh.LIZ;
                    String str2 = str;
                    boolean z2 = z;
                    c1604250rqh.getClass();
                    C1604250rqh.LIZ(str2, z2);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("PluginMock$MockHelper@c19.mockDownload$1");
            }
        });
        if (z) {
            C1389890mGx c1389890mGx = new C1389890mGx(c19eg);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Mocking Plugin ");
            sbLIZ.append(str);
            sbLIZ.append(" download. for success ");
            c1389890mGx.LJIIJ(C2188811AlT.LIZIZ(sbLIZ));
            c1389890mGx.LJIIJJI();
            return;
        }
        C1389890mGx c1389890mGx2 = new C1389890mGx(c19eg);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Mocking Plugin ");
        sbLIZ2.append(str);
        sbLIZ2.append(" download. for fail");
        c1389890mGx2.LJIIJ(C2188811AlT.LIZIZ(sbLIZ2));
        c1389890mGx2.LJIIJJI();
    }
}
