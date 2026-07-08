package X;

import X.C20335014hY;
import X.C204683157h;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.157h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C204683157h<T> {
    public final ArrayList<InterfaceC204685157j<T>> LIZ = new ArrayList<>();

    public final void LIZIZ(Fragment fragment) {
        fragment.getLifecycle().addObserver(new GenericLifecycleObserver() { // from class: com.ss.android.ugc.aweme.base.ui.session.Session$2
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    onDestroy();
                }
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
            public void onDestroy() {
                C204683157h c204683157h = this.LL;
                c204683157h.LIZ.clear();
                C20335014hY c20335014hYLIZ = C20335014hY.LIZ();
                synchronized (c20335014hYLIZ) {
                    c20335014hYLIZ.LIZ.values().remove(c204683157h);
                }
            }
        });
    }

    public final void LIZ(C19EG c19eg, final C204684157i c204684157i) {
        if (!this.LIZ.contains(c204684157i)) {
            this.LIZ.add(c204684157i);
        }
        c19eg.getLifecycle().addObserver(new GenericLifecycleObserver() { // from class: com.ss.android.ugc.aweme.base.ui.session.Session$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    onDestroy();
                }
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
            public void onDestroy() {
                C204683157h c204683157h = this.LLILLJJLI;
                c204683157h.LIZ.remove(c204684157i);
            }
        });
    }
}
