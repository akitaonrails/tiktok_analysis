package X;

import android.content.Context;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: X.0Qmu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C680660Qmu {
    public final float LIZ;
    public final InterfaceC680690Qmx LIZIZ;
    public VelocityTracker LIZJ;
    public boolean LIZLLL;
    public float LJ;

    public C680660Qmu(Context context, InterfaceC680690Qmx interfaceC680690Qmx) {
        this.LIZIZ = interfaceC680690Qmx;
        this.LIZ = ViewConfiguration.get(context).getScaledTouchSlop();
    }
}
