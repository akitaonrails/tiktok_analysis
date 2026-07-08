package X;

import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.series.promote.fragment.SeriesPromoteDialogFragment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0s2X, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1611590s2X {
    public static void LIZ(FragmentManager fragmentManager, String str, Function0 function0, String str2, String str3) {
        SeriesPromoteDialogFragment seriesPromoteDialogFragment = new SeriesPromoteDialogFragment();
        seriesPromoteDialogFragment.LLILLL = str;
        seriesPromoteDialogFragment.LLILLJJLI = function0;
        seriesPromoteDialogFragment.LLILZ = str2;
        seriesPromoteDialogFragment.LLILZIL = str3;
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LIZ.LLJJIJI = seriesPromoteDialogFragment;
        c1390920mIc.LJIIIIZZ(2);
        c1390920mIc.LIZ.show(fragmentManager, "PromotionDialogFragment");
    }
}
