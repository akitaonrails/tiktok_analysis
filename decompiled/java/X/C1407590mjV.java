package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0mjV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.aifingerprint.AIFingerprintHelper$downloadWithRetry$1", f = "AIFingerprintHelper.kt", l = {57, 66}, m = "invokeSuspend")
public final class C1407590mjV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public int LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1407590mjV(int i, InterfaceC1364105Vn<? super C1407590mjV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1407590mjV(this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0064 -> B:7:0x0018). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0074 -> B:7:0x0018). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.String r8 = "AIFingerprintHelper@da60.downloadWithRetry$1"
            X.C1C7U.LIZ(r8)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r9.LLILLJJLI
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L7a
            if (r0 == r3) goto L32
            if (r0 != r4) goto L85
            int r2 = r9.LL
            X.C155000ia.LIZIZ(r10)
        L18:
            int r0 = r9.LLILLL
            if (r2 >= r0) goto L7f
            X.0mjU r6 = new X.0mjU
            r0 = 0
            r6.<init>(r0)
            r9.LL = r2
            r9.LLILLJJLI = r3
            r0 = 3000(0xbb8, double:1.482E-320)
            java.lang.Object r10 = X.C099A.LIZJ(r0, r6, r9)
            if (r10 != r5) goto L37
            X.C1C7U.LIZIZ(r8)
            return r5
        L32:
            int r2 = r9.LL
            X.C155000ia.LIZIZ(r10)
        L37:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            if (r10 == 0) goto L5e
            boolean r7 = r10.booleanValue()
        L3f:
            X.0n64 r6 = X.C1421580n64.LIZIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "download model result: "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "invisible_watermark"
            X.C201955140j.LIZLLL(r6, r0, r1)
            if (r7 == 0) goto L60
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r8)
            return r0
        L5e:
            r7 = 0
            goto L3f
        L60:
            int r2 = r2 + 1
            int r0 = r9.LLILLL
            if (r2 >= r0) goto L18
            com.ss.android.ugc.aweme.aigc.aifingerprint.AIFingerprintConfigModel r0 = X.C1435830nT3.LIZ()
            long r0 = r0.downloadRetryInterval
            r9.LL = r2
            r9.LLILLJJLI = r4
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r9)
            if (r0 != r5) goto L18
            X.C1C7U.LIZIZ(r8)
            return r5
        L7a:
            X.C155000ia.LIZIZ(r10)
            r2 = 0
            goto L18
        L7f:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r8)
            return r0
        L85:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1407590mjV.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
