package X;

import android.app.Instrumentation;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.088v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class InstrumentationC20695088v extends Instrumentation {
    public static final List<AnonymousClass0896> LIZ = new ArrayList();
    public static boolean LIZIZ;

    public static void LIZ(AnonymousClass0896 anonymousClass0896) {
        if (AnonymousClass0892.LIZIZ && Looper.myLooper() != Looper.getMainLooper()) {
            throw new RuntimeException("register only in UI thread.");
        }
        anonymousClass0896.registerCondition();
        ArrayList arrayList = (ArrayList) LIZ;
        if (!arrayList.contains(anonymousClass0896)) {
            arrayList.add(anonymousClass0896);
        }
    }

    @Override // android.app.Instrumentation
    public final boolean onException(Object obj, Throwable th) {
        Iterator it2 = ((ArrayList) LIZ).iterator();
        while (it2.hasNext()) {
            if (((AnonymousClass0896) it2.next()).LIZ(obj, th)) {
                return true;
            }
        }
        return super.onException(obj, th);
    }
}
