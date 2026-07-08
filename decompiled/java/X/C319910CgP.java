package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CgP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.volume.BaseEditVolumeV2Component$enableOriginSound$4", f = "BaseEditVolumeV2Component.kt", l = {}, m = "invokeSuspend")
public final class C319910CgP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AbstractC1459270o4r LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C319910CgP(AbstractC1459270o4r abstractC1459270o4r, boolean z, InterfaceC1364105Vn<? super C319910CgP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = abstractC1459270o4r;
        this.LLILLJJLI = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C319910CgP(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BaseEditVolumeV2Component@47c1.enableOriginSound$4");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LLLFF.LJIIJ(Boolean.valueOf(this.LLILLJJLI));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BaseEditVolumeV2Component@47c1.enableOriginSound$4");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
