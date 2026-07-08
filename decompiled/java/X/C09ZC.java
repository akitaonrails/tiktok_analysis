package X;

import com.ss.android.ugc.aweme.relation.usercard.ability.UserCardListAbility;

/* JADX INFO: renamed from: X.09ZC, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.usercard.ability.UserCardListAbility", f = "UserCardListAbility.kt", l = {419, 435}, m = "actualBlockUser")
public final class C09ZC extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ UserCardListAbility LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09ZC(UserCardListAbility userCardListAbility, InterfaceC1364105Vn<? super C09ZC> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = userCardListAbility;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("UserCardListAbility@7b48.actualBlockUser$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(0, null, null, this);
        C1C7U.LIZIZ("UserCardListAbility@7b48.actualBlockUser$1");
        return objLIZ;
    }
}
