package X;

import android.app.Activity;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.142U, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C142U implements InterfaceC784910Uqf {
    public final /* synthetic */ C142Z LIZ;
    public final /* synthetic */ C142T LIZIZ;

    @Override // X.InterfaceC784910Uqf
    public final void cancel() {
        this.LIZ.LIZ();
        C142Z c142z = this.LIZ;
        c142z.LJ.LJ("DENY_FROM_REQUEST_RESULT_NEVER_ASK", c142z.LIZJ);
        C142Z c142z2 = this.LIZ;
        c142z2.LJ.LIZLLL(c142z2.LIZJ);
    }

    @Override // X.InterfaceC784910Uqf
    public final void execute() throws Throwable {
        C142T c142t = this.LIZIZ;
        C142Z c142z = this.LIZ;
        c142t.getClass();
        String[] strArr = c142z.LIZJ;
        int iHashCode = 0;
        if (strArr != null) {
            int length = strArr.length;
            iHashCode = 1;
            for (int i = 0; i < length; i++) {
                String str = strArr[i];
                iHashCode = ((iHashCode << 5) - iHashCode) ^ (str == null ? 0 : str.hashCode());
            }
        }
        int i2 = ((-65536) & iHashCode) >>> 16;
        try {
            Activity activity = c142z.LIZ;
            C0W7D c0w7d = C0W7I.LIZ;
            if (C142T.LIZLLL(activity, c0w7d.LIZ(activity))) {
                C142T.LIZ(c142t, c0w7d.LIZ(c142z.LIZ), i2);
                c142t.LLILLJJLI.LJFF(i2, c142z);
            } else {
                c142t.LIZJ(c142z, i2);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            c142t.LIZJ(c142z, i2);
            C20441214yg.LJ("PermissionFragment", "go to origin setting error");
        }
        C142Z c142z2 = this.LIZ;
        c142z2.LJ.LJFF(c142z2.LIZJ);
    }

    public C142U(C142T c142t, C142Z c142z) {
        this.LIZIZ = c142t;
        this.LIZ = c142z;
    }
}
