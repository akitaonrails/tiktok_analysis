package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0WJ3, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WJ3 implements InterfaceC821090WIx {
    @Override // X.InterfaceC821090WIx
    public final boolean LIZIZ() {
        return false;
    }

    @Override // X.InterfaceC821090WIx
    public final String LIZJ() {
        return "aigc_draft_db.json";
    }

    @Override // X.InterfaceC821090WIx
    public final String LIZ(Context context, C821110WIz c821110WIz) {
        C821050WIt c821050WIt = C821050WIt.LIZ;
        String str = c821110WIz.LIZ;
        c821050WIt.getClass();
        String strLIZ = C821050WIt.LIZ(context, str);
        try {
            C0VSJ c0vsj = new C0VSJ(strLIZ);
            if (!c0vsj.exists()) {
                c0vsj.mkdirs();
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        return strLIZ + File.separator + "aigc_draft_db.json";
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    @Override // X.InterfaceC821090WIx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(android.content.Context r7, X.C821110WIz r8, X.InterfaceC1364105Vn<? super X.C821100WIy> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof X.C0WJ6
            if (r0 == 0) goto L20
            r5 = r9
            X.0WJ6 r5 = (X.C0WJ6) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r2 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r3 = 1
            if (r0 == 0) goto L2e
            if (r0 != r3) goto L26
            goto L42
        L20:
            X.0WJ6 r5 = new X.0WJ6
            r5.<init>(r6, r9)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r2)
            java.lang.String r2 = r6.LIZ(r7, r8)
            X.0WJA r1 = X.C0WJA.LIZ     // Catch: java.lang.Throwable -> L4b
            java.lang.String r0 = r8.LIZ     // Catch: java.lang.Throwable -> L4b
            r5.LLILLL = r3     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r2 = r1.LJIIIIZZ(r0, r2, r5)     // Catch: java.lang.Throwable -> L4b
            if (r2 != r4) goto L45
            return r4
        L42:
            X.C155000ia.LIZIZ(r2)     // Catch: java.lang.Throwable -> L4b
        L45:
            X.0WIy r2 = (X.C821100WIy) r2     // Catch: java.lang.Throwable -> L4b
            X.C189200o6.m2constructorimpl(r2)     // Catch: java.lang.Throwable -> L4b
            goto L57
        L4b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r2 = new X.00Yq
            r2.<init>(r0)
            X.C189200o6.m2constructorimpl(r2)
        L57:
            java.lang.Throwable r0 = X.C189200o6.m5exceptionOrNullimpl(r2)
            if (r0 == 0) goto L68
            X.0WIy r2 = new X.0WIy
            X.0WJ1 r1 = X.C0WJ1.FAILED
            java.lang.String r0 = r0.getMessage()
            r2.<init>(r1, r0)
        L68:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0WJ3.LIZLLL(android.content.Context, X.0WIz, X.05Vn):java.lang.Object");
    }
}
