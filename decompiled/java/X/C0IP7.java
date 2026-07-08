package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.broadcast.interaction.widget.livecenter.LiveCenterStatusInfoSheet;

/* JADX INFO: renamed from: X.0IP7, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IP7 {
    public static void LIZ(FragmentManager fragmentManager, String str) {
        if (!fragmentManager.LJLJJI() && fragmentManager.LJJJJZI("LiveCenterStatusInfoSheet") == null) {
            LiveCenterStatusInfoSheet liveCenterStatusInfoSheet = new LiveCenterStatusInfoSheet();
            Bundle bundle = new Bundle();
            C786410Ut5.LJJJI("arg_enter_from", str, bundle);
            liveCenterStatusInfoSheet.setArguments(bundle);
            C19322110iZ.LJFF(fragmentManager, liveCenterStatusInfoSheet, "LiveCenterStatusInfoSheet", null, 0);
        }
    }
}
