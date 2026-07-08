package X;

import com.ss.android.ugc.profile.business.cd.ProfileNavbarSettingProtocol;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0cG5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.cd.ProfileNavbarSettingProtocol$checkPopData$1", f = "ProfileNavbarSettingProtocol.kt", l = {417, 419, 422}, m = "invokeSuspend")
public final class C1004950cG5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ProfileNavbarSettingProtocol LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1004950cG5(ProfileNavbarSettingProtocol profileNavbarSettingProtocol, InterfaceC1364105Vn<? super C1004950cG5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = profileNavbarSettingProtocol;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1004950cG5(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a0  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.String r8 = "ProfileNavbarSettingProtocol@e8db.checkPopData$1"
            X.C1C7U.LIZ(r8)
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r9.LL
            r6 = 0
            r5 = 3
            r7 = 2
            r2 = 1
            if (r0 == 0) goto L20
            if (r0 == r2) goto L3d
            if (r0 == r7) goto L80
            if (r0 != r5) goto La4
            X.C155000ia.LIZIZ(r10)
        L1a:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r8)
            return r0
        L20:
            X.C155000ia.LIZIZ(r10)
            com.ss.android.ugc.profile.business.cd.ProfileNavbarSettingProtocol r0 = r9.LLILLJJLI
            X.01GW r0 = r0.LLLILZJ
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            r9.LL = r2
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r9)
            if (r0 != r4) goto L40
            X.C1C7U.LIZIZ(r8)
            return r4
        L3d:
            X.C155000ia.LIZIZ(r10)
        L40:
            com.ss.android.ugc.profile.business.cd.ProfileNavbarSettingProtocol r0 = r9.LLILLJJLI
            com.ss.android.ugc.aweme.standard.vm.IProfilePlatformVM r0 = r0.LLIZLLLIL
            if (r0 == 0) goto L8c
            java.lang.Boolean r1 = r0.wQ2()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L8c
            com.ss.android.ugc.profile.business.cd.ProfileNavbarSettingProtocol r0 = r9.LLILLJJLI
            X.01GW r0 = r0.LLLILZJ
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            r2 = 4400(0x1130, double:2.174E-320)
            long r2 = r2 - r0
            com.ss.android.ugc.profile.business.cd.ProfileNavbarSettingProtocol r0 = r9.LLILLJJLI
            X.01GW r0 = r0.LLLIZZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            long r2 = r2 + r0
            r9.LL = r7
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r2, r9)
            if (r0 != r4) goto L83
            X.C1C7U.LIZIZ(r8)
            return r4
        L80:
            X.C155000ia.LIZIZ(r10)
        L83:
            com.ss.android.ugc.profile.business.cd.ProfileNavbarSettingProtocol r0 = r9.LLILLJJLI
            com.ss.android.ugc.aweme.standard.vm.IProfilePlatformVM r0 = r0.LLIZLLLIL
            if (r0 == 0) goto L8c
            r0.DQ2(r6)
        L8c:
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r3 = X.C2107308Nj.LIZ
            X.0cGR r2 = new X.0cGR
            com.ss.android.ugc.profile.business.cd.ProfileNavbarSettingProtocol r1 = r9.LLILLJJLI
            r0 = 0
            r2.<init>(r1, r0)
            r9.LL = r5
            java.lang.Object r0 = X.C23250099c.LJI(r9, r3, r2)
            if (r0 != r4) goto L1a
            X.C1C7U.LIZIZ(r8)
            return r4
        La4:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1004950cG5.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
