package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0lcV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1364810lcV {
    public static List LIZ(C1364810lcV c1364810lcV, List list, int i, int i2) {
        boolean z;
        if ((i2 & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 4;
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(new C1364800lcU((IMContact) it2.next()));
        }
        List listLL = C13LP.LL(arrayList, i);
        if (z) {
            return C13LP.LJLJJLL(listLL);
        }
        return listLL;
    }
}
