package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;

/* JADX INFO: renamed from: X.0J7p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C486910J7p extends FrameLayout {
    public Lifecycle LL;

    /* JADX WARN: Removed duplicated region for block: B:18:0x0032 A[PHI: r1
      0x0032: PHI (r1v2 androidx.lifecycle.LifecycleOwner) = 
      (r1v1 androidx.lifecycle.LifecycleOwner)
      (r1v1 androidx.lifecycle.LifecycleOwner)
      (r1v6 androidx.lifecycle.LifecycleOwner)
     binds: [B:7:0x0016, B:9:0x001a, B:17:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDetachedFromWindow() {
        /*
            r3 = this;
            super.onDetachedFromWindow()
            android.content.Context r0 = r3.getContext()
            android.app.Activity r0 = X.C1388190mED.LIZ(r0)
            r2 = 0
            if (r0 == 0) goto L3c
            androidx.lifecycle.LifecycleOwner r1 = X.C0SY5.LIZIZ(r0)
            if (r1 == 0) goto L3c
            boolean r0 = r1 instanceof X.C199Y
            if (r0 == 0) goto L32
            boolean r0 = r1 instanceof X.InterfaceC1711206n0
            if (r0 == 0) goto L32
            X.19EG r1 = (X.C19EG) r1
            boolean r0 = r1 instanceof X.C199Y
            if (r0 == 0) goto L3c
            X.15ms r1 = (X.InterfaceC20622815ms) r1
            X.198i r1 = X.C20629915o1.LIZ(r1)
            if (r1 == 0) goto L3c
            boolean r0 = r1 instanceof X.C0J5E
            if (r0 == 0) goto L3c
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            if (r1 == 0) goto L3c
        L32:
            androidx.lifecycle.Lifecycle r0 = r1.getLifecycle()
            if (r0 == 0) goto L3c
            androidx.lifecycle.Lifecycle$State r2 = r0.getCurrentState()
        L3c:
            androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.RESUMED
            if (r2 != r0) goto L4a
            X.0J7q r1 = new X.0J7q
            java.lang.String r0 = "should not remove this view"
            r1.<init>(r0)
            X.C1AF0.LJ(r1)
        L4a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C486910J7p.onDetachedFromWindow():void");
    }

    public final Lifecycle getLifecycle() {
        return this.LL;
    }

    public final void setLifecycle(Lifecycle lifecycle) {
        this.LL = lifecycle;
    }

    public C486910J7p(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
