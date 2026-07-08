package X;

import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.favorites.ui.FavoriteNoticeSheetFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.0OFO, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OFO {
    public static void LIZ(C19EG c19eg, String str, Aweme aweme) {
        FavoriteNoticeSheetFragment favoriteNoticeSheetFragment = new FavoriteNoticeSheetFragment();
        favoriteNoticeSheetFragment.LLILLJJLI = aweme;
        favoriteNoticeSheetFragment.LL = str;
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJIJI = favoriteNoticeSheetFragment;
        tuxSheet.LLJJIJIIJIL = true;
        c1390920mIc.LJIIIIZZ(1);
        TuxSheet tuxSheet2 = c1390920mIc.LIZ;
        tuxSheet2.LLILLJJLI = favoriteNoticeSheetFragment;
        tuxSheet2.show(c19eg.getSupportFragmentManager(), "FavoriteNoticeSheet");
    }
}
