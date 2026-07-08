package X;

import android.content.Context;
import android.os.Looper;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.performance.LiveUltimateInflateSwitchSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.FluencyOpt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0J7d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C486790J7d implements FluencyOpt {
    public static final C486790J7d LIZ = new C486790J7d();
    public static boolean LIZIZ;

    public static final boolean LIZIZ() {
        return Intrinsics.LJFF(Looper.getMainLooper().getThread(), C786410Ut5.u3());
    }

    public static final void LIZ(Runnable runnable) {
        C823050WQl.LIZIZ().submit(runnable);
    }

    public static final void LIZJ(Runnable runnable) {
        LIZ.post(runnable, null);
    }

    @Override // com.bytedance.ies.sdk.widgets.FluencyOpt
    public final View getPreloadLayout(int i) {
        C01GW c01gw = C485950J3x.LIZ;
        if (C485950J3x.LIZ(i) && LiveUltimateInflateSwitchSetting.INSTANCE.getValue()) {
            C0J3Y.LIZ.getClass();
            Context context = C0J3Y.LJIIIIZZ;
            if (context == null) {
                return null;
            }
            return C485950J3x.LIZIZ(context, i, null, false);
        }
        C0J3Y.LIZ.getClass();
        return C0J3Y.LJIIIIZZ(i);
    }

    @Override // com.bytedance.ies.sdk.widgets.FluencyOpt
    public final void removeMessages(Object obj) {
        C0IK5.LIZLLL(obj);
    }

    public static final void LJ(DataChannel dataChannel, Runnable runnable) {
        if (dataChannel != null) {
            LIZ.post(runnable, dataChannel);
        } else {
            runnable.run();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.FluencyOpt
    public final void post(Runnable runnable, Object obj) {
        LIZLLL(runnable, obj, 0L);
    }

    public static final void LIZLLL(Runnable runnable, Object obj, long j) {
        C08D5.LIZIZ(C0IK5.LIZ(), runnable, obj, j);
    }

    public static final void LJFF(final int i, final long j, final Object obj, final Function0 function0) {
        if (LIZIZ && i >= 1) {
            LIZLLL(new Runnable() { // from class: X.0J7e
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("FluencyOptUtil@3a3b.postUntilIdle$1");
                    try {
                        C486790J7d.LJFF(i - 1, j, obj, function0);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("FluencyOptUtil@3a3b.postUntilIdle$1");
                }
            }, obj, j);
        } else {
            function0.invoke();
        }
    }
}
