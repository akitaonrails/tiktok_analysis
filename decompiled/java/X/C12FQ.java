package X;

import android.content.Context;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.12FQ, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12FQ {
    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0073 A[Catch: Exception -> 0x00bb, TRY_LEAVE, TryCatch #4 {Exception -> 0x00bb, blocks: (B:21:0x0064, B:23:0x0073, B:50:0x00ae, B:48:0x00aa, B:49:0x00ad, B:51:0x00b1, B:53:0x00b7, B:16:0x0043, B:24:0x007c, B:26:0x0084, B:37:0x0097, B:38:0x009a), top: B:68:0x0043, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b7 A[Catch: Exception -> 0x00bb, TryCatch #4 {Exception -> 0x00bb, blocks: (B:21:0x0064, B:23:0x0073, B:50:0x00ae, B:48:0x00aa, B:49:0x00ad, B:51:0x00b1, B:53:0x00b7, B:16:0x0043, B:24:0x007c, B:26:0x0084, B:37:0x0097, B:38:0x009a), top: B:68:0x0043, inners: #7 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LIZ(android.content.Context r7, java.lang.String r8, X.InterfaceC1364105Vn r9, boolean r10) {
        /*
            boolean r0 = r9 instanceof X.C12FS
            if (r0 == 0) goto L2b
            r4 = r9
            X.12FS r4 = (X.C12FS) r4
            int r2 = r4.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2b
            int r2 = r2 - r1
            r4.LLILZIL = r2
        L12:
            java.lang.Object r3 = r4.LLILZ
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILZIL
            r6 = 0
            r1 = 1
            if (r0 == 0) goto L39
            if (r0 != r1) goto L31
            X.064C r5 = r4.LLILLL
            java.lang.Object r8 = r4.LLILLJJLI
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r7 = r4.LL
            android.content.Context r7 = (android.content.Context) r7
            goto L57
        L2b:
            X.12FS r4 = new X.12FS
            r4.<init>(r9)
            goto L12
        L31:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L39:
            X.C155000ia.LIZIZ(r3)
            X.064C r5 = new X.064C
            r5.<init>(r6)
            if (r10 == 0) goto L64
            X.063f r0 = X.C15453063f.LIZ     // Catch: java.lang.Exception -> Lbb
            r4.LL = r7     // Catch: java.lang.Exception -> Lbb
            r4.LLILLJJLI = r8     // Catch: java.lang.Exception -> Lbb
            r4.LLILLL = r5     // Catch: java.lang.Exception -> Lbb
            r4.LLILZIL = r1     // Catch: java.lang.Exception -> Lbb
            r0.getClass()     // Catch: java.lang.Exception -> Lbb
            java.lang.Object r0 = X.C15453063f.LIZIZ(r8, r4)     // Catch: java.lang.Exception -> Lbb
            if (r0 != r2) goto L5a
            return r2
        L57:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Exception -> Lbd
        L5a:
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> Lbd
            java.lang.Long r0 = X.C2286608xc.LJFF(r0)     // Catch: java.lang.Exception -> Lbd
            r5.LIZIZ = r0     // Catch: java.lang.Exception -> Lbd
        L64:
            X.0VSJ r0 = new X.0VSJ     // Catch: java.lang.Exception -> Lbb
            r0.<init>(r8)     // Catch: java.lang.Exception -> Lbb
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Exception -> Lbb
            android.net.Uri r1 = X.C2400409as.LIZLLL(r7, r0)     // Catch: java.lang.Exception -> Lbb
            if (r1 == 0) goto Lb1
            android.content.ContentResolver r0 = r7.getContentResolver()     // Catch: java.lang.Exception -> Lbb
            java.io.OutputStream r4 = X.C09NT.LJI(r0, r1)     // Catch: java.lang.Exception -> Lbb
            r3 = 0
            X.0VSP r2 = new X.0VSP     // Catch: java.lang.Throwable -> L9b
            r2.<init>(r8)     // Catch: java.lang.Throwable -> L9b
            X.C09N1.LIZIZ(r2, r4)     // Catch: java.lang.Throwable -> L88
            X.C2107108Nh.LIZ(r2, r3)     // Catch: java.lang.Throwable -> L9b
            goto Lae
        L88:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L8f
            throw r1     // Catch: java.lang.Throwable -> L8d
        L8d:
            r0 = move-exception
            goto L91
        L8f:
            r0 = move-exception
            r1 = r3
        L91:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L95
            goto L97
        L95:
            r0 = move-exception
            goto L91
        L97:
            X.C2107108Nh.LIZ(r2, r1)     // Catch: java.lang.Throwable -> L9b
            throw r0     // Catch: java.lang.Throwable -> L9b
        L9b:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> La3
            throw r1     // Catch: java.lang.Throwable -> La0
        La0:
            r0 = move-exception
            r3 = r1
            goto La4
        La3:
            r0 = move-exception
        La4:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> La8
            goto Laa
        La8:
            r0 = move-exception
            goto La4
        Laa:
            X.C2107108Nh.LIZ(r4, r3)     // Catch: java.lang.Exception -> Lbb
            throw r0     // Catch: java.lang.Exception -> Lbb
        Lae:
            X.C2107108Nh.LIZ(r4, r3)     // Catch: java.lang.Exception -> Lbb
        Lb1:
            java.lang.String r0 = X.C09N5.LIZ(r7, r1)     // Catch: java.lang.Exception -> Lbb
            if (r0 == 0) goto Lc3
            X.C2400409as.LJIIJ(r7, r0)     // Catch: java.lang.Exception -> Lbb
            return r5
        Lbb:
            r0 = move-exception
            goto Lbe
        Lbd:
            r0 = move-exception
        Lbe:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r5.LIZ = r6
        Lc3:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12FQ.LIZ(android.content.Context, java.lang.String, X.05Vn, boolean):java.lang.Object");
    }

    public static boolean LIZJ(Context context, View view, Integer num, int i) {
        boolean zLIZIZ;
        try {
            zLIZIZ = C036E.LIZ.LIZIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            zLIZIZ = false;
        }
        if (!zLIZIZ) {
            C0DQF.LJII(C0DQF.LIZ, view, i, num, Integer.valueOf(R.attr.a1h), 16);
            return false;
        }
        if (!C1375500ltk.LJI(context)) {
            C0DQF.LJII(C0DQF.LIZ, view, 2131849900, num, Integer.valueOf(R.attr.a1h), 16);
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01c9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0203  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LIZIZ(android.content.Context r16, java.lang.String r17, java.lang.String r18, java.util.Map r19, X.InterfaceC1364105Vn r20, boolean r21) {
        /*
            Method dump skipped, instruction units count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12FQ.LIZIZ(android.content.Context, java.lang.String, java.lang.String, java.util.Map, X.05Vn, boolean):java.lang.Object");
    }
}
