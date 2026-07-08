package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ttve.nativePort.TEAudioStreamVCUtils;
import com.ss.android.vesdk.VEUtils;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AwS395S0200000_29;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: renamed from: X.11ds, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19547811ds {
    public volatile long LIZ = -1;
    public InterfaceC19548711e1 LIZIZ;
    public InterfaceC19548611e0 LIZJ;
    public C19547611dq LIZLLL;
    public final ExecutorService LJ;
    public final C01GW LJFF;
    public final AtomicBoolean LJI;
    public final C19547711dr LJII;

    public final void LIZ() {
        if (this.LIZ == -1 || this.LJI.get()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("destroyStream-->stopStreamVCConnet failed. handler:");
            sbLIZ.append(this.LIZ);
            C201955140j.LIZIZ("VoiceConversionStream", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        this.LJI.set(true);
        int iStopStreamVCConnet = VEUtils.stopStreamVCConnet(this.LIZ, true);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("destroyStream-->stopStreamVCConnet result:");
        sbLIZ2.append(iStopStreamVCConnet);
        sbLIZ2.append(" handler:");
        sbLIZ2.append(this.LIZ);
        C201955140j.LIZIZ("VoiceConversionStream", C2188811AlT.LIZIZ(sbLIZ2));
        if (this.LIZ == -1 || this.LJI.get()) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("destroyStream-->realDestroyStream failed. handler:");
            sbLIZ3.append(this.LIZ);
            C201955140j.LIZIZ("VoiceConversionStream", C2188811AlT.LIZIZ(sbLIZ3));
            return;
        }
        int iDestroyStreamVCHandle = VEUtils.destroyStreamVCHandle(this.LIZ);
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("destroyStream-->destroyStreamVCHandle result:");
        sbLIZ4.append(iDestroyStreamVCHandle);
        sbLIZ4.append(" handler:");
        sbLIZ4.append(this.LIZ);
        C201955140j.LIZIZ("VoiceConversionStream", C2188811AlT.LIZIZ(sbLIZ4));
        this.LIZ = -1L;
        InterfaceC19548611e0 interfaceC19548611e0 = this.LIZJ;
        if (interfaceC19548611e0 != null) {
            interfaceC19548611e0.LIZ(EnumC19548111dv.DESTROY);
        }
    }

    public C19547811ds() {
        this.LJ = C04TS.LIZ() ? new ExecutorServiceC822430WOb(C823050WQl.LIZLLL(), 1) : C786410Ut5.h4();
        this.LJFF = C452501pT.LIZIZ(new AwS573S0100000_29(this, 887));
        this.LJI = new AtomicBoolean(false);
        this.LJII = new C19547711dr(this);
    }

    public final String LIZIZ(long j) {
        C19547611dq c19547611dq = this.LIZLLL;
        if (c19547611dq != null) {
            String str = c19547611dq.LJIJ;
            if (c19547611dq != null && j == c19547611dq.LJIJI && str != null && C123100dR.LIZ(str)) {
                return str;
            }
            return "";
        }
        return "";
    }

    public final String LIZJ(long j) {
        C19547611dq c19547611dq = this.LIZLLL;
        if (c19547611dq != null) {
            String str = c19547611dq.LJIIZILJ;
            if (c19547611dq != null && j == c19547611dq.LJIJI && str != null && C123100dR.LIZ(str)) {
                return str;
            }
            return "";
        }
        return "";
    }

    public final void LIZLLL(C19547611dq c19547611dq) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handle--> task type:");
        sbLIZ.append(c19547611dq.LIZ);
        sbLIZ.append(" thread:");
        sbLIZ.append(C786410Ut5.u3().getName());
        C201955140j.LIZIZ("VoiceConversionStream", C2188811AlT.LIZIZ(sbLIZ));
        int i = c19547611dq.LIZ;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        LIZ();
                        return;
                    }
                    return;
                }
                C23250099c.LIZLLL((InterfaceC497601wk) this.LJFF.getValue(), null, null, new C19547911dt(this, null), 3);
                return;
            }
            LJ(c19547611dq, false);
            return;
        }
        InterfaceC19548611e0 interfaceC19548611e0 = this.LIZJ;
        if (interfaceC19548611e0 != null) {
            interfaceC19548611e0.LIZ(EnumC19548111dv.INIT);
        }
        this.LIZ = TEAudioStreamVCUtils.createStreamVCHandle(c19547611dq.LIZLLL, c19547611dq.LIZIZ, c19547611dq.LIZJ, "", this.LJII);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("initSDK--> handler:");
        sbLIZ2.append(this.LIZ);
        sbLIZ2.append(" task:");
        sbLIZ2.append(c19547611dq);
        C201955140j.LIZIZ("VoiceConversionStream", C2188811AlT.LIZIZ(sbLIZ2));
    }

    public final void LJ(C19547611dq c19547611dq, boolean z) {
        String str;
        long jLongValue;
        long jLongValue2;
        C19547611dq c19547611dq2;
        this.LIZLLL = c19547611dq;
        if (this.LIZ != -1 && (c19547611dq2 = this.LIZLLL) != null) {
            c19547611dq2.LJIJI = this.LIZ;
        }
        if (!z) {
            this.LJI.set(false);
            InterfaceC19548611e0 interfaceC19548611e0 = this.LIZJ;
            if (interfaceC19548611e0 != null) {
                interfaceC19548611e0.LIZ(EnumC19548111dv.START);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("startStream--> handler:");
            sbLIZ.append(this.LIZ);
            sbLIZ.append(" task:");
            sbLIZ.append(c19547611dq);
            C201955140j.LIZIZ("VoiceConversionStream", C2188811AlT.LIZIZ(sbLIZ));
            if (this.LIZ == -1) {
                InterfaceC19548711e1 interfaceC19548711e1 = this.LIZIZ;
                if (interfaceC19548711e1 != null) {
                    interfaceC19548711e1.LIZ(3, -1, 0L, 0L, LIZJ(this.LIZ), LIZIZ(this.LIZ), "", "", "handler == -1");
                }
                LIZ();
                return;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("startStream-->initStreamVCTotalFile result:");
            sbLIZ2.append(0);
            C201955140j.LIZIZ("VoiceConversionStream", C2188811AlT.LIZIZ(sbLIZ2));
        }
        if (this.LIZ != -1 && !this.LJI.get()) {
            int iStartStreamVCConnet = VEUtils.startStreamVCConnet(this.LIZ, c19547611dq.LJIILLIIL);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("startStream-->startStreamVCConnet result:");
            sbLIZ3.append(iStartStreamVCConnet);
            C201955140j.LIZIZ("VoiceConversionStream", C2188811AlT.LIZIZ(sbLIZ3));
            if (iStartStreamVCConnet != 0) {
                InterfaceC19548711e1 interfaceC19548711e12 = this.LIZIZ;
                if (interfaceC19548711e12 != null) {
                    interfaceC19548711e12.LIZ(3, iStartStreamVCConnet, 0L, 0L, LIZJ(this.LIZ), LIZIZ(this.LIZ), "", "", "startStreamVCConnet error");
                }
                LIZ();
                return;
            }
            this.LJII.LIZ = new AwS395S0200000_29(this, c19547611dq, 75);
            String str2 = "";
            if (c19547611dq.LJ >= c19547611dq.LJIIIIZZ.size() || ListProtector.get(c19547611dq.LJIIIIZZ, c19547611dq.LJ) == null) {
                str = "";
            } else {
                str = (String) ListProtector.get(c19547611dq.LJIIIIZZ, c19547611dq.LJ);
                c19547611dq.LJ++;
            }
            if (c19547611dq.LJFF < c19547611dq.LJIIIZ.size() && ListProtector.get(c19547611dq.LJIIIZ, c19547611dq.LJFF) != null) {
                str2 = (String) ListProtector.get(c19547611dq.LJIIIZ, c19547611dq.LJFF);
                c19547611dq.LJFF++;
            }
            if (c19547611dq.LJI < c19547611dq.LJIIJ.size() && ListProtector.get(c19547611dq.LJIIJ, c19547611dq.LJI) != null) {
                jLongValue = ((Number) ListProtector.get(c19547611dq.LJIIJ, c19547611dq.LJI)).longValue();
                c19547611dq.LJI++;
            } else {
                jLongValue = 0;
            }
            if (c19547611dq.LJII < c19547611dq.LJIIJJI.size() && ListProtector.get(c19547611dq.LJIIJJI, c19547611dq.LJII) != null) {
                jLongValue2 = ((Number) ListProtector.get(c19547611dq.LJIIJJI, c19547611dq.LJII)).longValue();
                c19547611dq.LJII++;
            } else {
                jLongValue2 = 0;
            }
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("startStream-->startStreamVCProcess begin ,nextInputAudio:");
            sbLIZ4.append(str);
            sbLIZ4.append(" nextOutputAudio:");
            sbLIZ4.append(str2);
            sbLIZ4.append(" nextTrimInMSTime:");
            sbLIZ4.append(jLongValue);
            sbLIZ4.append(" nextTrimOutMSTime:");
            sbLIZ4.append(jLongValue2);
            C201955140j.LIZIZ("VoiceConversionStream", C2188811AlT.LIZIZ(sbLIZ4));
            int iStartStreamVCProcess = VEUtils.startStreamVCProcess(this.LIZ, str, str2, jLongValue, jLongValue2);
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("startStream-->startStreamVCProcess result:");
            sbLIZ5.append(iStartStreamVCProcess);
            sbLIZ5.append(" threadid:");
            sbLIZ5.append(C786410Ut5.u3().getId());
            C201955140j.LIZIZ("VoiceConversionStream", C2188811AlT.LIZIZ(sbLIZ5));
            if (iStartStreamVCProcess != 0) {
                InterfaceC19548711e1 interfaceC19548711e13 = this.LIZIZ;
                if (interfaceC19548711e13 != null) {
                    interfaceC19548711e13.LIZ(3, iStartStreamVCProcess, 0L, 0L, LIZJ(this.LIZ), LIZIZ(this.LIZ), "", "", "startStreamVCProcess error");
                }
                LIZ();
                return;
            }
            return;
        }
        InterfaceC19548711e1 interfaceC19548711e14 = this.LIZIZ;
        if (interfaceC19548711e14 != null) {
            interfaceC19548711e14.LIZ(3, -1, 0L, 0L, LIZJ(this.LIZ), LIZIZ(this.LIZ), "", "", "handler == -1");
        }
    }
}
