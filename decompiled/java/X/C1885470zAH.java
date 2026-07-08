package X;

import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.video.xtab.XTabESportsHighlightCard;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.video.xtab.XtabESportshighlightCardVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0zAH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.video.xtab.XTabESportsHighlightCard$loadInitialData$1$1", f = "XTabESportsHighlightCard.kt", l = {182}, m = "invokeSuspend")
public final class C1885470zAH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ XTabESportsHighlightCard LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1885470zAH(XTabESportsHighlightCard xTabESportsHighlightCard, InterfaceC1364105Vn<? super C1885470zAH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = xTabESportsHighlightCard;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1885470zAH(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AnonymousClass0951 anonymousClass0951;
        C1C7U.LIZ("XTabESportsHighlightCard@6cd9.loadInitialData$1$1");
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
            XTabESportsHighlightCard xTabESportsHighlightCard = this.LLILLJJLI;
            XtabESportshighlightCardVM xtabESportshighlightCardVM = xTabESportsHighlightCard.LLJJJJLIIL;
            if (xtabESportshighlightCardVM != null && (anonymousClass0951 = xtabESportshighlightCardVM.LLILLL) != null) {
                C1885460zAG c1885460zAG = new C1885460zAG(xTabESportsHighlightCard, null);
                this.LL = 1;
                if (C09IC.LJII(anonymousClass0951, this, c1885460zAG) == objLJFF) {
                    C1C7U.LIZIZ("XTabESportsHighlightCard@6cd9.loadInitialData$1$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("XTabESportsHighlightCard@6cd9.loadInitialData$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
