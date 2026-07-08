package X;

import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.18yx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21462118yx extends C21461718yt {
    public static boolean LJFF = true;

    public void LJFF(View view, int i, int i2, int i3, int i4) {
        if (LJFF) {
            try {
                view.setLeftTopRightBottom(i, i2, i3, i4);
            } catch (NoSuchMethodError e) {
                TryCatchGuardChecker.doCheck(e);
                LJFF = false;
            }
        }
    }
}
