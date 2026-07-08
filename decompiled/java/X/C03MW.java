package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PlaceOrderButtonInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.03MW, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03MW extends C09AY implements Function2<C03MZ, PlaceOrderButtonInfo, Unit> {
    public final /* synthetic */ C259800zU<C03MQ> LL;
    public final /* synthetic */ C03MC LLILLJJLI;
    public final /* synthetic */ C013C LLILLL;
    public final /* synthetic */ List<C03MY> LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ C259800zU<Integer> LLILZLL;
    public final /* synthetic */ C259800zU<Float> LLIZ;
    public final /* synthetic */ C259800zU<Integer> LLIZLLLIL;
    public final /* synthetic */ C259800zU<Integer> LLJ;
    public final /* synthetic */ C259800zU<Integer> LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03MW(C259800zU c259800zU, C03MC c03mc, OrderSubmitAssemViewModel orderSubmitAssemViewModel, C013C c013c, List list, int i, C259800zU c259800zU2, C259800zU c259800zU3, C259800zU c259800zU4, C259800zU c259800zU5, C259800zU c259800zU6) {
        super(2);
        this.LL = c259800zU;
        this.LLILLJJLI = c03mc;
        this.LLILLL = c013c;
        this.LLILZ = list;
        this.LLILZIL = i;
        this.LLILZLL = c259800zU2;
        this.LLIZ = c259800zU3;
        this.LLIZLLLIL = c259800zU4;
        this.LLJ = c259800zU5;
        this.LLJI = c259800zU6;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [T, X.03MQ] */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(C03MZ c03mz, PlaceOrderButtonInfo placeOrderButtonInfo) {
        int iIntValue;
        PlaceOrderButtonInfo placeOrderButtonInfo2 = placeOrderButtonInfo;
        int i = C829803Ma.LIZ[c03mz.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    this.LLILLJJLI.getClass();
                    this.LLILZ.add(new C03MY(new C833003Ng(true, 2), new C830003Mc(3, Integer.valueOf(this.LLILZIL), this.LLJ.element, this.LLJI.element, this.LLIZ.element, null, 66), C03MC.LIZIZ(placeOrderButtonInfo2), true, null, false, C03MZ.DOUBLE_RIGHT, null, 304));
                    this.LLILLL.element = true;
                } else {
                    throw new C1954807lC();
                }
            } else {
                this.LLILLJJLI.getClass();
                C03MQ c03mqLIZIZ = C03MC.LIZIZ(placeOrderButtonInfo2);
                List<C03MY> list = this.LLILZ;
                C833003Ng c833003Ng = new C833003Ng(true, 2);
                Integer numValueOf = Integer.valueOf(this.LLILZIL);
                Integer num = this.LLILZLL.element;
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = R.attr.a07;
                }
                list.add(new C03MY(c833003Ng, new C830003Mc(3, numValueOf, null, Integer.valueOf(iIntValue), this.LLIZ.element, this.LLIZLLLIL.element, 2), c03mqLIZIZ, true, null, false, C03MZ.DOUBLE_LEFT, null, 304));
                this.LLILLL.element = true;
            }
        } else {
            C259800zU<C03MQ> c259800zU = this.LL;
            this.LLILLJJLI.getClass();
            c259800zU.element = C03MC.LIZIZ(placeOrderButtonInfo2);
            this.LLILLL.element = false;
        }
        return Unit.LIZ;
    }
}
