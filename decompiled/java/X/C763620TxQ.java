package X;

import com.bytedance.android.live.effect.karaoke.view.library.KaraokePageFragment;
import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0TxQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.karaoke.view.library.KaraokePageFragment$initView$7$1", f = "KaraokePageFragment.kt", l = {}, m = "invokeSuspend")
public final class C763620TxQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ KaraokePageFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C763620TxQ(KaraokePageFragment karaokePageFragment, InterfaceC1364105Vn<? super C763620TxQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = karaokePageFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C763620TxQ(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("KaraokePageFragment@98bb.initView$7$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        KaraokeViewModel karaokeViewModel = this.LL.LLJIJIL;
        if (karaokeViewModel != null) {
            karaokeViewModel.cR2(new C764120TyE(false));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("KaraokePageFragment@98bb.initView$7$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
