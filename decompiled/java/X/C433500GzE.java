package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.HorizontalScrollView;
import com.bytedance.bpea.transmit.hook.HandlerHook;

/* JADX INFO: renamed from: X.0GzE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C433500GzE extends HorizontalScrollView {
    public final void LIZ(final View view) {
        if (getWidth() == 0) {
            HandlerHook.viewPostDelay(this, new Runnable() { // from class: X.0GzF
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("DmtAutoCenterScrollView@2bec.onClicked$1");
                    try {
                        this.smoothScrollTo(((view.getLeft() + view.getRight()) / 2) - (this.getWidth() / 2), 0);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("DmtAutoCenterScrollView@2bec.onClicked$1");
                }
            }, 100L);
        } else {
            smoothScrollTo(((view.getLeft() + view.getRight()) / 2) - (getWidth() / 2), 0);
        }
    }

    public C433500GzE(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOverScrollMode(2);
    }
}
