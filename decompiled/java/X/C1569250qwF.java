package X;

import com.ss.android.ugc.aweme.feed.landscape.service.LandscapeFeedMonitorImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS18S2300000_24;

/* JADX INFO: renamed from: X.0qwF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1569250qwF {
    public final String LIZ;
    public final List<String> LIZIZ;
    public final Map<String, Integer> LIZJ;
    public final Map<String, String> LIZLLL;
    public final boolean LJ;
    public final String LJFF;
    public final List<C1569270qwH> LJI;
    public int LJII;

    public /* synthetic */ C1569250qwF(String str, List list, Map map) {
        this(str, list, map, null, false, null);
    }

    public final void LIZ(String str, Long l, String str2, Map map) {
        List<String> list = LandscapeFeedMonitorImpl.LIZ;
        C1561780qkC.LIZ(new AwS18S2300000_24(this, (C1569250qwF) str2, (String) l, (Long) str, (String) map, (Map<String, String>) 0));
    }

    public C1569250qwF(String str, List<String> list, Map<String, Integer> map, Map<String, String> map2, boolean z, String str2) {
        this.LIZ = str;
        this.LIZIZ = list;
        this.LIZJ = map;
        this.LIZLLL = map2;
        this.LJ = z;
        this.LJFF = str2;
        this.LJI = new ArrayList();
        this.LJII = list.size();
    }
}
