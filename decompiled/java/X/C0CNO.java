package X;

import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0CNO, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CNO {
    public static final BPEAHandler LIZ = new BPEAHandler(Looper.getMainLooper());

    public static final void LIZ(ExecutorService executorService, final Function0<Unit> function0) {
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            C15O7.LIZIZ(new Callable() { // from class: X.0CNN
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    C1C7U.LIZ("ThreadExtensionKt@4b21.runOnBackgroundThread$1");
                    function0.invoke();
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("ThreadExtensionKt@4b21.runOnBackgroundThread$1");
                    return unit;
                }
            }, executorService, null);
        } else {
            function0.invoke();
        }
    }

    public static final void LIZJ(long j, Runnable runnable) {
        if (j > 0) {
            C786410Ut5.LJLIIL(j, LIZ, runnable);
        } else {
            C786410Ut5.LJJZZIII(LIZ, runnable);
        }
    }

    public static final void LIZLLL(long j, final Function0<Unit> function0) {
        if (j <= 0) {
            if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
                function0.invoke();
                return;
            } else {
                C786410Ut5.LJJZZIII(LIZ, new Runnable() { // from class: X.037S
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("ThreadExtensionKt@4b21.sam$java_lang_Runnable$0");
                        try {
                            function0.invoke();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("ThreadExtensionKt@4b21.sam$java_lang_Runnable$0");
                    }
                });
                return;
            }
        }
        C786410Ut5.LJLIIL(j, LIZ, new Runnable() { // from class: X.037S
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("ThreadExtensionKt@4b21.sam$java_lang_Runnable$0");
                try {
                    function0.invoke();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("ThreadExtensionKt@4b21.sam$java_lang_Runnable$0");
            }
        });
    }
}
