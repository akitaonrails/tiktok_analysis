package X;

import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftRetrofitApi;
import com.bytedance.android.livesdk.gift.model.GiftCampaignProgress;
import com.bytedance.android.livesdk.gift.model.GiftCampaignProgressResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01KM, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.gift.base.platform.core.network.CampaignProgressRefresher$runRefreshAfterDebounce$progress$1$1", f = "CampaignProgressRefresher.kt", l = {97}, m = "invokeSuspend")
public final class C01KM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super GiftCampaignProgress>, Object> {
    public int LL;
    public final /* synthetic */ C01KK LLILLJJLI;
    public final /* synthetic */ C01KL LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01KM(C01KK c01kk, C01KL c01kl, InterfaceC1364105Vn<? super C01KM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c01kk;
        this.LLILLL = c01kl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01KM(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        GiftCampaignProgress giftCampaignProgress;
        C1C7U.LIZ("CampaignProgressRefresher@fd31.runRefreshAfterDebounce$progress$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            GiftRetrofitApi giftRetrofitApi = this.LLILLJJLI.LIZLLL;
            C01KL c01kl = this.LLILLL;
            long j = c01kl.LIZ;
            long j2 = c01kl.LIZIZ;
            List<Long> list = c01kl.LIZJ;
            this.LL = 1;
            obj = giftRetrofitApi.getGiftCampaignProgress(j, j2, list, true, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("CampaignProgressRefresher@fd31.runRefreshAfterDebounce$progress$1$1");
                return objLJFF;
            }
        }
        GiftCampaignProgressResponse.Data data = (GiftCampaignProgressResponse.Data) ((BaseResponse) obj).data;
        if (data != null) {
            giftCampaignProgress = data.giftCampaignProgress;
        } else {
            giftCampaignProgress = null;
        }
        C1C7U.LIZIZ("CampaignProgressRefresher@fd31.runRefreshAfterDebounce$progress$1$1");
        return giftCampaignProgress;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super GiftCampaignProgress> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
