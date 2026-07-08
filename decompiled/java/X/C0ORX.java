package X;

import com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS240S0000000_9;
import njp.a;

/* JADX INFO: renamed from: X.0ORX, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.core.service.BulletinBoardDataServiceImplInternal$saveBulletinBoardItemListAsync$1", f = "BulletinBoardDataServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C0ORX extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<BulletinBaseItem> LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C0ORW LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0ORX(List<? extends BulletinBaseItem> list, String str, C0ORW c0orw, InterfaceC1364105Vn<? super C0ORX> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LL = list;
        this.LLILLJJLI = str;
        this.LLILLL = c0orw;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0ORX(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        List listLJJII;
        C1C7U.LIZ("BulletinBoardDataServiceImplInternal@8dc8.saveBulletinBoardItemListAsync$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Boolean.valueOf(C622190Oan.LJFF().LIZ().LIZ(C619020OPs.LIZJ(this.LLILLJJLI, false, this.LL)));
        C0ORW c0orw = this.LLILLL;
        List<BulletinBaseItem> list = this.LL;
        c0orw.getClass();
        if (list != null && (listLJJII = C09RB.LJJII(C09RB.LJIJI(new C08QP(C09RB.LJIIIZ(new C1939607ik(list), AFwS240S0000000_9.get$arr$(995)), AFwS240S0000000_9.get$arr$(996)), AFwS240S0000000_9.get$arr$(997)))) != null) {
            C622040OaY c622040OaYLIZLLL = C622190Oan.LJFF().LIZLLL();
            c622040OaYLIZLLL.getClass();
            Iterator it2 = listLJJII.iterator();
            while (it2.hasNext()) {
                c622040OaYLIZLLL.LIZ((C619390ORd) it2.next());
            }
            unit = Unit.LIZ;
        } else {
            unit = null;
        }
        C1C7U.LIZIZ("BulletinBoardDataServiceImplInternal@8dc8.saveBulletinBoardItemListAsync$1");
        return unit;
    }
}
