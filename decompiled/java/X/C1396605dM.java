package X;

import android.os.Looper;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.05dM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1396605dM {
    public final LifecycleOwner LIZ;
    public final C095E<AbstractC1396705dN> LIZIZ;
    public final MutableLiveData<C1397905dZ> LIZJ;
    public final C1397505dV LIZLLL = new C1397505dV();
    public final C677540Qhs LJ;

    public final void LIZ(C1397905dZ c1397905dZ) {
        if (Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread())) {
            this.LIZJ.setValue(c1397905dZ);
        } else {
            this.LIZJ.postValue(c1397905dZ);
        }
    }

    public C1396605dM(LifecycleOwner lifecycleOwner, C1DEK c1dek, MutableLiveData mutableLiveData, Map map) {
        this.LIZ = lifecycleOwner;
        this.LIZIZ = c1dek;
        this.LIZJ = mutableLiveData;
        this.LJ = new C677540Qhs(map);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new C1396505dL(this, null), 3);
    }
}
