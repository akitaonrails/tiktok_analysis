package X;

import android.content.Context;
import android.util.DisplayMetrics;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Dhq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C346280Dhq extends C21674119s3 {
    public final int $t;

    public static final int LJIILJJIL$0(C346280Dhq c346280Dhq) {
        return -1;
    }

    public static final int LJIILJJIL$1(C346280Dhq c346280Dhq) {
        return -1;
    }

    public static final int LJIILL$0(C346280Dhq c346280Dhq) {
        return -1;
    }

    public static final int LJIILL$1(C346280Dhq c346280Dhq) {
        return -1;
    }

    @Override // X.C21674119s3
    public final float LJIIJJI(DisplayMetrics displayMetrics) {
        return this.$t != 0 ? super.LJIIJJI(displayMetrics) : LJIIJJI$0(this, displayMetrics);
    }

    @Override // X.C21674119s3
    public final int LJIILIIL(int i) {
        switch (this.$t) {
            case 1:
                return LJIILIIL$0(this, i);
            case 2:
                return LJIILIIL$1(this, i);
            default:
                return super.LJIILIIL(i);
        }
    }

    @Override // X.C21674119s3
    public final int LJIILJJIL() {
        switch (this.$t) {
            case 1:
                return LJIILJJIL$0(this);
            case 2:
                return LJIILJJIL$1(this);
            default:
                return super.LJIILJJIL();
        }
    }

    @Override // X.C21674119s3
    public final int LJIILL() {
        switch (this.$t) {
            case 1:
                return LJIILL$0(this);
            case 2:
                return LJIILL$1(this);
            default:
                return super.LJIILL();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C346280Dhq(Context context, int i) {
        super(context);
        this.$t = i;
    }

    public static final float LJIIJJI$0(C346280Dhq c346280Dhq, DisplayMetrics displayMetrics) {
        return 1000.0f / displayMetrics.densityDpi;
    }

    public static final int LJIILIIL$0(C346280Dhq c346280Dhq, int i) {
        int iLJ = DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;
        try {
            SettingsManager.LIZLLL().getClass();
            iLJ = SettingsManager.LJ("bulletin_smooth_scroll_speed", DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL);
            return iLJ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return iLJ;
        }
    }

    public static final int LJIILIIL$1(C346280Dhq c346280Dhq, int i) {
        int iLJ = 100;
        try {
            SettingsManager.LIZLLL().getClass();
            iLJ = SettingsManager.LJ("inbox_smooth_scroll_speed", 100);
            return iLJ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return iLJ;
        }
    }
}
