package X;

import android.app.Activity;
import android.util.LruCache;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0l5I, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1344220l5I {
    public static String LIZIZ;
    public static final C1344220l5I LIZ = new C1344220l5I();
    public static final LruCache<C1344500l5k, C1344250l5L> LIZJ = new LruCache<>(10);
    public static final LruCache<Integer, String> LIZLLL = new LruCache<>(100);
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(19));

    public static void LIZ() {
        if (Intrinsics.LJFF(LIZIZ, C461720I8s.LIZIZ())) {
            return;
        }
        LIZIZ = C461720I8s.LIZIZ();
        LIZJ.evictAll();
        LIZLLL.evictAll();
    }

    public static void LIZIZ(String str) {
        Map<C1344500l5k, C1344250l5L> mapSnapshot;
        String str2;
        if (str != null && (mapSnapshot = LIZJ.snapshot()) != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<C1344500l5k, C1344250l5L> entry : mapSnapshot.entrySet()) {
                C1344500l5k key = entry.getKey();
                if (key != null) {
                    str2 = key.LIZ;
                } else {
                    str2 = null;
                }
                if (Intrinsics.LJFF(str2, str)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Iterator it2 = linkedHashMap.entrySet().iterator();
            while (it2.hasNext()) {
                LIZJ.remove((C1344500l5k) ((Map.Entry) it2.next()).getKey());
            }
        }
    }

    public static C1344250l5L LIZJ(C1344500l5k c1344500l5k) {
        if (c1344500l5k == null) {
            return null;
        }
        LruCache<C1344500l5k, C1344250l5L> lruCache = LIZJ;
        if (lruCache != null) {
            C1741890vQh.LJIIIIZZ(lruCache);
        }
        C1344250l5L c1344250l5L = lruCache.get(c1344500l5k);
        if (c1344250l5L == null) {
            return null;
        }
        if (c1344250l5L.requestTime <= System.currentTimeMillis() - ((long) 300000)) {
            lruCache.remove(c1344500l5k);
            return null;
        }
        return c1344250l5L;
    }

    public static void LJ(Aweme aweme, Activity activity) {
        if (aweme != null && activity != null && !activity.isFinishing() && !activity.isDestroyed()) {
            LIZ();
            LIZLLL.put(Integer.valueOf(activity.hashCode()), aweme.getAid());
        }
    }

    public static void LIZLLL(Activity activity, Fragment fragment, Aweme aweme, String str, String str2, boolean z) {
        String aid;
        Long lValueOf;
        int iLIZ;
        if (activity != null && !activity.isFinishing() && aweme != null && (aid = aweme.getAid()) != null && aid.length() != 0) {
            AwemeStatistics statistics = aweme.getStatistics();
            if (statistics != null && statistics.getCommentCount() == 0) {
                return;
            }
            if (!Intrinsics.LJFF(str, "homepage_hot") && (C296030Biz.LIZIZ() & 4) > 0) {
                return;
            }
            if ((!C735370Ssx.LJJIJLIJ(aweme) || !AwemeExtKt.isProhibited(aweme)) && !C729510SjV.LJJIJIL(aweme)) {
                LIZ();
                if (!activity.isFinishing() && !activity.isDestroyed()) {
                    String aid2 = aweme.getAid();
                    if (aid2 != null && aid2.equals(LIZLLL.get(Integer.valueOf(activity.hashCode())))) {
                        return;
                    }
                    if (C1389300mG0.LJIIL(fragment) && !C296460Bjg.LIZJ()) {
                        return;
                    }
                    int value = EnumC1220600hru.DEFAULT.getValue();
                    EnumC1220570hrr enumC1220570hrr = EnumC1220570hrr.DEFAULT;
                    int value2 = enumC1220570hrr.getValue();
                    C07GY.LIZ.getClass();
                    if (C07GY.LIZ()) {
                        C1344380l5Y.LIZ.getClass();
                        if (C1344380l5Y.LIZIZ(aweme, str, null)) {
                            value2 = EnumC1220570hrr.AUTHOR_SIDE_FIRST_COMMENT.getValue();
                        }
                    }
                    C1344500l5k c1344500l5k = new C1344500l5k(0, value, value2, 0L, aid, "");
                    if (LIZJ(c1344500l5k) != null) {
                        return;
                    }
                    C01GW<C740490T2x> c01gw = C740490T2x.LIZLLL;
                    C739240SzC.LIZIZ().LIZIZ = true;
                    if (C295800Bic.LIZ()) {
                        C1344470l5h.LIZ.getClass();
                        C1344470l5h.LIZJ(c1344500l5k);
                    }
                    LJ(aweme, activity);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("CommentPreRequestHelper.preRequestCommentListIfNeed needSplitResponse = ");
                    sbLIZ.append(z);
                    C2188811AlT.LIZIZ(sbLIZ);
                    C1342970l3H c1342970l3H = C1342970l3H.LIZ;
                    AwemeStatistics statistics2 = aweme.getStatistics();
                    if (statistics2 != null) {
                        lValueOf = Long.valueOf(statistics2.getCommentCount());
                    } else {
                        lValueOf = null;
                    }
                    if (C1342970l3H.LIZIZ(lValueOf)) {
                        iLIZ = C1342970l3H.LIZIZ.LJI();
                    } else {
                        iLIZ = C342480Dbi.LIZ();
                    }
                    C1346170l8R.LIZJ(aid, true);
                    C118300cf c118300cf = new C118300cf();
                    c118300cf.element = C1350950lG9.LIZIZ.LJI();
                    C118300cf c118300cf2 = new C118300cf();
                    c118300cf2.element = enumC1220570hrr.getValue();
                    if (C07GY.LIZ()) {
                        C1344380l5Y.LIZ.getClass();
                        if (C1344380l5Y.LIZIZ(aweme, str, "")) {
                            c118300cf2.element = EnumC1220570hrr.AUTHOR_SIDE_FIRST_COMMENT.getValue();
                        }
                    }
                    LIZJ.put(c1344500l5k, new C1344250l5L(System.currentTimeMillis(), C23250099c.LIZIZ(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1220650hrz(str, str2, aweme, aid, iLIZ, "", c118300cf, z, c118300cf2, null), 3)));
                }
            }
        }
    }
}
