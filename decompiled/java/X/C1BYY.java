package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.1BYY, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BYY implements InterfaceC586170Myt {
    public static final C1BYY LL = new C1BYY();

    @Override // X.InterfaceC586170Myt
    public final void onAccountResult(int i, boolean z, int i2, User user) {
        C1BYW c1byw;
        C1BYV.LIZ.getClass();
        if (z) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        c1byw = C1BYW.LLILZ;
                    } else {
                        return;
                    }
                } else {
                    c1byw = C1BYW.LLILLL;
                }
            } else {
                c1byw = C1BYW.LLILLJJLI;
            }
            C1BYV.LJFF = SystemClock.uptimeMillis();
            C1BYV.LJI = SystemClock.uptimeMillis();
            C1BYV.LJFF(c1byw);
        }
    }
}
