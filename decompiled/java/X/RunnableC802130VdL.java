package X;

import Y.ARunnableS92S0000000_13;
import android.text.TextUtils;
import com.bytedance.crash.jni.NativeBridge;
import com.bytedance.crash.monitor.k;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import dl3.h;
import im3.b;
import im3.o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0VdL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class RunnableC802130VdL implements Runnable {
    public static long LL;

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("LaunchScanner@8990.run");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LaunchScanner@8990.run");
    }

    public static void LIZ() {
        try {
            if (!C802880VeY.LIZ()) {
                C0VXF.postDelayed(new RunnableC802130VdL(), 1000L);
                return;
            }
            final C802790VeP c802790VeP = k.LIZ;
            if (c802790VeP != null) {
                C802500Vdw.LIZ();
                long j = LL;
                try {
                    C802600Ve6 c802600Ve6 = C802600Ve6.LIZLLL;
                    if (c802600Ve6 != null) {
                        c802600Ve6.LIZJ(c802790VeP, j);
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C801940Vd2.LIZIZ("NPTH_ANR_ERROR_AppMonitor", e);
                }
                long j2 = LL;
                try {
                    C802430Vdp c802430Vdp = C802430Vdp.LJII;
                    if (c802430Vdp != null) {
                        c802430Vdp.LJFF(c802790VeP, j2);
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    C801940Vd2.LIZIZ("NPTH_ANR_ERROR_upload", e2);
                }
                C802500Vdw.LJFF();
                C0VXU.LIZIZ().LIZLLL();
                try {
                    new Runnable(c802790VeP) { // from class: X.0VdI
                        public int LL;
                        public final C802790VeP LLILLJJLI;

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("AlogManager$UploadTask@af81.run");
                            try {
                                LIZ();
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("AlogManager$UploadTask@af81.run");
                        }

                        public final void LIZ() {
                            HashMap map;
                            String str;
                            int i;
                            String strLIZLLL;
                            List<String> listLIZ;
                            if (!C802110VdJ.LIZ() || !C802880VeY.LIZ()) {
                                int i2 = this.LL;
                                this.LL = i2 + 1;
                                if (i2 < 60) {
                                    C0VXF.postDelayed(this, 2000L);
                                    return;
                                }
                                return;
                            }
                            C802790VeP c802790VeP2 = this.LLILLJJLI;
                            HashMap<String, C802120VdK> map2 = C802110VdJ.LIZIZ;
                            synchronized (map2) {
                                try {
                                    map = new HashMap(map2);
                                    map2.clear();
                                } finally {
                                    TryCatchGuardChecker.doCheck(th);
                                }
                            }
                            Iterator it2 = map.keySet().iterator();
                            while (it2.hasNext()) {
                                C802120VdK c802120VdK = (C802120VdK) map.get(it2.next());
                                if (c802120VdK != null && !((ArrayList) c802120VdK.LIZIZ).isEmpty()) {
                                    HashSet hashSet = new HashSet();
                                    Iterator it3 = ((ArrayList) c802120VdK.LIZIZ).iterator();
                                    while (it3.hasNext()) {
                                        long jLongValue = ((Long) it3.next()).longValue();
                                        String str2 = c802120VdK.LIZ;
                                        if (C802110VdJ.LIZ() && (listLIZ = C802110VdJ.LIZ.LIZ(jLongValue, str2)) != null) {
                                            hashSet.addAll(listLIZ);
                                        }
                                    }
                                    if (!hashSet.isEmpty()) {
                                        ArrayList arrayList = new ArrayList(hashSet);
                                        String str3 = c802120VdK.LIZ;
                                        try {
                                            i = CastIntegerProtector.parseInt(c802790VeP2.LIZ());
                                        } catch (Throwable th) {
                                        }
                                        if (i > 0) {
                                            try {
                                                strLIZLLL = c802790VeP2.LIZLLL(CardStruct.IStatusCode.DEFAULT);
                                            } catch (Throwable th2) {
                                                TryCatchGuardChecker.doCheck(th2);
                                                C801940Vd2.LIZJ(th2);
                                            }
                                            str = TextUtils.isEmpty(strLIZLLL) ? "no_did" : b.LJ(i, o.LIZ(i, h.LJIIJJI.LJIIIIZZ, strLIZLLL, c802790VeP2.LJFF(), c802790VeP2.LJIIIZ()), strLIZLLL, str3, arrayList) ? "success" : "unknown";
                                        } else {
                                            str = "no_aid";
                                        }
                                        C801990Vd7 c801990Vd7 = new C801990Vd7("alog_check");
                                        Object[] objArr = new Object[6];
                                        objArr[0] = "check_result";
                                        objArr[1] = str;
                                        objArr[2] = "crash_type";
                                        objArr[3] = c802120VdK.LIZJ ? "lunch" : "normal";
                                        objArr[4] = "alog_inited";
                                        objArr[5] = C802110VdJ.LIZ() ? "true" : "uncertain";
                                        C0VJO.LIZ(c801990Vd7.LIZ, objArr);
                                        c801990Vd7.LIZ();
                                    }
                                }
                            }
                        }

                        {
                            this.LLILLJJLI = c802790VeP;
                        }
                    }.run();
                } catch (Exception e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    C801940Vd2.LIZIZ("NPTH_ANR_ERROR_AlogManager", e3);
                }
            }
            NativeBridge.LJJJIL();
            long j3 = LL;
            if (j3 > 0) {
                C0VXF.postDelayed(new ARunnableS92S0000000_13(39), j3);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C801940Vd2.LIZLLL("NPTH_ANR_ERROR_LaunchScanner", th);
        }
    }
}
