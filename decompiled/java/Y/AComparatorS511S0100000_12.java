package Y;

import X.C1727970v4F;
import X.C1954807lC;
import X.C20085613iQ;
import X.C21683519tZ;
import X.C769190UFh;
import android.graphics.Rect;
import com.bytedance.android.live.effect.api.soundeffect.SoundEffect;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class AComparatorS511S0100000_12 implements Comparator {
    public final int $t;
    public Object l0;

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

    public AComparatorS511S0100000_12(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final int compare$0(AComparatorS511S0100000_12 aComparatorS511S0100000_12, Object obj, Object obj2) {
        Rect rect = (Rect) obj;
        Rect rect2 = (Rect) obj2;
        int i = C769190UFh.LIZ[((C21683519tZ) aComparatorS511S0100000_12.l0).LIZIZ.ordinal()];
        if (i != 1) {
            if (i == 2) {
                int i2 = rect.left;
                int i3 = rect2.left;
                if (i2 == i3) {
                    if (rect.top >= rect2.top) {
                        return 1;
                    }
                } else if (i2 >= i3) {
                    return 1;
                }
            } else {
                throw new C1954807lC();
            }
        } else {
            int i4 = rect.top;
            int i5 = rect2.top;
            if (i4 == i5) {
                if (rect.left >= rect2.left) {
                    return 1;
                }
            } else if (i4 >= i5) {
                return 1;
            }
        }
        return -1;
    }

    public static final int compare$1(AComparatorS511S0100000_12 aComparatorS511S0100000_12, Object obj, Object obj2) {
        int iCompare = ((Comparator) aComparatorS511S0100000_12.l0).compare(obj, obj2);
        if (iCompare == 0) {
            return C20085613iQ.LIZIZ(((C1727970v4F) obj).LIZ, ((C1727970v4F) obj2).LIZ);
        }
        return iCompare;
    }

    public static final int compare$2(AComparatorS511S0100000_12 aComparatorS511S0100000_12, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((List) aComparatorS511S0100000_12.l0).indexOf(Long.valueOf(((SoundEffect) obj).id))), Integer.valueOf(((List) aComparatorS511S0100000_12.l0).indexOf(Long.valueOf(((SoundEffect) obj2).id))));
    }
}
