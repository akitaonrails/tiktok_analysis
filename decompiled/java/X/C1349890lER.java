package X;

import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;
import com.ss.android.ugc.aweme.net.control.DispatchConfig;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: renamed from: X.0lER, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1349890lER {
    public static boolean LIZ;

    public static final void LIZ() {
        if (!((Boolean) C307000C1q.LIZIZ.getValue()).booleanValue() || LIZ) {
            return;
        }
        C1490190osj c1490190osj = C1490190osj.LIZIZ;
        EnumC2262571Dh9 enumC2262571Dh9 = EnumC2262571Dh9.BIZ_COMMENT_CONSUME;
        c1490190osj.LIZIZ(enumC2262571Dh9, new DispatchConfig(enumC2262571Dh9.getValue(), 0, (Set) C307000C1q.LIZLLL.getValue(), (Set) C307000C1q.LJ.getValue(), null, 0, 0, (Set) C307000C1q.LJI.getValue(), null, (Set) C307000C1q.LJFF.getValue(), null, null, null, 7538, null));
        c1490190osj.LIZ(enumC2262571Dh9);
    }

    public static final void LIZJ() {
        if (((Boolean) C307000C1q.LIZ.getValue()).booleanValue()) {
            LIZ = false;
            C1490190osj c1490190osj = C1490190osj.LIZIZ;
            EnumC2262571Dh9 enumC2262571Dh9 = EnumC2262571Dh9.BIZ_COMMENT_ENTER;
            c1490190osj.LIZJ(enumC2262571Dh9);
            c1490190osj.LIZLLL(enumC2262571Dh9);
            if (((Boolean) C307000C1q.LIZIZ.getValue()).booleanValue()) {
                LIZ();
            }
        }
    }

    public static final void LIZIZ(boolean z) {
        if (((Boolean) C307000C1q.LIZ.getValue()).booleanValue()) {
            LIZ = true;
            C1490190osj c1490190osj = C1490190osj.LIZIZ;
            EnumC2262571Dh9 enumC2262571Dh9 = EnumC2262571Dh9.BIZ_COMMENT_ENTER;
            c1490190osj.LIZIZ(enumC2262571Dh9, new DispatchConfig(enumC2262571Dh9.getValue(), 0, null, null, Collections.singleton("/aweme/v2/comment/list/"), LivePreCreateNextRoomPlayer.ENABLE, 0, null, null, null, null, null, null, 8142, null));
            c1490190osj.LIZ(enumC2262571Dh9);
            return;
        }
        if (!z) {
            return;
        }
        LIZ();
    }
}
