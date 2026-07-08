package X;

import com.ss.ttvideoengine.DataLoaderHelper;
import java.util.Objects;

/* JADX INFO: renamed from: X.0oUy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1475460oUy {
    public static void LIZ(C1475130oUR c1475130oUR, DataLoaderHelper dataLoaderHelper) {
        C1475450oUx c1475450oUx;
        C1475500oV2 c1475500oV2 = null;
        if (c1475130oUR.LJFF != null) {
            Objects.requireNonNull(dataLoaderHelper);
            c1475450oUx = new C1475450oUx(c1475130oUR.LJFF);
        } else {
            c1475450oUx = null;
        }
        C1475200oUY c1475200oUY = c1475130oUR.LIZJ;
        if (c1475200oUY != null) {
            c1475500oV2 = new C1475500oV2(c1475200oUY);
        }
        C790230UzF.LIZ.LIZJ().addPriorityTask(c1475130oUR.LIZJ(), c1475450oUx, c1475500oV2);
    }
}
