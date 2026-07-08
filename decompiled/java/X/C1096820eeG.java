package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.android.livesdk.model.message.common.Text;

/* JADX INFO: renamed from: X.0eeG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1096820eeG extends C16F5 {
    public boolean LLJJ;
    public AnonymousClass0956 LLJJI;
    public ValueAnimator LLJJIII;
    public final int LLJJIJI;
    public final String LLJJIJIIJIL;

    public final void LJJJJI() {
        this.LLJJ = false;
        ValueAnimator valueAnimator = this.LLJJIII;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.LLJJIII = null;
        AnonymousClass0956 anonymousClass0956 = this.LLJJI;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLJJI = null;
        setScrollX(C497740JfY.LJJ() ? 1048576 - getWidth() : 0);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        LJJJJI();
    }

    public final void LJJJJIZL(Text text) {
        if (!this.LLJJ) {
            return;
        }
        C1DFH c1dfh = C0PEM.LIZ;
        this.LLJJI = C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C1096810eeF(this, text, null), 3);
    }

    public C1096820eeG(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLJJIJI = (int) C497740JfY.LIZIZ(40.0f);
        this.LLJJIJIIJIL = "               ";
    }
}
