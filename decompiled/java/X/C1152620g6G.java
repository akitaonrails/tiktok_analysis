package X;

import com.bytedance.android.livesdk.comp.api.pcs.data.setting.BoardDslEnabledVersionSetting;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.BoardDslMinMigratableVersionSetting;
import com.bytedance.android.livesdk.model.Board;

/* JADX INFO: renamed from: X.0g6G, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1152620g6G {
    public static final /* synthetic */ int LIZ = 0;

    public static int LIZJ() {
        int iIntValue;
        Integer numValueOf = Integer.valueOf(BoardDslEnabledVersionSetting.INSTANCE.getValue());
        if (numValueOf.intValue() <= 0) {
            numValueOf = null;
        }
        if (numValueOf == null || (iIntValue = numValueOf.intValue()) > 20200) {
            return 20200;
        }
        return iIntValue;
    }

    public static boolean LIZ(Board board) {
        int i = (int) board.dslVersion;
        if (i == 0) {
            i = 20000;
        }
        if (i >= BoardDslMinMigratableVersionSetting.INSTANCE.getValue()) {
            return true;
        }
        return false;
    }

    public static boolean LIZIZ(Board board) {
        int i = (int) board.minCompatibleDslVersion;
        if (i == 0) {
            i = 20000;
        }
        if (i <= LIZJ()) {
            return true;
        }
        return false;
    }

    public static boolean LIZLLL(Board board) {
        int i = (int) board.dslVersion;
        if (i == 0) {
            i = 20000;
        }
        if (i < LIZJ()) {
            return true;
        }
        return false;
    }
}
