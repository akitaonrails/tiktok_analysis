package X;

import com.bytedance.android.live.effect.karaoke.view.KaraokeContainerDialogV2;
import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Tz8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.karaoke.view.KaraokeContainerDialogV2$performDragClose$1", f = "KaraokeContainerDialogV2.kt", l = {}, m = "invokeSuspend")
public final class C764680Tz8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ KaraokeContainerDialogV2 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C764680Tz8(KaraokeContainerDialogV2 karaokeContainerDialogV2, InterfaceC1364105Vn<? super C764680Tz8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = karaokeContainerDialogV2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C764680Tz8(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("KaraokeContainerDialogV2@72fc.performDragClose$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        KaraokeViewModel karaokeViewModel = this.LL.LLJZ;
        if (karaokeViewModel != null) {
            karaokeViewModel.cR2(new C764120TyE(true));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("KaraokeContainerDialogV2@72fc.performDragClose$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
