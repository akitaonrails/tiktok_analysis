package X;

import com.ss.android.ugc.aweme.feed.model.cardinsert.CardInsertResultInfo;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.relation.recuser.IRecUserService;
import com.ss.android.ugc.feed.platform.cardinsert.data.CardTypeRequest;
import com.ss.android.ugc.feed.platform.cardinsert.data.FeedCardInsertData;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.15bJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20551115bJ extends C09AY implements Function0<Unit> {
    public final /* synthetic */ List<CardInsertResultInfo> LL;
    public final /* synthetic */ InterfaceC20550615bE LLILLJJLI;
    public final /* synthetic */ AbstractC20550515bD LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20551115bJ(FeedCardInsertData feedCardInsertData, List<CardInsertResultInfo> list, InterfaceC20550615bE interfaceC20550615bE, AbstractC20550515bD abstractC20550515bD) {
        super(0);
        this.LL = list;
        this.LLILLJJLI = interfaceC20550615bE;
        this.LLILLL = abstractC20550515bD;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        InterfaceC1589370rSh interfaceC1589370rShLJIILJJIL;
        List listLIZLLL;
        IRecUserService iRecUserService = (IRecUserService) PluggableExtentionKt.pluggableSpi$default(IRecUserService.class, false, false, false, 14, null);
        if (iRecUserService != null && (interfaceC1589370rShLJIILJJIL = iRecUserService.LJIILJJIL()) != null && (listLIZLLL = interfaceC1589370rShLJIILJJIL.LIZLLL(this.LL, this.LLILLJJLI)) != null) {
            AbstractC20550515bD abstractC20550515bD = this.LLILLL;
            Iterator it2 = listLIZLLL.iterator();
            while (it2.hasNext()) {
                abstractC20550515bD.LIZIZ((CardTypeRequest) it2.next(), null);
            }
        }
        return Unit.LIZ;
    }
}
