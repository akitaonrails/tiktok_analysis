package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0qGR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1543330qGR {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LJIIIZ;
    public final C1283610jVX LIZ = new C1283610jVX(0);
    public final C1283610jVX LIZIZ = new C1283610jVX(0);
    public final C1283610jVX LIZJ = new C1283610jVX(0);
    public final C1283610jVX LIZLLL = new C1283610jVX(0);
    public final C1283610jVX LJ = new C1283610jVX(0);
    public final C1283610jVX LJFF = new C1283610jVX(0);
    public final C1283610jVX LJI = new C1283610jVX(0);
    public final Object LJII = new Object();
    public final StringBuilder LJIIIIZZ = new StringBuilder();

    static {
        C2217371BqR c2217371BqR = new C2217371BqR(C1543330qGR.class, "allJSB", "getAllJSB()Ljava/lang/Long;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217371BqR c2217371BqR2 = new C2217371BqR(C1543330qGR.class, "allJSBTwo", "getAllJSBTwo()Ljava/lang/Long;", 0);
        c09r3.getClass();
        C2217371BqR c2217371BqR3 = new C2217371BqR(C1543330qGR.class, "tcp", "getTcp()Ljava/lang/Long;", 0);
        c09r3.getClass();
        C2217371BqR c2217371BqR4 = new C2217371BqR(C1543330qGR.class, "search", "getSearch()Ljava/lang/Long;", 0);
        c09r3.getClass();
        C2217371BqR c2217371BqR5 = new C2217371BqR(C1543330qGR.class, "monetization", "getMonetization()Ljava/lang/Long;", 0);
        c09r3.getClass();
        C2217371BqR c2217371BqR6 = new C2217371BqR(C1543330qGR.class, "xbridge", "getXbridge()Ljava/lang/Long;", 0);
        c09r3.getClass();
        C2217371BqR c2217371BqR7 = new C2217371BqR(C1543330qGR.class, "controller", "getController()Ljava/lang/Boolean;", 0);
        c09r3.getClass();
        LJIIIZ = new InterfaceC2217461Bqa[]{c2217371BqR, c2217371BqR2, c2217371BqR3, c2217371BqR4, c2217371BqR5, c2217371BqR6, c2217371BqR7};
    }

    public final String LIZIZ() {
        String string;
        synchronized (this.LJII) {
            try {
                string = this.LJIIIIZZ.toString();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return string;
    }

    public final void LIZ(String str) {
        if (str.length() == 0) {
            return;
        }
        synchronized (this.LJII) {
            try {
                if (this.LJIIIIZZ.length() > 0) {
                    this.LJIIIIZZ.append('|');
                }
                this.LJIIIIZZ.append(str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
