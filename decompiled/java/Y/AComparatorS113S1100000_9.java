package Y;

import X.C1598580rhY;
import X.C20085613iQ;
import X.C614770O9j;
import X.C619430ORh;
import X.InterfaceC1891350zJl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import java.util.Comparator;

/* JADX INFO: loaded from: classes10.dex */
public class AComparatorS113S1100000_9 implements Comparator {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        switch (this.$t) {
            case 0:
                return compare$0(this, t, t2);
            case 1:
                return compare$1(this, t, t2);
            case 2:
                return compare$2(this, t, t2);
            default:
                return 0;
        }
    }

    public AComparatorS113S1100000_9(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }

    public static final int compare$0(AComparatorS113S1100000_9 aComparatorS113S1100000_9, Object obj, Object obj2) {
        Aweme aweme = (Aweme) obj2;
        C1598580rhY c1598580rhY = (C1598580rhY) aComparatorS113S1100000_9.l1;
        String str = aComparatorS113S1100000_9.s0;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        c1598580rhY.getClass();
        C614770O9j c614770O9j = C614770O9j.LIZIZ;
        Integer numValueOf = Integer.valueOf(c614770O9j.LIZIZ().LIZIZ(aweme, null, str));
        Aweme aweme2 = (Aweme) obj;
        C1598580rhY c1598580rhY2 = (C1598580rhY) aComparatorS113S1100000_9.l1;
        String str3 = aComparatorS113S1100000_9.s0;
        if (str3 != null) {
            str2 = str3;
        }
        c1598580rhY2.getClass();
        return C20085613iQ.LIZIZ(numValueOf, Integer.valueOf(c614770O9j.LIZIZ().LIZIZ(aweme2, null, str2)));
    }

    public static final int compare$1(AComparatorS113S1100000_9 aComparatorS113S1100000_9, Object obj, Object obj2) {
        C619430ORh c619430ORh = (C619430ORh) aComparatorS113S1100000_9.l1;
        String str = aComparatorS113S1100000_9.s0;
        c619430ORh.getClass();
        Integer numValueOf = Integer.valueOf(C619430ORh.LIZJ((InterfaceC1891350zJl) obj2, str));
        C619430ORh c619430ORh2 = (C619430ORh) aComparatorS113S1100000_9.l1;
        String str2 = aComparatorS113S1100000_9.s0;
        c619430ORh2.getClass();
        return C20085613iQ.LIZIZ(numValueOf, Integer.valueOf(C619430ORh.LIZJ((InterfaceC1891350zJl) obj, str2)));
    }

    public static final int compare$2(AComparatorS113S1100000_9 aComparatorS113S1100000_9, Object obj, Object obj2) {
        Aweme aweme = (Aweme) obj2;
        C619430ORh c619430ORh = (C619430ORh) aComparatorS113S1100000_9.l1;
        String str = aComparatorS113S1100000_9.s0;
        c619430ORh.getClass();
        C614770O9j c614770O9j = C614770O9j.LIZIZ;
        Integer numValueOf = Integer.valueOf(c614770O9j.LIZIZ().LIZ(aweme.getAuthor(), false, AwemeExtKt.getAuthorUid(aweme), str));
        Aweme aweme2 = (Aweme) obj;
        C619430ORh c619430ORh2 = (C619430ORh) aComparatorS113S1100000_9.l1;
        String str2 = aComparatorS113S1100000_9.s0;
        c619430ORh2.getClass();
        return C20085613iQ.LIZIZ(numValueOf, Integer.valueOf(c614770O9j.LIZIZ().LIZ(aweme2.getAuthor(), false, AwemeExtKt.getAuthorUid(aweme2), str2)));
    }
}
