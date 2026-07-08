package X;

import Y.ARunnableS99S0200000_30;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.DownloadableModelSupportLibraryLoader;
import com.ss.ugc.effectplatform.algorithm.AlgorithmModelResourceFinder;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.13Pg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20005413Pg {
    public static final C13Q5 LJII = new C13Q5();
    public static C20005413Pg LJIIIIZZ;
    public static DownloadableModelSupportLibraryLoader LJIIIZ;
    public final C13RD LIZ;
    public final C20006313Pp LIZIZ;
    public final C20008613Qm LIZJ;
    public AlgorithmModelResourceFinder LIZLLL;
    public C13NP LJ;
    public final C20005513Ph LJFF;
    public InterfaceC20008113Qh LJI;

    static {
        new DownloadableModelSupportLibraryLoader.SystemLoader();
    }

    public final C13NP LIZIZ() {
        C13NP c13np = this.LJ;
        if (c13np == null) {
            C13RD c13rd = this.LIZ;
            if (C20005913Pl.LJIIIZ == null) {
                C20005913Pl.LJIIIZ = new C20005913Pl(c13rd);
            }
            c13np = new C13NP(c13rd, C13QA.LIZ(), this.LIZJ, this.LIZIZ);
            this.LJ = c13np;
        }
        return c13np;
    }

    public final AlgorithmModelResourceFinder LIZLLL() {
        AlgorithmModelResourceFinder algorithmModelResourceFinder = this.LIZLLL;
        if (algorithmModelResourceFinder != null) {
            return algorithmModelResourceFinder;
        }
        C20006313Pp c20006313Pp = this.LIZIZ;
        C20008613Qm c20008613Qm = this.LIZJ;
        this.LIZ.getClass();
        AlgorithmModelResourceFinder algorithmModelResourceFinder2 = new AlgorithmModelResourceFinder(c20006313Pp, c20008613Qm, null, this.LIZ);
        this.LIZLLL = algorithmModelResourceFinder2;
        return algorithmModelResourceFinder2;
    }

    public C20005413Pg(C13RD c13rd) {
        int iHashCode;
        this.LIZ = c13rd;
        C20008613Qm c20008613Qm = new C20008613Qm(c13rd.LJJIIZI, c13rd.LJJIJIIJI, c13rd.LJJJJJL);
        this.LIZJ = c20008613Qm;
        InterfaceC20004913Pb interfaceC20004913Pb = new InterfaceC20004913Pb() { // from class: X.13PZ
            @Override // X.InterfaceC20004913Pb
            public final void LIZ(int i, List<String> list, long j, long j2, long j3, long j4) {
                C13RD c13rd2 = this.LIZ.LIZ;
                InterfaceC1633730scF interfaceC1633730scF = c13rd2.LJIJJLI;
                if (interfaceC1633730scF != null) {
                    float f = 1024;
                    interfaceC1633730scF.monitorStatusRate("effect_platform_lru_clean_cache", 0, C2097608Jq.LJIIIIZZ(new Pair("clean_type", a0.LJJLJLI(c13rd2.LJII, "/", "default_model")), new Pair("clean_strategy", Integer.valueOf(i)), new Pair("clean_num", Integer.valueOf(list.size())), new Pair("clean_size", Float.valueOf(((j3 * 1.0f) / f) / f)), new Pair("current_size", Float.valueOf(((j * 1.0f) / f) / f)), new Pair("max_size", Float.valueOf(((j2 * 1.0f) / f) / f)), new Pair("duration", Long.valueOf(j4))));
                }
                C13SS c13ss = C13SS.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onCleanLRUCache, cleanKeys: ");
                sbLIZ.append(list);
                sbLIZ.append(", currentSize: ");
                sbLIZ.append(j);
                sbLIZ.append(", maxSize: ");
                sbLIZ.append(j2);
                sbLIZ.append(", cleanSize: ");
                sbLIZ.append(j3);
                sbLIZ.append(", timeCost: ");
                sbLIZ.append(j4);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                c13ss.getClass();
                C13SS.LIZ("AlgorithmModelCache", strLIZIZ);
                this.LIZ.getClass();
            }
        };
        InterfaceC20004513Ox interfaceC20004513OxLIZ = C19996613Lw.LIZ(c13rd.LJJIJIL);
        if (interfaceC20004513OxLIZ != null && (interfaceC20004513OxLIZ instanceof C20006313Pp)) {
            this.LIZIZ = (C20006313Pp) interfaceC20004513OxLIZ;
        } else {
            String str = c13rd.LJJIJIL;
            String str2 = c13rd.LIZIZ;
            if (str2 != null) {
                iHashCode = str2.hashCode();
            } else {
                iHashCode = 0;
            }
            C20006313Pp c20006313Pp = new C20006313Pp(c13rd, str, iHashCode, c20008613Qm);
            this.LIZIZ = c20006313Pp;
            InterfaceExecutorC740550T3d interfaceExecutorC740550T3d = c13rd.LJIL;
            if (interfaceExecutorC740550T3d != null) {
                interfaceExecutorC740550T3d.execute(new ARunnableS99S0200000_30(this, interfaceC20004913Pb, 6));
            }
            C19996613Lw.LIZ.put(c13rd.LJJIJIL, c20006313Pp);
        }
        if (C20005513Ph.LJI == null) {
            C20005513Ph.LJI = new C20005513Ph(c13rd);
        }
        this.LJFF = C20005113Pd.LIZ();
        C0UER.LIZ = new C0UES() { // from class: X.13Pa
            @Override // X.C0UES
            public final String decrypt(String str3) {
                return C13RH.LIZ(str3);
            }
        };
    }

    public static final synchronized void LJ(C13RD c13rd) {
        LJII.LIZIZ(c13rd);
    }

    public final void LIZ(final String[] strArr, final Map<String, ? extends List<String>> map, final C13MA<Long> c13ma) {
        final C20005513Ph c20005513Ph = this.LJFF;
        c20005513Ph.getClass();
        C20005513Ph.LJ(C13LQ.LJJLL(strArr));
        C20001113Np c20001113Np = c20005513Ph.LIZ.LJJIIJ;
        if (c20001113Np != null) {
            final String strLIZ = C1528550psb.LIZ();
            c20001113Np.LIZIZ(new AbstractC20000013Ne(strLIZ) { // from class: X.13Pe
                @Override // X.AbstractC20000013Ne
                public final void onCancel() {
                }

                @Override // X.AbstractC20000013Ne, X.InterfaceC20001313Nr
                public final void pause(boolean z) {
                }

                @Override // X.AbstractC20000013Ne
                public final void execute() {
                    try {
                        c20005513Ph.LIZJ().LIZLLL(false, C13LQ.LJJLL(strArr), map);
                        C13MA<Long> c13ma2 = c13ma;
                        if (c13ma2 != null) {
                            c13ma2.onSuccess(Long.valueOf(c20005513Ph.LIZLLL().getEffectHandle()));
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C13MA<Long> c13ma3 = c13ma;
                        if (c13ma3 != null) {
                            c13ma3.onFail(null, new C1662010tLr(e));
                        }
                    }
                }
            });
        }
    }
}
