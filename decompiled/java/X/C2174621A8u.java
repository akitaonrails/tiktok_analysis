package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.1A8u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.feed.FriendsTabRecUserBigCardController$fetchRecUserData$1", f = "FriendsTabRecUserBigCardController.kt", l = {}, m = "invokeSuspend")
public final class C2174621A8u extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C2174641A8w LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2174621A8u(C2174641A8w c2174641A8w, InterfaceC1364105Vn<? super C2174621A8u> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c2174641A8w;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2174621A8u(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FriendsTabRecUserBigCardController@2dfe.fetchRecUserData$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C2174641A8w c2174641A8w = this.LL;
        boolean z = false;
        c2174641A8w.LIZIZ = false;
        if (C2174641A8w.LIZLLL()) {
            z = !c2174641A8w.LIZ.pc("homepage_friends");
        }
        if (!z) {
            int i = C2187451AjH.LIZ;
            C1720106oR.LJI("TTRecUserFriendsTabController", "[fetchRecUserData] is not match fetch condition");
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("FriendsTabRecUserBigCardController@2dfe.fetchRecUserData$1");
            return unit;
        }
        int i2 = C2187451AjH.LIZ;
        C1720106oR.LJI("TTRecUserFriendsTabController", "[fetchRecUserData start");
        this.LL.LIZ.a22("homepage_friends", null);
        if (C293070BeD.LIZ()) {
            C0CVA.LIZ();
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("FriendsTabRecUserBigCardController@2dfe.fetchRecUserData$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
