package X;

import Y.AfS198S0100000_29;
import com.bytedance.otis.attribution.server.IAnrUploadApi;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.AFwS273S0000000_29;

/* JADX INFO: renamed from: X.10nk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final /* synthetic */ class C19354210nk {
    public static void LIZ(final C0VSJ c0vsj, String str, String str2) {
        IAnrUploadApi.LIZ.getClass();
        if (c0vsj.exists()) {
            IAnrUploadApi value = C19354310nl.LIZIZ.getValue();
            if (value != null) {
                final C0X0P c0x0p = C0X7A.LJFF;
                C11NZ<String> c11nzReportAnrWithFile = value.reportAnrWithFile(new AbstractC842530X3j() { // from class: X.0p2h
                    @Override // X.AbstractC842530X3j
                    public final long LIZ() {
                        return c0vsj.length();
                    }

                    @Override // X.AbstractC842530X3j
                    public final C0X0P LIZIZ() {
                        return c0x0p;
                    }

                    @Override // X.AbstractC842530X3j
                    public final void LJ(InterfaceC1496780p3M interfaceC1496780p3M) throws Throwable {
                        try {
                            C1496340p2e c1496340p2eLIZIZ = C1496330p2d.LIZIZ(c0vsj);
                            Throwable th = null;
                            try {
                                C1496690p3D c1496690p3D = new C1496690p3D();
                                long j = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
                                for (long j2 = c1496340p2eLIZIZ.read(c1496690p3D, j); j2 != -1; j2 = c1496340p2eLIZIZ.read(c1496690p3D, j)) {
                                    interfaceC1496780p3M.LLFF(c1496690p3D, j2);
                                }
                                interfaceC1496780p3M.flush();
                                C2107108Nh.LIZ(c1496340p2eLIZIZ, null);
                            } catch (Throwable th2) {
                                try {
                                    TryCatchGuardChecker.doCheck(th2);
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                                try {
                                    throw th2;
                                } catch (Throwable th4) {
                                    th = th4;
                                    th = th2;
                                    TryCatchGuardChecker.doCheck(th);
                                    C2107108Nh.LIZ(c1496340p2eLIZIZ, th);
                                    throw th;
                                }
                            }
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                }, AbstractC842530X3j.LIZJ(c0x0p, str), AbstractC842530X3j.LIZJ(c0x0p, str2));
                if (c11nzReportAnrWithFile != null) {
                    c11nzReportAnrWithFile.LJJLL(new C516201zk(new C5183020f(c0vsj, 131), 301), new AfS198S0100000_29(AFwS273S0000000_29.get$arr$(13), 60));
                    return;
                }
                return;
            }
            return;
        }
        IAnrUploadApi value2 = C19354310nl.LIZIZ.getValue();
        if (value2 == null) {
            return;
        }
        C0X0P c0x0p2 = C0X7A.LJFF;
        C11NZ<String> c11nzReportAnr = value2.reportAnr(AbstractC842530X3j.LIZJ(c0x0p2, str), AbstractC842530X3j.LIZJ(c0x0p2, str2));
        if (c11nzReportAnr == null) {
            return;
        }
        c11nzReportAnr.LJJLL(new AfS198S0100000_29(AFwS273S0000000_29.get$arr$(14), 61), new AfS198S0100000_29(AFwS273S0000000_29.get$arr$(15), 62));
    }
}
