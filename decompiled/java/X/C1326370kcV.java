package X;

import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0kcV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1326370kcV {
    public static final BPEAHandler LIZ = new BPEAHandler(Looper.getMainLooper());

    @InterfaceC1294060jmO
    public static void LIZ(final Function0 function0) {
        ExecutorService executorService = C2281108wj.LIZ;
        C2281108wj.LIZ(EnumC2281308wl.Sequence).submit(new Runnable() { // from class: X.01CT
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("SimpleWorker@88d7.sam$java_lang_Runnable$0");
                try {
                    function0.invoke();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("SimpleWorker@88d7.sam$java_lang_Runnable$0");
            }
        });
    }
}
