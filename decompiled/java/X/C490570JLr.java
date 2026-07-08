package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.pcs.course.coursedetailpage.view.PcsCourseDetailFragment;

/* JADX INFO: renamed from: X.0JLr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C490570JLr {
    public static PcsCourseDetailFragment LIZ(String str, String str2, long j, long j2, String str3, Long l, boolean z, boolean z2, boolean z3) {
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("show_entrance", str, bundle);
        C786410Ut5.LJJJI("enter_from", str2, bundle);
        bundle.putBoolean("is_full_screen_page", z);
        bundle.putLong("course_id", j);
        bundle.putLong("anchor_id", j2);
        C786410Ut5.LJJJI("sec_anchor_id", str3, bundle);
        bundle.putBoolean("has_purchased", z2);
        bundle.putBoolean("is_single_sku", z3);
        if (l != null) {
            bundle.putLong("room_id", l.longValue());
        }
        PcsCourseDetailFragment pcsCourseDetailFragment = new PcsCourseDetailFragment();
        pcsCourseDetailFragment.setArguments(bundle);
        return pcsCourseDetailFragment;
    }
}
