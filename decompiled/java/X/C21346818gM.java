package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.18gM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21346818gM implements InterfaceC21345918gD {
    public final C21346918gN LIZ;
    public final C21347718gV LIZIZ;
    public final InterfaceC21345818gC LIZJ;
    public volatile boolean LJ;
    public final AtomicBoolean LIZLLL = new AtomicBoolean(false);
    public final C21348118gZ LJFF = new C21348118gZ(this);
    public final C21348218ga LJI = new C21348218ga(this);

    public final void LIZIZ() {
        if (this.LIZLLL.getAndSet(false)) {
            ((C21344818g2) this.LIZJ).LIZ.LIZIZ(this);
        }
    }

    public final void LIZ(C21347018gO c21347018gO) {
        if (!this.LIZLLL.get()) {
            new IOException("Session is closed");
            ((C21344818g2) this.LIZJ).LIZ.LIZIZ(this);
            return;
        }
        C21347718gV c21347718gV = this.LIZIZ;
        C21348218ga c21348218ga = this.LJI;
        synchronized (c21347718gV) {
            try {
                c21347018gO.LIZIZ(c21347718gV.LIZ);
                c21347718gV.LIZ.flush();
                c21348218ga.getClass();
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
                C21346818gM c21346818gM = c21348218ga.LIZ;
                ((C21344818g2) c21346818gM.LIZJ).LIZ.LIZIZ(c21346818gM);
            }
        }
    }

    public C21346818gM(C2479109nZ c2479109nZ, OutputStream outputStream, InterfaceC21345818gC interfaceC21345818gC) {
        this.LIZ = new C21346918gN(c2479109nZ);
        this.LIZIZ = new C21347718gV(outputStream);
        this.LIZJ = interfaceC21345818gC;
    }
}
