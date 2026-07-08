package X;

import com.bytedance.android.live.effect.karaoke.view.library.KaraokePageSongsFragment;
import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Txa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.karaoke.view.library.KaraokePageSongsFragment$onViewCreated$1", f = "KaraokePageSongsFragment.kt", l = {}, m = "invokeSuspend")
public final class C763720Txa extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ KaraokePageSongsFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C763720Txa(KaraokePageSongsFragment karaokePageSongsFragment, InterfaceC1364105Vn<? super C763720Txa> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = karaokePageSongsFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C763720Txa(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("KaraokePageSongsFragment@d4ad.onViewCreated$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        KaraokeViewModel karaokeViewModel = this.LL.LLJ;
        if (karaokeViewModel != null) {
            karaokeViewModel.cR2(C763670TxV.LIZ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("KaraokePageSongsFragment@d4ad.onViewCreated$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
