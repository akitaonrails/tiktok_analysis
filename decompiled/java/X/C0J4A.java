package X;

import android.content.Context;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.livesetting.performance.LiveInteractViewAsyncOpt;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

/* JADX INFO: renamed from: X.0J4A, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J4A {
    public C0J46 LIZ;
    public BPEAHandler LIZIZ;
    public final C18JT LIZJ;
    public final C521750KdB LIZLLL = new C521750KdB(this, 4);

    public C0J4A(Context context) {
        LIZIZ(context);
        this.LIZJ = C18JT.LIZLLL(Integer.MIN_VALUE, false, false);
    }

    public final void LIZIZ(Context context) {
        this.LIZ = new C0J46(context);
        if (Looper.myLooper() == null) {
            this.LIZIZ = new BPEAHandler(Looper.getMainLooper(), this.LIZLLL);
        } else {
            this.LIZIZ = new BPEAHandler(this.LIZLLL);
        }
    }

    public final void LIZJ(Object obj) {
        C0J40[] c0j40Arr;
        if (obj != null) {
            C18JT c18jt = this.LIZJ;
            BlockingDeque<C0J40> blockingDeque = c18jt.LLILLJJLI;
            if (blockingDeque != null) {
                c0j40Arr = (C0J40[]) ((LinkedBlockingDeque) blockingDeque).toArray(new C0J40[0]);
            } else {
                c0j40Arr = (C0J40[]) c18jt.LL.toArray(new C0J40[0]);
            }
            BlockingDeque<C0J40> blockingDeque2 = c18jt.LLILLJJLI;
            if (blockingDeque2 != null) {
                ((LinkedBlockingDeque) blockingDeque2).clear();
            }
            BlockingQueue<C0J40> blockingQueue = c18jt.LL;
            if (blockingQueue != null) {
                blockingQueue.clear();
            }
            for (C0J40 c0j40 : c0j40Arr) {
                if (obj.equals(c0j40.LJFF)) {
                    c18jt.LJ(c0j40);
                }
            }
            this.LIZIZ.removeMessages(obj.hashCode());
        }
    }

    public final void LIZLLL(LayoutInflater.Factory2 factory2) {
        C0J46 c0j46;
        if (factory2 != null && (c0j46 = this.LIZ) != null && C786410Ut5.Qd(c0j46) == null) {
            C786410Ut5.Vd(this.LIZ, factory2);
        }
    }

    public C0J4A(Context context, int i) {
        LIZIZ(context);
        this.LIZJ = C18JT.LIZLLL(i, true, LiveInteractViewAsyncOpt.INSTANCE.reuseThread());
    }

    public final void LIZ(int i, ViewGroup viewGroup, Object obj, int i2, boolean z, C0IR4 c0ir4, InterfaceC487680JAo interfaceC487680JAo) {
        C0J40 c0j40LIZIZ = this.LIZJ.LLILLL.LIZIZ();
        if (c0j40LIZIZ == null) {
            c0j40LIZIZ = new C0J40();
        }
        c0j40LIZIZ.LIZ = this;
        c0j40LIZIZ.LIZJ = i;
        c0j40LIZIZ.LIZLLL = i2;
        c0j40LIZIZ.LIZIZ = viewGroup;
        c0j40LIZIZ.LJI = c0ir4;
        c0j40LIZIZ.LJII = interfaceC487680JAo;
        c0j40LIZIZ.LJFF = obj;
        c0j40LIZIZ.LJIIIZ = z;
        this.LIZJ.LIZJ(c0j40LIZIZ);
    }
}
