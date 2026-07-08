package X;

import android.content.Intent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0VZN, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VZN {
    public static final List<C0VZM> LIZ = new ArrayList();

    public static boolean LIZ(Intent intent, Throwable th) {
        Iterator it2 = ((ArrayList) LIZ).iterator();
        while (true) {
            boolean z = false;
            while (it2.hasNext()) {
                if (((C0VZM) it2.next()).LIZ(intent, th) || z) {
                    z = true;
                }
            }
            return z;
        }
    }
}
