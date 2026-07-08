package X;

import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0XhS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C855640XhS {
    public static final List<InterfaceC855650XhT> LIZ = new ArrayList();

    public static final void LIZ(CreativeModel creativeModel) {
        Iterator<InterfaceC855650XhT> it2 = LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(creativeModel);
        }
    }
}
