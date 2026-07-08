package X;

import android.app.Application;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.tools.AVApi;
import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Field;
import kotlin.jvm.internal.AFwS219S0000000_30;

/* JADX INFO: renamed from: X.13li, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20106013li {
    public static final String LIZIZ;
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(334));

    static {
        AVApi aVApi = (AVApi) PluggableExtentionKt.pluggableSpi$default(AVApi.class, false, false, false, 14, null);
        LIZIZ = aVApi != null ? aVApi.LIZ() : null;
    }

    public static File LIZ(Context context) throws Throwable {
        File file = C786450Ut9.LIZJ;
        if (file != null && C786450Ut9.LJ) {
            return file;
        }
        try {
            C786450Ut9.LIZJ = context.getFilesDir();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Context applicationContext = null;
            try {
                Class<?> cls = Class.forName("android.app.ActivityThread");
                Object objInvoke = cls.getDeclaredMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
                Field declaredField = cls.getDeclaredField("mInitialApplication");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(objInvoke);
                if (obj instanceof Application) {
                    applicationContext = ((Application) obj).getApplicationContext();
                    PrintStream printStream = System.out;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Application context obtained through ActivityThread: ");
                    sbLIZ.append(applicationContext);
                    printStream.println(C2188811AlT.LIZIZ(sbLIZ));
                } else {
                    System.out.println("Error: mInitialApplication is not an instance of Application");
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                PrintStream printStream2 = System.out;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Error: ");
                sbLIZ2.append(e.getMessage());
                printStream2.println(C2188811AlT.LIZIZ(sbLIZ2));
            }
            if (applicationContext != null) {
                C786450Ut9.LIZJ = applicationContext.getFilesDir();
                C08RN.LIZ(applicationContext);
            } else {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(th.getMessage());
                sbLIZ3.append(":");
                sbLIZ3.append(C08RN.LIZJ());
                sbLIZ3.append(" applicationContext is null");
                throw new Throwable(C2188811AlT.LIZIZ(sbLIZ3));
            }
        }
        return C786450Ut9.LIZJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(java.lang.String r6, X.InterfaceC1364105Vn<? super java.lang.Boolean> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C20106213lk
            if (r0 == 0) goto L20
            r4 = r7
            X.13lk r4 = (X.C20106213lk) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r2 = 1
            if (r0 == 0) goto L2e
            if (r0 != r2) goto L26
            goto L51
        L20:
            X.13lk r4 = new X.13lk
            r4.<init>(r5, r7)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r1)
            if (r6 != 0) goto L39
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.io.IOException -> L59
            return r0
        L39:
            X.01GW r0 = r5.LIZ     // Catch: java.io.IOException -> L59
            java.lang.Object r1 = r0.getValue()     // Catch: java.io.IOException -> L59
            com.ss.android.ugc.aweme.aigc.asynctask.net.AutoCutAgentNetApi r1 = (com.ss.android.ugc.aweme.aigc.asynctask.net.AutoCutAgentNetApi) r1     // Catch: java.io.IOException -> L59
            if (r1 == 0) goto L54
            com.ss.android.ugc.aweme.aigc.asynctask.net.AutoCutAgentCancelTaskBody r0 = new com.ss.android.ugc.aweme.aigc.asynctask.net.AutoCutAgentCancelTaskBody     // Catch: java.io.IOException -> L59
            r0.<init>(r6)     // Catch: java.io.IOException -> L59
            r4.LLILLL = r2     // Catch: java.io.IOException -> L59
            java.lang.Object r0 = r1.cancelTask(r0, r4)     // Catch: java.io.IOException -> L59
            if (r0 != r3) goto L54
            return r3
        L51:
            X.C155000ia.LIZIZ(r1)     // Catch: java.io.IOException -> L59
        L54:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)     // Catch: java.io.IOException -> L59
            return r0
        L59:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "cancelAGICTask: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C09JK.LIZIZ(r0)
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20106013li.LIZIZ(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(java.lang.String r9, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.aigc.asynctask.net.AutoCutAgentCheckStatusResponse> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C20106313ll
            if (r0 == 0) goto L21
            r4 = r10
            X.13ll r4 = (X.C20106313ll) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L21
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r3 = 1
            r7 = 0
            if (r0 == 0) goto L33
            if (r0 != r3) goto L2b
            goto L27
        L21:
            X.13ll r4 = new X.13ll
            r4.<init>(r8, r10)
            goto L12
        L27:
            X.C155000ia.LIZIZ(r1)     // Catch: java.io.IOException -> L87
            return r1
        L2b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L33:
            X.C155000ia.LIZIZ(r1)
            if (r9 != 0) goto L39
            return r7
        L39:
            X.0C64 r6 = X.C0C64.LJIILLIIL()     // Catch: java.io.IOException -> L87
            java.lang.String r2 = "autocut_mock_check_status"
            r1 = 31744(0x7c00, float:4.4483E-41)
            r0 = 0
            boolean r0 = r6.LJIIIZ(r1, r2, r3, r0)     // Catch: java.io.IOException -> L87
            if (r0 == 0) goto L72
            X.0VSJ r2 = new X.0VSJ     // Catch: java.io.IOException -> L87
            X.0XAv r0 = X.C844470XAv.LIZ     // Catch: java.io.IOException -> L87
            r0.getClass()     // Catch: java.io.IOException -> L87
            android.content.Context r0 = X.C844470XAv.LIZ()     // Catch: java.io.IOException -> L87
            java.io.File r1 = LIZ(r0)     // Catch: java.io.IOException -> L87
            java.lang.String r0 = "mock_check_status.json"
            r2.<init>(r1, r0)     // Catch: java.io.IOException -> L87
            boolean r0 = r2.exists()     // Catch: java.io.IOException -> L87
            if (r0 == 0) goto L72
            java.lang.String r2 = X.C09BH.LJII(r2)     // Catch: java.io.IOException -> L87
            X.04rF r1 = X.C1227904rF.LIZ     // Catch: java.io.IOException -> L87
            java.lang.Class<com.ss.android.ugc.aweme.aigc.asynctask.net.AutoCutAgentCheckStatusResponse> r0 = com.ss.android.ugc.aweme.aigc.asynctask.net.AutoCutAgentCheckStatusResponse.class
            r1.getClass()     // Catch: java.io.IOException -> L87
            java.lang.Object r0 = X.C1227904rF.LIZIZ(r2, r0)     // Catch: java.io.IOException -> L87
            return r0
        L72:
            X.01GW r0 = r8.LIZ     // Catch: java.io.IOException -> L87
            java.lang.Object r0 = r0.getValue()     // Catch: java.io.IOException -> L87
            com.ss.android.ugc.aweme.aigc.asynctask.net.AutoCutAgentNetApi r0 = (com.ss.android.ugc.aweme.aigc.asynctask.net.AutoCutAgentNetApi) r0     // Catch: java.io.IOException -> L87
            if (r0 == 0) goto L86
            r4.LLILLL = r3     // Catch: java.io.IOException -> L87
            java.lang.Object r1 = r0.checkStatus(r9, r4)     // Catch: java.io.IOException -> L87
            if (r1 != r5) goto L85
            return r5
        L85:
            return r1
        L86:
            return r7
        L87:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "getAIGCTaskDetail: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C09JK.LIZIZ(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20106013li.LIZJ(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(com.ss.android.ugc.aweme.aigc.asynctask.net.AutoCutAgentTaskBody r7, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.aigc.asynctask.net.AutoCutAgentCreateTaskResponse> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C20106113lj
            if (r0 == 0) goto L21
            r5 = r8
            X.13lj r5 = (X.C20106113lj) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L21
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r4 = r5.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r3 = 0
            r1 = 1
            if (r0 == 0) goto L33
            if (r0 != r1) goto L2b
            goto L27
        L21:
            X.13lj r5 = new X.13lj
            r5.<init>(r6, r8)
            goto L12
        L27:
            X.C155000ia.LIZIZ(r4)     // Catch: java.io.IOException -> L4b
            return r4
        L2b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L33:
            X.C155000ia.LIZIZ(r4)
            X.01GW r0 = r6.LIZ     // Catch: java.io.IOException -> L4b
            java.lang.Object r0 = r0.getValue()     // Catch: java.io.IOException -> L4b
            com.ss.android.ugc.aweme.aigc.asynctask.net.AutoCutAgentNetApi r0 = (com.ss.android.ugc.aweme.aigc.asynctask.net.AutoCutAgentNetApi) r0     // Catch: java.io.IOException -> L4b
            if (r0 == 0) goto L4a
            r5.LLILLL = r1     // Catch: java.io.IOException -> L4b
            java.lang.Object r4 = r0.createAutoCutTask(r7, r5)     // Catch: java.io.IOException -> L4b
            if (r4 != r2) goto L49
            return r2
        L49:
            return r4
        L4a:
            return r3
        L4b:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "createAIGCTask: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C09JK.LIZIZ(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20106013li.LIZLLL(com.ss.android.ugc.aweme.aigc.asynctask.net.AutoCutAgentTaskBody, X.05Vn):java.lang.Object");
    }
}
