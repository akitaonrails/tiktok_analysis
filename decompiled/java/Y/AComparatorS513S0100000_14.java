package Y;

import X.C20085613iQ;
import X.C869840YAk;
import X.InterfaceC1891350zJl;
import X.InterfaceC887560Yrq;
import android.text.Editable;
import android.text.Spanned;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.maf.ui.MafChatListWidgetV2;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.Comparator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes15.dex */
public class AComparatorS513S0100000_14 implements Comparator {
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
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return compare$10(this, t, t2);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return compare$11(this, t, t2);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return compare$12(this, t, t2);
            default:
                return 0;
        }
    }

    public AComparatorS513S0100000_14(Editable editable, int i) {
        this.$t = i;
        switch (i) {
            case 2:
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                this.l0 = editable;
                break;
            default:
                this.l0 = editable;
                break;
        }
    }

    public AComparatorS513S0100000_14(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final int compare$0(AComparatorS513S0100000_14 aComparatorS513S0100000_14, Object obj, Object obj2) {
        Long lValueOf;
        InterfaceC887560Yrq interfaceC887560Yrq;
        InterfaceC887560Yrq interfaceC887560Yrq2;
        int iCompare = ((Comparator) aComparatorS513S0100000_14.l0).compare(obj, obj2);
        if (iCompare == 0) {
            InterfaceC1891350zJl interfaceC1891350zJl = (InterfaceC1891350zJl) obj;
            Long lValueOf2 = null;
            if ((interfaceC1891350zJl instanceof InterfaceC887560Yrq) && (interfaceC887560Yrq2 = (InterfaceC887560Yrq) interfaceC1891350zJl) != null) {
                lValueOf = Long.valueOf(interfaceC887560Yrq2.getTimestampInInbox());
            } else {
                lValueOf = null;
            }
            InterfaceC1891350zJl interfaceC1891350zJl2 = (InterfaceC1891350zJl) obj2;
            if ((interfaceC1891350zJl2 instanceof InterfaceC887560Yrq) && (interfaceC887560Yrq = (InterfaceC887560Yrq) interfaceC1891350zJl2) != null) {
                lValueOf2 = Long.valueOf(interfaceC887560Yrq.getTimestampInInbox());
            }
            return C20085613iQ.LIZIZ(lValueOf, lValueOf2);
        }
        return iCompare;
    }

    public static final int compare$1(AComparatorS513S0100000_14 aComparatorS513S0100000_14, Object obj, Object obj2) {
        int iIntValue;
        Integer num = (Integer) ((ConcurrentHashMap) ((MafChatListWidgetV2) aComparatorS513S0100000_14.l0).LLIZLLLIL).get(obj);
        int iIntValue2 = Integer.MAX_VALUE;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(iIntValue);
        Integer num2 = (Integer) ((ConcurrentHashMap) ((MafChatListWidgetV2) aComparatorS513S0100000_14.l0).LLIZLLLIL).get(obj2);
        if (num2 != null) {
            iIntValue2 = num2.intValue();
        }
        return C20085613iQ.LIZIZ(numValueOf, Integer.valueOf(iIntValue2));
    }

    public static final int compare$10(AComparatorS513S0100000_14 aComparatorS513S0100000_14, Object obj, Object obj2) {
        return ((Editable) aComparatorS513S0100000_14.l0).getSpanStart(obj) - ((Editable) aComparatorS513S0100000_14.l0).getSpanStart(obj2);
    }

    public static final int compare$11(AComparatorS513S0100000_14 aComparatorS513S0100000_14, Object obj, Object obj2) {
        Editable editable = (Editable) aComparatorS513S0100000_14.l0;
        return editable.getSpanStart(obj) - editable.getSpanStart(obj2);
    }

    public static final int compare$12(AComparatorS513S0100000_14 aComparatorS513S0100000_14, Object obj, Object obj2) {
        Editable editable = (Editable) aComparatorS513S0100000_14.l0;
        return editable.getSpanStart(obj) - editable.getSpanStart(obj2);
    }

    public static final int compare$2(AComparatorS513S0100000_14 aComparatorS513S0100000_14, Object obj, Object obj2) {
        return ((Editable) aComparatorS513S0100000_14.l0).getSpanStart(obj) - ((Editable) aComparatorS513S0100000_14.l0).getSpanStart(obj2);
    }

    public static final int compare$3(AComparatorS513S0100000_14 aComparatorS513S0100000_14, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((Spanned) aComparatorS513S0100000_14.l0).getSpanEnd(obj2)), Integer.valueOf(((Spanned) aComparatorS513S0100000_14.l0).getSpanEnd(obj)));
    }

    public static final int compare$4(AComparatorS513S0100000_14 aComparatorS513S0100000_14, Object obj, Object obj2) {
        int iCompare = ((Comparator) aComparatorS513S0100000_14.l0).compare(obj, obj2);
        if (iCompare == 0) {
            return C20085613iQ.LIZIZ(Long.valueOf(((C869840YAk) obj).LJ), Long.valueOf(((C869840YAk) obj2).LJ));
        }
        return iCompare;
    }

    public static final int compare$5(AComparatorS513S0100000_14 aComparatorS513S0100000_14, Object obj, Object obj2) {
        int iCompare = ((Comparator) aComparatorS513S0100000_14.l0).compare(obj, obj2);
        if (iCompare == 0) {
            return C20085613iQ.LIZIZ(Long.valueOf(((C869840YAk) obj).LJ), Long.valueOf(((C869840YAk) obj2).LJ));
        }
        return iCompare;
    }

    public static final int compare$6(AComparatorS513S0100000_14 aComparatorS513S0100000_14, Object obj, Object obj2) {
        int iCompare = ((Comparator) aComparatorS513S0100000_14.l0).compare(obj, obj2);
        if (iCompare == 0) {
            return C20085613iQ.LIZIZ(Long.valueOf(((C869840YAk) obj).LJ), Long.valueOf(((C869840YAk) obj2).LJ));
        }
        return iCompare;
    }

    public static final int compare$7(AComparatorS513S0100000_14 aComparatorS513S0100000_14, Object obj, Object obj2) {
        int iCompare = ((Comparator) aComparatorS513S0100000_14.l0).compare(obj, obj2);
        if (iCompare == 0) {
            return C20085613iQ.LIZIZ(Long.valueOf(((C869840YAk) obj).LJ), Long.valueOf(((C869840YAk) obj2).LJ));
        }
        return iCompare;
    }

    public static final int compare$8(AComparatorS513S0100000_14 aComparatorS513S0100000_14, Object obj, Object obj2) {
        int iCompare = ((Comparator) aComparatorS513S0100000_14.l0).compare(obj, obj2);
        if (iCompare == 0) {
            return C20085613iQ.LIZIZ(Long.valueOf(((InterfaceC887560Yrq) obj).getTimestampInInbox()), Long.valueOf(((InterfaceC887560Yrq) obj2).getTimestampInInbox()));
        }
        return iCompare;
    }

    public static final int compare$9(AComparatorS513S0100000_14 aComparatorS513S0100000_14, Object obj, Object obj2) {
        int iCompare = ((Comparator) aComparatorS513S0100000_14.l0).compare(obj, obj2);
        if (iCompare == 0) {
            return C20085613iQ.LIZIZ(Long.valueOf(((InterfaceC887560Yrq) obj).getTimestampInInbox()), Long.valueOf(((InterfaceC887560Yrq) obj2).getTimestampInInbox()));
        }
        return iCompare;
    }
}
