package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.model.Gift;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00yM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C252800yM {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(long j, String str, List list) {
        List<Gift> list2;
        String uri;
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                GiftPage giftPage = (GiftPage) it2.next();
                if (giftPage != null && (list2 = giftPage.gifts) != null) {
                    for (Gift gift : list2) {
                        if (gift.id == j) {
                            ImageModel imageModel = gift.image;
                            if (imageModel != null) {
                                uri = imageModel.getUri();
                            } else {
                                uri = null;
                            }
                            if (Intrinsics.LJFF(uri, str)) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }
}
