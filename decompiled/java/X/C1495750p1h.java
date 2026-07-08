package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import javax.net.ssl.SSLSocket;
import xlp.c;

/* JADX INFO: renamed from: X.0p1h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1495750p1h {
    public static final C1495750p1h LJ;
    public static final C1495750p1h LJFF;
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final String[] LIZJ;
    public final String[] LIZLLL;

    static {
        C1495760p1i c1495760p1i = C1495760p1i.LJIILLIIL;
        C1495760p1i c1495760p1i2 = C1495760p1i.LJIIZILJ;
        C1495760p1i c1495760p1i3 = C1495760p1i.LJIJ;
        C1495760p1i c1495760p1i4 = C1495760p1i.LJIJI;
        C1495760p1i c1495760p1i5 = C1495760p1i.LJIJJ;
        C1495760p1i c1495760p1i6 = C1495760p1i.LJIIJ;
        C1495760p1i c1495760p1i7 = C1495760p1i.LJIIL;
        C1495760p1i c1495760p1i8 = C1495760p1i.LJIIJJI;
        C1495760p1i c1495760p1i9 = C1495760p1i.LJIILIIL;
        C1495760p1i c1495760p1i10 = C1495760p1i.LJIILL;
        C1495760p1i c1495760p1i11 = C1495760p1i.LJIILJJIL;
        C1495760p1i[] c1495760p1iArr = {c1495760p1i, c1495760p1i2, c1495760p1i3, c1495760p1i4, c1495760p1i5, c1495760p1i6, c1495760p1i7, c1495760p1i8, c1495760p1i9, c1495760p1i10, c1495760p1i11};
        C1495760p1i[] c1495760p1iArr2 = {c1495760p1i, c1495760p1i2, c1495760p1i3, c1495760p1i4, c1495760p1i5, c1495760p1i6, c1495760p1i7, c1495760p1i8, c1495760p1i9, c1495760p1i10, c1495760p1i11, C1495760p1i.LJIIIIZZ, C1495760p1i.LJIIIZ, C1495760p1i.LJI, C1495760p1i.LJII, C1495760p1i.LJ, C1495760p1i.LJFF, C1495760p1i.LIZLLL};
        C1495770p1j c1495770p1j = new C1495770p1j(true);
        c1495770p1j.LIZIZ(c1495760p1iArr);
        EnumC1495780p1k enumC1495780p1k = EnumC1495780p1k.TLS_1_3;
        EnumC1495780p1k enumC1495780p1k2 = EnumC1495780p1k.TLS_1_2;
        c1495770p1j.LIZLLL(enumC1495780p1k, enumC1495780p1k2);
        c1495770p1j.LIZLLL = true;
        new C1495750p1h(c1495770p1j);
        EnumC1495780p1k enumC1495780p1k3 = EnumC1495780p1k.TLS_1_0;
        EnumC1495780p1k[] enumC1495780p1kArr = {enumC1495780p1k, enumC1495780p1k2, EnumC1495780p1k.TLS_1_1, enumC1495780p1k3};
        EnumC1495780p1k[] enumC1495780p1kArr2 = {enumC1495780p1k, enumC1495780p1k2};
        C1495770p1j c1495770p1j2 = new C1495770p1j(true);
        c1495770p1j2.LIZIZ(c1495760p1iArr2);
        if (!C1490230osn.LIZIZ().LJIIJJI.get()) {
            enumC1495780p1kArr = enumC1495780p1kArr2;
        }
        c1495770p1j2.LIZLLL(enumC1495780p1kArr);
        c1495770p1j2.LIZLLL = true;
        LJ = new C1495750p1h(c1495770p1j2);
        C1495770p1j c1495770p1j3 = new C1495770p1j(true);
        c1495770p1j3.LIZIZ(c1495760p1iArr2);
        c1495770p1j3.LIZLLL(enumC1495780p1k3);
        c1495770p1j3.LIZLLL = true;
        new C1495750p1h(c1495770p1j3);
        LJFF = new C1495750p1h(new C1495770p1j(false));
    }

    public final int hashCode() {
        if (this.LIZ) {
            return ((((527 + Arrays.hashCode(this.LIZJ)) * 31) + Arrays.hashCode(this.LIZLLL)) * 31) + (!this.LIZIZ ? 1 : 0);
        }
        return 17;
    }

    public final String toString() {
        String string;
        if (!this.LIZ) {
            return "ConnectionSpec()";
        }
        String[] strArr = this.LIZJ;
        String string2 = "[all enabled]";
        if (strArr != null) {
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                arrayList.add(C1495760p1i.LIZ(str));
            }
            string = Collections.unmodifiableList(arrayList).toString();
        } else {
            string = "[all enabled]";
        }
        String[] strArr2 = this.LIZLLL;
        if (strArr2 != null) {
            ArrayList arrayList2 = new ArrayList(strArr2.length);
            for (String str2 : strArr2) {
                arrayList2.add(EnumC1495780p1k.forJavaName(str2));
            }
            string2 = Collections.unmodifiableList(arrayList2).toString();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ConnectionSpec(cipherSuites=");
        sbLIZ.append(string);
        sbLIZ.append(", tlsVersions=");
        sbLIZ.append(string2);
        sbLIZ.append(", supportsTlsExtensions=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(")");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1495750p1h(C1495770p1j c1495770p1j) {
        this.LIZ = c1495770p1j.LIZ;
        this.LIZJ = c1495770p1j.LIZIZ;
        this.LIZLLL = c1495770p1j.LIZJ;
        this.LIZIZ = c1495770p1j.LIZLLL;
    }

    public final boolean LIZ(SSLSocket sSLSocket) {
        if (!this.LIZ) {
            return false;
        }
        String[] strArr = this.LIZLLL;
        if (strArr != null && !c.LJIIZILJ(c.LJIILJJIL, strArr, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        String[] strArr2 = this.LIZJ;
        if (strArr2 != null && !c.LJIIZILJ(C1495760p1i.LIZIZ, strArr2, sSLSocket.getEnabledCipherSuites())) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1495750p1h)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C1495750p1h c1495750p1h = (C1495750p1h) obj;
        boolean z = this.LIZ;
        if (z != c1495750p1h.LIZ) {
            return false;
        }
        if (z && (!Arrays.equals(this.LIZJ, c1495750p1h.LIZJ) || !Arrays.equals(this.LIZLLL, c1495750p1h.LIZLLL) || this.LIZIZ != c1495750p1h.LIZIZ)) {
            return false;
        }
        return true;
    }
}
