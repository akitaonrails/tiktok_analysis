package X;

import com.ss.android.ugc.aweme.ui.feed.photos.assem.PhotoModeLastImageHintAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HIZ, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ui.feed.photos.assem.PhotoModeLastImageHintAssem$handleToast$1$3", f = "PhotoModeLastImageHintAssem.kt", l = {}, m = "invokeSuspend")
public final class C0HIZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ PhotoModeLastImageHintAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HIZ(PhotoModeLastImageHintAssem photoModeLastImageHintAssem, InterfaceC1364105Vn<? super C0HIZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = photoModeLastImageHintAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HIZ(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PhotoModeLastImageHintAssem@a033.handleToast$1$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C21647019ng c21647019ng = this.LL.LLLFFI;
        if (c21647019ng != null) {
            c21647019ng.LJ(3000L, "alpha");
        }
        C21647019ng c21647019ng2 = this.LL.LLLFZ;
        if (c21647019ng2 != null) {
            c21647019ng2.LJ(3000L, "alpha");
        }
        C21647019ng c21647019ng3 = this.LL.LLLFFI;
        if (c21647019ng3 != null) {
            c21647019ng3.LJI(false);
        }
        C21647019ng c21647019ng4 = this.LL.LLLFZ;
        if (c21647019ng4 != null) {
            c21647019ng4.LJI(false);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PhotoModeLastImageHintAssem@a033.handleToast$1$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
