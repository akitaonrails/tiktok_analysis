package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HRv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.iddropdown.MixStudioIdDropdownView$scrollIdTabsToTab$1", f = "MixStudioIdDropdownView.kt", l = {}, m = "invokeSuspend")
public final class C441210HRv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C441190HRt LL;
    public final /* synthetic */ LinearLayoutManager LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C441210HRv(C441190HRt c441190HRt, LinearLayoutManager linearLayoutManager, int i, InterfaceC1364105Vn<? super C441210HRv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c441190HRt;
        this.LLILLJJLI = linearLayoutManager;
        this.LLILLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C441210HRv(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MixStudioIdDropdownView@743b.scrollIdTabsToTab$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LLJJ.stopScroll();
        this.LLILLJJLI.scrollToPositionWithOffset(this.LLILLL, 0);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MixStudioIdDropdownView@743b.scrollIdTabsToTab$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
