package X;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0W2M, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0W2M {
    public static final /* synthetic */ int LJFF = 0;
    public final C0W2Q LIZ;
    public final C816660W1w LIZIZ;
    public final List<C816670W1x> LIZJ = new ArrayList();
    public final List<C816670W1x> LIZLLL = new ArrayList();
    public final JSONObject LJ = new JSONObject();

    public C0W2M(C0W2Q c0w2q) {
        this.LIZ = c0w2q;
        this.LIZIZ = new C816660W1w(c0w2q);
    }

    public static String LIZJ(C816670W1x c816670W1x) {
        String str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c816670W1x.LIZ);
        sbLIZ.append('_');
        C816680W1y c816680W1y = c816670W1x.LIZJ;
        if (c816680W1y != null) {
            str = c816680W1y.LIZIZ;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.InterfaceC1364105Vn<? super kotlin.Unit> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C0W2N
            if (r0 == 0) goto L40
            r4 = r6
            X.0W2N r4 = (X.C0W2N) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L40
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r0 = r4.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r1 = r4.LLILZ
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L46
            java.lang.Object r1 = r4.LL
            java.util.List r1 = (java.util.List) r1
            X.C155000ia.LIZIZ(r0)
        L26:
            java.util.Collection r0 = (java.util.Collection) r0
            r1.addAll(r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L2e:
            X.C155000ia.LIZIZ(r0)
            java.util.List<X.0W1x> r1 = r5.LIZLLL
            X.0W1w r0 = r5.LIZIZ
            r4.LL = r1
            r4.LLILZ = r2
            java.lang.Object r0 = r0.LIZIZ()
            if (r0 != r3) goto L26
            return r3
        L40:
            X.0W2N r4 = new X.0W2N
            r4.<init>(r5, r6)
            goto L12
        L46:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0W2M.LIZ(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.InterfaceC1364105Vn<? super kotlin.Unit> r11) throws org.json.JSONException {
        /*
            r10 = this;
            boolean r0 = r11 instanceof X.C0W2O
            if (r0 == 0) goto L7e
            r7 = r11
            X.0W2O r7 = (X.C0W2O) r7
            int r2 = r7.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7e
            int r2 = r2 - r1
            r7.LLILZ = r2
        L12:
            java.lang.Object r0 = r7.LLILLJJLI
            java.lang.Object r8 = X.C099R.LJFF()
            int r1 = r7.LLILZ
            r6 = 1
            if (r1 == 0) goto L2e
            if (r1 != r6) goto L84
            java.lang.Object r1 = r7.LL
            java.util.List r1 = (java.util.List) r1
            X.C155000ia.LIZIZ(r0)
        L26:
            java.util.Collection r0 = (java.util.Collection) r0
            r1.addAll(r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L2e:
            X.C155000ia.LIZIZ(r0)
            org.json.JSONObject r9 = r10.LJ
            X.0W2Q r0 = r10.LIZ
            X.0W2U r0 = r0.LIZIZ
            long r4 = r0.LIZ()
            r2 = -1
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 != 0) goto L78
            r0 = -1
        L43:
            java.lang.String r4 = "full_update_interval"
            org.json.JSONObject r9 = r9.put(r4, r0)
            X.0W2Q r0 = r10.LIZ
            X.0W2U r0 = r0.LIZIZ
            X.051b r1 = r0.LIZJ
            X.1Bqa<java.lang.Object>[] r0 = X.C0W2U.LIZLLL
            java.lang.Object r0 = r1.LIZ()
            java.lang.Number r0 = (java.lang.Number) r0
            long r4 = r0.longValue()
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 == 0) goto L64
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r4
        L64:
            java.lang.String r0 = "push_update_interval"
            r9.put(r0, r2)
            java.util.List<X.0W1x> r1 = r10.LIZJ
            X.0W1w r0 = r10.LIZIZ
            r7.LL = r1
            r7.LLILZ = r6
            java.lang.Object r0 = r0.LIZIZ()
            if (r0 != r8) goto L26
            return r8
        L78:
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r4
            goto L43
        L7e:
            X.0W2O r7 = new X.0W2O
            r7.<init>(r10, r11)
            goto L12
        L84:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0W2M.LIZIZ(X.05Vn):java.lang.Object");
    }
}
