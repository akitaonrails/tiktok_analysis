package X;

import androidx.lifecycle.Observer;
import java.util.LinkedList;
import java.util.Queue;

/* JADX INFO: renamed from: X.0aJ4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C929920aJ4 {
    public final Queue<Observer<Integer>> LIZ = new LinkedList();

    public final void LIZ() {
        Observer observer = (Observer) ((LinkedList) this.LIZ).poll();
        if (observer != null) {
            observer.onChanged(1);
        }
    }
}
