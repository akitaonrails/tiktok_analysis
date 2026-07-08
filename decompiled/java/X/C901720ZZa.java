package X;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0ZZa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C901720ZZa implements C0ZZ4 {
    public final Context LL;
    public final int LLILLJJLI;
    public final Map<AbstractC901770ZZf<?>, List<View>> LLILLL;

    public final <T extends View> T LIZIZ(AbstractC901770ZZf<T> abstractC901770ZZf) {
        Object next;
        List<View> list = this.LLILLL.get(abstractC901770ZZf);
        if (list != null) {
            Iterator<T> it2 = list.iterator();
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
            if (t == null) {
                return abstractC901770ZZf.LIZ.invoke(this.LL);
            }
            return t;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public C901720ZZa(Context context, int i) {
        this.LL = context;
        this.LLILLJJLI = i;
        C13DA c13da = new C13DA();
        c13da.put(C901810ZZj.LIZIZ, new ArrayList());
        c13da.put(C901790ZZh.LIZIZ, new ArrayList());
        this.LLILLL = c13da.build();
    }

    public final void LIZ(ConstraintLayout constraintLayout, AbstractC901770ZZf abstractC901770ZZf) {
        if (constraintLayout.getParent() != null) {
            return;
        }
        List<View> list = this.LLILLL.get(abstractC901770ZZf);
        if (list != null) {
            if (list.size() >= this.LLILLJJLI) {
                list = null;
            }
            List<View> list2 = list;
            if (list2 != null) {
                list2.add(constraintLayout);
                return;
            }
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
