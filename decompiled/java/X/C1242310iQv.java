package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;

/* JADX INFO: renamed from: X.0iQv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1242310iQv implements ViewModelStoreOwner, LifecycleOwner {
    public final C19EG LL;
    public final Fragment LLILLJJLI;
    public final C1242290iQt LLILLL;
    public final Lifecycle LLILZ;
    public final ViewModelStore LLILZIL;

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LLILZ;
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public final ViewModelStore getViewModelStore() {
        return this.LLILZIL;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1242310iQv(X.C19EG r2, androidx.fragment.app.Fragment r3, X.C1242290iQt r4) {
        /*
            r1 = this;
            r1.<init>()
            r1.LL = r2
            r1.LLILLJJLI = r3
            r1.LLILLL = r4
            if (r3 == 0) goto L14
            r3.getActivity()
            androidx.lifecycle.Lifecycle r0 = r3.getLifecycle()
            if (r0 != 0) goto L18
        L14:
            androidx.lifecycle.Lifecycle r0 = r2.getLifecycle()
        L18:
            r1.LLILZ = r0
            if (r3 == 0) goto L22
            androidx.lifecycle.ViewModelStore r0 = r3.getViewModelStore()
            if (r0 != 0) goto L26
        L22:
            androidx.lifecycle.ViewModelStore r0 = r2.getViewModelStore()
        L26:
            r1.LLILZIL = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1242310iQv.<init>(X.19EG, androidx.fragment.app.Fragment, X.0iQt):void");
    }
}
