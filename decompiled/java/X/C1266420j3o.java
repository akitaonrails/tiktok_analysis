package X;

import Y.ARunnableS120S0100000_20;
import Y.ARunnableS31S0101000_20;
import android.os.Handler;
import com.ss.ttlivestreamer.core.utils.AVLog;

/* JADX INFO: renamed from: X.0j3o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1266420j3o {
    public final C1267500j5Y LIZ;
    public final C1266350j3h LIZIZ;
    public final InterfaceC1267470j5V LIZJ;
    public final InterfaceC1266410j3n LIZLLL;
    public final C1269730j99 LJ;
    public C1267670j5p LJFF;
    public C1270620jAa LJI;
    public C1266520j3y LJII;
    public C1267420j5Q LJIIIIZZ;
    public final C1269160j8E LJIIIZ;
    public C1266350j3h LJIIJ;

    public final void LIZLLL() {
        Handler handler;
        AVLog.logKibana(4, "VideoSourceManager", "release", null);
        C1270620jAa c1270620jAa = this.LJI;
        if (c1270620jAa != null && (handler = c1270620jAa.LLILZ) != null) {
            C786410Ut5.LJJZZIII(handler, new ARunnableS120S0100000_20(c1270620jAa, 442));
        }
        this.LJI = null;
        C1267670j5p c1267670j5p = this.LJFF;
        if (c1267670j5p != null) {
            AVLog.logKibana(4, "ScreenCaptureManager", "release", null);
            C1270180j9s c1270180j9s = c1267670j5p.LLIZLLLIL;
            if (c1270180j9s != null) {
                c1270180j9s.release();
            }
            c1267670j5p.LLIZLLLIL = null;
            C1270280jA2 c1270280jA2 = c1267670j5p.LLJ;
            if (c1270280jA2 != null && !c1270280jA2.LJII) {
                c1270280jA2.LJII = true;
                Handler handler2 = c1270280jA2.LJI;
                if (handler2 != null) {
                    C786410Ut5.LJJZZIII(handler2, new ARunnableS120S0100000_20(c1270280jA2, 450));
                }
            }
            c1267670j5p.LLJ = null;
            c1267670j5p.LIZJ();
            c1267670j5p.LLILZIL = null;
            c1267670j5p.LLILZ = null;
            c1267670j5p.LL = null;
        }
        this.LJFF = null;
        C1266520j3y c1266520j3y = this.LJII;
        if (c1266520j3y != null) {
            c1266520j3y.LL = null;
        }
        this.LJII = null;
        C1267420j5Q c1267420j5Q = this.LJIIIIZZ;
        if (c1267420j5Q != null) {
            C1269990j9Z c1269990j9Z = c1267420j5Q.LLILLJJLI;
            if (c1269990j9Z != null) {
                c1269990j9Z.release();
            }
            c1267420j5Q.LLILLJJLI = null;
        }
        this.LJIIIIZZ = null;
    }

    public final InterfaceC1266680j4E LIZIZ() {
        return LIZJ(Integer.valueOf(this.LJIIIZ.LJJII()));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void LIZ(int i) {
        C1270180j9s c1270180j9s = null;
        C1269990j9Z c1269990j9Z = null;
        C1270360jAA c1270360jAA = null;
        if (i != 1 && i != 2) {
            if (i != 3) {
                if (i != 4) {
                    if (i == 6 && this.LJIIIIZZ == null) {
                        this.LJIIIIZZ = new C1267420j5Q(this.LIZ, this.LIZIZ, this.LIZJ, this.LJ);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("createCaptureDeviceManager device: ");
                        sbLIZ.append(i);
                        sbLIZ.append(" externalMediaSourceManager: ");
                        sbLIZ.append(this.LJIIIIZZ);
                        AVLog.logKibana(4, "VideoSourceManager", C2188811AlT.LIZIZ(sbLIZ), null);
                        InterfaceC1266410j3n interfaceC1266410j3n = this.LIZLLL;
                        if (interfaceC1266410j3n != null) {
                            C1267420j5Q c1267420j5Q = this.LJIIIIZZ;
                            if (c1267420j5Q != null) {
                                c1269990j9Z = c1267420j5Q.LLILLJJLI;
                            }
                            interfaceC1266410j3n.LJJI(c1269990j9Z);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (this.LJII != null) {
                    return;
                }
                this.LJII = new C1266520j3y(this.LIZ, this.LIZIZ, this.LJ);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("createCaptureDeviceManager device: ");
                sbLIZ2.append(i);
                sbLIZ2.append(" externalVideoFrameManager: ");
                sbLIZ2.append(this.LJII);
                AVLog.logKibana(4, "VideoSourceManager", C2188811AlT.LIZIZ(sbLIZ2), null);
                InterfaceC1266410j3n interfaceC1266410j3n2 = this.LIZLLL;
                if (interfaceC1266410j3n2 == null) {
                    return;
                }
                C1266520j3y c1266520j3y = this.LJII;
                if (c1266520j3y != null) {
                    c1270360jAA = c1266520j3y.LL;
                }
                interfaceC1266410j3n2.LJJ(c1270360jAA);
                return;
            }
            if (this.LJFF != null) {
                return;
            }
            C1267500j5Y c1267500j5Y = this.LIZ;
            C1266350j3h c1266350j3h = this.LIZIZ;
            C1269160j8E c1269160j8E = this.LJIIIZ;
            this.LJFF = new C1267670j5p(c1267500j5Y, c1266350j3h, c1269160j8E.LJLJI.LJIIZILJ, c1269160j8E.LJJ, this.LIZJ, this.LJ);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("createCaptureDeviceManager device: ");
            sbLIZ3.append(i);
            sbLIZ3.append(" screenCaptureManager: ");
            sbLIZ3.append(this.LJFF);
            AVLog.logKibana(4, "VideoSourceManager", C2188811AlT.LIZIZ(sbLIZ3), null);
            InterfaceC1266410j3n interfaceC1266410j3n3 = this.LIZLLL;
            if (interfaceC1266410j3n3 == null) {
                return;
            }
            C1267670j5p c1267670j5p = this.LJFF;
            if (c1267670j5p != null) {
                c1270180j9s = c1267670j5p.LLIZLLLIL;
            }
            interfaceC1266410j3n3.LJLIL(c1270180j9s);
            return;
        }
        if (this.LJI == null) {
            C1270620jAa c1270620jAa = new C1270620jAa(this.LIZ, this.LIZIZ, this.LIZJ, this.LJIIIZ.LJLJI.LJIIZILJ, this.LJ);
            this.LJI = c1270620jAa;
            c1270620jAa.LLILZLL = this.LJIIJ;
            InterfaceC1266410j3n interfaceC1266410j3n4 = this.LIZLLL;
            if (interfaceC1266410j3n4 != null) {
                interfaceC1266410j3n4.LJJZ(c1270620jAa.LLILZIL);
            }
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("createCaptureDeviceManager device: ");
        sbLIZ4.append(i);
        sbLIZ4.append(" cameraCaptureManager: ");
        sbLIZ4.append(this.LJI);
        AVLog.logKibana(4, "VideoSourceManager", C2188811AlT.LIZIZ(sbLIZ4), null);
    }

    public final InterfaceC1266680j4E LIZJ(Integer num) {
        if (num != null) {
            if (num.intValue() != 1 && num.intValue() != 2) {
                if (num.intValue() == 3) {
                    return this.LJFF;
                }
                if (num.intValue() == 4) {
                    return this.LJII;
                }
                if (num.intValue() == 6) {
                    return this.LJIIIIZZ;
                }
                return null;
            }
            return this.LJI;
        }
        return null;
    }

    public final void LJ(int i, int i2) {
        Handler handler;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("switchVideoCaptureDevice fromDevice: ");
        sbLIZ.append(i);
        sbLIZ.append(" toDevice: ");
        sbLIZ.append(i2);
        AVLog.logKibana(4, "VideoSourceManager", C2188811AlT.LIZIZ(sbLIZ), null);
        LIZ(i2);
        if ((i == 1 || i == 2) && (i2 == 1 || i2 == 2)) {
            C1270620jAa c1270620jAa = this.LJI;
            if (c1270620jAa != null && (handler = c1270620jAa.LLILZ) != null) {
                C786410Ut5.LJJZZIII(handler, new ARunnableS31S0101000_20(i2, c1270620jAa, 36));
            }
        } else {
            InterfaceC1266680j4E interfaceC1266680j4ELIZJ = LIZJ(Integer.valueOf(i));
            if (interfaceC1266680j4ELIZJ != null) {
                interfaceC1266680j4ELIZJ.LJIILL();
            }
            InterfaceC1266680j4E interfaceC1266680j4ELIZJ2 = LIZJ(Integer.valueOf(i2));
            if (interfaceC1266680j4ELIZJ2 != null) {
                interfaceC1266680j4ELIZJ2.LIZ();
            }
        }
        InterfaceC1266410j3n interfaceC1266410j3n = this.LIZLLL;
        if (interfaceC1266410j3n != null) {
            interfaceC1266410j3n.LJIILLIIL(i2);
        }
    }

    public C1266420j3o(C1267500j5Y c1267500j5Y, C1266350j3h c1266350j3h, InterfaceC1267470j5V interfaceC1267470j5V, InterfaceC1266410j3n interfaceC1266410j3n, C1269730j99 c1269730j99) {
        C1269160j8E c1269160j8E;
        this.LIZ = c1267500j5Y;
        this.LIZIZ = c1266350j3h;
        this.LIZJ = interfaceC1267470j5V;
        this.LIZLLL = interfaceC1266410j3n;
        this.LJ = c1269730j99;
        if (c1266350j3h != null) {
            c1269160j8E = c1266350j3h.LLILZLL;
        } else {
            c1269160j8E = null;
        }
        this.LJIIIZ = c1269160j8E;
    }
}
