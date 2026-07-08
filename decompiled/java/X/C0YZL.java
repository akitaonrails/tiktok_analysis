package X;

import com.bytedance.lobby.auth.AuthResult;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0YZL, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YZL implements InterfaceC21614319iP {
    public final C19EG LL;
    public final InterfaceC859570Xnn LLILLJJLI;

    @Override // X.InterfaceC21614319iP
    public final void LLLLJ(AuthResult authResult) {
        String message;
        String str = authResult.mUid;
        String string = authResult.mBundle.getString("username");
        String str2 = authResult.mToken;
        String str3 = authResult.mTokenSecret;
        if (authResult.mIsSuccessful && str != null && str2 != null && str3 != null) {
            C948503nH.LJ(this.LL, C23271099x.INSTANCE, new C859540Xnk(this, str, string, str2, str3, null));
            return;
        }
        C851480Xak c851480Xak = authResult.mErrorCause;
        String str4 = "";
        if (c851480Xak == null || (message = c851480Xak.getMessage()) == null) {
            message = "";
        }
        C948503nH.LJ(this.LL, C23271099x.INSTANCE, new C859550Xnl(this, null));
        if (c851480Xak == null || Intrinsics.LJFF(message, "Authorization failed, request was canceled.") || Intrinsics.LJFF(message, "Failed to get authorization, bundle incomplete")) {
            return;
        }
        C089E c089e = new C089E(c851480Xak.getStackTrace());
        while (c089e.hasNext()) {
            ((StackTraceElement) c089e.next()).toString();
        }
        c851480Xak.getMessage();
        C2344809Gs.LJI(c851480Xak);
        String message2 = c851480Xak.getMessage();
        if (message2 == null) {
            message2 = "";
        }
        String errorStage = c851480Xak.getErrorStage();
        if (errorStage != null) {
            str4 = errorStage;
        }
        LIZIZ(message2, str4);
    }

    public C0YZL(C19EG c19eg, InterfaceC859570Xnn interfaceC859570Xnn) {
        this.LL = c19eg;
        this.LLILLJJLI = interfaceC859570Xnn;
    }

    public final void LIZIZ(String str, String str2) {
        String string;
        String str3 = C878800Ydi.LIZ;
        C19EG c19eg = this.LL;
        if (a0.LJJIIZI(str, "request was canceled", false)) {
            string = c19eg.getString(2131850169, C878800Ydi.LIZJ);
        } else if (!a0.LJJIIZI(str, "Failed to store data", false) && !a0.LJJIIZI(str, "Failed to retrieve data", false)) {
            String str4 = C878800Ydi.LIZJ;
            string = c19eg.getString(2131850170, str4, str4);
        } else {
            string = c19eg.getString(2131850171, C878800Ydi.LIZJ);
        }
        this.LLILLJJLI.cM1(string);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("platform", "twitter");
        c2344009Gk.LJIIIIZZ("error_desc", str);
        c2344009Gk.LJIIIIZZ("error_code", str2);
        C20684815ws.LJIILLIIL("social_account_bind_failure", c2344009Gk.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> java.lang.Object LIZ(kotlin.jvm.functions.Function1<? super X.InterfaceC1364105Vn<? super T>, ? extends java.lang.Object> r9, kotlin.jvm.functions.Function1<? super X.InterfaceC1364105Vn<? super kotlin.Unit>, ? extends java.lang.Object> r10, X.InterfaceC1364105Vn<? super T> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof X.C859660Xnw
            if (r0 == 0) goto L2e
            r7 = r11
            X.0Xnw r7 = (X.C859660Xnw) r7
            int r2 = r7.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2e
            int r2 = r2 - r1
            r7.LLILZ = r2
        L12:
            java.lang.Object r6 = r7.LLILLJJLI
            java.lang.Object r5 = X.C099R.LJFF()
            int r4 = r7.LLILZ
            r3 = 3
            r2 = 2
            r0 = 1
            r1 = 0
            if (r4 == 0) goto L3a
            if (r4 == r0) goto L34
            if (r4 == r2) goto L6a
            if (r4 == r3) goto L6a
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.0Xnw r7 = new X.0Xnw
            r7.<init>(r8, r11)
            goto L12
        L34:
            kotlin.jvm.functions.Function1 r10 = r7.LL
            X.C155000ia.LIZIZ(r6)     // Catch: java.lang.Exception -> L49 java.util.concurrent.ExecutionException -> L58
            return r6
        L3a:
            X.C155000ia.LIZIZ(r6)
            r7.LL = r10     // Catch: java.lang.Exception -> L49 java.util.concurrent.ExecutionException -> L58
            r7.LLILZ = r0     // Catch: java.lang.Exception -> L49 java.util.concurrent.ExecutionException -> L58
            java.lang.Object r6 = r9.invoke(r7)     // Catch: java.lang.Exception -> L49 java.util.concurrent.ExecutionException -> L58
            if (r6 != r5) goto L48
            return r5
        L48:
            return r6
        L49:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r7.LL = r1
            r7.LLILZ = r3
            java.lang.Object r0 = r10.invoke(r7)
            if (r0 != r5) goto L6d
            return r5
        L58:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.AbstractC2126608Uu.getCompatibleException(r0)
            r7.LL = r1
            r7.LLILZ = r2
            java.lang.Object r0 = r10.invoke(r7)
            if (r0 != r5) goto L6d
            return r5
        L6a:
            X.C155000ia.LIZIZ(r6)
        L6d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0YZL.LIZ(kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, X.05Vn):java.lang.Object");
    }
}
