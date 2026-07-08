package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13Ky, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19994213Ky<Key, Scope> {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZJ(X.C19991913Kb<java.lang.Object, java.lang.Object> r15, Scope r16) {
        /*
            long[] r10 = r15.LIZ
            int r0 = r10.length
            int r9 = r0 + (-2)
            if (r9 < 0) goto L56
            r8 = 0
        L8:
            r2 = r10[r8]
            long r0 = ~r2
            r4 = 7
            long r0 = r0 << r4
            long r0 = r0 & r2
            r5 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r0 = r0 & r5
            int r4 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r4 == 0) goto L51
            int r0 = r8 - r9
            int r0 = ~r0
            int r0 = r0 >>> 31
            r7 = 8
            int r6 = 8 - r0
            r5 = 0
        L22:
            if (r5 >= r6) goto L4f
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r2
            r11 = 128(0x80, double:6.3E-322)
            int r0 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r0 >= 0) goto L48
            int r4 = r8 << 3
            int r4 = r4 + r5
            java.lang.Object[] r0 = r15.LIZJ
            r1 = r0[r4]
            boolean r0 = r1 instanceof X.C19994113Kx
            r11 = r16
            if (r0 == 0) goto L4c
            X.13Kx r1 = (X.C19994113Kx) r1
            r1.LJIIJJI(r11)
            boolean r0 = r1.LIZIZ()
            if (r0 == 0) goto L48
        L45:
            r15.LJIIJ(r4)
        L48:
            long r2 = r2 >> r7
            int r5 = r5 + 1
            goto L22
        L4c:
            if (r1 != r11) goto L48
            goto L45
        L4f:
            if (r6 != r7) goto L56
        L51:
            if (r8 == r9) goto L56
            int r8 = r8 + 1
            goto L8
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19994213Ky.LIZJ(X.13Kb, java.lang.Object):void");
    }

    public static final void LIZ(C19991913Kb<Object, Object> c19991913Kb, Key key, Scope scope) {
        int iLJII = c19991913Kb.LJII(key);
        if (iLJII >= 0) {
            Object obj = c19991913Kb.LIZJ[iLJII];
            if (obj != null) {
                if (obj instanceof C19994113Kx) {
                    ((C19994113Kx) obj).LIZLLL(scope);
                } else if (obj != scope) {
                    C19994113Kx c19994113Kx = new C19994113Kx(6);
                    c19994113Kx.LIZLLL(obj);
                    c19994113Kx.LIZLLL(scope);
                    scope = (Scope) c19994113Kx;
                }
                scope = (Scope) obj;
            }
            if (0 == 0) {
                c19991913Kb.LIZJ[iLJII] = scope;
                return;
            }
        }
        int i = ~iLJII;
        c19991913Kb.LIZIZ[i] = key;
        c19991913Kb.LIZJ[i] = scope;
    }

    public static final boolean LIZIZ(C19991913Kb<Object, Object> c19991913Kb, Key key, Scope scope) {
        Object objLIZLLL = c19991913Kb.LIZLLL(key);
        if (objLIZLLL == null) {
            return false;
        }
        if (objLIZLLL instanceof C19994113Kx) {
            C19994113Kx c19994113Kx = (C19994113Kx) objLIZLLL;
            boolean zLJIIJJI = c19994113Kx.LJIIJJI(scope);
            if (zLJIIJJI && c19994113Kx.LIZIZ()) {
                c19991913Kb.LJIIIZ(key);
            }
            return zLJIIJJI;
        }
        if (!Intrinsics.LJFF(objLIZLLL, scope)) {
            return false;
        }
        c19991913Kb.LJIIIZ(key);
        return true;
    }
}
