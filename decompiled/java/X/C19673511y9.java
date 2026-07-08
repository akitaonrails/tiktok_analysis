package X;

import android.view.Window;
import android.view.WindowManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.bidding.UsBidViewModel;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.bidding.UsMaxBidFragment;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.11y9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19673511y9 {
    public static void LIZ(C19EG c19eg, UsBidViewModel usBidViewModel) {
        int i;
        WindowManager.LayoutParams attributes;
        UsMaxBidFragment usMaxBidFragment = new UsMaxBidFragment();
        usMaxBidFragment.LLILLJJLI = usBidViewModel;
        Window window = c19eg.getWindow();
        if (window != null && (attributes = window.getAttributes()) != null) {
            i = attributes.softInputMode;
        } else {
            i = 0;
        }
        usMaxBidFragment.LLILZLL = i;
        Window window2 = c19eg.getWindow();
        if (window2 != null) {
            window2.setSoftInputMode(52);
        }
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LIZ.LLJJIJI = usMaxBidFragment;
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(426));
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJL = iLIZIZ;
        tuxSheet.LLJLLL = true;
        tuxSheet.LLJJIJIIJIL = false;
        c1390920mIc.LJIIIIZZ(1);
        c1390920mIc.LIZ.LLJI = C1308910kAL.LIZJ(R.attr.a1e, c19eg);
        c1390920mIc.LJI(52);
        c1390920mIc.LIZ.show(c19eg.getSupportFragmentManager(), "maxBidFragment");
    }
}
