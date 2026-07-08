package X;

import com.ss.android.ugc.aweme.relation.ffp.ui.FindFriendsPageActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Tnm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.ffp.ui.FindFriendsPageActivity$requireAuthPopup$1", f = "FindFriendsPageActivity.kt", l = {112}, m = "invokeSuspend")
public final class C757640Tnm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ FindFriendsPageActivity LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C757640Tnm(FindFriendsPageActivity findFriendsPageActivity, InterfaceC1364105Vn<? super C757640Tnm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = findFriendsPageActivity;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C757640Tnm(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.String r7 = "FindFriendsPageActivity@67f5.requireAuthPopup$1"
            X.C1C7U.LIZ(r7)
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r8.LL
            r4 = 0
            r5 = 1
            if (r0 == 0) goto L3d
            if (r0 != r5) goto L6f
            X.C155000ia.LIZIZ(r9)
        L14:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            if (r0 != 0) goto L37
        L18:
            com.ss.android.ugc.aweme.relation.ffp.ui.FindFriendsPageActivity r5 = r8.LLILLJJLI
            r5.getClass()
            X.0TNP r0 = X.C0TNP.LIZ
            r0.getClass()
            boolean r0 = X.C0TNP.LIZ()
            if (r0 == 0) goto L37
            androidx.lifecycle.LifecycleCoroutineScope r3 = androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(r5)
            X.1DFB r2 = X.C0PEM.LIZJ
            X.0Tnl r1 = new X.0Tnl
            r1.<init>(r5, r4)
            r0 = 2
            X.C23250099c.LIZLLL(r3, r2, r4, r1, r0)
        L37:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r7)
            return r0
        L3d:
            X.C155000ia.LIZIZ(r9)
            com.ss.android.ugc.aweme.relation.ffp.ui.FindFriendsPageActivity r2 = r8.LLILLJJLI
            r2.getClass()
            kotlin.jvm.internal.AwS595S0100000_16 r1 = new kotlin.jvm.internal.AwS595S0100000_16
            r0 = 421(0x1a5, float:5.9E-43)
            r1.<init>(r2, r0)
            X.0j0t r0 = X.C1072350e0n.LIZ(r2, r1)
            if (r0 == 0) goto L18
            com.ss.android.ugc.aweme.relation.ffp.ui.FindFriendsPageActivity r3 = r8.LLILLJJLI
            X.0e2B r0 = (X.C1073210e2B) r0
            X.095D r2 = r0.LIZIZ()
            if (r2 == 0) goto L18
            Y.AgS293S0100000_12 r1 = new Y.AgS293S0100000_12
            r0 = 52
            r1.<init>(r3, r0)
            r8.LL = r5
            java.lang.Object r0 = r2.collect(r1, r8)
            if (r0 != r6) goto L14
            X.C1C7U.LIZIZ(r7)
            return r6
        L6f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C757640Tnm.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
