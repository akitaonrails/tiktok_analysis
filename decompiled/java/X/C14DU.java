package X;

import android.content.Context;
import com.bytedance.router.RouteIntent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.14DU, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public abstract class C14DU {
    public final List<C0MVZ> LL = new ArrayList();

    public abstract boolean LIZ(String str);

    public abstract void LIZIZ(Context context, RouteIntent routeIntent, C14DK c14dk);

    public final void LIZJ(Iterator<? extends C0MVZ> it2, Context context, RouteIntent routeIntent, C14DK c14dk) {
        if (it2.hasNext()) {
            it2.next().LIZ(context, routeIntent, new C14DZ(this, it2, context, routeIntent, c14dk));
        } else {
            c14dk.LIZIZ();
        }
    }
}
