package X;

import com.ss.android.ugc.aweme.relation.usercard.vm.UserCardListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0e0y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.usercard.vm.UserCardListViewModel$onPrepared$2", f = "UserCardListViewModel.kt", l = {220}, m = "invokeSuspend")
public final class C1072460e0y extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ UserCardListViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1072460e0y(UserCardListViewModel userCardListViewModel, InterfaceC1364105Vn<? super C1072460e0y> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = userCardListViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1072460e0y(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UserCardListViewModel@982.onPrepared$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            boolean z = false;
            if (Intrinsics.LJFF(this.LLILLJJLI.LL.trackerConfig.LIZ, "find_friends_page") && this.LLILLJJLI.LL.apiConfig.LIZ == EnumC1262370ixH.MAF_ADD_NEW_FRIENDS_UI_REDESIGN && ((Number) C295680BiQ.LIZ.getValue()).intValue() == 2) {
                z = true;
            }
            C1056380db2 c1056380db2 = C1056380db2.LIZ;
            String str = this.LLILLJJLI.LL.trackerConfig.LIZ;
            this.LL = 1;
            if (c1056380db2.LIZ(C1071540dzU.LIZIZ.LIZIZ(), str, z, this) == objLJFF) {
                C1C7U.LIZIZ("UserCardListViewModel@982.onPrepared$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("UserCardListViewModel@982.onPrepared$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
