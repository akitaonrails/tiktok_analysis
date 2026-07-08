package X;

import com.bytedance.android.livesdkapi.depend.model.live.CommerceStruct;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.ecommercelive.audience.us.lifecycle.UsEcommerceRoomLifecycleObserver;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.OecInitData;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PopProductResp;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.17w9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.audience.us.lifecycle.UsEcommerceRoomLifecycleObserver$onEnterRoom$1$4", f = "UsEcommerceRoomLifecycleObserver.kt", l = {}, m = "invokeSuspend")
public final class C21189917w9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ OecInitData LL;
    public final /* synthetic */ Room LLILLJJLI;
    public final /* synthetic */ UsEcommerceRoomLifecycleObserver LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21189917w9(OecInitData oecInitData, Room room, UsEcommerceRoomLifecycleObserver usEcommerceRoomLifecycleObserver, InterfaceC1364105Vn<? super C21189917w9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = oecInitData;
        this.LLILLJJLI = room;
        this.LLILLL = usEcommerceRoomLifecycleObserver;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C21189917w9(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Boolean boolValueOf;
        String str;
        C1C7U.LIZ("UsEcommerceRoomLifecycleObserver@6929.onEnterRoom$1$4");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        OecInitData oecInitData = this.LL;
        CommerceStruct commerceStruct = this.LLILLJJLI.getCommerceStruct();
        String strLJIIIIZZ = null;
        if (commerceStruct != null) {
            boolValueOf = Boolean.valueOf(commerceStruct.asyncLoad);
        } else {
            boolValueOf = null;
        }
        if (C21194717wv.LIZ(oecInitData, boolValueOf)) {
            if (C294680Bgo.LIZ()) {
                C598030Ncv c598030Ncv = C598030Ncv.LIZ;
                CommerceStruct commerceStruct2 = this.LLILLJJLI.getCommerceStruct();
                if (commerceStruct2 != null) {
                    str = commerceStruct2.oecInitDataString;
                } else {
                    str = null;
                }
                c598030Ncv.getClass();
                if (str != null) {
                    try {
                        HashMap map = (HashMap) C08JS.LIZIZ().LJIIIIZZ(str, new TypeToken<HashMap<String, Object>>() { // from class: X.04Xb
                        }.getType());
                        if (map != null) {
                            Object obj2 = map.get("pop_product");
                            if (obj2 != null) {
                                map.put("product", obj2);
                            }
                            map.remove("pop_product");
                            strLJIIIIZZ = C1741890vQh.LJIIIIZZ(map);
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            } else {
                UsEcommerceRoomLifecycleObserver usEcommerceRoomLifecycleObserver = this.LLILLL;
                OecInitData oecInitData2 = this.LL;
                usEcommerceRoomLifecycleObserver.getClass();
                if (oecInitData2 != null) {
                    strLJIIIIZZ = C1741890vQh.LJIIIIZZ(new PopProductResp(oecInitData2.product, oecInitData2.hotTag, oecInitData2.atmosphereTags, oecInitData2.serverTime, oecInitData2.schema, oecInitData2.bagIndex, Boolean.FALSE, null, null, 1, null, null, null, oecInitData2.cardType, null, oecInitData2.shoppingBagList, null, null, null, 0L, null, null, null, null, null, null, Boolean.FALSE, null));
                }
            }
            String strValueOf = String.valueOf(this.LLILLJJLI.getId());
            C212391189t.LIZ.getClass();
            C212391189t.LIZIZ("pin_product", strValueOf, strLJIIIIZZ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("UsEcommerceRoomLifecycleObserver@6929.onEnterRoom$1$4");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
