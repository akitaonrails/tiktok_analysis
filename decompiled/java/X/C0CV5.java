package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.profile.business.ur.creative.GuideCreateVideoWithEffectAPI;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0CV5, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.creative.GuideCreateVideoWithEffectAPI$requestCardList$2", f = "GuideCreateVideoWithEffectAPI.kt", l = {BaseNotice.CREATOR}, m = "invokeSuspend")
public final class C0CV5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super GuideCreateVideoWithEffectAPI.CardListResponse>, Object> {
    public int LL;

    public C0CV5(InterfaceC1364105Vn<? super C0CV5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0CV5(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GuideCreateVideoWithEffectAPI@9c7e.requestCardList$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        GuideCreateVideoWithEffectAPI.CardListResponse cardListResponse = null;
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            GuideCreateVideoWithEffectAPI.API api = (GuideCreateVideoWithEffectAPI.API) GuideCreateVideoWithEffectAPI.LIZIZ.getValue();
            if (api != null) {
                String str = (String) GuideCreateVideoWithEffectAPI.LIZ.getValue();
                Map<String, String> mapLJ = C2097608Jq.LJ();
                this.LL = 1;
                obj = api.cardList(str, mapLJ, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("GuideCreateVideoWithEffectAPI@9c7e.requestCardList$2");
                    return objLJFF;
                }
            }
            C1C7U.LIZIZ("GuideCreateVideoWithEffectAPI@9c7e.requestCardList$2");
            return cardListResponse;
        }
        cardListResponse = (GuideCreateVideoWithEffectAPI.CardListResponse) obj;
        C1C7U.LIZIZ("GuideCreateVideoWithEffectAPI@9c7e.requestCardList$2");
        return cardListResponse;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super GuideCreateVideoWithEffectAPI.CardListResponse> interfaceC1364105Vn) {
        return new C0CV5(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
