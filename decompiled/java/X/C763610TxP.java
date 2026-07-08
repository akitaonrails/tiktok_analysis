package X;

import com.bytedance.android.live.effect.karaoke.view.playlist.KaraokePlayListFragment;
import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0TxP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.karaoke.view.playlist.KaraokePlayListFragment$closePlayListFragment$1", f = "KaraokePlayListFragment.kt", l = {}, m = "invokeSuspend")
public final class C763610TxP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ KaraokePlayListFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C763610TxP(KaraokePlayListFragment karaokePlayListFragment, InterfaceC1364105Vn<? super C763610TxP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = karaokePlayListFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C763610TxP(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("KaraokePlayListFragment@479b.closePlayListFragment$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        KaraokeViewModel karaokeViewModel = this.LL.LLILZ;
        if (karaokeViewModel != null) {
            karaokeViewModel.cR2(new C764120TyE(false));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("KaraokePlayListFragment@479b.closePlayListFragment$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
