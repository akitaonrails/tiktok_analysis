package X;

import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0pNp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1509470pNp {
    public static WeakReference<VerticalViewPager> LIZ;
    public static WeakReference<C0SR4> LIZIZ;
    public static long LIZJ = System.currentTimeMillis();
    public static int LIZLLL = -1;
    public static Pair<Integer, Long> LJ;
    public static String LJFF;
    public static int LJI;
    public static long LJII;

    /* JADX WARN: Removed duplicated region for block: B:40:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZJ() throws org.json.JSONException {
        /*
            java.lang.ref.WeakReference<com.ss.android.ugc.aweme.common.widget.VerticalViewPager> r0 = X.C1509470pNp.LIZ
            if (r0 == 0) goto La8
            java.lang.Object r2 = r0.get()
            X.0sA0 r2 = (X.AbstractC1616220sA0) r2
            if (r2 == 0) goto La8
            java.lang.ref.WeakReference<X.0SR4> r0 = X.C1509470pNp.LIZIZ
            if (r0 == 0) goto La8
            java.lang.Object r0 = r0.get()
            X.0SR4 r0 = (X.C0SR4) r0
            if (r0 == 0) goto La8
            java.util.List r1 = r0.LJJJLZIJ()
            int r0 = r2.getCurrentItem()
            java.lang.Object r0 = X.C13LP.LJJJLZIJ(r0, r1)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.ss.android.ugc.aweme.feed.model.Aweme) r0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r6 = 0
            if (r0 == 0) goto L73
            java.lang.String r0 = r0.getAid()
        L32:
            r10 = 8
            r3 = 1
            r5 = 0
            org.json.JSONObject r7 = X.C1509400pNi.LIZ(r10, r0, r3, r3, r5)
            X.0pOl r0 = com.ss.ugc.clientai.core.api.FeatureServiceManager.Companion
            r0.getClass()
            com.ss.ugc.clientai.core.api.FeatureServiceManager r2 = X.C1510050pOl.LIZ()
            java.lang.String r1 = "f_play"
            r0 = 2
            com.ss.ugc.clientai.core.api.FeatureProducer r5 = com.ss.ugc.clientai.core.api.FeatureServiceManager.getProducer$default(r2, r1, r5, r0, r6)
            if (r5 == 0) goto L56
            java.lang.String r6 = "play_time"
            java.lang.String r8 = "search_smart_load_more"
            r9 = 0
            r11 = r9
            java.lang.Object r6 = com.ss.ugc.clientai.core.api.FeatureProducer.getFeature$default(r5, r6, r7, r8, r9, r10, r11)
        L56:
            boolean r0 = r6 instanceof java.util.ArrayList
            if (r0 == 0) goto La3
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            if (r6 == 0) goto La3
            int r2 = r6.size()
            if (r2 <= 0) goto La3
            java.lang.String r5 = "0"
            if (r2 >= r10) goto L75
            int r1 = 8 - r2
            r0 = 0
        L6b:
            if (r0 >= r1) goto L75
            r4.append(r5)
            int r0 = r0 + 1
            goto L6b
        L73:
            r0 = r6
            goto L32
        L75:
            int r2 = java.lang.Math.min(r2, r10)
            int r2 = r2 - r3
        L7a:
            r0 = -1
            if (r0 >= r2) goto La3
            if (r6 == 0) goto L9f
            java.lang.Object r0 = X.C13LP.LJJJLZIJ(r2, r6)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L9f
            int r1 = r0.intValue()
            r0 = 2000(0x7d0, float:2.803E-42)
            if (r1 <= r0) goto L97
            java.lang.String r0 = "2"
            r4.append(r0)
        L94:
            int r2 = r2 + (-1)
            goto L7a
        L97:
            if (r3 > r1) goto L9f
            java.lang.String r0 = "1"
            r4.append(r0)
            goto L94
        L9f:
            r4.append(r5)
            goto L94
        La3:
            java.lang.String r0 = r4.toString()
            return r0
        La8:
            java.lang.String r0 = ""
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1509470pNp.LIZJ():java.lang.String");
    }

    public static Pair LIZLLL() {
        VerticalViewPager verticalViewPager;
        C0SR4 c0sr4;
        int currentItem;
        WeakReference<VerticalViewPager> weakReference = LIZ;
        long duration = 0;
        int i = 0;
        if (weakReference == null || (verticalViewPager = weakReference.get()) == null) {
            return new Pair(0, 0L);
        }
        WeakReference<C0SR4> weakReference2 = LIZIZ;
        if (weakReference2 == null || (c0sr4 = weakReference2.get()) == null) {
            return new Pair(0, 0L);
        }
        List<Aweme> listLJJJLZIJ = c0sr4.LJJJLZIJ();
        int size = listLJJJLZIJ.size();
        int size2 = LIZLLL;
        if (size < size2) {
            size2 = listLJJJLZIJ.size();
        }
        if (size2 > 0 && (currentItem = verticalViewPager.getCurrentItem()) < size2 && (size2 - currentItem) - 1 > 0) {
            Iterator<Aweme> it2 = listLJJJLZIJ.subList(currentItem + 1, size2).iterator();
            while (it2.hasNext()) {
                Video video = it2.next().getVideo();
                if (video != null) {
                    duration += (long) video.getDuration();
                }
            }
        }
        return new Pair(Integer.valueOf(i), Long.valueOf(duration));
    }

    static {
        new Pair(0, 0L);
        LJ = new Pair<>(0, 0L);
        LJFF = "";
        LJI = -1;
        LJII = -1L;
    }

    public static String LIZ() {
        switch (C2201031BCj.LIZ[C1BCA.LJIIIZ().LIZIZ.ordinal()]) {
            case 1:
                return "";
            case 2:
                return "WiFi";
            case 3:
                return "2G";
            case 4:
                return "3G";
            case 5:
                return "4G";
            case 6:
                return "5G";
            default:
                throw new C1954807lC();
        }
    }

    public static int LIZIZ(String str) {
        VerticalViewPager verticalViewPager;
        WeakReference<C0SR4> weakReference;
        C0SR4 c0sr4;
        String aid;
        WeakReference<VerticalViewPager> weakReference2 = LIZ;
        if (weakReference2 != null && (verticalViewPager = weakReference2.get()) != null && (weakReference = LIZIZ) != null && (c0sr4 = weakReference.get()) != null) {
            Aweme aweme = (Aweme) C13LP.LJJJLZIJ(verticalViewPager.getCurrentItem(), c0sr4.LJJJLZIJ());
            if (aweme != null) {
                aid = aweme.getAid();
            } else {
                aid = null;
            }
            return !Intrinsics.LJFF(aid, str) ? 1 : 0;
        }
        return 0;
    }

    public static int LJ(Map map) {
        VerticalViewPager verticalViewPager;
        WeakReference<C0SR4> weakReference;
        C0SR4 c0sr4;
        String aid;
        WeakReference<VerticalViewPager> weakReference2 = LIZ;
        if (weakReference2 != null && (verticalViewPager = weakReference2.get()) != null && (weakReference = LIZIZ) != null && (c0sr4 = weakReference.get()) != null) {
            Aweme aweme = (Aweme) C13LP.LJJJLZIJ(verticalViewPager.getCurrentItem(), c0sr4.LJJJLZIJ());
            if (aweme != null && (aid = aweme.getAid()) != null && map.containsKey(aid)) {
                return 1;
            }
            return 0;
        }
        return 0;
    }
}
