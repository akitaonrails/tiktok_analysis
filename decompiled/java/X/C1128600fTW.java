package X;

import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.model.Gift;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fTW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1128600fTW {
    public final ConcurrentHashMap<Integer, ConcurrentHashMap<Long, String>> LIZ = new ConcurrentHashMap<>();
    public String LIZIZ = "";
    public C157100iv LIZJ = new C157100iv();
    public C09AY LIZLLL;

    public final void LIZJ() {
        ConcurrentHashMap<Long, String> concurrentHashMapPutIfAbsent;
        InterfaceC1133710fbl.LIZ.getClass();
        C1120710fGn.LIZ();
        Gift giftLJFF = C1133940fc8.LJFF();
        if (giftLJFF == null) {
            return;
        }
        long j = giftLJFF.id;
        String str = giftLJFF.recommendInfo;
        if (j > 0) {
            ConcurrentHashMap<Integer, ConcurrentHashMap<Long, String>> concurrentHashMap = this.LIZ;
            ConcurrentHashMap<Long, String> concurrentHashMap2 = concurrentHashMap.get(1);
            if (concurrentHashMap2 == null && (concurrentHashMapPutIfAbsent = concurrentHashMap.putIfAbsent(1, (concurrentHashMap2 = new ConcurrentHashMap<>()))) != null) {
                concurrentHashMap2 = concurrentHashMapPutIfAbsent;
            }
            ConcurrentHashMap<Long, String> concurrentHashMap3 = concurrentHashMap2;
            if (str == null || str.length() <= 0) {
                str = null;
            }
            String str2 = concurrentHashMap3.get(Long.valueOf(j));
            if (str2 == null) {
                Long lValueOf = Long.valueOf(j);
                if (str == null) {
                    str = "{}";
                }
                concurrentHashMap3.put(lValueOf, str);
                return;
            }
            if (str != null) {
                if (str2.length() == 0 || Intrinsics.LJFF(str2, "{}")) {
                    concurrentHashMap3.put(Long.valueOf(j), str);
                }
            }
        }
    }

    public final String LIZ(int i, long j) {
        String str;
        ConcurrentHashMap<Long, String> concurrentHashMap = this.LIZ.get(Integer.valueOf(i));
        if (concurrentHashMap != null && (str = concurrentHashMap.get(Long.valueOf(j))) != null && str.length() != 0 && !Intrinsics.LJFF(str, "{}")) {
            return str;
        }
        Integer numValueOf = Integer.valueOf(i);
        for (Map.Entry<Integer, ConcurrentHashMap<Long, String>> entry : this.LIZ.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            ConcurrentHashMap<Long, String> value = entry.getValue();
            if (numValueOf == null || iIntValue != numValueOf.intValue()) {
                String str2 = value.get(Long.valueOf(j));
                if (str2 != null) {
                    return str2;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [X.09AY, kotlin.jvm.functions.Function0] */
    public final void LIZIZ(String str, List<? extends GiftPage> list) {
        ?? r0;
        if (str == null || Intrinsics.LJFF(str, this.LIZIZ)) {
            return;
        }
        if (this.LIZIZ.length() > 0 && (r0 = this.LIZLLL) != 0) {
            r0.invoke();
        }
        this.LIZ.clear();
        if (list != null) {
            for (GiftPage giftPage : list) {
                ConcurrentHashMap<Long, String> concurrentHashMap = new ConcurrentHashMap<>();
                List<Gift> list2 = giftPage.gifts;
                if (list2 != null) {
                    for (Gift gift : list2) {
                        if (gift != null && gift.recommendInfo != null) {
                            concurrentHashMap.put(Long.valueOf(gift.id), gift.recommendInfo);
                        }
                    }
                }
                this.LIZ.put(Integer.valueOf(giftPage.pageType), concurrentHashMap);
            }
        }
        this.LIZIZ = str;
    }
}
