package X;

import com.bytedance.android.live.effect.karaoke.view.KaraokeContainerDialog;
import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Tyk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.karaoke.view.KaraokeContainerDialog$onViewCreated$2$1", f = "KaraokeContainerDialog.kt", l = {}, m = "invokeSuspend")
public final class C764440Tyk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ KaraokeContainerDialog LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C764440Tyk(KaraokeContainerDialog karaokeContainerDialog, InterfaceC1364105Vn<? super C764440Tyk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = karaokeContainerDialog;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C764440Tyk(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("KaraokeContainerDialog@566b.onViewCreated$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        KaraokeContainerDialog karaokeContainerDialog = this.LL;
        karaokeContainerDialog.LLJIJIL = "click_outside_close";
        KaraokeViewModel karaokeViewModel = karaokeContainerDialog.LLILZ;
        if (karaokeViewModel != null) {
            karaokeViewModel.cR2(new C764120TyE(true));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("KaraokeContainerDialog@566b.onViewCreated$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
