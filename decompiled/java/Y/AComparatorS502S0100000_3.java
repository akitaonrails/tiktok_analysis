package Y;

import X.C20085613iQ;
import X.C2124208Tw;
import X.C2255508sb;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.setting.serverpush.model.ContentLanguage;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class AComparatorS502S0100000_3 implements Comparator {
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
            case 3:
                return compare$3(this, obj, obj2);
            case 4:
                return compare$4(this, obj, obj2);
            case 5:
                return compare$5(this, obj, obj2);
            case 6:
                return compare$6(this, obj, obj2);
            default:
                return 0;
        }
    }

    public final int LIZ$0(int[] iArr) {
        int i;
        int i2;
        int[] iArr2 = (int[]) this.l0;
        int i3 = iArr2[0];
        int i4 = iArr[0];
        if (i3 > i4) {
            i = (i3 - i4) * 2;
        } else {
            i = (i4 - i3) * 3;
        }
        int i5 = iArr2[1];
        int i6 = iArr[1];
        if (i5 > i6) {
            i2 = (i5 - i6) * 4;
        } else {
            i2 = i6 - i5;
        }
        return i + i2;
    }

    public AComparatorS502S0100000_3(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final int compare$0(AComparatorS502S0100000_3 aComparatorS502S0100000_3, Object obj, Object obj2) {
        return aComparatorS502S0100000_3.LIZ$0((int[]) obj) - aComparatorS502S0100000_3.LIZ$0((int[]) obj2);
    }

    public static final int compare$1(AComparatorS502S0100000_3 aComparatorS502S0100000_3, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Boolean.valueOf(!((List) aComparatorS502S0100000_3.l0).contains(((ContentLanguage) obj).getLanguageCode())), Boolean.valueOf(!((List) aComparatorS502S0100000_3.l0).contains(((ContentLanguage) obj2).getLanguageCode())));
    }

    public static final int compare$2(AComparatorS502S0100000_3 aComparatorS502S0100000_3, Object obj, Object obj2) {
        int iIndexOf;
        Effect effect = (Effect) obj;
        List<String> effects = ((EffectCategoryModel) aComparatorS502S0100000_3.l0).getEffects();
        int iIndexOf2 = -1;
        if (effects != null) {
            iIndexOf = effects.indexOf(effect.getEffectId());
        } else {
            iIndexOf = -1;
        }
        Integer numValueOf = Integer.valueOf(iIndexOf);
        Effect effect2 = (Effect) obj2;
        List<String> effects2 = ((EffectCategoryModel) aComparatorS502S0100000_3.l0).getEffects();
        if (effects2 != null) {
            iIndexOf2 = effects2.indexOf(effect2.getEffectId());
        }
        return C20085613iQ.LIZIZ(numValueOf, Integer.valueOf(iIndexOf2));
    }

    public static final int compare$3(AComparatorS502S0100000_3 aComparatorS502S0100000_3, Object obj, Object obj2) {
        int iCompare = ((Comparator) aComparatorS502S0100000_3.l0).compare(obj, obj2);
        if (iCompare == 0) {
            return C20085613iQ.LIZIZ(((C2124208Tw) obj).LIZ, ((C2124208Tw) obj2).LIZ);
        }
        return iCompare;
    }

    public static final int compare$4(AComparatorS502S0100000_3 aComparatorS502S0100000_3, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((C2255508sb) ListProtector.get((List) aComparatorS502S0100000_3.l0, ((Number) obj2).intValue())).LJFF), Long.valueOf(((C2255508sb) ListProtector.get((List) aComparatorS502S0100000_3.l0, ((Number) obj).intValue())).LJFF));
    }

    public static final int compare$5(AComparatorS502S0100000_3 aComparatorS502S0100000_3, Object obj, Object obj2) {
        int iIntValue;
        Integer num = (Integer) ((Map) aComparatorS502S0100000_3.l0).get(((Effect) obj2).getId());
        int iIntValue2 = 0;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        Integer numValueOf = Integer.valueOf(iIntValue);
        Integer num2 = (Integer) ((Map) aComparatorS502S0100000_3.l0).get(((Effect) obj).getId());
        if (num2 != null) {
            iIntValue2 = num2.intValue();
        }
        return C20085613iQ.LIZIZ(numValueOf, Integer.valueOf(iIntValue2));
    }

    public static final int compare$6(AComparatorS502S0100000_3 aComparatorS502S0100000_3, Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 == null) {
                return 0;
            }
            return 1;
        }
        if (obj2 == null) {
            return -1;
        }
        return Long.compare(((Long) ((Map) aComparatorS502S0100000_3.l0).get(obj)).longValue(), ((Long) ((Map) aComparatorS502S0100000_3.l0).get(obj2)).longValue());
    }
}
