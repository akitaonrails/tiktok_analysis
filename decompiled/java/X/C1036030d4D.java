package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0d4D, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1036030d4D extends FrameLayout {
    public boolean LL;
    public Integer LLILLJJLI;
    public boolean LLILLL;

    public final void setContentReady(boolean z) {
        this.LL = z;
        this.LLILLL = true;
        try {
            if (z) {
                Integer num = this.LLILLJJLI;
                if (num != null && num.intValue() == 0) {
                    super.setVisibility(0);
                    this.LLILLJJLI = null;
                }
            } else {
                super.setVisibility(8);
            }
            this.LLILLL = false;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLILLL = false;
            throw th;
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (this.LLILLL) {
            super.setVisibility(i);
            return;
        }
        if (i == 0) {
            if (!this.LL) {
                this.LLILLJJLI = Integer.valueOf(i);
                return;
            }
        } else if (i == 8) {
            super.setVisibility(i);
            return;
        }
        super.setVisibility(i);
        this.LLILLJJLI = null;
    }

    public C1036030d4D(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }
}
