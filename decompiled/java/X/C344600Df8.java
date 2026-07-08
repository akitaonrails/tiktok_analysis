package X;

import android.os.Bundle;
import com.ss.android.ugc.tiktok.tns.userrelation.block.ui.RemoveInactiveUserFragment;

/* JADX INFO: renamed from: X.0Df8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C344600Df8 {
    public static RemoveInactiveUserFragment LIZ(int i, String str) {
        RemoveInactiveUserFragment removeInactiveUserFragment = new RemoveInactiveUserFragment();
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("remove_status", str, bundle);
        bundle.putInt("remove_number", i);
        removeInactiveUserFragment.setArguments(bundle);
        return removeInactiveUserFragment;
    }
}
