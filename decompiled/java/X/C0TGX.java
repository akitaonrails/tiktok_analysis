package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import com.ss.android.ugc.aweme.services.IMainSAFLifecycleKt;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0TGX, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TGX implements InterfaceC20660715sz {
    public static WeakReference<C19EG> LLILLJJLI;
    public static volatile C0TGX LLILLL;
    public final String LL = "my_profile_bottom_part_screen_scene";

    @Override // X.InterfaceC20658015sY
    public final boolean Xu() {
        C19EG c19eg;
        Lifecycle lifecycle;
        Lifecycle.State currentState;
        Object objLIZ;
        WeakReference<C19EG> weakReference = LLILLJJLI;
        if (weakReference == null || (c19eg = weakReference.get()) == null) {
            return false;
        }
        return (((c19eg instanceof C199Y) && (c19eg instanceof InterfaceC1711206n0) && ((objLIZ = C20629915o1.LIZ((InterfaceC20622815ms) c19eg)) == null || !(objLIZ instanceof C0J5E) || (c19eg = (Fragment) objLIZ) == null)) || (lifecycle = c19eg.getLifecycle()) == null || (currentState = lifecycle.getCurrentState()) == null || !currentState.isAtLeast(Lifecycle.State.CREATED)) ? false : true;
    }

    @Override // X.InterfaceC20658015sY
    public final C688120Qyw i2() {
        C19EG c19eg;
        WeakReference<C19EG> weakReference = LLILLJJLI;
        if (weakReference == null || (c19eg = weakReference.get()) == null) {
            return null;
        }
        return new C688120Qyw(c19eg, IMainSAFLifecycleKt.requireMainSAFLifecycle(c19eg, null, false), null);
    }

    @Override // X.InterfaceC20660715sz
    public final boolean t2() {
        return C0BXP.LIZ();
    }

    @Override // X.InterfaceC20658015sY
    public final String getSceneId() {
        return this.LL;
    }
}
