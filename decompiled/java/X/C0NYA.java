package X;

import kotlin.jvm.internal.AwS553S0100000_9;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.0NYA, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NYA implements C0NXS {
    public final C0NXT LIZ;
    public final C595330NWp LIZIZ;
    public final C0NYW LIZJ;
    public final C595910NYv LIZLLL;
    public final C595280NWk LJ;
    public AnonymousClass0956 LJFF;
    public final C054G LJI = C2296808zG.LIZ(C2296908zH.LIZ());
    public final C01GW LJII;
    public final String LJIIIIZZ;

    @Override // X.C0NXS
    public final String getTag() {
        return this.LJIIIIZZ;
    }

    public final void LIZ(String str) {
        C0NXT c0nxt = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cancel polling (");
        sbLIZ.append(str);
        sbLIZ.append(')');
        C0NXR.LIZLLL(this, c0nxt, C2188811AlT.LIZIZ(sbLIZ));
        AnonymousClass0956 anonymousClass0956 = this.LJFF;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LJFF = null;
        C23250099c.LIZLLL(this.LJI, null, null, new C0NYD(this, str, null), 3);
    }

    @Override // X.C0NXS
    public final void LIZJ(C0NXT c0nxt, String str) {
        C0NXR.LIZ(this, c0nxt, str);
    }

    public final void LIZIZ(String str, String str2, InterfaceC497601wk interfaceC497601wk) {
        C639070P4v c639070P4v = new C639070P4v(CoroutineExceptionHandler.LJJLIL, this, 6);
        C0NXR.LIZLLL(this, this.LIZ, "do irregular report");
        C23250099c.LIZLLL(interfaceC497601wk, C0PEM.LIZJ.plus(c639070P4v), null, new C0NYB(this, str, str2, null), 2);
    }

    public final void LIZLLL(C0NXT c0nxt, String str, Throwable th) {
        C0NXR.LIZJ(this, c0nxt, str, th);
    }

    public C0NYA(C0NXT c0nxt, C0NY7 c0ny7, C595330NWp c595330NWp, C0NYW c0nyw, C0NYH c0nyh, C595910NYv c595910NYv, C595280NWk c595280NWk) {
        this.LIZ = c0nxt;
        this.LIZIZ = c595330NWp;
        this.LIZJ = c0nyw;
        this.LIZLLL = c595910NYv;
        this.LJ = c595280NWk;
        this.LJII = C452501pT.LIZIZ(new AwS553S0100000_9(c0nyh, 1801));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[Reporter][");
        sbLIZ.append(c0ny7.LIZ);
        sbLIZ.append(']');
        this.LJIIIIZZ = C2188811AlT.LIZIZ(sbLIZ);
    }
}
