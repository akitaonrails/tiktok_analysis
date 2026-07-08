package X;

import com.ss.android.ugc.aweme.main.assems.mainfragment.MFToolBarAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0qrV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.main.assems.mainfragment.MFToolBarAssem$doOnLaunchOnViewCreated$1", f = "MFToolBarAssem.kt", l = {}, m = "invokeSuspend")
public final class C1566310qrV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ MFToolBarAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1566310qrV(MFToolBarAssem mFToolBarAssem, InterfaceC1364105Vn<? super C1566310qrV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = mFToolBarAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1566310qrV(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MFToolBarAssem@9976.doOnLaunchOnViewCreated$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1582020rGq.LIZJ("scene_top_icon_attach");
        C1150504el.LIZ().LIZLLL("cold_boot_main_fragment_add_left_add_right", false);
        this.LL.Go();
        C1150504el.LIZ().LJI("cold_boot_main_fragment_add_left_add_right", false);
        C1582020rGq.LIZ("scene_top_icon_attach");
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MFToolBarAssem@9976.doOnLaunchOnViewCreated$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
