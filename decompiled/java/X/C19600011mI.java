package X;

import com.ss.android.ugc.aweme.emojisticker.api.model.StickerInteractionDetailsInsertion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.11mI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19600011mI {
    public static final List<StickerInteractionDetailsInsertion> LIZ(C19600111mJ c19600111mJ) {
        long jLongValue;
        List<String> list = c19600111mJ.LIZIZ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<String> it2 = list.iterator();
        while (it2.hasNext()) {
            Long lLJIILIIL = C2095008Iq.LJIILIIL(it2.next());
            if (lLJIILIIL != null) {
                jLongValue = lLJIILIIL.longValue();
            } else {
                jLongValue = 0;
            }
            arrayList.add(new StickerInteractionDetailsInsertion(jLongValue, c19600111mJ.LIZ));
        }
        return arrayList;
    }
}
