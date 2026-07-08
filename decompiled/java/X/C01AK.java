package X;

import com.bytedance.android.livesdk.model.Gift;
import java.util.List;

/* JADX INFO: renamed from: X.01AK, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01AK {
    public static final List<Long> LIZ(AbstractC1126600fQI<?> abstractC1126600fQI, C01AG c01ag) {
        Gift gift;
        Gift.GiftSeriesInfo giftSeriesInfo;
        List<Long> list;
        List<Long> listLLIIII;
        int i = C01AJ.LIZ[c01ag.ordinal()];
        if (i != 1 && i != 2) {
            throw new C1954807lC();
        }
        T t = abstractC1126600fQI.LIZIZ;
        if (!(t instanceof Gift) || (gift = (Gift) t) == null || (giftSeriesInfo = gift.seriesInfo) == null || (list = giftSeriesInfo.giftIds) == null || (listLLIIII = C13LP.LLIIII(list)) == null) {
            return C13BV.INSTANCE;
        }
        return listLLIIII;
    }

    public static final boolean LIZIZ(AbstractC1126600fQI<?> abstractC1126600fQI, C01AG c01ag) {
        Gift gift;
        Gift gift2;
        int i = C01AJ.LIZ[c01ag.ordinal()];
        if (i != 1) {
            if (i == 2) {
                if (!abstractC1126600fQI.LJJI()) {
                    return false;
                }
                T t = abstractC1126600fQI.LIZIZ;
                if (!(t instanceof Gift) || (gift2 = (Gift) t) == null || gift2.type != 21) {
                    return false;
                }
            } else {
                throw new C1954807lC();
            }
        } else {
            if (!abstractC1126600fQI.LJJI()) {
                return false;
            }
            T t2 = abstractC1126600fQI.LIZIZ;
            if ((t2 instanceof Gift) && (gift = (Gift) t2) != null && gift.type == 21) {
                return false;
            }
        }
        return true;
    }
}
