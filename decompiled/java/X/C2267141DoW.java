package X;

import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: X.1DoW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2267141DoW {
    public HashSet<C2267141DoW> LIZ;
    public int LIZIZ;
    public boolean LIZJ;
    public final C2267081DoQ LIZLLL;
    public final EnumC2266931DoB LJ;
    public C2267141DoW LJFF;
    public int LJI;
    public int LJII = Integer.MIN_VALUE;
    public C21537019Qi LJIIIIZZ;

    public final int LIZJ() {
        if (this.LIZJ) {
            return this.LIZIZ;
        }
        return 0;
    }

    public final int LIZLLL() {
        C2267141DoW c2267141DoW;
        if (this.LIZLLL.LJJL == 8) {
            return 0;
        }
        int i = this.LJII;
        return (i == Integer.MIN_VALUE || (c2267141DoW = this.LJFF) == null || c2267141DoW.LIZLLL.LJJL != 8) ? this.LJI : i;
    }

    public final boolean LJ() {
        C2267141DoW c2267141DoW;
        HashSet<C2267141DoW> hashSet = this.LIZ;
        if (hashSet == null) {
            return false;
        }
        for (C2267141DoW c2267141DoW2 : hashSet) {
            c2267141DoW2.getClass();
            switch (C2266941DoC.LIZ[c2267141DoW2.LJ.ordinal()]) {
                case 1:
                case 6:
                case 7:
                case 8:
                case BdTuring.TYPE_ECAF /* 9 */:
                    c2267141DoW = null;
                    break;
                case 2:
                    c2267141DoW = c2267141DoW2.LIZLLL.LJJIJIIJIL;
                    break;
                case 3:
                    c2267141DoW = c2267141DoW2.LIZLLL.LJJIJ;
                    break;
                case 4:
                    c2267141DoW = c2267141DoW2.LIZLLL.LJJIJIL;
                    break;
                case 5:
                    c2267141DoW = c2267141DoW2.LIZLLL.LJJIJIIJI;
                    break;
                default:
                    throw new AssertionError(c2267141DoW2.LJ.name());
            }
            if (c2267141DoW.LJFF()) {
                return true;
            }
        }
        return false;
    }

    public final boolean LJFF() {
        return this.LJFF != null;
    }

    public final void LJI() {
        HashSet<C2267141DoW> hashSet;
        C2267141DoW c2267141DoW = this.LJFF;
        if (c2267141DoW != null && (hashSet = c2267141DoW.LIZ) != null) {
            hashSet.remove(this);
            if (this.LJFF.LIZ.size() == 0) {
                this.LJFF.LIZ = null;
            }
        }
        this.LIZ = null;
        this.LJFF = null;
        this.LJI = 0;
        this.LJII = Integer.MIN_VALUE;
        this.LIZJ = false;
        this.LIZIZ = 0;
    }

    public final void LJII() {
        C21537019Qi c21537019Qi = this.LJIIIIZZ;
        if (c21537019Qi == null) {
            this.LJIIIIZZ = new C21537019Qi(EnumC21532319On.UNRESTRICTED);
        } else {
            c21537019Qi.LJI();
        }
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZLLL.LJJLI);
        sbLIZ.append(":");
        sbLIZ.append(this.LJ.toString());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LJIIIIZZ(int i) {
        this.LIZIZ = i;
        this.LIZJ = true;
    }

    public C2267141DoW(C2267081DoQ c2267081DoQ, EnumC2266931DoB enumC2266931DoB) {
        this.LIZLLL = c2267081DoQ;
        this.LJ = enumC2266931DoB;
    }

    public final void LIZIZ(int i, C2267161DoY c2267161DoY, ArrayList arrayList) {
        HashSet<C2267141DoW> hashSet = this.LIZ;
        if (hashSet != null) {
            Iterator<C2267141DoW> it2 = hashSet.iterator();
            while (it2.hasNext()) {
                C2267201Doc.LIZ(it2.next().LIZLLL, i, arrayList, c2267161DoY);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x006f A[PHI: r1
      0x006f: PHI (r1v4 boolean) = (r1v2 boolean), (r1v6 boolean) binds: [B:42:0x0064, B:25:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.C2267141DoW r5, int r6, int r7, boolean r8) {
        /*
            r4 = this;
            if (r5 != 0) goto L6
            r4.LJI()
            return
        L6:
            if (r8 != 0) goto L7e
            X.1DoB r2 = r5.LJ
            X.1DoB r3 = r4.LJ
            if (r2 != r3) goto L1f
            X.1DoB r0 = X.EnumC2266931DoB.BASELINE
            if (r3 != r0) goto L7e
            X.1DoQ r0 = r5.LIZLLL
            boolean r0 = r0.LJJIIZI
            if (r0 == 0) goto L1e
            X.1DoQ r0 = r4.LIZLLL
            boolean r0 = r0.LJJIIZI
            if (r0 != 0) goto L7e
        L1e:
            return
        L1f:
            int[] r1 = X.C2266941DoC.LIZ
            int r0 = r3.ordinal()
            r0 = r1[r0]
            switch(r0) {
                case 1: goto L72;
                case 2: goto L57;
                case 3: goto L57;
                case 4: goto L36;
                case 5: goto L36;
                case 6: goto L4e;
                case 7: goto L1e;
                case 8: goto L1e;
                case 9: goto L1e;
                default: goto L2a;
            }
        L2a:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            X.1DoB r0 = r4.LJ
            java.lang.String r0 = r0.name()
            r1.<init>(r0)
            throw r1
        L36:
            X.1DoB r0 = X.EnumC2266931DoB.TOP
            if (r2 == r0) goto L4c
            X.1DoB r0 = X.EnumC2266931DoB.BOTTOM
            if (r2 == r0) goto L4c
            r1 = 0
        L3f:
            X.1DoQ r0 = r5.LIZLLL
            boolean r0 = r0 instanceof X.C2267171DoZ
            if (r0 == 0) goto L6f
            if (r1 != 0) goto L7e
            X.1DoB r0 = X.EnumC2266931DoB.CENTER_Y
            if (r2 != r0) goto L1e
            goto L7e
        L4c:
            r1 = 1
            goto L3f
        L4e:
            X.1DoB r0 = X.EnumC2266931DoB.LEFT
            if (r2 == r0) goto L1e
            X.1DoB r0 = X.EnumC2266931DoB.RIGHT
            if (r2 != r0) goto L7e
            return
        L57:
            X.1DoB r0 = X.EnumC2266931DoB.LEFT
            if (r2 == r0) goto L6d
            X.1DoB r0 = X.EnumC2266931DoB.RIGHT
            if (r2 == r0) goto L6d
            r1 = 0
        L60:
            X.1DoQ r0 = r5.LIZLLL
            boolean r0 = r0 instanceof X.C2267171DoZ
            if (r0 == 0) goto L6f
            if (r1 != 0) goto L7e
            X.1DoB r0 = X.EnumC2266931DoB.CENTER_X
            if (r2 != r0) goto L1e
            goto L7e
        L6d:
            r1 = 1
            goto L60
        L6f:
            if (r1 != 0) goto L7e
            return
        L72:
            X.1DoB r0 = X.EnumC2266931DoB.BASELINE
            if (r2 == r0) goto L1e
            X.1DoB r0 = X.EnumC2266931DoB.CENTER_X
            if (r2 == r0) goto L1e
            X.1DoB r0 = X.EnumC2266931DoB.CENTER_Y
            if (r2 == r0) goto L1e
        L7e:
            r4.LJFF = r5
            java.util.HashSet<X.1DoW> r0 = r5.LIZ
            if (r0 != 0) goto L8b
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r5.LIZ = r0
        L8b:
            X.1DoW r0 = r4.LJFF
            java.util.HashSet<X.1DoW> r0 = r0.LIZ
            if (r0 == 0) goto L94
            r0.add(r4)
        L94:
            r4.LJI = r6
            r4.LJII = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2267141DoW.LIZ(X.1DoW, int, int, boolean):void");
    }
}
