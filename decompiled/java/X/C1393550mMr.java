package X;

import android.widget.TextView;
import com.ss.android.ugc.aweme.multi.maker.PoiAnchorMaker;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0mMr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1393550mMr extends C09AY implements InterfaceC1631630sYr<Integer, Integer, Integer, Integer, Unit> {
    public final /* synthetic */ InterfaceC1393560mMs LL;
    public final /* synthetic */ C2344009Gk LLILLJJLI;
    public final /* synthetic */ C1393570mMt LLILLL;
    public final /* synthetic */ InterfaceC705550Rlx LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1393550mMr(C2344009Gk c2344009Gk, InterfaceC705550Rlx interfaceC705550Rlx, InterfaceC1393560mMs interfaceC1393560mMs, C1393570mMt c1393570mMt) {
        super(4);
        this.LL = interfaceC1393560mMs;
        this.LLILLJJLI = c2344009Gk;
        this.LLILLL = c1393570mMt;
        this.LLILZ = interfaceC705550Rlx;
    }

    @Override // X.InterfaceC1631630sYr
    public final Unit invoke(Integer num, Integer num2, Integer num3, Integer num4) {
        ((PoiAnchorMaker) this.LL).LJJIJIIJIL(num.intValue(), num2.intValue(), 0, num3.intValue(), num4.intValue(), 0);
        ((AbstractC1066890drz) this.LL).p1(this.LLILLJJLI);
        this.LLILLL.LJIIIZ(this.LL);
        TextView textViewLJIIJJI = this.LLILZ.LJIIJJI();
        if (textViewLJIIJJI != null) {
            textViewLJIIJJI.requestLayout();
        }
        return Unit.LIZ;
    }
}
