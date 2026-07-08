package X;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05wV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.pet.flow.StreakInviteUtil$afterFollowSuccess$2", f = "StreakInviteUtil.kt", l = {100, 101}, m = "invokeSuspend")
public final class C1515305wV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Pair<Boolean, String> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1515305wV(String str, String str2, Pair<Boolean, String> pair, InterfaceC1364105Vn<? super C1515305wV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = pair;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1515305wV(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.String r5 = "StreakInviteUtil@c779.afterFollowSuccess$2"
            X.C1C7U.LIZ(r5)
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r6.LL
            r2 = 1
            r3 = 2
            if (r0 == 0) goto L59
            if (r0 == r2) goto L6e
            if (r0 != r3) goto L83
            X.C155000ia.LIZIZ(r7)
        L16:
            kotlin.Pair r7 = (kotlin.Pair) r7
            java.lang.Object r0 = r7.getFirst()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L3a
            kotlin.Pair<java.lang.Boolean, java.lang.String> r0 = r6.LLILZ
            java.lang.Object r1 = r0.getSecond()
            java.lang.String r1 = (java.lang.String) r1
            X.064r r0 = X.C15491064r.LIZIZ
            r0.getClass()
            X.C15491064r.LIZIZ(r1)
        L34:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r5)
            return r0
        L3a:
            X.064r r1 = X.C15491064r.LIZIZ
            java.lang.Object r0 = r7.getSecond()
            java.lang.String r0 = (java.lang.String) r0
            r1.getClass()
            X.054G r3 = X.C15491064r.LIZLLL
            X.05wU r2 = new X.05wU
            r1 = 0
            r2.<init>(r0, r1)
            r0 = 3
            X.C23250099c.LIZLLL(r3, r1, r1, r2, r0)
            X.05u9 r1 = X.C1500705u9.LIZIZ
            java.lang.String r0 = "inbox_follow_no_invite"
            X.C1500705u9.LIZIZ(r1, r0)
            goto L34
        L59:
            X.C155000ia.LIZIZ(r7)
            com.ss.android.ugc.aweme.im.streak.impl.exp.StreakShareConfig r0 = X.C06FV.LIZ()
            long r0 = r0.followDialogSecondRequestDelay
            r6.LL = r2
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r6)
            if (r0 != r4) goto L71
            X.C1C7U.LIZIZ(r5)
            return r4
        L6e:
            X.C155000ia.LIZIZ(r7)
        L71:
            X.064r r2 = X.C15491064r.LIZIZ
            java.lang.String r1 = r6.LLILLJJLI
            java.lang.String r0 = r6.LLILLL
            r6.LL = r3
            java.lang.Object r7 = r2.LIZJ(r1, r0, r6)
            if (r7 != r4) goto L16
            X.C1C7U.LIZIZ(r5)
            return r4
        L83:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1515305wV.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
