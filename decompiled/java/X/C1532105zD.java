package X;

import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.chatnotice.banner.ShareGroupForAIGroupShotPopup;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05zD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.chatnotice.banner.ShareGroupForAIGroupShotPopup$onViewCreated$1$result$1", f = "ShareGroupForAIGroupShotPopup.kt", l = {}, m = "invokeSuspend")
public final class C1532105zD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ ShareGroupForAIGroupShotPopup LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1532105zD(ShareGroupForAIGroupShotPopup shareGroupForAIGroupShotPopup, InterfaceC1364105Vn<? super C1532105zD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = shareGroupForAIGroupShotPopup;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1532105zD(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ShareGroupForAIGroupShotPopup@b877.onViewCreated$1$result$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1389890mGx c1389890mGx = new C1389890mGx(this.LL.requireActivity());
        c1389890mGx.LJIIIZ(2131835415);
        c1389890mGx.LJIIJJI();
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJFF(this.LL, C343970De7.LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ShareGroupForAIGroupShotPopup@b877.onViewCreated$1$result$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
