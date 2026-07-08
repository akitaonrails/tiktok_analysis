package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: renamed from: X.03gS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C906203gS {
    public static int LIZ(String str) {
        try {
            return CastIntegerProtector.parseInt(str);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return -1;
        }
    }

    public static int LIZIZ(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (str.startsWith(CardStruct.IStatusCode.DEFAULT)) {
            str = str.substring(1);
        }
        int iLIZ = LIZ(str);
        if (iLIZ > 12 || iLIZ < 1) {
            return -1;
        }
        return iLIZ;
    }

    public static int LIZJ(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (str.startsWith(CardStruct.IStatusCode.DEFAULT)) {
            str = str.substring(1);
        }
        int iLIZ = LIZ(str);
        if (iLIZ == -1) {
            return -1;
        }
        if (iLIZ < 1000) {
            return iLIZ + 2000;
        }
        return iLIZ;
    }
}
