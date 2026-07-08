package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import com.ss.android.ugc.aweme.search.model.SugExtraInfo;
import com.ss.android.ugc.aweme.search.pages.sug.core.model.SearchSugResponse;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.u;
import njp.a;

/* JADX INFO: renamed from: X.0CRn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.sug.core.prefetch.SugResponsePrefetcher$onReceiveSugResponse$1", f = "SugResponsePrefetcher.kt", l = {}, m = "invokeSuspend")
public final class C313730CRn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SearchSugResponse LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C313730CRn(SearchSugResponse searchSugResponse, InterfaceC1364105Vn<? super C313730CRn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = searchSugResponse;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C313730CRn(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List<SearchSugEntity> list;
        InterfaceC313740CRo interfaceC313740CRo;
        int iIntValue;
        C1C7U.LIZ("SugResponsePrefetcher@ce6b.onReceiveSugResponse$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        SearchSugResponse searchSugResponse = this.LL;
        Object next = null;
        if (searchSugResponse != null && (list = searchSugResponse.sugList) != null && !list.isEmpty()) {
            String str = searchSugResponse.LLILLL;
            if (!TextUtils.isEmpty(str)) {
                int length = str.length();
                C01GW c01gw = C271860Al6.LIZ;
                if (length >= ((Number) c01gw.getValue()).intValue() && str.length() >= ((Number) c01gw.getValue()).intValue()) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    int iMin = Math.min(searchSugResponse.sugList.size(), 10);
                    for (int i = 0; i < iMin; i++) {
                        String str2 = ((SearchSugEntity) ListProtector.get(searchSugResponse.sugList, i)).content;
                        if (str2 != null && str2.length() != 0 && str2.length() > str.length() && u.LJJIIJZLJL(str2, str, false)) {
                            char cCharAt = str2.charAt(str.length());
                            Character chValueOf = Character.valueOf(cCharAt);
                            Integer num = (Integer) linkedHashMap.get(Character.valueOf(cCharAt));
                            if (num != null) {
                                iIntValue = num.intValue();
                            } else {
                                iIntValue = 0;
                            }
                            linkedHashMap.put(chValueOf, Integer.valueOf(iIntValue + 1));
                        }
                    }
                    if (!linkedHashMap.isEmpty()) {
                        Iterator it2 = linkedHashMap.entrySet().iterator();
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (it2.hasNext()) {
                                int iIntValue2 = ((Number) ((Map.Entry) next).getValue()).intValue();
                                do {
                                    Object next2 = it2.next();
                                    int iIntValue3 = ((Number) ((Map.Entry) next2).getValue()).intValue();
                                    if (iIntValue2 < iIntValue3) {
                                        next = next2;
                                        iIntValue2 = iIntValue3;
                                    }
                                } while (it2.hasNext());
                            }
                        }
                        Map.Entry entry = (Map.Entry) next;
                        if (entry != null && ((Character) entry.getKey()).charValue() != ' ' && ((Number) entry.getValue()).intValue() > ((Number) C271840Al4.LIZ.getValue()).intValue()) {
                            char cCharValue = ((Character) entry.getKey()).charValue();
                            Iterator<SearchSugEntity> it3 = searchSugResponse.sugList.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    break;
                                }
                                SearchSugEntity next3 = it3.next();
                                String str3 = next3.content;
                                if (str3 != null && str3.length() != 0 && str3.length() > str.length() && u.LJJIIJZLJL(str3, str, false) && str3.charAt(str.length()) == cCharValue) {
                                    SugExtraInfo sugExtraInfo = next3.sugExtraInfo;
                                    double d = 0.0d;
                                    if (sugExtraInfo != null) {
                                        double predictCtrScore = sugExtraInfo.getPredictCtrScore();
                                        if (predictCtrScore >= 0.0d && predictCtrScore <= 1.0d) {
                                            d = predictCtrScore;
                                        }
                                    }
                                    if (d > ((Number) C0A0C.LIZ.getValue()).floatValue()) {
                                        String str4 = str + cCharValue;
                                        if (str4 != null) {
                                            Set<String> set = C313750CRp.LIZJ;
                                            if (set.contains(str4)) {
                                                Unit unit = Unit.LIZ;
                                                C1C7U.LIZIZ("SugResponsePrefetcher@ce6b.onReceiveSugResponse$1");
                                                return unit;
                                            }
                                            if (!TextUtils.isEmpty(str4) && !TextUtils.isEmpty(C313750CRp.LIZIZ) && u.LJJIIJZLJL(str4, String.valueOf(C313750CRp.LIZIZ), false)) {
                                                set.add(str4);
                                                WeakReference<InterfaceC313740CRo> weakReference = C313750CRp.LJ;
                                                if (weakReference != null && (interfaceC313740CRo = weakReference.get()) != null) {
                                                    interfaceC313740CRo.mO(str4);
                                                }
                                                Unit unit2 = Unit.LIZ;
                                                C1C7U.LIZIZ("SugResponsePrefetcher@ce6b.onReceiveSugResponse$1");
                                                return unit2;
                                            }
                                            Unit unit3 = Unit.LIZ;
                                            C1C7U.LIZIZ("SugResponsePrefetcher@ce6b.onReceiveSugResponse$1");
                                            return unit3;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        Unit unit4 = Unit.LIZ;
        C1C7U.LIZIZ("SugResponsePrefetcher@ce6b.onReceiveSugResponse$1");
        return unit4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
