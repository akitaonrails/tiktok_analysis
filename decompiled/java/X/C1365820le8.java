package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import java.util.List;

/* JADX INFO: renamed from: X.0le8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1365820le8 {
    public static final C1365870leD LIZ(C1365810le7 c1365810le7) {
        List<IMContact> list = c1365810le7.LIZ;
        IMContact iMContact = (IMContact) C13LP.LJJJLL(list);
        int size = c1365810le7.LJII + c1365810le7.LIZ.size();
        boolean z = true;
        if (c1365810le7.LIZ.size() <= 1) {
            z = false;
        }
        return new C1365870leD(list, iMContact, size, z, c1365810le7.LIZIZ, c1365810le7.LIZJ, c1365810le7.LIZLLL, c1365810le7.LJ, "", c1365810le7.LJFF, c1365810le7.LJI, false);
    }
}
