package X;

import androidx.lifecycle.Observer;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import java.lang.ref.SoftReference;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0J7S, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J7S implements Observer<C0J7T> {
    public final SoftReference<Observer<Pair<Long, SlimRoom>>> LL;

    public C0J7S(Observer<Pair<Long, SlimRoom>> observer) {
        this.LL = new SoftReference<>(observer);
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(C0J7T c0j7t) {
        C0J7T c0j7t2 = c0j7t;
        Observer<Pair<Long, SlimRoom>> observer = this.LL.get();
        if (observer != null) {
            observer.onChanged(new Pair<>(c0j7t2.LIZ, c0j7t2.LIZJ));
        }
    }
}
