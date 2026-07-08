package X;

import com.ss.android.ugc.gamora.recorder.control.h;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0cAw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.control.FullHorizontalCarrouselRecordDockBarScene$updateUploadIconAnimationViewState$1", f = "FullHorizontalCarrouselRecordDockBarScene.kt", l = {}, m = "invokeSuspend")
public final class C1001760cAw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ h LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1001760cAw(boolean z, h hVar, InterfaceC1364105Vn<? super C1001760cAw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = z;
        this.LLILLJJLI = hVar;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1001760cAw(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FullHorizontalCarrouselRecordDockBarScene@605b.updateUploadIconAnimationViewState$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL) {
            if (this.LLILLJJLI.LLLLLIL().getVisibility() != 8) {
                C786410Ut5.LLD(8, this.LLILLJJLI.LLLLLIL());
                C786410Ut5.G0(this.LLILLJJLI.LLLLJI(), 0);
                C786410Ut5.LLLLLLZZ(this.LLILLJJLI.LLLLL(), 0);
            }
        } else if (this.LLILLJJLI.LLLLLIL().getVisibility() != 0) {
            C786410Ut5.G0(this.LLILLJJLI.LLLLJI(), 4);
            C786410Ut5.LLLLLLZZ(this.LLILLJJLI.LLLLL(), 4);
            C786410Ut5.LLD(0, this.LLILLJJLI.LLLLLIL());
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FullHorizontalCarrouselRecordDockBarScene@605b.updateUploadIconAnimationViewState$1");
        return unit;
    }
}
