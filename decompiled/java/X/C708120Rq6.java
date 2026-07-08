package X;

import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.AFwS198S0000000_11;

/* JADX INFO: renamed from: X.0Rq6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C708120Rq6 {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(528));

    public static String LIZ(View view) {
        String resourceEntryName;
        try {
            if (view.getId() == -1) {
                resourceEntryName = "-1";
            } else {
                resourceEntryName = view.getContext().getResources().getResourceEntryName(view.getId());
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            resourceEntryName = "";
        }
        return String.valueOf(resourceEntryName);
    }
}
