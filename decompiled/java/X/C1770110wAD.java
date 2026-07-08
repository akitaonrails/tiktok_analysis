package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.ReachCfg;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.VideoAnchorProduct;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0wAD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1770110wAD {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final Map<String, Object> LIZLLL;
    public final C1741550vQ9 LJ;
    public final ReachCfg LJFF;
    public final Bitmap LJI;
    public final Integer LJII;
    public final Integer LJIIIIZZ;
    public final Map<String, Object> LJIIIZ;
    public final List<VideoAnchorProduct> LJIIJ;

    public C1770110wAD() {
        throw null;
    }

    public C1770110wAD(String str, String str2, String str3, Map map, C1741550vQ9 c1741550vQ9, ReachCfg reachCfg, Bitmap bitmap, Integer num, Integer num2, Map map2, List list, int i) {
        num = (i & 128) != 0 ? 0 : num;
        num2 = (i & 256) != 0 ? 0 : num2;
        map2 = (i & 512) != 0 ? new LinkedHashMap() : map2;
        list = (i & 1024) != 0 ? null : list;
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = map;
        this.LJ = c1741550vQ9;
        this.LJFF = reachCfg;
        this.LJI = bitmap;
        this.LJII = num;
        this.LJIIIIZZ = num2;
        this.LJIIIZ = map2;
        this.LJIIJ = list;
    }
}
