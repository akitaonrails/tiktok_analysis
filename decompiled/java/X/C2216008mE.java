package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08mE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.usercard.ability.UserCardListAbility$actualBlockUser$2$1", f = "UserCardListAbility.kt", l = {}, m = "invokeSuspend")
public final class C2216008mE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ int LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2216008mE(int i, InterfaceC1364105Vn<? super C2216008mE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2216008mE(this.LL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.String r3 = "UserCardListAbility@7b48.actualBlockUser$2$1"
            X.C1C7U.LIZ(r3)
            X.C099R.LJFF()
            X.C155000ia.LIZIZ(r5)
            boolean r0 = X.C299940BpI.LIZ()
            if (r0 == 0) goto L40
            X.0mCc r0 = X.C1906580ziK.LIZIZ()
            if (r0 == 0) goto L63
            android.app.Activity r0 = r0.LIZIZ()
            if (r0 == 0) goto L63
            android.app.Activity r0 = X.C1388190mED.LIZ(r0)
            if (r0 == 0) goto L63
            int r2 = r4.LL
            X.0mGx r1 = new X.0mGx
            r1.<init>(r0)
            r0 = 4
            if (r2 != r0) goto L3c
            r0 = 2131837582(0x7f11428e, float:1.9308363E38)
        L30:
            r1.LJIIIZ(r0)
            r1.LJIIJJI()
            kotlin.Unit r0 = kotlin.Unit.LIZ
        L38:
            X.C1C7U.LIZIZ(r3)
            return r0
        L3c:
            r0 = 2131837581(0x7f11428d, float:1.9308361E38)
            goto L30
        L40:
            X.0mCc r0 = X.C1906580ziK.LIZIZ()
            if (r0 == 0) goto L63
            android.app.Activity r0 = r0.LIZIZ()
            if (r0 == 0) goto L63
            android.app.Activity r0 = X.C1388190mED.LIZ(r0)
            if (r0 == 0) goto L63
            X.0mGx r1 = new X.0mGx
            r1.<init>(r0)
            r0 = 2131826446(0x7f11170e, float:1.9285777E38)
            r1.LJIIIZ(r0)
            r1.LJIIJJI()
            kotlin.Unit r0 = kotlin.Unit.LIZ
            goto L38
        L63:
            r0 = 0
            goto L38
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2216008mE.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
