package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.history.AdWebHistoryFragment;

/* JADX INFO: renamed from: X.0DKX, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DKX {
    public static AdWebHistoryFragment LIZ(Integer num, String str, boolean z) {
        AdWebHistoryFragment adWebHistoryFragment = new AdWebHistoryFragment();
        Bundle bundle = new Bundle();
        if (num != null) {
            bundle.putInt("enter_from", num.intValue());
        }
        C786410Ut5.LJJJI("entrance", str, bundle);
        bundle.putBoolean("embedded_mode", z);
        adWebHistoryFragment.setArguments(bundle);
        return adWebHistoryFragment;
    }
}
