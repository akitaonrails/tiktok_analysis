package X;

import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: X.1Bwp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public class C2221331Bwp implements InterfaceC2221401Bww {
    public volatile EnumC994220bym LIZ;
    public final /* synthetic */ C2221281Bwk LIZIZ;

    @Override // X.InterfaceC2221401Bww
    public final void execute() {
        if (this.LIZIZ.LJI <= 0) {
            this.LIZ = EnumC994220bym.GET_HEADER_SIZE_WAIT;
            return;
        }
        ((ReentrantLock) this.LIZIZ.LIZJ).lock();
        this.LIZ = EnumC994220bym.GET_HEADER_SIZE_DONE;
        this.LIZIZ.LIZLLL.signalAll();
        ((ReentrantLock) this.LIZIZ.LIZJ).unlock();
    }

    public C2221331Bwp(C2221281Bwk c2221281Bwk) {
        this.LIZIZ = c2221281Bwk;
    }
}
