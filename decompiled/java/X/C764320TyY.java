package X;

import com.bytedance.android.live.effect.karaoke.view.KaraokeSettingFragment;
import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0TyY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.karaoke.view.KaraokeSettingFragment$onViewCreated$2", f = "KaraokeSettingFragment.kt", l = {}, m = "invokeSuspend")
public final class C764320TyY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ KaraokeSettingFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C764320TyY(KaraokeSettingFragment karaokeSettingFragment, InterfaceC1364105Vn<? super C764320TyY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = karaokeSettingFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C764320TyY(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("KaraokeSettingFragment@5808.onViewCreated$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        KaraokeViewModel karaokeViewModel = this.LL.LLJJIII;
        if (karaokeViewModel != null) {
            karaokeViewModel.cR2(C764330TyZ.LIZ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("KaraokeSettingFragment@5808.onViewCreated$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
