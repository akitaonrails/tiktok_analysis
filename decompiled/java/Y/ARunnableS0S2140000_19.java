package Y;

import X.C09YG;
import X.C1249240ic6;
import X.C1C7U;
import com.ss.android.ugc.profile.platform.base.data.EventParams;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public class ARunnableS0S2140000_19 implements Runnable {
    public final int $t;
    public Object l2;
    public String s0;
    public String s1;
    public boolean z3;
    public boolean z4;
    public boolean z5;
    public boolean z6;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public static final void run$0(ARunnableS0S2140000_19 aRunnableS0S2140000_19) {
        boolean zLIZ;
        List<EventParams> list;
        C1C7U.LIZ("MenuReport@a9c2.reportMenuItemShow$1");
        try {
            C1249240ic6 c1249240ic6 = C1249240ic6.LIZ;
            ProfileComponents profileComponents = (ProfileComponents) aRunnableS0S2140000_19.l2;
            if (profileComponents != null) {
                list = profileComponents.eventParams;
            } else {
                list = null;
            }
            boolean z = aRunnableS0S2140000_19.z3;
            boolean z2 = aRunnableS0S2140000_19.z4;
            int type = C09YG.TYPE_SHOW.getType();
            String str = aRunnableS0S2140000_19.s0;
            String str2 = aRunnableS0S2140000_19.s1;
            boolean z3 = aRunnableS0S2140000_19.z5;
            boolean z4 = aRunnableS0S2140000_19.z6;
            c1249240ic6.getClass();
            C1249240ic6.LJFF(list, z, z2, type, str, str2, z3, z4, false, null, null, null);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MenuReport@a9c2.reportMenuItemShow$1");
    }

    public static final void run$1(ARunnableS0S2140000_19 aRunnableS0S2140000_19) {
        boolean zLIZ;
        List<EventParams> list;
        C1C7U.LIZ("MenuReport@a9c2.reportMenuItemClick$1");
        try {
            C1249240ic6 c1249240ic6 = C1249240ic6.LIZ;
            ProfileComponents profileComponents = (ProfileComponents) aRunnableS0S2140000_19.l2;
            if (profileComponents != null) {
                list = profileComponents.eventParams;
            } else {
                list = null;
            }
            boolean z = aRunnableS0S2140000_19.z3;
            boolean z2 = aRunnableS0S2140000_19.z4;
            int type = C09YG.TYPE_CLICK.getType();
            String str = aRunnableS0S2140000_19.s0;
            String str2 = aRunnableS0S2140000_19.s1;
            boolean z3 = aRunnableS0S2140000_19.z5;
            boolean z4 = aRunnableS0S2140000_19.z6;
            c1249240ic6.getClass();
            C1249240ic6.LJFF(list, z, z2, type, str, str2, z3, z4, false, null, null, null);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MenuReport@a9c2.reportMenuItemClick$1");
    }

    public ARunnableS0S2140000_19(ProfileComponents profileComponents, boolean z, boolean z2, String str, String str2, boolean z3, boolean z4, int i) {
        this.$t = i;
        this.l2 = profileComponents;
        this.z3 = z;
        this.z4 = z2;
        this.s0 = str;
        this.s1 = str2;
        this.z5 = z3;
        this.z6 = z4;
    }
}
