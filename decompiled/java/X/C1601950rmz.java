package X;

import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0rmz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1601950rmz {
    public static final C1601950rmz LIZ = new C1601950rmz();

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZ(C1601460rmC c1601460rmC, Exception exc) {
        Long lValueOf;
        Long lValueOf2;
        C1601590rmP c1601590rmP = c1601460rmC.LJJJ;
        Integer num = null;
        if (c1601590rmP != null) {
            lValueOf = Long.valueOf(c1601590rmP.LJ);
        } else {
            lValueOf = null;
        }
        boolean z = exc instanceof C1494450ozb;
        C118300cf c118300cf = new C118300cf();
        C259800zU c259800zU = new C259800zU();
        if (exc instanceof C1494690ozz) {
            C1494690ozz c1494690ozz = (C1494690ozz) exc;
            c118300cf.element = c1494690ozz.getCronetInternalErrorCode();
            Object obj = c1494690ozz.infoObj;
            boolean z2 = obj instanceof C1494850p0F;
            T t = obj;
            if (!z2) {
                t = 0;
            }
            c259800zU.element = t;
        } else {
            c118300cf.element = 10000;
        }
        C1494600ozq c1494600ozq = (C1494600ozq) c259800zU.element;
        if (c1494600ozq != null) {
            lValueOf2 = Long.valueOf(c1494600ozq.LJ);
        } else {
            lValueOf2 = null;
        }
        if (lValueOf2 != null) {
            lValueOf2.longValue();
            ConcurrentHashMap<Long, C0XPL> concurrentHashMap = C0XPJ.LIZ;
            C0XPL c0xpl = concurrentHashMap.get(lValueOf2);
            if (c0xpl != null) {
                concurrentHashMap.remove(lValueOf2);
                num = c0xpl.LIZ;
            }
        }
        C0S78.LIZJ(new C1601580rmO(c1601460rmC, "feed_network", new C1601940rmy(c259800zU, exc, c1601460rmC, c118300cf, z, lValueOf, num)), true);
    }

    public static void LIZIZ(C1601460rmC c1601460rmC, C0XLK c0xlk, FeedItemList feedItemList) {
        Long lValueOf;
        C1494850p0F c1494850p0F = c0xlk.LJJIFFI;
        JSONObject jSONObject = c0xlk.LJJ;
        C1601590rmP c1601590rmP = c1601460rmC.LJJJ;
        if (c1601590rmP != null) {
            lValueOf = Long.valueOf(c1601590rmP.LJ);
        } else {
            lValueOf = null;
        }
        C0S78.LIZJ(new C1601580rmO(c1601460rmC, "feed_network", new C1601930rmx(feedItemList, c1494850p0F, c1601460rmC, lValueOf, jSONObject)), true);
    }
}
