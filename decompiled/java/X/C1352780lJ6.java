package X;

import com.ss.android.ugc.now.interaction.assem.CommentItem;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AwS600S0100000_21;

/* JADX INFO: renamed from: X.0lJ6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1352780lJ6 {
    public boolean LJ;
    public AwS600S0100000_21 LJIIIIZZ;
    public final Map<String, Long> LIZ = new LinkedHashMap();
    public final Map<String, Long> LIZIZ = new LinkedHashMap();
    public final Set<String> LIZJ = new LinkedHashSet();
    public final Map<String, CommentItem> LIZLLL = new LinkedHashMap();
    public String LJFF = "";
    public String LJI = "";
    public String LJII = "";

    public final void LIZ() {
        for (String str : this.LIZJ) {
            CommentItem commentItem = (CommentItem) ((LinkedHashMap) this.LIZLLL).get(str);
            if (commentItem != null) {
                LIZJ(str, commentItem);
            }
        }
    }

    public final void LIZIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("recordCommentHide  ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        if (str == null || !this.LIZ.containsKey(str)) {
            return;
        }
        Long l = (Long) ((LinkedHashMap) this.LIZ).get(str);
        this.LIZ.remove(str);
        if (l != null) {
            l.longValue();
            long jCurrentTimeMillis = System.currentTimeMillis() - l.longValue();
            long jLongValue = 0;
            if (jCurrentTimeMillis <= 0) {
                return;
            }
            Long l2 = (Long) ((LinkedHashMap) this.LIZIZ).get(str);
            if (l2 != null) {
                jLongValue = l2.longValue();
            }
            this.LIZIZ.put(str, Long.valueOf(jCurrentTimeMillis + jLongValue));
        }
    }

    public final void LIZJ(String str, CommentItem commentItem) {
        if (!this.LJ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("recordCommentShow ");
            sbLIZ.append(str);
            sbLIZ.append(" but current panel is hide");
            C2188811AlT.LIZIZ(sbLIZ);
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("recordCommentShow ");
        sbLIZ2.append(str);
        C2188811AlT.LIZIZ(sbLIZ2);
        if (str == null) {
            return;
        }
        this.LIZ.put(str, Long.valueOf(System.currentTimeMillis()));
        this.LIZJ.add(str);
        this.LIZLLL.put(str, commentItem);
    }
}
