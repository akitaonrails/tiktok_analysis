package X;

import Y.ARunnableS113S0100000_13;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tiktok.ttm.TTMParamData;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS414S0200000_13;
import kotlin.jvm.internal.AwS592S0100000_13;

/* JADX INFO: renamed from: X.0WiW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C830820WiW implements InterfaceC830810WiV {
    public final String LIZ;
    public final boolean LIZIZ;
    public final ConcurrentLinkedQueue<HashMap<Integer, Object>> LIZJ = new ConcurrentLinkedQueue<>();
    public final ConcurrentLinkedQueue<AbstractC2213701BkW> LIZLLL = new ConcurrentLinkedQueue<>();

    @Override // X.InterfaceC830810WiV
    public InterfaceC830810WiV LIZ(AwS592S0100000_13 awS592S0100000_13) {
        this.LIZJ.add(C2097608Jq.LJI(new Pair(1, awS592S0100000_13)));
        return this;
    }

    public void LIZIZ(TTMParamData tTMParamData) {
        C830870Wib c830870Wib;
        ExecutorService executorService;
        C830930Wih c830930Wih;
        C830930Wih c830930Wih2;
        try {
            if ((!this.LIZJ.isEmpty()) && (!this.LIZLLL.isEmpty())) {
                TTMParamData tTMParamData2 = tTMParamData;
                for (HashMap<Integer, Object> map : this.LIZJ) {
                    int iIntValue = ((Integer) C13LP.LJJJJZ(map.keySet())).intValue();
                    if (iIntValue != 1) {
                        if (iIntValue == 2) {
                            Object objLJJJJZ = C13LP.LJJJJZ(map.values());
                            C19719512Dh.LJ(1, objLJJJJZ);
                            tTMParamData2 = (TTMParamData) ((Function1) objLJJJJZ).invoke((InterfaceC829710Wgj) tTMParamData2.getActualParamData());
                        }
                    } else {
                        Object objLJJJJZ2 = C13LP.LJJJJZ(map.values());
                        C19719512Dh.LJ(1, objLJJJJZ2);
                        if (!((Boolean) ((Function1) objLJJJJZ2).invoke((InterfaceC829710Wgj) tTMParamData2.getActualParamData())).booleanValue()) {
                            return;
                        }
                    }
                }
            }
            for (AbstractC2213701BkW abstractC2213701BkW : this.LIZLLL) {
                WeakReference<C830870Wib> weakReference = abstractC2213701BkW.LJI;
                ExecutorService executorService2 = null;
                if (weakReference != null && (c830870Wib = weakReference.get()) != null) {
                    ConcurrentLinkedQueue<C830830WiX> concurrentLinkedQueue = c830870Wib.LJFF;
                    if (concurrentLinkedQueue != null) {
                        concurrentLinkedQueue.offer(new C830830WiX(abstractC2213701BkW, tTMParamData));
                        if ((c830870Wib != null && (c830930Wih = c830870Wib.LIZLLL) != null && (executorService = c830930Wih.LIZLLL) != null) || (executorService = C830860Wia.LIZ) != null) {
                            executorService.execute(new ARunnableS113S0100000_13(concurrentLinkedQueue, 211));
                        }
                    } else if (c830870Wib != null && (c830930Wih2 = c830870Wib.LIZLLL) != null) {
                        executorService2 = c830930Wih2.LIZLLL;
                    }
                }
                C830860Wia.LIZIZ(executorService2, new AwS414S0200000_13(abstractC2213701BkW, tTMParamData, 11));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public void LIZJ(AbstractC2213701BkW abstractC2213701BkW) {
        this.LIZLLL.remove(abstractC2213701BkW);
    }

    public C830820WiW(String str, boolean z) {
        this.LIZ = str;
        this.LIZIZ = z;
    }
}
