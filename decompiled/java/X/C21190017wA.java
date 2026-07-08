package X;

import com.bytedance.android.livesdkapi.depend.model.live.CommerceStruct;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.OecInitData;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PopProductResp;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.17wA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.audience.common.business.common.room.EcommerceRoomStatusProvider$onEnterRoom$1$5", f = "EcommerceRoomStatusProvider.kt", l = {}, m = "invokeSuspend")
public final class C21190017wA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ OecInitData LL;
    public final /* synthetic */ Room LLILLJJLI;
    public final /* synthetic */ C21186517vb LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21190017wA(OecInitData oecInitData, Room room, C21186517vb c21186517vb, InterfaceC1364105Vn<? super C21190017wA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = oecInitData;
        this.LLILLJJLI = room;
        this.LLILLL = c21186517vb;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C21190017wA(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1C7U.LIZ("EcommerceRoomStatusProvider@51c7.onEnterRoom$1$5");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (C21194717wv.LIZLLL(this.LL, Boolean.valueOf(this.LLILLJJLI.getCommerceStruct().asyncLoad)) != null) {
            String strLJIIIIZZ = null;
            if (C294680Bgo.LIZ()) {
                C598040Ncw c598040Ncw = C598040Ncw.LIZ;
                CommerceStruct commerceStruct = this.LLILLJJLI.getCommerceStruct();
                if (commerceStruct != null) {
                    str = commerceStruct.oecInitDataString;
                } else {
                    str = null;
                }
                c598040Ncw.getClass();
                if (str != null) {
                    try {
                        HashMap map = (HashMap) C08JS.LIZIZ().LJIIIIZZ(str, new TypeToken<HashMap<String, Object>>() { // from class: X.04Xp
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
                C21186517vb c21186517vb = this.LLILLL;
                OecInitData oecInitData = this.LL;
                c21186517vb.getClass();
                if (oecInitData != null) {
                    strLJIIIIZZ = C1741890vQh.LJIIIIZZ(new PopProductResp(oecInitData.product, oecInitData.hotTag, oecInitData.atmosphereTags, oecInitData.serverTime, oecInitData.schema, oecInitData.bagIndex, Boolean.FALSE, null, null, 1, null, null, null, oecInitData.cardType, null, oecInitData.shoppingBagList, null, null, null, 0L, null, null, null, null, null, null, Boolean.FALSE, null));
                }
            }
            String strValueOf = String.valueOf(this.LLILLJJLI.getId());
            C212391189t.LIZ.getClass();
            C212391189t.LIZIZ("pin_product", strValueOf, strLJIIIIZZ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcommerceRoomStatusProvider@51c7.onEnterRoom$1$5");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
