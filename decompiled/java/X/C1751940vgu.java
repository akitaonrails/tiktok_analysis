package X;

import com.ss.android.ugc.aweme.ecommerce.base.ordercenter.repository.OrderCenterEntry;
import com.ss.android.ugc.aweme.ecommerce.base.ordercenter.repository.dto.TradeEntranceInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0vgu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1751940vgu extends C09AY implements Function0<Unit> {
    public final /* synthetic */ OrderCenterEntry LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ TradeEntranceInfo LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1751940vgu(OrderCenterEntry orderCenterEntry, boolean z, TradeEntranceInfo tradeEntranceInfo, String str) {
        super(0);
        this.LL = orderCenterEntry;
        this.LLILLJJLI = z;
        this.LLILLL = tradeEntranceInfo;
        this.LLILZ = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        List<InterfaceC2027807wy> list = this.LL.LLILLL;
        boolean z = this.LLILLJJLI;
        TradeEntranceInfo tradeEntranceInfo = this.LLILLL;
        String str = this.LLILZ;
        for (InterfaceC2027807wy interfaceC2027807wy : (ArrayList) list) {
            String str2 = tradeEntranceInfo.title;
            if (str2 == null) {
                str2 = "";
            }
            interfaceC2027807wy.LIZ(str2, str, tradeEntranceInfo.iconUrl, tradeEntranceInfo.iconDarkUrl, z);
        }
        return Unit.LIZ;
    }
}
