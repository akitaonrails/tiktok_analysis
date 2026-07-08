package X;

import android.app.Dialog;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import java.util.LinkedList;
import java.util.Queue;

/* JADX INFO: renamed from: X.0KAu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C513220KAu implements InterfaceC777420Uea {
    public final Queue<Integer> LL = new LinkedList();
    public final C098J<Integer, Observer<Integer>> LLILLJJLI = new C098J<>(10);

    @Override // X.InterfaceC777420Uea
    public final void addDialogToManager(Dialog dialog) {
    }

    @Override // X.InterfaceC777420Uea
    public final boolean I50() {
        return this.LLILLJJLI.get(7) != null;
    }

    @Override // X.InterfaceC777420Uea
    public final void UO0(int i) {
        ((LinkedList) this.LL).remove(Integer.valueOf(i));
        this.LLILLJJLI.LIZ(Integer.valueOf(i));
    }

    @Override // X.InterfaceC777420Uea
    public final void dV0(boolean z) {
        Object objPoll = ((LinkedList) this.LL).poll();
        Observer observer = this.LLILLJJLI.get((Integer) objPoll);
        if (observer != null) {
            observer.onChanged(objPoll);
        }
    }

    @Override // X.InterfaceC777420Uea
    public final void addToShow(int i, LifecycleOwner lifecycleOwner, Observer<Integer> observer) {
        boolean z;
        if (((LinkedList) this.LL).size() != 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.LLILLJJLI.get(Integer.valueOf(i)) == null) {
            this.LLILLJJLI.put(Integer.valueOf(i), observer);
        }
        if (!z) {
            dV0(true);
        }
    }
}
