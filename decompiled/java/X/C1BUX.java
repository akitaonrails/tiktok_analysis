package X;

import com.bytedance.bpea.transmit.delegate.BPEAHandler;

/* JADX INFO: renamed from: X.1BUX, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BUX implements InterfaceC2205761BUo, InterfaceC2205821BUu {
    public static C1BUX LJFF;
    public float LIZ = 0.0f;
    public final C2205811BUt LIZIZ;
    public final C2205801BUs LIZJ;
    public C1BUR LIZLLL;
    public C21690119ud LJ;

    public C1BUX(C2205811BUt c2205811BUt, C2205801BUs c2205801BUs) {
        this.LIZIZ = c2205811BUt;
        this.LIZJ = c2205801BUs;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.1BUt] */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.1BUs] */
    public static C1BUX LIZ() {
        if (LJFF == null) {
            LJFF = new C1BUX(new Object() { // from class: X.1BUt
            }, new Object() { // from class: X.1BUs
            });
        }
        return LJFF;
    }

    @Override // X.InterfaceC2205761BUo
    public final void a(boolean z) {
        if (z) {
            C2205621BUa.LJII.getClass();
            C2205621BUa.LIZIZ();
            return;
        }
        C2205621BUa.LJII.getClass();
        BPEAHandler bPEAHandler = C2205621BUa.LJIIIZ;
        if (bPEAHandler == null) {
            return;
        }
        bPEAHandler.removeCallbacks(C2205621BUa.LJIIJJI);
        C2205621BUa.LJIIIZ = null;
    }
}
