package X;

import com.ss.android.ugc.aweme.fe.method.feeds.pojo.FeedsResponse;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0z88, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1884140z88 {
    public static final HashMap<String, C1884130z87> LIZ = new HashMap<>();

    public static C1884130z87 LIZ(String str) {
        HashMap<String, C1884130z87> map = LIZ;
        C1884130z87 c1884130z87 = map.get(str);
        if (c1884130z87 == null) {
            c1884130z87 = new C1884130z87(new FeedsResponse(), str);
            map.put(str, c1884130z87);
        }
        if (!C2296808zG.LJI(c1884130z87)) {
            C1884130z87 c1884130z872 = new C1884130z87(c1884130z87.getData(), c1884130z87.LLILLJJLI);
            c1884130z872.LLJ.addAll(c1884130z87.LLJ);
            c1884130z872.LLJI = c1884130z87.LLJI;
            c1884130z872.LLJIJIL = c1884130z87.LLJIJIL;
            map.put(str, c1884130z872);
            return c1884130z872;
        }
        return c1884130z87;
    }
}
