package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0N3q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C587800N3q {
    public static final C587800N3q LIZ = new C587800N3q();

    public static final void LIZ(FeedItemList feedItemList, EnumC587690N3f enumC587690N3f) {
        List<Aweme> items;
        List<PhotoModeImageUrlModel> imageList;
        if (feedItemList != null && (items = feedItemList.getItems()) != null && !items.isEmpty()) {
            List<Aweme> items2 = feedItemList.getItems();
            List<Aweme> listLLIIII = null;
            if (items2 != null) {
                ArrayList arrayList = new ArrayList();
                for (Aweme aweme : items2) {
                    if (C582980Mtk.LIZIZ(aweme)) {
                        arrayList.add(aweme);
                    }
                }
                listLLIIII = C13LP.LLIIII(arrayList);
            }
            if (listLLIIII != null && !listLLIIII.isEmpty()) {
                for (Aweme aweme2 : listLLIIII) {
                    C0N3Z.LIZ.getClass();
                    if (aweme2 != null) {
                        PhotoModeImageInfo photoModeImageInfo = aweme2.getPhotoModeImageInfo();
                        if (photoModeImageInfo == null || (imageList = photoModeImageInfo.getImageList()) == null) {
                            imageList = C13BV.INSTANCE;
                        }
                        int iMin = Math.min(5, imageList.size());
                        for (int i = 0; i < iMin; i++) {
                            long jElapsedRealtime = SystemClock.elapsedRealtime();
                            C1EE2 c1ee2 = C1EE2.LIZIZ;
                            C844470XAv.LIZ.getClass();
                            c1ee2.LJJIJ(C844470XAv.LIZ(), aweme2, i, EnumC1334360kpO.IMMEDIATE, new C587790N3p(jElapsedRealtime, enumC587690N3f));
                        }
                    }
                }
            }
        }
    }
}
