package X;

import android.content.res.TypedArray;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0erv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1105290erv {
    public static long LIZ(long j, String str, Map map) {
        if (map != null) {
            long jNanoTime = System.nanoTime();
            map.put(str, Long.valueOf((jNanoTime - j) / ((long) LSPassThroughRecordSizeConfig.DEFAULT)));
            return jNanoTime;
        }
        return 0L;
    }

    public static void LIZIZ(TypedArray typedArray, int i, Function1 function1) {
        if (typedArray.hasValue(i)) {
            function1.invoke(Integer.valueOf(i));
        }
    }
}
