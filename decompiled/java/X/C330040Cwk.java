package X;

import com.ss.android.ugc.tiktok.addyours.ui.assem.AddYoursInviteFriendsAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cwk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.tiktok.addyours.ui.assem.AddYoursInviteFriendsAssem$onInvite$1$1", f = "AddYoursInviteFriendsAssem.kt", l = {150, 158}, m = "invokeSuspend")
public final class C330040Cwk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ AddYoursInviteFriendsAssem LLILLL;
    public final /* synthetic */ C330070Cwn LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C330040Cwk(AddYoursInviteFriendsAssem addYoursInviteFriendsAssem, C330070Cwn c330070Cwn, InterfaceC1364105Vn<? super C330040Cwk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = addYoursInviteFriendsAssem;
        this.LLILZ = c330070Cwn;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C330040Cwk(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.String r9 = "AddYoursInviteFriendsAssem@84df.onInvite$1$1"
            X.C1C7U.LIZ(r9)
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r10.LLILLJJLI
            r8 = 2
            r3 = 1
            if (r0 == 0) goto L43
            if (r0 == r3) goto L5f
            if (r0 != r8) goto La9
            java.lang.Object r6 = r10.LL
            X.C155000ia.LIZIZ(r11)
        L18:
            boolean r4 = X.C189200o6.m8isSuccessimpl(r6)
            com.ss.android.ugc.tiktok.addyours.ui.assem.AddYoursInviteFriendsAssem r0 = r10.LLILLL
            X.0qg8 r0 = r0.LLJILJIL
            java.lang.Object r0 = r0.getValue()
            X.0Cwl r0 = (X.C330050Cwl) r0
            X.0Cwo r3 = r0.LLILZ
            if (r3 == 0) goto L3d
            com.ss.android.ugc.tiktok.addyours.ui.assem.AddYoursInviteFriendsAssem r0 = r10.LLILLL
            android.content.Context r2 = r0.getContext()
            com.ss.android.ugc.tiktok.addyours.ui.assem.AddYoursInviteFriendsAssem r0 = r10.LLILLL
            X.0Q7z r1 = X.C1558520qew.LJIIL(r0)
            X.0Cwn r0 = r10.LLILZ
            java.util.List<com.ss.android.ugc.aweme.addyours.model.UserInvitee> r0 = r0.LL
            r3.mobInviteButtonClicked(r2, r1, r4, r0)
        L3d:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r9)
            return r0
        L43:
            X.C155000ia.LIZIZ(r11)
            com.ss.android.ugc.tiktok.addyours.ui.assem.AddYoursInviteFriendsAssem r0 = r10.LLILLL
            X.0Cwn r2 = r10.LLILZ
            X.0qg8 r0 = r0.LLJILJIL     // Catch: java.lang.Throwable -> L69
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L69
            X.0Cwl r0 = (X.C330050Cwl) r0     // Catch: java.lang.Throwable -> L69
            kotlin.jvm.functions.Function2<java.util.List<com.ss.android.ugc.aweme.addyours.model.UserInvitee>, X.05Vn<? super kotlin.Unit>, java.lang.Object> r1 = r0.LLILLJJLI     // Catch: java.lang.Throwable -> L69
            java.util.List<com.ss.android.ugc.aweme.addyours.model.UserInvitee> r0 = r2.LL     // Catch: java.lang.Throwable -> L69
            r10.LLILLJJLI = r3     // Catch: java.lang.Throwable -> L69
            java.lang.Object r11 = r1.invoke(r0, r10)     // Catch: java.lang.Throwable -> L69
            if (r11 != r7) goto L62
            goto Lb1
        L5f:
            X.C155000ia.LIZIZ(r11)     // Catch: java.lang.Throwable -> L69
        L62:
            r6 = r11
            kotlin.Unit r6 = (kotlin.Unit) r6     // Catch: java.lang.Throwable -> L69
            X.C189200o6.m2constructorimpl(r6)     // Catch: java.lang.Throwable -> L69
            goto L75
        L69:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r6 = new X.00Yq
            r6.<init>(r0)
            X.C189200o6.m2constructorimpl(r6)
        L75:
            com.ss.android.ugc.tiktok.addyours.ui.assem.AddYoursInviteFriendsAssem r5 = r10.LLILLL
            java.lang.Throwable r4 = X.C189200o6.m5exceptionOrNullimpl(r6)
            if (r4 == 0) goto L18
            androidx.lifecycle.LifecycleCoroutineScope r3 = androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(r5)
            X.0Cwj r1 = new X.0Cwj
            r2 = 0
            r1.<init>(r5, r2)
            r0 = 3
            X.C23250099c.LIZLLL(r3, r2, r2, r1, r0)
            int r0 = X.C2187451AjH.LIZ
            java.lang.String r1 = "AYInviteAssem"
            java.lang.String r0 = "invite err"
            X.C1720106oR.LIZIZ(r1, r0, r4)
            X.08ps r1 = X.C2108208Ns.LIZ
            X.0Cwi r0 = new X.0Cwi
            r0.<init>(r5, r2)
            r10.LL = r6
            r10.LLILLJJLI = r8
            java.lang.Object r0 = X.C23250099c.LJI(r10, r1, r0)
            if (r0 != r7) goto L18
            X.C1C7U.LIZIZ(r9)
            return r7
        La9:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Lb1:
            X.C1C7U.LIZIZ(r9)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C330040Cwk.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
