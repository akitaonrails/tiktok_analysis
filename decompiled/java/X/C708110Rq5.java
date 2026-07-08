package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;

/* JADX INFO: renamed from: X.0Rq5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C708110Rq5 {
    public static final /* synthetic */ int LIZ = 0;

    public static InterfaceC1484830ok5 LIZ(Fragment fragment) {
        if (fragment == null || fragment.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            return null;
        }
        C1478410oZj c1478410oZj = new C1478410oZj();
        c1478410oZj.LIZIZ = true;
        return C582130MsN.LIZ().LIZJ(c1478410oZj);
    }
}
