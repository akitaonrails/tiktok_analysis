package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0Lzy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.da.DraftMonitorHelper$mobDraftEntrance$1", f = "DraftMonitorHelper.kt", l = {}, m = "invokeSuspend")
public final class C561360Lzy extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ EnumC562220M3g LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C561360Lzy(EnumC562220M3g enumC562220M3g, String str, InterfaceC1364105Vn<? super C561360Lzy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = enumC562220M3g;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C561360Lzy(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DraftMonitorHelper@824c.mobDraftEntrance$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        int iLIZLLL = C0M4A.LIZLLL(new C0M4E(null, null, null, false, this.LL, null, null, null, false, null, 1007));
        C0LAB c0lab = new C0LAB();
        c0lab.LIZ(iLIZLLL, "draft_cnt");
        c0lab.LJ("enter_from", this.LLILLJJLI);
        c0lab.LIZ(Intrinsics.LJFF(this.LLILLJJLI, "shoot_page_edit_tab") ? 1 : 0, "is_from_edit_tab");
        C20684815ws.LJIILLIIL("click_draft_entrance", c0lab.LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DraftMonitorHelper@824c.mobDraftEntrance$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
