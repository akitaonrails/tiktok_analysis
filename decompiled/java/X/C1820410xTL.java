package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.onestopshop.cell.promotioncard.PromotionCardCell;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xTL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1820410xTL extends C09AY implements Function0<Unit> {
    public final /* synthetic */ PromotionCardCell LL;
    public final /* synthetic */ C1820460xTQ LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1820410xTL(PromotionCardCell promotionCardCell, C1820460xTQ c1820460xTQ, String str) {
        super(0);
        this.LL = promotionCardCell;
        this.LLILLJJLI = c1820460xTQ;
        this.LLILLL = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.L5().j02(this.LLILLJJLI.LJFF);
        String str = this.LLILLL;
        String str2 = this.LL.L5().LLILZIL.LIZ;
        String str3 = this.LL.LLJILLL;
        if (!Intrinsics.LJFF(this.LLILLL, "go_live")) {
            str3 = null;
        }
        C1820640xTi.LIZLLL(str, "click", str2, new C1820650xTj(str3, this.LLILLJJLI.LJ, null, null, this.LL.I5(), 12));
        return Unit.LIZ;
    }
}
