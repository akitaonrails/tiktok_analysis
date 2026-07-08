package X;

import Y.ARunnableS116S0100000_16;
import android.os.Looper;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;

/* JADX INFO: renamed from: X.0bsy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public abstract class AbstractC990620bsy extends ClickableSpan {
    public static final BPEAHandler LLILZ = new BPEAHandler(Looper.getMainLooper());
    public final long LL = 500;
    public boolean LLILLJJLI = true;
    public final ARunnableS116S0100000_16 LLILLL = new ARunnableS116S0100000_16(this, 262);

    public abstract void LIZ();

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
    }

    public AbstractC990620bsy(int i) {
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        if (this.LLILLJJLI) {
            this.LLILLJJLI = false;
            C786410Ut5.LJLIIL(this.LL, LLILZ, this.LLILLL);
            LIZ();
        }
    }
}
