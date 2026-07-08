package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.pcs.course.musicpeelpage.ui.PcsCourseMusicPeelFragment;

/* JADX INFO: renamed from: X.0JIA, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JIA {
    public static PcsCourseMusicPeelFragment LIZ(C0JIA c0jia, String str, long j, long j2, long j3, String str2, InterfaceC489200JGk interfaceC489200JGk, int i) {
        if ((i & 16) != 0) {
            str2 = "";
        }
        if ((i & 32) != 0) {
            interfaceC489200JGk = null;
        }
        c0jia.getClass();
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("enter_from", str, bundle);
        bundle.putLong("course_id", j);
        bundle.putLong("video_id", j2);
        bundle.putLong("anchor_id", j3);
        C786410Ut5.LJJJI("player_intent", str2, bundle);
        PcsCourseMusicPeelFragment pcsCourseMusicPeelFragment = new PcsCourseMusicPeelFragment();
        pcsCourseMusicPeelFragment.setArguments(bundle);
        pcsCourseMusicPeelFragment.LLJILJIL = interfaceC489200JGk;
        return pcsCourseMusicPeelFragment;
    }
}
