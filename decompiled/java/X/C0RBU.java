package X;

import com.ss.android.ugc.aweme.feed.assem.commoditycard.CustomCommodityCardAssem;
import com.ss.android.ugc.feed.platform.cell.interact.biz.BizBottomAreaComponent;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0RBU, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RBU extends C09AY implements Function1<C0RTA, Unit> {
    public final /* synthetic */ BizBottomAreaComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RBU(BizBottomAreaComponent bizBottomAreaComponent) {
        super(1);
        this.LL = bizBottomAreaComponent;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0RTA c0rta) {
        C0RTA c0rta2 = c0rta;
        this.LL.getClass();
        c0rta2.getClass();
        c0rta2.LLILLL = C13LE.LIZ(CustomCommodityCardAssem.class);
        c0rta2.LLJI = R.id.fc1;
        return Unit.LIZ;
    }
}
