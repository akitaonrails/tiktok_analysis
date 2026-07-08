package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0rJc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1583740rJc {
    public static final AbstractC1583720rJa LIZ(AbstractC1583720rJa abstractC1583720rJa) {
        if (abstractC1583720rJa instanceof AbstractC1583710rJZ) {
            return LIZ(((AbstractC1583710rJZ) abstractC1583720rJa).LLILZLL);
        }
        return abstractC1583720rJa;
    }

    public static final ArrayList<AbstractC1583720rJa> LIZIZ(AbstractC1583720rJa abstractC1583720rJa, AbstractC1583720rJa abstractC1583720rJa2) {
        if (!(abstractC1583720rJa instanceof AbstractC1583710rJZ)) {
            return new ArrayList<>();
        }
        ArrayList<AbstractC1583720rJa> arrayList = (ArrayList) ((AbstractC1583710rJZ) abstractC1583720rJa).LLIZLLLIL;
        if (arrayList.contains(abstractC1583720rJa2)) {
            ArrayList<AbstractC1583720rJa> arrayList2 = new ArrayList<>();
            ListProtector.add(arrayList2, 0, abstractC1583720rJa2);
            ListProtector.add(arrayList2, 0, abstractC1583720rJa);
            return arrayList2;
        }
        for (AbstractC1583720rJa abstractC1583720rJa3 : arrayList) {
            if (abstractC1583720rJa3 instanceof AbstractC1583710rJZ) {
                ArrayList<AbstractC1583720rJa> arrayListLIZIZ = LIZIZ(abstractC1583720rJa3, abstractC1583720rJa2);
                if (!arrayListLIZIZ.isEmpty()) {
                    ListProtector.add(arrayListLIZIZ, 0, abstractC1583720rJa);
                    return arrayListLIZIZ;
                }
            }
        }
        return new ArrayList<>();
    }
}
