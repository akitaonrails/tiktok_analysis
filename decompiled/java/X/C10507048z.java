package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.model.AddItemToCartEvent;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.048z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel$handleEvent$2", f = "PdpViewModel.kt", l = {}, m = "invokeSuspend")
public final class C10507048z extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ PdpViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10507048z(String str, PdpViewModel pdpViewModel, InterfaceC1364105Vn<? super C10507048z> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = pdpViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C10507048z c10507048z = new C10507048z(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c10507048z.LL = obj;
        return c10507048z;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AddItemToCartEvent addItemToCartEvent;
        Unit unit;
        Type type;
        C1C7U.LIZ("PdpViewModel@6cb1.handleEvent$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String str = this.LLILLJJLI;
        try {
            Gson gsonLJFF = C1741890vQh.LJFF();
            C1120604Zw.LIZ.getClass();
            C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
            if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                type = C2371409Qy.LIZJ(C13LE.LJII(AddItemToCartEvent.class));
            } else {
                type = new TypeToken<AddItemToCartEvent>() { // from class: X.0490
                }.getType();
            }
            Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, str, type);
            if (!(objFromJson instanceof AddItemToCartEvent)) {
                objFromJson = null;
            }
            addItemToCartEvent = (AddItemToCartEvent) objFromJson;
        } catch (s e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (addItemToCartEvent == null) {
            addItemToCartEvent = new AddItemToCartEvent(false, null);
        }
        PdpViewModel pdpViewModel = this.LLILLL;
        pdpViewModel.getClass();
        if (C770702zh.LIZIZ(pdpViewModel.getProductId()) && C770702zh.LIZIZ(addItemToCartEvent.productId)) {
            PdpViewModel pdpViewModel2 = this.LLILLL;
            pdpViewModel2.getClass();
            if (!Intrinsics.LJFF(pdpViewModel2.getProductId(), addItemToCartEvent.productId)) {
                if (this.LLILLL.LLJJJJJIL != null) {
                    C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("monitor_name", "rd_add_cart_optimize_event");
                    linkedHashMap.put("monitor_type", "1");
                    c1507790pL7.getClass();
                    C1507790pL7.LIZJ("tiktok_gec_monitor_event", linkedHashMap);
                }
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("PdpViewModel@6cb1.handleEvent$2");
                return unit2;
            }
        }
        PdpViewModel pdpViewModel3 = this.LLILLL;
        pdpViewModel3.LLJJJJLIIL = false;
        try {
            C23260099m c23260099m = pdpViewModel3.LLJJJJJIL;
            if (c23260099m != null) {
                C189200o6.m2constructorimpl(addItemToCartEvent);
                c23260099m.resumeWith(addItemToCartEvent);
                unit = Unit.LIZ;
            } else {
                unit = null;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        this.LLILLL.LLJJJJJIL = null;
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("PdpViewModel@6cb1.handleEvent$2");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
