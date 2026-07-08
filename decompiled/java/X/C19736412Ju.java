package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.12Ju, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public class C19736412Ju extends AppCompatImageView {
    public boolean LL;
    public boolean LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public int LLILZLL;

    public C19736412Ju(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
    }

    public final void LIZ(Drawable drawable) {
        if (this.LL) {
            super.setImageDrawable(C19734012Iw.LIZLLL(drawable, this.LLILZLL));
        } else {
            super.setImageDrawable(drawable);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    public final void setDefaultTintColor(int i) {
        this.LLILLL = i;
    }

    public final void setEnableSelectionTint(boolean z) {
        this.LLILLJJLI = z;
        if (!z) {
            this.LLILZLL = this.LLILLL;
        }
    }

    public final void setEnableTint(boolean z) {
        boolean z2 = this.LL;
        this.LL = z;
        if (!z2 && z) {
            LIZ(getDrawable());
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        LIZ(drawable);
    }

    public final void setSelectTintColor(int i) {
        this.LLILZ = i;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setSelected(boolean z) {
        int i;
        super.setSelected(z);
        if (this.LLILLJJLI) {
            if (z) {
                i = this.LLILZ;
            } else {
                i = this.LLILZIL;
            }
            this.LLILZLL = i;
            LIZ(getDrawable());
        }
    }

    public final void setUnSelectTintColor(int i) {
        this.LLILZIL = i;
    }

    public C19736412Ju(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ToolsStyleView);
            this.LL = typedArrayObtainStyledAttributes.getBoolean(R$styleable.ToolsStyleView_ts_enable_tint_color, true);
            this.LLILLJJLI = typedArrayObtainStyledAttributes.getBoolean(R$styleable.ToolsStyleView_ts_enable_selection_tint_color, true);
            this.LLILLL = typedArrayObtainStyledAttributes.getColor(R$styleable.ToolsStyleView_ts_tint_color, context.getResources().getColor(R.color.a0u));
            this.LLILZ = typedArrayObtainStyledAttributes.getColor(R$styleable.ToolsStyleView_ts_tint_color_selected, context.getResources().getColor(R.color.a0u));
            this.LLILZIL = typedArrayObtainStyledAttributes.getColor(R$styleable.ToolsStyleView_ts_tint_color_unselected, context.getResources().getColor(R.color.a0v));
            typedArrayObtainStyledAttributes.recycle();
        } else {
            this.LL = true;
            this.LLILLJJLI = true;
            this.LLILLL = context.getResources().getColor(R.color.a0u);
            this.LLILZ = context.getResources().getColor(R.color.a0u);
            this.LLILZIL = context.getResources().getColor(R.color.a0v);
        }
        this.LLILZLL = this.LLILLL;
        if (this.LL) {
            LIZ(getDrawable());
        }
    }

    public /* synthetic */ C19736412Ju(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
