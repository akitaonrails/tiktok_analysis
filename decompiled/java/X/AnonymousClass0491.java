package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.model.AddItemToCartEvent;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0491, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel$handleEvent$2", f = "SeaPdpViewModel.kt", l = {}, m = "invokeSuspend")
public final class AnonymousClass0491 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ SeaPdpViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass0491(SeaPdpViewModel seaPdpViewModel, String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = seaPdpViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        AnonymousClass0491 anonymousClass0491 = new AnonymousClass0491(this.LLILLL, this.LLILLJJLI, interfaceC1364105Vn);
        anonymousClass0491.LL = obj;
        return anonymousClass0491;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AddItemToCartEvent addItemToCartEvent;
        Unit unit;
        Type type;
        C1C7U.LIZ("SeaPdpViewModel@98e7.handleEvent$2");
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
                type = new TypeToken<AddItemToCartEvent>() { // from class: X.0492
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
        if (C770702zh.LIZIZ(this.LLILLL.getProductId()) && C770702zh.LIZIZ(addItemToCartEvent.productId) && !Intrinsics.LJFF(this.LLILLL.getProductId(), addItemToCartEvent.productId)) {
            if (this.LLILLL.LLJJIJIL != null) {
                C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("monitor_name", "rd_add_cart_optimize_event");
                linkedHashMap.put("monitor_type", "1");
                c1507790pL7.getClass();
                C1507790pL7.LIZJ("tiktok_gec_monitor_event", linkedHashMap);
            }
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("SeaPdpViewModel@98e7.handleEvent$2");
            return unit2;
        }
        SeaPdpViewModel seaPdpViewModel = this.LLILLL;
        seaPdpViewModel.LLJJJ = false;
        try {
            C23260099m c23260099m = seaPdpViewModel.LLJJIJIL;
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
        this.LLILLL.LLJJIJIL = null;
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("SeaPdpViewModel@98e7.handleEvent$2");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
