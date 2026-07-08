package Y;

import X.C1283050jUd;
import com.ss.ttlivestreamer.livestreamv2.videoquality.strategycenter.model.BitrateConfig;
import java.util.Comparator;

/* JADX INFO: loaded from: classes36.dex */
public class AComparatorS54S0000000_35 implements Comparator {
    public final int $t;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return compare$0(this, obj, obj2);
            case 1:
                return compare$1(this, obj, obj2);
            case 2:
                return compare$2(this, obj, obj2);
            default:
                return 0;
        }
    }

    public AComparatorS54S0000000_35(int i) {
        this.$t = i;
    }

    public static final int compare$0(AComparatorS54S0000000_35 aComparatorS54S0000000_35, Object obj, Object obj2) {
        return ((BitrateConfig) obj2).width - ((BitrateConfig) obj).width;
    }

    public static final int compare$1(AComparatorS54S0000000_35 aComparatorS54S0000000_35, Object obj, Object obj2) {
        return ((BitrateConfig) obj2).width - ((BitrateConfig) obj).width;
    }

    public static final int compare$2(AComparatorS54S0000000_35 aComparatorS54S0000000_35, Object obj, Object obj2) {
        return ((C1283050jUd) obj2).LIZIZ - ((C1283050jUd) obj).LIZIZ;
    }
}
