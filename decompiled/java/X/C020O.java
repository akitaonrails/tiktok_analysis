package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.020O, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public class C020O extends C09AY implements Function0 {
    public final int $t;
    public int i2;
    public Object l1;
    public String s0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(C020O c020o) {
        StringBuilder sb = new StringBuilder("insert legacy at ");
        sb.append(c020o.i2);
        sb.append(" by ");
        sb.append(c020o.s0);
        sb.append(' ');
        List list = (List) c020o.l1;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(((Aweme) it2.next()).getAid());
        }
        sb.append(arrayList);
        sb.append(' ');
        return sb.toString();
    }

    public static final Object invoke$1(C020O c020o) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("insert cache ");
        sbLIZ.append(((Aweme) c020o.l1).getAid());
        sbLIZ.append(" at ");
        sbLIZ.append(c020o.i2);
        sbLIZ.append(" by ");
        sbLIZ.append(c020o.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020O(int i, Aweme aweme, String str, int i2) {
        super(0);
        this.$t = i2;
        this.l1 = aweme;
        this.i2 = i;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C020O(int i, int i2, String str, List<? extends Aweme> list) {
        super(0);
        this.$t = list;
        this.i2 = i;
        this.s0 = i2;
        this.l1 = str;
    }
}
