package X;

import android.app.Activity;
import androidx.fragment.app.Fragment;

/* JADX INFO: renamed from: X.0Vva, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C813440Vva {
    public static final Fragment LIZ(Activity activity) {
        ActivityC21503719Dn activityC21503719Dn;
        Fragment powerAttachRootFragment;
        if (!(activity instanceof ActivityC21503719Dn) || (activityC21503719Dn = (ActivityC21503719Dn) activity) == null || (powerAttachRootFragment = activityC21503719Dn.getPowerAttachRootFragment()) == null) {
            return null;
        }
        return powerAttachRootFragment;
    }
}
