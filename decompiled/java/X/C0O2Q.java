package X;

import android.content.Context;
import android.graphics.Typeface;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0O2Q, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0O2Q implements C0NU9 {
    public final Context LIZ;

    @Override // X.C0NU9
    public final void getCacheKey() {
    }

    public C0O2Q(Context context) {
        this.LIZ = C786410Ut5.N3(context);
    }

    @Override // X.C0NU9
    public final Object LIZ(C0NUU c0nuu) {
        boolean z;
        boolean z2;
        Object c098200Yq;
        Typeface typefaceLIZJ;
        if (c0nuu instanceof C0O2U) {
            C0O2U c0o2u = (C0O2U) c0nuu;
            return c0o2u.LIZIZ.LIZ(this.LIZ, c0o2u);
        }
        Object obj = null;
        if (!(c0nuu instanceof C594720NUg)) {
            return null;
        }
        int iLIZIZ = c0nuu.LIZIZ();
        boolean z3 = true;
        if (iLIZIZ == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            typefaceLIZJ = C20143013rg.LIZJ(0, this.LIZ);
        } else {
            if (iLIZIZ == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                try {
                    c098200Yq = C20143013rg.LIZJ(0, this.LIZ);
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                    obj = c098200Yq;
                }
                typefaceLIZJ = (Typeface) obj;
            } else {
                if (iLIZIZ != 2) {
                    z3 = false;
                }
                if (z3) {
                    throw new UnsupportedOperationException("Unsupported Async font load path");
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Unknown loading type ");
                sbLIZ.append((Object) C594730NUh.LIZ(c0nuu.LIZIZ()));
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        return C0O2T.LIZ(typefaceLIZJ, this.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0081  */
    @Override // X.C0NU9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.C0NUU r8, X.InterfaceC1364105Vn<? super android.graphics.Typeface> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C0O2R
            if (r0 == 0) goto L81
            r5 = r9
            X.0O2R r5 = (X.C0O2R) r5
            int r2 = r5.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L81
            int r2 = r2 - r1
            r5.LLILZIL = r2
        L12:
            java.lang.Object r3 = r5.LLILLL
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r5.LLILZIL
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L35
            if (r0 == r1) goto L8f
            if (r0 != r2) goto L87
            X.0NUU r8 = r5.LLILLJJLI
            X.0O2Q r0 = r5.LL
            X.C155000ia.LIZIZ(r3)
        L29:
            android.graphics.Typeface r3 = (android.graphics.Typeface) r3
            r8.getClass()
            android.content.Context r0 = r0.LIZ
            android.graphics.Typeface r0 = X.C0O2T.LIZ(r3, r0)
            return r0
        L35:
            X.C155000ia.LIZIZ(r3)
            boolean r0 = r8 instanceof X.C0O2U
            if (r0 == 0) goto L48
            X.0O2U r8 = (X.C0O2U) r8
            X.0O2S r0 = r8.LIZIZ
            r5.LLILZIL = r1
            r0.LIZIZ()
            if (r6 != 0) goto L93
            return r6
        L48:
            boolean r0 = r8 instanceof X.C594720NUg
            if (r0 == 0) goto L95
            r4 = r8
            X.0NUg r4 = (X.C594720NUg) r4
            android.content.Context r3 = r7.LIZ
            r5.LL = r7
            r5.LLILLJJLI = r8
            r5.LLILZIL = r2
            X.1DEt r2 = new X.1DEt
            X.05Vn r0 = X.C099M.LIZLLL(r5)
            r2.<init>(r1, r0)
            r2.LJIJJ()
            r4.getClass()
            X.0O2P r1 = new X.0O2P
            r1.<init>()
            r0 = 0
            X.C20143013rg.LIZLLL(r3, r0, r1)
            java.lang.Object r3 = r2.LJIJ()
            java.lang.Object r0 = X.C099R.LJFF()
            if (r3 != r0) goto L7c
            X.C099Q.LIZJ(r5)
        L7c:
            if (r3 != r6) goto L7f
            return r6
        L7f:
            r0 = r7
            goto L29
        L81:
            X.0O2R r5 = new X.0O2R
            r5.<init>(r7, r9)
            goto L12
        L87:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L8f:
            X.C155000ia.LIZIZ(r3)
            return r3
        L93:
            r3 = 0
            return r3
        L95:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "Unknown font type: "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0O2Q.LIZIZ(X.0NUU, X.05Vn):java.lang.Object");
    }
}
