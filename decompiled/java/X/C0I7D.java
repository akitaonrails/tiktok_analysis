package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0I7D, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public class C0I7D extends C21410318qb {
    public C0I7D(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    @Override // android.view.View
    public final void dispatchWindowFocusChanged(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                super.dispatchWindowFocusChanged(z);
                return;
            } catch (SecurityException e) {
                TryCatchGuardChecker.doCheck(e);
                return;
            }
        }
        super.dispatchWindowFocusChanged(z);
    }

    public final void setTuxFont(int i) {
        boolean z;
        Integer numLIZ = C1308910kAL.LIZ(R.attr.du, getContext());
        if (numLIZ != null && numLIZ.intValue() == 0) {
            z = false;
        } else {
            z = true;
        }
        C444900HcW c444900HcWLIZJ = C1697600uHG.LIZJ(i, true, z);
        setTextSize(1, c444900HcWLIZJ.LIZ);
        setTypeface(c444900HcWLIZJ.LIZJ);
    }

    public C0I7D(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TuxEditText, i, 0);
        int i2 = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxEditText_tux_font, 0);
        typedArrayObtainStyledAttributes.recycle();
        setTuxFont(i2);
    }

    @Override // android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                super.onFocusChanged(z, i, rect);
                return;
            } catch (SecurityException e) {
                TryCatchGuardChecker.doCheck(e);
                return;
            }
        }
        super.onFocusChanged(z, i, rect);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C0I7D(Context context, AttributeSet attributeSet, int i, int i2) {
        int i3;
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        if ((i & 4) != 0) {
            i3 = R.attr.xv;
        } else {
            i3 = 0;
        }
        this(context, attributeSet, i3);
    }
}
