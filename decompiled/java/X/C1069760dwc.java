package X;

import com.ss.android.ugc.aweme.relation.ffp.ui.cell.RecFriendsQRCell;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0dwc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.ffp.ui.cell.RecFriendsQRCell$onItemClick$1", f = "RecFriendsQRCell.kt", l = {}, m = "invokeSuspend")
public final class C1069760dwc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ RecFriendsQRCell LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1069760dwc(RecFriendsQRCell recFriendsQRCell, InterfaceC1364105Vn<? super C1069760dwc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = recFriendsQRCell;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1069760dwc(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RecFriendsQRCell@2543.onItemClick$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(this.LL.itemView.getContext());
        if (c19egLIZIZ != null) {
            C1070670dy5.LIZ.getClass();
            C621180OYa.LIZ.LJJLJ(c19egLIZIZ, "find_friends_page", null);
            C1069600dwM.LIZ.getClass();
            C1069600dwM.LIZ("find_friends_page", "click", null);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RecFriendsQRCell@2543.onItemClick$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
