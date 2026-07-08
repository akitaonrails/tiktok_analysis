package X;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00z5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C257300z5 {
    public static final /* synthetic */ int LIZ = 0;

    public static int LIZ(List list) {
        String strLIZIZ = LIZIZ(System.currentTimeMillis());
        int i = 0;
        if (!(list instanceof Collection) || !((ArrayList) list).isEmpty()) {
            Iterator it2 = ((ArrayList) list).iterator();
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(LIZIZ(((Number) it2.next()).longValue()), strLIZIZ) && (i = i + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        return i;
    }

    public static String LIZIZ(long j) {
        return new SimpleDateFormat("yyyy/MM/dd", Locale.getDefault()).format(new Date(j));
    }
}
