package X;

import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0PhZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C651870PhZ {
    public static final C651870PhZ LIZ = new C651870PhZ();
    public static final C13BV LIZIZ = C13BV.INSTANCE;
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(1769));

    public static final boolean LIZ(String str) {
        DynamicPatch dynamicPatch = new DynamicPatch();
        dynamicPatch.schema = str;
        LIZ.getClass();
        List<String> list = (List) LIZJ.getValue();
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (String str2 : list) {
                C651860PhY c651860PhY = new C651860PhY(dynamicPatch);
                C651880Pha c651880Pha = new C651880Pha(str2);
                if (C815510Vyv.LIZIZ(c651880Pha.LIZ)) {
                    List<String> pathSegments = c651880Pha.LIZ.getPathSegments();
                    if (pathSegments.contains(c651860PhY.LIZ.LIZIZ()) && pathSegments.contains(c651860PhY.LIZ.LIZ())) {
                        return true;
                    }
                } else if (c651860PhY.LIZ(c651880Pha.LIZIZ(), c651880Pha.LIZ())) {
                    return true;
                }
            }
        }
        return false;
    }
}
