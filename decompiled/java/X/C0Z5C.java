package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.im.chatlist.impl.dmrisky.data.api.DMRiskyKeywordsService;
import com.ss.android.ugc.aweme.im.chatlist.impl.dmrisky.data.api.RiskyKeywordsService;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Z5C, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.dmrisky.data.api.DMRiskyKeywordsService$uploadKeywords$1", f = "DMRiskyKeywordsService.kt", l = {106}, m = "invokeSuspend")
public final class C0Z5C extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public RiskyKeywordsService LL;
    public DMRiskyKeywordsService LLILLJJLI;
    public Object LLILLL;
    public int LLILZ;
    public final /* synthetic */ List<String> LLILZIL;
    public final /* synthetic */ DMRiskyKeywordsService LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0Z5C(List<String> list, DMRiskyKeywordsService dMRiskyKeywordsService, InterfaceC1364105Vn<? super C0Z5C> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = list;
        this.LLILZLL = dMRiskyKeywordsService;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0Z5C(this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        DMRiskyKeywordsService dMRiskyKeywordsService;
        List<String> list;
        C1C7U.LIZ("DMRiskyKeywordsService@59f5.uploadKeywords$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILZ;
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (i != 0) {
            if (i == 1) {
                list = (List) this.LLILLL;
                dMRiskyKeywordsService = this.LLILLJJLI;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            String json = GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), this.LLILZIL);
            RiskyKeywordsService riskyKeywordsService = (RiskyKeywordsService) this.LLILZLL.LIZLLL.getValue();
            if (riskyKeywordsService != null) {
                dMRiskyKeywordsService = this.LLILZLL;
                list = this.LLILZIL;
                this.LL = riskyKeywordsService;
                this.LLILLJJLI = dMRiskyKeywordsService;
                this.LLILLL = list;
                this.LLILZ = 1;
                obj = riskyKeywordsService.LIZ(json, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("DMRiskyKeywordsService@59f5.uploadKeywords$1");
                    return objLJFF;
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("DMRiskyKeywordsService@59f5.uploadKeywords$1");
            return unit;
        }
        if (((BaseResponse) obj).status_code == 0) {
            ((Keva) C888940Yu4.LIZ.getValue()).storeBoolean("KeywordsEditedBefore", true);
            Iterator<C0Z5D> it2 = dMRiskyKeywordsService.LIZ.iterator();
            while (it2.hasNext()) {
                it2.next().LIZ(list);
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("DMRiskyKeywordsService@59f5.uploadKeywords$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
