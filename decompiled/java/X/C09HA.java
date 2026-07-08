package X;

import com.ss.android.ugc.aweme.ecommerce.search.vision.repo.DailyHistoryModel;
import com.ss.android.ugc.aweme.ecommerce.search.vision.repo.HistoryProduct;
import com.ss.android.ugc.aweme.ecommerce.search.vision.repo.Image;
import com.ss.android.ugc.aweme.ecommerce.search.vision.repo.MallHistoryResponse;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.09HA, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.vision.record.history.handler.MallHistoryRecordHandler$loadAsync$1$1", f = "MallHistoryRecordHandler.kt", l = {}, m = "invokeSuspend")
public final class C09HA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Function1<C09HH, Unit> LL;
    public final /* synthetic */ C09HB LLILLJJLI;
    public final /* synthetic */ MallHistoryResponse LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C09HA(Function1<? super C09HH, Unit> function1, C09HB c09hb, MallHistoryResponse mallHistoryResponse, InterfaceC1364105Vn<? super C09HA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = function1;
        this.LLILLJJLI = c09hb;
        this.LLILLL = mallHistoryResponse;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09HA(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int i;
        int size;
        int iIntValue;
        boolean z;
        Integer num;
        int size2;
        List<HistoryProduct> list;
        HistoryProduct historyProduct;
        String str;
        Long lLJIILIIL;
        Long lLJIILIIL2;
        Image image;
        List<String> list2;
        String str2;
        C1C7U.LIZ("MallHistoryRecordHandler@be23.loadAsync$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Function1<C09HH, Unit> function1 = this.LL;
        C09HB c09hb = this.LLILLJJLI;
        MallHistoryResponse mallHistoryResponse = this.LLILLL;
        c09hb.getClass();
        C675950QfJ.LIZ.getClass();
        long j = C675950QfJ.LIZ().getLong("delete_mall_history_record_time", 0L);
        ArrayList arrayList = new ArrayList();
        List<DailyHistoryModel> list3 = mallHistoryResponse.groups;
        if (list3 != null) {
            i = 0;
            size = 0;
            for (DailyHistoryModel dailyHistoryModel : list3) {
                ArrayList arrayList2 = new ArrayList();
                List<HistoryProduct> list4 = dailyHistoryModel.products;
                if (list4 != null) {
                    size2 = list4.size();
                } else {
                    size2 = 0;
                }
                i += size2;
                List<HistoryProduct> list5 = dailyHistoryModel.products;
                int i2 = LSPassThroughRecordSizeConfig.DEFAULT;
                if (list5 != null) {
                    for (HistoryProduct historyProduct2 : list5) {
                        String str3 = historyProduct2.timeStamp;
                        if (str3 != null && (lLJIILIIL2 = C2095008Iq.LJIILIIL(str3)) != null) {
                            long jLongValue = lLJIILIIL2.longValue() / ((long) i2);
                            List<Image> list6 = historyProduct2.images;
                            if (list6 != null && (image = (Image) C13LP.LJJJLL(list6)) != null && (list2 = image.urls) != null && (str2 = (String) C13LP.LJJJLL(list2)) != null && jLongValue > j) {
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                String str4 = historyProduct2.productId;
                                if (str4 != null) {
                                    linkedHashMap.put("product_id", str4);
                                }
                                String str5 = historyProduct2.productTitle;
                                if (str5 != null) {
                                    linkedHashMap.put("product_title", str5);
                                }
                                String str6 = historyProduct2.sellerId;
                                if (str6 != null) {
                                    linkedHashMap.put("seller_id", str6);
                                }
                                arrayList2.add(new C09HE(str2, str2, jLongValue, linkedHashMap));
                            }
                        }
                        i2 = LSPassThroughRecordSizeConfig.DEFAULT;
                    }
                }
                if (!arrayList2.isEmpty() && (list = dailyHistoryModel.products) != null && (historyProduct = (HistoryProduct) C13LP.LJJJLL(list)) != null && (str = historyProduct.timeStamp) != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str)) != null) {
                    String str7 = new SimpleDateFormat("M/d/yyyy", Locale.getDefault()).format(new Date(lLJIILIIL.longValue() / ((long) i2)));
                    size += arrayList2.size();
                    arrayList.add(new C09HF(str7, arrayList2));
                }
            }
        } else {
            i = 0;
            size = 0;
        }
        if (size >= i && (num = mallHistoryResponse.totalCount) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = size;
        }
        if (size >= i && Intrinsics.LJFF(mallHistoryResponse.hasMore, Boolean.TRUE)) {
            z = true;
        } else {
            z = false;
        }
        function1.invoke(new C09HH(iIntValue, z, arrayList));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MallHistoryRecordHandler@be23.loadAsync$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
