package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillItem;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.039L, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C039L extends C09AY implements Function1<LaneParams, Unit> {
    public final /* synthetic */ Map<String, Object> LL;
    public final /* synthetic */ C714302qb LLILLJJLI;
    public final /* synthetic */ C039Q LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C039L(Map<String, Object> map, C714302qb c714302qb, C039Q c039q) {
        super(1);
        this.LL = map;
        this.LLILLJJLI = c714302qb;
        this.LLILLL = c039q;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LaneParams laneParams) {
        Unit unit;
        float fFloatValue;
        String priceVal;
        Float fLJIIIIZZ;
        float fFloatValue2;
        String priceVal2;
        Float fLJIIIIZZ2;
        float fFloatValue3;
        String priceVal3;
        Float fLJIIIIZZ3;
        LaneParams laneParams2 = laneParams;
        laneParams2.putAll(this.LL);
        Integer num = this.LLILLJJLI.LJIIIIZZ;
        if (num != null && num.intValue() == 16) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            try {
                List<BillItem> list = this.LLILLJJLI.LJIIJ;
                if (list != null) {
                    for (BillItem billItem : list) {
                        Integer num2 = billItem.itemType;
                        Object obj = CardStruct.IStatusCode.DEFAULT;
                        float fFloatValue4 = 0.0f;
                        if (num2 != null) {
                            if (num2.intValue() == 39) {
                                Object obj2 = linkedHashMap.get("1");
                                if (obj2 != null) {
                                    obj = obj2;
                                }
                                Float fLJIIIIZZ4 = C2327809Ae.LJIIIIZZ((String) obj);
                                if (fLJIIIIZZ4 != null) {
                                    fFloatValue = fLJIIIIZZ4.floatValue();
                                } else {
                                    fFloatValue = 0.0f;
                                }
                                Price price = billItem.itemPrice;
                                if (price != null && (priceVal = price.getPriceVal()) != null && (fLJIIIIZZ = C2327809Ae.LJIIIIZZ(priceVal)) != null) {
                                    fFloatValue4 = fLJIIIIZZ.floatValue();
                                }
                                linkedHashMap.put("1", String.valueOf(fFloatValue + fFloatValue4));
                            } else if (num2.intValue() == 40) {
                                Object obj3 = linkedHashMap.get("2");
                                if (obj3 != null) {
                                    obj = obj3;
                                }
                                Float fLJIIIIZZ5 = C2327809Ae.LJIIIIZZ((String) obj);
                                if (fLJIIIIZZ5 != null) {
                                    fFloatValue2 = fLJIIIIZZ5.floatValue();
                                } else {
                                    fFloatValue2 = 0.0f;
                                }
                                Price price2 = billItem.itemPrice;
                                if (price2 != null && (priceVal2 = price2.getPriceVal()) != null && (fLJIIIIZZ2 = C2327809Ae.LJIIIIZZ(priceVal2)) != null) {
                                    fFloatValue4 = fLJIIIIZZ2.floatValue();
                                }
                                linkedHashMap.put("2", String.valueOf(fFloatValue2 + fFloatValue4));
                            } else if (num2.intValue() == 41) {
                                Object obj4 = linkedHashMap.get("3");
                                if (obj4 != null) {
                                    obj = obj4;
                                }
                                Float fLJIIIIZZ6 = C2327809Ae.LJIIIIZZ((String) obj);
                                if (fLJIIIIZZ6 != null) {
                                    fFloatValue3 = fLJIIIIZZ6.floatValue();
                                } else {
                                    fFloatValue3 = 0.0f;
                                }
                                Price price3 = billItem.itemPrice;
                                if (price3 != null && (priceVal3 = price3.getPriceVal()) != null && (fLJIIIIZZ3 = C2327809Ae.LJIIIIZZ(priceVal3)) != null) {
                                    fFloatValue4 = fLJIIIIZZ3.floatValue();
                                }
                                linkedHashMap.put("3", String.valueOf(fFloatValue3 + fFloatValue4));
                            }
                        }
                    }
                    unit = Unit.LIZ;
                } else {
                    unit = null;
                }
                C189200o6.m2constructorimpl(unit);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
            laneParams2.put("shipping_detail", C13LP.LJJLIIIJ(linkedHashMap.entrySet(), ",", "{", "}", 0, null, AnonymousClass0207.get$arr$(28), 24));
        }
        String str = this.LLILLL.LLILZIL;
        if (str != null) {
            laneParams2.put("summary_info", str);
        }
        if (this.LLILLJJLI.LJJIFFI != null) {
            laneParams2.put("is_plus_effective", 1);
        }
        return Unit.LIZ;
    }
}
