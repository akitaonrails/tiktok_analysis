package X;

import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.google.android.gms.common.ConnectionResult;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0yAU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1847160yAU {
    public static final /* synthetic */ int LIZ = 0;

    public static int LIZ(int i) {
        switch (i) {
            case 100:
            case 200:
            case DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL /* 300 */:
            case 400:
            case 500:
                return R.drawable.ekw;
            case 600:
            case OppoPermissionPopupMaskDelayExp.DEFAULT /* 700 */:
            case 800:
            case 900:
            case LSPassThroughRecordSizeConfig.DEFAULT /* 1000 */:
                return R.drawable.ekt;
            case 1100:
            case 1200:
            case 1300:
            case 1400:
            case ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED /* 1500 */:
                return R.drawable.ekq;
            default:
                return R.drawable.ekn;
        }
    }

    public static int LIZIZ(int i) {
        switch (i) {
            case 100:
            case 200:
            case DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL /* 300 */:
            case 400:
            case 500:
                return R.drawable.ekx;
            case 600:
            case OppoPermissionPopupMaskDelayExp.DEFAULT /* 700 */:
            case 800:
            case 900:
            case LSPassThroughRecordSizeConfig.DEFAULT /* 1000 */:
                return R.drawable.eku;
            case 1100:
            case 1200:
            case 1300:
            case 1400:
            case ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED /* 1500 */:
                return R.drawable.ekr;
            default:
                return R.drawable.eko;
        }
    }

    public static int LIZLLL(int i) {
        switch (i) {
            case 100:
            case 200:
            case DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL /* 300 */:
            case 400:
            case 500:
                return -11272142;
            case 600:
            case OppoPermissionPopupMaskDelayExp.DEFAULT /* 700 */:
            case 800:
            case 900:
            case LSPassThroughRecordSizeConfig.DEFAULT /* 1000 */:
                return -11727872;
            case 1100:
            case 1200:
            case 1300:
            case 1400:
            case ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED /* 1500 */:
                return -14090120;
            default:
                return -12049152;
        }
    }

    public static int[] LIZJ(int i) {
        switch (i) {
            case 100:
            case 200:
            case DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL /* 300 */:
            case 400:
            case 500:
                return new int[]{-3600, -9769, -11824};
            case 600:
            case OppoPermissionPopupMaskDelayExp.DEFAULT /* 700 */:
            case 800:
            case 900:
            case LSPassThroughRecordSizeConfig.DEFAULT /* 1000 */:
                return new int[]{-4123, -9277, -13657};
            case 1100:
            case 1200:
            case 1300:
            case 1400:
            case ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED /* 1500 */:
                return new int[]{-918529, -2035457, -4135425};
            case 1600:
            case 1700:
            case 1800:
            case 1900:
            case 2000:
                return new int[]{-3142, -6779, -11437};
            default:
                return new int[]{-3142, -6779, -11437};
        }
    }

    public static void LJ(int i, int i2, int i3, C1324720kZq c1324720kZq) {
        int iLIZ;
        if (c1324720kZq == null) {
            return;
        }
        C786410Ut5.LLJJIII(c1324720kZq, 0);
        if (i3 > 0 && i2 <= i3) {
            iLIZ = LIZIZ(i);
        } else {
            iLIZ = LIZ(i);
        }
        c1324720kZq.setActualImageResource(iLIZ);
    }
}
