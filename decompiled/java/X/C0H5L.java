package X;

import com.bytedance.keva.Keva;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0H5L, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.aigc.AIGCOverLabelBannerAssem$displayView$1", f = "AIGCOverLabelBannerAssemTrigger.kt", l = {}, m = "invokeSuspend")
public final class C0H5L extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0H5L(String str, InterfaceC1364105Vn<? super C0H5L> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0H5L(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIGCOverLabelBannerAssem@c4bb.displayView$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0H5M c0h5m = C0H5M.LIZ;
        String str = this.LL;
        c0h5m.getClass();
        if (str != null && str.length() != 0) {
            ((Keva) C0H5M.LIZIZ.getValue()).storeInt(C0H5M.LIZIZ("show_count", str), C0H5M.LIZ(str) + 1);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AIGCOverLabelBannerAssem@c4bb.displayView$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
