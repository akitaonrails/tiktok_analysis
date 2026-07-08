package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.AIGCStyleConfig;
import com.ss.android.ugc.aweme.tako.ccl.model.api.ActionBarImageItem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.ActionBarItemList;
import com.ss.android.ugc.aweme.tako.ccl.model.api.ConvertStyle;
import com.ss.android.ugc.aweme.tako.ccl.model.api.CreativeTemplate;
import com.ss.android.ugc.aweme.tako.ccl.model.api.NewActionBarItem;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0yJc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1852820yJc {
    public final String LIZ;
    public final List<NewActionBarItem> LIZIZ;
    public final List<ActionBarImageItem> LIZJ;
    public final List<CreativeTemplate> LIZLLL;
    public final ConvertStyle LJ;
    public final Map<String, ActionBarItemList> LJFF;
    public final AIGCStyleConfig LJI;

    /* JADX WARN: Illegal instructions before constructor call */
    public C1852820yJc() {
        C13BV c13bv = C13BV.INSTANCE;
        this(null, c13bv, c13bv, c13bv, null, C2097608Jq.LJ(), null);
    }

    public C1852820yJc(String str, List<NewActionBarItem> list, List<ActionBarImageItem> list2, List<CreativeTemplate> list3, ConvertStyle convertStyle, Map<String, ActionBarItemList> map, AIGCStyleConfig aIGCStyleConfig) {
        this.LIZ = str;
        this.LIZIZ = list;
        this.LIZJ = list2;
        this.LIZLLL = list3;
        this.LJ = convertStyle;
        this.LJFF = map;
        this.LJI = aIGCStyleConfig;
    }
}
