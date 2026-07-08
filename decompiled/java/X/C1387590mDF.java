package X;

import com.ss.android.ugc.aweme.experiment.TimeWindow;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mDF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1387590mDF {
    public static final AbstractC1790510wh7 LIZ(TimeWindow timeWindow) {
        String str = timeWindow.type;
        final long jLongValue = 0;
        if (Intrinsics.LJFF(str, EnumC1387600mDG.TIME_WINDOW_DURATION.getType())) {
            Long l = timeWindow.size;
            if (l != null) {
                jLongValue = l.longValue();
            }
            return new AbstractC1790510wh7(jLongValue) { // from class: X.0mCr
                public final long LIZ;

                {
                    this.LIZ = jLongValue * ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                }

                @Override // X.AbstractC1790510wh7
                public final long LIZ(long j) {
                    return j + this.LIZ;
                }

                @Override // X.AbstractC1790510wh7
                public final boolean LIZIZ(long j) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (jCurrentTimeMillis - this.LIZ > j || j > jCurrentTimeMillis) {
                        return false;
                    }
                    return true;
                }
            };
        }
        if (Intrinsics.LJFF(str, EnumC1387600mDG.TIME_WINDOW_CALENDAR_DAY.getType())) {
            Long l2 = timeWindow.size;
            if (l2 != null) {
                jLongValue = l2.longValue();
            }
            return new AbstractC1790510wh7(jLongValue) { // from class: X.0mCq
                public final long LIZ;

                {
                    this.LIZ = (jLongValue - 1) * ((long) 86400000);
                }

                @Override // X.AbstractC1790510wh7
                public final long LIZ(long j) {
                    return C1387330mCp.LIZ(j).LIZIZ + this.LIZ;
                }

                @Override // X.AbstractC1790510wh7
                public final boolean LIZIZ(long j) {
                    C1387320mCo c1387320mCoLIZJ = C1387310mCn.LIZJ();
                    if (c1387320mCoLIZJ.LIZ - this.LIZ > j || j > c1387320mCoLIZJ.LIZIZ) {
                        return false;
                    }
                    return true;
                }
            };
        }
        return null;
    }
}
