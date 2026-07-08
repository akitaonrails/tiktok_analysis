package X;

import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Zep, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C904970Zep {
    public final View LIZ;
    public final ViewOnAttachStateChangeListenerC20604515jv LIZIZ;
    public final LifecycleOwner LIZJ;
    public final ViewModelStoreOwner LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C904970Zep)) {
            return false;
        }
        C904970Zep c904970Zep = (C904970Zep) obj;
        return Intrinsics.LJFF(this.LIZ, c904970Zep.LIZ) && Intrinsics.LJFF(this.LIZIZ, c904970Zep.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c904970Zep.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c904970Zep.LIZLLL);
    }

    public final int hashCode() {
        View view = this.LIZ;
        return ((((((view == null ? 0 : view.hashCode()) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PendingInitiationParams(rootSceneView=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", messageList=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", owner=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", storeOwner=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C904970Zep(View view, ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv, LifecycleOwner lifecycleOwner, ViewModelStoreOwner viewModelStoreOwner) {
        this.LIZ = view;
        this.LIZIZ = viewOnAttachStateChangeListenerC20604515jv;
        this.LIZJ = lifecycleOwner;
        this.LIZLLL = viewModelStoreOwner;
    }
}
