package X;

import com.ss.android.ugc.aweme.nimblecard.tako.model.CardData;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QuB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C685170QuB {
    public static final Integer LIZ(String str) {
        Object next;
        List list;
        String str2;
        String strLIZIZ = LIZIZ(str);
        if (strLIZIZ == null) {
            return null;
        }
        C14NH.LIZ.getClass();
        Iterator<T> it2 = C14N5.LIZ.entrySet().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                CardData cardData = (CardData) ((Map.Entry) next).getKey();
                if (cardData != null) {
                    str2 = cardData.fileName;
                } else {
                    str2 = null;
                }
                if (Intrinsics.LJFF(str2, strLIZIZ)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry == null || (list = (List) entry.getValue()) == null) {
            return null;
        }
        return (Integer) C13LP.LJJJLL(list);
    }

    public static final String LIZIZ(String str) {
        if (str != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("top1_");
            sbLIZ.append(str);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return null;
    }
}
