package X;

import android.os.Bundle;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.distribute.MultiGuestConnectDistributeParentFragment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0xMI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1816040xMI {
    public static MultiGuestConnectDistributeParentFragment LIZ(String str, Function0 function0, boolean z, boolean z2, boolean z3) {
        MultiGuestConnectDistributeParentFragment multiGuestConnectDistributeParentFragment = new MultiGuestConnectDistributeParentFragment();
        multiGuestConnectDistributeParentFragment.dismissAction = function0;
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("request_page", str, bundle);
        bundle.putBoolean("show_back_icon", z);
        bundle.putBoolean("use_sheet", z2);
        bundle.putBoolean("is_from_ear_feedback_dialog", z3);
        multiGuestConnectDistributeParentFragment.setArguments(bundle);
        return multiGuestConnectDistributeParentFragment;
    }
}
