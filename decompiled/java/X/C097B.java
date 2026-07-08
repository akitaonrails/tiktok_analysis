package X;

import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.097B, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel$notifyAnchorKaraokeState$2$fetchTabList$1", f = "KaraokeViewModel.kt", l = {}, m = "invokeSuspend")
public final class C097B extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<C763870Txp>>, Object> {
    public final /* synthetic */ KaraokeViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C097B(KaraokeViewModel karaokeViewModel, InterfaceC1364105Vn<? super C097B> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = karaokeViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C097B(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("KaraokeViewModel@e9e0.notifyAnchorKaraokeState$2$fetchTabList$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<C763870Txp> list = this.LL.LL.LJFF;
        C1C7U.LIZIZ("KaraokeViewModel@e9e0.notifyAnchorKaraokeState$2$fetchTabList$1");
        return list;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<C763870Txp>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
