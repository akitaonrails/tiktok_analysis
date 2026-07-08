package X;

import Y.AObjectS294S0200000_20;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.0kTn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1320970kTn implements InterfaceC1320280kSg {
    public final C1321000kTq LIZ;
    public final Executor LIZIZ;
    public C1320700kTM<InterfaceC1330440kj4> LIZJ;
    public InterfaceC1320140kSS LIZLLL;
    public String LJ;
    public Object LJFF;
    public volatile boolean LJI;
    public volatile boolean LJII;
    public InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> LJIIIIZZ;
    public C1323050kX9<AbstractC1327750kej> LJIIIZ;
    public Drawable LJIIJ;
    public boolean LJIIJJI = true;
    public C1325710kbR LJIIL;
    public C1321180kU8 LJIILIIL;
    public final InterfaceC1320130kSR LJIILJJIL;
    public InterfaceC1320070kSL<InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>>> LJIILL;

    public final C1320700kTM<InterfaceC1330440kj4> LIZIZ() {
        C1320700kTM<InterfaceC1330440kj4> c1320700kTM = this.LIZJ;
        return c1320700kTM == null ? new C1320700kTM<>() : c1320700kTM;
    }

    public final void LJFF() {
        boolean z = this.LJII;
        this.LJII = false;
        InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSY = this.LJIIIIZZ;
        this.LJIIIIZZ = null;
        C1168320gVa.LIZJ(new AObjectS294S0200000_20(interfaceC1320200kSY, this, 1));
        if (z) {
            LIZIZ().LIZIZ(this.LJ);
        }
    }

    public final String toString() {
        C1320100kSO c1320100kSOLIZIZ = C1320090kSN.LIZIZ(this);
        c1320100kSOLIZIZ.LIZ("isAttached", this.LJI);
        c1320100kSOLIZIZ.LIZ("isRequestSubmitted", this.LJII);
        C1323050kX9<AbstractC1327750kej> c1323050kX9 = this.LJIIIZ;
        c1320100kSOLIZIZ.LIZIZ(String.valueOf(c1323050kX9 != null ? c1323050kX9.LJIILL() : 0), "fetchedImage");
        c1320100kSOLIZIZ.LIZIZ(this.LJIILL, "dataSourceSupplier");
        return c1320100kSOLIZIZ.toString();
    }

    @Override // X.InterfaceC1320280kSg
    public final void release() {
        LJFF();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ(C1320700kTM<? super InterfaceC1330440kj4> c1320700kTM) {
        boolean z;
        if (c1320700kTM != 0) {
            z = true;
        } else {
            z = false;
        }
        C1325860kbg.LIZLLL(z, null, null, Collections.emptyMap());
        C1320700kTM<InterfaceC1330440kj4> c1320700kTM2 = this.LIZJ;
        if (c1320700kTM2 instanceof C1320990kTp) {
            C1320690kTL c1320690kTL = (C1320690kTL) c1320700kTM2;
            synchronized (c1320690kTL) {
                ((ArrayList) c1320690kTL.LIZIZ).add(c1320700kTM);
            }
        } else {
            if (c1320700kTM2 != null) {
                C1320690kTL<InterfaceC1330440kj4> c1320690kTL2 = new C1320690kTL<InterfaceC1330440kj4>() { // from class: X.0kTp
                };
                c1320690kTL2.LJIIJJI(c1320700kTM2);
                c1320690kTL2.LJIIJJI(c1320700kTM);
                this.LIZJ = c1320690kTL2;
                return;
            }
            this.LIZJ = c1320700kTM;
        }
    }

    public final void LJI(InterfaceC1316360kMM interfaceC1316360kMM) {
        if (this.LJII) {
            this.LIZ.LIZ(this);
            LJFF();
        }
        if (this.LIZLLL != null) {
            this.LIZLLL = null;
        }
        if (interfaceC1316360kMM != null) {
            if (interfaceC1316360kMM instanceof InterfaceC1320140kSS) {
                this.LIZLLL = (InterfaceC1320140kSS) interfaceC1316360kMM;
            } else {
                this.LIZLLL = null;
                C1325860kbg.LIZIZ(null, null, Collections.emptyMap());
            }
        }
    }

    public final synchronized void LIZJ(Object obj, String str) {
        C1321000kTq c1321000kTq;
        if (!this.LJIIJJI && (c1321000kTq = this.LIZ) != null) {
            c1321000kTq.LIZ(this);
        }
        this.LJI = false;
        LJFF();
        C1320700kTM<InterfaceC1330440kj4> c1320700kTM = this.LIZJ;
        if (c1320700kTM instanceof C1320990kTp) {
            ((C1320990kTp) c1320700kTM).LJIIL();
        } else {
            this.LIZJ = null;
        }
        this.LIZLLL = null;
        this.LJ = str;
        this.LJFF = obj;
    }

    public final boolean LIZLLL(String str, InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSY) {
        Boolean bool;
        C1321180kU8 c1321180kU8 = this.LJIILIIL;
        if (c1321180kU8 == null) {
            bool = Boolean.TRUE;
        } else {
            C1325860kbg.LIZ();
            if (c1321180kU8.LIZ) {
                bool = Boolean.TRUE;
            } else {
                bool = Boolean.FALSE;
            }
        }
        if (bool.booleanValue()) {
            return false;
        }
        InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSY2 = this.LJIIIIZZ;
        if (interfaceC1320200kSY == null && interfaceC1320200kSY2 == null) {
            return true;
        }
        if (!str.equals(this.LJ) || interfaceC1320200kSY != interfaceC1320200kSY2 || !this.LJII) {
            return false;
        }
        return true;
    }

    public C1320970kTn(C1321000kTq c1321000kTq, C1320120kSQ c1320120kSQ, C822690WPb c822690WPb) {
        this.LIZ = c1321000kTq;
        this.LIZIZ = c822690WPb;
        LIZJ(null, null);
        this.LJIILJJIL = c1320120kSQ;
    }

    public final void LJ(String str, InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSY, Throwable th, boolean z) {
        if (!LIZLLL(str, interfaceC1320200kSY)) {
            interfaceC1320200kSY.close();
        } else if (z) {
            this.LJIIIIZZ = null;
            LIZIZ().LIZLLL(this.LJ, th);
        } else {
            LIZIZ().LIZ(this.LJ, th);
        }
    }
}
