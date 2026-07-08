package X;

import com.bytedance.tiktok.homepage.mainfragment.toolbar.LiveIconGenerator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ixe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.tiktok.homepage.mainfragment.toolbar.LiveIconGenerator$show$1$1", f = "LiveIconGenerator.kt", l = {}, m = "invokeSuspend")
public final class C483480Ixe extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ LiveIconGenerator LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C483480Ixe(LiveIconGenerator liveIconGenerator, InterfaceC1364105Vn<? super C483480Ixe> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = liveIconGenerator;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C483480Ixe(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveIconGenerator@b777.show$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0J6U c0j6u = this.LL.LLJILJILJ;
        if (c0j6u != null) {
            c0j6u.LIZJ(0);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveIconGenerator@b777.show$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
