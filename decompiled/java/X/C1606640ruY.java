package X;

import com.ss.android.ugc.aweme.im.common.experiment.IMChatToDetailSafConfig;
import kotlin.jvm.internal.AFwS213S0000000_24;

/* JADX INFO: renamed from: X.0ruY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1606640ruY {
    public static final C1606640ruY LIZ = new C1606640ruY();
    public static final IMChatToDetailSafConfig LIZIZ = new IMChatToDetailSafConfig(0, 0, 0, 0, false, 0, 0, 0, 0, false, false, false);
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(581));

    public static IMChatToDetailSafConfig LIZ() {
        return (IMChatToDetailSafConfig) LIZJ.getValue();
    }

    public static final boolean LIZJ() {
        LIZ.getClass();
        if (LIZ().enableEntries != 0) {
            return (LIZLLL() || LJ()) && LIZ().animType != 0;
        }
        return false;
    }

    public static final boolean LIZLLL() {
        LIZ.getClass();
        return LIZ().safMode == 1;
    }

    public static final boolean LJ() {
        LIZ.getClass();
        return LIZ().safMode == 2;
    }

    public static final boolean LIZIZ(C0ZUL c0zul) {
        LIZ.getClass();
        if ((c0zul.getMask() & LIZ().enableEntries) != 0) {
            if (LIZLLL() || LJ()) {
                return true;
            }
            return false;
        }
        return false;
    }
}
