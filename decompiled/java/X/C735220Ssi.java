package X;

import android.content.Context;
import android.os.Bundle;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AFwS243S0000000_11;

/* JADX INFO: renamed from: X.0Ssi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C735220Ssi implements C0O3D {
    public final Context LIZ;
    public final String LIZIZ;
    public final String LIZJ = "click_like";
    public final Bundle LIZLLL;
    public final Function0<Unit> LJ;
    public final Function1<C0OAF, Unit> LJFF;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    @Override // X.C0O3D
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.InterfaceC1364105Vn<? super java.lang.Boolean> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C735240Ssk
            if (r0 == 0) goto L20
            r5 = r7
            X.0Ssk r5 = (X.C735240Ssk) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r3 = 1
            if (r0 == 0) goto L32
            if (r0 != r3) goto L2a
            goto L26
        L20:
            X.0Ssk r5 = new X.0Ssk
            r5.<init>(r6, r7)
            goto L12
        L26:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L49
            return r1
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C155000ia.LIZIZ(r1)
            X.1DFH r0 = X.C0PEM.LIZ     // Catch: java.lang.Exception -> L49
            X.08pq r2 = X.C2107308Nj.LIZ     // Catch: java.lang.Exception -> L49
            X.0Ssj r1 = new X.0Ssj     // Catch: java.lang.Exception -> L49
            r0 = 0
            r1.<init>(r6, r0)     // Catch: java.lang.Exception -> L49
            r5.LLILLL = r3     // Catch: java.lang.Exception -> L49
            java.lang.Object r1 = X.C23250099c.LJI(r5, r2, r1)     // Catch: java.lang.Exception -> L49
            if (r1 != r4) goto L48
            return r4
        L48:
            return r1
        L49:
            r4 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r4)
            kotlin.jvm.functions.Function1<X.0OAF, kotlin.Unit> r3 = r6.LJFF
            if (r3 == 0) goto L5d
            X.0OAF r2 = new X.0OAF
            r1 = 103(0x67, float:1.44E-43)
            java.lang.String r0 = "login error"
            r2.<init>(r1, r0, r4)
            r3.invoke(r2)
        L5d:
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C735220Ssi.LIZ(X.05Vn):java.lang.Object");
    }

    public C735220Ssi(Context context, String str, Bundle bundle, AFwS198S0000000_11 aFwS198S0000000_11, AFwS243S0000000_11 aFwS243S0000000_11) {
        this.LIZ = context;
        this.LIZIZ = str;
        this.LIZLLL = bundle;
        this.LJ = aFwS198S0000000_11;
        this.LJFF = aFwS243S0000000_11;
    }
}
