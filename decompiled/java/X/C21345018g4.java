package X;

import android.net.LocalServerSocket;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.18g4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21345018g4 {
    public LocalServerSocket LIZ;
    public C21346718gL LIZJ;
    public final AtomicInteger LIZIZ = new AtomicInteger();
    public final C21344618g0 LJ = new C21344618g0();
    public final C21345218g6 LIZLLL = new C21345218g6();

    public final C21346718gL LIZ() {
        C21345218g6 c21345218g6 = this.LIZLLL;
        C21344618g0 c21344618g0 = this.LJ;
        c21345218g6.getClass();
        c21344618g0.LIZ(new C21344918g3("/json"), c21345218g6);
        c21344618g0.LIZ(new C21344918g3("/json/version"), c21345218g6);
        c21344618g0.LIZ(new C21344918g3("/json/list"), c21345218g6);
        return new C21346718gL(this.LJ);
    }
}
