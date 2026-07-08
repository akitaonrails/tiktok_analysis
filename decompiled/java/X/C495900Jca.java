package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import webcast.api.room.GetRoomProfileCardResponse;

/* JADX INFO: renamed from: X.0Jca, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.profile.dao.LiveProfileRepositoryForAnchor$asyncRequest$cellsDeferredMap$1$1", f = "LiveProfileRepositoryForAnchor.kt", l = {114, 115}, m = "invokeSuspend")
public final class C495900Jca extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Object>, Object> {
    public int LL;
    public final /* synthetic */ AnonymousClass0957<GetRoomProfileCardResponse> LLILLJJLI;
    public final /* synthetic */ AbstractC495790JcP<?> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C495900Jca(AnonymousClass0957<GetRoomProfileCardResponse> anonymousClass0957, AbstractC495790JcP<?> abstractC495790JcP, InterfaceC1364105Vn<? super C495900Jca> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = anonymousClass0957;
        this.LLILLL = abstractC495790JcP;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C495900Jca(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveProfileRepositoryForAnchor@6987.asyncRequest$cellsDeferredMap$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    C1C7U.LIZIZ("LiveProfileRepositoryForAnchor@6987.asyncRequest$cellsDeferredMap$1$1");
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            AnonymousClass0957<GetRoomProfileCardResponse> anonymousClass0957 = this.LLILLJJLI;
            this.LL = 1;
            obj = anonymousClass0957.LJLIIIL(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("LiveProfileRepositoryForAnchor@6987.asyncRequest$cellsDeferredMap$1$1");
                return objLJFF;
            }
        }
        GetRoomProfileCardResponse.ResponseData responseData = ((GetRoomProfileCardResponse) obj).data;
        if (responseData != null) {
            AbstractC495790JcP<?> abstractC495790JcP = this.LLILLL;
            this.LL = 2;
            obj = abstractC495790JcP.LJIILJJIL(responseData, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("LiveProfileRepositoryForAnchor@6987.asyncRequest$cellsDeferredMap$1$1");
                return objLJFF;
            }
        } else {
            obj = null;
        }
        C1C7U.LIZIZ("LiveProfileRepositoryForAnchor@6987.asyncRequest$cellsDeferredMap$1$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Object> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
