package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.external.ability.IAbilityService;
import com.ss.android.ugc.aweme.socialavatar.network.socialavatar.BatchTnsRequest;
import com.ss.android.ugc.aweme.socialavatar.network.socialavatar.BatchTnsResponse;
import com.ss.android.ugc.aweme.socialavatar.network.socialavatar.SocialAvatarTnsApi;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HMT, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.repo.SocialAvatarCreationRepo$getSocialAvatarBatchTnsCheck$2", f = "SocialAvatarCreationRepo.kt", l = {149}, m = "invokeSuspend")
public final class C0HMT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super BatchTnsResponse>, Object> {
    public int LL;
    public final /* synthetic */ List<String> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HMT(List<String> list, InterfaceC1364105Vn<? super C0HMT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HMT(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SocialAvatarCreationRepo@282d.getSocialAvatarBatchTnsCheck$2");
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
            C0HMV c0hmv = new C0HMV();
            IRetrofitFactory iRetrofitFactory = (IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class);
            C0HMW.LIZ.getClass();
            C1499850p8J c1499850p8JCreateBuilder = iRetrofitFactory.createBuilder(C0HMX.LIZIZ);
            c1499850p8JCreateBuilder.LIZ(((IAbilityService) c0hmv.LIZ.getValue()).effectService().getEpRequestInterceptor());
            SocialAvatarTnsApi socialAvatarTnsApi = (SocialAvatarTnsApi) c1499850p8JCreateBuilder.build().retrofit.LIZ(SocialAvatarTnsApi.class);
            BatchTnsRequest batchTnsRequest = new BatchTnsRequest(this.LLILLJJLI);
            this.LL = 1;
            obj = socialAvatarTnsApi.batchModerateImage(batchTnsRequest, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SocialAvatarCreationRepo@282d.getSocialAvatarBatchTnsCheck$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("SocialAvatarCreationRepo@282d.getSocialAvatarBatchTnsCheck$2");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super BatchTnsResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
