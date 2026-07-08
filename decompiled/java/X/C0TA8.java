package X;

import Y.ARunnableS2S0401000_12;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS199S0000000_12;

/* JADX INFO: renamed from: X.0TA8, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TA8 {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(230));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(231));

    public static void LIZ(Function1 function1, Function1 function12, Function0 function0, Object obj, int i) {
        if (obj != null) {
            if (!((Boolean) function1.invoke(obj)).booleanValue()) {
                return;
            }
            if (i > 0) {
                function12.invoke(obj);
            }
        }
        if (i > ((Number) LIZ.getValue()).longValue()) {
            return;
        }
        C786410Ut5.LJLIIL(((Number) LIZIZ.getValue()).longValue(), new BPEAHandler(Looper.getMainLooper()), new ARunnableS2S0401000_12(function1, function12, function0, function0.invoke(), i, 0));
    }
}
