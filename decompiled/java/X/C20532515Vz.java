package X;

import Y.ARunnableS131S0100000_31;
import android.os.Looper;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15Vz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20532515Vz {
    public static void LIZ(C15W0 c15w0) {
        if (C281360B1a.LIZ && Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            C823050WQl.LIZLLL().execute(new ARunnableS131S0100000_31(c15w0, 220));
        } else {
            C20684815ws.LJIILLIIL(c15w0.getEventName(), c15w0.LIZ());
        }
    }
}
