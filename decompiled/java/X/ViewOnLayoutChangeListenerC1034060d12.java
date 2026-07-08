package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AFwS252S0000000_16;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0d12, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class ViewOnLayoutChangeListenerC1034060d12 extends AbstractC1033980d0u implements View.OnLayoutChangeListener, Handler.Callback {
    public final AtomicBoolean LLILZ;
    public View LLILZIL;
    public int LLILZLL;
    public final BPEAHandler LLIZ;

    public final void LJIILJJIL() {
        if (this.LLILZ.compareAndSet(true, false)) {
            View view = this.LLILZIL;
            if (view != null) {
                view.removeOnLayoutChangeListener(this);
            }
            this.LLILZIL = null;
            this.LLILZLL = -1;
            this.LLIZ.removeMessages(1);
        }
    }

    @Override // X.AbstractC1033980d0u
    public final void LJI() {
        super.LJI();
        LJIILJJIL();
    }

    @Override // X.AbstractC1033980d0u
    public final void LIZLLL() {
        LJIILJJIL();
    }

    @Override // X.AbstractC1033980d0u
    public final void LJII() {
        LJIILJJIL();
    }

    public ViewOnLayoutChangeListenerC1034060d12(InterfaceC1034260d1M interfaceC1034260d1M) {
        super(interfaceC1034260d1M);
        this.LLILZ = new AtomicBoolean(false);
        this.LLILZLL = -1;
        this.LLIZ = new BPEAHandler(Looper.getMainLooper(), this);
    }

    @Override // X.AbstractC1033980d0u
    public final void LJIIIZ(int i) {
        View view;
        this.LLILZLL = i;
        if (this.LLILZ.compareAndSet(false, true)) {
            C1033970d0t c1033970d0tLIZIZ = LIZIZ(i);
            if (c1033970d0tLIZIZ == null) {
                this.LLILZ.set(false);
                return;
            }
            Object tag = c1033970d0tLIZIZ.LIZIZ.getTag(R.id.dgg);
            if (tag != null && (tag instanceof View) && (view = (View) tag) != null) {
                this.LLILZIL = view;
                view.addOnLayoutChangeListener(this);
            } else {
                this.LLILZ.set(false);
            }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) throws JSONException {
        int iIntValue;
        C1033970d0t c1033970d0tLIZIZ;
        if (message.what != 1) {
            return false;
        }
        Integer numValueOf = Integer.valueOf(this.LLILZLL);
        if (numValueOf.intValue() == -1 || (c1033970d0tLIZIZ = LIZIZ((iIntValue = numValueOf.intValue()))) == null) {
            return false;
        }
        LJIILIIL(c1033970d0tLIZIZ, iIntValue, AFwS252S0000000_16.get$arr$(520));
        return true;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.LLIZ.removeMessages(1);
        Message messageObtain = Message.obtain();
        messageObtain.what = 1;
        C786410Ut5.LJLJLJ(this.LLIZ, messageObtain, 48L);
    }
}
