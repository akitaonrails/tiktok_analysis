package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.business.live.LiveEventBottomSheetFragment;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: renamed from: X.0TRk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C746860TRk {
    public static void LIZ(FragmentManager fragmentManager, User user, List list) {
        LiveEventBottomSheetFragment liveEventBottomSheetFragment = new LiveEventBottomSheetFragment();
        Bundle bundle = new Bundle();
        C786410Ut5.LJJIZ(bundle, "live_event_user", user);
        C786410Ut5.LJJIZ(bundle, "live_event_list", (Serializable) list);
        liveEventBottomSheetFragment.setArguments(bundle);
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LIZ.LLJJIJI = liveEventBottomSheetFragment;
        c1390920mIc.LJIIIIZZ(1);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJIJIIJIL = true;
        tuxSheet.LLJLILLLLZIIL = false;
        tuxSheet.show(fragmentManager, "LiveEventBottomSheetFragment");
    }
}
