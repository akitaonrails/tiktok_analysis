package X;

import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.CompleteCallback;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bPo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C972540bPo implements InterfaceC972720bQ6, InterfaceC420801kM {
    public final C964730bDD LL;
    public final Map<C972560bPq, InterfaceC420801kM> LLILLJJLI;

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        Iterator<T> it2 = this.LLILLJJLI.values().iterator();
        while (it2.hasNext()) {
            ((InterfaceC420801kM) it2.next()).dispose();
        }
        this.LLILLJJLI.clear();
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return this.LLILLJJLI.isEmpty();
    }

    public C972540bPo(C964730bDD c964730bDD) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.LL = c964730bDD;
        this.LLILLJJLI = concurrentHashMap;
    }

    @Override // X.InterfaceC972720bQ6
    public final boolean LIZ(String str) {
        Object next;
        Iterator<T> it2 = this.LLILLJJLI.keySet().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(((C972560bPq) next).LIZJ, str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C972560bPq c972560bPq = (C972560bPq) next;
        if (c972560bPq != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("on link remove timer [");
            sbLIZ.append(c972560bPq);
            sbLIZ.append(']');
            C1304630k3R.LIZLLL(6, C2188811AlT.LIZIZ(sbLIZ), "Timer");
            InterfaceC420801kM interfaceC420801kMRemove = this.LLILLJJLI.remove(c972560bPq);
            if (interfaceC420801kMRemove != null) {
                interfaceC420801kMRemove.dispose();
            }
            C964730bDD c964730bDD = this.LL;
            if (c964730bDD != null) {
                C500260Jjc.LJJLIIIJILLIZJL(new C972490bPj(c972560bPq.LIZ, c964730bDD, c972560bPq.LIZIZ));
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC972720bQ6
    public final String LIZJ(EnumC2231831CWv enumC2231831CWv, double d, long j, final CompleteCallback completeCallback) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("add link timer [");
        sbLIZ.append(enumC2231831CWv);
        sbLIZ.append(": ");
        sbLIZ.append(j);
        sbLIZ.append("], duration is ");
        sbLIZ.append(d);
        sbLIZ.append(" S");
        C1304630k3R.LIZLLL(6, C2188811AlT.LIZIZ(sbLIZ), "Timer");
        final C972560bPq c972560bPq = new C972560bPq(enumC2231831CWv, j);
        final long jLIZJ = C814420VxA.LIZJ(d);
        if (jLIZJ <= 0) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("on link timer [");
            sbLIZ2.append(c972560bPq);
            sbLIZ2.append("] duration is ");
            sbLIZ2.append(d);
            sbLIZ2.append(" S, ignore");
            C1304630k3R.LJII(6, C2188811AlT.LIZIZ(sbLIZ2), "Timer");
            return "";
        }
        this.LLILLJJLI.put(c972560bPq, new C11IW(C11NZ.LJJJJLL(0L, jLIZJ, 0L, 1L, TimeUnit.SECONDS).LJJIII(new C09JN() { // from class: X.0bPn
            @Override // X.C09JN
            public final void accept(Object obj) {
                C964730bDD c964730bDD;
                C1C7U.LIZ("RustLinkTimer@4865.fixedTimer$1");
                Long l = (Long) obj;
                long jLongValue = l.longValue();
                long j2 = jLIZJ;
                if (jLongValue < j2 && (c964730bDD = this.LL) != null) {
                    C972560bPq c972560bPq2 = c972560bPq;
                    long jLongValue2 = j2 - l.longValue();
                    EnumC2231831CWv enumC2231831CWv2 = c972560bPq2.LIZ;
                    long j3 = c972560bPq2.LIZIZ;
                    int i = C972520bPm.LIZ[enumC2231831CWv2.ordinal()];
                    if (i != 1) {
                        if (i != 2) {
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("on count down of type:");
                            sbLIZ3.append(enumC2231831CWv2);
                            sbLIZ3.append(", uid: ");
                            sbLIZ3.append(j3);
                            sbLIZ3.append(" - left[");
                            sbLIZ3.append(jLongValue2);
                            sbLIZ3.append(']');
                            C1304630k3R.LIZLLL(6, C2188811AlT.LIZIZ(sbLIZ3), "RustCrossTimer");
                        } else {
                            c964730bDD.LLILII(j3, jLongValue2);
                        }
                    } else {
                        c964730bDD.LLLLLLLLLL(j3, jLongValue2);
                    }
                }
                C1C7U.LIZIZ("RustLinkTimer@4865.fixedTimer$1");
            }
        }).LJJJLZIJ(C969310bKb.LJ).LJJIIJZLJL(new InterfaceC781210Ukh() { // from class: X.0bPp
            @Override // X.InterfaceC781210Ukh
            public final void run() throws Exception {
                InterfaceC420801kM interfaceC420801kM = this.LIZ.LLILLJJLI.get(c972560bPq);
                if (interfaceC420801kM == null) {
                    return;
                }
                C972560bPq c972560bPq2 = c972560bPq;
                CompleteCallback completeCallback2 = completeCallback;
                C972540bPo c972540bPo = this.LIZ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append('[');
                sbLIZ3.append(C786410Ut5.u3().getName());
                sbLIZ3.append("] on link timeout [");
                sbLIZ3.append(c972560bPq2);
                sbLIZ3.append(']');
                C1304630k3R.LIZLLL(6, C2188811AlT.LIZIZ(sbLIZ3), "Timer");
                Throwable th = null;
                try {
                    completeCallback2.LIZIZ();
                    C1306420k6K.LIZ(completeCallback2, null);
                    C964730bDD c964730bDD = c972540bPo.LL;
                    if (c964730bDD != null) {
                        C500260Jjc.LJJLIIIJILLIZJL(new C972480bPi(c972560bPq2.LIZ, c964730bDD, c972560bPq2.LIZIZ));
                    }
                    interfaceC420801kM.dispose();
                } catch (Throwable th2) {
                    try {
                        TryCatchGuardChecker.doCheck(th2);
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            th = th3;
                            th = th2;
                            while (true) {
                                try {
                                    TryCatchGuardChecker.doCheck(th);
                                    C1306420k6K.LIZ(completeCallback2, th);
                                    throw th;
                                } catch (Throwable th4) {
                                    th = th4;
                                }
                            }
                        }
                    } catch (Throwable th5) {
                        th = th5;
                    }
                }
            }
        })).LJIILL().LJIIZILJ());
        return c972560bPq.LIZJ;
    }
}
