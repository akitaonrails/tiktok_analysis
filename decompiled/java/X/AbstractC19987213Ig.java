package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13Ig, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19987213Ig {
    public static final C13IW LIZLLL = new AbstractC19987213Ig() { // from class: X.13IW
        {
            new C19988913Ix(false, false, false, false, false, true, "    ", false, false, "type", false, true, false, false, false, EnumC1779370wP9.POLYMORPHIC);
            C13IP c13ip = C13G7.LIZ;
        }
    };
    public final C19988913Ix LIZ;
    public final AbstractC19984913Hj LIZIZ;
    public final C13J8 LIZJ = new C13J8();

    public AbstractC19987213Ig(C19988913Ix c19988913Ix, AbstractC19984913Hj abstractC19984913Hj) {
        this.LIZ = c19988913Ix;
        this.LIZIZ = abstractC19984913Hj;
    }

    public final <T> T LIZ(InterfaceC19984213Hc<? extends T> interfaceC19984213Hc, AbstractC19979113Fd abstractC19979113Fd) {
        C13HB c19985013Hk;
        String str = null;
        if (abstractC19979113Fd instanceof C13BG) {
            c19985013Hk = new C19987513Ij(this, (C13BG) abstractC19979113Fd, str, 12);
        } else if (abstractC19979113Fd instanceof C13BE) {
            c19985013Hk = new C19970213Bs(this, (C13BE) abstractC19979113Fd);
        } else {
            if (!(abstractC19979113Fd instanceof C19981913Gf) && !Intrinsics.LJFF(abstractC19979113Fd, C13GQ.INSTANCE)) {
                throw new C1954807lC();
            }
            c19985013Hk = new C19985013Hk(this, abstractC19979113Fd, null);
        }
        return (T) c19985013Hk.LIZLLL(interfaceC19984213Hc);
    }

    public final <T> T LIZIZ(InterfaceC19984213Hc<? extends T> interfaceC19984213Hc, String str) {
        AbstractC19987713Il c19989113Iz;
        if (!this.LIZ.LJIILJJIL) {
            c19989113Iz = new C19987913In(str);
        } else {
            c19989113Iz = new C19989113Iz(str);
        }
        T t = (T) new C19987413Ii(this, EnumC19987013Ie.OBJ, c19989113Iz, interfaceC19984213Hc.getDescriptor(), null).LIZLLL(interfaceC19984213Hc);
        c19989113Iz.LJIILJJIL();
        return t;
    }

    public final <T> String LIZJ(InterfaceC19984413He<? super T> interfaceC19984413He, T t) {
        C13IZ c13iz;
        final C19988313Ir c19988313Ir = new C19988313Ir();
        try {
            EnumC19987013Ie enumC19987013Ie = EnumC19987013Ie.OBJ;
            C13HH[] c13hhArr = new C13HH[EnumC19987013Ie.getEntries().size()];
            if (this.LIZ.LJ) {
                c13iz = new C13IZ(c19988313Ir, this) { // from class: X.13If
                    public final AbstractC19987213Ig LIZJ;
                    public int LIZLLL;

                    @Override // X.C13IZ
                    public final void LIZ() {
                        this.LIZIZ = true;
                        this.LIZLLL++;
                    }

                    @Override // X.C13IZ
                    public final void LIZIZ() {
                        this.LIZIZ = false;
                        LJII("\n");
                        int i = this.LIZLLL;
                        for (int i2 = 0; i2 < i; i2++) {
                            LJII(this.LIZJ.LIZ.LJI);
                        }
                    }

                    @Override // X.C13IZ
                    public final void LIZJ() {
                        if (this.LIZIZ) {
                            this.LIZIZ = false;
                        } else {
                            LIZIZ();
                        }
                    }

                    @Override // X.C13IZ
                    public final void LJIIJ() {
                        LJ(' ');
                    }

                    @Override // X.C13IZ
                    public final void LJIIJJI() {
                        this.LIZLLL--;
                    }

                    {
                        this.LIZJ = this;
                    }
                };
            } else {
                c13iz = new C13IZ(c19988313Ir);
            }
            new C13IY(c13iz, this, enumC19987013Ie, c13hhArr).LJJI(interfaceC19984413He, t);
            String string = c19988313Ir.toString();
            c19988313Ir.LJ();
            return string;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C13JN c13jn = C13JN.LIZJ;
            char[] cArr = c19988313Ir.LIZ;
            synchronized (c13jn) {
                try {
                    int i = c13jn.LIZIZ;
                    if (cArr.length + i < C1225204qo.LIZ) {
                        c13jn.LIZIZ = i + cArr.length;
                        c13jn.LIZ.addLast(cArr);
                    }
                    throw th;
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    throw th2;
                }
            }
        }
    }
}
