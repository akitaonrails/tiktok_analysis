package X;

import java.util.Collection;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NJ0, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.goda.GodaV2Manager$getPageValues$1", f = "GodaV2Manager.kt", l = {200, 201, 202}, m = "invokeSuspend")
public final class C0NJ0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super HashMap<String, Object>>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ C0NJ1 LLILZ;
    public final /* synthetic */ Collection<String> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NJ0(C0NJ1 c0nj1, Collection<String> collection, InterfaceC1364105Vn<? super C0NJ0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c0nj1;
        this.LLILZIL = collection;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NJ0(this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009e  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.String r7 = "GodaV2Manager@ed2a.getPageValues$1"
            X.C1C7U.LIZ(r7)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r8.LLILLL
            r4 = 3
            r6 = 2
            r2 = 1
            if (r0 == 0) goto L28
            if (r0 == r2) goto L4a
            if (r0 == r6) goto L76
            if (r0 != r4) goto La0
            java.lang.Object r3 = r8.LLILLJJLI
            java.util.HashMap r3 = (java.util.HashMap) r3
            java.lang.Object r0 = r8.LL
            X.C155000ia.LIZIZ(r9)
        L1f:
            java.util.Map r9 = (java.util.Map) r9
            r3.putAll(r9)
            X.C1C7U.LIZIZ(r7)
            return r0
        L28:
            X.C155000ia.LIZIZ(r9)
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            X.0NJ1 r0 = r8.LLILZ
            X.0NJE r1 = r0.LIZ()
            java.util.Collection<java.lang.String> r0 = r8.LLILZIL
            r8.LL = r3
            r8.LLILLJJLI = r3
            r8.LLILLL = r2
            java.lang.Object r9 = r1.LIZIZ(r0)
            if (r9 != r5) goto L48
            X.C1C7U.LIZIZ(r7)
            return r5
        L48:
            r2 = r3
            goto L55
        L4a:
            java.lang.Object r3 = r8.LLILLJJLI
            java.util.HashMap r3 = (java.util.HashMap) r3
            java.lang.Object r2 = r8.LL
            java.util.HashMap r2 = (java.util.HashMap) r2
            X.C155000ia.LIZIZ(r9)
        L55:
            java.util.Map r9 = (java.util.Map) r9
            r3.putAll(r9)
            X.0NJ1 r0 = r8.LLILZ
            X.0NJ9 r0 = r0.LJ()
            java.util.Collection<java.lang.String> r1 = r8.LLILZIL
            r8.LL = r2
            r8.LLILLJJLI = r2
            r8.LLILLL = r6
            X.0NJE r0 = r0.LIZ
            java.lang.Object r9 = r0.LIZIZ(r1)
            if (r9 != r5) goto L74
            X.C1C7U.LIZIZ(r7)
            return r5
        L74:
            r3 = r2
            goto L81
        L76:
            java.lang.Object r2 = r8.LLILLJJLI
            java.util.HashMap r2 = (java.util.HashMap) r2
            java.lang.Object r3 = r8.LL
            java.util.HashMap r3 = (java.util.HashMap) r3
            X.C155000ia.LIZIZ(r9)
        L81:
            java.util.Map r9 = (java.util.Map) r9
            r2.putAll(r9)
            X.0NJ1 r0 = r8.LLILZ
            X.0NJE r1 = r0.LIZJ()
            java.util.Collection<java.lang.String> r0 = r8.LLILZIL
            r8.LL = r3
            r8.LLILLJJLI = r3
            r8.LLILLL = r4
            java.lang.Object r9 = r1.LIZIZ(r0)
            if (r9 != r5) goto L9e
            X.C1C7U.LIZIZ(r7)
            return r5
        L9e:
            r0 = r3
            goto L1f
        La0:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0NJ0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super HashMap<String, Object>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
