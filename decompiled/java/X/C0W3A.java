package X;

import com.ss.android.ugc.profile.platform.base.data.EventParams;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0W3A, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.profile.menu.view.SearchableMenuCell$SearchableMenuCellViewHolder$handleEventParams$1", f = "SearchableMenuCell.kt", l = {}, m = "invokeSuspend")
public final class C0W3A extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<EventParams> LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C1249650icl LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0W3A(List<EventParams> list, int i, String str, C1249650icl c1249650icl, InterfaceC1364105Vn<? super C0W3A> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
        this.LLILLJJLI = i;
        this.LLILLL = str;
        this.LLILZ = c1249650icl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0W3A(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchableMenuCell$SearchableMenuCellViewHolder@201a.handleEventParams$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1249240ic6 c1249240ic6 = C1249240ic6.LIZ;
        List<EventParams> list = this.LL;
        int i = this.LLILLJJLI;
        String str = this.LLILLL;
        if (str == null) {
            str = "";
        }
        String strValueOf = String.valueOf(this.LLILZ.LJ);
        String strValueOf2 = String.valueOf(this.LLILZ.LJFF);
        c1249240ic6.getClass();
        C1249240ic6.LJFF(list, false, false, i, "", "", false, false, true, str, strValueOf, strValueOf2);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchableMenuCell$SearchableMenuCellViewHolder@201a.handleEventParams$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
