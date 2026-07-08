package X;

import kotlin.Unit;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tqp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1681210tqp<T> extends AbstractC20074613ge {
    public C594920NVa<T> LLJJJJLIIL;
    public EnumC1684030tvN LLJJL;
    public Boolean LLJJLIIIJLLLLLLLZ;
    public InterfaceC1681290tqx LLJL;
    public Boolean LLJLIL;
    public InterfaceC633750OtR LLJLILLLLZIIL;
    public InterfaceC633750OtR LLJLL;
    public InterfaceC1690500u5o LLJLLIL;

    @Override // X.AbstractC20074613ge
    public final void LLJJJJ(long j) {
    }

    @Override // X.AbstractC20055413dY
    public final void LLILZIL() {
        LLJLILLLLZIIL(this.LLJLILLLLZIIL);
    }

    @Override // X.AbstractC20074613ge
    public final boolean LLJJJJLIIL() {
        Boolean bool = this.LLJLIL;
        return bool != null ? bool.booleanValue() : ((C13FE) this.LLJJJJLIIL.LJIIJJI).getValue() != null;
    }

    public final boolean LLJLIL() {
        Boolean bool = this.LLJJLIIIJLLLLLLLZ;
        return bool == null ? C20052513d5.LJFF(this).LLJJL == EnumC1671200tag.Rtl && this.LLJJL == EnumC1684030tvN.Horizontal : bool.booleanValue();
    }

    @Override // X.AbstractC20074613ge, X.AbstractC20055413dY
    public final void LLILZLL() {
        LLIIIILZ();
        if (this.LLJILLL) {
            InterfaceC1690500u5o interfaceC1690500u5o = C20052513d5.LJFF(this).LLJJJJLIIL;
            InterfaceC1690500u5o interfaceC1690500u5o2 = this.LLJLLIL;
            if (interfaceC1690500u5o2 == null || !Intrinsics.LJFF(interfaceC1690500u5o2, interfaceC1690500u5o)) {
                this.LLJLLIL = interfaceC1690500u5o;
                LLJLILLLLZIIL(this.LLJLILLLLZIIL);
            }
        }
    }

    @Override // X.AbstractC20074613ge
    public final void LLJJJJJIL(long j) {
        if (!this.LLJILLL) {
            return;
        }
        C23250099c.LIZLLL(LLILLIZIL(), null, null, new C1681240tqs(this, j, null), 3);
    }

    public final void LLJLILLLLZIIL(InterfaceC633750OtR interfaceC633750OtR) {
        if (interfaceC633750OtR == null) {
            C1677050tk7 c1677050tk7 = C1678010tlf.LIZ;
            final AFwS266S0000000_25 aFwS266S0000000_25 = C1678010tlf.LIZIZ;
            InterfaceC1690500u5o interfaceC1690500u5o = C20052513d5.LJFF(this).LLJJJJLIIL;
            this.LLJLLIL = interfaceC1690500u5o;
            final C594920NVa<T> c594920NVa = this.LLJJJJLIIL;
            C1677900tlU c1677900tlU = C1677950tlZ.LIZJ;
            final AwS569S0100000_25 awS569S0100000_25 = new AwS569S0100000_25(interfaceC1690500u5o, 845);
            interfaceC633750OtR = new C20091513jN(new InterfaceC20092113jT() { // from class: X.0tle
                @Override // X.InterfaceC20092113jT
                public final float LIZ(float f, float f2) {
                    return 0.0f;
                }

                @Override // X.InterfaceC20092113jT
                public final float LIZIZ(float f) {
                    float fLJII = c594920NVa.LJII();
                    return c594920NVa.LIZIZ().LIZLLL(C1677950tlZ.LIZJ(c594920NVa.LIZIZ(), fLJII, f, aFwS266S0000000_25, awS569S0100000_25)) - fLJII;
                }
            }, c1677900tlU, c1677050tk7);
        }
        this.LLJLL = interfaceC633750OtR;
    }

    public static final long LLJL(C1681210tqp c1681210tqp, float f) {
        float f2;
        EnumC1684030tvN enumC1684030tvN = c1681210tqp.LLJJL;
        if (enumC1684030tvN == EnumC1684030tvN.Horizontal) {
            f2 = f;
        } else {
            f2 = 0.0f;
        }
        if (enumC1684030tvN != EnumC1684030tvN.Vertical) {
            f = 0.0f;
        }
        return (((long) Float.floatToRawIntBits(f)) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32);
    }

    @Override // X.AbstractC20074613ge
    public final Object LLJJJIL(C1394205cy c1394205cy, C1394305cz c1394305cz) {
        C594920NVa<T> c594920NVa = this.LLJJJJLIIL;
        C595200NWc c595200NWc = new C595200NWc(c1394205cy, this, null);
        EnumC1384205bM enumC1384205bM = EnumC1384205bM.Default;
        C594890NUx c594890NUx = c594920NVa.LJFF;
        C0NVV c0nvv = new C0NVV(c594920NVa, null, c595200NWc);
        c594890NUx.getClass();
        Object objLJ = C2296808zG.LJ(new C594880NUw(enumC1384205bM, c594890NUx, c0nvv, null), c1394305cz);
        if (objLJ != C099R.LJFF()) {
            objLJ = Unit.LIZ;
        }
        if (objLJ == C099R.LJFF()) {
            return objLJ;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LLJJLIIIJLLLLLLLZ(X.C1681210tqp r9, float r10, X.InterfaceC1364105Vn r11) {
        /*
            r9.getClass()
            boolean r0 = r11 instanceof X.C1681230tqr
            if (r0 == 0) goto L7a
            r8 = r11
            X.0tqr r8 = (X.C1681230tqr) r8
            int r2 = r8.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7a
            int r2 = r2 - r1
            r8.LLILZ = r2
        L15:
            java.lang.Object r3 = r8.LLILLJJLI
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r8.LLILZ
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L31
            if (r0 == r1) goto L88
            if (r0 != r2) goto L80
            X.03Hg r6 = r8.LL
            X.C155000ia.LIZIZ(r3)
        L2a:
            float r0 = r6.element
            java.lang.Float r7 = X.C2286608xc.LIZLLL(r0)
            return r7
        L31:
            X.C155000ia.LIZIZ(r3)
            X.0NVa<T> r0 = r9.LLJJJJLIIL
            boolean r0 = r0.LJFF()
            if (r0 == 0) goto L47
            X.0NVa<T> r0 = r9.LLJJJJLIIL
            r8.LLILZ = r1
            java.lang.Object r3 = r0.LJIIIZ(r10, r8)
            if (r3 != r7) goto L8b
            return r7
        L47:
            X.03Hg r6 = new X.03Hg
            r6.<init>()
            r6.element = r10
            X.0NVa<T> r5 = r9.LLJJJJLIIL
            X.0OtS r0 = new X.0OtS
            r4 = 0
            r0.<init>(r9, r6, r10, r4)
            r8.LL = r6
            r8.LLILZ = r2
            X.05bM r3 = X.EnumC1384205bM.Default
            X.0NUx r2 = r5.LJFF
            X.0NVV r1 = new X.0NVV
            r1.<init>(r5, r4, r0)
            r2.getClass()
            X.0NUw r0 = new X.0NUw
            r0.<init>(r3, r2, r1, r4)
            java.lang.Object r1 = X.C2296808zG.LJ(r0, r8)
            java.lang.Object r0 = X.C099R.LJFF()
            if (r1 == r0) goto L77
            kotlin.Unit r1 = kotlin.Unit.LIZ
        L77:
            if (r1 != r7) goto L2a
            return r7
        L7a:
            X.0tqr r8 = new X.0tqr
            r8.<init>(r9, r11)
            goto L15
        L80:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L88:
            X.C155000ia.LIZIZ(r3)
        L8b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1681210tqp.LLJJLIIIJLLLLLLLZ(X.0tqp, float, X.05Vn):java.lang.Object");
    }

    public C1681210tqp(InterfaceC1681290tqx interfaceC1681290tqx, C594920NVa c594920NVa, InterfaceC633750OtR interfaceC633750OtR, EnumC1684030tvN enumC1684030tvN, InterfaceC595010NVj interfaceC595010NVj, Boolean bool, Boolean bool2, boolean z) {
        super(C1677950tlZ.LIZ, z, interfaceC595010NVj, enumC1684030tvN);
        this.LLJJJJLIIL = c594920NVa;
        this.LLJJL = enumC1684030tvN;
        this.LLJJLIIIJLLLLLLLZ = bool;
        this.LLJL = interfaceC1681290tqx;
        this.LLJLIL = bool2;
        this.LLJLILLLLZIIL = interfaceC633750OtR;
    }
}
