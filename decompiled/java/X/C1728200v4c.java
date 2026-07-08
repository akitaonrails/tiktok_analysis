package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.DisplayResponse;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0v4c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.utils.TemplateDisplayHelper$doDisplayTemplate$resp$1", f = "TemplateDisplayHelper.kt", l = {182}, m = "invokeSuspend")
public final class C1728200v4c extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C0X52<Response<DisplayResponse>>>, Object> {
    public int LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ C1730010v7X LLILLL;
    public final /* synthetic */ C1728990v5t LLILZ;
    public final /* synthetic */ TemplateItem LLILZIL;
    public final /* synthetic */ boolean LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1728200v4c(boolean z, C1730010v7X c1730010v7X, C1728990v5t c1728990v5t, TemplateItem templateItem, boolean z2, InterfaceC1364105Vn<? super C1728200v4c> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = z;
        this.LLILLL = c1730010v7X;
        this.LLILZ = c1728990v5t;
        this.LLILZIL = templateItem;
        this.LLILZLL = z2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1728200v4c(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C0X52 c0x52;
        int i;
        boolean zLJJIZ;
        boolean z;
        C1C7U.LIZ("TemplateDisplayHelper@870b.doDisplayTemplate$resp$1");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LL;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                if (this.LLILLJJLI) {
                    i = 1;
                } else {
                    i = 2;
                }
                C1728220v4e c1728220v4e = this.LLILLL.LIZ.LLILLJJLI;
                String str = this.LLILZ.LL.authorId;
                String templateId = this.LLILZIL.getTemplateId();
                if (this.LLILZLL) {
                    zLJJIZ = true;
                } else {
                    zLJJIZ = this.LLILZIL.LJJIZ();
                }
                int type = this.LLILZIL.getType();
                Integer subType = this.LLILZIL.getSubType();
                if (zLJJIZ) {
                    z = true;
                } else {
                    z = false;
                }
                this.LL = 1;
                obj = c1728220v4e.LJLZ(str, templateId, z, 0, type, i, subType, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("TemplateDisplayHelper@870b.doDisplayTemplate$resp$1");
                    return objLJFF;
                }
            }
            c0x52 = (C0X52) obj;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c0x52 = null;
        }
        C1C7U.LIZIZ("TemplateDisplayHelper@870b.doDisplayTemplate$resp$1");
        return c0x52;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0X52<Response<DisplayResponse>>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
