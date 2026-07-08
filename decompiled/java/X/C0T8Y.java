package X;

import android.content.Context;
import android.content.res.Resources;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: renamed from: X.0T8Y, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0T8Y {
    public static final String LIZ(int i, int i2, long j, Context context) {
        long j2 = j / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        long j3 = j2 / ((long) 60);
        int i3 = 2;
        if (j3 >= 1) {
            Resources resources = context.getResources();
            if (j3 <= 1) {
                i3 = 1;
            }
            return resources.getQuantityString(i, i3, Long.valueOf(j3));
        }
        Resources resources2 = context.getResources();
        if (j2 <= 1) {
            i3 = 1;
        }
        return resources2.getQuantityString(i2, i3, Long.valueOf(j2));
    }
}
