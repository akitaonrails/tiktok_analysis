package X;

import android.os.Bundle;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushOffReasonsData;
import com.ss.android.ugc.aweme.setting.serverpush.ui.PushOffReasonBottomSheetFragment;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0vcX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1749230vcX {
    public static PushOffReasonBottomSheetFragment LIZ(C19EG c19eg, C1255390im1 c1255390im1, String str, PushOffReasonsData pushOffReasonsData) {
        int i;
        PushOffReasonBottomSheetFragment pushOffReasonBottomSheetFragment = new PushOffReasonBottomSheetFragment();
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("enter_from", c1255390im1.LIZ, bundle);
        C786410Ut5.LJJJI("enter_method", c1255390im1.LIZIZ, bundle);
        pushOffReasonBottomSheetFragment.setArguments(bundle);
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LIZ.LLJJIJI = pushOffReasonBottomSheetFragment;
        c1390920mIc.LJIIIIZZ(1);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJIJIIJIL = true;
        tuxSheet.LLJLILLLLZIIL = false;
        if (C960203pA.LIZIZ(c19eg)) {
            i = R.attr.c3;
        } else {
            i = R.attr.zp;
        }
        c1390920mIc.LIZ.LLJI = C1308910kAL.LIZJ(i, c19eg);
        c1390920mIc.LJI(16);
        DialogInterfaceOnDismissListenerC1775910wJZ dialogInterfaceOnDismissListenerC1775910wJZ = new DialogInterfaceOnDismissListenerC1775910wJZ(pushOffReasonBottomSheetFragment, 2);
        TuxSheet tuxSheet2 = c1390920mIc.LIZ;
        tuxSheet2.LLILLJJLI = dialogInterfaceOnDismissListenerC1775910wJZ;
        tuxSheet2.show(c19eg.getSupportFragmentManager(), "PushOffReasons");
        PushOffReasonBottomSheetFragment.LLJILLL = pushOffReasonsData;
        PushOffReasonBottomSheetFragment.LLJJ = str;
        return pushOffReasonBottomSheetFragment;
    }
}
