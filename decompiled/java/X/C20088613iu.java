package X;

import Y.ARunnableS6S0110100_30;
import android.os.Handler;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS609S0100000_30;

/* JADX INFO: renamed from: X.13iu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20088613iu<T> {
    public final Handler LIZ;
    public final Function1<T, Unit> LIZIZ;
    public T LIZJ;
    public final ARunnableS6S0110100_30 LIZLLL = new ARunnableS6S0110100_30(this, 0);

    public C20088613iu(BPEAHandler bPEAHandler, AwS609S0100000_30 awS609S0100000_30) {
        this.LIZ = bPEAHandler;
        this.LIZIZ = awS609S0100000_30;
    }
}
