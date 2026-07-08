package X;

import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.Process;
import android.telecom.PhoneAccount;
import android.telecom.PhoneAccountHandle;
import android.telecom.TelecomManager;
import androidx.core.telecom.internal.JetpackConnectionService;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.0k0a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1302860k0a {
    public static final /* synthetic */ int LJ = 0;
    public final Context LIZ;
    public final TelecomManager LIZIZ;
    public final JetpackConnectionService LIZJ = new JetpackConnectionService();
    public final ExecutorC1302940k0i LIZLLL = new Executor() { // from class: X.0k0i
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            runnable.run();
        }
    };

    public final PhoneAccountHandle LIZIZ() {
        C1302930k0h.LIZ.getClass();
        C1302910k0f.LIZJ();
        return new PhoneAccountHandle(new ComponentName(this.LIZ.getPackageName(), C1302910k0f.LIZIZ() ? this.LIZ.getPackageName() : "androidx.core.telecom.internal.JetpackConnectionService"), "Jetpack", Process.myUserHandle());
    }

    public final void LIZLLL() {
        C1302930k0h.LIZ.getClass();
        C1302910k0f.LIZJ();
        PhoneAccount.Builder builder = PhoneAccount.builder(LIZIZ(), "Telecom-Jetpack");
        int i = C1302910k0f.LIZIZ() ? 264192 : SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
        if (C1302910k0f.LIZ(2, 4)) {
            i |= 1032;
        }
        if (C1302910k0f.LIZ(4, 4)) {
            i |= 524288;
        }
        builder.setCapabilities(i);
        Bundle bundle = new Bundle();
        bundle.putBoolean("isCoreTelecomAccount", true);
        builder.setExtras(bundle);
        this.LIZIZ.registerPhoneAccount(builder.build());
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0k0i] */
    public C1302860k0a(Context context) {
        this.LIZ = context;
        this.LIZIZ = (TelecomManager) C786410Ut5.H2(context, "telecom");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.C099F r7, X.C05XL r8, X.C1302870k0b r9, X.InterfaceC1364105Vn r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof X.C1302900k0e
            if (r0 == 0) goto L26
            r4 = r10
            X.0k0e r4 = (X.C1302900k0e) r4
            int r2 = r4.LLILZLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L26
            int r2 = r2 - r1
            r4.LLILZLL = r2
        L12:
            java.lang.Object r2 = r4.LLILZ
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r4.LLILZLL
            r1 = 1
            if (r0 == 0) goto L38
            if (r0 != r1) goto L30
            X.00zU r3 = r4.LLILLL
            X.0k0b r9 = r4.LLILLJJLI
            X.05XL r8 = r4.LL
            goto L2c
        L26:
            X.0k0e r4 = new X.0k0e
            r4.<init>(r6, r10)
            goto L12
        L2c:
            X.C155000ia.LIZIZ(r2)     // Catch: X.C094W -> L5a
            goto L57
        L30:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L38:
            X.C155000ia.LIZIZ(r2)
            X.00zU r3 = new X.00zU
            r3.<init>()
            X.0CwN r2 = new X.0CwN     // Catch: X.C094W -> L5a
            r0 = 0
            r2.<init>(r3, r7, r8, r0)     // Catch: X.C094W -> L5a
            r4.LL = r8     // Catch: X.C094W -> L5a
            r4.LLILLJJLI = r9     // Catch: X.C094W -> L5a
            r4.LLILLL = r3     // Catch: X.C094W -> L5a
            r4.LLILZLL = r1     // Catch: X.C094W -> L5a
            r0 = 5000(0x1388, double:2.4703E-320)
            java.lang.Object r0 = X.C099A.LIZIZ(r0, r2, r4)     // Catch: X.C094W -> L5a
            if (r0 != r5) goto L57
            return r5
        L57:
            T r0 = r3.element
            return r0
        L5a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "addCall: timeout hit; canceling call in context=["
            r1.append(r0)
            kotlin.coroutines.CoroutineContext r0 = r4.getContext()
            r1.append(r0)
            r0 = 93
            r1.append(r0)
            X.C2188811AlT.LIZIZ(r1)
            if (r9 == 0) goto L7d
            java.util.ArrayList<X.0k0b> r0 = androidx.core.telecom.internal.JetpackConnectionService.LL
            r0.remove(r9)
        L7d:
            if (r8 == 0) goto L88
            kotlin.Unit r0 = kotlin.Unit.LIZ
            boolean r0 = r8.LJIIZILJ(r0)
            java.lang.Boolean.valueOf(r0)
        L88:
            X.0CwP r1 = new X.0CwP
            r0 = 6
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1302860k0a.LIZJ(X.099F, X.05XL, X.0k0b, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0168 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02d1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02d2  */
    /* JADX WARN: Type inference failed for: r29v0, types: [X.0k0a] */
    /* JADX WARN: Type inference failed for: r6v1, types: [X.05XL, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [X.0957] */
    /* JADX WARN: Type inference failed for: r6v8, types: [X.0957] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.C1302880k0c r30, kotlin.jvm.functions.Function2 r31, kotlin.jvm.functions.Function2 r32, kotlin.jvm.functions.Function1 r33, kotlin.jvm.functions.Function1 r34, X.C2252331DDr r35, X.C324530Cnr r36, kotlin.jvm.functions.Function1 r37, X.InterfaceC1364105Vn r38) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 737
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1302860k0a.LIZ(X.0k0c, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, X.1DDr, X.0Cnr, kotlin.jvm.functions.Function1, X.05Vn):java.lang.Object");
    }
}
