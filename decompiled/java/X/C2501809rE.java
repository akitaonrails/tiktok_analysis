package X;

import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: renamed from: X.09rE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2501809rE implements InterfaceC1680560tpm {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC1680560tpm
    public final void dispose() {
        switch (this.$t) {
            case 0:
                dispose$0(this);
                break;
            case 1:
                dispose$1(this);
                break;
            case 2:
                dispose$2(this);
                break;
            case 3:
                dispose$3(this);
                break;
            case 4:
                dispose$4(this);
                break;
            case 5:
                dispose$5(this);
                break;
            case 6:
                dispose$6(this);
                break;
        }
    }

    public static final void dispose$0(C2501809rE c2501809rE) {
        ((LifecycleOwner) c2501809rE.l0).getLifecycle().removeObserver((LifecycleEventObserver) c2501809rE.l1);
    }

    public static final void dispose$1(C2501809rE c2501809rE) {
        ((LifecycleOwner) c2501809rE.l0).getLifecycle().removeObserver((LifecycleEventObserver) c2501809rE.l1);
    }

    public static final void dispose$2(C2501809rE c2501809rE) {
        ((LifecycleOwner) c2501809rE.l0).getLifecycle().removeObserver((LifecycleEventObserver) c2501809rE.l1);
    }

    public static final void dispose$3(C2501809rE c2501809rE) {
        ((LifecycleOwner) c2501809rE.l0).getLifecycle().removeObserver((LifecycleEventObserver) c2501809rE.l1);
    }

    public static final void dispose$4(C2501809rE c2501809rE) {
        ((LifecycleOwner) c2501809rE.l0).getLifecycle().removeObserver((LifecycleEventObserver) c2501809rE.l1);
    }

    public static final void dispose$5(C2501809rE c2501809rE) {
        ((LifecycleOwner) c2501809rE.l0).getLifecycle().removeObserver((LifecycleEventObserver) c2501809rE.l1);
    }

    public static final void dispose$6(C2501809rE c2501809rE) {
        ((LifecycleOwner) c2501809rE.l0).getLifecycle().removeObserver((LifecycleEventObserver) c2501809rE.l1);
    }

    public C2501809rE(LifecycleOwner lifecycleOwner, LifecycleEventObserver lifecycleEventObserver, int i) {
        this.$t = i;
        this.l0 = lifecycleOwner;
        this.l1 = lifecycleEventObserver;
    }
}
