package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseVideo;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoAnyCard;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoPlaceholderSource;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoProductInfo;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoProductItem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoVideoItem;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0yTh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1859070yTh {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Iterable, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.ArrayList] */
    public static final int LIZ(TakoMixFeed takoMixFeed) {
        ?? arrayList;
        int iDoubleValue;
        Double dLJII;
        List<TakoProductItem> list;
        Collection<TakoPlaceholderSource> collectionValues;
        int size;
        Map<String, TakoPlaceholderSource> map;
        Collection<TakoPlaceholderSource> collectionValues2;
        String string;
        if (takoMixFeed != null && (map = takoMixFeed.placeholderSources) != null && (collectionValues2 = map.values()) != null) {
            arrayList = new ArrayList();
            Iterator it2 = collectionValues2.iterator();
            while (it2.hasNext()) {
                TakoAnyCard takoAnyCard = ((TakoPlaceholderSource) it2.next()).anyCard;
                if (takoAnyCard != null) {
                    String str = takoAnyCard.msgTraceParams;
                    if (str == null || (string = a0.LJLIIIL(str).toString()) == null) {
                        string = "";
                    }
                    if (string.length() != 0) {
                        try {
                            Map map2 = (Map) C597040NbK.LIZ().LJIIIIZZ(string, new TypeToken<Map<String, ? extends Object>>() { // from class: X.00WM
                            }.getType());
                            if (map2 != null) {
                                arrayList.add(map2);
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                        }
                    }
                }
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                if (((Map) it3.next()).containsKey("product_card_count")) {
                    Iterator it4 = arrayList.iterator();
                    int i = 0;
                    while (it4.hasNext()) {
                        Object obj = ((Map) it4.next()).get("product_card_count");
                        if (obj instanceof Number) {
                            iDoubleValue = ((Number) obj).intValue();
                        } else if ((obj instanceof String) && (dLJII = C2327809Ae.LJII(a0.LJLIIIL((String) obj).toString())) != null) {
                            iDoubleValue = (int) dLJII.doubleValue();
                        } else {
                            iDoubleValue = 0;
                        }
                        i += iDoubleValue;
                    }
                    return i;
                }
            }
        }
        if (takoMixFeed == null) {
            return 0;
        }
        Map<String, TakoPlaceholderSource> map3 = takoMixFeed.placeholderSources;
        if (map3 != null && (collectionValues = map3.values()) != null) {
            Iterator it5 = collectionValues.iterator();
            int i2 = 0;
            while (it5.hasNext()) {
                List<TakoProductItem> list2 = ((TakoPlaceholderSource) it5.next()).goodList;
                if (list2 != null) {
                    size = list2.size();
                } else {
                    size = 0;
                }
                i2 += size;
            }
            if (i2 > 0) {
                return i2;
            }
            if (takoMixFeed == null) {
                return 0;
            }
        }
        TakoProductInfo takoProductInfo = takoMixFeed.products;
        if (takoProductInfo == null || (list = takoProductInfo.items) == null) {
            return 0;
        }
        return list.size();
    }

    public static final int LIZIZ(TakoMixFeed takoMixFeed) {
        Collection<TakoPlaceholderSource> collectionValues;
        int size;
        if (takoMixFeed == null) {
            return 0;
        }
        Map<String, TakoPlaceholderSource> map = takoMixFeed.placeholderSources;
        if (map != null && (collectionValues = map.values()) != null) {
            Iterator<T> it2 = collectionValues.iterator();
            int i = 0;
            while (it2.hasNext()) {
                List<TakoVideoItem> list = ((TakoPlaceholderSource) it2.next()).itemList;
                if (list != null) {
                    size = list.size();
                } else {
                    size = 0;
                }
                i += size;
            }
            if (i > 0) {
                return i;
            }
            if (takoMixFeed == null) {
                return 0;
            }
        }
        List<TakoVideoItem> list2 = takoMixFeed.videoList;
        if (list2 != null) {
            int size2 = list2.size();
            if (size2 > 0) {
                return size2;
            }
            if (takoMixFeed == null) {
                return 0;
            }
        }
        List<BaseVideo> list3 = takoMixFeed.videos;
        if (list3 == null) {
            return 0;
        }
        return list3.size();
    }
}
