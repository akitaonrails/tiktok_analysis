package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.FileInputStream;
import java.security.MessageDigest;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0fqN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1142770fqN implements InterfaceC1142710fqH<String>, InterfaceC1142800fqQ<String> {
    public final InterfaceC1142710fqH<String> LIZ;
    public InterfaceC1142800fqQ<String> LIZIZ;
    public C1142830fqT LIZJ;

    public C1142770fqN(InterfaceC1142710fqH interfaceC1142710fqH) {
        this.LIZ = interfaceC1142710fqH;
    }

    @Override // X.InterfaceC1142800fqQ
    public final void LIZ(C1139230fkf c1139230fkf, String str) throws Throwable {
        String str2 = str;
        if (this.LIZJ != null) {
            long jNanoTime = System.nanoTime();
            Iterator it2 = ((CopyOnWriteArrayList) C1142700fqG.LJFF().LIZJ).iterator();
            while (it2.hasNext()) {
                ((InterfaceC1142750fqL) it2.next()).LJ(jNanoTime, c1139230fkf);
            }
        }
        try {
            try {
                C0VSJ c0vsj = new C0VSJ(str2);
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                try {
                    C0VSP c0vsp = new C0VSP(c0vsj);
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int i = c0vsp.read(bArr, 0, 8192);
                        if (i <= 0) {
                            break;
                        } else {
                            messageDigest.update(bArr, 0, i);
                        }
                    }
                    String strLIZIZ = C08HI.LIZIZ(messageDigest.digest());
                    c0vsp.close();
                    if (!c1139230fkf.LJ.equals(strLIZIZ)) {
                        LIZJ(c1139230fkf, new C1139280fkk(C786410Ut5.j4("File %1$s md5 is not equals", new Object[]{str2}), c1139230fkf, strLIZIZ));
                        c0vsj.delete();
                    } else {
                        InterfaceC1142800fqQ<String> interfaceC1142800fqQ = this.LIZIZ;
                        if (interfaceC1142800fqQ != null) {
                            interfaceC1142800fqQ.LIZ(c1139230fkf, str2);
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    FileInputStream fileInputStream = null;
                    TryCatchGuardChecker.doCheck(th);
                    if (0 != 0) {
                        fileInputStream.close();
                    }
                    throw th;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                LIZJ(c1139230fkf, new C1139280fkk(C786410Ut5.j4("File %1$s md5 error", new Object[]{str2}), e, c1139230fkf, ""));
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // X.InterfaceC1142800fqQ
    public final void LIZIZ(C1139230fkf c1139230fkf, int i) {
        InterfaceC1142800fqQ<String> interfaceC1142800fqQ = this.LIZIZ;
        if (interfaceC1142800fqQ != null) {
            interfaceC1142800fqQ.LIZIZ(c1139230fkf, i);
        }
    }

    @Override // X.InterfaceC1142800fqQ
    public final void LIZJ(C1139230fkf c1139230fkf, C1139250fkh c1139250fkh) {
        InterfaceC1142800fqQ<String> interfaceC1142800fqQ = this.LIZIZ;
        if (interfaceC1142800fqQ != null) {
            interfaceC1142800fqQ.LIZJ(c1139230fkf, c1139250fkh);
        }
    }

    @Override // X.InterfaceC1142710fqH
    public final void LIZLLL(C1139230fkf c1139230fkf, InterfaceC1142800fqQ<String> interfaceC1142800fqQ) {
        this.LIZIZ = interfaceC1142800fqQ;
        this.LIZ.LIZLLL(c1139230fkf, this);
    }
}
