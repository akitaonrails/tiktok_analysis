package X;

import android.view.ViewGroup;
import com.bytedance.android.livesdk.model.message.ext.PromotionItem;
import kotlin.Unit;

/* JADX INFO: renamed from: X.182W, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C182W extends C09AY implements InterfaceC1631620sYq<Integer, Integer, Long, Unit> {
    public final /* synthetic */ C182V<ViewGroup> LL;
    public final /* synthetic */ PromotionItem LLILLJJLI;
    public final /* synthetic */ Integer LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C182W(C182V<ViewGroup> c182v, PromotionItem promotionItem, Integer num) {
        super(3);
        this.LL = c182v;
        this.LLILLJJLI = promotionItem;
        this.LLILLL = num;
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(Integer num, Integer num2, Long l) {
        int iIntValue = num.intValue();
        num2.intValue();
        this.LL.LJIIJJI(iIntValue, this.LLILLJJLI, l.longValue(), this.LLILLL);
        C182V<ViewGroup> c182v = this.LL;
        if (!c182v.LJII) {
            boolean z = true;
            c182v.LJII = true;
            if (((ViewGroup) c182v.LIZ).getChildCount() <= 0) {
                z = false;
            }
            c182v.LJIIIZ(z);
        }
        return Unit.LIZ;
    }
}
