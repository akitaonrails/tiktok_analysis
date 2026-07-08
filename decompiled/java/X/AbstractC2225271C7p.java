package X;

import Y.ARunnableS103S0200000_34;
import Y.ARunnableS132S0100000_32;
import Y.ARunnableS36S1200000_34;
import Y.ARunnableS38S1100000_34;
import android.os.Handler;
import com.bytedance.otis.attribution.JarvisDebugConfig;
import com.bytedance.otis.attribution.api.IJarvisMonitorService;
import com.bytedance.otis.attribution.api.IJavaStackBackMonitor;
import com.bytedance.otis.attribution.api.IJavaStackBackMonitorCallback;
import com.bytedance.otis.attribution.api.IJavaStackMainMonitor;
import com.bytedance.otis.attribution.api.IJavaStackMainMonitorCallback;
import com.bytedance.otis.attribution.api.INativeStackMonitor;
import com.bytedance.otis.attribution.api.INativeStackMonitorCallback;
import com.bytedance.otis.attribution.collector.ThreadMonitor;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.1C7p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public abstract class AbstractC2225271C7p implements C146A {
    public final String LIZ;
    public AbstractC202127146z LIZIZ;
    public C1C7W LIZJ;
    public C2225261C7o LIZLLL;
    public ThreadMonitor LJ;
    public IJavaStackMainMonitor LJFF;
    public IJavaStackBackMonitor LJI;
    public INativeStackMonitor LJII;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public int LJIIJJI;
    public long LJIIL;
    public int LJIIIIZZ = -1;
    public final ConcurrentHashMap<Long, String> LJIILIIL = new ConcurrentHashMap<>();
    public final C01GW LJIILJJIL = C452501pT.LIZIZ(new C202108146g());

    @Override // X.C146A
    public final boolean LJ() {
        C146W c146w = C146T.LIZIZ;
        if (c146w.LIZ != 0) {
            return c146w.LJ != null || this.LJIIIIZZ == 1;
        }
        return false;
    }

    public final Handler LJI() {
        return (Handler) this.LJIILJJIL.getValue();
    }

    public final boolean LJII() {
        String str;
        JarvisDebugConfig jarvisDebugConfig = C146T.LIZIZ.LJ;
        if (jarvisDebugConfig == null || (str = jarvisDebugConfig.scene) == null || a0.LJJJIL(str)) {
            return true;
        }
        return Intrinsics.LJFF(jarvisDebugConfig.scene, this.LIZ);
    }

    public final void LJIIIIZZ() {
        if (this.LJIIIZ) {
            C2225431C8f.LIZJ++;
            C786410Ut5.LJLIIL(C146T.LIZIZ.LIZIZ, LJI(), C2225431C8f.LIZLLL);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.HashMap, java.util.LinkedHashMap] */
    @Override // X.C146A
    public final void stop() {
        ?? LJ;
        if (LJII()) {
            C146T.LIZLLL.remove(this.LIZ);
            if (LJ() && this.LJIIJ) {
                C2225261C7o c2225261C7o = this.LIZLLL;
                if (c2225261C7o != null) {
                    LJ = new LinkedHashMap();
                    for (Map.Entry<String, C1777620wMK> entry : c2225261C7o.LIZ.entrySet()) {
                        LJ.put(entry.getKey(), Long.valueOf(entry.getValue().LIZLLL));
                    }
                } else {
                    LJ = C2097608Jq.LJ();
                }
                ThreadMonitor threadMonitor = this.LJ;
                if (threadMonitor != null) {
                    threadMonitor.LIZJ(false);
                }
                C1C7W c1c7w = this.LIZJ;
                if (c1c7w != null) {
                    c1c7w.LIZIZ();
                }
                IJavaStackMainMonitor iJavaStackMainMonitor = this.LJFF;
                if (iJavaStackMainMonitor != null) {
                    iJavaStackMainMonitor.stop(false);
                }
                IJavaStackBackMonitor iJavaStackBackMonitor = this.LJI;
                if (iJavaStackBackMonitor != null) {
                    iJavaStackBackMonitor.stop();
                }
                INativeStackMonitor iNativeStackMonitor = this.LJII;
                if (iNativeStackMonitor != null) {
                    iNativeStackMonitor.stop(this.LIZ);
                }
                INativeStackMonitor iNativeStackMonitor2 = this.LJII;
                long currentTimeMs = iNativeStackMonitor2 != null ? iNativeStackMonitor2.getCurrentTimeMs(this.LIZ) : 0L;
                if (currentTimeMs > 0) {
                    this.LJIILIIL.put(Long.valueOf(currentTimeMs), LJ.isEmpty() ? "" : C13LP.LJJLIIIJ(C13LP.LJLLLL(new C512501z9(new C512401z8(58), 12), LJ.entrySet()), "\n", null, null, 0, null, AnonymousClass0207.get$arr$(124), 30));
                }
                C2225261C7o c2225261C7o2 = this.LIZLLL;
                if (c2225261C7o2 != null) {
                    if (c2225261C7o2.LIZJ.length() > 0) {
                        c2225261C7o2.LIZIZ(c2225261C7o2.LIZJ);
                    }
                    ConcurrentHashMap<String, C1777620wMK> concurrentHashMap = c2225261C7o2.LIZ;
                    c2225261C7o2.LIZ = new ConcurrentHashMap<>();
                    c2225261C7o2.LIZJ = "";
                    InterfaceC2190421Ao4 interfaceC2190421Ao4 = c2225261C7o2.LIZIZ;
                    if (interfaceC2190421Ao4 != null) {
                        interfaceC2190421Ao4.LIZ(concurrentHashMap);
                    }
                }
                InterfaceC202116146o interfaceC202116146o = C146T.LIZJ;
                if (interfaceC202116146o != null) {
                    interfaceC202116146o.LIZIZ(this.LJIIJJI, this.LIZ);
                }
                IJavaStackMainMonitor iJavaStackMainMonitor2 = this.LJFF;
                if (iJavaStackMainMonitor2 != null) {
                    iJavaStackMainMonitor2.setStageCount(this.LJIIJJI);
                }
                this.LJIIJJI = 0;
                LJIIIIZZ();
                this.LJIIJ = false;
            }
        }
    }

    public AbstractC2225271C7p(String str) {
        this.LIZ = str;
    }

    @Override // X.C146A
    public final void LIZ(String str) {
        C2225261C7o c2225261C7o;
        boolean z;
        if (LJ() && this.LJIIJ && (c2225261C7o = this.LIZLLL) != null) {
            IJavaStackMainMonitor iJavaStackMainMonitor = this.LJFF;
            boolean z2 = false;
            if (iJavaStackMainMonitor != null) {
                if (C146T.LIZIZ.LJ != null) {
                    z = true;
                } else {
                    z = false;
                }
                iJavaStackMainMonitor.stop(z);
            }
            c2225261C7o.LIZ(str);
            this.LJIIJJI++;
            IJavaStackMainMonitor iJavaStackMainMonitor2 = this.LJFF;
            if (iJavaStackMainMonitor2 != null) {
                if (C146T.LIZIZ.LJ != null) {
                    z2 = true;
                }
                iJavaStackMainMonitor2.start(str, z2);
            }
        }
    }

    @Override // X.C146A
    public final void LIZIZ(float f) {
        int iLIZJ;
        int i;
        String str;
        IJavaStackMainMonitor iJavaStackMainMonitorCreateJavaStackMainMonitor;
        boolean z;
        boolean z2;
        if (!LJII()) {
            return;
        }
        C146T c146t = C146T.LIZ;
        float f2 = 1.0f;
        if (C146T.LIZIZ.LJ != null) {
            f = 1.0f;
        }
        C146T.LIZLLL.add(this.LIZ);
        int i2 = C146T.LIZIZ.LIZ;
        if (i2 != 0 && this.LJIIIIZZ == -1) {
            float fNextFloat = new Random().nextFloat();
            int i3 = i2 & 16;
            if (i3 != 0) {
                InterfaceC202116146o interfaceC202116146o = C146T.LIZJ;
                if (interfaceC202116146o != null) {
                    iLIZJ = interfaceC202116146o.LIZJ(this.LIZ);
                    if (iLIZJ != 0) {
                        f2 = (iLIZJ / 25.0f) * f;
                    }
                } else {
                    iLIZJ = 0;
                }
            } else {
                f2 = f;
                iLIZJ = 0;
            }
            if (C146T.LIZIZ.LIZJ) {
                f2 *= 3;
            }
            if (fNextFloat < f2) {
                i = 1;
            } else {
                i = 0;
            }
            this.LJIIIIZZ = i;
            if (LJ()) {
                this.LJIIIZ = C146T.LIZIZ.LIZLLL;
                IJavaStackBackMonitor iJavaStackBackMonitorCreateJavaStackBackMonitor = null;
                IJarvisMonitorService iJarvisMonitorService = (IJarvisMonitorService) PluggableExtentionKt.pluggableSpi$default(IJarvisMonitorService.class, false, false, false, 14, null);
                PrintStream printStream = System.out;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("XJL-Attribution pluggableSpi IJarvisMonitorService: ");
                if (iJarvisMonitorService != null) {
                    str = "found";
                } else {
                    str = "not found";
                }
                sbLIZ.append(str);
                printStream.println(C2188811AlT.LIZIZ(sbLIZ));
                if ((i2 & 1) != 0) {
                    C1C7W c1c7w = new C1C7W();
                    this.LIZJ = c1c7w;
                    c1c7w.LIZ = new C1C7Z() { // from class: X.1C7h
                        @Override // X.C1C7Z
                        public final void onLongRunnableCallback(ConcurrentLinkedQueue<C1869680yko> concurrentLinkedQueue) {
                            if (concurrentLinkedQueue.size() != 0) {
                                C786410Ut5.LJJZZIII(this.LIZ.LJI(), new ARunnableS103S0200000_34(this.LIZ, concurrentLinkedQueue, 35));
                            }
                        }
                    };
                }
                if ((i2 & 2) != 0) {
                    if (this.LIZLLL == null) {
                        this.LIZLLL = new C2225261C7o();
                    }
                    C2225261C7o c2225261C7o = this.LIZLLL;
                    if (c2225261C7o != null) {
                        c2225261C7o.LIZIZ = new InterfaceC2190421Ao4() { // from class: X.1C7s
                            @Override // X.InterfaceC2190421Ao4
                            public final void LIZ(ConcurrentHashMap<String, C1777620wMK> concurrentHashMap) {
                                if (concurrentHashMap.size() != 0) {
                                    C786410Ut5.LJJZZIII(this.LIZ.LJI(), new ARunnableS103S0200000_34(this.LIZ, concurrentHashMap, 36));
                                }
                            }
                        };
                    }
                }
                if ((i2 & 8) != 0) {
                    ThreadMonitor threadMonitor = new ThreadMonitor(this.LIZ);
                    this.LJ = threadMonitor;
                    threadMonitor.LIZLLL = new InterfaceC21152717q9() { // from class: X.1C7k
                        @Override // X.InterfaceC21152717q9
                        public final void LIZ(String str2) {
                            if (str2.length() > 0) {
                                C786410Ut5.LJJZZIII(this.LIZ.LJI(), new ARunnableS38S1100000_34(this.LIZ, str2, 8));
                            }
                        }
                    };
                }
                INativeStackMonitor iNativeStackMonitorCreateNativeStackMonitor = null;
                if (i3 != 0) {
                    if (iJarvisMonitorService != null) {
                        iJarvisMonitorService.initJarvisJavaMonitor();
                        iJavaStackMainMonitorCreateJavaStackMainMonitor = iJarvisMonitorService.createJavaStackMainMonitor(iLIZJ);
                    } else {
                        iJavaStackMainMonitorCreateJavaStackMainMonitor = null;
                    }
                    this.LJFF = iJavaStackMainMonitorCreateJavaStackMainMonitor;
                    if (iJavaStackMainMonitorCreateJavaStackMainMonitor != null) {
                        iJavaStackMainMonitorCreateJavaStackMainMonitor.setListener(new IJavaStackMainMonitorCallback() { // from class: X.1C7u
                            @Override // com.bytedance.otis.attribution.api.IJavaStackMainMonitorCallback
                            public final void onCallback(final String str2, final byte[] bArr) {
                                if (bArr != null) {
                                    final AbstractC2225271C7p abstractC2225271C7p = this.LIZ;
                                    C786410Ut5.LJLIIL(C146T.LIZIZ.LIZIZ, abstractC2225271C7p.LJI(), new Runnable() { // from class: X.1C7v
                                        /* JADX WARN: Removed duplicated region for block: B:48:0x018a  */
                                        @Override // java.lang.Runnable
                                        /*
                                            Code decompiled incorrectly, please refer to instructions dump.
                                            To view partially-correct add '--show-bad-code' argument
                                        */
                                        public final void run() {
                                            /*
                                                Method dump skipped, instruction units count: 417
                                                To view this dump add '--comments-level debug' option
                                            */
                                            throw new UnsupportedOperationException("Method not decompiled: X.RunnableC2225331C7v.run():void");
                                        }
                                    });
                                }
                            }
                        });
                    }
                    C2225261C7o c2225261C7o2 = this.LIZLLL;
                    if (c2225261C7o2 != null && c2225261C7o2.LIZJ.length() > 0) {
                        IJavaStackMainMonitor iJavaStackMainMonitor = this.LJFF;
                        if (iJavaStackMainMonitor != null) {
                            iJavaStackMainMonitor.reset();
                        }
                        IJavaStackMainMonitor iJavaStackMainMonitor2 = this.LJFF;
                        if (iJavaStackMainMonitor2 != null) {
                            if (C146T.LIZIZ.LJ != null) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            iJavaStackMainMonitor2.stop(z2);
                        }
                        IJavaStackMainMonitor iJavaStackMainMonitor3 = this.LJFF;
                        if (iJavaStackMainMonitor3 != null) {
                            String str2 = c2225261C7o2.LIZJ;
                            if (C146T.LIZIZ.LJ != null) {
                                z = true;
                            } else {
                                z = false;
                            }
                            iJavaStackMainMonitor3.start(str2, z);
                        }
                    }
                }
                if ((i2 & 32) != 0) {
                    if (iJarvisMonitorService != null) {
                        iJavaStackBackMonitorCreateJavaStackBackMonitor = iJarvisMonitorService.createJavaStackBackMonitor();
                    }
                    this.LJI = iJavaStackBackMonitorCreateJavaStackBackMonitor;
                    if (iJavaStackBackMonitorCreateJavaStackBackMonitor != null) {
                        iJavaStackBackMonitorCreateJavaStackBackMonitor.setListener(C146T.LJ, new IJavaStackBackMonitorCallback() { // from class: X.1C7t
                            @Override // com.bytedance.otis.attribution.api.IJavaStackBackMonitorCallback
                            public final void onCallback(String str3) {
                                if (str3 != null) {
                                    AbstractC2225271C7p abstractC2225271C7p = this.LIZ;
                                    C786410Ut5.LJLIIL(C146T.LIZIZ.LIZIZ, abstractC2225271C7p.LJI(), new ARunnableS38S1100000_34(abstractC2225271C7p, str3, 9));
                                }
                            }
                        });
                    }
                }
                if ((i2 & 64) != 0) {
                    if (iJarvisMonitorService != null) {
                        iNativeStackMonitorCreateNativeStackMonitor = iJarvisMonitorService.createNativeStackMonitor();
                    }
                    this.LJII = iNativeStackMonitorCreateNativeStackMonitor;
                    if (iNativeStackMonitorCreateNativeStackMonitor != null) {
                        iNativeStackMonitorCreateNativeStackMonitor.addListener(C146T.LJ, this.LIZ, new INativeStackMonitorCallback() { // from class: X.146n
                            @Override // com.bytedance.otis.attribution.api.INativeStackMonitorCallback
                            public final String getExtraInfo() {
                                InterfaceC202116146o interfaceC202116146o2 = C146T.LIZJ;
                                float fLIZ = interfaceC202116146o2 != null ? interfaceC202116146o2.LIZ() : 60.0f;
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append(fLIZ);
                                sbLIZ2.append('\n');
                                return C2188811AlT.LIZIZ(sbLIZ2);
                            }

                            @Override // com.bytedance.otis.attribution.api.INativeStackMonitorCallback
                            public final String getStageInfo(long j) {
                                String strRemove = this.LIZ.LJIILIIL.remove(Long.valueOf(j));
                                if (strRemove == null) {
                                    return "";
                                }
                                return strRemove;
                            }

                            @Override // com.bytedance.otis.attribution.api.INativeStackMonitorCallback
                            public final void onCallback(String str3) {
                                if (str3 != null) {
                                    AbstractC2225271C7p abstractC2225271C7p = this.LIZ;
                                    C786410Ut5.LJLIIL(C146T.LIZIZ.LIZIZ, abstractC2225271C7p.LJI(), new ARunnableS38S1100000_34(abstractC2225271C7p, str3, 10));
                                }
                            }
                        });
                    }
                }
            }
        }
        if (LJ() && !this.LJIIJ) {
            if (this.LJIIL == 0) {
                this.LJIIL = System.currentTimeMillis();
            }
            this.LJIIJ = true;
            C1C7W c1c7w2 = this.LIZJ;
            if (c1c7w2 != null) {
                c1c7w2.LIZJ = this.LJIIL;
                c1c7w2.LIZ(false);
            }
            ThreadMonitor threadMonitor2 = this.LJ;
            if (threadMonitor2 != null && !threadMonitor2.LIZIZ) {
                threadMonitor2.LIZIZ = true;
                threadMonitor2.LIZJ = true;
                C786410Ut5.LJL(c146t.LIZ(), new ARunnableS132S0100000_32(threadMonitor2, 93));
                C786410Ut5.LJLIIL(100L, c146t.LIZ(), threadMonitor2.LJ);
                C786410Ut5.LJLIIL(20000L, c146t.LIZ(), threadMonitor2.LJFF);
            }
            IJavaStackMainMonitor iJavaStackMainMonitor4 = this.LJFF;
            if (iJavaStackMainMonitor4 != null) {
                iJavaStackMainMonitor4.reset();
            }
            IJavaStackBackMonitor iJavaStackBackMonitor = this.LJI;
            if (iJavaStackBackMonitor != null) {
                iJavaStackBackMonitor.start();
            }
            INativeStackMonitor iNativeStackMonitor = this.LJII;
            if (iNativeStackMonitor != null) {
                iNativeStackMonitor.start(this.LIZ);
            }
        }
    }

    @Override // X.C146A
    public final void LIZJ(String str) {
        if (this.LIZLLL == null) {
            this.LIZLLL = new C2225261C7o();
        }
        C2225261C7o c2225261C7o = this.LIZLLL;
        if (c2225261C7o != null) {
            c2225261C7o.LIZ(str);
            if (this.LJIIJJI == 0) {
                this.LJIIJJI = 1;
            }
        }
    }

    @Override // X.C146A
    public final void LIZLLL(AnonymousClass1467 anonymousClass1467) {
        this.LIZIZ = anonymousClass1467;
    }

    @Override // X.C146A
    public final void bm(long j) {
        this.LJIIL = j;
    }

    @Override // X.C146A
    public final void LJFF(String str, ArrayList<C1909907dx> arrayList) {
        if (LJII() && LJ() && (C146T.LIZIZ.LIZ & 4) != 0 && arrayList.size() != 0) {
            C786410Ut5.LJJZZIII(LJI(), new ARunnableS36S1200000_34(arrayList, str, this, 4));
        }
    }
}
