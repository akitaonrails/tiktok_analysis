package X;

import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.10Qk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19244010Qk implements InterfaceC19244510Qp {
    public final WeakReference<View> LIZ;

    @Override // X.InterfaceC19244510Qp
    public final int getScene() {
        return EnumC19243910Qj.MUSIC_DETAIL.getValue();
    }

    @Override // X.InterfaceC19244510Qp
    public final int getType() {
        return EnumC1778610wNv.TT_TO_DSP.getValue();
    }

    public C19244010Qk(WeakReference<View> weakReference) {
        this.LIZ = weakReference;
    }
}
