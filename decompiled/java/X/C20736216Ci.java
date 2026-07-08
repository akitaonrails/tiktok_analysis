package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: renamed from: X.16Ci, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public class C20736216Ci extends C16FY {
    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
    }

    @Override // X.C16FY, androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    public C20736216Ci(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C20736216Ci(Context context, AttributeSet attributeSet, int i) {
        int iLJII;
        super(context, attributeSet, 0);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.LiveIllustrationView, 0, 0);
        Context context2 = getContext();
        int i2 = R$styleable.LiveIllustrationView_illustration;
        if (typedArrayObtainStyledAttributes.hasValue(i2)) {
            TypedValue typedValueLIZ = C20736316Cj.LIZ();
            typedArrayObtainStyledAttributes.getValue(i2, typedValueLIZ);
            if (typedValueLIZ.type == 2) {
                iLJII = C20736316Cj.LJII(C011Z.LIZ.LJII(), typedValueLIZ.data, context2);
            } else {
                iLJII = typedValueLIZ.resourceId;
            }
            if (iLJII != -1) {
                C0HTI c0hti = new C0HTI();
                c0hti.LIZ = iLJII;
                setImageDrawable(c0hti.LIZ(getContext()));
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
