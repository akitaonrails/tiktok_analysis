package X;

import Y.ARunnableS35S1200000_33;
import android.os.Process;
import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.AwS182S1100000_33;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.1Ag6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2185481Ag6 implements InterfaceC2184381AeK {
    public final List<C2185491Ag7> LIZ;
    public final InterfaceC2185511Ag9 LIZIZ;
    public final ConcurrentHashMap<Integer, C2185521AgA> LIZJ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<Integer, C2185471Ag5> LIZLLL = new ConcurrentHashMap<>();
    public final CopyOnWriteArrayList<String> LJ = new CopyOnWriteArrayList<>();
    public final Map<String, ScheduledFuture<?>> LJFF = new LinkedHashMap();
    public final Map<String, ScheduledFuture<?>> LJI = new LinkedHashMap();

    /* JADX WARN: Removed duplicated region for block: B:48:0x00c4 A[Catch: Exception -> 0x0138, TryCatch #3 {Exception -> 0x0138, blocks: (B:34:0x008f, B:36:0x009c, B:38:0x00a2, B:39:0x00a6, B:41:0x00ac, B:45:0x00bd, B:48:0x00c4, B:50:0x00d3, B:52:0x00d9, B:63:0x0115, B:46:0x00c0, B:65:0x011a), top: B:121:0x008f }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x014c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 519
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2185481Ag6.LJI():void");
    }

    public final void LJII() {
        Object c098200Yq;
        Object c098200Yq2;
        int iD;
        Object c098200Yq3;
        if (!this.LIZJ.isEmpty()) {
            Iterator<Map.Entry<Integer, C2185521AgA>> it2 = this.LIZJ.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry<Integer, C2185521AgA> next = it2.next();
                try {
                    int iLJ = C13LZ.LJ(Process.getThreadPriority(next.getKey().intValue()) - next.getValue().LIZIZ, -20, 19);
                    InterfaceC2185511Ag9 interfaceC2185511Ag9 = this.LIZIZ;
                    if (interfaceC2185511Ag9 != null) {
                        interfaceC2185511Ag9.LIZLLL(next.getKey().intValue(), iLJ);
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("[Scene Start] After adjust priority,  ");
                    sbLIZ.append(next.getValue().LIZ);
                    sbLIZ.append(" priority is ");
                    sbLIZ.append(Process.getThreadPriority(next.getKey().intValue()));
                    sbLIZ.append(", tid: ");
                    sbLIZ.append(next.getKey().intValue());
                    c098200Yq3 = Integer.valueOf(Log.d("ThreadBooster", C2188811AlT.LIZIZ(sbLIZ)));
                    C189200o6.m2constructorimpl(c098200Yq3);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq3 = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq3);
                }
                if (C189200o6.m5exceptionOrNullimpl(c098200Yq3) != null) {
                    it2.remove();
                }
            }
        }
        if (!this.LIZLLL.isEmpty()) {
            for (Map.Entry<Integer, C2185471Ag5> entry : this.LIZLLL.entrySet()) {
                int iIntValue = entry.getKey().intValue();
                C2185471Ag5 value = entry.getValue();
                try {
                    if (value.LIZIZ == 1) {
                        InterfaceC2185511Ag9 interfaceC2185511Ag92 = this.LIZIZ;
                        if (interfaceC2185511Ag92 != null) {
                            interfaceC2185511Ag92.bindBigCore(iIntValue);
                        }
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("[Scene Start] Big core is bound, ");
                        sbLIZ2.append(value.LIZ);
                        sbLIZ2.append(", tid: ");
                        sbLIZ2.append(iIntValue);
                        iD = Log.d("ThreadBooster", C2188811AlT.LIZIZ(sbLIZ2));
                    } else {
                        InterfaceC2185511Ag9 interfaceC2185511Ag93 = this.LIZIZ;
                        if (interfaceC2185511Ag93 != null) {
                            interfaceC2185511Ag93.bindLittleCore(iIntValue);
                        }
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("[Scene Start] Little core is bound, ");
                        sbLIZ3.append(value.LIZ);
                        sbLIZ3.append(", tid: ");
                        sbLIZ3.append(iIntValue);
                        iD = Log.d("ThreadBooster", C2188811AlT.LIZIZ(sbLIZ3));
                    }
                    c098200Yq2 = Integer.valueOf(iD);
                    C189200o6.m2constructorimpl(c098200Yq2);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    c098200Yq2 = new C098200Yq(th2);
                    C189200o6.m2constructorimpl(c098200Yq2);
                }
                C189200o6.m5exceptionOrNullimpl(c098200Yq2);
            }
        }
        if (this.LJ.isEmpty()) {
            return;
        }
        for (String str : this.LJ) {
            try {
                InterfaceC2185511Ag9 interfaceC2185511Ag94 = this.LIZIZ;
                if (interfaceC2185511Ag94 != null) {
                    interfaceC2185511Ag94.LIZJ(str);
                }
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("[Scene Start] Thread is suspended, ");
                sbLIZ4.append(str);
                c098200Yq = Integer.valueOf(Log.d("ThreadBooster", C2188811AlT.LIZIZ(sbLIZ4)));
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
                c098200Yq = new C098200Yq(th3);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m5exceptionOrNullimpl(c098200Yq);
        }
    }

    public final void LJIIIIZZ() {
        Object c098200Yq;
        Object c098200Yq2;
        Object c098200Yq3;
        if (!this.LIZJ.isEmpty()) {
            Iterator<Map.Entry<Integer, C2185521AgA>> it2 = this.LIZJ.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry<Integer, C2185521AgA> next = it2.next();
                try {
                    Process.getThreadPriority(next.getKey().intValue());
                    InterfaceC2185511Ag9 interfaceC2185511Ag9 = this.LIZIZ;
                    if (interfaceC2185511Ag9 != null) {
                        interfaceC2185511Ag9.LIZIZ(next.getKey().intValue());
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("[Scene Stop] After reset priority, ");
                    sbLIZ.append(next.getValue().LIZ);
                    sbLIZ.append(" priority is ");
                    sbLIZ.append(Process.getThreadPriority(next.getKey().intValue()));
                    c098200Yq3 = Integer.valueOf(Log.d("ThreadBooster", C2188811AlT.LIZIZ(sbLIZ)));
                    C189200o6.m2constructorimpl(c098200Yq3);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq3 = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq3);
                }
                if (C189200o6.m5exceptionOrNullimpl(c098200Yq3) != null) {
                    it2.remove();
                }
            }
        }
        if (!this.LIZLLL.isEmpty()) {
            for (Map.Entry<Integer, C2185471Ag5> entry : this.LIZLLL.entrySet()) {
                int iIntValue = entry.getKey().intValue();
                C2185471Ag5 value = entry.getValue();
                try {
                    InterfaceC2185511Ag9 interfaceC2185511Ag92 = this.LIZIZ;
                    if (interfaceC2185511Ag92 != null) {
                        interfaceC2185511Ag92.resetCoreBind(iIntValue);
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("[Scene Stop] Cpu core is reset, ");
                    sbLIZ2.append(value.LIZ);
                    c098200Yq2 = Integer.valueOf(Log.d("ThreadBooster", C2188811AlT.LIZIZ(sbLIZ2)));
                    C189200o6.m2constructorimpl(c098200Yq2);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    c098200Yq2 = new C098200Yq(th2);
                    C189200o6.m2constructorimpl(c098200Yq2);
                }
                C189200o6.m5exceptionOrNullimpl(c098200Yq2);
            }
        }
        if (this.LJ.isEmpty()) {
            return;
        }
        try {
            for (String str : this.LJ) {
                InterfaceC2185511Ag9 interfaceC2185511Ag93 = this.LIZIZ;
                if (interfaceC2185511Ag93 != null) {
                    interfaceC2185511Ag93.LIZ(str);
                }
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            c098200Yq = new C098200Yq(th3);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
    }

    @Override // X.InterfaceC2184381AeK
    public final void LIZ(String str) {
        ScheduledFuture scheduledFuture = (ScheduledFuture) ((LinkedHashMap) this.LJFF).get(str);
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        this.LJFF.remove(str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("_timeout");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        ScheduledFuture scheduledFuture2 = (ScheduledFuture) ((LinkedHashMap) this.LJI).get(strLIZIZ);
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(true);
            this.LJI.remove(strLIZIZ);
        }
        if (this.LJFF.isEmpty()) {
            for (Map.Entry entry : ((LinkedHashMap) this.LJI).entrySet()) {
                entry.getKey();
                ((ScheduledFuture) entry.getValue()).cancel(true);
            }
            ((LinkedHashMap) this.LJI).clear();
        }
    }

    @Override // X.InterfaceC2184381AeK
    public final void LIZIZ(String str) {
        ScheduledFuture scheduledFuture;
        LJIIIIZZ();
        for (C2185491Ag7 c2185491Ag7 : this.LIZ) {
            if (c2185491Ag7.LIZ == 1 && c2185491Ag7.LJFF > 0 && (c2185491Ag7.LJII || c2185491Ag7.LJI)) {
                if (!c2185491Ag7.LJIIIIZZ && (scheduledFuture = (ScheduledFuture) ((LinkedHashMap) this.LJFF).get(str)) != null) {
                    scheduledFuture.cancel(true);
                }
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("_timeout");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        ScheduledFuture scheduledFuture2 = (ScheduledFuture) ((LinkedHashMap) this.LJI).get(strLIZIZ);
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(true);
            this.LJI.remove(strLIZIZ);
        }
    }

    @Override // X.InterfaceC2184381AeK
    public final void LIZJ(String str) throws Throwable {
        LJI();
        LJFF(str, false);
    }

    @Override // X.InterfaceC2184381AeK
    public final void LIZLLL(String str) {
        LJII();
        LJFF(str, true);
        Iterator<C2185491Ag7> it2 = this.LIZ.iterator();
        if (it2.hasNext()) {
            Long lValueOf = Long.valueOf(it2.next().LJ);
            while (it2.hasNext()) {
                Long lValueOf2 = Long.valueOf(it2.next().LJ);
                if (lValueOf.compareTo(lValueOf2) < 0) {
                    lValueOf = lValueOf2;
                }
            }
            if (lValueOf != null) {
                long jLongValue = lValueOf.longValue();
                if (jLongValue > 0) {
                    String strConcat = str.concat("_timeout");
                    AwS182S1100000_33 awS182S1100000_33 = new AwS182S1100000_33(str, this, 0);
                    ScheduledFuture scheduledFuture = (ScheduledFuture) ((LinkedHashMap) this.LJI).get(strConcat);
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(true);
                        this.LJI.remove(strConcat);
                    }
                    this.LJI.put(strConcat, ((ScheduledExecutorService) C0NBO.LIZLLL.getValue()).scheduleWithFixedDelay(new RunnableC584540MwG(new ARunnableS35S1200000_33(awS182S1100000_33, this, strConcat, 3)), jLongValue, jLongValue, TimeUnit.MILLISECONDS));
                }
            }
        }
    }

    @Override // X.InterfaceC2184381AeK
    public final void LJ(String str) {
        Object c098200Yq;
        Object c098200Yq2;
        int iD;
        Object c098200Yq3;
        int iMyTid = Process.myTid();
        if (!this.LIZJ.containsKey(Integer.valueOf(Process.myTid()))) {
            for (C2185491Ag7 c2185491Ag7 : this.LIZ) {
                if (c2185491Ag7.LIZ == 2) {
                    for (C2185521AgA c2185521AgA : c2185491Ag7.LIZIZ) {
                        if (c2185521AgA.LIZ.length() > 0 && a0.LJJIIZI(str, c2185521AgA.LIZ, false)) {
                            try {
                                int iLJ = C13LZ.LJ(Process.getThreadPriority(iMyTid) - c2185521AgA.LIZIZ, -20, 19);
                                InterfaceC2185511Ag9 interfaceC2185511Ag9 = this.LIZIZ;
                                if (interfaceC2185511Ag9 != null) {
                                    interfaceC2185511Ag9.LIZLLL(iMyTid, iLJ);
                                }
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("[OnRunnableStart] After adjust priority,  ");
                                sbLIZ.append(str);
                                sbLIZ.append(" priority is ");
                                sbLIZ.append(Process.getThreadPriority(iMyTid));
                                sbLIZ.append(", tid: ");
                                sbLIZ.append(iMyTid);
                                c098200Yq3 = Integer.valueOf(Log.d("ThreadBooster", C2188811AlT.LIZIZ(sbLIZ)));
                                C189200o6.m2constructorimpl(c098200Yq3);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                c098200Yq3 = new C098200Yq(th);
                                C189200o6.m2constructorimpl(c098200Yq3);
                            }
                            C189200o6.m5exceptionOrNullimpl(c098200Yq3);
                            this.LIZJ.put(Integer.valueOf(iMyTid), new C2185521AgA(str, c2185521AgA.LIZIZ));
                        }
                    }
                }
            }
        }
        int iMyTid2 = Process.myTid();
        if (!this.LIZLLL.containsKey(Integer.valueOf(iMyTid2))) {
            for (C2185491Ag7 c2185491Ag72 : this.LIZ) {
                if (c2185491Ag72.LIZ == 2) {
                    for (C2185471Ag5 c2185471Ag5 : c2185491Ag72.LIZJ) {
                        if (c2185471Ag5.LIZ.length() > 0 && a0.LJJIIZI(str, c2185471Ag5.LIZ, false)) {
                            try {
                                if (c2185471Ag5.LIZIZ == 1) {
                                    InterfaceC2185511Ag9 interfaceC2185511Ag92 = this.LIZIZ;
                                    if (interfaceC2185511Ag92 != null) {
                                        interfaceC2185511Ag92.bindBigCore(iMyTid2);
                                    }
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append("[OnRunnableStart] Big core is bound, ");
                                    sbLIZ2.append(str);
                                    sbLIZ2.append(", tid: ");
                                    sbLIZ2.append(iMyTid2);
                                    iD = Log.d("ThreadBooster", C2188811AlT.LIZIZ(sbLIZ2));
                                } else {
                                    InterfaceC2185511Ag9 interfaceC2185511Ag93 = this.LIZIZ;
                                    if (interfaceC2185511Ag93 != null) {
                                        interfaceC2185511Ag93.bindLittleCore(iMyTid2);
                                    }
                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                    sbLIZ3.append("[OnRunnableStart] Little core is bound, ");
                                    sbLIZ3.append(str);
                                    sbLIZ3.append(", tid: ");
                                    sbLIZ3.append(iMyTid2);
                                    iD = Log.d("ThreadBooster", C2188811AlT.LIZIZ(sbLIZ3));
                                }
                                c098200Yq2 = Integer.valueOf(iD);
                                C189200o6.m2constructorimpl(c098200Yq2);
                            } catch (Throwable th2) {
                                TryCatchGuardChecker.doCheck(th2);
                                c098200Yq2 = new C098200Yq(th2);
                                C189200o6.m2constructorimpl(c098200Yq2);
                            }
                            C189200o6.m5exceptionOrNullimpl(c098200Yq2);
                            this.LIZLLL.put(Integer.valueOf(iMyTid2), new C2185471Ag5(str, c2185471Ag5.LIZIZ));
                        }
                    }
                }
            }
        }
        if (str.length() > 0 && this.LJ.contains(str)) {
            return;
        }
        for (C2185491Ag7 c2185491Ag73 : this.LIZ) {
            if (c2185491Ag73.LIZ == 2) {
                for (C2185421Ag0 c2185421Ag0 : c2185491Ag73.LIZLLL) {
                    if (c2185421Ag0.LIZ.length() > 0 && a0.LJJIIZI(str, c2185421Ag0.LIZ, false)) {
                        try {
                            InterfaceC2185511Ag9 interfaceC2185511Ag94 = this.LIZIZ;
                            if (interfaceC2185511Ag94 != null) {
                                interfaceC2185511Ag94.LIZJ(str);
                            }
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append("[OnRunnableStart] Thread is suspended, ");
                            sbLIZ4.append(str);
                            c098200Yq = Integer.valueOf(Log.d("ThreadBooster", C2188811AlT.LIZIZ(sbLIZ4)));
                            C189200o6.m2constructorimpl(c098200Yq);
                        } catch (Throwable th3) {
                            TryCatchGuardChecker.doCheck(th3);
                            c098200Yq = new C098200Yq(th3);
                            C189200o6.m2constructorimpl(c098200Yq);
                        }
                        C189200o6.m5exceptionOrNullimpl(c098200Yq);
                        this.LJ.add(str);
                    }
                }
            }
        }
    }

    public C2185481Ag6(List<C2185491Ag7> list, InterfaceC2185511Ag9 interfaceC2185511Ag9) {
        this.LIZ = list;
        this.LIZIZ = interfaceC2185511Ag9;
    }

    public final void LJFF(final String str, final boolean z) {
        for (final C2185491Ag7 c2185491Ag7 : this.LIZ) {
            if (c2185491Ag7.LIZ == 1 && c2185491Ag7.LJFF > 0 && (c2185491Ag7.LJII || c2185491Ag7.LJI)) {
                final long jMax = Math.max(0L, c2185491Ag7.LJFF);
                if (jMax <= 0) {
                    return;
                }
                ScheduledFuture scheduledFuture = (ScheduledFuture) ((LinkedHashMap) this.LJFF).get(str);
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(true);
                }
                if (!c2185491Ag7.LJI && (!c2185491Ag7.LJII || !z)) {
                    return;
                }
                this.LJFF.put(str, ((ScheduledExecutorService) C0NBO.LIZLLL.getValue()).scheduleWithFixedDelay(new RunnableC584540MwG(new Runnable(str, c2185491Ag7, jMax, this, z) { // from class: X.1Ag8
                    public final /* synthetic */ C2185491Ag7 LL;
                    public final /* synthetic */ C2185481Ag6 LLILLJJLI;
                    public final /* synthetic */ boolean LLILLL;

                    {
                        this.LL = c2185491Ag7;
                        this.LLILLJJLI = this;
                        this.LLILLL = z;
                    }

                    @Override // java.lang.Runnable
                    public final void run() throws Throwable {
                        C2185491Ag7 c2185491Ag72 = this.LL;
                        C2185481Ag6 c2185481Ag6 = this.LLILLJJLI;
                        boolean z2 = this.LLILLL;
                        C1C7U.LIZ("ThreadBoostSchedulerImpl@28ba.checkPollingStart$1L");
                        if (c2185491Ag72.LJI) {
                            c2185481Ag6.LJI();
                        }
                        if (c2185491Ag72.LJII && z2) {
                            c2185481Ag6.LJIIIIZZ();
                            long j = c2185491Ag72.LJIIJ;
                            if (j > 0) {
                                Thread.sleep(j);
                            }
                            c2185481Ag6.LJII();
                        }
                        C1C7U.LIZIZ("ThreadBoostSchedulerImpl@28ba.checkPollingStart$1L");
                    }
                }), jMax, jMax, TimeUnit.MILLISECONDS));
            }
        }
    }
}
