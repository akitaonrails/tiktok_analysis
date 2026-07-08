package X;

import android.content.Context;
import android.os.Build;
import com.ss.android.ugc.aweme.pipo.common.ab.PipoBiometryConfigSettings;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ul3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1716070ul3 {
    public static final /* synthetic */ int LIZJ = 0;
    public final C21642419mw LIZ;
    public final Context LIZIZ;

    public final int LIZ() {
        int i = Build.VERSION.SDK_INT;
        if (i < 28 || Intrinsics.LJFF(PipoBiometryConfigSettings.LIZ().isRestricted, Boolean.TRUE)) {
            return -2;
        }
        int iLIZ = this.LIZ.LIZ(15);
        if (iLIZ == -1 && i == 28) {
            C21642919n1 c21642919n1 = new C21642919n1(this.LIZIZ);
            if (!c21642919n1.LIZIZ()) {
                return 12;
            }
            if (!c21642919n1.LIZ()) {
                return 11;
            }
        }
        return iLIZ;
    }

    public C1716070ul3(C21642419mw c21642419mw, Context context) {
        this.LIZ = c21642419mw;
        this.LIZIZ = context;
    }
}
