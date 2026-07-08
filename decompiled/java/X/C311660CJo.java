package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0CJo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C311660CJo {
    public static C311600CJi LIZ(int i, long j, boolean z, boolean z2, Function2 function2) {
        if (AbstractC19994813Le.Default.nextInt(0, LSPassThroughRecordSizeConfig.DEFAULT) < ((Number) C311670CJp.LIZ.getValue()).intValue()) {
            return new C311600CJi(j, SystemClock.elapsedRealtimeNanos() / ((long) LSPassThroughRecordSizeConfig.DEFAULT), i, z, function2, z2);
        }
        return null;
    }
}
