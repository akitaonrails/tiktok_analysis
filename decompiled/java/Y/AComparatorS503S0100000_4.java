package Y;

import X.C0D0G;
import X.C13LP;
import X.C20085613iQ;
import com.ss.android.ugc.aweme.im.common.model.BaseContact;
import com.ss.android.ugc.aweme.mention.viewmodel.MentionPanelViewModel;
import java.util.Comparator;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public class AComparatorS503S0100000_4 implements Comparator {
    public final int $t;
    public Object l0;

    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        switch (this.$t) {
            case 0:
                return compare$0(this, t, t2);
            case 1:
                return compare$1(this, t, t2);
            case 2:
                return compare$2(this, t, t2);
            case 3:
                return compare$3(this, t, t2);
            case 4:
                return compare$4(this, t, t2);
            case 5:
                return compare$5(this, t, t2);
            default:
                return 0;
        }
    }

    public AComparatorS503S0100000_4(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final int compare$0(AComparatorS503S0100000_4 aComparatorS503S0100000_4, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(C13LP.LJJJZ(((BaseContact) obj).getUid(), (Set) aComparatorS503S0100000_4.l0)), Integer.valueOf(C13LP.LJJJZ(((BaseContact) obj2).getUid(), (Set) aComparatorS503S0100000_4.l0)));
    }

    public static final int compare$1(AComparatorS503S0100000_4 aComparatorS503S0100000_4, Object obj, Object obj2) {
        long jLongValue;
        Long l = ((MentionPanelViewModel) aComparatorS503S0100000_4.l0).LLJJIII.get(((BaseContact) obj).getUid());
        long jLongValue2 = 0;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        Long lValueOf = Long.valueOf(jLongValue);
        Long l2 = ((MentionPanelViewModel) aComparatorS503S0100000_4.l0).LLJJIII.get(((BaseContact) obj2).getUid());
        if (l2 != null) {
            jLongValue2 = l2.longValue();
        }
        return C20085613iQ.LIZIZ(lValueOf, Long.valueOf(jLongValue2));
    }

    public static final int compare$2(AComparatorS503S0100000_4 aComparatorS503S0100000_4, Object obj, Object obj2) {
        ((C0D0G) aComparatorS503S0100000_4.l0).getClass();
        return C0D0G.LIZ((String) obj, (String) obj2);
    }

    public static final int compare$3(AComparatorS503S0100000_4 aComparatorS503S0100000_4, Object obj, Object obj2) {
        ((C0D0G) aComparatorS503S0100000_4.l0).getClass();
        return C0D0G.LIZ((String) obj, (String) obj2);
    }

    public static final int compare$4(AComparatorS503S0100000_4 aComparatorS503S0100000_4, Object obj, Object obj2) {
        ((C0D0G) aComparatorS503S0100000_4.l0).getClass();
        return C0D0G.LIZ((String) obj, (String) obj2);
    }

    public static final int compare$5(AComparatorS503S0100000_4 aComparatorS503S0100000_4, Object obj, Object obj2) {
        ((C0D0G) aComparatorS503S0100000_4.l0).getClass();
        return C0D0G.LIZ((String) obj, (String) obj2);
    }
}
