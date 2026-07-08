package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NWz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.activity.status.sdk.core.ActivityStatusDataSource$startPolling$1", f = "ActivityStatusDataSource.kt", l = {279, 280}, m = "invokeSuspend")
public final class C595430NWz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0NX1 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C595430NWz(C0NX1 c0nx1, InterfaceC1364105Vn<? super C595430NWz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c0nx1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C595430NWz c595430NWz = new C595430NWz(this.LLILLL, interfaceC1364105Vn);
        c595430NWz.LLILLJJLI = obj;
        return c595430NWz;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ad  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x009e -> B:7:0x001a). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.String r11 = "ActivityStatusDataSource@11bf.startPolling$1"
            X.C1C7U.LIZ(r11)
            java.lang.Object r4 = X.C099R.LJFF()
            int r2 = r12.LL
            r0 = 2
            r1 = 1
            if (r2 == 0) goto La4
            if (r2 == r1) goto L84
            if (r2 != r0) goto Lb3
            java.lang.Object r3 = r12.LLILLJJLI
            X.01wk r3 = (X.InterfaceC497601wk) r3
            X.C155000ia.LIZIZ(r13)
        L1a:
            r1 = 1
        L1b:
            boolean r0 = X.C2296808zG.LJI(r3)
            if (r0 == 0) goto Lad
            X.0NX1 r6 = r12.LLILLL
            r12.LLILLJJLI = r3
            r12.LL = r1
            X.0NXA r9 = r6.LIZIZ
            java.util.concurrent.ConcurrentHashMap r0 = r9.LIZIZ()
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
            r8.<init>()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r10 = r0.iterator()
        L3a:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L68
            java.lang.Object r7 = r10.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r0 = r7.getValue()
            X.0NX7 r0 = (X.C0NX7) r0
            X.0NXG r5 = r9.LIZLLL
            X.0NXK r2 = r0.LJ
            long r0 = r0.LIZIZ
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            boolean r0 = r5.LIZIZ(r2, r0)
            if (r0 == 0) goto L3a
            java.lang.Object r1 = r7.getKey()
            java.lang.Object r0 = r7.getValue()
            r8.put(r1, r0)
            goto L3a
        L68:
            java.util.Set r0 = r8.keySet()
            java.util.List r1 = X.C13LP.LLIIII(r0)
            java.lang.String r0 = "fetch"
            java.lang.Object r1 = r6.LIZLLL(r0, r1, r12)
            java.lang.Object r0 = X.C099R.LJFF()
            if (r1 == r0) goto L7e
            kotlin.Unit r1 = kotlin.Unit.LIZ
        L7e:
            if (r1 != r4) goto L8b
            X.C1C7U.LIZIZ(r11)
            return r4
        L84:
            java.lang.Object r3 = r12.LLILLJJLI
            X.01wk r3 = (X.InterfaceC497601wk) r3
            X.C155000ia.LIZIZ(r13)
        L8b:
            X.0NX1 r0 = r12.LLILLL
            X.0NWp r0 = r0.LIZJ
            X.0NXH r0 = X.C595320NWo.LIZ(r0)
            long r1 = r0.LJFF
            r12.LLILLJJLI = r3
            r0 = 2
            r12.LL = r0
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r1, r12)
            if (r0 != r4) goto L1a
            X.C1C7U.LIZIZ(r11)
            return r4
        La4:
            X.C155000ia.LIZIZ(r13)
            java.lang.Object r3 = r12.LLILLJJLI
            X.01wk r3 = (X.InterfaceC497601wk) r3
            goto L1b
        Lad:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r11)
            return r0
        Lb3:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C595430NWz.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
