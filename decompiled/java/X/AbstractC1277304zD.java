package X;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.04zD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1277304zD<T extends View> {
    public final List<T> LIZ = new ArrayList();

    public abstract T LIZ(Context context);

    public final T LIZIZ(Context context) {
        Object next;
        Iterator it2 = ((ArrayList) this.LIZ).iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (((View) next).getParent() == null) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        T t = (T) next;
        if (t != null) {
            return t;
        }
        T t2 = (T) LIZ(context);
        ((ArrayList) this.LIZ).add(t2);
        return t2;
    }
}
