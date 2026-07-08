package X;

import android.content.Context;
import android.util.AttributeSet;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0aML, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C931950aML extends C16FS {
    public boolean LLJZIJLIL;
    public int LLL;

    public C931950aML() {
        throw null;
    }

    public final int getButtonStyle() {
        return this.LLL;
    }

    public final void setButtonStyle(int i) {
        this.LLL = i;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (this.LLJZIJLIL) {
            if (isEnabled()) {
                int i = this.LLL;
                if (i == 1) {
                    setTextColor(C497740JfY.LIZLLL(R.attr.c9i, getContext()));
                    return;
                } else if (i == 2) {
                    j0(R.style.a7s);
                    return;
                } else {
                    if (i != 0) {
                        return;
                    }
                    setTextColor(C497740JfY.LIZLLL(R.attr.c9i, getContext()));
                    return;
                }
            }
            int i2 = this.LLL;
            if (i2 == 1) {
                setTextColor(C497740JfY.LIZLLL(R.attr.ezq, getContext()));
            } else if (i2 == 2) {
                j0(R.style.a7u);
            } else {
                if (i2 != 0) {
                    return;
                }
                setTextColor(C497740JfY.LIZLLL(R.attr.ezy, getContext()));
            }
        }
    }

    public final void setViewer(boolean z) {
        this.LLJZIJLIL = z;
    }

    public C931950aML(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }
}
