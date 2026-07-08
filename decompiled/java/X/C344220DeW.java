package X;

import com.ss.android.ugc.profile.business.ur.following.ui.managefollow.ManageFollowCell;
import com.ss.android.ugc.profile.business.ur.following.ui.managefollow.ManageFollowItem;
import com.ss.android.ugc.profile.business.ur.following.ui.managefollow.SimpleUser;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0DeW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.following.ui.managefollow.ManageFollowCell$onItemViewCreated$1$1", f = "ManageFollowCell.kt", l = {}, m = "invokeSuspend")
public final class C344220DeW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ ManageFollowCell LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C344220DeW(ManageFollowCell manageFollowCell, InterfaceC1364105Vn<? super C344220DeW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = manageFollowCell;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C344220DeW(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        SimpleUser simpleUser;
        C1C7U.LIZ("ManageFollowCell@83f.onItemViewCreated$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C735410St1 c735410St1 = new C735410St1();
        ManageFollowItem item = this.LL.getItem();
        if (item != null && (simpleUser = item.simpleUser) != null) {
            str = simpleUser.uid;
        } else {
            str = null;
        }
        c735410St1.LJJLIIJ = str;
        c735410St1.LIZLLL = "following_list";
        c735410St1.LJJZZIII = "manage_following_page";
        c735410St1.LJIILJJIL();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ManageFollowCell@83f.onItemViewCreated$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
