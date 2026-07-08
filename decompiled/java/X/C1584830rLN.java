package X;

import android.content.Context;
import com.ss.android.ugc.aweme.friendstab.model.SingleTabCounter;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rLN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1584830rLN {
    public static String LIZ = "";

    public static void LIZ(Context context, String str) {
        C1400330mXn c1400330mXn = C1400330mXn.LIZ;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        String str2 = LIZ;
        c1400330mXn.getClass();
        C1400330mXn.LJIIJ(c19egLIZIZ, str2, null);
        Intrinsics.LJFF(str, "FRIENDS_FEED");
        CopyOnWriteArrayList<SingleTabCounter> copyOnWriteArrayListLIZLLL = C1586750rOT.LIZ().LIZLLL();
        if (copyOnWriteArrayListLIZLLL != null) {
            for (SingleTabCounter singleTabCounter : copyOnWriteArrayListLIZLLL) {
            }
            Iterator<SingleTabCounter> it2 = copyOnWriteArrayListLIZLLL.iterator();
            while (it2.hasNext() && !Intrinsics.LJFF(it2.next().tag, "FRIENDS_FEED")) {
            }
        }
    }
}
