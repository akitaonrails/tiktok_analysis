package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.BillboardActivityInfo;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.BillboardGiveawayInfo;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.RootData;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.SaveTemplateRequestBody;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.SaveTemplateResponse;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateField;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0v4h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.utils.TemplateDisplayHelper$doSaveTemplate$resp$1", f = "TemplateDisplayHelper.kt", l = {258}, m = "invokeSuspend")
public final class C1728250v4h extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C0X52<Response<SaveTemplateResponse>>>, Object> {
    public int LL;
    public final /* synthetic */ C1730010v7X LLILLJJLI;
    public final /* synthetic */ RootData LLILLL;
    public final /* synthetic */ TemplateItem LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1728250v4h(C1730010v7X c1730010v7X, RootData rootData, TemplateItem templateItem, InterfaceC1364105Vn<? super C1728250v4h> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1730010v7X;
        this.LLILLL = rootData;
        this.LLILZ = templateItem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1728250v4h(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C0X52 c0x52;
        String str;
        C1C7U.LIZ("TemplateDisplayHelper@870b.doSaveTemplate$resp$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C1728220v4e c1728220v4e = this.LLILLJJLI.LIZ.LLILLJJLI;
                RootData rootData = this.LLILLL;
                if (rootData == null || (str = rootData.authorId) == null) {
                    str = "";
                }
                String templateId = this.LLILZ.getTemplateId();
                int type = this.LLILZ.getType();
                List<TemplateField> listT5 = this.LLILZ.T5();
                Integer subType = this.LLILZ.getSubType();
                BillboardActivityInfo activityInfo = this.LLILZ.getActivityInfo();
                BillboardGiveawayInfo billboardGiveawayInfoVI = this.LLILZ.vI();
                this.LL = 1;
                c1728220v4e.getClass();
                obj = c1728220v4e.LL.LL.saveTemplate(new SaveTemplateRequestBody(str, templateId, type, subType, listT5, activityInfo, billboardGiveawayInfoVI), this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("TemplateDisplayHelper@870b.doSaveTemplate$resp$1");
                    return objLJFF;
                }
            }
            c0x52 = (C0X52) obj;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c0x52 = null;
        }
        C1C7U.LIZIZ("TemplateDisplayHelper@870b.doSaveTemplate$resp$1");
        return c0x52;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0X52<Response<SaveTemplateResponse>>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
