package X;

import com.ss.android.ugc.aweme.relation.api.PlaceUserInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.1A8v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.feed.FriendsTabRecUserBigCardController$fetchRecUserDataByPush$1", f = "FriendsTabRecUserBigCardController.kt", l = {}, m = "invokeSuspend")
public final class C2174631A8v extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C2174641A8w LL;
    public final /* synthetic */ PlaceUserInfo LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2174631A8v(C2174641A8w c2174641A8w, PlaceUserInfo placeUserInfo, Function0<Unit> function0, InterfaceC1364105Vn<? super C2174631A8v> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c2174641A8w;
        this.LLILLJJLI = placeUserInfo;
        this.LLILLL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2174631A8v(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FriendsTabRecUserBigCardController@2dfe.fetchRecUserDataByPush$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LIZIZ = false;
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("TTRecUserFriendsTabController", "[fetchRecUserDataByPush] start");
        this.LL.LIZ.k20(this.LLILLJJLI, this.LLILLL);
        if (C293070BeD.LIZ()) {
            C0CVA.LIZ();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FriendsTabRecUserBigCardController@2dfe.fetchRecUserDataByPush$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
