package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.agilelogger.ALog;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: X.0yuN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1875610yuN extends AbstractC1875650yuR implements InterfaceC1879570z0l {
    public C1875320ytu LJFF;

    public final boolean LJFF() {
        int i;
        C1875320ytu c1875320ytu = this.LJFF;
        if (c1875320ytu == null || !c1875320ytu.LIZ.isConnected()) {
            return false;
        }
        synchronized (this) {
            i = this.LIZLLL;
        }
        return i == 1;
    }

    @Override // X.InterfaceC1700110uLJ
    public final String LIZJ(String str) {
        if (LJFF()) {
            C1875320ytu c1875320ytu = this.LJFF;
            if (c1875320ytu != null) {
                try {
                    c1875320ytu.LIZ.sendMessage(str.getBytes(StandardCharsets.UTF_8), 1);
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

    @Override // X.InterfaceC1700110uLJ
    public final String sendMessage(byte[] bArr) {
        if (LJFF()) {
            C1875320ytu c1875320ytu = this.LJFF;
            if (c1875320ytu != null) {
                try {
                    c1875320ytu.LIZ.sendMessage(bArr, 2);
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

    public C1875610yuN(Context context, C1875330ytv c1875330ytv) {
        super(context, c1875330ytv);
    }

    @Override // X.InterfaceC1879570z0l
    public final void LIZ(int i, String str) {
        if (i != 2) {
            if (i != 3) {
                if (i == 4) {
                    InterfaceC1875630yuP interfaceC1875630yuP = this.LIZJ;
                    if (interfaceC1875630yuP != null) {
                        interfaceC1875630yuP.LIZ();
                    }
                    synchronized (this) {
                        this.LIZLLL = 1;
                    }
                    return;
                }
                return;
            }
            InterfaceC1875630yuP interfaceC1875630yuP2 = this.LIZJ;
            if (interfaceC1875630yuP2 != null) {
                interfaceC1875630yuP2.LIZJ(true);
                return;
            }
            return;
        }
        if (str != null && str.length() != 0) {
            InterfaceC1875630yuP interfaceC1875630yuP3 = this.LIZJ;
            if (interfaceC1875630yuP3 != null) {
                interfaceC1875630yuP3.onFailed(str);
                return;
            }
            return;
        }
        InterfaceC1875630yuP interfaceC1875630yuP4 = this.LIZJ;
        if (interfaceC1875630yuP4 != null) {
            interfaceC1875630yuP4.onFailed("unknown error");
        }
    }

    @Override // X.InterfaceC1879570z0l
    public final void onMessage(byte[] bArr, int i) {
        String str;
        if (1 == i) {
            if (bArr != null) {
                str = new String(bArr, StandardCharsets.UTF_8);
            } else {
                str = "";
            }
            InterfaceC1875630yuP interfaceC1875630yuP = this.LIZJ;
            if (interfaceC1875630yuP != null) {
                interfaceC1875630yuP.LIZIZ(str);
                return;
            }
            return;
        }
        if (bArr == null) {
            bArr = new byte[0];
        }
        InterfaceC1875630yuP interfaceC1875630yuP2 = this.LIZJ;
        if (interfaceC1875630yuP2 == null) {
            return;
        }
        interfaceC1875630yuP2.onMessage(bArr);
    }
}
