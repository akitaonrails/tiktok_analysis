package X;

import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.097A, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel$notifyAnchorKaraokeState$2$fetchTabList$2", f = "KaraokeViewModel.kt", l = {863}, m = "invokeSuspend")
public final class C097A extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends C763870Txp>>, Object> {
    public int LL;
    public final /* synthetic */ KaraokeViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C097A(KaraokeViewModel karaokeViewModel, InterfaceC1364105Vn<? super C097A> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = karaokeViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C097A(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("KaraokeViewModel@e9e0.notifyAnchorKaraokeState$2$fetchTabList$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C0U2Y c0u2y = this.LLILLJJLI.LL;
            this.LL = 1;
            obj = c0u2y.LJIIIIZZ(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("KaraokeViewModel@e9e0.notifyAnchorKaraokeState$2$fetchTabList$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("KaraokeViewModel@e9e0.notifyAnchorKaraokeState$2$fetchTabList$2");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends C763870Txp>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
