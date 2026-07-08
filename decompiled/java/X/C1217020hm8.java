package X;

import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0hm8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1217020hm8 implements InterfaceC19244510Qp {
    public final WeakReference<View> LIZ;

    @Override // X.InterfaceC19244510Qp
    public final int getScene() {
        return EnumC19243910Qj.SHOOT.getValue();
    }

    @Override // X.InterfaceC19244510Qp
    public final int getType() {
        return EnumC1217000hm6.GO_LIVE.getValue();
    }

    public C1217020hm8(WeakReference<View> weakReference) {
        this.LIZ = weakReference;
    }
}
