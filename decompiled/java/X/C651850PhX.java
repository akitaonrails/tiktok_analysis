package X;

import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0PhX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C651850PhX {
    public static final C651850PhX LIZ = new C651850PhX();
    public static final C13BV LIZIZ = C13BV.INSTANCE;
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(1783));

    public static final boolean LIZ(DynamicPatch dynamicPatch) {
        C651860PhY c651860PhY = new C651860PhY(dynamicPatch);
        LIZ.getClass();
        List list = (List) LIZJ.getValue();
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C651880Pha c651880Pha = new C651880Pha((String) it2.next());
            if (c651860PhY.LIZ(c651880Pha.LIZIZ(), c651880Pha.LIZ())) {
                return true;
            }
        }
        return false;
    }

    public static final boolean LIZIZ(String str) {
        if (str == null) {
            return false;
        }
        DynamicPatch dynamicPatch = new DynamicPatch();
        dynamicPatch.schema = str;
        LIZ.getClass();
        List list = (List) LIZJ.getValue();
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next();
                if (LIZ(dynamicPatch)) {
                    return true;
                }
            }
        }
        return false;
    }
}
