package X;

import com.tiktok.myna.preload.MynaGeckoChannelPreloadInfo;
import com.tiktok.myna.preload.MynaTemplatePreloadInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0c5W, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C998400c5W {
    public static final C998400c5W LIZ = new C998400c5W();

    public static MynaGeckoChannelPreloadInfo LIZ(List list) {
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C990550bsr c990550bsr = (C990550bsr) it2.next();
            arrayList.add(new MynaTemplatePreloadInfo(c990550bsr.LIZIZ, c990550bsr.LIZ, c990550bsr.LIZJ));
        }
        return new MynaGeckoChannelPreloadInfo(arrayList);
    }
}
