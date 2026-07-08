package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.network.MixStudioCancelRequest;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.network.MixStudioNetworkAPI;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0HT7, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.network.SafeMixStudioNetworkAPIImpl$cancel$2", f = "SafeMixStudioNetworkAPIImpl.kt", l = {133}, m = "invokeSuspend")
public final class C0HT7 extends C09AX implements Function1<InterfaceC1364105Vn<? super BaseResponse>, Object> {
    public int LL;
    public final /* synthetic */ C0HT4 LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HT7(C0HT4 c0ht4, String str, InterfaceC1364105Vn<? super C0HT7> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = c0ht4;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HT7(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SafeMixStudioNetworkAPIImpl@daff.cancel$2");
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
            C0HT4.LIZJ.LIZ("MixStudioNetworkApi", "cancel latest generation task");
            MixStudioNetworkAPI mixStudioNetworkAPI = this.LLILLJJLI.LIZ;
            MixStudioCancelRequest mixStudioCancelRequest = new MixStudioCancelRequest(this.LLILLL);
            this.LL = 1;
            obj = mixStudioNetworkAPI.cancel(mixStudioCancelRequest, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SafeMixStudioNetworkAPIImpl@daff.cancel$2");
                return objLJFF;
            }
        }
        AbstractC2126608Uu abstractC2126608Uu = (AbstractC2126608Uu) obj;
        abstractC2126608Uu.checkValid();
        C1C7U.LIZIZ("SafeMixStudioNetworkAPIImpl@daff.cancel$2");
        return abstractC2126608Uu;
    }
}
