package X;

import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.05jq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1436805jq {
    public static final String LIZ(View view, boolean z) {
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
        String simpleName = view.getClass().getSimpleName();
        if (simpleName.length() < 5 || z) {
            simpleName = view.getClass().getName();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(simpleName);
        sbLIZ.append('/');
        sbLIZ.append(resourceEntryName);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
