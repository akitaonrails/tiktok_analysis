package X;

import Y.ARunnableS129S0100000_29;
import Y.ARunnableS40S0101000_29;
import android.content.Context;
import android.media.AudioManager;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.10ne, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19353610ne implements AudioManager.OnAudioFocusChangeListener {
    public final AudioManager LLILLJJLI;
    public final WeakReference<InterfaceC19353710nf> LLILLL;
    public final BPEAHandler LL = new BPEAHandler(Looper.getMainLooper());
    public boolean LLILZ = true;
    public int LLILZIL = 1;
    public boolean LLILZLL = false;
    public final ARunnableS129S0100000_29 LLIZ = new ARunnableS129S0100000_29(this, 129);

    public final void LIZ(int i) {
        InterfaceC19353710nf interfaceC19353710nf = this.LLILLL.get();
        if (interfaceC19353710nf == null) {
            try {
                this.LLILLJJLI.abandonAudioFocus(this);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            this.LL.removeCallbacksAndMessages(null);
            return;
        }
        if (i == -2) {
            this.LLILZLL = false;
            interfaceC19353710nf.onAudioFocusLoss(true);
        } else if (i == 1) {
            this.LLILZLL = true;
            interfaceC19353710nf.onAudioFocusGain(true);
        } else {
            if (i != -1) {
                return;
            }
            this.LLILZLL = false;
            interfaceC19353710nf.onAudioFocusLoss(true);
        }
    }

    public final void LIZIZ(int i) {
        InterfaceC19353710nf interfaceC19353710nf = this.LLILLL.get();
        if (interfaceC19353710nf == null) {
            return;
        }
        this.LLILZIL = i;
        try {
            if (C786410Ut5.q4(this.LLILLJJLI, this, 3, i) == 1) {
                this.LLILZ = true;
                this.LL.removeCallbacksAndMessages(this.LLIZ);
                this.LLILZLL = true;
                interfaceC19353710nf.onAudioFocusGain(false);
                return;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (this.LLILZ) {
            this.LLILZ = false;
            this.LL.removeCallbacksAndMessages(this.LLIZ);
            C786410Ut5.LJLIIL(1000L, this.LL, this.LLIZ);
        } else {
            this.LLILZLL = false;
            interfaceC19353710nf.onAudioFocusLoss(false);
        }
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("change audio:");
        sbLIZ.append(i);
        C2188811AlT.LIZIZ(sbLIZ);
        if (Looper.myLooper() != Looper.getMainLooper()) {
            C786410Ut5.LJJZZIII(this.LL, new ARunnableS40S0101000_29(this, i, 16));
        } else {
            LIZ(i);
        }
    }

    public C19353610ne(Context context, InterfaceC19353710nf interfaceC19353710nf) {
        this.LLILLJJLI = (AudioManager) C786410Ut5.H2(C786410Ut5.N3(context), "audio");
        this.LLILLL = new WeakReference<>(interfaceC19353710nf);
    }
}
