package X;

import android.graphics.Bitmap;
import android.graphics.BitmapRegionDecoder;
import android.os.Build;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BigThumb;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.search.innerflowpage.SearchKeyFramePoint;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AwS88S1000000_3;

/* JADX INFO: renamed from: X.09MB, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09MB {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1284));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1285));
    public static final HashMap<String, Map<SearchKeyFramePoint, AnonymousClass0957<Bitmap>>> LIZJ = new HashMap<>();
    public static final HashSet<LifecycleOwner> LIZLLL = new HashSet<>();
    public static final ConcurrentHashMap<String, AnonymousClass0957<BitmapRegionDecoder>> LJ = new ConcurrentHashMap<>();

    public static BitmapRegionDecoder LIZIZ(Bitmap bitmap) {
        Object c098200Yq;
        ByteArrayOutputStream byteArrayOutputStream;
        Object obj = null;
        if (bitmap == null) {
            return null;
        }
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        try {
            if (bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream)) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
                try {
                    if (Build.VERSION.SDK_INT >= 31) {
                        c098200Yq = BitmapRegionDecoder.newInstance(byteArrayInputStream);
                    } else {
                        c098200Yq = BitmapRegionDecoder.newInstance((InputStream) byteArrayInputStream, false);
                    }
                    C2107108Nh.LIZ(byteArrayInputStream, null);
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        TryCatchGuardChecker.doCheck(th);
                        try {
                            throw th;
                        } catch (Throwable th3) {
                            th = th3;
                            while (true) {
                                try {
                                    TryCatchGuardChecker.doCheck(th);
                                    try {
                                        C2107108Nh.LIZ(byteArrayInputStream, th);
                                        throw th;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        try {
                                            TryCatchGuardChecker.doCheck(th);
                                            try {
                                                throw th;
                                            } catch (Throwable th5) {
                                                th = th5;
                                                while (true) {
                                                    try {
                                                        TryCatchGuardChecker.doCheck(th);
                                                        C2107108Nh.LIZ(byteArrayOutputStream, th);
                                                        throw th;
                                                    } catch (Throwable th6) {
                                                        th = th6;
                                                    }
                                                }
                                            }
                                        } catch (Throwable th7) {
                                            th = th7;
                                            th = null;
                                        }
                                    }
                                } catch (Throwable th8) {
                                    th = th8;
                                }
                            }
                        }
                    } catch (Throwable th9) {
                        th = th9;
                        th = null;
                    }
                }
            } else {
                c098200Yq = null;
            }
            C2107108Nh.LIZ(byteArrayOutputStream, null);
            C189200o6.m2constructorimpl(c098200Yq);
            if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                obj = c098200Yq;
            }
            return (BitmapRegionDecoder) obj;
        } catch (Throwable th10) {
            th = th10;
        }
    }

    public static Object LIZ(String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        if (str.length() == 0) {
            C189200o6.m2constructorimpl(null);
            c2252611DEt.resumeWith(null);
        } else {
            C1331660kl2.LJIIIZ(str).LJJII(new C1769706wR(c2252611DEt, 2));
        }
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }

    public static Map LIZJ(LifecycleOwner lifecycleOwner, Aweme aweme, List list) {
        List<BigThumb> bigThumbs;
        BigThumb bigThumb;
        String aid = aweme.getAid();
        BigThumb bigThumb2 = null;
        if (aid == null) {
            return null;
        }
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                SearchKeyFramePoint searchKeyFramePoint = (SearchKeyFramePoint) it2.next();
                if (!searchKeyFramePoint.fromKeySegmentInfo || searchKeyFramePoint.LIZ == null) {
                    Video video = aweme.getVideo();
                    if (video == null || (bigThumbs = video.getBigThumbs()) == null || (bigThumb = (BigThumb) C13LP.LJJJLL(bigThumbs)) == null || !(!bigThumb.imgUrls.isEmpty())) {
                        return null;
                    }
                    bigThumb2 = bigThumb;
                }
            }
        }
        Map<SearchKeyFramePoint, AnonymousClass0957<Bitmap>> map = LIZJ.get(aid);
        if (map != null) {
            return map;
        }
        C13DA c13da = new C13DA();
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            c13da.put(it3.next(), C090F.LIZIZ());
        }
        Map<SearchKeyFramePoint, AnonymousClass0957<Bitmap>> mapBuild = c13da.build();
        LIZJ.put(aid, mapBuild);
        C357001a4.LIZ(lifecycleOwner, new AwS88S1000000_3(aid, 19));
        C948503nH.LJ(lifecycleOwner, C0PEM.LIZJ, new C09MD(list, bigThumb2, mapBuild, lifecycleOwner, aid, null));
        HashSet<LifecycleOwner> hashSet = LIZLLL;
        if (!hashSet.contains(lifecycleOwner)) {
            hashSet.add(lifecycleOwner);
            C357001a4.LIZ(lifecycleOwner, new C5182020e(lifecycleOwner, 415));
        }
        return mapBuild;
    }
}
