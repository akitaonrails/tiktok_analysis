package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;

/* JADX INFO: renamed from: X.06wD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1768306wD implements IFetchEffectListListener {
    public final int $t;
    public Object l0;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener
    public final void onFail(ExceptionResult exceptionResult) {
        switch (this.$t) {
            case 0:
                onFail$0(this, exceptionResult);
                break;
            case 1:
                onFail$1(this, exceptionResult);
                break;
        }
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(List<Effect> list) {
        switch (this.$t) {
            case 0:
                onSuccess$0(this, list);
                break;
            case 1:
                onSuccess$1(this, list);
                break;
        }
    }

    public C1768306wD(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0033 A[PHI: r1
      0x0033: PHI (r1v2 java.lang.String) = (r1v0 java.lang.String), (r1v3 java.lang.String) binds: [B:9:0x001a, B:7:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onFail$0(X.C1768306wD r3, com.ss.android.ugc.effectmanager.common.task.ExceptionResult r4) {
        /*
            java.lang.Object r0 = r3.l0
            X.14Gf r0 = (X.InterfaceC20236714Gf) r0
            boolean r0 = r0.isActive()
            if (r0 == 0) goto L32
            java.lang.Object r3 = r3.l0
            X.14Gf r3 = (X.InterfaceC20236714Gf) r3
            X.05Wf r2 = new X.05Wf
            if (r4 == 0) goto L18
            java.lang.String r1 = r4.getMsg()
            if (r1 != 0) goto L33
        L18:
            java.lang.String r1 = ""
            if (r4 != 0) goto L33
            r0 = -1
        L1d:
            r2.<init>(r1, r0)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r2)
            X.C189200o6.m2constructorimpl(r0)
            X.00o6 r0 = X.C189200o6.m1boximpl(r0)
            X.C189200o6.m2constructorimpl(r0)
            r3.resumeWith(r0)
        L32:
            return
        L33:
            int r0 = r4.getErrorCode()
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1768306wD.onFail$0(X.06wD, com.ss.android.ugc.effectmanager.common.task.ExceptionResult):void");
    }

    public static final void onFail$1(C1768306wD c1768306wD, ExceptionResult exceptionResult) {
        String msg;
        Integer numValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Failed to fetch effects: ");
        if (exceptionResult == null || (msg = exceptionResult.getMsg()) == null) {
            msg = "Unknown error";
        }
        sbLIZ.append(msg);
        sbLIZ.append(", code: ");
        if (exceptionResult != null) {
            numValueOf = Integer.valueOf(exceptionResult.getErrorCode());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        RuntimeException runtimeException = new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c1768306wD.l0;
        C098200Yq c098200Yq = new C098200Yq(runtimeException);
        C189200o6.m2constructorimpl(c098200Yq);
        interfaceC1364105Vn.resumeWith(c098200Yq);
    }

    public static final void onSuccess$0(C1768306wD c1768306wD, Object obj) {
        Object objLJJJJLI;
        Iterable iterable = (Iterable) obj;
        if (((InterfaceC20236714Gf) c1768306wD.l0).isActive()) {
            InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c1768306wD.l0;
            if (iterable == null || (objLJJJJLI = C13LP.LJJJJLI(iterable)) == null) {
                objLJJJJLI = C13BV.INSTANCE;
            }
            C189200o6.m2constructorimpl(objLJJJJLI);
            C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLJJJJLI);
            C189200o6.m2constructorimpl(c189200o6M1boximpl);
            interfaceC20236714Gf.resumeWith(c189200o6M1boximpl);
        }
    }

    public static final void onSuccess$1(C1768306wD c1768306wD, Object obj) {
        Object objLJJJJLI;
        Iterable iterable = (Iterable) obj;
        if (iterable != null) {
            objLJJJJLI = C13LP.LJJJJLI(iterable);
        } else {
            objLJJJJLI = C13BV.INSTANCE;
        }
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c1768306wD.l0;
        C189200o6.m2constructorimpl(objLJJJJLI);
        interfaceC1364105Vn.resumeWith(objLJJJJLI);
    }
}
