package X;

import android.view.View;
import android.view.WindowId;

/* JADX INFO: renamed from: X.18zF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21463918zF implements InterfaceC21465218zS {
    public final WindowId LIZ;

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public C21463918zF(View view) {
        this.LIZ = view.getWindowId();
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C21463918zF) && ((C21463918zF) obj).LIZ.equals(this.LIZ)) {
            return true;
        }
        return false;
    }
}
