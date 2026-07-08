package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;

/* JADX INFO: renamed from: X.0sli, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1639600sli implements InterfaceC1639450slT {
    public final InterfaceC1639550sld LIZ;
    public InterfaceC1639610slj LIZIZ;

    @Override // X.InterfaceC1639550sld
    public final String LIZIZ() {
        return this.LIZ.LIZIZ();
    }

    public C1639600sli(C1639500slY c1639500slY) {
        this.LIZ = c1639500slY;
    }

    @Override // X.InterfaceC1639550sld
    public final String LIZ(String str) {
        return this.LIZ.LIZ(str);
    }

    @Override // X.InterfaceC1639550sld
    public final String LIZJ(String str) {
        return this.LIZ.LIZJ(str);
    }

    @Override // X.InterfaceC1639450slT
    public final void LIZLLL(InterfaceC1639610slj interfaceC1639610slj) {
        this.LIZIZ = interfaceC1639610slj;
    }

    @Override // X.InterfaceC1639450slT
    public boolean LJ(C1639670slp c1639670slp) {
        return LJIIIIZZ(c1639670slp.LIZ);
    }

    @Override // X.InterfaceC1639550sld
    public final String LJFF(String str) {
        return this.LIZ.LJFF(str);
    }

    @Override // X.InterfaceC1639450slT
    public final boolean LJI(String str) {
        if (LJIIIIZZ(str)) {
            return true;
        }
        String strLIZJ = LIZJ(str);
        C0VSJ c0vsj = new C0VSJ(strLIZJ);
        C0VSJ c0vsj2 = new C0VSJ(LJFF(str), LIZ(str));
        try {
            try {
                C2286708xd.LJIIIIZZ(strLIZJ, false);
                C2286708xd.LJIILLIIL(c0vsj);
                C08SA.LIZJ(c0vsj2, c0vsj);
                InterfaceC1639610slj interfaceC1639610slj = this.LIZIZ;
                if (interfaceC1639610slj != null) {
                    interfaceC1639610slj.LIZ();
                }
                c0vsj2.delete();
                return true;
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
                InterfaceC1639610slj interfaceC1639610slj2 = this.LIZIZ;
                if (interfaceC1639610slj2 != null) {
                    interfaceC1639610slj2.LIZIZ(str, c0vsj2, e);
                }
                c0vsj2.delete();
                return false;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c0vsj2.delete();
            throw th;
        }
    }

    @Override // X.InterfaceC1639450slT
    public final C1639400slO LJII(String str) {
        String strLIZJ = LIZJ(str);
        return new C1639400slO(C365201bO.LIZ(strLIZJ), strLIZJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean LJIIIIZZ(java.lang.String r11) {
        /*
            r10 = this;
            X.0VSJ r1 = new X.0VSJ
            java.lang.String r0 = r10.LIZJ(r11)
            r1.<init>(r0)
            boolean r0 = r1.exists()
            r5 = 0
            if (r0 == 0) goto La4
            boolean r0 = r1.isDirectory()
            if (r0 == 0) goto La4
            java.io.File[] r4 = r1.listFiles()
            if (r4 != 0) goto L1d
            return r5
        L1d:
            int r3 = r4.length
            r9 = 0
        L1f:
            if (r5 >= r3) goto La3
            r8 = r4[r5]
            boolean r0 = r8.isDirectory()
            if (r0 == 0) goto L9f
            java.lang.String r7 = r8.getName()
            X.0VSJ r2 = new X.0VSJ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = r8.getAbsolutePath()
            r1.append(r0)
            java.lang.String r6 = java.io.File.separator
            r1.append(r6)
            r1.append(r7)
            java.lang.String r0 = ".png"
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.<init>(r0)
            boolean r0 = r2.exists()
            if (r0 != 0) goto L9e
            X.0VSJ r2 = new X.0VSJ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = r8.getAbsolutePath()
            r1.append(r0)
            r1.append(r6)
            r1.append(r7)
            java.lang.String r0 = ".jpg"
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.<init>(r0)
            boolean r0 = r2.exists()
            if (r0 != 0) goto L9e
            X.0VSJ r2 = new X.0VSJ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = r8.getAbsolutePath()
            r1.append(r0)
            r1.append(r6)
            r1.append(r7)
            java.lang.String r0 = ".JPG"
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.<init>(r0)
            boolean r0 = r2.exists()
            if (r0 == 0) goto L9f
        L9e:
            r9 = 1
        L9f:
            int r5 = r5 + 1
            goto L1f
        La3:
            return r9
        La4:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1639600sli.LJIIIIZZ(java.lang.String):boolean");
    }
}
