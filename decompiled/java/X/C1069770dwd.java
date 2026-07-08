package X;

import com.ss.android.ugc.aweme.relation.ffp.ui.cell.RecFriendsAuthCell;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0dwd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.ffp.ui.cell.RecFriendsAuthCell$onItemClick$1", f = "RecFriendsAuthCell.kt", l = {}, m = "invokeSuspend")
public final class C1069770dwd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ RecFriendsAuthCell LL;
    public final /* synthetic */ C1069700dwW LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1069770dwd(RecFriendsAuthCell recFriendsAuthCell, C1069700dwW c1069700dwW, InterfaceC1364105Vn<? super C1069770dwd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = recFriendsAuthCell;
        this.LLILLJJLI = c1069700dwW;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1069770dwd(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RecFriendsAuthCell@b564.onItemClick$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(this.LL.itemView.getContext());
        if (c19egLIZIZ != null) {
            C1069700dwW c1069700dwW = this.LLILLJJLI;
            RecFriendsAuthCell recFriendsAuthCell = this.LL;
            if (c1069700dwW.LL == EnumC1070410dxf.CONTACT) {
                ((C1910890zpH) recFriendsAuthCell.LLIZLLLIL.getValue()).LIZ("auth_cell", "handle contact auth cell click");
                C1070670dy5.LIZIZ(C1070670dy5.LIZ, c19egLIZIZ, c1069700dwW.LLILZ.LIZ, "click", 8);
            } else {
                ((C1910890zpH) recFriendsAuthCell.LLIZLLLIL.getValue()).LIZ("auth_cell", "handle facebook auth cell click");
                C1070670dy5.LIZJ(C1070670dy5.LIZ, c19egLIZIZ, c1069700dwW.LLILZ.LIZ, "click", 8);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RecFriendsAuthCell@b564.onItemClick$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
