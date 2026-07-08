package com.bytedance.android.live.design.app;

import X.AbstractC782280UmQ;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C19GJ;
import X.C785410UrT;
import android.content.Context;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;

/* JADX INFO: loaded from: classes13.dex */
public abstract class LifecycleAwareDialog extends C19GJ implements GenericLifecycleObserver {
    public LifecycleOwner LLJIJIL;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // X.C19GJ, X.DialogC19728412Gs, android.app.Dialog
    public void show() {
        Object obj;
        LifecycleOwner lifecycleOwner = this.LLJIJIL;
        if (lifecycleOwner == null || lifecycleOwner.getLifecycle().getCurrentState() != Lifecycle.State.DESTROYED) {
            C0WZX c0wzx = new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yeeYGJ544i2jfZ33D0K1VNkm7CKW1cV0Zi0Z9ekLAemOCA==", null);
            C0WST c0wst = new C0WST();
            Object[] objArr = new Object[0];
            C0WZW c0wzw = new C0WZW(false, "()V", c0wzx);
            C0WSU c0wsuLIZIZ = c0wst.LIZIZ(300000, "com/bytedance/android/live/design/app/LiveControllableAppCompatDialog", "show", this, objArr, "void", c0wzw);
            if (c0wsuLIZIZ.LIZ) {
                c0wst.LIZ(300000, "com/bytedance/android/live/design/app/LiveControllableAppCompatDialog", "show", null, objArr, this, c0wzw, false);
                return;
            }
            Object[] objArr2 = c0wsuLIZIZ.LIZJ;
            C19GJ c19gj = (objArr2 == null || (obj = objArr2[0]) == null) ? this : (C19GJ) obj;
            super.show();
            c0wst.LIZ(300000, "com/bytedance/android/live/design/app/LiveControllableAppCompatDialog", "show", null, objArr, c19gj, c0wzw, true);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    private void onDestroy() {
        dismiss();
        C785410UrT.LIZ(this);
    }

    @Override // X.C19GJ, X.C19GU, X.C19EK, android.app.Dialog
    public void onStop() {
        super.onStop();
        LifecycleOwner lifecycleOwner = this.LLJIJIL;
        if (lifecycleOwner != null) {
            lifecycleOwner.getLifecycle().removeObserver(this);
        }
    }

    public LifecycleAwareDialog(Context context) {
        super(context);
    }

    public LifecycleAwareDialog(Context context, AbstractC782280UmQ<?> abstractC782280UmQ) {
        super(context);
        if (abstractC782280UmQ != null) {
            LifecycleOwner lifecycleOwner = abstractC782280UmQ.LIZIZ;
            LifecycleOwner lifecycleOwner2 = this.LLJIJIL;
            if (lifecycleOwner2 != null) {
                lifecycleOwner2.getLifecycle().removeObserver(this);
            }
            this.LLJIJIL = lifecycleOwner;
            if (lifecycleOwner != null) {
                lifecycleOwner.getLifecycle().addObserver(this);
            }
        }
    }

    public LifecycleAwareDialog(Context context, int i) {
        super(context, i);
    }

    public LifecycleAwareDialog(Context context, int i, int i2) {
        super(context, i);
    }
}
