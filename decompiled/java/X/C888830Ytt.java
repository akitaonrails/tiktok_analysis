package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.keva.Keva;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.im.chatlist.impl.dmrisky.DmFilterAddKeywordsBottomSheet;

/* JADX INFO: renamed from: X.0Ytt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C888830Ytt {
    public static TuxSheet LIZ(FragmentManager fragmentManager, EnumC894560Z7m enumC894560Z7m, String str) {
        C01GW c01gw = C888940Yu4.LIZ;
        ((Keva) c01gw.getValue()).storeInt("BottomSheetDisplayCount", ((Keva) c01gw.getValue()).getInt("BottomSheetDisplayCount", 0) + 1);
        DmFilterAddKeywordsBottomSheet dmFilterAddKeywordsBottomSheet = new DmFilterAddKeywordsBottomSheet();
        Bundle bundle = new Bundle();
        bundle.putInt("enter_method", enumC894560Z7m.ordinal());
        dmFilterAddKeywordsBottomSheet.setArguments(bundle);
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LIZ.LLJLL = true;
        c1390920mIc.LJI(16);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJIJI = dmFilterAddKeywordsBottomSheet;
        dmFilterAddKeywordsBottomSheet.LLIZ = tuxSheet;
        tuxSheet.show(fragmentManager, str);
        DmFilterAddKeywordsBottomSheet.LLJILLL = dmFilterAddKeywordsBottomSheet;
        TuxSheet tuxSheet2 = dmFilterAddKeywordsBottomSheet.LLIZ;
        if (tuxSheet2 == null) {
            return null;
        }
        return tuxSheet2;
    }
}
