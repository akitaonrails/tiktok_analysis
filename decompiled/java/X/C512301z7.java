package X;

import com.ss.android.ugc.aweme.mention.viewmodel.MentionPanelViewModel;
import java.util.Comparator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01z7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C512301z7 implements Comparator {
    public final int $t;
    public Object l0;
    public Object l1;

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
            default:
                return 0;
        }
    }

    public C512301z7(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final int compare$0(C512301z7 c512301z7, Object obj, Object obj2) {
        int iCompare = ((Comparator) c512301z7.l0).compare(obj, obj2);
        if (iCompare == 0) {
            return C20085613iQ.LIZIZ(Integer.valueOf(((int[]) c512301z7.l1)[((Number) obj2).intValue()]), Integer.valueOf(((int[]) c512301z7.l1)[((Number) obj).intValue()]));
        }
        return iCompare;
    }

    public static final int compare$1(C512301z7 c512301z7, Object obj, Object obj2) {
        Integer num = (Integer) ((Map) c512301z7.l0).get(obj);
        Integer num2 = (Integer) ((Map) c512301z7.l0).get(obj2);
        if (Intrinsics.LJFF(num, num2)) {
            return C20085613iQ.LIZIZ((Long) ((Map) c512301z7.l1).get(obj2), (Long) ((Map) c512301z7.l1).get(obj));
        }
        return C20085613iQ.LIZIZ(num2, num);
    }

    public static final int compare$2(C512301z7 c512301z7, Object obj, Object obj2) {
        int iCompare = ((Comparator) c512301z7.l0).compare(obj, obj2);
        if (iCompare == 0) {
            Long l = ((MentionPanelViewModel) c512301z7.l1).LLJJIII.get(((Map.Entry) obj).getKey());
            if (l == null) {
                l = 0L;
            }
            Long l2 = ((MentionPanelViewModel) c512301z7.l1).LLJJIII.get(((Map.Entry) obj2).getKey());
            if (l2 == null) {
                l2 = 0L;
            }
            return C20085613iQ.LIZIZ(l, l2);
        }
        return iCompare;
    }

    public static final int compare$3(C512301z7 c512301z7, Object obj, Object obj2) {
        int iIntValue;
        Integer num;
        Integer num2;
        String strLIZ = ((C1597350rfZ) c512301z7.l0).LIZ.LIZ((InterfaceC1891350zJl) obj);
        int iIntValue2 = Integer.MAX_VALUE;
        if (strLIZ != null && (num2 = (Integer) ((Map) c512301z7.l1).get(strLIZ)) != null) {
            iIntValue = num2.intValue();
        } else {
            iIntValue = Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(iIntValue);
        String strLIZ2 = ((C1597350rfZ) c512301z7.l0).LIZ.LIZ((InterfaceC1891350zJl) obj2);
        if (strLIZ2 != null && (num = (Integer) ((Map) c512301z7.l1).get(strLIZ2)) != null) {
            iIntValue2 = num.intValue();
        }
        return C20085613iQ.LIZIZ(numValueOf, Integer.valueOf(iIntValue2));
    }
}
