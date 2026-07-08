package X;

import android.content.Context;
import android.view.SurfaceView;

/* JADX INFO: renamed from: X.0oSy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1474220oSy extends SurfaceView implements InterfaceC1482610ogV {
    public InterfaceC1483990oij LL;

    @Override // X.InterfaceC1482610ogV
    public InterfaceC1483990oij getRelatedSurfaceHolder() {
        return this.LL;
    }

    public C1474220oSy(Context context) {
        super(context);
    }

    public void setRelatedSurfaceHolder(InterfaceC1483990oij interfaceC1483990oij) {
        this.LL = interfaceC1483990oij;
    }
}
