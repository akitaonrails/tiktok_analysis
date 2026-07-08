package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.model.TemplateSlot;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0KxE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C534180KxE {
    public static final List<TemplateSlot> LIZ(C580710Mq5 c580710Mq5) {
        List<TemplateSlot> arrayList = c580710Mq5.LJIIIZ;
        Pair<Boolean, List<TemplateSlot>> pairLIZ = C531610Kt5.LIZ(arrayList);
        if (pairLIZ.getFirst().booleanValue()) {
            arrayList = new ArrayList<>(pairLIZ.getSecond());
        }
        Pair<Boolean, List<TemplateSlot>> pairLIZIZ = C531620Kt6.LIZIZ(arrayList, c580710Mq5.LIZJ);
        boolean zBooleanValue = pairLIZIZ.getFirst().booleanValue();
        List<TemplateSlot> second = pairLIZIZ.getSecond();
        if (zBooleanValue) {
            return new ArrayList(second);
        }
        return arrayList;
    }

    public static final Integer LIZIZ(C580710Mq5 c580710Mq5, int i) {
        Object objLJJJLL;
        List<TemplateSlot> list = null;
        if (((ArrayList) c580710Mq5.LJIIIZ).isEmpty()) {
            return null;
        }
        List<TemplateSlot> listLIZ = LIZ(c580710Mq5);
        if (i >= 0 && i < LIZ(c580710Mq5).size()) {
            if (listLIZ.size() == ((ArrayList) c580710Mq5.LJIIIZ).size()) {
                Object obj = ListProtector.get(c580710Mq5.LJIIIZ, i);
                Iterator<List<TemplateSlot>> it2 = c580710Mq5.LJIIJJI.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    List<TemplateSlot> next = it2.next();
                    if (next.contains(obj)) {
                        list = next;
                        break;
                    }
                }
                List<TemplateSlot> list2 = list;
                if (list2 != null && (objLJJJLL = C13LP.LJJJLL(list2)) != null) {
                    return Integer.valueOf(((ArrayList) c580710Mq5.LJIIIZ).indexOf(objLJJJLL));
                }
                return Integer.valueOf(i);
            }
            return Integer.valueOf(i);
        }
        return c580710Mq5.LJIILIIL.getValue();
    }
}
