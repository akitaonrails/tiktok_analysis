package X;

import com.ss.android.ugc.aweme.creative.model.aigc.AIGCInputItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0LMJ, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LMJ {
    public static final List<String> LIZ(List<AIGCInputItem> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (AIGCInputItem aIGCInputItem : list) {
            AIGCInputItem aIGCInputItem2 = aIGCInputItem;
            Integer num = aIGCInputItem2.type;
            if ((num != null && num.intValue() == 2) || aIGCInputItem2.type == null) {
                arrayList.add(aIGCInputItem);
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((AIGCInputItem) it2.next()).value);
        }
        return arrayList2;
    }

    public static final String LIZIZ(List<AIGCInputItem> list) {
        AIGCInputItem next;
        if (list == null) {
            return null;
        }
        Iterator<AIGCInputItem> it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                AIGCInputItem aIGCInputItem = next;
                Integer num = aIGCInputItem.type;
                if ((num != null && num.intValue() == 2) || aIGCInputItem.type == null) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        AIGCInputItem aIGCInputItem2 = next;
        if (aIGCInputItem2 == null) {
            return null;
        }
        return aIGCInputItem2.value;
    }
}
