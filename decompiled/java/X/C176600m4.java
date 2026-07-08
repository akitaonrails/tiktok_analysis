package X;

import android.content.Context;
import android.os.Looper;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00m4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C176600m4 {
    public static final Context LIZ() {
        IHostAppContext iHostAppContext = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class);
        if (iHostAppContext != null) {
            return iHostAppContext.context();
        }
        return null;
    }

    public static final boolean LIZIZ(Boolean bool) {
        return Intrinsics.LJFF(bool, Boolean.TRUE);
    }

    public static final void LIZJ(Function0<Unit> function0) {
        if (!Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new RunnableC514801zW(function0, (Function0<Unit>) 141));
        } else {
            function0.invoke();
        }
    }

    public static final void LIZLLL(Function0 function0, boolean z) {
        if (z) {
            LIZJ(function0);
        } else {
            function0.invoke();
        }
    }
}
