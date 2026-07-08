package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.video.xtab.XTabESportsHighlightCard;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0zAG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.video.xtab.XTabESportsHighlightCard$loadInitialData$1$1$1", f = "XTabESportsHighlightCard.kt", l = {}, m = "invokeSuspend")
public final class C1885460zAG extends C09AX implements Function2<C1885490zAJ, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ XTabESportsHighlightCard LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1885460zAG(XTabESportsHighlightCard xTabESportsHighlightCard, InterfaceC1364105Vn<? super C1885460zAG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = xTabESportsHighlightCard;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1885460zAG c1885460zAG = new C1885460zAG(this.LLILLJJLI, interfaceC1364105Vn);
        c1885460zAG.LL = obj;
        return c1885460zAG;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("XTabESportsHighlightCard@6cd9.loadInitialData$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1885490zAJ c1885490zAJ = (C1885490zAJ) this.LL;
        XTabESportsHighlightCard xTabESportsHighlightCard = this.LLILLJJLI;
        if (xTabESportsHighlightCard.LLJJL == 1 && !c1885490zAJ.LIZLLL) {
            if (c1885490zAJ.LIZJ) {
                xTabESportsHighlightCard.LJJIJIIJIL();
                this.LLILLJJLI.LLJJL = 0;
            } else {
                xTabESportsHighlightCard.LJJIJL();
                this.LLILLJJLI.LLJJL = 2;
            }
        }
        XTabESportsHighlightCard xTabESportsHighlightCard2 = this.LLILLJJLI;
        if (xTabESportsHighlightCard2.LLJJL == 0 && c1885490zAJ.LIZLLL) {
            xTabESportsHighlightCard2.LLJJL = 1;
        }
        if (xTabESportsHighlightCard2.LLJJL == 2 && !c1885490zAJ.LIZLLL && !c1885490zAJ.LIZJ) {
            if (c1885490zAJ.LIZIZ) {
                View view = xTabESportsHighlightCard2.LLJJJJ;
                if (view != null) {
                    C786410Ut5.LJLLLLLL(0, view);
                }
                RecyclerView recyclerView = xTabESportsHighlightCard2.LLJJJ;
                if (recyclerView != null) {
                    C786410Ut5.LLIZLLLIL(recyclerView, 8);
                }
            } else {
                View view2 = xTabESportsHighlightCard2.LLJJJJ;
                if (view2 != null) {
                    C786410Ut5.LJLLLLLL(8, view2);
                }
                RecyclerView recyclerView2 = xTabESportsHighlightCard2.LLJJJ;
                if (recyclerView2 != null) {
                    C786410Ut5.LLIZLLLIL(recyclerView2, 0);
                }
                C1104200eqA c1104200eqA = xTabESportsHighlightCard2.LLJJJJJIL;
                if (c1104200eqA != null) {
                    c1104200eqA.LL = c1885490zAJ.LIZ;
                    c1104200eqA.notifyDataSetChanged();
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("XTabESportsHighlightCard@6cd9.loadInitialData$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C1885490zAJ c1885490zAJ, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c1885490zAJ, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
