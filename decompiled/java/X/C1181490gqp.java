package X;

import android.view.View;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: X.0gqp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1181490gqp implements InterfaceC1181500gqq {
    public final CopyOnWriteArraySet<InterfaceC1181500gqq> LL = new CopyOnWriteArraySet<>();

    @Override // X.InterfaceC1181500gqq
    public final void LIZ() {
        Iterator<InterfaceC1181500gqq> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ();
        }
    }

    @Override // X.InterfaceC1181500gqq
    public final void LIZIZ() {
        Iterator<InterfaceC1181500gqq> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().LIZIZ();
        }
    }

    @Override // X.InterfaceC1181500gqq
    public final void onAttach() {
        Iterator<InterfaceC1181500gqq> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().onAttach();
        }
    }

    @Override // X.InterfaceC1181500gqq
    public final void onCreate() {
        Iterator<InterfaceC1181500gqq> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().onCreate();
        }
    }

    @Override // X.InterfaceC1181500gqq
    public final void onDestroy() {
        Iterator<InterfaceC1181500gqq> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().onDestroy();
        }
    }

    @Override // X.InterfaceC1181500gqq
    public final void onDestroyView() {
        Iterator<InterfaceC1181500gqq> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().onDestroyView();
        }
    }

    @Override // X.InterfaceC1181500gqq
    public final void onDetach() {
        Iterator<InterfaceC1181500gqq> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().onDetach();
        }
    }

    @Override // X.InterfaceC1181500gqq
    public final void onPause() {
        Iterator<InterfaceC1181500gqq> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().onPause();
        }
    }

    @Override // X.InterfaceC1181500gqq
    public final void onResume() {
        Iterator<InterfaceC1181500gqq> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().onResume();
        }
    }

    @Override // X.InterfaceC1181500gqq
    public final void onStart() {
        Iterator<InterfaceC1181500gqq> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().onStart();
        }
    }

    @Override // X.InterfaceC1181500gqq
    public final void onStop() {
        Iterator<InterfaceC1181500gqq> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().onStop();
        }
    }

    @Override // X.InterfaceC1181500gqq
    public final void onHiddenChanged(boolean z) {
        Iterator<InterfaceC1181500gqq> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().onHiddenChanged(z);
        }
    }

    @Override // X.InterfaceC1181500gqq
    public final void onViewCreated(View view) {
        Iterator<InterfaceC1181500gqq> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().onViewCreated(view);
        }
    }
}
