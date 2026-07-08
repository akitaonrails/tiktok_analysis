package X;

import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.model.Extra;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import webcast.api.room.GetRoomProfileCardResponse;

/* JADX INFO: renamed from: X.0JG9, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.profile.dao.LiveProfileRepositoryForAudience$asyncRequest$cellsDeferredMap$1$1", f = "LiveProfileRepositoryForAudience.kt", l = {106, 107}, m = "invokeSuspend")
public final class C0JG9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Object>, Object> {
    public int LL;
    public final /* synthetic */ AnonymousClass0957<BaseResponse<GetRoomProfileCardResponse.ResponseData, Extra>> LLILLJJLI;
    public final /* synthetic */ AbstractC495790JcP<?> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0JG9(AnonymousClass0957<? extends BaseResponse<GetRoomProfileCardResponse.ResponseData, Extra>> anonymousClass0957, AbstractC495790JcP<?> abstractC495790JcP, InterfaceC1364105Vn<? super C0JG9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = anonymousClass0957;
        this.LLILLL = abstractC495790JcP;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0JG9(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveProfileRepositoryForAudience@66ce.asyncRequest$cellsDeferredMap$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    C1C7U.LIZIZ("LiveProfileRepositoryForAudience@66ce.asyncRequest$cellsDeferredMap$1$1");
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            AnonymousClass0957<BaseResponse<GetRoomProfileCardResponse.ResponseData, Extra>> anonymousClass0957 = this.LLILLJJLI;
            this.LL = 1;
            obj = anonymousClass0957.LJLIIIL(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("LiveProfileRepositoryForAudience@66ce.asyncRequest$cellsDeferredMap$1$1");
                return objLJFF;
            }
        }
        GetRoomProfileCardResponse.ResponseData responseData = (GetRoomProfileCardResponse.ResponseData) ((BaseResponse) obj).data;
        if (responseData != null) {
            AbstractC495790JcP<?> abstractC495790JcP = this.LLILLL;
            this.LL = 2;
            obj = abstractC495790JcP.LJIILL(responseData, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("LiveProfileRepositoryForAudience@66ce.asyncRequest$cellsDeferredMap$1$1");
                return objLJFF;
            }
        } else {
            obj = null;
        }
        C1C7U.LIZIZ("LiveProfileRepositoryForAudience@66ce.asyncRequest$cellsDeferredMap$1$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Object> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
