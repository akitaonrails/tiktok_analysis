package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01ai, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.profile.platform.framework.aweme.profile.shared.UserProfileVideoLruCache$removeAll$1", f = "UserProfileVideoLruCache.kt", l = {25, 27}, m = "invokeSuspend")
public final class C361001ai extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1251800igE LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public int LLILZ;
    public final /* synthetic */ C1251800igE LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C361001ai(C1251800igE c1251800igE, InterfaceC1364105Vn<? super C361001ai> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = c1251800igE;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C361001ai(this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x001d, code lost:
    
        if (r1 != r6) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
        /*
            r11 = this;
            java.lang.String r10 = "UserProfileVideoLruCache@3dee.removeAll$1"
            X.C1C7U.LIZ(r10)
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r11.LLILZ
            r5 = 0
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L89
            if (r0 == r3) goto L4f
            if (r0 != r4) goto Lb5
            java.lang.Object r7 = r11.LLILLJJLI
            java.util.Iterator r7 = (java.util.Iterator) r7
            X.0igE r8 = r11.LL
            X.C155000ia.LIZIZ(r12)
        L1d:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto La2
            java.lang.Object r9 = r7.next()
            java.lang.String r9 = (java.lang.String) r9
            if (r9 == 0) goto L1d
            r11.LL = r8
            r11.LLILLJJLI = r7
            r11.LLILLL = r9
            r11.LLILZ = r3
            r8.getClass()
            X.1DFB r1 = X.C0PEM.LIZJ
            X.01ah r0 = new X.01ah
            r0.<init>(r9, r5)
            java.lang.Object r1 = X.C23250099c.LJI(r11, r1, r0)
            java.lang.Object r0 = X.C099R.LJFF()
            if (r1 == r0) goto L49
            kotlin.Unit r1 = kotlin.Unit.LIZ
        L49:
            if (r1 != r6) goto L5c
            X.C1C7U.LIZIZ(r10)
            return r6
        L4f:
            java.lang.Object r9 = r11.LLILLL
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r7 = r11.LLILLJJLI
            java.util.Iterator r7 = (java.util.Iterator) r7
            X.0igE r8 = r11.LL
            X.C155000ia.LIZIZ(r12)
        L5c:
            r2 = 0
            java.lang.String r1 = "aweme_publish"
            java.lang.String r0 = "aweme_popular"
            java.lang.String r2 = kotlin.text.u.LJJIFFI(r9, r1, r0, r2)
            r11.LL = r8
            r11.LLILLJJLI = r7
            r11.LLILLL = r5
            r11.LLILZ = r4
            r8.getClass()
            X.1DFB r1 = X.C0PEM.LIZJ
            X.01ah r0 = new X.01ah
            r0.<init>(r2, r5)
            java.lang.Object r1 = X.C23250099c.LJI(r11, r1, r0)
            java.lang.Object r0 = X.C099R.LJFF()
            if (r1 == r0) goto L83
            kotlin.Unit r1 = kotlin.Unit.LIZ
        L83:
            if (r1 != r6) goto L1d
            X.C1C7U.LIZIZ(r10)
            return r6
        L89:
            X.C155000ia.LIZIZ(r12)
            X.0igE r0 = r11.LLILZIL
            X.01GW r0 = r0.LIZIZ
            java.lang.Object r0 = r0.getValue()
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            java.util.Collection r0 = r0.values()
            X.0igE r8 = r11.LLILZIL
            java.util.Iterator r7 = r0.iterator()
            goto L1d
        La2:
            X.0igE r0 = r11.LLILZIL
            X.01GW r0 = r0.LIZIZ
            java.lang.Object r0 = r0.getValue()
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            r0.clear()
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r10)
            return r0
        Lb5:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C361001ai.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
