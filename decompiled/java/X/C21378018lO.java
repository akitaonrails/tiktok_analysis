package X;

import Y.ARunnableS132S0100000_32;
import Y.ARunnableS83S0200000_14;
import android.os.Handler;
import android.os.Looper;
import android.os.MessageQueue;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.creative.taskscheduler.scheduler.g;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18lO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21378018lO extends AbstractC2255721DQs<InterfaceC524270KhF> implements InterfaceC524270KhF, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public final C1DRG LL;
    public C523470Kfx LLILZIL;
    public boolean LLJ;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZ(getDiContainer(), C523230KfZ.class, null);
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZIZ(getDiContainer(), String.class, "sessionId");
    public int LLILZ = -1;
    public final LinkedList<AbstractRunnableC21377818lM> LLILZLL = new LinkedList<>();
    public final LinkedList<AbstractRunnableC21377818lM> LLIZ = new LinkedList<>();
    public final LinkedList<AbstractRunnableC21377818lM> LLIZLLLIL = new LinkedList<>();
    public final Handler LLJI = new BPEAHandler(Looper.getMainLooper());
    public final C21378118lP LLJIJIL = new InterfaceC21378318lR() { // from class: X.18lP
        @Override // X.InterfaceC21378318lR
        public final void LIZJ() {
            C21378018lO c21378018lO = this.LIZ;
            c21378018lO.i3(new ARunnableS132S0100000_32(c21378018lO, 28));
        }

        @Override // X.InterfaceC21378318lR
        public final void LJ() {
            C21378018lO c21378018lO = this.LIZ;
            c21378018lO.i3(new ARunnableS132S0100000_32(c21378018lO, 27));
        }

        @Override // X.InterfaceC21378318lR
        public final void LIZ(AbstractRunnableC21377818lM abstractRunnableC21377818lM) {
            abstractRunnableC21377818lM.LJIIIIZZ();
        }

        @Override // X.InterfaceC21378318lR
        public final void LIZIZ(AbstractRunnableC21377818lM abstractRunnableC21377818lM) {
            synchronized (abstractRunnableC21377818lM) {
                abstractRunnableC21377818lM.LL = EnumC1779780wPo.RUNNING;
                abstractRunnableC21377818lM.LLILLJJLI = System.currentTimeMillis();
            }
        }

        @Override // X.InterfaceC21378318lR
        public final void LIZLLL(List<? extends AbstractRunnableC21377818lM> list) {
            C21378018lO c21378018lO = this.LIZ;
            c21378018lO.i3(new ARunnableS83S0200000_14(list, c21378018lO, 6));
        }
    };

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C21378018lO.class, "preloadTaskContext", "getPreloadTaskContext()Lcom/ss/android/ugc/aweme/creative/taskscheduler/PreloadTaskContext;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C21378018lO.class, "sessionId", "getSessionId()Ljava/lang/String;", 0);
        c09r3.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public InterfaceC524270KhF X1() {
        return this;
    }

    private final void H2() {
        if (!this.LLILZLL.isEmpty()) {
            Iterator<AbstractRunnableC21377818lM> it2 = this.LLILZLL.iterator();
            while (it2.hasNext()) {
                AbstractRunnableC21377818lM next = it2.next();
                if (!next.LLILLL.LIZLLL) {
                    this.LLIZ.add(next);
                    it2.remove();
                }
            }
        }
    }

    private final void T2() {
        if (!this.LLIZ.isEmpty()) {
            this.LLILZLL.addAll(this.LLIZ);
            this.LLIZ.clear();
        }
    }

    private final C523230KfZ Z1() {
        return (C523230KfZ) this.LLILLJJLI.getValue(this, LLJILJIL[0]);
    }

    private final String o2() {
        return (String) this.LLILLL.getValue(this, LLJILJIL[1]);
    }

    public final void O3() {
        if (this.LLJ) {
            C0TJZ.LIZ("trySubmitTasks skipped: paused by biz");
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("trySubmitTasks taskList size: ");
        sbLIZ.append(this.LLILZLL.size());
        C0TJZ.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (this.LLILZLL.isEmpty()) {
            return;
        }
        H3(this.LLILZLL);
    }

    @Override // X.InterfaceC524270KhF
    public void pause() {
        if (this.LLJ) {
            return;
        }
        C0TJZ.LIZ("pause task scheduler");
        this.LLJ = true;
        H2();
    }

    @Override // X.InterfaceC524270KhF
    public void resume() {
        if (this.LLJ) {
            C0TJZ.LIZ("resume task scheduler");
            this.LLJ = false;
            T2();
            O3();
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        String strO2 = o2();
        if (strO2 != null) {
            C0T81 c0t81 = C0T81.LIZ;
            synchronized (c0t81) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("startRecordSession sessionId: ");
                sbLIZ.append(strO2);
                C0TJZ.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                c0t81.LIZIZ(strO2);
            }
        }
        C21378418lS.LIZ.LIZJ();
        C523470Kfx c523470Kfx = this.LLILZIL;
        if (c523470Kfx != null) {
            bN1(c523470Kfx);
        }
        g.LIZ.LIZIZ(this.LLJIJIL);
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        C21378418lS c21378418lS = C21378418lS.LIZ;
        int i = C21378418lS.LJIIJ - 1;
        C21378418lS.LJIIJ = i;
        if (i <= 0) {
            synchronized (c21378418lS) {
                if (C21378418lS.LIZJ) {
                    PthreadTimer pthreadTimer = C21378418lS.LJIIIZ;
                    if (pthreadTimer == null) {
                        pthreadTimer = null;
                    }
                    pthreadTimer.cancel();
                    C21378418lS.LIZJ = false;
                    c21378418lS.LIZLLL();
                }
            }
        }
        g.LIZ.LJFF(this.LLJIJIL);
        this.LLILZLL.clear();
        this.LLIZ.clear();
        this.LLIZLLLIL.clear();
    }

    @Override // X.AbstractC2255721DQs
    public void onStart() {
        super.onStart();
        T2();
    }

    @Override // X.AbstractC2255721DQs
    public void onStop() {
        String strLJJLIIIJ;
        super.onStop();
        H2();
        synchronized (C0T81.LIZ) {
            C744690TJb.LIZ().storeInt("key_record_count", C0T81.LIZLLL);
            C744690TJb.LIZ().storeString("key_session_id", C0T81.LIZJ);
            for (String str : C0T81.LJ.keySet()) {
                ArrayList<Integer> arrayList = C0T81.LJ.get(str);
                if (arrayList == null || (strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62)) == null) {
                    strLJJLIIIJ = "";
                }
                if (str != null) {
                    C744690TJb.LIZ().storeString(str, strLJJLIIIJ);
                }
            }
        }
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        X1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [X.18lP] */
    public C21378018lO(C1DRG c1drg) {
        this.LL = c1drg;
    }

    private final boolean E3(AbstractRunnableC21377818lM abstractRunnableC21377818lM) {
        int i;
        boolean z;
        C0T81 c0t81 = C0T81.LIZ;
        C1661770tLT c1661770tLT = abstractRunnableC21377818lM.LLILLL;
        String str = c1661770tLT.LJ;
        String str2 = c1661770tLT.LJFF;
        synchronized (c0t81) {
            if (str != null && str2 != null) {
                HashMap<String, ArrayList<Integer>> map = C0T81.LJ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append('-');
                sbLIZ.append(str2);
                ArrayList<Integer> arrayList = map.get(C2188811AlT.LIZIZ(sbLIZ));
                if (arrayList != null && C0T81.LIZLLL >= 10) {
                    if (arrayList.isEmpty()) {
                        i = 0;
                    } else {
                        Iterator<Integer> it2 = arrayList.iterator();
                        i = 0;
                        while (it2.hasNext()) {
                            if (it2.next().intValue() == 1 && (i = i + 1) < 0) {
                                C1697810uHb.LJIJ();
                                throw null;
                            }
                        }
                    }
                    Integer num = C0T81.LIZIZ.get(str + '-' + str2);
                    if (num == null) {
                        num = 0;
                    }
                    if (i >= num.intValue()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        return false;
                    }
                }
            }
        }
        if (C21377618lK.LIZ != null) {
            if (C21377618lK.LIZIZ.contains(abstractRunnableC21377818lM.LLILLL.LIZ)) {
                return false;
            }
            HashMap<String, Long> map2 = C21377618lK.LIZJ;
            if (map2.containsKey(abstractRunnableC21377818lM.LLILLL.LIZ)) {
                String str3 = abstractRunnableC21377818lM.LLILLL.LIZ;
                Keva keva = (Keva) C21377718lL.LIZ.getValue();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("execute_time_");
                sbLIZ2.append(str3);
                long jCurrentTimeMillis = System.currentTimeMillis() - keva.getLong(C2188811AlT.LIZIZ(sbLIZ2), 0L);
                Long l = map2.get(abstractRunnableC21377818lM.LLILLL.LIZ);
                if (l == null) {
                    l = 0L;
                }
                if (jCurrentTimeMillis <= l.longValue()) {
                    return false;
                }
            }
        }
        return true;
    }

    private final void H3(List<? extends AbstractRunnableC21377818lM> list) {
        synchronized (g.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("GlobalTaskScheduler submit, runningTaskList size: ");
            ArrayList<AbstractRunnableC21377818lM> arrayList = g.LJ;
            sbLIZ.append(arrayList.size());
            sbLIZ.append(" maxThreadSize: ");
            sbLIZ.append(g.LJFF);
            C0TJZ.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            if (arrayList.size() >= g.LJFF) {
                return;
            }
            C786410Ut5.LJJZZIII(g.LIZLLL, new ARunnableS132S0100000_32(new ArrayList(list), 26));
        }
    }

    private final void W1(AbstractRunnableC21377818lM abstractRunnableC21377818lM) {
        if (abstractRunnableC21377818lM.LLILLL.LJI) {
        } else {
            throw new RuntimeException("This task is not flexible, please register it or make it flexibly");
        }
    }

    private final void W2(AbstractRunnableC21377818lM abstractRunnableC21377818lM) {
        if (!E3(abstractRunnableC21377818lM)) {
            this.LLIZLLLIL.add(abstractRunnableC21377818lM);
        } else if (abstractRunnableC21377818lM.LLILLL.LIZIZ) {
            q3(abstractRunnableC21377818lM);
        } else {
            this.LLILZLL.add(abstractRunnableC21377818lM);
        }
    }

    private final void m3(AbstractRunnableC21377818lM abstractRunnableC21377818lM) {
        synchronized (abstractRunnableC21377818lM) {
            abstractRunnableC21377818lM.LL = EnumC1779780wPo.RUNNING;
            abstractRunnableC21377818lM.LLILLJJLI = System.currentTimeMillis();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("on task start: ");
        sbLIZ.append(abstractRunnableC21377818lM);
        C0TJZ.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        abstractRunnableC21377818lM.run();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("on task end: ");
        sbLIZ2.append(abstractRunnableC21377818lM);
        C0TJZ.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
        abstractRunnableC21377818lM.LJIIIIZZ();
    }

    private final void q3(final AbstractRunnableC21377818lM abstractRunnableC21377818lM) {
        if (Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread())) {
            C786410Ut5.f3(new MessageQueue.IdleHandler() { // from class: X.18lQ
                @Override // android.os.MessageQueue.IdleHandler
                public final boolean queueIdle() {
                    return C21378018lO.v3(abstractRunnableC21377818lM, this);
                }
            }, Looper.myQueue());
            return;
        }
        throw new RuntimeException("please invoke moveToSubmissionTime in main thread");
    }

    public final void B3(C523470Kfx c523470Kfx) {
        if (this.LLILZIL != null) {
            return;
        }
        if (c523470Kfx.LIZJ == null) {
            this.LLILZIL = c523470Kfx;
            return;
        }
        throw new RuntimeException("previousNode shouldn't exist in beginNode");
    }

    @Override // X.InterfaceC524270KhF
    public boolean EK0(Class<? extends AbstractRunnableC21377818lM> cls) {
        EnumC1779780wPo enumC1779780wPo = null;
        AbstractRunnableC21377818lM abstractRunnableC21377818lM = (AbstractRunnableC21377818lM) getDiContainer().LJIIL(null, cls);
        if (abstractRunnableC21377818lM != null) {
            enumC1779780wPo = abstractRunnableC21377818lM.LL;
        }
        if (enumC1779780wPo == EnumC1779780wPo.DONE) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC524270KhF
    public void G32(Class<? extends AbstractRunnableC21377818lM> cls) {
        AbstractRunnableC21377818lM abstractRunnableC21377818lM = (AbstractRunnableC21377818lM) getDiContainer().LJIIL(null, cls);
        if (abstractRunnableC21377818lM == null) {
            return;
        }
        c3(abstractRunnableC21377818lM);
    }

    @Override // X.InterfaceC524270KhF
    public void UM2(AbstractRunnableC21377818lM abstractRunnableC21377818lM) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("scheduleFlexibleTask ");
        sbLIZ.append(abstractRunnableC21377818lM);
        C0TJZ.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        W1(abstractRunnableC21377818lM);
        W2(abstractRunnableC21377818lM);
        O3();
    }

    @Override // X.InterfaceC524270KhF
    public void bN1(C523470Kfx c523470Kfx) {
        AbstractRunnableC21377818lM abstractRunnableC21377818lM;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("moveToSubmissionTime: ");
        sbLIZ.append(c523470Kfx.LIZ);
        C0TJZ.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (c523470Kfx.LIZLLL) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        do {
            if (!c523470Kfx.LIZLLL) {
                arrayList.add(c523470Kfx);
            }
            c523470Kfx = c523470Kfx.LIZJ;
        } while (c523470Kfx != null);
        Collections.reverse(arrayList);
        for (C524070Kgv c524070Kgv : Z1().LIZIZ) {
            if (arrayList.contains(c524070Kgv.LIZIZ)) {
                Object objLJII = getDiContainer().LJII(c524070Kgv.LIZ, null);
                if ((objLJII instanceof AbstractRunnableC21377818lM) && (abstractRunnableC21377818lM = (AbstractRunnableC21377818lM) objLJII) != null) {
                    W2(abstractRunnableC21377818lM);
                }
            }
        }
        O3();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((C523470Kfx) it2.next()).LIZLLL = true;
        }
    }

    public final void c3(AbstractRunnableC21377818lM abstractRunnableC21377818lM) {
        if (!this.LLILZLL.remove(abstractRunnableC21377818lM) && !this.LLIZ.remove(abstractRunnableC21377818lM)) {
            this.LLIZLLLIL.remove(abstractRunnableC21377818lM);
        }
    }

    public final void i3(Runnable runnable) {
        C786410Ut5.LJJZZIII(this.LLJI, runnable);
    }

    public static final boolean v3(AbstractRunnableC21377818lM abstractRunnableC21377818lM, C21378018lO c21378018lO) {
        if (abstractRunnableC21377818lM.LL != EnumC1779780wPo.PENDING) {
            return false;
        }
        c21378018lO.m3(abstractRunnableC21377818lM);
        return false;
    }

    private final void w2(AbstractRunnableC21377818lM abstractRunnableC21377818lM, InterfaceC21377918lN interfaceC21377918lN) {
        if (abstractRunnableC21377818lM.LL == EnumC1779780wPo.DONE) {
            if (interfaceC21377918lN != null) {
                interfaceC21377918lN.onComplete();
                return;
            }
            return;
        }
        if (interfaceC21377918lN != null) {
            abstractRunnableC21377818lM.LIZLLL(interfaceC21377918lN);
        }
        if (abstractRunnableC21377818lM.LL != EnumC1779780wPo.PENDING) {
            return;
        }
        if (abstractRunnableC21377818lM.LLILLL.LIZIZ) {
            m3(abstractRunnableC21377818lM);
            return;
        }
        g gVar = g.LIZ;
        List listSingletonList = Collections.singletonList(abstractRunnableC21377818lM);
        synchronized (gVar) {
            gVar.LIZJ(null, listSingletonList, true);
        }
    }

    @Override // X.InterfaceC524270KhF
    public void IJ1(AbstractRunnableC21377818lM abstractRunnableC21377818lM, InterfaceC21377918lN interfaceC21377918lN) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("scheduleFlexibleTaskImmediately ");
        sbLIZ.append(abstractRunnableC21377818lM);
        C0TJZ.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        W1(abstractRunnableC21377818lM);
        w2(abstractRunnableC21377818lM, interfaceC21377918lN);
    }

    @Override // X.InterfaceC524270KhF
    public void bB2(Class<? extends AbstractRunnableC21377818lM> cls, InterfaceC21377918lN interfaceC21377918lN) {
        AbstractRunnableC21377818lM abstractRunnableC21377818lM = (AbstractRunnableC21377818lM) getDiContainer().LJIIL(null, cls);
        if (abstractRunnableC21377818lM == null) {
            return;
        }
        if (abstractRunnableC21377818lM.LL == EnumC1779780wPo.DONE) {
            interfaceC21377918lN.onComplete();
        } else {
            abstractRunnableC21377818lM.LIZLLL(interfaceC21377918lN);
        }
    }

    @Override // X.InterfaceC524270KhF
    public void i91(Class<? extends AbstractRunnableC21377818lM> cls, InterfaceC21377918lN interfaceC21377918lN) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("scheduleTaskImmediately ");
        sbLIZ.append(cls);
        C0TJZ.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        AbstractRunnableC21377818lM abstractRunnableC21377818lM = (AbstractRunnableC21377818lM) getDiContainer().LJIIL(null, cls);
        if (abstractRunnableC21377818lM == null) {
            return;
        }
        w2(abstractRunnableC21377818lM, interfaceC21377918lN);
        c3(abstractRunnableC21377818lM);
    }
}
