package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Z8X, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sharepanel.impl.relations.data.core.BaseRelationModel$recentLoader$1$1", f = "BaseRelationModel.kt", l = {}, m = "invokeSuspend")
public final class C0Z8X extends C09AX implements Function2<Object, InterfaceC1364105Vn<? super Boolean>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1382090m4N LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0Z8X(C1382090m4N c1382090m4N, InterfaceC1364105Vn<? super C0Z8X> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1382090m4N;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0Z8X c0z8x = new C0Z8X(this.LLILLJJLI, interfaceC1364105Vn);
        c0z8x.LL = obj;
        return c0z8x;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.String r6 = "BaseRelationModel@f20a.recentLoader$1$1"
            X.C1C7U.LIZ(r6)
            X.C099R.LJFF()
            X.C155000ia.LIZIZ(r8)
            java.lang.Object r2 = r7.LL
            X.0m4N r1 = r7.LLILLJJLI
            r1.getClass()
            boolean r0 = r2 instanceof X.InterfaceC887210YrH
            r5 = 0
            if (r0 == 0) goto L3a
            X.0YrH r2 = (X.InterfaceC887210YrH) r2
            boolean r0 = r2 instanceof X.C0Z8O
            if (r0 == 0) goto L42
            X.0li4 r0 = r1.LIZ
            boolean r0 = r0.LJIIL
            if (r0 != 0) goto L3a
            r1 = r2
            X.0Z8O r1 = (X.C0Z8O) r1
            X.0Z8S r0 = r1.getExtra()
            boolean r0 = r0.isBanned()
            if (r0 != 0) goto L3a
            X.0Z8S r0 = r1.getExtra()
            boolean r0 = r0.isValid()
            if (r0 != 0) goto L42
        L3a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            X.C1C7U.LIZIZ(r6)
            return r0
        L42:
            boolean r0 = r2 instanceof X.C0Z8N
            if (r0 == 0) goto L59
            r0 = r2
            X.0Z8N r0 = (X.C0Z8N) r0
            r1 = 1
            if (r0 == 0) goto L59
            X.0Z8T r0 = r0.getExtra()
            if (r0 == 0) goto L59
            boolean r0 = r0.isAuthorSupportChat()
            if (r0 != r1) goto L59
            goto L3a
        L59:
            X.0YtF r0 = r2.getExtra()
            X.0YtE r0 = (X.InterfaceC888420YtE) r0
            long r3 = r0.getLastMsgCreatedAt()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L3a
            r5 = 1
            goto L3a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0Z8X.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(obj, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
