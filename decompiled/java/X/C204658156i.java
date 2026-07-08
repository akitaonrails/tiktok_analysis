package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.Arrays;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.156i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C204658156i {
    public static volatile String LIZIZ;
    public static volatile boolean LIZJ;
    public static final C204658156i LIZ = new C204658156i();
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(384));

    public static boolean LIZIZ() {
        return ((Keva) LIZLLL.getValue()).getBoolean(C786410Ut5.j4("has_lyric_tag_shown_%s", Arrays.copyOf(new Object[]{C0CHQ.LIZ().getAccountService().getCurrentUserID()}, 1)), false);
    }

    public final void LIZJ() {
        String currentUserID = C0CHQ.LIZ().getAccountService().getCurrentUserID();
        synchronized (this) {
            try {
                if (Intrinsics.LJFF(LIZIZ, currentUserID)) {
                    LIZJ = false;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final boolean LIZLLL() {
        String currentUserID = C0CHQ.LIZ().getAccountService().getCurrentUserID();
        synchronized (this) {
            try {
                if (!Intrinsics.LJFF(LIZIZ, currentUserID)) {
                    LIZIZ = currentUserID;
                    LIZJ = false;
                }
                if (LIZIZ()) {
                    return false;
                }
                if (LIZJ) {
                    return false;
                }
                LIZJ = true;
                return true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static boolean LIZ(MusicModel musicModel) {
        boolean z;
        if (musicModel.hasLyricsCopyRight() && !musicModel.isLocalMusic()) {
            z = true;
        } else {
            z = false;
        }
        boolean zLIZIZ = LIZIZ();
        if (z && !zLIZIZ) {
            return true;
        }
        return false;
    }
}
