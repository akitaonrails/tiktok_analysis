package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.tako.aivideo.rtc.model.TakoRTCData;
import com.ss.android.ugc.aweme.tako.ccl.model.api.AgentClientEnv;

/* JADX INFO: renamed from: X.0jyy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1301860jyy {
    public static volatile AgentClientEnv LIZ;

    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LIZ(boolean r14, X.InterfaceC1364105Vn<? super java.lang.String> r15) {
        /*
            boolean r0 = r15 instanceof X.C1301870jyz
            if (r0 == 0) goto L3f
            r5 = r15
            X.0jyz r5 = (X.C1301870jyz) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3f
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r3 = r5.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r1 = r5.LLILLL
            r0 = 1
            r2 = 0
            if (r1 == 0) goto L2a
            if (r1 != r0) goto L91
            boolean r14 = r5.LL
            X.C155000ia.LIZIZ(r3)
        L25:
            com.ss.android.ugc.aweme.tako.ccl.model.api.AgentClientEnv r3 = (com.ss.android.ugc.aweme.tako.ccl.model.api.AgentClientEnv) r3
            if (r3 != 0) goto L45
            return r2
        L2a:
            X.C155000ia.LIZIZ(r3)
            r5.LL = r14
            r5.LLILLL = r0
            X.1DFB r1 = X.C0PEM.LIZJ
            X.0NaW r0 = new X.0NaW
            r0.<init>(r2)
            java.lang.Object r3 = X.C23250099c.LJI(r5, r1, r0)
            if (r3 != r4) goto L25
            return r4
        L3f:
            X.0jyz r5 = new X.0jyz
            r5.<init>(r15)
            goto L12
        L45:
            com.ss.android.ugc.aweme.tako.ccl.model.api.AgentClientEnv r0 = X.C1301860jyy.LIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r3)
            if (r0 == 0) goto L50
            if (r14 != 0) goto L50
            return r2
        L50:
            X.C1301860jyy.LIZ = r3
            com.ss.android.ugc.aweme.tako.aivideo.rtc.model.TakoRTCData r4 = new com.ss.android.ugc.aweme.tako.aivideo.rtc.model.TakoRTCData     // Catch: java.lang.Throwable -> L7d
            java.lang.String r5 = "tako"
            java.lang.String r6 = "client"
            java.lang.String r7 = "engine"
            long r8 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L7d
            java.lang.String r10 = "passthrough_message"
            java.lang.String r11 = "client_env"
            com.google.gson.Gson r0 = X.C1222790hvR.LIZ()     // Catch: java.lang.Throwable -> L7d
            java.lang.String r14 = r0.LJIILL(r3)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r12 = ""
            r13 = -1
            r15 = r12
            r4.<init>(r5, r6, r7, r8, r10, r11, r12, r13, r14, r15)     // Catch: java.lang.Throwable -> L7d
            com.google.gson.Gson r0 = X.C1222790hvR.LIZ()     // Catch: java.lang.Throwable -> L7d
            java.lang.String r1 = r0.LJIILL(r4)     // Catch: java.lang.Throwable -> L7d
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L7d
            goto L89
        L7d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L89:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 != 0) goto L90
            return r1
        L90:
            return r2
        L91:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1301860jyy.LIZ(boolean, X.05Vn):java.lang.Object");
    }

    public static final String LIZIZ(EnumC1284940jXg enumC1284940jXg, String str, int i) {
        return GsonProtectorUtils.toJson(C1222790hvR.LIZ(), new TakoRTCData("tako", "client", "mediaX", System.currentTimeMillis(), "control_command", "", str, i, enumC1284940jXg.getPayload(), ""));
    }
}
