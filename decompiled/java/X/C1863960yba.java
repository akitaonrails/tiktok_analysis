package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.SearchLandingPageResponse;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import com.ss.android.ugc.aweme.tako.router.model.TakoCarriedUpData;
import com.ss.android.ugc.aweme.tako.router.model.TakoCarriedUpRequestInfo;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS141S1100000_27;
import kotlin.jvm.internal.AwS609S0100000_30;
import kotlin.jvm.internal.AwS63S1300000_27;

/* JADX INFO: renamed from: X.0yba, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1863960yba extends C09AY implements Function1<C1863340yaa, Unit> {
    public final /* synthetic */ TakoEnterParams LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C1862660yZU LLILLL;
    public final /* synthetic */ SearchLandingPageResponse LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1863960yba(TakoEnterParams takoEnterParams, String str, C1862660yZU c1862660yZU, SearchLandingPageResponse searchLandingPageResponse, String str2) {
        super(1);
        this.LL = takoEnterParams;
        this.LLILLJJLI = str;
        this.LLILLL = c1862660yZU;
        this.LLILZ = searchLandingPageResponse;
        this.LLILZIL = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1863340yaa c1863340yaa) {
        Map<String, String> map;
        TakoCarriedUpRequestInfo takoCarriedUpRequestInfo;
        C1863340yaa c1863340yaa2 = c1863340yaa;
        c1863340yaa2.LIZ(new AwS63S1300000_27(this.LLILZ, this.LL, this.LLILLL, this.LLILLJJLI, 4));
        Integer carryUpScene = this.LL.getCarryUpScene();
        if (carryUpScene != null) {
            c1863340yaa2.LJII = Integer.valueOf(carryUpScene.intValue());
        }
        new AwS141S1100000_27(this.LL, this.LLILLJJLI, 15).invoke(c1863340yaa2.LIZLLL);
        new AwS609S0100000_30(this.LL, 223).invoke(c1863340yaa2.LIZJ);
        new AwS141S1100000_27(this.LL, this.LLILZIL, 16).invoke(c1863340yaa2.LJFF);
        TakoCarriedUpData takoCarriedUpData = this.LL.carriedUpData;
        if (takoCarriedUpData != null && (takoCarriedUpRequestInfo = takoCarriedUpData.requestInfo) != null) {
            map = takoCarriedUpRequestInfo.messageParams;
        } else {
            map = null;
        }
        c1863340yaa2.LJIIJ = map;
        return Unit.LIZ;
    }
}
