package X;

import android.content.Intent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0mQm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1395980mQm {
    public static final C1395980mQm LIZ = new C1395980mQm();

    public static ArrayList LIZ(Intent intent) {
        String stringExtra;
        String stringExtra2;
        List listLJJLIIIJILLIZJL;
        String stringExtra3;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("extra_stickers");
        try {
            stringExtra = intent.getStringExtra(FollowStatusChangeMethod.PARAM_UID);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            stringExtra = null;
        }
        try {
            stringExtra2 = intent.getStringExtra("sticker_id");
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            stringExtra2 = null;
        }
        if (stringExtra2 != null) {
            listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(stringExtra2, new String[]{","}, 0, 6);
        } else {
            listLJJLIIIJILLIZJL = null;
        }
        try {
            stringExtra3 = intent.getStringExtra(FollowStatusChangeMethod.PARAM_UID);
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
            stringExtra3 = null;
        }
        if (stringArrayListExtra != null && !stringArrayListExtra.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (stringExtra != null && !a0.LJJJIL(stringExtra)) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!z2) {
                return C1697810uHb.LJ(stringExtra);
            }
            if (listLJJLIIIJILLIZJL != null && !listLJJLIIIJILLIZJL.isEmpty()) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (!z3) {
                return C09HN.LIZ(listLJJLIIIJILLIZJL);
            }
            if (stringExtra3 != null && !a0.LJJJIL(stringExtra3)) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (z4) {
                return null;
            }
            return C1697810uHb.LJ(stringExtra3);
        }
        return stringArrayListExtra;
    }
}
