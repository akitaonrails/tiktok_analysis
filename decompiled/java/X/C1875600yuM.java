package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.agilelogger.ALog;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: X.0yuM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1875600yuM extends AbstractC1875640yuQ implements InterfaceC1879560z0k {
    public C1875370ytz LJFF;

    public final boolean LJFF() {
        int i;
        C1875370ytz c1875370ytz = this.LJFF;
        if (c1875370ytz == null || !c1875370ytz.LIZ.isConnected()) {
            return false;
        }
        synchronized (this) {
            i = this.LIZLLL;
        }
        return i == 1;
    }

    @Override // X.InterfaceC1700130uLL
    public final String LIZJ(String str) {
        if (LJFF()) {
            C1875370ytz c1875370ytz = this.LJFF;
            if (c1875370ytz != null) {
                try {
                    c1875370ytz.LIZ.sendMessage(str.getBytes(StandardCharsets.UTF_8), 1);
                    return null;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    ALog.e("WsClientImpl", e);
                    return null;
                }
            }
            return null;
        }
        return "the socket is disconnected";
    }

    @Override // X.InterfaceC1700130uLL
    public final String sendMessage(byte[] bArr) {
        if (LJFF()) {
            C1875370ytz c1875370ytz = this.LJFF;
            if (c1875370ytz != null) {
                try {
                    c1875370ytz.LIZ.sendMessage(bArr, 2);
                    return null;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    ALog.e("WsClientImpl", e);
                    return null;
                }
            }
            return null;
        }
        return "the socket is disconnected";
    }

    public C1875600yuM(Context context, C1875390yu1 c1875390yu1) {
        super(context, c1875390yu1);
    }

    @Override // X.InterfaceC1879560z0k
    public final void LIZ(int i, String str) {
        if (i != 2) {
            if (i != 3) {
                if (i == 4) {
                    InterfaceC1875620yuO interfaceC1875620yuO = this.LIZJ;
                    if (interfaceC1875620yuO != null) {
                        interfaceC1875620yuO.LIZ();
                    }
                    synchronized (this) {
                        this.LIZLLL = 1;
                    }
                    return;
                }
                return;
            }
            if (str == null) {
                str = "unknown error";
            }
            InterfaceC1875620yuO interfaceC1875620yuO2 = this.LIZJ;
            if (interfaceC1875620yuO2 != null) {
                interfaceC1875620yuO2.LIZJ(str, true);
                return;
            }
            return;
        }
        if (str != null && str.length() != 0) {
            InterfaceC1875620yuO interfaceC1875620yuO3 = this.LIZJ;
            if (interfaceC1875620yuO3 != null) {
                interfaceC1875620yuO3.onFailed(str);
                return;
            }
            return;
        }
        InterfaceC1875620yuO interfaceC1875620yuO4 = this.LIZJ;
        if (interfaceC1875620yuO4 != null) {
            interfaceC1875620yuO4.onFailed("unknown error");
        }
    }

    @Override // X.InterfaceC1879560z0k
    public final void onMessage(byte[] bArr, int i) {
        String str;
        if (1 == i) {
            if (bArr != null) {
                str = new String(bArr, StandardCharsets.UTF_8);
            } else {
                str = "";
            }
            InterfaceC1875620yuO interfaceC1875620yuO = this.LIZJ;
            if (interfaceC1875620yuO != null) {
                interfaceC1875620yuO.LIZIZ(str);
                return;
            }
            return;
        }
        if (bArr == null) {
            bArr = new byte[0];
        }
        InterfaceC1875620yuO interfaceC1875620yuO2 = this.LIZJ;
        if (interfaceC1875620yuO2 == null) {
            return;
        }
        interfaceC1875620yuO2.onMessage(bArr);
    }
}
