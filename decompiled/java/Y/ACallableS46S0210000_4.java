package Y;

import X.AbstractC305760Byg;
import X.AnonymousClass0524;
import X.C08JT;
import X.C0C4Z;
import X.C0C5A;
import X.C0CS6;
import X.C0WYJ;
import X.C1C7U;
import X.C2426709f7;
import X.C286910BMj;
import X.C291440Bba;
import X.C786410Ut5;
import android.content.Context;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.otis.memory.OtisGson;
import com.bytedance.otis.memory.OtisMemoryOpt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes5.dex */
public class ACallableS46S0210000_4 implements Callable {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2 = true;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS46S0210000_4 aCallableS46S0210000_4) {
        long jLJ;
        long jLJ2;
        C1C7U.LIZ("StorageCleanServiceImpl@d086.manualClean$2");
        try {
            if (aCallableS46S0210000_4.z2) {
                jLJ = C0WYJ.LJ((Context) aCallableS46S0210000_4.l0);
            } else {
                jLJ = 0;
            }
            C2426709f7.LIZIZ((Context) aCallableS46S0210000_4.l0);
            C0CS6 c0cs6 = (C0CS6) aCallableS46S0210000_4.l1;
            if (c0cs6 != null) {
                if (aCallableS46S0210000_4.z2) {
                    jLJ2 = jLJ - C0WYJ.LJ((Context) aCallableS46S0210000_4.l0);
                } else {
                    jLJ2 = -1;
                }
                c0cs6.LIZ(jLJ2, true);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C0CS6 c0cs62 = (C0CS6) aCallableS46S0210000_4.l1;
            if (c0cs62 != null) {
                c0cs62.LIZ(-1L, false);
            }
        }
        C1C7U.LIZIZ("StorageCleanServiceImpl@d086.manualClean$2");
        return null;
    }

    public static final Object call$1(ACallableS46S0210000_4 aCallableS46S0210000_4) {
        String strLIZ;
        boolean z;
        AbstractC305760Byg abstractC305760Byg = (AbstractC305760Byg) aCallableS46S0210000_4.l0;
        Object obj = aCallableS46S0210000_4.l1;
        boolean z2 = aCallableS46S0210000_4.z2;
        abstractC305760Byg.getClass();
        C1C7U.LIZ("SettingManager@d659.setResponse$1L");
        if (obj != null && (obj instanceof n)) {
            n nVar = (n) obj;
            try {
                if (((Boolean) C286910BMj.LIZ.getValue()).booleanValue()) {
                    abstractC305760Byg.LLILLL = AnonymousClass0524.LIZIZ(nVar);
                } else {
                    try {
                        boolean z3 = false;
                        if (((Boolean) C291440Bba.LJFF.getValue()).booleanValue()) {
                            int iIntValue = ((Number) C291440Bba.LJIIIIZZ.getValue()).intValue();
                            try {
                                long j = abstractC305760Byg.LLILZIL;
                                if (j != 0) {
                                    synchronized (abstractC305760Byg.LLILZ) {
                                        try {
                                            OtisGson.release(j);
                                        } finally {
                                        }
                                    }
                                    abstractC305760Byg.LLILZ = new OtisGson();
                                    abstractC305760Byg.LLILZIL = 0L;
                                    abstractC305760Byg.LLILZLL = false;
                                }
                                long jLIZ = abstractC305760Byg.LLILZ.LIZ(iIntValue, nVar, ((Boolean) C291440Bba.LJII.getValue()).booleanValue());
                                abstractC305760Byg.LLILZIL = jLIZ;
                                if (jLIZ != 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                abstractC305760Byg.LLILZLL = z;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                            }
                            if (!abstractC305760Byg.LLILZLL) {
                                if (((Number) C291440Bba.LJI.getValue()).intValue() >= C08JT.OTIS_NATIVE.ordinal()) {
                                    z3 = true;
                                }
                                strLIZ = AbstractC305760Byg.LIZ(nVar, z3);
                            } else {
                                strLIZ = null;
                            }
                        } else if (((Boolean) C291440Bba.LJ.getValue()).booleanValue()) {
                            try {
                                strLIZ = AbstractC305760Byg.LIZ(nVar, false);
                                try {
                                    abstractC305760Byg.LLILZLL = OtisMemoryOpt.writeString(strLIZ);
                                } catch (Throwable th2) {
                                    th = th2;
                                    try {
                                        TryCatchGuardChecker.doCheck(th);
                                    } catch (Throwable th3) {
                                        th = th3;
                                        TryCatchGuardChecker.doCheck(th);
                                    }
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                strLIZ = null;
                            }
                        } else {
                            strLIZ = AbstractC305760Byg.LIZ(nVar, false);
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        strLIZ = null;
                    }
                    if (abstractC305760Byg.LLILZLL) {
                        if (((Boolean) C291440Bba.LIZJ.getValue()).booleanValue() && !abstractC305760Byg.LIZIZ().equals(nVar.toString())) {
                            throw new RuntimeException("cacheSuccess but not equals");
                        }
                    } else {
                        abstractC305760Byg.LLILLJJLI = strLIZ;
                    }
                }
                if (z2 && !((Boolean) C291440Bba.LIZIZ.getValue()).booleanValue()) {
                    SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
                    settingsManagerLIZLLL.getClass();
                    C0C4Z.LJIIJ(nVar);
                    C0C5A.LIZJ().LIZ();
                    C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS104S0100000_4(settingsManagerLIZLLL, 117));
                } else {
                    SettingsManager.LIZLLL().getClass();
                    C0C5A.LIZJ().LIZ();
                    SettingsManager settingsManagerLIZLLL2 = SettingsManager.LIZLLL();
                    settingsManagerLIZLLL2.getClass();
                    C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS104S0100000_4(settingsManagerLIZLLL2, 117));
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            abstractC305760Byg.LIZJ(obj);
        }
        C1C7U.LIZIZ("SettingManager@d659.setResponse$1L");
        return null;
    }

    public ACallableS46S0210000_4(AbstractC305760Byg abstractC305760Byg, n nVar, int i) {
        this.$t = i;
        this.l0 = abstractC305760Byg;
        this.l1 = nVar;
    }

    public ACallableS46S0210000_4(Context context, C0CS6 c0cs6, int i) {
        this.$t = i;
        this.l0 = context;
        this.l1 = c0cs6;
    }
}
