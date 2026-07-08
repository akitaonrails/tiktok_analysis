package X;

import android.app.Activity;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0owW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1492540owW implements InterfaceC1209460hZw {
    public final Activity LIZ;
    public C1492550owX LIZIZ;

    public final void LIZ() {
        try {
            C1492550owX c1492550owX = this.LIZIZ;
            if (C1492500owS.LIZ()) {
                C1492460owO c1492460owO = (C1492460owO) C1492520owU.LIZ.getValue();
                synchronized (c1492460owO) {
                    ((ArrayList) c1492460owO.LJI).remove(c1492550owX);
                }
            }
            this.LIZIZ = null;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public C1492540owW(Activity activity) {
        C1492550owX c1492550owX = new C1492550owX(this);
        this.LIZIZ = c1492550owX;
        this.LIZ = activity;
        if (C1492500owS.LIZ()) {
            C1492460owO c1492460owO = (C1492460owO) C1492520owU.LIZ.getValue();
            synchronized (c1492460owO) {
                if (!C1492500owS.LIZ()) {
                    return;
                }
                if (c1492460owO.LJFF.LIZIZ.get()) {
                    c1492550owX.invoke(Boolean.TRUE);
                }
                ((ArrayList) c1492460owO.LJI).add(c1492550owX);
            }
        }
    }
}
