package X;

import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: renamed from: X.0QxZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C687270QxZ {
    public static double LIZ(double d) {
        if (d <= 0.0d) {
            return d;
        }
        if (d <= 1) {
            return C814420VxA.LIZJ(d * r4) / LSPassThroughRecordSizeConfig.DEFAULT;
        }
        return -1.0d;
    }
}
