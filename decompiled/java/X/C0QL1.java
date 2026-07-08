package X;

import Y.ARunnableS110S0100000_10;
import com.bytedance.als.extensions.LifecycleOwnerExtensionsKt;
import com.ss.android.ugc.aweme.search.middle.DynamicSingleIntermediateFragmentNew;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0QL1, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QL1 implements InterfaceC670010QPv {
    public final WeakReference<DynamicSingleIntermediateFragmentNew> LIZ;
    public C0QOB LIZIZ;

    @Override // X.InterfaceC670010QPv
    public final void LIZIZ(C669990QPt c669990QPt) {
    }

    @Override // X.InterfaceC670010QPv
    public final void LIZJ(C669990QPt c669990QPt) {
    }

    @Override // X.InterfaceC670010QPv
    public final void onProgress(float f) {
    }

    @Override // X.InterfaceC670010QPv
    public final void LIZ(C669990QPt c669990QPt) {
        DynamicSingleIntermediateFragmentNew dynamicSingleIntermediateFragmentNew = this.LIZ.get();
        if (dynamicSingleIntermediateFragmentNew != null) {
            LifecycleOwnerExtensionsKt.LIZIZ(dynamicSingleIntermediateFragmentNew, C0BYI.LIZ(), new ARunnableS110S0100000_10(this, 118));
        }
        C0QOB c0qob = this.LIZIZ;
        if (c0qob != null) {
            c0qob.cb(this);
        }
        this.LIZIZ = null;
    }

    public C0QL1(WeakReference<DynamicSingleIntermediateFragmentNew> weakReference, C0QOB c0qob) {
        this.LIZ = weakReference;
        this.LIZIZ = c0qob;
    }
}
