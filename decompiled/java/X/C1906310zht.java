package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0zht, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.follow.logic.RelationTextDelegate$initViewClick$1$1", f = "RelationTextDelegate.kt", l = {69}, m = "invokeSuspend")
public final class C1906310zht extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1908710zll LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1906310zht(C1908710zll c1908710zll, InterfaceC1364105Vn<? super C1906310zht> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1908710zll;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1906310zht(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0095  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.String r4 = "RelationTextDelegate@f82c.initViewClick$1$1"
            X.C1C7U.LIZ(r4)
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r5.LL
            r1 = 1
            if (r0 == 0) goto L21
            if (r0 != r1) goto L3a
            X.C155000ia.LIZIZ(r6)
        L13:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r0 = r6.booleanValue()
            if (r0 != r1) goto L42
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r4)
            return r0
        L21:
            X.C155000ia.LIZIZ(r6)
            X.0zll r0 = r5.LLILLJJLI
            X.0zln r0 = r0.LLJILJIL
            kotlin.jvm.functions.Function1 r0 = r0.getFollowClickInterceptor()
            if (r0 == 0) goto L42
            r5.LL = r1
            java.lang.Object r6 = r0.invoke(r5)
            if (r6 != r2) goto L13
            X.C1C7U.LIZIZ(r4)
            return r2
        L3a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L42:
            X.0ihF r3 = X.C1252430ihF.LIZ
            X.0zll r0 = r5.LLILLJJLI
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.LJI()
            int r0 = r0.getFollowStatus()
            int r2 = X.C1387080mCQ.LIZ(r0)
            X.0zll r0 = r5.LLILLJJLI
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.LJI()
            int r1 = r0.getFollowerStatus()
            X.0zll r0 = r5.LLILLJJLI
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.LJI()
            boolean r0 = r0.isAccuratePrivateAccount()
            r3.getClass()
            int r3 = X.C1252430ihF.LIZIZ(r2, r1, r0)
            X.0zll r0 = r5.LLILLJJLI
            X.0zln r0 = r0.LLJILJIL
            kotlin.jvm.functions.Function2 r2 = r0.getFollowClickListener()
            if (r2 == 0) goto L8c
            X.0zll r0 = r5.LLILLJJLI
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.LJI()
            int r0 = r0.getFollowStatus()
            X.0SY7 r1 = X.C0SY5.LIZ(r0)
            X.0SY7 r0 = X.C0SY5.LIZ(r3)
            r2.invoke(r1, r0)
        L8c:
            X.0zll r0 = r5.LLILLJJLI
            r2 = 0
            boolean r0 = r0.LJIIJ(r3, r2)
            if (r0 == 0) goto L9b
            X.0zll r1 = r5.LLILLJJLI
            r0 = 1
            r1.LIZJ(r2, r0)
        L9b:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1906310zht.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
