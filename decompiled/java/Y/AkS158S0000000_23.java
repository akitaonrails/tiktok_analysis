package Y;

import X.C1488870oqb;
import X.C2214201BlK;
import X.InterfaceC1487280oo2;
import com.ss.android.ugc.aweme.feed.model.survey.FrequencyGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes24.dex */
public class AkS158S0000000_23 implements InterfaceC1487280oo2 {
    public final int $t;

    @Override // X.InterfaceC1487280oo2
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            default:
                return null;
        }
    }

    public AkS158S0000000_23(int i) {
        this.$t = i;
    }

    public static final Object apply$0(AkS158S0000000_23 akS158S0000000_23, Object obj) {
        return Boolean.valueOf(C2214201BlK.LJIIJJI);
    }

    public static final Object apply$1(AkS158S0000000_23 akS158S0000000_23, Object obj) {
        FrequencyGroup frequencyGroup = (FrequencyGroup) obj;
        C1488870oqb.LIZ.getClass();
        String str = frequencyGroup.groupName;
        ConcurrentHashMap<String, List<Long>> concurrentHashMap = C1488870oqb.LIZIZ;
        List<Long> arrayList = concurrentHashMap.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        arrayList.add(Long.valueOf(System.currentTimeMillis()));
        concurrentHashMap.put(str, arrayList);
        String str2 = frequencyGroup.groupName;
        return new Pair(str2, concurrentHashMap.get(str2));
    }
}
