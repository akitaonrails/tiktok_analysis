package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.13Ih, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19987313Ih extends C13J3 implements C13GT {
    public final AbstractC19987213Ig LIZLLL;
    public final String LJ;
    public final C19988913Ix LJFF;

    @Override // X.InterfaceC19986313Hx
    public void LJIIJJI(InterfaceC19983313Gt interfaceC19983313Gt) {
    }

    public abstract AbstractC19979113Fd LJJJJJL(String str);

    public abstract AbstractC19979113Fd LJJJJLI();

    @Override // X.InterfaceC19986313Hx
    public final AbstractC19984913Hj LIZ() {
        return this.LIZLLL.LIZIZ;
    }

    public final AbstractC19979113Fd LJJJJL() {
        AbstractC19979113Fd abstractC19979113FdLJJJJJL;
        String str = (String) C13LP.LJJLIIIJL(this.LIZIZ);
        return (str == null || (abstractC19979113FdLJJJJJL = LJJJJJL(str)) == null) ? LJJJJLI() : abstractC19979113FdLJJJJJL;
    }

    @Override // X.C13HB
    public boolean LJIIZILJ() {
        return !(LJJJJL() instanceof C13GQ);
    }

    @Override // X.C13GT
    public final AbstractC19979113Fd LJIL() {
        return LJJJJL();
    }

    @Override // X.C13HB
    public InterfaceC19986313Hx LIZIZ(InterfaceC19983313Gt interfaceC19983313Gt) {
        AbstractC19979113Fd abstractC19979113FdLJJJJL = LJJJJL();
        C13GW c13gwLIZIZ = interfaceC19983313Gt.LIZIZ();
        if (!Intrinsics.LJFF(c13gwLIZIZ, C19982613Gm.LIZ) && !(c13gwLIZIZ instanceof C13GL)) {
            if (Intrinsics.LJFF(c13gwLIZIZ, C19982713Gn.LIZ)) {
                AbstractC19987213Ig abstractC19987213Ig = this.LIZLLL;
                InterfaceC19983313Gt interfaceC19983313GtLIZ = C13IX.LIZ(interfaceC19983313Gt.LJIIIIZZ(0), abstractC19987213Ig.LIZIZ);
                C13GW c13gwLIZIZ2 = interfaceC19983313GtLIZ.LIZIZ();
                if (!(c13gwLIZIZ2 instanceof C13HJ) && !Intrinsics.LJFF(c13gwLIZIZ2, C13GS.LIZ)) {
                    if (abstractC19987213Ig.LIZ.LIZLLL) {
                        AbstractC19987213Ig abstractC19987213Ig2 = this.LIZLLL;
                        String strLJI = interfaceC19983313Gt.LJI();
                        if (abstractC19979113FdLJJJJL instanceof C13BE) {
                            return new C19970213Bs(abstractC19987213Ig2, (C13BE) abstractC19979113FdLJJJJL);
                        }
                        throw C19988213Iq.LJ("Expected " + C13LE.LIZ(C13BE.class).LJI() + ", but had " + C13LE.LIZ(abstractC19979113FdLJJJJL.getClass()).LJI() + " as the serialized body of " + strLJI + " at element: " + LJJJJJ(), abstractC19979113FdLJJJJL.toString(), -1);
                    }
                    throw C19988213Iq.LIZJ(interfaceC19983313GtLIZ);
                }
                final AbstractC19987213Ig abstractC19987213Ig3 = this.LIZLLL;
                String strLJI2 = interfaceC19983313Gt.LJI();
                if (abstractC19979113FdLJJJJL instanceof C13BG) {
                    final C13BG c13bg = (C13BG) abstractC19979113FdLJJJJL;
                    return new C19987513Ij(abstractC19987213Ig3, c13bg) { // from class: X.13Iu
                        public final C13BG LJIIJ;
                        public final List<String> LJIIJJI;
                        public final int LJIIL;
                        public int LJIILIIL;

                        @Override // X.C19987513Ij, X.AbstractC19987313Ih, X.InterfaceC19986313Hx
                        public final void LJIIJJI(InterfaceC19983313Gt interfaceC19983313Gt2) {
                        }

                        @Override // X.C19987513Ij, X.AbstractC19987313Ih
                        public final AbstractC19979113Fd LJJJJLI() {
                            return this.LJIIJ;
                        }

                        @Override // X.C19987513Ij
                        /* JADX INFO: renamed from: LJJJJZI */
                        public final C13BG LJJJJLI() {
                            return this.LJIIJ;
                        }

                        @Override // X.C19987513Ij, X.InterfaceC19986313Hx
                        public final int LJIJJ(InterfaceC19983313Gt interfaceC19983313Gt2) {
                            int i = this.LJIILIIL;
                            if (i < this.LJIIL - 1) {
                                int i2 = i + 1;
                                this.LJIILIIL = i2;
                                return i2;
                            }
                            return -1;
                        }

                        @Override // X.C19987513Ij, X.AbstractC19987313Ih
                        public final AbstractC19979113Fd LJJJJJL(String str) {
                            if (this.LJIILIIL % 2 == 0) {
                                C13H0 c13h0 = C19988013Io.LIZ;
                                if (str == null) {
                                    return C13GQ.INSTANCE;
                                }
                                return new C19981913Gf(str, true);
                            }
                            return (AbstractC19979113Fd) C2097608Jq.LJFF(str, this.LJIIJ);
                        }

                        {
                            this.LJIIJ = c13bg;
                            List<String> listLLIIII = C13LP.LLIIII(c13bg.keySet());
                            this.LJIIJJI = listLLIIII;
                            this.LJIIL = listLLIIII.size() * 2;
                            this.LJIILIIL = -1;
                        }

                        @Override // X.C19987513Ij, X.C13J3
                        public final String LJJJJIZL(InterfaceC19983313Gt interfaceC19983313Gt2, int i) {
                            return (String) ListProtector.get(this.LJIIJJI, i / 2);
                        }
                    };
                }
                throw C19988213Iq.LJ("Expected " + C13LE.LIZ(C13BG.class).LJI() + ", but had " + C13LE.LIZ(abstractC19979113FdLJJJJL.getClass()).LJI() + " as the serialized body of " + strLJI2 + " at element: " + LJJJJJ(), abstractC19979113FdLJJJJL.toString(), -1);
            }
            AbstractC19987213Ig abstractC19987213Ig4 = this.LIZLLL;
            String strLJI3 = interfaceC19983313Gt.LJI();
            if (abstractC19979113FdLJJJJL instanceof C13BG) {
                return new C19987513Ij(abstractC19987213Ig4, (C13BG) abstractC19979113FdLJJJJL, this.LJ, 8);
            }
            throw C19988213Iq.LJ("Expected " + C13LE.LIZ(C13BG.class).LJI() + ", but had " + C13LE.LIZ(abstractC19979113FdLJJJJL.getClass()).LJI() + " as the serialized body of " + strLJI3 + " at element: " + LJJJJJ(), abstractC19979113FdLJJJJL.toString(), -1);
        }
        AbstractC19987213Ig abstractC19987213Ig5 = this.LIZLLL;
        String strLJI4 = interfaceC19983313Gt.LJI();
        if (abstractC19979113FdLJJJJL instanceof C13BE) {
            return new C19970213Bs(abstractC19987213Ig5, (C13BE) abstractC19979113FdLJJJJL);
        }
        throw C19988213Iq.LJ("Expected " + C13LE.LIZ(C13BE.class).LJI() + ", but had " + C13LE.LIZ(abstractC19979113FdLJJJJL.getClass()).LJI() + " as the serialized body of " + strLJI4 + " at element: " + LJJJJJ(), abstractC19979113FdLJJJJL.toString(), -1);
    }

    @Override // X.AbstractC19984513Hf, X.C13HB
    public final <T> T LIZLLL(InterfaceC19984213Hc<? extends T> interfaceC19984213Hc) {
        C13GN c13gn;
        if ((interfaceC19984213Hc instanceof AbstractC19984813Hi) && !this.LIZLLL.LIZ.LJIIIIZZ) {
            AbstractC19984813Hi abstractC19984813Hi = (AbstractC19984813Hi) interfaceC19984213Hc;
            String strLIZ = C19986713Ib.LIZ(abstractC19984813Hi.getDescriptor(), this.LIZLLL);
            AbstractC19979113Fd abstractC19979113FdLJJJJL = LJJJJL();
            String strLJI = abstractC19984813Hi.getDescriptor().LJI();
            if (abstractC19979113FdLJJJJL instanceof C13BG) {
                C13BG c13bg = (C13BG) abstractC19979113FdLJJJJL;
                AbstractC19979113Fd abstractC19979113Fd = (AbstractC19979113Fd) c13bg.get(strLIZ);
                String strLIZJ = null;
                if (abstractC19979113Fd != null) {
                    C13H0 c13h0 = C19988013Io.LIZ;
                    if (abstractC19979113Fd instanceof C13GN) {
                        c13gn = (C13GN) abstractC19979113Fd;
                    } else {
                        c13gn = null;
                    }
                    if (c13gn != null) {
                        if (!(c13gn instanceof C13GQ)) {
                            strLIZJ = c13gn.LIZJ();
                        }
                    } else {
                        C19988013Io.LIZ(abstractC19979113Fd, "JsonPrimitive");
                        throw null;
                    }
                }
                try {
                    return (T) C13J4.LIZ(this.LIZLLL, strLIZ, c13bg, C19984713Hh.LIZ((AbstractC19984813Hi) interfaceC19984213Hc, this, strLIZJ));
                } catch (C19981113Fx e) {
                    TryCatchGuardChecker.doCheck(e);
                    throw C19988213Iq.LJ(e.getMessage(), c13bg.toString(), -1);
                }
            }
            throw C19988213Iq.LJ("Expected " + C13LE.LIZ(C13BG.class).LJI() + ", but had " + C13LE.LIZ(abstractC19979113FdLJJJJL.getClass()).LJI() + " as the serialized body of " + strLJI + " at element: " + LJJJJJ(), abstractC19979113FdLJJJJL.toString(), -1);
        }
        return interfaceC19984213Hc.deserialize(this);
    }

    @Override // X.AbstractC19984513Hf, X.C13HB
    public final C13HB LJJIIJZLJL(InterfaceC19983313Gt interfaceC19983313Gt) {
        if (C13LP.LJJLIIIJL(this.LIZIZ) != null) {
            return super.LJJIIJZLJL(interfaceC19983313Gt);
        }
        return new C19985013Hk(this.LIZLLL, LJJJJLI(), this.LJ).LJJIIJZLJL(interfaceC19983313Gt);
    }

    @Override // X.AbstractC19984513Hf
    public final boolean LJJIJ(String str) {
        Boolean bool;
        String str2 = str;
        AbstractC19979113Fd abstractC19979113FdLJJJJJL = LJJJJJL(str2);
        if (abstractC19979113FdLJJJJJL instanceof C13GN) {
            C13GN c13gn = (C13GN) abstractC19979113FdLJJJJJL;
            try {
                C13H0 c13h0 = C19988013Io.LIZ;
                String strLIZJ = c13gn.LIZJ();
                String[] strArr = C2342709Fx.LIZ;
                if (u.LJIJI(strLIZJ, "true", true)) {
                    bool = Boolean.TRUE;
                } else {
                    if (u.LJIJI(strLIZJ, "false", true)) {
                        bool = Boolean.FALSE;
                    }
                    LJJJJZ(c13gn, "boolean", str2);
                    throw null;
                }
                if (bool != null) {
                    return bool.booleanValue();
                }
                LJJJJZ(c13gn, "boolean", str2);
                throw null;
            } catch (IllegalArgumentException e) {
                TryCatchGuardChecker.doCheck(e);
                LJJJJZ(c13gn, "boolean", str2);
                throw null;
            }
        }
        throw C19988213Iq.LJ("Expected " + C13LE.LIZ(C13GN.class).LJI() + ", but had " + C13LE.LIZ(abstractC19979113FdLJJJJJL.getClass()).LJI() + " as the serialized body of boolean at element: " + LJJJJLL(str2), abstractC19979113FdLJJJJJL.toString(), -1);
    }

    @Override // X.AbstractC19984513Hf
    public final byte LJJIJIIJI(String str) {
        Byte bValueOf;
        String str2 = str;
        AbstractC19979113Fd abstractC19979113FdLJJJJJL = LJJJJJL(str2);
        if (abstractC19979113FdLJJJJJL instanceof C13GN) {
            C13GN c13gn = (C13GN) abstractC19979113FdLJJJJJL;
            try {
                long jLIZIZ = C19988013Io.LIZIZ(c13gn);
                if (-128 <= jLIZIZ && jLIZIZ <= 127 && (bValueOf = Byte.valueOf((byte) jLIZIZ)) != null) {
                    return bValueOf.byteValue();
                }
                LJJJJZ(c13gn, "byte", str2);
                throw null;
            } catch (IllegalArgumentException e) {
                TryCatchGuardChecker.doCheck(e);
                LJJJJZ(c13gn, "byte", str2);
                throw null;
            }
        }
        throw C19988213Iq.LJ("Expected " + C13LE.LIZ(C13GN.class).LJI() + ", but had " + C13LE.LIZ(abstractC19979113FdLJJJJJL.getClass()).LJI() + " as the serialized body of byte at element: " + LJJJJLL(str2), abstractC19979113FdLJJJJJL.toString(), -1);
    }

    @Override // X.AbstractC19984513Hf
    public final char LJJIJIIJIL(String str) {
        String str2 = str;
        AbstractC19979113Fd abstractC19979113FdLJJJJJL = LJJJJJL(str2);
        if (abstractC19979113FdLJJJJJL instanceof C13GN) {
            C13GN c13gn = (C13GN) abstractC19979113FdLJJJJJL;
            try {
                return C13LN.LJZ(c13gn.LIZJ());
            } catch (IllegalArgumentException e) {
                TryCatchGuardChecker.doCheck(e);
                LJJJJZ(c13gn, "char", str2);
                throw null;
            }
        }
        throw C19988213Iq.LJ("Expected " + C13LE.LIZ(C13GN.class).LJI() + ", but had " + C13LE.LIZ(abstractC19979113FdLJJJJJL.getClass()).LJI() + " as the serialized body of char at element: " + LJJJJLL(str2), abstractC19979113FdLJJJJJL.toString(), -1);
    }

    @Override // X.AbstractC19984513Hf
    public final double LJJIJIL(String str) {
        String str2 = str;
        AbstractC19979113Fd abstractC19979113FdLJJJJJL = LJJJJJL(str2);
        if (abstractC19979113FdLJJJJJL instanceof C13GN) {
            C13GN c13gn = (C13GN) abstractC19979113FdLJJJJJL;
            try {
                C13H0 c13h0 = C19988013Io.LIZ;
                double d = CastDoubleProtector.parseDouble(c13gn.LIZJ());
                if (!this.LIZLLL.LIZ.LJIIJ && Math.abs(d) > Double.MAX_VALUE) {
                    throw C19988213Iq.LIZ(str2, LJJJJL().toString(), Double.valueOf(d));
                }
                return d;
            } catch (IllegalArgumentException e) {
                TryCatchGuardChecker.doCheck(e);
                LJJJJZ(c13gn, "double", str2);
                throw null;
            }
        }
        throw C19988213Iq.LJ("Expected " + C13LE.LIZ(C13GN.class).LJI() + ", but had " + C13LE.LIZ(abstractC19979113FdLJJJJJL.getClass()).LJI() + " as the serialized body of double at element: " + LJJJJLL(str2), abstractC19979113FdLJJJJJL.toString(), -1);
    }

    @Override // X.AbstractC19984513Hf
    public final float LJJIJLIJ(String str) {
        String str2 = str;
        AbstractC19979113Fd abstractC19979113FdLJJJJJL = LJJJJJL(str2);
        if (abstractC19979113FdLJJJJJL instanceof C13GN) {
            C13GN c13gn = (C13GN) abstractC19979113FdLJJJJJL;
            try {
                C13H0 c13h0 = C19988013Io.LIZ;
                float f = CastFloatProtector.parseFloat(c13gn.LIZJ());
                if (!this.LIZLLL.LIZ.LJIIJ && Math.abs(f) > Float.MAX_VALUE) {
                    throw C19988213Iq.LIZ(str2, LJJJJL().toString(), Float.valueOf(f));
                }
                return f;
            } catch (IllegalArgumentException e) {
                TryCatchGuardChecker.doCheck(e);
                LJJJJZ(c13gn, "float", str2);
                throw null;
            }
        }
        throw C19988213Iq.LJ("Expected " + C13LE.LIZ(C13GN.class).LJI() + ", but had " + C13LE.LIZ(abstractC19979113FdLJJJJJL.getClass()).LJI() + " as the serialized body of float at element: " + LJJJJLL(str2), abstractC19979113FdLJJJJJL.toString(), -1);
    }

    @Override // X.AbstractC19984513Hf
    public final int LJJIZ(String str) {
        Integer numValueOf;
        String str2 = str;
        AbstractC19979113Fd abstractC19979113FdLJJJJJL = LJJJJJL(str2);
        if (abstractC19979113FdLJJJJJL instanceof C13GN) {
            C13GN c13gn = (C13GN) abstractC19979113FdLJJJJJL;
            try {
                long jLIZIZ = C19988013Io.LIZIZ(c13gn);
                if (-2147483648L <= jLIZIZ && jLIZIZ <= 2147483647L && (numValueOf = Integer.valueOf((int) jLIZIZ)) != null) {
                    return numValueOf.intValue();
                }
                LJJJJZ(c13gn, "int", str2);
                throw null;
            } catch (IllegalArgumentException e) {
                TryCatchGuardChecker.doCheck(e);
                LJJJJZ(c13gn, "int", str2);
                throw null;
            }
        }
        throw C19988213Iq.LJ("Expected " + C13LE.LIZ(C13GN.class).LJI() + ", but had " + C13LE.LIZ(abstractC19979113FdLJJJJJL.getClass()).LJI() + " as the serialized body of int at element: " + LJJJJLL(str2), abstractC19979113FdLJJJJJL.toString(), -1);
    }

    @Override // X.AbstractC19984513Hf
    public final long LJJJ(String str) {
        String str2 = str;
        AbstractC19979113Fd abstractC19979113FdLJJJJJL = LJJJJJL(str2);
        if (abstractC19979113FdLJJJJJL instanceof C13GN) {
            C13GN c13gn = (C13GN) abstractC19979113FdLJJJJJL;
            try {
                return C19988013Io.LIZIZ(c13gn);
            } catch (IllegalArgumentException e) {
                TryCatchGuardChecker.doCheck(e);
                LJJJJZ(c13gn, "long", str2);
                throw null;
            }
        }
        throw C19988213Iq.LJ("Expected " + C13LE.LIZ(C13GN.class).LJI() + ", but had " + C13LE.LIZ(abstractC19979113FdLJJJJJL.getClass()).LJI() + " as the serialized body of long at element: " + LJJJJLL(str2), abstractC19979113FdLJJJJJL.toString(), -1);
    }

    @Override // X.AbstractC19984513Hf
    public final short LJJJI(String str) {
        Short shValueOf;
        String str2 = str;
        AbstractC19979113Fd abstractC19979113FdLJJJJJL = LJJJJJL(str2);
        if (abstractC19979113FdLJJJJJL instanceof C13GN) {
            C13GN c13gn = (C13GN) abstractC19979113FdLJJJJJL;
            try {
                long jLIZIZ = C19988013Io.LIZIZ(c13gn);
                if (-32768 <= jLIZIZ && jLIZIZ <= 32767 && (shValueOf = Short.valueOf((short) jLIZIZ)) != null) {
                    return shValueOf.shortValue();
                }
                LJJJJZ(c13gn, "short", str2);
                throw null;
            } catch (IllegalArgumentException e) {
                TryCatchGuardChecker.doCheck(e);
                LJJJJZ(c13gn, "short", str2);
                throw null;
            }
        }
        throw C19988213Iq.LJ("Expected " + C13LE.LIZ(C13GN.class).LJI() + ", but had " + C13LE.LIZ(abstractC19979113FdLJJJJJL.getClass()).LJI() + " as the serialized body of short at element: " + LJJJJLL(str2), abstractC19979113FdLJJJJJL.toString(), -1);
    }

    @Override // X.AbstractC19984513Hf
    public final String LJJJIL(String str) {
        String str2 = str;
        AbstractC19979113Fd abstractC19979113FdLJJJJJL = LJJJJJL(str2);
        if (abstractC19979113FdLJJJJJL instanceof C13GN) {
            C13GN c13gn = (C13GN) abstractC19979113FdLJJJJJL;
            if (c13gn instanceof C19981913Gf) {
                C19981913Gf c19981913Gf = (C19981913Gf) c13gn;
                if (!c19981913Gf.LL && !this.LIZLLL.LIZ.LIZJ) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("String literal for key '");
                    sbLIZ.append(str2);
                    sbLIZ.append("' should be quoted at element: ");
                    sbLIZ.append(LJJJJLL(str2));
                    sbLIZ.append(".\nUse 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.");
                    throw C19988213Iq.LJ(C2188811AlT.LIZIZ(sbLIZ), LJJJJL().toString(), -1);
                }
                return c19981913Gf.LLILLL;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Expected string value for a non-null key '");
            sbLIZ2.append(str2);
            sbLIZ2.append("', got null literal instead at element: ");
            sbLIZ2.append(LJJJJLL(str2));
            throw C19988213Iq.LJ(C2188811AlT.LIZIZ(sbLIZ2), LJJJJL().toString(), -1);
        }
        throw C19988213Iq.LJ("Expected " + C13LE.LIZ(C13GN.class).LJI() + ", but had " + C13LE.LIZ(abstractC19979113FdLJJJJJL.getClass()).LJI() + " as the serialized body of string at element: " + LJJJJLL(str2), abstractC19979113FdLJJJJJL.toString(), -1);
    }

    public final String LJJJJLL(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LJJJJJ());
        sbLIZ.append('.');
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC19984513Hf
    public final int LJJIJL(String str, InterfaceC19983313Gt interfaceC19983313Gt) {
        String str2 = str;
        AbstractC19987213Ig abstractC19987213Ig = this.LIZLLL;
        AbstractC19979113Fd abstractC19979113FdLJJJJJL = LJJJJJL(str2);
        String strLJI = interfaceC19983313Gt.LJI();
        if (abstractC19979113FdLJJJJJL instanceof C13GN) {
            return C19987613Ik.LIZJ(interfaceC19983313Gt, abstractC19987213Ig, ((C13GN) abstractC19979113FdLJJJJJL).LIZJ(), "");
        }
        throw C19988213Iq.LJ("Expected " + C13LE.LIZ(C13GN.class).LJI() + ", but had " + C13LE.LIZ(abstractC19979113FdLJJJJJL.getClass()).LJI() + " as the serialized body of " + strLJI + " at element: " + LJJJJLL(str2), abstractC19979113FdLJJJJJL.toString(), -1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // X.AbstractC19984513Hf
    public final C13HB LJJIL(String str, InterfaceC19983313Gt interfaceC19983313Gt) {
        AbstractC19987713Il c19989113Iz;
        String str2 = str;
        if (C13HF.LIZ(interfaceC19983313Gt)) {
            AbstractC19987213Ig abstractC19987213Ig = this.LIZLLL;
            AbstractC19979113Fd abstractC19979113FdLJJJJJL = LJJJJJL(str2);
            String strLJI = interfaceC19983313Gt.LJI();
            if (abstractC19979113FdLJJJJJL instanceof C13GN) {
                String strLIZJ = ((C13GN) abstractC19979113FdLJJJJJL).LIZJ();
                if (!abstractC19987213Ig.LIZ.LJIILJJIL) {
                    c19989113Iz = new C19987913In(strLIZJ);
                } else {
                    c19989113Iz = new C19989113Iz(strLIZJ);
                }
                return new C19970113Br(c19989113Iz, this.LIZLLL);
            }
            throw C19988213Iq.LJ("Expected " + C13LE.LIZ(C13GN.class).LJI() + ", but had " + C13LE.LIZ(abstractC19979113FdLJJJJJL.getClass()).LJI() + " as the serialized body of " + strLJI + " at element: " + LJJJJLL(str2), abstractC19979113FdLJJJJJL.toString(), -1);
        }
        this.LIZIZ.add((Tag) str2);
        return this;
    }

    public AbstractC19987313Ih(AbstractC19987213Ig abstractC19987213Ig, AbstractC19979113Fd abstractC19979113Fd, String str) {
        this.LIZLLL = abstractC19987213Ig;
        this.LJ = str;
        this.LJFF = abstractC19987213Ig.LIZ;
    }

    public final void LJJJJZ(C13GN c13gn, String str, String str2) {
        StringBuilder sbLIZ;
        String str3;
        if (u.LJJIIJZLJL(str, "i", false)) {
            sbLIZ = C2188811AlT.LIZ();
            str3 = "an ";
        } else {
            sbLIZ = C2188811AlT.LIZ();
            str3 = "a ";
        }
        sbLIZ.append(str3);
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Failed to parse literal '");
        sbLIZ2.append(c13gn);
        sbLIZ2.append("' as ");
        sbLIZ2.append(strLIZIZ);
        sbLIZ2.append(" value at element: ");
        sbLIZ2.append(LJJJJLL(str2));
        throw C19988213Iq.LJ(C2188811AlT.LIZIZ(sbLIZ2), LJJJJL().toString(), -1);
    }
}
