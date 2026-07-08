package X;

import Y.ACallableS257S0200000_34;
import Y.ACallableS436S0100000_34;
import Y.AfS182S0100000_13;
import Y.AfS203S0100000_34;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.1BLL, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BLL implements Handler.Callback {
    public static volatile C1BLL LLIZLLLIL;
    public static volatile boolean LLJ;
    public static volatile boolean LLJI;
    public static volatile C787280UuU LLJIJIL;
    public static volatile C11JF LLJILJIL;
    public final BPEAHandler LLILZIL;
    public volatile C1BLC LLILZLL;
    public final Executor LL = C786410Ut5.h4();
    public long LLIZ = -1;
    public final ConcurrentLinkedDeque<C1BLC> LLILLJJLI = new ConcurrentLinkedDeque<>();
    public final ConcurrentLinkedQueue<C1BLC> LLILLL = new ConcurrentLinkedQueue<>();
    public final ConcurrentHashMap<String, C1BLG> LLILZ = new ConcurrentHashMap<>();

    public static C1BLL LJ() {
        if (LLIZLLLIL == null) {
            synchronized (C1BLL.class) {
                try {
                    if (LLIZLLLIL == null) {
                        LLIZLLLIL = new C1BLL();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LLIZLLLIL;
    }

    public final void LJII() {
        synchronized (C1BLL.class) {
            try {
                if (!LLJI) {
                    LLJILJIL = (C11JF) C2214201BlK.LIZLLL().LJJLJLI(new AfS182S0100000_13(this, 104));
                    LLJI = true;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0UuU] */
    public final void LJIIIIZZ() {
        if (LLJ) {
            return;
        }
        synchronized (C1BLL.class) {
            try {
                if (!LLJ) {
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                    LLJIJIL = new BroadcastReceiver() { // from class: X.0UuU
                        public static void LIZ(Context context, Intent intent) {
                            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                                try {
                                    if (C036E.LIZ.LIZIZ()) {
                                        C1BLL.LJ().LJIILJJIL();
                                        if (C804420Vh2.LJI(context)) {
                                            C786410Ut5.LJLILLLLZI(C1BLL.LJ().LLILZIL, 1024);
                                        }
                                    }
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                }
                            }
                        }

                        @Override // android.content.BroadcastReceiver
                        public final void onReceive(Context context, Intent intent) {
                            if (!C2214201BlK.LJIIJJI && intent != null) {
                                if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                                    C2188191AkT.LIZIZ();
                                }
                            }
                            if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                                LIZ(context, intent);
                            } else {
                                C2408409cA.LIZ();
                                LIZ(context, intent);
                            }
                        }
                    };
                    C844470XAv.LIZ.getClass();
                    C786410Ut5.LJIJJ(C844470XAv.LIZ(), LLJIJIL, intentFilter);
                    LLJ = true;
                    C2214201BlK.LJ().LJJLJLI(new AfS182S0100000_13(this, 103));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJIILJJIL() {
        C15O7.LIZIZ(new ACallableS436S0100000_34(this, 5), this.LL, null);
    }

    public C1BLL() {
        HandlerThread handlerThread = new HandlerThread("df_download_thread");
        handlerThread.start();
        this.LLILZIL = new BPEAHandler(C786410Ut5.W2(handlerThread), this);
        C2214201BlK.LJ().LJJLJLI(new AfS203S0100000_34(this, 21));
    }

    public static C00BY LJIILIIL(C1BLC c1blc) {
        String str = c1blc.LIZIZ;
        c1blc.LJIIIZ.name();
        return new C00BY(str);
    }

    public final void LIZ(C1BLC c1blc) {
        int iLJII;
        if (c1blc == null) {
            return;
        }
        AbstractC2457909k9 abstractC2457909k9LIZ = C20338014i2.LIZ(c1blc.LIZ);
        if (abstractC2457909k9LIZ != null && (iLJII = abstractC2457909k9LIZ.LJII()) != 0 && iLJII != 5 && iLJII != 6 && iLJII != 7) {
            int iLJI = abstractC2457909k9LIZ.LJI();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("sessionId:");
            sbLIZ.append(iLJI);
            C1BLQ.LIZIZ(c1blc, 4, C2188811AlT.LIZIZ(sbLIZ));
            C1BLO.LIZJ.LIZLLL(iLJI).LIZLLL(new InterfaceC835730WqR() { // from class: X.1BLd
                @Override // X.InterfaceC835730WqR
                public final void onFailure(Exception exc) {
                    C1BLL c1bll = this.LIZ;
                    synchronized (c1bll) {
                        c1bll.LLIZ = System.currentTimeMillis();
                        c1bll.LLILZLL = null;
                    }
                    this.LIZ.LJIILJJIL();
                }
            });
            return;
        }
        synchronized (this) {
            this.LLIZ = System.currentTimeMillis();
            this.LLILZLL = null;
        }
        LJIILJJIL();
    }

    public final void LIZIZ(C1BLC c1blc) {
        C15O7.LIZIZ(new ACallableS257S0200000_34(this, c1blc, 2), this.LL, null).LIZLLL(new C2501509rB(c1blc, 14));
    }

    public final synchronized boolean LIZLLL(C1BLC c1blc) {
        String str;
        String strLIZIZ;
        int i;
        C1BLT.LIZIZ(c1blc);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("executeTask: ");
        sbLIZ.append(c1blc.LIZ);
        sbLIZ.append("  cur: ");
        if (this.LLILZLL == null) {
            str = "null";
        } else {
            str = this.LLILZLL.LIZ;
        }
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        C1BLG c1blgLJFF = LJFF(c1blc.LIZ);
        boolean z = c1blc.LJFF;
        if (this.LLILZLL != null && !this.LLILZLL.LJIIIZ.isFinished()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Failed because other module is currently executing:");
            sbLIZ2.append(this.LLILZLL.LIZ);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            if (c1blc.LJIIIIZZ == 2) {
                if (c1blc.equals(this.LLILLJJLI.peek())) {
                    this.LLILLJJLI.poll();
                }
                this.LLILLJJLI.addFirst(c1blc);
                C1BLQ.LIZIZ(c1blc, 1, strLIZIZ);
                LIZ(this.LLILZLL);
                LJIIJ(this.LLILZLL);
                return true;
            }
            LJIIJJI(c1blc);
            i = 7;
        } else {
            c1blgLJFF.LIZIZ(c1blc);
            if (c1blc.LJI.LJFF) {
                C844470XAv.LIZ.getClass();
                if (!C804420Vh2.LJI(C844470XAv.LIZ())) {
                    strLIZIZ = "failed because required wifi";
                    if (!z && c1blc.LJ) {
                        C586450MzL.LIZ(2131832389);
                    }
                    if (c1blc.LJI.LIZIZ) {
                        LJIIL(c1blc, 0L);
                    }
                    i = 4;
                }
            }
            C844470XAv.LIZ.getClass();
            C844470XAv.LIZ();
            try {
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (C036E.LIZ.LIZIZ()) {
                if (C2214201BlK.LJIIJJI) {
                    strLIZIZ = "failed because app is background";
                    LJII();
                    LJIIJJI(c1blc);
                    i = 6;
                } else {
                    String[] strArr = (String[]) SettingsManager.LIZLLL().LJIIIIZZ("dynafeat_block_list", String[].class, null);
                    if (strArr != null) {
                        for (String str2 : strArr) {
                            if (str2.equals(c1blc.LIZ) || str2.equals(c1blc.LIZIZ)) {
                                strLIZIZ = "blocked by remote settings";
                                i = 13;
                            }
                        }
                    }
                    if (this.LLILZLL != null && c1blc.LJIIIIZZ == 2) {
                        LIZ(this.LLILZLL);
                    }
                    C1BLQ.LIZIZ(c1blc, 1, "start to execute");
                    LJI(c1blc);
                    return true;
                }
            } else {
                strLIZIZ = "failed because no network";
                if (!z && c1blc.LJ) {
                    C586450MzL.LIZ(R.string.m25);
                }
                if (c1blc.LJI.LIZIZ) {
                    LJIIIIZZ();
                    LJIIJJI(c1blc);
                }
                i = 5;
            }
        }
        c1blc.LIZ(i, c1blc.LJIIIIZZ, null);
        C1BLQ.LIZIZ(c1blc, 1, strLIZIZ);
        return false;
    }

    public final synchronized C1BLG LJFF(String str) {
        C1BLG c1blg;
        c1blg = this.LLILZ.get(str);
        if (c1blg == null) {
            c1blg = new C1BLG(str);
            BPEAHandler bPEAHandler = C1BLN.LIZ;
            ((CopyOnWriteArrayList) C1BLN.LIZIZ).add(c1blg.LIZLLL);
            this.LLILZ.put(str, c1blg);
        }
        return c1blg;
    }

    public final void LJI(final C1BLC c1blc) {
        this.LLILZLL = c1blc;
        final String str = c1blc.LIZ;
        C1BLQ.LIZIZ(c1blc, 5, null);
        final String str2 = c1blc.LIZIZ;
        if (c1blc.LJ()) {
            C15O7.LIZJ(new Callable() { // from class: X.1BLB
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    C1BLL c1bll = this.LL;
                    C1BLC c1blc2 = c1blc;
                    String str3 = str2;
                    c1bll.getClass();
                    C1C7U.LIZ("DFDownloader@b801.internalInstall$1L");
                    c1bll.LJFF(c1blc2.LIZ).LIZJ(new C1BLM(str3, 0, 5));
                    C1C7U.LIZIZ("DFDownloader@b801.internalInstall$1L");
                    return null;
                }
            }).LIZLLL(new InterfaceC2385309Wh() { // from class: X.09Uc
                @Override // X.InterfaceC2385309Wh
                public final Object then(C15O7 c15o7) {
                    String str3 = str2;
                    C1C7U.LIZ("DFDownloader@b801.internalInstall$2L");
                    if (!c15o7.LJIILL()) {
                        C1C7U.LIZIZ("DFDownloader@b801.internalInstall$2L");
                        return null;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Error while start downloading ");
                    sbLIZ.append(str3);
                    throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ), c15o7.LJIIJJI());
                }
            });
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LLIZ;
        long jLongValue = ((Number) C08PT.LJFF.getValue()).longValue();
        if (jLongValue > jCurrentTimeMillis) {
            try {
                Thread.sleep(Math.min(jLongValue, (long) ((jLongValue - jCurrentTimeMillis) * 1.1d)));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        this.LLIZ = System.currentTimeMillis();
        InterfaceC2203391BLl interfaceC2203391BLl = C1BLO.LIZIZ.get(str);
        if (interfaceC2203391BLl != null) {
            interfaceC2203391BLl.LIZIZ();
        }
        C1BLY c1bly = C1BLO.LIZJ;
        if (c1blc instanceof C1BLX) {
            C1BLO.LIZ(c1blc, str2);
            return;
        }
        if (c1blc.LIZLLL()) {
            C1BLO.LIZ(null, str2);
            return;
        }
        C2459909kT c2459909kT = new C2459909kT();
        ((ArrayList) c2459909kT.LIZ).add(c1blc.LIZ);
        List<String> list = c1blc.LJI.LJIIIZ;
        Set<String> setLIZLLL = C08PT.LIZLLL();
        if (list != null) {
            for (Object obj : (ArrayList) list) {
                if (!setLIZLLL.contains(obj)) {
                    ((ArrayList) c2459909kT.LIZ).add(obj);
                }
            }
        }
        c1bly.LIZIZ(new C2459809kS(c2459909kT)).LJFF(new InterfaceC835710WqP() { // from class: X.14fd
            @Override // X.InterfaceC835710WqP
            public final void onSuccess(Object obj2) {
                String str3 = str;
                int iIntValue = ((Integer) obj2).intValue();
                ConcurrentHashMap<String, Integer> concurrentHashMap = C20338014i2.LIZ;
                synchronized (concurrentHashMap) {
                    try {
                        concurrentHashMap.put(str3, Integer.valueOf(iIntValue));
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        throw th2;
                    }
                }
            }
        }).LIZLLL(new InterfaceC835730WqR() { // from class: X.1BLf
            @Override // X.InterfaceC835730WqR
            public final void onFailure(Exception exc) {
                C1BLO.LIZIZ(str2, exc);
            }
        });
    }

    public final synchronized void LJIIIZ(String str) {
        C1BLG c1blgLJFF = LJFF(str);
        BPEAHandler bPEAHandler = C1BLN.LIZ;
        ((CopyOnWriteArrayList) C1BLN.LIZIZ).remove(c1blgLJFF.LIZLLL);
    }

    public final void LJIIJ(C1BLC c1blc) {
        if (c1blc == null) {
            return;
        }
        long j = c1blc.LJI.LJI;
        if (j == 0) {
            LJIIJJI(c1blc);
        } else {
            LJIIL(c1blc, j);
        }
    }

    public final void LJIIJJI(C1BLC c1blc) {
        if (c1blc == null) {
            return;
        }
        c1blc.LJFF = true;
        c1blc.LJI.LIZ = false;
        c1blc.LJIIIIZZ = 0;
        C1BLQ.LIZIZ(c1blc, 2, "retry immediately");
        LIZJ(c1blc, this.LLILLJJLI);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 1024) {
            boolean z = false;
            for (C1BLC c1blc : this.LLILLL) {
                if (c1blc.LJIILIIL <= System.currentTimeMillis()) {
                    if (c1blc.LJI.LJFF) {
                        C844470XAv.LIZ.getClass();
                        if (C804420Vh2.LJI(C844470XAv.LIZ())) {
                        }
                    }
                    LIZJ(c1blc, this.LLILLJJLI);
                    this.LLILLL.remove(c1blc);
                    z = true;
                }
            }
            if (z) {
                LJIILJJIL();
            }
        }
        return true;
    }

    public final void LIZJ(C1BLC c1blc, AbstractCollection<C1BLC> abstractCollection) {
        if (abstractCollection.contains(c1blc)) {
            int i = C202056144g.LIZ[c1blc.LJI.LJII.ordinal()];
            if (i != 2) {
                if (i == 3) {
                    return;
                }
            } else {
                abstractCollection.remove(c1blc);
            }
        }
        if (abstractCollection == this.LLILLJJLI) {
            ConcurrentLinkedDeque concurrentLinkedDeque = new ConcurrentLinkedDeque();
            boolean z = false;
            for (C1BLC c1blc2 : this.LLILLJJLI) {
                if (!z && c1blc.LJII < c1blc2.LJII) {
                    concurrentLinkedDeque.addLast(c1blc);
                    z = true;
                }
                concurrentLinkedDeque.addLast(c1blc2);
            }
            if (!z) {
                concurrentLinkedDeque.addLast(c1blc);
            }
            this.LLILLJJLI.clear();
            this.LLILLJJLI.addAll(concurrentLinkedDeque);
            return;
        }
        abstractCollection.add(c1blc);
    }

    public final void LJIIL(C1BLC c1blc, long j) {
        if (c1blc == null) {
            return;
        }
        c1blc.LJFF = true;
        c1blc.LJI.LIZ = false;
        c1blc.LJIIIIZZ = 0;
        if (j == 0) {
            c1blc.LJIIL = j;
            c1blc.LJIILIIL = System.currentTimeMillis() + j;
            LIZJ(c1blc, this.LLILLL);
            if (c1blc.LJI.LJFF) {
                LJIIIIZZ();
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("delay:");
            sbLIZ.append(j);
            C1BLQ.LIZIZ(c1blc, 2, C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        long j2 = c1blc.LJIIL + j;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("delay:");
        sbLIZ2.append(j2);
        C1BLQ.LIZIZ(c1blc, 2, C2188811AlT.LIZIZ(sbLIZ2));
        if (j2 / j > 5) {
            return;
        }
        c1blc.LJIIL = j2;
        c1blc.LJIILIIL = System.currentTimeMillis() + j2;
        LIZJ(c1blc, this.LLILLL);
        if (c1blc.LJI.LJFF) {
            LJIIIIZZ();
        }
        C786410Ut5.LJLJJI(1024, j2, this.LLILZIL);
    }
}
