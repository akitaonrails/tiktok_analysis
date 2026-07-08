package X;

import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01z9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C512501z9 implements Comparator {
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
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return compare$13(this, t, t2);
            case 14:
                return compare$14(this, t, t2);
            default:
                return 0;
        }
    }

    public C512501z9(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final int compare$0(C512501z9 c512501z9, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((int[]) c512501z9.l0)[((Number) obj2).intValue()]), Integer.valueOf(((int[]) c512501z9.l0)[((Number) obj).intValue()]));
    }

    public static final int compare$1(C512501z9 c512501z9, Object obj, Object obj2) {
        Function1 function1 = (Function1) c512501z9.l0;
        return C20085613iQ.LIZIZ((Comparable) function1.invoke(obj), (Comparable) function1.invoke(obj2));
    }

    public static final int compare$10(C512501z9 c512501z9, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ((Integer) ((Function1) ((C259800zU) c512501z9.l0).element).invoke(obj), (Integer) ((Function1) ((C259800zU) c512501z9.l0).element).invoke(obj2));
    }

    public static final int compare$11(C512501z9 c512501z9, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((List) c512501z9.l0).indexOf(obj)), Integer.valueOf(((List) c512501z9.l0).indexOf(obj2)));
    }

    public static final int compare$12(C512501z9 c512501z9, Object obj, Object obj2) {
        int iCompare = ((Comparator) c512501z9.l0).compare(obj, obj2);
        if (iCompare == 0) {
            return C20085613iQ.LIZIZ((Comparable) ((Map.Entry) obj).getKey(), (Comparable) ((Map.Entry) obj2).getKey());
        }
        return iCompare;
    }

    public static final int compare$13(C512501z9 c512501z9, Object obj, Object obj2) {
        int iIndexOf;
        LinkUser linkUser = (LinkUser) obj;
        List list = (List) c512501z9.l0;
        int iIndexOf2 = Integer.MAX_VALUE;
        if (list != null) {
            iIndexOf = list.indexOf(linkUser.linkMicId);
        } else {
            iIndexOf = Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(iIndexOf);
        LinkUser linkUser2 = (LinkUser) obj2;
        List list2 = (List) c512501z9.l0;
        if (list2 != null) {
            iIndexOf2 = list2.indexOf(linkUser2.linkMicId);
        }
        return C20085613iQ.LIZIZ(numValueOf, Integer.valueOf(iIndexOf2));
    }

    public static final int compare$14(C512501z9 c512501z9, Object obj, Object obj2) {
        int iIntValue;
        Integer num = (Integer) ((Map) c512501z9.l0).get(obj);
        int iIntValue2 = 0;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        Integer num2 = (Integer) ((Map) c512501z9.l0).get(obj2);
        if (num2 != null) {
            iIntValue2 = num2.intValue();
        }
        return Intrinsics.LJI(iIntValue, iIntValue2);
    }

    public static final int compare$2(C512501z9 c512501z9, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ((Long) ((Map) c512501z9.l0).get(obj2), (Long) ((Map) c512501z9.l0).get(obj));
    }

    public static final int compare$3(C512501z9 c512501z9, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((List) c512501z9.l0).indexOf(((LinkPlayerInfo) obj).mInteractIdStr)), Integer.valueOf(((List) c512501z9.l0).indexOf(((LinkPlayerInfo) obj2).mInteractIdStr)));
    }

    public static final int compare$4(C512501z9 c512501z9, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(C01HJ.LJLIIIL(((LinkPlayerInfo) obj).mInteractIdStr)), Integer.valueOf(C01HJ.LJLIIIL(((LinkPlayerInfo) obj2).mInteractIdStr)));
    }

    public static final int compare$5(C512501z9 c512501z9, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(C01HJ.LJLIIIL(((LinkPlayerInfo) obj).mInteractIdStr)), Integer.valueOf(C01HJ.LJLIIIL(((LinkPlayerInfo) obj2).mInteractIdStr)));
    }

    public static final int compare$6(C512501z9 c512501z9, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(((C01HJ) c512501z9.l0).LLJL.get(((LinkPlayerInfo) obj).mInteractIdStr), ((C01HJ) c512501z9.l0).LLJL.get(((LinkPlayerInfo) obj2).mInteractIdStr));
    }

    public static final int compare$7(C512501z9 c512501z9, Object obj, Object obj2) {
        int iCompare = ((Comparator) c512501z9.l0).compare(obj, obj2);
        if (iCompare == 0) {
            return C20085613iQ.LIZIZ(Integer.valueOf(C475760IlC.LJFF((Integer) ((Pair) obj).getFirst())), Integer.valueOf(C475760IlC.LJFF((Integer) ((Pair) obj2).getFirst())));
        }
        return iCompare;
    }

    public static final int compare$8(C512501z9 c512501z9, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ((Float) ((Pair) ListProtector.get((List) c512501z9.l0, ((Number) obj2).intValue())).getFirst(), (Float) ((Pair) ListProtector.get((List) c512501z9.l0, ((Number) obj).intValue())).getFirst());
    }

    public static final int compare$9(C512501z9 c512501z9, Object obj, Object obj2) {
        Iterator it2 = ((List) c512501z9.l0).iterator();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (it2.hasNext()) {
                if (Intrinsics.LJFF(obj, it2.next())) {
                    break;
                }
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        int i3 = Integer.MAX_VALUE;
        if (i2 < 0) {
            i2 = Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(i2);
        Iterator it3 = ((List) c512501z9.l0).iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            if (Intrinsics.LJFF(obj2, it3.next())) {
                if (i >= 0) {
                    i3 = i;
                }
            } else {
                i++;
            }
        }
        return C20085613iQ.LIZIZ(numValueOf, Integer.valueOf(i3));
    }
}
