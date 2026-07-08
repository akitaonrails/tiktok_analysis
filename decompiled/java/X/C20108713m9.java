package X;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: X.13m9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20108713m9 implements InterfaceC2373409Rs {
    public static final /* synthetic */ int LJIIJ = 0;
    public transient InterfaceC20108913mB LIZIZ;
    public transient Throwable LJ;
    public C20109213mE LJFF;
    public final String LJI;
    public final C20109413mG LJII;
    public final long LJIIIIZZ;
    public final long LJIIIZ;
    public final transient Set<InterfaceC20108813mA> LIZ = Collections.synchronizedSet(new HashSet());
    public transient EnumC20108613m8 LIZJ = EnumC20108613m8.FALLBACK;
    public transient long LIZLLL = System.currentTimeMillis();

    public final void LIZJ() {
        if (this.LIZIZ == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LIZLLL;
        InterfaceC20108913mB interfaceC20108913mB = this.LIZIZ;
        if (interfaceC20108913mB != null) {
            interfaceC20108913mB.LIZ();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("{ request: ");
        sbLIZ.append(this.LJII.LIZLLL);
        sbLIZ.append("], ");
        sbLIZ.append("duration: ");
        sbLIZ.append(jCurrentTimeMillis);
        sbLIZ.append(", ");
        sbLIZ.append("hitState: ");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", ");
        sbLIZ.append("content: ");
        C01GW c01gw = this.LJII.LIZIZ;
        InterfaceC2217461Bqa[] interfaceC2217461BqaArr = C20109413mG.LJIIJ;
        sbLIZ.append(c01gw.getValue());
        sbLIZ.append(", ");
        sbLIZ.append("error: ");
        Throwable th = this.LJ;
        sbLIZ.append(th != null ? th.getClass().getSimpleName() : null);
        sbLIZ.append(" }");
        C20111613mc.LIZ(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC2373409Rs
    public final void LIZ(C20109213mE c20109213mE) {
        this.LJFF = c20109213mE;
        LIZJ();
        Iterator<T> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            ((InterfaceC20108813mA) it2.next()).LIZ(c20109213mE);
        }
    }

    @Override // X.InterfaceC2373409Rs
    public final void LIZIZ(Throwable th) {
        this.LJ = th;
        LIZJ();
        Iterator<T> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            ((InterfaceC20108813mA) it2.next()).onFailed(th);
        }
    }

    public C20108713m9(String str, C20109413mG c20109413mG, long j, long j2) {
        this.LJI = str;
        this.LJII = c20109413mG;
        this.LJIIIIZZ = j;
        this.LJIIIZ = j2;
    }
}
