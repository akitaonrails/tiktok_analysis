package X;

import com.ss.android.ugc.aweme.relation.usercard.ability.AuthCardListScopeAbility;

/* JADX INFO: renamed from: X.0e0p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.usercard.ability.AuthCardListScopeAbility", f = "AuthCardListScopeAbility.kt", l = {221}, m = "insertAuthResultToList")
public final class C1072370e0p extends AbstractC23140094w {
    public EnumC1070410dxf LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ AuthCardListScopeAbility LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1072370e0p(AuthCardListScopeAbility authCardListScopeAbility, InterfaceC1364105Vn<? super C1072370e0p> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = authCardListScopeAbility;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AuthCardListScopeAbility@fdb1.insertAuthResultToList$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLL.LIZIZ(0, null, this);
        C1C7U.LIZIZ("AuthCardListScopeAbility@fdb1.insertAuthResultToList$1");
        return objLIZIZ;
    }
}
