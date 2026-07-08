package X;

import com.ss.android.ugc.aweme.feed.module.SkylightFollowingUserResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0rdZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.base.repo.FollowingFeedSkylightRepo$fetchSkylightDataInternally$followUserItems$1", f = "FollowingFeedSkylightRepo.kt", l = {}, m = "invokeSuspend")
public final class C1596110rdZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C1596020rdQ<? extends SkylightFollowingUserResponse>>, Object> {
    public final /* synthetic */ C1596050rdT LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1596110rdZ(C1596050rdT c1596050rdT, InterfaceC1364105Vn<? super C1596110rdZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1596050rdT;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1596110rdZ(this.LL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0045  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.String r5 = "FollowingFeedSkylightRepo@df9b.fetchSkylightDataInternally$followUserItems$1"
            X.C1C7U.LIZ(r5)
            X.C099R.LJFF()
            X.C155000ia.LIZIZ(r7)
            X.0rdT r1 = r6.LL
            r1.getClass()
            boolean r0 = com.ss.android.ugc.aweme.experiment.FollowingSkylightAbilityOptConfig.LIZ()
            r4 = 0
            if (r0 == 0) goto L45
            X.0rdk r1 = r1.LIZ
            boolean r0 = r1 instanceof X.InterfaceC1596230rdl
            if (r0 == 0) goto L45
            X.0rdl r1 = (X.InterfaceC1596230rdl) r1
            if (r1 == 0) goto L45
            com.ss.android.ugc.aweme.feed.module.SkylightFollowingUserResponse r3 = r1.LJIIJ()
        L25:
            r2 = 60
            if (r3 == 0) goto L3d
            java.util.List r0 = r3.getList()
            if (r0 == 0) goto L3d
            r0.isEmpty()
            X.0rcI r0 = X.EnumC1595320rcI.SUCCESS
            X.0rdQ r1 = new X.0rdQ
            r1.<init>(r3, r0, r4, r2)
        L39:
            X.C1C7U.LIZIZ(r5)
            return r1
        L3d:
            X.0rcI r0 = X.EnumC1595320rcI.FAIL
            X.0rdQ r1 = new X.0rdQ
            r1.<init>(r4, r0, r4, r2)
            goto L39
        L45:
            r3 = r4
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1596110rdZ.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C1596020rdQ<? extends SkylightFollowingUserResponse>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
