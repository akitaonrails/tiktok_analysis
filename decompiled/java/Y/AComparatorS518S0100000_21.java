package Y;

import X.AbstractC1396720mRy;
import X.C0WZX;
import X.C1355330lND;
import X.C1369250ljf;
import X.C1369260ljg;
import X.C1396790mS5;
import X.C20085613iQ;
import X.C2204961BRm;
import android.text.Editable;
import android.text.Spannable;
import com.ss.android.ugc.aweme.affinity.model.SocialAffinityItem;
import com.ss.android.ugc.aweme.repostfeed.model.RepostNewContentUser;
import com.tts.oecverify.BdTuring;
import java.util.Comparator;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
public class AComparatorS518S0100000_21 implements Comparator {
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
            case 6:
                return compare$6(this, t, t2);
            case 7:
                return compare$7(this, t, t2);
            case 8:
                return compare$8(this, t, t2);
            case BdTuring.TYPE_ECAF /* 9 */:
                return compare$9(this, t, t2);
            default:
                return 0;
        }
    }

    public AComparatorS518S0100000_21(Editable editable, int i) {
        this.$t = i;
        switch (i) {
            case 3:
            case 5:
                this.l0 = editable;
                break;
            case 4:
            default:
                this.l0 = editable;
                break;
        }
    }

    public AComparatorS518S0100000_21(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final int compare$0(AComparatorS518S0100000_21 aComparatorS518S0100000_21, Object obj, Object obj2) {
        int i;
        int iCompare = ((Comparator) aComparatorS518S0100000_21.l0).compare(obj, obj2);
        if (iCompare == 0) {
            int i2 = ((C1369260ljg) obj).LIZ;
            int i3 = 4;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            i = 4;
                        } else {
                            i = 3;
                        }
                    } else {
                        i = 2;
                    }
                } else {
                    i = 1;
                }
            } else {
                i = 0;
            }
            Integer numValueOf = Integer.valueOf(i);
            int i4 = ((C1369260ljg) obj2).LIZ;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 == 3) {
                            i3 = 3;
                        }
                    } else {
                        i3 = 2;
                    }
                } else {
                    i3 = 1;
                }
            } else {
                i3 = 0;
            }
            return C20085613iQ.LIZIZ(numValueOf, Integer.valueOf(i3));
        }
        return iCompare;
    }

    public static final int compare$1(AComparatorS518S0100000_21 aComparatorS518S0100000_21, Object obj, Object obj2) {
        int iCompare = ((Comparator) aComparatorS518S0100000_21.l0).compare(obj, obj2);
        if (iCompare == 0) {
            return C20085613iQ.LIZIZ(Integer.valueOf(((C1369250ljf) obj).LIZ.LIZJ), Integer.valueOf(((C1369250ljf) obj2).LIZ.LIZJ));
        }
        return iCompare;
    }

    public static final int compare$2(AComparatorS518S0100000_21 aComparatorS518S0100000_21, Object obj, Object obj2) {
        int iCompare = ((Comparator) aComparatorS518S0100000_21.l0).compare(obj, obj2);
        if (iCompare == 0) {
            return C20085613iQ.LIZIZ(Double.valueOf(((C1369250ljf) obj2).LIZLLL), Double.valueOf(((C1369250ljf) obj).LIZLLL));
        }
        return iCompare;
    }

    public static final int compare$3(AComparatorS518S0100000_21 aComparatorS518S0100000_21, Object obj, Object obj2) {
        return ((Editable) aComparatorS518S0100000_21.l0).getSpanStart(obj) - ((Editable) aComparatorS518S0100000_21.l0).getSpanStart(obj2);
    }

    public static final int compare$4(AComparatorS518S0100000_21 aComparatorS518S0100000_21, Object obj, Object obj2) {
        return ((Spannable) aComparatorS518S0100000_21.l0).getSpanStart(obj) - ((Spannable) aComparatorS518S0100000_21.l0).getSpanStart(obj2);
    }

    public static final int compare$5(AComparatorS518S0100000_21 aComparatorS518S0100000_21, Object obj, Object obj2) {
        return ((Editable) aComparatorS518S0100000_21.l0).getSpanStart(obj) - ((Editable) aComparatorS518S0100000_21.l0).getSpanStart(obj2);
    }

    public static final int compare$6(AComparatorS518S0100000_21 aComparatorS518S0100000_21, Object obj, Object obj2) {
        return C2204961BRm.J((C1355330lND) aComparatorS518S0100000_21.l0, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP+4dZDa2XyTB6kx8g4Culcfls9+1w99l4fC1G0h3wVoUWc=", null)).getSpanStart(obj) - C2204961BRm.J((C1355330lND) aComparatorS518S0100000_21.l0, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP+4dZDa2XyTB6kx8g4Culcfls9+1w99l4fC1G0h3wVoUWc=", null)).getSpanStart(obj2);
    }

    public static final int compare$7(AComparatorS518S0100000_21 aComparatorS518S0100000_21, Object obj, Object obj2) {
        Comparable<?> comparableInvoke = ((C1396790mS5) aComparatorS518S0100000_21.l0).LIZIZ.LIZLLL.LJFF.invoke(((AbstractC1396720mRy) obj2).LJ());
        Comparable<?> comparable = null;
        if (!(comparableInvoke instanceof Comparable)) {
            comparableInvoke = null;
        }
        Comparable<?> comparable2 = comparableInvoke;
        Comparable<?> comparableInvoke2 = ((C1396790mS5) aComparatorS518S0100000_21.l0).LIZIZ.LIZLLL.LJFF.invoke(((AbstractC1396720mRy) obj).LJ());
        if (comparableInvoke2 instanceof Comparable) {
            comparable = comparableInvoke2;
        }
        return C20085613iQ.LIZIZ(comparable2, comparable);
    }

    public static final int compare$8(AComparatorS518S0100000_21 aComparatorS518S0100000_21, Object obj, Object obj2) {
        Editable editable = (Editable) aComparatorS518S0100000_21.l0;
        return editable.getSpanStart(obj) - editable.getSpanStart(obj2);
    }

    public static final int compare$9(AComparatorS518S0100000_21 aComparatorS518S0100000_21, Object obj, Object obj2) {
        String str;
        Double dValueOf;
        String str2;
        RepostNewContentUser repostNewContentUser = (RepostNewContentUser) obj2;
        Map map = (Map) aComparatorS518S0100000_21.l0;
        Double dValueOf2 = null;
        if (repostNewContentUser != null) {
            str = repostNewContentUser.userId;
        } else {
            str = null;
        }
        SocialAffinityItem socialAffinityItem = (SocialAffinityItem) map.get(str);
        if (socialAffinityItem != null) {
            dValueOf = Double.valueOf(socialAffinityItem.score);
        } else {
            dValueOf = null;
        }
        RepostNewContentUser repostNewContentUser2 = (RepostNewContentUser) obj;
        Map map2 = (Map) aComparatorS518S0100000_21.l0;
        if (repostNewContentUser2 != null) {
            str2 = repostNewContentUser2.userId;
        } else {
            str2 = null;
        }
        SocialAffinityItem socialAffinityItem2 = (SocialAffinityItem) map2.get(str2);
        if (socialAffinityItem2 != null) {
            dValueOf2 = Double.valueOf(socialAffinityItem2.score);
        }
        return C20085613iQ.LIZIZ(dValueOf, dValueOf2);
    }
}
