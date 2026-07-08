package X;

import android.app.Activity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Dfg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "dmt.av.video.record.RecordConditionCheck__RecordConditionCheckKt$optPreStorageCheck$1", f = "RecordConditionCheck.kt", l = {136, 165, 166}, m = "invokeSuspend")
public final class C344940Dfg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ Activity LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final /* synthetic */ long LLILZLL;
    public final /* synthetic */ Function0<Unit> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C344940Dfg(Activity activity, long j, long j2, long j3, Function0<Unit> function0, InterfaceC1364105Vn<? super C344940Dfg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = activity;
        this.LLILZ = j;
        this.LLILZIL = j2;
        this.LLILZLL = j3;
        this.LLIZ = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C344940Dfg c344940Dfg = new C344940Dfg(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c344940Dfg.LLILLJJLI = obj;
        return c344940Dfg;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x009e A[RETURN] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) throws java.lang.Throwable {
        /*
            r16 = this;
            r5 = r17
            java.lang.Object r1 = X.C099R.LJFF()
            r0 = r16
            int r3 = r0.LL
            r7 = 0
            r6 = 3
            r2 = 2
            r4 = 1
            if (r3 == 0) goto L1c
            if (r3 == r4) goto L4b
            if (r3 == r2) goto L62
            if (r3 != r6) goto L9f
            X.C155000ia.LIZIZ(r5)
        L19:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L1c:
            X.C155000ia.LIZIZ(r5)
            java.lang.Object r5 = r0.LLILLJJLI
            X.01wk r5 = (X.InterfaceC497601wk) r5
            X.C344950Dfh.LIZ = r4
            X.0Dff r3 = new X.0Dff
            android.app.Activity r2 = r0.LLILLL
            r3.<init>(r2, r7)
            X.099G r3 = X.C23250099c.LIZIZ(r5, r7, r7, r3, r6)
            X.08pq r2 = X.C2107308Nj.LIZ
            X.0Dfv r5 = new X.0Dfv
            android.app.Activity r6 = r0.LLILLL
            long r7 = r0.LLILZ
            long r9 = r0.LLILZIL
            long r11 = r0.LLILZLL
            r13 = 0
            r5.<init>(r6, r7, r9, r11, r13)
            r0.LLILLJJLI = r3
            r0.LL = r4
            java.lang.Object r5 = X.C23250099c.LJI(r0, r2, r5)
            if (r5 != r1) goto L52
            return r1
        L4b:
            java.lang.Object r3 = r0.LLILLJJLI
            X.0957 r3 = (X.AnonymousClass0957) r3
            X.C155000ia.LIZIZ(r5)
        L52:
            com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialog r5 = (com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialog) r5
            r0.LLILLJJLI = r5
            r2 = 2
            r0.LL = r2
            java.lang.Object r3 = r3.LJLIIIL(r0)
            if (r3 != r1) goto L60
            return r1
        L60:
            r4 = r5
            goto L6a
        L62:
            java.lang.Object r4 = r0.LLILLJJLI
            com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialog r4 = (com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialog) r4
            X.C155000ia.LIZIZ(r5)
            r3 = r5
        L6a:
            kotlin.Pair r3 = (kotlin.Pair) r3
            java.lang.Object r2 = r3.getFirst()
            java.lang.Number r2 = (java.lang.Number) r2
            long r10 = r2.longValue()
            java.lang.Object r2 = r3.getSecond()
            java.lang.Number r2 = (java.lang.Number) r2
            long r12 = r2.longValue()
            X.1DFH r2 = X.C0PEM.LIZ
            X.08pq r2 = X.C2107308Nj.LIZ
            X.0Dfp r3 = new X.0Dfp
            long r5 = r0.LLILZIL
            kotlin.jvm.functions.Function0<kotlin.Unit> r7 = r0.LLIZ
            long r8 = r0.LLILZLL
            android.app.Activity r14 = r0.LLILLL
            r15 = 0
            r3 = r3
            r3.<init>(r4, r5, r7, r8, r10, r12, r14, r15)
            r0.LLILLJJLI = r15
            r4 = 3
            r0.LL = r4
            java.lang.Object r0 = X.C23250099c.LJI(r0, r2, r3)
            if (r0 != r1) goto L19
            return r1
        L9f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C344940Dfg.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
