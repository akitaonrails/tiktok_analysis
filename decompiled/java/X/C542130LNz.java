package X;

import android.content.Context;
import com.ss.android.ugc.aweme.aikit.api.common.task.TaskInfoData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LNz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.NavigateServiceImpl$realNavigateGenerateFail$2", f = "NavigateServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C542130LNz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ TaskInfoData LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C542130LNz(Context context, TaskInfoData taskInfoData, InterfaceC1364105Vn<? super C542130LNz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = context;
        this.LLILLJJLI = taskInfoData;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C542130LNz(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e A[PHI: r1
      0x002e: PHI (r1v2 java.lang.String) = (r1v0 java.lang.String), (r1v3 java.lang.String) binds: [B:7:0x0022, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.String r4 = "NavigateServiceImpl@832b.realNavigateGenerateFail$2"
            X.C1C7U.LIZ(r4)
            X.C099R.LJFF()
            X.C155000ia.LIZIZ(r6)
            X.0LPI r0 = X.C0LPI.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.aigc.IMService r3 = X.C0LPI.LIZ()
            android.content.Context r2 = r5.LL
            com.ss.android.ugc.aweme.aikit.api.common.task.TaskInfoData r0 = r5.LLILLJJLI
            com.ss.android.ugc.aweme.aikit.api.common.task.TaskLifecycleInfo r0 = r0.lifecycleInfo
            if (r0 == 0) goto L20
            java.lang.String r1 = r0.dmUid
            if (r1 != 0) goto L2e
        L20:
            java.lang.String r1 = ""
            if (r0 != 0) goto L2e
            r0 = 0
        L25:
            r3.LIZ(r2, r0, r1)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r4)
            return r0
        L2e:
            java.lang.Long r0 = r0.dmConversationShortId
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C542130LNz.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
