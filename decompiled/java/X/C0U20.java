package X;

import Y.AgS293S0100000_12;
import com.bytedance.android.live.effect.karaoke.KaraokeHoverWidget;
import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0U20, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.karaoke.KaraokeHoverWidget$initObserver$1$2", f = "KaraokeHoverWidget.kt", l = {490}, m = "invokeSuspend")
public final class C0U20 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ KaraokeHoverWidget LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0U20(KaraokeHoverWidget karaokeHoverWidget, InterfaceC1364105Vn<? super C0U20> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = karaokeHoverWidget;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0U20(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C2252331DDr c2252331DDr;
        C1C7U.LIZ("KaraokeHoverWidget@cb85.initObserver$1$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            KaraokeHoverWidget karaokeHoverWidget = this.LLILLJJLI;
            KaraokeViewModel karaokeViewModel = karaokeHoverWidget.LL;
            if (karaokeViewModel != null && (c2252331DDr = karaokeViewModel.LLILLL) != null) {
                AgS293S0100000_12 agS293S0100000_12 = new AgS293S0100000_12(karaokeHoverWidget, 33);
                this.LL = 1;
                if (C2252331DDr.LJIIJ(c2252331DDr, agS293S0100000_12, this) == objLJFF) {
                    C1C7U.LIZIZ("KaraokeHoverWidget@cb85.initObserver$1$2");
                    return objLJFF;
                }
            } else {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("KaraokeHoverWidget@cb85.initObserver$1$2");
                return unit;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
