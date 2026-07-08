package X;

import Y.ARunnableS106S0100000_6;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.FrameLayout;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0eVA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1091180eVA implements InterfaceC1091030eUv, Handler.Callback {
    public final DataChannel LL;
    public final InterfaceC1091200eVC LLILLJJLI;
    public final FrameLayout LLILLL;
    public final Context LLILZ;
    public final BPEAHandler LLILZIL = new BPEAHandler(Looper.getMainLooper(), this);

    @Override // X.InterfaceC1091030eUv
    public void LIZ(C1091150eV7 c1091150eV7) {
        throw null;
    }

    @Override // X.InterfaceC1091030eUv
    public void release() {
        throw null;
    }

    public final void LIZIZ(Function0<Unit> function0) {
        if (!Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper())) {
            C786410Ut5.LJJZZIII(this.LLILZIL, new ARunnableS106S0100000_6((Function0) function0, 189));
        } else {
            function0.invoke();
        }
    }

    public C1091180eVA(DataChannel dataChannel, InterfaceC1091200eVC interfaceC1091200eVC, FrameLayout frameLayout, Context context) {
        this.LL = dataChannel;
        this.LLILLJJLI = interfaceC1091200eVC;
        this.LLILLL = frameLayout;
        this.LLILZ = context;
    }
}
