package X;

import com.ss.android.ugc.now.interaction.assem.CommentItem;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.internal.AwS600S0100000_21;

/* JADX INFO: renamed from: X.0lJ5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class CallableC1352770lJ5<V> implements Callable {
    public final /* synthetic */ C1352780lJ6 LL;
    public final /* synthetic */ Map<String, Integer> LLILLJJLI;

    public CallableC1352770lJ5(C1352780lJ6 c1352780lJ6, Map<String, Integer> map) {
        this.LL = c1352780lJ6;
        this.LLILLJJLI = map;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C1C7U.LIZ("CommentDurationTrackingUtil@5b3b.reportCommentDuration$1");
        C1352780lJ6 c1352780lJ6 = this.LL;
        Iterator<String> it2 = c1352780lJ6.LIZJ.iterator();
        while (it2.hasNext()) {
            c1352780lJ6.LIZIZ(it2.next());
        }
        Iterator it3 = ((LinkedHashMap) this.LL.LIZIZ).entrySet().iterator();
        while (it3.hasNext()) {
            Map.Entry entry = (Map.Entry) it3.next();
            Map<String, Integer> map = this.LLILLJJLI;
            if (map == null) {
                String str = (String) entry.getKey();
                long jLongValue = ((Number) entry.getValue()).longValue();
                CommentItem commentItem = (CommentItem) ((LinkedHashMap) this.LL.LIZLLL).get(str);
                it3.remove();
                C1352780lJ6 c1352780lJ62 = this.LL;
                String str2 = c1352780lJ62.LJII;
                String str3 = c1352780lJ62.LJFF;
                String str4 = c1352780lJ62.LJI;
                AwS600S0100000_21 awS600S0100000_21 = c1352780lJ62.LJIIIIZZ;
                C1350960lGA.LIZLLL(str2, str3, str4, awS600S0100000_21 != null ? ((Number) awS600S0100000_21.invoke(commentItem)).intValue() : 0, jLongValue, commentItem != null ? commentItem.getComment() : null);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("comment_duration  ");
                sbLIZ.append(str);
                sbLIZ.append(' ');
                sbLIZ.append(jLongValue);
                C2188811AlT.LIZIZ(sbLIZ);
            } else if (map.containsKey(entry.getKey())) {
                String str5 = (String) entry.getKey();
                long jLongValue2 = ((Number) entry.getValue()).longValue();
                CommentItem commentItem2 = (CommentItem) ((LinkedHashMap) this.LL.LIZLLL).get(str5);
                it3.remove();
                C1352780lJ6 c1352780lJ63 = this.LL;
                String str6 = c1352780lJ63.LJII;
                String str7 = c1352780lJ63.LJFF;
                String str8 = c1352780lJ63.LJI;
                Integer num = this.LLILLJJLI.get(entry.getKey());
                C1350960lGA.LIZLLL(str6, str7, str8, num != null ? num.intValue() : 0, jLongValue2, commentItem2 != null ? commentItem2.getComment() : null);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("comment_duration forceReportList  ");
                sbLIZ2.append(str5);
                sbLIZ2.append(' ');
                sbLIZ2.append(jLongValue2);
                C2188811AlT.LIZIZ(sbLIZ2);
            }
        }
        C1352780lJ6 c1352780lJ64 = this.LL;
        Iterator it4 = ((LinkedHashMap) c1352780lJ64.LIZLLL).keySet().iterator();
        while (it4.hasNext()) {
            if (!c1352780lJ64.LIZJ.contains(it4.next())) {
                it4.remove();
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CommentDurationTrackingUtil@5b3b.reportCommentDuration$1");
        return unit;
    }
}
