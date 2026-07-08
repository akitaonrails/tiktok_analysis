package Y;

import X.C0MBA;
import X.C1440005kM;
import X.C1C7U;
import X.C2237608pi;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordPermissionActivity;
import com.ss.android.ugc.cut_ui_impl.newplayer.NewCutPlayerActivity;
import lth.o;

/* JADX INFO: loaded from: classes9.dex */
public class ARunnableS87S0000000_8 implements Runnable {
    public final int $t;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public ARunnableS87S0000000_8(int i) {
        this.$t = i;
    }

    public static final void run$0(ARunnableS87S0000000_8 aRunnableS87S0000000_8) {
        boolean zLIZ;
        C1C7U.LIZ("ExteriorVideoRecordScene@35a2.onResume$1");
        try {
            C1440005kM.LIZ(new C0MBA());
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ExteriorVideoRecordScene@35a2.onResume$1");
    }

    public static final void run$1(ARunnableS87S0000000_8 aRunnableS87S0000000_8) {
        String str = VideoRecordPermissionActivity._pnsPageId;
        C1C7U.LIZ("VideoRecordPermissionActivity@14a8.startVideoRecordActivity$1L");
        o.LIZJ.getClass();
        C2237608pi.LIZIZ(10);
        C1C7U.LIZIZ("VideoRecordPermissionActivity@14a8.startVideoRecordActivity$1L");
    }

    public static final void run$2(ARunnableS87S0000000_8 aRunnableS87S0000000_8) {
        boolean zLIZ;
        C1C7U.LIZ("RecordContainerComponent@2249.onResume$2");
        try {
            C1440005kM.LIZ(new C0MBA());
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("RecordContainerComponent@2249.onResume$2");
    }

    public static final void run$3(ARunnableS87S0000000_8 aRunnableS87S0000000_8) {
        C1C7U.LIZ("AVToolsHelper@51fc.startRecordActivity2SkipPermissionActivityInternal$1L");
        o.LIZJ.getClass();
        C2237608pi.LIZIZ(10);
        C1C7U.LIZIZ("AVToolsHelper@51fc.startRecordActivity2SkipPermissionActivityInternal$1L");
    }

    public static final void run$4(ARunnableS87S0000000_8 aRunnableS87S0000000_8) {
        String str = NewCutPlayerActivity._pnsPageId;
        C1C7U.LIZ("NewCutPlayerActivity@18cb.onPlayerPrepareOk$1L");
        C1C7U.LIZIZ("NewCutPlayerActivity@18cb.onPlayerPrepareOk$1L");
    }
}
