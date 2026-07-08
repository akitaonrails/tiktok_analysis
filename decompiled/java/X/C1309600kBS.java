package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.ug.trending.idl.TrendingApi;
import com.ss.android.ugc.aweme.ecommerce.ug.trending.idl.WriteImpressionRequest;
import com.ss.android.ugc.aweme.ecommerce.ug.trending.idl.dto.ChannelData;
import com.ss.android.ugc.aweme.ecommerce.ug.trending.idl.dto.Feed;
import com.ss.android.ugc.aweme.ecommerce.ug.trending.idl.dto.SessionInfo;
import com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0kBS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.ug.trending.list.model.ECTrendingRepo$operator$1$writeImpression$1$resp$1", f = "ECTrendingRepo.kt", l = {147}, m = "invokeSuspend")
public final class C1309600kBS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C0X52<BaseResponse<ChannelData>>>, Object> {
    public int LL;
    public final /* synthetic */ C1743010vSV LLILLJJLI;
    public final /* synthetic */ List<Feed> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1309600kBS(C1743010vSV c1743010vSV, List<Feed> list, InterfaceC1364105Vn<? super C1309600kBS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1743010vSV;
        this.LLILLL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1309600kBS(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        String str;
        C1C7U.LIZ("ECTrendingRepo@56f7.operator$1$writeImpression$1$resp$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        Object obj2 = null;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C1743010vSV c1743010vSV = this.LLILLJJLI;
                List<Feed> list = this.LLILLL;
                TrendingApi.API api = TrendingApi.LIZ;
                if (Intrinsics.LJFF(c1743010vSV.LLILLL, "auction")) {
                    str = "SubFeedType_Channel_Feed_Auction";
                } else {
                    str = "SubFeedType_Channel_Feed_Trend";
                }
                String str2 = c1743010vSV.LL;
                if (str2 == null) {
                    str2 = "";
                }
                WriteImpressionRequest writeImpressionRequest = new WriteImpressionRequest(str, list, new SessionInfo(str2, null));
                this.LL = 1;
                obj = api.westernChannelImpressionWrite(writeImpressionRequest, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("ECTrendingRepo@56f7.operator$1$writeImpression$1$resp$1");
                    return objLJFF;
                }
            }
            c098200Yq = (C0X52) obj;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj2 = c098200Yq;
        }
        C1C7U.LIZIZ("ECTrendingRepo@56f7.operator$1$writeImpression$1$resp$1");
        return obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0X52<BaseResponse<ChannelData>>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
