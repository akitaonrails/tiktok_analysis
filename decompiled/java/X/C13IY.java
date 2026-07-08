package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13IY, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13IY extends AbstractC19984313Hd implements C13HH {
    public final C13IZ LIZ;
    public final AbstractC19987213Ig LIZIZ;
    public final EnumC19987013Ie LIZJ;
    public final C13HH[] LIZLLL;
    public final AbstractC19984913Hj LJ;
    public final C19988913Ix LJFF;
    public boolean LJI;
    public String LJII;
    public String LJIIIIZZ;

    @Override // X.InterfaceC19986513Hz
    public final void LIZLLL() {
        if (this.LIZJ.end != 0) {
            this.LIZ.LJIIJJI();
            this.LIZ.LIZJ();
            this.LIZ.LJ(this.LIZJ.end);
        }
    }

    @Override // X.InterfaceC19986513Hz
    public final boolean LJIJJ() {
        return this.LJFF.LIZ;
    }

    @Override // X.C13HD
    public final void LJJIIJZLJL() {
        this.LIZ.LJII("null");
    }

    @Override // X.C13HD
    public final AbstractC19984913Hj LIZ() {
        return this.LJ;
    }

    @Override // X.C13HD
    public final InterfaceC19986513Hz LIZIZ(InterfaceC19983313Gt interfaceC19983313Gt) {
        C13HH c13hh;
        EnumC19987013Ie enumC19987013IeLIZIZ = C13IX.LIZIZ(interfaceC19983313Gt, this.LIZIZ);
        char c = enumC19987013IeLIZIZ.begin;
        if (c != 0) {
            this.LIZ.LJ(c);
            this.LIZ.LIZ();
        }
        String str = this.LJII;
        if (str != null) {
            String strLJI = this.LJIIIIZZ;
            if (strLJI == null) {
                strLJI = interfaceC19983313Gt.LJI();
            }
            this.LIZ.LIZIZ();
            LJIIIIZZ(str);
            this.LIZ.LJ(':');
            this.LIZ.LJIIJ();
            LJIIIIZZ(strLJI);
            this.LJII = null;
            this.LJIIIIZZ = null;
        }
        if (this.LIZJ == enumC19987013IeLIZIZ) {
            return this;
        }
        C13HH[] c13hhArr = this.LIZLLL;
        if (c13hhArr != null && (c13hh = c13hhArr[enumC19987013IeLIZIZ.ordinal()]) != null) {
            return c13hh;
        }
        return new C13IY(this.LIZ, this.LIZIZ, enumC19987013IeLIZIZ, this.LIZLLL);
    }

    @Override // X.AbstractC19984313Hd, X.C13HD
    public final C13HD LIZJ(InterfaceC19983313Gt interfaceC19983313Gt) {
        if (C13HF.LIZ(interfaceC19983313Gt)) {
            C13IZ c13iz = this.LIZ;
            if (!(c13iz instanceof C19986613Ia)) {
                final C13JF c13jf = c13iz.LIZ;
                final boolean z = this.LJI;
                c13iz = new C13IZ(c13jf, z) { // from class: X.13Ia
                    public final boolean LIZJ;

                    @Override // X.C13IZ
                    public final void LIZLLL(byte b) {
                        boolean z2 = this.LIZJ;
                        String strLIZJ = C19969613Bm.LIZJ(b);
                        if (z2) {
                            LJIIIZ(strLIZJ);
                        } else {
                            LJII(strLIZJ);
                        }
                    }

                    @Override // X.C13IZ
                    public final void LJFF(int i) {
                        if (this.LIZJ) {
                            LJIIIZ(Long.toString(4294967295L & ((long) i), 10));
                        } else {
                            LJII(Long.toString(4294967295L & ((long) i), 10));
                        }
                    }

                    @Override // X.C13IZ
                    public final void LJI(long j) {
                        boolean z2 = this.LIZJ;
                        int i = 63;
                        String str = CardStruct.IStatusCode.DEFAULT;
                        if (z2) {
                            if (j != 0) {
                                if (j > 0) {
                                    str = Long.toString(j, 10);
                                } else {
                                    char[] cArr = new char[64];
                                    long j2 = (j >>> 1) / ((long) 5);
                                    long j3 = 10;
                                    cArr[63] = Character.forDigit((int) (j - (j2 * j3)), 10);
                                    while (j2 > 0) {
                                        i--;
                                        cArr[i] = Character.forDigit((int) (j2 % j3), 10);
                                        j2 /= j3;
                                    }
                                    str = new String(cArr, i, 64 - i);
                                }
                            }
                            LJIIIZ(str);
                            return;
                        }
                        if (j != 0) {
                            if (j > 0) {
                                str = Long.toString(j, 10);
                            } else {
                                char[] cArr2 = new char[64];
                                long j4 = (j >>> 1) / ((long) 5);
                                long j5 = 10;
                                cArr2[63] = Character.forDigit((int) (j - (j4 * j5)), 10);
                                while (j4 > 0) {
                                    i--;
                                    cArr2[i] = Character.forDigit((int) (j4 % j5), 10);
                                    j4 /= j5;
                                }
                                str = new String(cArr2, i, 64 - i);
                            }
                        }
                        LJII(str);
                    }

                    @Override // X.C13IZ
                    public final void LJIIIIZZ(short s) {
                        boolean z2 = this.LIZJ;
                        String strLIZJ = C1507270pKH.LIZJ(s);
                        if (z2) {
                            LJIIIZ(strLIZJ);
                        } else {
                            LJII(strLIZJ);
                        }
                    }

                    {
                        this.LIZJ = z;
                    }
                };
            }
            return new C13IY(c13iz, this.LIZIZ, this.LIZJ, null);
        }
        if (interfaceC19983313Gt.isInline() && Intrinsics.LJFF(interfaceC19983313Gt, C19988013Io.LIZ)) {
            C13IZ c13iz2 = this.LIZ;
            if (!(c13iz2 instanceof C13JD)) {
                final C13JF c13jf2 = c13iz2.LIZ;
                final boolean z2 = this.LJI;
                c13iz2 = new C13IZ(c13jf2, z2) { // from class: X.13JD
                    public final boolean LIZJ;

                    @Override // X.C13IZ
                    public final void LJIIIZ(String str) {
                        if (this.LIZJ) {
                            super.LJIIIZ(str);
                        } else {
                            LJII(str);
                        }
                    }

                    {
                        this.LIZJ = z2;
                    }
                };
            }
            return new C13IY(c13iz2, this.LIZIZ, this.LIZJ, null);
        }
        if (this.LJII != null) {
            this.LJIIIIZZ = interfaceC19983313Gt.LJI();
        }
        return this;
    }

    @Override // X.AbstractC19984313Hd, X.C13HD
    public final void LJI(short s) {
        if (this.LJI) {
            LJIIIIZZ(String.valueOf((int) s));
        } else {
            this.LIZ.LJIIIIZZ(s);
        }
    }

    @Override // X.AbstractC19984313Hd, X.C13HD
    public final void LJII(boolean z) {
        if (this.LJI) {
            LJIIIIZZ(String.valueOf(z));
        } else {
            this.LIZ.LIZ.LIZIZ(String.valueOf(z));
        }
    }

    @Override // X.AbstractC19984313Hd, X.C13HD
    public final void LJIIIIZZ(String str) {
        this.LIZ.LJIIIZ(str);
    }

    @Override // X.AbstractC19984313Hd, X.C13HD
    public final void LJIIL(int i) {
        if (this.LJI) {
            LJIIIIZZ(String.valueOf(i));
        } else {
            this.LIZ.LJFF(i);
        }
    }

    @Override // X.AbstractC19984313Hd, X.C13HD
    public final void LJIILL(long j) {
        if (this.LJI) {
            LJIIIIZZ(String.valueOf(j));
        } else {
            this.LIZ.LJI(j);
        }
    }

    @Override // X.AbstractC19984313Hd, X.C13HD
    public final void LJIJ(char c) {
        LJIIIIZZ(String.valueOf(c));
    }

    @Override // X.AbstractC19984313Hd, X.C13HD
    public final void LJIJJLI(byte b) {
        if (this.LJI) {
            LJIIIIZZ(String.valueOf((int) b));
        } else {
            this.LIZ.LIZLLL(b);
        }
    }

    @Override // X.AbstractC19984313Hd, X.C13HD
    public final void LJJ(float f) {
        if (this.LJI) {
            LJIIIIZZ(String.valueOf(f));
        } else {
            this.LIZ.LIZ.LIZIZ(String.valueOf(f));
        }
        if (!this.LJFF.LJIIJ && Math.abs(f) > Float.MAX_VALUE) {
            throw C19988213Iq.LIZIZ(Float.valueOf(f), this.LIZ.LIZ.toString());
        }
    }

    @Override // X.AbstractC19984313Hd, X.C13HD
    public final void LJJIFFI(double d) {
        if (this.LJI) {
            LJIIIIZZ(String.valueOf(d));
        } else {
            this.LIZ.LIZ.LIZIZ(String.valueOf(d));
        }
        if (!this.LJFF.LJIIJ && Math.abs(d) > Double.MAX_VALUE) {
            throw C19988213Iq.LIZIZ(Double.valueOf(d), this.LIZ.LIZ.toString());
        }
    }

    @Override // X.C13HD
    public final void LJIILJJIL(InterfaceC19983313Gt interfaceC19983313Gt, int i) {
        LJIIIIZZ(interfaceC19983313Gt.LIZJ(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC19984313Hd, X.C13HD
    public final <T> void LJJI(InterfaceC19984413He<? super T> interfaceC19984413He, T t) {
        String strLIZ;
        C19988913Ix c19988913Ix = this.LIZIZ.LIZ;
        if (c19988913Ix.LJIIIIZZ) {
            interfaceC19984413He.serialize(this, t);
            return;
        }
        boolean z = interfaceC19984413He instanceof AbstractC19984813Hi;
        boolean z2 = true;
        if (z) {
            if (c19988913Ix.LJIILL == EnumC1779370wP9.NONE) {
                z2 = false;
            }
        } else {
            int i = C1779380wPA.LIZ[c19988913Ix.LJIILL.ordinal()];
            if (i != 1 && i != 2) {
                if (i == 3) {
                    C13GW c13gwLIZIZ = interfaceC19984413He.getDescriptor().LIZIZ();
                    if (Intrinsics.LJFF(c13gwLIZIZ, C19982513Gl.LIZ) || Intrinsics.LJFF(c13gwLIZIZ, C19982813Go.LIZ)) {
                    }
                } else {
                    throw new C1954807lC();
                }
            }
            interfaceC19984413He.serialize(this, t);
        }
        if (z2) {
            strLIZ = C19986713Ib.LIZ(interfaceC19984413He.getDescriptor(), this.LIZIZ);
        } else {
            strLIZ = null;
        }
        if (z) {
            AbstractC19984813Hi abstractC19984813Hi = (AbstractC19984813Hi) interfaceC19984413He;
            if (t != 0) {
                InterfaceC19984413He<? super T> interfaceC19984413HeLIZIZ = C19984713Hh.LIZIZ(abstractC19984813Hi, this, t);
                if (strLIZ != null) {
                    if ((interfaceC19984413He instanceof C19984613Hg) && C13GE.LIZ(interfaceC19984413HeLIZIZ.getDescriptor()).contains(strLIZ)) {
                        interfaceC19984413He.getClass();
                        throw null;
                    }
                    C13GW c13gwLIZIZ2 = interfaceC19984413HeLIZIZ.getDescriptor().LIZIZ();
                    if (!(c13gwLIZIZ2 instanceof C13GS)) {
                        if (!(c13gwLIZIZ2 instanceof C13HJ)) {
                            if (c13gwLIZIZ2 instanceof C13GL) {
                                "Actual serializer for polymorphic cannot be polymorphic itself".toString();
                                throw new IllegalStateException("Actual serializer for polymorphic cannot be polymorphic itself");
                            }
                        } else {
                            "Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead".toString();
                            throw new IllegalStateException("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
                        }
                    } else {
                        "Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead".toString();
                        throw new IllegalStateException("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
                    }
                }
                interfaceC19984413He = interfaceC19984413HeLIZIZ;
            } else {
                String str = "Value for serializer " + abstractC19984813Hi.getDescriptor() + " should always be non-null. Please report issue to the kotlinx.serialization tracker.";
                str.toString();
                throw new IllegalArgumentException(str);
            }
        }
        if (strLIZ != null) {
            String strLJI = interfaceC19984413He.getDescriptor().LJI();
            this.LJII = strLIZ;
            this.LJIIIIZZ = strLJI;
        }
        interfaceC19984413He.serialize(this, t);
    }

    @Override // X.AbstractC19984313Hd
    public final void LJJIIZI(InterfaceC19983313Gt interfaceC19983313Gt, int i) {
        int i2 = C19986813Ic.LIZ[this.LIZJ.ordinal()];
        boolean z = true;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    C13IZ c13iz = this.LIZ;
                    if (!c13iz.LIZIZ) {
                        c13iz.LJ(',');
                    }
                    this.LIZ.LIZIZ();
                    C19987613Ik.LJ(interfaceC19983313Gt, this.LIZIZ);
                    LJIIIIZZ(interfaceC19983313Gt.LIZJ(i));
                    this.LIZ.LJ(':');
                    this.LIZ.LJIIJ();
                    return;
                }
                if (i == 0) {
                    this.LJI = true;
                    return;
                } else {
                    if (i != 1) {
                        return;
                    }
                    this.LIZ.LJ(',');
                    this.LIZ.LJIIJ();
                    this.LJI = false;
                    return;
                }
            }
            C13IZ c13iz2 = this.LIZ;
            if (!c13iz2.LIZIZ) {
                if (i % 2 == 0) {
                    c13iz2.LJ(',');
                    this.LIZ.LIZIZ();
                } else {
                    c13iz2.LJ(':');
                    this.LIZ.LJIIJ();
                    z = false;
                }
                this.LJI = z;
                return;
            }
            this.LJI = true;
            c13iz2.LIZIZ();
            return;
        }
        C13IZ c13iz3 = this.LIZ;
        if (!c13iz3.LIZIZ) {
            c13iz3.LJ(',');
        }
        this.LIZ.LIZIZ();
    }

    public C13IY(C13IZ c13iz, AbstractC19987213Ig abstractC19987213Ig, EnumC19987013Ie enumC19987013Ie, C13HH[] c13hhArr) {
        this.LIZ = c13iz;
        this.LIZIZ = abstractC19987213Ig;
        this.LIZJ = enumC19987013Ie;
        this.LIZLLL = c13hhArr;
        this.LJ = abstractC19987213Ig.LIZIZ;
        this.LJFF = abstractC19987213Ig.LIZ;
        int iOrdinal = enumC19987013Ie.ordinal();
        if (c13hhArr != null) {
            C13HH c13hh = c13hhArr[iOrdinal];
            c13hhArr[iOrdinal] = this;
        }
    }

    @Override // X.AbstractC19984313Hd, X.InterfaceC19986513Hz
    public final <T> void LJIIZILJ(InterfaceC19983313Gt interfaceC19983313Gt, int i, InterfaceC19984413He<? super T> interfaceC19984413He, T t) {
        if (t != null || this.LJFF.LJFF) {
            super.LJIIZILJ(interfaceC19983313Gt, i, interfaceC19984413He, t);
        }
    }
}
