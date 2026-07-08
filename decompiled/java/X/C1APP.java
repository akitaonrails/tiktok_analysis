package X;

import android.content.IntentFilter;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.android.livesdk.comp.api.network.INetworkService;
import com.bytedance.android.livesdk.livesetting.pullstream.DnsOptMethodSetting;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveSdkEnableTfoPreconnectSetting;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.optimizer.live.sdk.dns.DnsOptimizer;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1APP, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1APP {
    public static volatile C1APP LIZIZ;
    public final Map<Class<?>, C1APQ<?>> LIZ = new ConcurrentHashMap();

    public C1APP() {
        LIZLLL(InterfaceC480510Isr.class, new C1APR<InterfaceC480510Isr>() { // from class: X.1APN
            /* JADX WARN: Type inference failed for: r2v0, types: [R, X.1APH] */
            @Override // X.C1APR
            public final C1APX<InterfaceC480510Isr> LIZ(C1APX<InterfaceC480510Isr> c1apx) {
                c1apx.LIZ = new C1APH(((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).context(), new C1491070ou9());
                c1apx.LIZIZ = true;
                return c1apx;
            }
        });
        LIZLLL(InterfaceC784360Upm.class, new C1APR<InterfaceC784360Upm>() { // from class: X.1APS
            /* JADX WARN: Type inference failed for: r0v0, types: [R, X.1APi] */
            @Override // X.C1APR
            public final C1APX<InterfaceC784360Upm> LIZ(C1APX<InterfaceC784360Upm> c1apx) {
                c1apx.LIZ = new InterfaceC784360Upm() { // from class: X.1APi
                    public DnsOptimizer LIZ;

                    @Override // X.InterfaceC784360Upm
                    public final void LIZ() {
                        int[] iArr;
                        try {
                            if (!C2104308Mf.LIZIZ(((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).context())) {
                                return;
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                        }
                        if (DnsOptMethodSetting.INSTANCE.getValue() == 1) {
                            C465160ILy.LIZ().getClass();
                            if (((InterfaceC784360Upm) C1APP.LIZIZ(InterfaceC784360Upm.class)).LIZJ() == null) {
                                String str = (C1161920gLG.LIZJ(IHostAppContext.class) == null || ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isInMusicallyRegion()) ? "https://hotapi-va.tiktokv.com" : "https://hotapi-sg.tiktokv.com";
                                C2178931APj c2178931APj = new C2178931APj();
                                c2178931APj.LIZ = str;
                                ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).getUpdateVersionCode();
                                c2178931APj.LIZIZ = new InterfaceC2179021APs() { // from class: X.0pFW
                                    @Override // X.InterfaceC2179021APs
                                    public final String executeGet(String str2) {
                                        C1515210pX5.LIZLLL().getClass();
                                        return new String(((C1500860p9w) ((INetworkService) C1161920gLG.LIZJ(INetworkService.class)).get(str2, null)).LIZ().LJ);
                                    }

                                    @Override // X.InterfaceC2179021APs
                                    public final String LIZ(String str2, byte[] bArr) {
                                        C1515210pX5.LIZLLL().getClass();
                                        return new String(((C1500860p9w) ((INetworkService) C1161920gLG.LIZJ(INetworkService.class)).LU1(str2, null, "application/json; charset=utf-8", bArr)).LIZ().LJ);
                                    }
                                };
                                c2178931APj.LIZJ = LiveSdkEnableTfoPreconnectSetting.INSTANCE.getValue();
                                C2178951APl.LIZIZ().LIZ(new C2178941APk(c2178931APj));
                                DnsOptimizer dnsOptimizer = new DnsOptimizer(C786410Ut5.N3(((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).context()));
                                dnsOptimizer.LIZ = new InterfaceC1970907nn() { // from class: X.0k4U
                                    public static final <T> T LIZ(String str2, T t) {
                                        if (Intrinsics.LJFF(str2, "TTNet_NQE_INFO")) {
                                            T t2 = (T) C786410Ut5.J3(C1508650pMV.LIZ());
                                            if (t2 != null) {
                                                return t2;
                                            }
                                            return t;
                                        }
                                        return (T) C1338270kvh.LIZ(t, str2);
                                    }
                                };
                                C1970807nm.LIZ().LIZ = dnsOptimizer.LIZ;
                                C1970807nm c1970807nmLIZ = C1970807nm.LIZ();
                                if (c1970807nmLIZ.LIZ != null) {
                                    c1970807nmLIZ.LIZLLL = ((Integer) C1305280k4U.LIZ("min_start_play_buffer", 600)).intValue();
                                    c1970807nmLIZ.LJ = ((Integer) C1305280k4U.LIZ("max_start_play_buffer", Integer.valueOf(LSPassThroughRecordSizeConfig.DEFAULT))).intValue();
                                    ((Double) C1305280k4U.LIZ("attenuation_coefficient", Double.valueOf(0.1d))).doubleValue();
                                    ((Integer) C1305280k4U.LIZ("attenuation_time_offset", Integer.valueOf(LSPassThroughRecordSizeConfig.DEFAULT))).intValue();
                                }
                                double dCbrt = 0.0d;
                                int i = 0;
                                double dCbrt2 = 0.0d;
                                while (true) {
                                    if (i >= c1970807nmLIZ.LIZIZ.length) {
                                        break;
                                    }
                                    dCbrt2 += Math.cbrt(8 - r1[i]);
                                    i++;
                                }
                                int i2 = c1970807nmLIZ.LJ;
                                int i3 = c1970807nmLIZ.LIZLLL;
                                int i4 = i2 - i3;
                                int i5 = 1;
                                while (true) {
                                    iArr = c1970807nmLIZ.LIZIZ;
                                    if (i5 >= iArr.length) {
                                        break;
                                    }
                                    dCbrt += Math.cbrt(8 - iArr[i5]);
                                    int i6 = (int) (((double) c1970807nmLIZ.LIZLLL) + ((dCbrt / dCbrt2) * ((double) i4)));
                                    c1970807nmLIZ.LIZJ.put(Integer.valueOf(c1970807nmLIZ.LIZIZ[i5 - 1]), new Pair(Integer.valueOf(i3), Integer.valueOf(i6)));
                                    i5++;
                                    i3 = i6;
                                }
                                if (i5 == iArr.length) {
                                    c1970807nmLIZ.LIZJ.put(Integer.valueOf(c1970807nmLIZ.LIZIZ[i5 - 1]), new Pair(Integer.valueOf(i3), Integer.valueOf(c1970807nmLIZ.LJ)));
                                }
                                C465160ILy.LIZ().getClass();
                                ((InterfaceC784360Upm) C1APP.LIZIZ(InterfaceC784360Upm.class)).LIZIZ(dnsOptimizer);
                                try {
                                    dnsOptimizer.LJIIIIZZ = true;
                                    C786410Ut5.LJIJJ(dnsOptimizer.LIZLLL, dnsOptimizer.LJ, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                                    C2178951APl.LIZIZ().LIZJ.LIZ();
                                } catch (Throwable th2) {
                                    TryCatchGuardChecker.doCheck(th2);
                                }
                            }
                        }
                    }

                    @Override // X.InterfaceC784360Upm
                    public final DnsOptimizer LIZJ() {
                        return this.LIZ;
                    }

                    @Override // X.InterfaceC784360Upm
                    public final void LIZIZ(DnsOptimizer dnsOptimizer) {
                        this.LIZ = dnsOptimizer;
                    }
                };
                c1apx.LIZIZ = true;
                return c1apx;
            }
        });
        LIZLLL(InterfaceC1699460uKG.class, new C1APR<InterfaceC1699460uKG>() { // from class: X.1APT
            /* JADX WARN: Type inference failed for: r0v0, types: [R, X.0k4Q] */
            @Override // X.C1APR
            public final C1APX<InterfaceC1699460uKG> LIZ(C1APX<InterfaceC1699460uKG> c1apx) {
                c1apx.LIZ = new C1305240k4Q();
                c1apx.LIZIZ = true;
                return c1apx;
            }
        });
        LIZLLL(C1286680jaU.class, new C1APR<C1286680jaU>() { // from class: X.1APO
            /* JADX WARN: Type inference failed for: r0v0, types: [R, X.0jaU] */
            @Override // X.C1APR
            public final C1APX<C1286680jaU> LIZ(C1APX<C1286680jaU> c1apx) {
                c1apx.LIZ = new C1286680jaU();
                c1apx.LIZIZ = true;
                return c1apx;
            }
        });
        LIZLLL(C0UZJ.class, new C1APR<C0UZJ>() { // from class: X.1APV
            /* JADX WARN: Type inference failed for: r0v0, types: [R, X.1AUo] */
            @Override // X.C1APR
            public final C1APX<C0UZJ> LIZ(C1APX<C0UZJ> c1apx) {
                c1apx.LIZ = new C2180281AUo();
                c1apx.LIZIZ = true;
                return c1apx;
            }
        });
        LIZLLL(InterfaceC780290UjD.class, new C1APR<InterfaceC780290UjD>() { // from class: X.1APU
            /* JADX WARN: Type inference failed for: r0v0, types: [R, X.0k4a] */
            @Override // X.C1APR
            public final C1APX<InterfaceC780290UjD> LIZ(C1APX<InterfaceC780290UjD> c1apx) {
                c1apx.LIZ = new C1305340k4a();
                c1apx.LIZIZ = true;
                return c1apx;
            }
        });
        LIZLLL(InterfaceC1502380pCO.class, new C1APR<InterfaceC1502380pCO>() { // from class: X.1APW
            /* JADX WARN: Type inference failed for: r0v0, types: [R, X.0uKF] */
            @Override // X.C1APR
            public final C1APX<InterfaceC1502380pCO> LIZ(C1APX<InterfaceC1502380pCO> c1apx) {
                c1apx.LIZ = new InterfaceC1502380pCO() { // from class: X.0uKF
                    @Override // X.InterfaceC1502380pCO
                    public final Object LIZ(Object obj, String str) {
                        if (TextUtils.equals(str, "network_type") && (obj instanceof String)) {
                            return C804510VhB.LIZ();
                        }
                        if (TextUtils.equals(str, "time_diff_server_and_client") && (obj instanceof Long)) {
                            return Long.valueOf(C963140bAe.LIZLLL);
                        }
                        C01GW c01gw = C1335980ks0.LIZ;
                        return C1338270kvh.LIZ(obj, str);
                    }
                };
                c1apx.LIZIZ = true;
                return c1apx;
            }
        });
    }

    public static <T> T LIZIZ(Class<T> cls) {
        if (LIZIZ == null) {
            synchronized (C1APP.class) {
                try {
                    if (LIZIZ == null) {
                        LIZIZ = new C1APP();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return (T) LIZIZ.LIZ(cls);
    }

    public final <T> T LIZ(Class<T> cls) {
        C1APX<T> c1apx;
        C1APQ c1apqLIZJ = (C1APQ) ((ConcurrentHashMap) this.LIZ).get(cls);
        if (c1apqLIZJ == null) {
            c1apqLIZJ = LIZJ(cls, new C1A53(cls));
        }
        synchronized (this) {
            try {
                C1APX<T> c1apx2 = c1apqLIZJ.LIZIZ;
                if (c1apx2 == null || !c1apx2.LIZIZ) {
                    C1APR<T> c1apr = c1apqLIZJ.LIZ;
                    C1APX<T> c1apx3 = new C1APX<>();
                    c1apr.LIZ(c1apx3);
                    c1apqLIZJ.LIZIZ = c1apx3;
                }
                C1APX<T> c1apx4 = c1apqLIZJ.LIZIZ;
                if (c1apx4.LIZIZ) {
                    if (c1apqLIZJ.LIZJ == null) {
                        synchronized (C1APP.class) {
                            try {
                                if (c1apqLIZJ.LIZJ == null && (c1apx = c1apqLIZJ.LIZIZ) != null) {
                                    c1apqLIZJ.LIZJ = c1apx.LIZ;
                                }
                            } finally {
                                TryCatchGuardChecker.doCheck(th);
                            }
                        }
                    }
                    return (T) c1apqLIZJ.LIZJ;
                }
                T t = c1apx4.LIZ;
                c1apqLIZJ.LIZIZ = null;
                return t;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final C1APQ LIZJ(Class cls, C1A53 c1a53) {
        C1APQ c1apq;
        synchronized (this) {
            try {
                c1apq = new C1APQ(c1a53);
                C1APX c1apx = new C1APX();
                c1a53.LIZ(c1apx);
                c1apq.LIZIZ = c1apx;
                c1a53.LIZ(c1apx);
                c1apq.LIZJ = c1apx.LIZ;
                ((ConcurrentHashMap) this.LIZ).put(cls, c1apq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c1apq;
    }

    public final void LIZLLL(Class cls, C1APR c1apr) {
        ((ConcurrentHashMap) this.LIZ).put(cls, new C1APQ(c1apr));
    }
}
