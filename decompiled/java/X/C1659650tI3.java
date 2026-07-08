package X;

import androidx.lifecycle.ViewModelStores;

/* JADX INFO: renamed from: X.0tI3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1659650tI3 {
    public static C1659660tI4 LIZ(C19EG c19eg) {
        if (c19eg.getApplication() != null) {
            return new C1659660tI4(ViewModelStores.of(c19eg), new C1143250fr9());
        }
        throw new IllegalStateException("Your activity/fragment is not yet attached to Application. You can't request ViewModel before onCreate call.");
    }
}
