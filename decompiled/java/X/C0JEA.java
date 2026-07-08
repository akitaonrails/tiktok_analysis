package X;

import androidx.activity.OnBackPressedDispatcher;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0JEA, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.mediapicker.ui.main.MediaPickerMainPageKt$MediaPickerMainPage$3$1$1", f = "MediaPickerMainPage.kt", l = {}, m = "invokeSuspend")
public final class C0JEA extends C09AX implements Function2<Unit, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ OnBackPressedDispatcher LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JEA(OnBackPressedDispatcher onBackPressedDispatcher, InterfaceC1364105Vn<? super C0JEA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = onBackPressedDispatcher;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0JEA(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MediaPickerMainPageKt@611b.MediaPickerMainPage$3$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        OnBackPressedDispatcher onBackPressedDispatcher = this.LL;
        if (onBackPressedDispatcher != null) {
            onBackPressedDispatcher.LJ();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MediaPickerMainPageKt@611b.MediaPickerMainPage$3$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(unit, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
