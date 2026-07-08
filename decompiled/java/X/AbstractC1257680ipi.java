package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0ipi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public abstract class AbstractC1257680ipi extends RelativeLayout {
    public final C1257690ipj LL;
    public final List<View> LLILLJJLI;

    public final List<View> getAnimatingViews() {
        return this.LLILLJJLI;
    }

    public final C1257690ipj getAnimationDelegate() {
        return this.LL;
    }

    public final void setAnimationEnabled(boolean z) {
        this.LL.LIZJ = z;
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        super.setSelected(z);
        C1257690ipj c1257690ipj = this.LL;
        c1257690ipj.LIZ.cancel();
        c1257690ipj.LIZIZ.cancel();
        if (c1257690ipj.LIZJ) {
            if (z) {
                c1257690ipj.LIZ.start();
            } else {
                c1257690ipj.LIZIZ.start();
            }
        }
    }

    public AbstractC1257680ipi(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LL = new C1257690ipj();
        this.LLILLJJLI = new ArrayList();
    }
}
