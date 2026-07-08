package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0C7a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C308400C7a {
    public static C311590CJh LIZ(int i, long j, boolean z, boolean z2, Function2 function2) {
        if (AbstractC19994813Le.Default.nextInt(0, LSPassThroughRecordSizeConfig.DEFAULT) >= ((Number) C256340A2u.LIZ.getValue()).intValue()) {
            return null;
        }
        return new C311590CJh(j, SystemClock.elapsedRealtimeNanos() / ((long) LSPassThroughRecordSizeConfig.DEFAULT), i, z, z2, function2);
    }
}
