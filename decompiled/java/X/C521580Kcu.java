package X;

import android.content.res.Configuration;
import android.content.res.Resources;
import com.ss.android.ugc.aweme.pcs.course.musicpeelpage.ui.PcsCourseMusicPeelFragment;
import com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.PcsCourseVideoPlayFragment;

/* JADX INFO: renamed from: X.0Kcu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C521580Kcu extends AbstractC2173821A5s {
    public final int $t;
    public Object l0;

    @Override // X.AbstractC2173821A5s
    public final void LIZIZ() {
        switch (this.$t) {
            case 0:
                LIZIZ$0(this);
                break;
            case 1:
                LIZIZ$1(this);
                break;
            default:
                super.LIZIZ();
                break;
        }
    }

    public static final void LIZIZ$0(C521580Kcu c521580Kcu) {
        Resources resources;
        Configuration configuration;
        Integer numValueOf;
        C19EG activity = ((PcsCourseMusicPeelFragment) c521580Kcu.l0).getActivity();
        if (activity != null && (resources = activity.getResources()) != null && (configuration = resources.getConfiguration()) != null && (numValueOf = Integer.valueOf(configuration.orientation)) != null && numValueOf.intValue() == 2) {
            C19EG activity2 = ((PcsCourseMusicPeelFragment) c521580Kcu.l0).getActivity();
            if (activity2 != null) {
                activity2.setRequestedOrientation(1);
                return;
            }
            return;
        }
        c521580Kcu.LJFF(false);
        C19EG activity3 = ((PcsCourseMusicPeelFragment) c521580Kcu.l0).getActivity();
        if (activity3 == null) {
            return;
        }
        activity3.onBackPressed();
    }

    public static final void LIZIZ$1(C521580Kcu c521580Kcu) {
        Resources resources;
        Configuration configuration;
        Integer numValueOf;
        C19EG activity = ((PcsCourseVideoPlayFragment) c521580Kcu.l0).getActivity();
        if (activity != null && (resources = activity.getResources()) != null && (configuration = resources.getConfiguration()) != null && (numValueOf = Integer.valueOf(configuration.orientation)) != null && numValueOf.intValue() == 2) {
            C19EG activity2 = ((PcsCourseVideoPlayFragment) c521580Kcu.l0).getActivity();
            if (activity2 != null) {
                activity2.setRequestedOrientation(1);
                return;
            }
            return;
        }
        c521580Kcu.LJFF(false);
        C19EG activity3 = ((PcsCourseVideoPlayFragment) c521580Kcu.l0).getActivity();
        if (activity3 == null) {
            return;
        }
        activity3.onBackPressed();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C521580Kcu(Object obj, int i) {
        super(true);
        this.$t = i;
        this.l0 = obj;
    }
}
