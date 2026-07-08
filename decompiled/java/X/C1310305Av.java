package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Av, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.mediapicker.ui.main.MediaPickerMainPageKt$MediaPickerMainPage$5$1$1$1", f = "MediaPickerMainPage.kt", l = {}, m = "invokeSuspend")
public final class C1310305Av extends C09AX implements Function2<Unit, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C05P0<Boolean> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1310305Av(C05P0<Boolean> c05p0, InterfaceC1364105Vn<? super C1310305Av> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c05p0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1310305Av(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MediaPickerMainPageKt@611b.MediaPickerMainPage$5$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.setValue(Boolean.TRUE);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MediaPickerMainPageKt@611b.MediaPickerMainPage$5$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(unit, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
