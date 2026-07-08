package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01aj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.utils.BulletinImageGeckoManagerV2$getBulletinStyleResourcesIndividually$failAll$1", f = "BulletinImageGeckoManagerV2.kt", l = {71}, m = "invokeSuspend")
public final class C361101aj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public final /* synthetic */ InterfaceC1631620sYq<Boolean, String, InterfaceC1364105Vn<? super Unit>, Object>[] LLILZLL;
    public final /* synthetic */ String LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C361101aj(InterfaceC1631620sYq<? super Boolean, ? super String, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object>[] interfaceC1631620sYqArr, String str, InterfaceC1364105Vn<? super C361101aj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = interfaceC1631620sYqArr;
        this.LLIZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C361101aj(this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0036 -> B:6:0x001d). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.String r8 = "BulletinImageGeckoManagerV2@3246.getBulletinStyleResourcesIndividually$failAll$1"
            X.C1C7U.LIZ(r8)
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r9.LLILZIL
            r6 = 1
            if (r0 == 0) goto L3c
            if (r0 != r6) goto L4c
            int r0 = r9.LLILZ
            int r5 = r9.LLILLL
            java.lang.Object r1 = r9.LLILLJJLI
            java.lang.Object r4 = r9.LL
            X.0sYq[] r4 = (X.InterfaceC1631620sYq[]) r4
            X.C155000ia.LIZIZ(r10)
        L1d:
            int r5 = r5 + 1
        L1f:
            if (r5 >= r0) goto L46
            r3 = r4[r5]
            r2 = 0
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r9.LL = r4
            r9.LLILLJJLI = r1
            r9.LLILLL = r5
            r9.LLILZ = r0
            r9.LLILZIL = r6
            java.lang.Object r2 = r3.invoke(r2, r1, r9)
            if (r2 != r7) goto L1d
            X.C1C7U.LIZIZ(r8)
            return r7
        L3c:
            X.C155000ia.LIZIZ(r10)
            X.0sYq<java.lang.Boolean, java.lang.String, X.05Vn<? super kotlin.Unit>, java.lang.Object>[] r4 = r9.LLILZLL
            java.lang.String r1 = r9.LLIZ
            int r0 = r4.length
            r5 = 0
            goto L1f
        L46:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r8)
            return r0
        L4c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C361101aj.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
