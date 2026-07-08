package X;

import android.app.Application;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1AUm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2180261AUm extends C09AY implements Function0<AbstractC1906590ziL> {
    public C2180261AUm() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final AbstractC1906590ziL invoke() {
        C2180271AUn c2180271AUn = C2180271AUn.LIZIZ;
        c2180271AUn.getClass();
        try {
            C2214241BlO c2214241BlO = c2180271AUn.LIZ;
            if (c2214241BlO != null) {
                return c2214241BlO;
            }
            synchronized (c2180271AUn) {
                C2214241BlO c2214241BlO2 = c2180271AUn.LIZ;
                if (c2214241BlO2 != null) {
                    return c2214241BlO2;
                }
                C2214241BlO c2214241BlO3 = (C2214241BlO) C1807670x8n.LJJIJ();
                c2180271AUn.LIZ = c2214241BlO3;
                return c2214241BlO3;
            }
        } catch (C1284660jXE e) {
            TryCatchGuardChecker.doCheck(e);
            return new AbstractC1906590ziL() { // from class: X.1AUf
                public final LinkedList<AbstractC1387200mCc> LIZ = new LinkedList<>();
                public final C2368609Pw<C813430VvZ> LIZIZ = C2368709Px.LIZ();
                public final C2368609Pw<C813430VvZ> LIZJ = C2368709Px.LIZ();
                public final C2368609Pw<C813430VvZ> LIZLLL;
                public final C2368609Pw<AbstractC1387200mCc> LJ;
                public final C2368609Pw<AbstractC1387200mCc> LJFF;
                public final C2368609Pw<AbstractC1387200mCc> LJI;
                public final C2368609Pw<AbstractC1387200mCc> LJII;
                public final C2368609Pw<AbstractC1387200mCc> LJIIIIZZ;
                public final C2368609Pw<AbstractC1387200mCc> LJIIIZ;
                public final C2368609Pw<AbstractC1387200mCc> LJIIJ;
                public final C2368609Pw<C813430VvZ> LJIIJJI;
                public final C2368609Pw<AbstractC1387200mCc> LJIIL;
                public final C2368609Pw<Boolean> LJIILIIL;
                public final C2368609Pw<C606810Nr5> LJIILJJIL;
                public final C2368609Pw<Application> LJIILL;

                @Override // X.AbstractC1906590ziL
                public final AbstractC1387200mCc LJIILL() {
                    return null;
                }

                @Override // X.AbstractC1906590ziL
                public final boolean LJIILLIIL() {
                    return false;
                }

                {
                    C2368709Px.LIZ();
                    this.LIZLLL = C2368709Px.LIZ();
                    this.LJ = C2368709Px.LIZ();
                    C2368709Px.LIZ();
                    C2368709Px.LIZ();
                    this.LJFF = C2368709Px.LIZ();
                    C2368709Px.LIZ();
                    this.LJI = C2368709Px.LIZ();
                    this.LJII = C2368709Px.LIZ();
                    this.LJIIIIZZ = C2368709Px.LIZ();
                    this.LJIIIZ = C2368709Px.LIZ();
                    this.LJIIJ = C2368709Px.LIZ();
                    C2368709Px.LIZ();
                    C2368709Px.LIZ();
                    C2368709Px.LIZ();
                    this.LJIIJJI = C2368709Px.LIZ();
                    C2368709Px.LIZ();
                    C2368709Px.LIZ();
                    this.LJIIL = C2368709Px.LIZ();
                    C2368709Px.LIZ();
                    C2368709Px.LIZ();
                    this.LJIILIIL = C2368709Px.LIZ();
                    this.LJIILJJIL = C2368709Px.LIZ();
                    this.LJIILL = C2368709Px.LIZ();
                }

                @Override // X.InterfaceC2180181AUe
                public final C2368609Pw<C606810Nr5> LIZ() {
                    return this.LJIILJJIL;
                }

                @Override // X.InterfaceC2180181AUe
                public final C2368609Pw<AbstractC1387200mCc> LIZIZ() {
                    return this.LJII;
                }

                @Override // X.InterfaceC2180181AUe
                public final C2368609Pw<Boolean> LIZJ() {
                    return this.LJIILIIL;
                }

                @Override // X.InterfaceC2180181AUe
                public final C2368609Pw<AbstractC1387200mCc> LIZLLL() {
                    return this.LJI;
                }

                @Override // X.InterfaceC2180181AUe
                public final C2368609Pw<C813430VvZ> LJ() {
                    return this.LIZJ;
                }

                @Override // X.InterfaceC2180181AUe
                public final C2368609Pw<C813430VvZ> LJFF() {
                    return this.LIZLLL;
                }

                @Override // X.InterfaceC2180181AUe
                public final C2368609Pw<AbstractC1387200mCc> LJI() {
                    return this.LJIIJ;
                }

                @Override // X.InterfaceC2180181AUe
                public final C2368609Pw<AbstractC1387200mCc> LJII() {
                    return this.LJIIL;
                }

                @Override // X.InterfaceC2180181AUe
                public final C2368609Pw<Application> LJIIIIZZ() {
                    return this.LJIILL;
                }

                @Override // X.InterfaceC2180181AUe
                public final C2368609Pw<C813430VvZ> LJIIIZ() {
                    return this.LIZIZ;
                }

                @Override // X.InterfaceC2180181AUe
                public final C2368609Pw<AbstractC1387200mCc> LJIIJ() {
                    return this.LJFF;
                }

                @Override // X.InterfaceC2180181AUe
                public final C2368609Pw<AbstractC1387200mCc> LJIIJJI() {
                    return this.LJIIIIZZ;
                }

                @Override // X.InterfaceC2180181AUe
                public final C2368609Pw<C813430VvZ> LJIIL() {
                    return this.LJIIJJI;
                }

                @Override // X.InterfaceC2180181AUe
                public final C2368609Pw<AbstractC1387200mCc> LJIILIIL() {
                    return this.LJIIIZ;
                }

                @Override // X.InterfaceC2180181AUe
                public final C2368609Pw<AbstractC1387200mCc> LJIILJJIL() {
                    return this.LJ;
                }

                @Override // X.AbstractC1906590ziL
                public final LinkedList<AbstractC1387200mCc> LJIIZILJ() {
                    return this.LIZ;
                }
            };
        }
    }
}
