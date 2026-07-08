package X;

import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01xi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.audience.common.shoppingbag.list.DefaultShopBagList$publishEvent2LynxNew$1", f = "DefaultShopBagList.kt", l = {816}, m = "invokeSuspend")
public final class C503601xi extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ Object LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C503601xi(boolean z, int i, Object obj, InterfaceC1364105Vn<? super C503601xi> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = z;
        this.LLILLL = i;
        this.LLILZ = obj;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C503601xi(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        IEventCenter iEventCenter;
        String str;
        C1C7U.LIZ("DefaultShopBagList@b462.publishEvent2LynxNew$1");
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
            C2126408Us c2126408Us = C2126308Ur.LIZIZ;
            C503501xh c503501xh = new C503501xh(this.LLILLL, this.LLILZ, null);
            this.LL = 1;
            obj = C23250099c.LJI(this, c2126408Us, c503501xh);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("DefaultShopBagList@b462.publishEvent2LynxNew$1");
                return objLJFF;
            }
        }
        String str2 = (String) obj;
        if (str2 != null && (iEventCenter = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null)) != null) {
            if (this.LLILLJJLI) {
                str = "ec_author_message_event";
            } else {
                str = "ec_audience_message_event";
            }
            iEventCenter.LIZ(str, str2);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DefaultShopBagList@b462.publishEvent2LynxNew$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
