package X;

import android.app.Activity;
import android.os.Looper;
import android.view.View;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Q8d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C665410Q8d {
    public static final BPEAHandler LIZ = new BPEAHandler(Looper.getMainLooper());

    public static final C19EG LIZ(View view) {
        Object next;
        Iterator it2 = C09R4.LJ(AFwS241S0000000_10.get$arr$(596), view.getContext()).iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next instanceof Activity) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return (C19EG) next;
    }

    public static final void LIZIZ(final Function0<Unit> function0) {
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            function0.invoke();
        } else {
            C786410Ut5.LJJZZIII(LIZ, new Runnable() { // from class: X.0Q8c
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("ContextExtensionKt@a89d.runOnUIThread$1");
                    try {
                        function0.invoke();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("ContextExtensionKt@a89d.runOnUIThread$1");
                }
            });
        }
    }
}
