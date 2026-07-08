package X;

import com.bytedance.android.livesdk.wallet.Diamond;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0fdi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1134920fdi extends C09AY implements Function2<Diamond, C1796560wqs, Unit> {
    public final /* synthetic */ Function0<Unit> LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ Diamond LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1134920fdi(Function0<Unit> function0, int i, Diamond diamond) {
        super(2);
        this.LL = function0;
        this.LLILLJJLI = i;
        this.LLILLL = diamond;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Diamond diamond, C1796560wqs c1796560wqs) {
        EnumC1134330fcl enumC1134330fcl = EnumC1134330fcl.LOCAL_CURRENCY_GIFT_PRICE_GAP;
        HashMap map = new HashMap();
        map.put("price_gap", Integer.valueOf(this.LLILLJJLI - this.LLILLL.count));
        C1134320fck.LJFF(enumC1134330fcl, map);
        Function0<Unit> function0 = this.LL;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.LIZ;
    }
}
