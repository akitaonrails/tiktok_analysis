package X;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0ejr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1100290ejr extends View {
    public C1100290ejr(Context context) {
        this(context, null, 0);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        if (isInEditMode()) {
            super.draw(canvas);
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        try {
            super.onRestoreInstanceState(parcelable);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public C1100290ejr(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private final int getSize(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == 1073741824) {
            return size;
        }
        return i;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(getSize(getSuggestedMinimumWidth(), i), getSize(getSuggestedMinimumHeight(), i2));
    }

    public C1100290ejr(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
