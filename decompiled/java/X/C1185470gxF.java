package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.poi.detail.container.newarchi.cache.PoiDetailDataCacheExp;
import com.ss.android.ugc.aweme.slash.data.Node;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0gxF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1185470gxF {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(765));

    public static boolean LIZ() {
        List<String> list = PoiDetailDataCacheExp.LIZ().cacheType;
        if (list.isEmpty()) {
            return false;
        }
        return list.contains(EnumC1202700hP2.SLASH_LITE_PRELOAD.toString());
    }

    public static boolean LIZJ() {
        return PoiDetailDataCacheExp.LIZ().enable == 1;
    }

    public static C1185690gxb LIZIZ(String str) {
        boolean z;
        C1185690gxb c1185690gxbLIZJ;
        if (PoiDetailDataCacheExp.LIZ().enable == 1) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return null;
        }
        C1185510gxJ c1185510gxJ = (C1185510gxJ) LIZ.getValue();
        synchronized (c1185510gxJ) {
            try {
                c1185690gxbLIZJ = c1185510gxJ.LIZIZ.LIZJ(str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (c1185690gxbLIZJ == null) {
            return null;
        }
        c1185690gxbLIZJ.LIZIZ.setPreloadFlag(c1185690gxbLIZJ.LIZJ.toString());
        if (PoiDetailDataCacheExp.LIZ().rmRedundantComponent == 1) {
            Map<String, Node> nodes = c1185690gxbLIZJ.LIZIZ.getNodes();
            if (C19719512Dh.LJII(nodes) && nodes != null) {
                Iterator<Map.Entry<String, Node>> it2 = nodes.entrySet().iterator();
                while (it2.hasNext()) {
                    if (!LJ(it2.next().getKey())) {
                        it2.remove();
                    }
                }
            }
        }
        return c1185690gxbLIZJ;
    }

    public static boolean LJ(String str) {
        List<String> list = PoiDetailDataCacheExp.LIZ().cacheInstanceIds;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<String> it2 = list.iterator();
            while (it2.hasNext()) {
                if (a0.LJJIIZI(str, it2.next(), false)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1185690gxb LIZLLL(java.lang.String r8, com.ss.android.ugc.aweme.slash.data.SlashPage r9, X.EnumC1202700hP2 r10) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1185470gxF.LIZLLL(java.lang.String, com.ss.android.ugc.aweme.slash.data.SlashPage, X.0hP2):X.0gxb");
    }
}
