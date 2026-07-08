package X;

import android.os.Bundle;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.favorites.business.collection.ChooseCollectionSheetFragment;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0gap, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1171570gap {
    public static void LIZ(C19EG c19eg, boolean z, String str, String str2, int i, String str3, InterfaceC1170630gZJ interfaceC1170630gZJ, boolean z2, String str4, boolean z3, String str5) {
        ChooseCollectionSheetFragment chooseCollectionSheetFragment = new ChooseCollectionSheetFragment();
        chooseCollectionSheetFragment.aS(interfaceC1170630gZJ);
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("excludeId", str, bundle);
        C786410Ut5.LJJJI("enterFrom", str2, bundle);
        bundle.putBoolean("moveToCollection", z);
        bundle.putInt("firstPageCount", i);
        bundle.putBoolean("useCache", z2);
        C786410Ut5.LJJJI("coverUrl", str3, bundle);
        C786410Ut5.LJJJI("awemeId", str4, bundle);
        bundle.putBoolean("isLSContent", z3);
        C786410Ut5.LJJJI("enterMethod", str5, bundle);
        chooseCollectionSheetFragment.setArguments(bundle);
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LJIIIIZZ(1);
        c1390920mIc.LJI(16);
        c1390920mIc.LIZ.LLJJIJI = chooseCollectionSheetFragment;
        if (C294880Bh8.LIZ()) {
            c1390920mIc.LIZ.LLJI = C1308910kAL.LIZJ(R.attr.bx, c19eg);
        }
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJLILLLLZIIL = false;
        C1391850mK7.LIZIZ(tuxSheet, "profile_collection_manage_nscreen");
        tuxSheet.show(c19eg.getSupportFragmentManager(), "VideoCollectionChooseCollection");
    }
}
