package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import java.lang.reflect.Type;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KTypeProjection;
import njp.a;

/* JADX INFO: renamed from: X.03Sz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.page.OrderSubmitActivity$initArguments$2$4", f = "OrderSubmitActivity.kt", l = {}, m = "invokeSuspend")
public final class C847903Sz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ OrderSubmitAssemViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C847903Sz(OrderSubmitAssemViewModel orderSubmitAssemViewModel, InterfaceC1364105Vn<? super C847903Sz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = orderSubmitAssemViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C847903Sz(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Type type;
        C1C7U.LIZ("OrderSubmitActivity@cf3d.initArguments$2$4");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        OrderSubmitAssemViewModel orderSubmitAssemViewModel = this.LL;
        if (orderSubmitAssemViewModel.x) {
            if (C800903Ax.LIZ().contains("osp_shop_notes")) {
                String string = C800903Ax.LIZ().getString("osp_shop_notes", null);
                try {
                    Gson gsonLJFF = C1741890vQh.LJFF();
                    C1120604Zw.LIZ.getClass();
                    C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                    if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                        C13JX c13jx = KTypeProjection.LIZJ;
                        C13JW c13jwLJII = C13LE.LJII(String.class);
                        c13jx.getClass();
                        type = C2371409Qy.LIZJ(C13LE.LJI(HashMap.class, C13JX.LIZ(c13jwLJII), C13JX.LIZ(C13LE.LJ(String.class))));
                    } else {
                        type = new TypeToken<HashMap<String, String>>() { // from class: X.03T0
                        }.getType();
                    }
                    Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, string, type);
                    if (!(objFromJson instanceof HashMap)) {
                        objFromJson = null;
                    }
                    HashMap map = (HashMap) objFromJson;
                    if (map != null) {
                        orderSubmitAssemViewModel.LLL.putAll(map);
                        C800903Ax.LIZ().erase("osp_shop_notes");
                    }
                } catch (s e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        } else {
            C800903Ax.LIZ().erase("osp_shop_notes");
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("OrderSubmitActivity@cf3d.initArguments$2$4");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
