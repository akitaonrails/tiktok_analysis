package X;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: X.1BUT, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BUT {
    public static final C1BUT LIZLLL = new C1BUT();
    public WeakReference<Context> LIZ;
    public boolean LIZIZ = false;
    public boolean LIZJ = false;

    public final void LIZ(boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        boolean z5;
        String str;
        if (!z2 && !z) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (!this.LIZJ && !this.LIZIZ) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (z3 == z4) {
            return;
        }
        Iterator it2 = Collections.unmodifiableCollection(C21690119ud.LIZJ.LIZ).iterator();
        while (it2.hasNext()) {
            C1BUI c1bui = ((C1BUP) it2.next()).LJ;
            if (!z2 && !z) {
                z5 = false;
            } else {
                z5 = true;
            }
            if (c1bui.LIZIZ.get() != null) {
                if (z5) {
                    str = "locked";
                } else {
                    str = "unlocked";
                }
                C1287860jcO.LIZ.LIZ(c1bui.LJI(), "setDeviceLockState", str);
            }
        }
    }
}
