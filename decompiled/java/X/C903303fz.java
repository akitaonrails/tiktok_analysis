package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.n;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.viewholder.CCDCPromotionBannerViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMarketingInfo;
import com.ss.android.ugc.aweme.ecommerce.base.payment.dto.Cashier;
import com.ss.android.ugc.aweme.ecommerce.base.payment.dto.PaymentData;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03fz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.viewholder.CCDCPromotionBannerViewHolder$openPromotionPage$6", f = "CCDCPromotionBannerViewHolder.kt", l = {316}, m = "invokeSuspend")
public final class C903303fz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C914303hl LL;
    public int LLILLJJLI;
    public final /* synthetic */ CCDCPromotionBannerViewHolder LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ C259800zU<String> LLILZIL;
    public final /* synthetic */ C259800zU<String> LLILZLL;
    public final /* synthetic */ List<PaymentMarketingInfo> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C903303fz(CCDCPromotionBannerViewHolder cCDCPromotionBannerViewHolder, String str, C259800zU<String> c259800zU, C259800zU<String> c259800zU2, List<PaymentMarketingInfo> list, InterfaceC1364105Vn<? super C903303fz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = cCDCPromotionBannerViewHolder;
        this.LLILZ = str;
        this.LLILZIL = c259800zU;
        this.LLILZLL = c259800zU2;
        this.LLIZ = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C903303fz(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C914303hl c914303hl;
        n nVar;
        Type type;
        C1C7U.LIZ("CCDCPromotionBannerViewHolder@9aa9.openPromotionPage$6");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        boolean z = false;
        if (i != 0) {
            if (i == 1) {
                c914303hl = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            c914303hl = C914303hl.LIZ;
            this.LL = c914303hl;
            this.LLILLJJLI = 1;
            c914303hl.getClass();
            obj = C914303hl.LIZ("ccdc_card_info", false, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("CCDCPromotionBannerViewHolder@9aa9.openPromotionPage$6");
                return objLJFF;
            }
        }
        PaymentData paymentData = (PaymentData) obj;
        Cashier cashier = null;
        if (paymentData != null && (nVar = paymentData.cashier) != null) {
            try {
                Gson gsonLJFF = C1741890vQh.LJFF();
                C1120604Zw.LIZ.getClass();
                C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                    z = true;
                }
                if (!z) {
                    type = new TypeToken<Cashier>() { // from class: X.03gC
                    }.getType();
                } else {
                    type = C2371409Qy.LIZJ(C13LE.LJII(Cashier.class));
                }
                Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, nVar, type);
                if (!(objFromJson instanceof Cashier)) {
                    objFromJson = null;
                }
                cashier = (Cashier) objFromJson;
            } catch (s e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        c914303hl.getClass();
        C914303hl.LIZIZ = cashier;
        CCDCPromotionBannerViewHolder cCDCPromotionBannerViewHolder = this.LLILLL;
        C902403fq c902403fq = C902403fq.LIZ;
        String str = this.LLILZ;
        String str2 = this.LLILZIL.element;
        if (str2 == null) {
            str2 = "";
        }
        C914303hl.LIZ.getClass();
        Cashier cashier2 = C914303hl.LIZIZ;
        String str3 = this.LLILZLL.element;
        String strLJIIIIZZ = C1741890vQh.LJIIIIZZ(this.LLIZ);
        c902403fq.getClass();
        cCDCPromotionBannerViewHolder.R5(C902403fq.LIZ(str, str2, cashier2, str3, 0, strLJIIIIZZ));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CCDCPromotionBannerViewHolder@9aa9.openPromotionPage$6");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
