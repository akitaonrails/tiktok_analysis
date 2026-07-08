package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.bytedance.android.live.design.widget.SimpleLiveTextView;

/* JADX INFO: renamed from: X.16Fc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public class C20743416Fc extends SimpleLiveTextView {
    public final void LJJLIIIJJIZ() {
        for (Drawable drawable : getCompoundDrawablesRelative()) {
            if (drawable != null && !drawable.isAutoMirrored()) {
                drawable.mutate();
                drawable.setAutoMirrored(true);
            }
        }
    }

    public final void LJJLIIIJL() {
        for (Drawable drawable : getCompoundDrawables()) {
            if (drawable != null && !drawable.isAutoMirrored()) {
                drawable.mutate();
                drawable.setAutoMirrored(true);
            }
        }
    }

    public C20743416Fc(Context context) {
        super(context, null, 6, 0);
        Drawable background = getBackground();
        if (background != null && !background.isAutoMirrored()) {
            background.mutate();
            background.setAutoMirrored(true);
        }
        LJJLIIIJL();
        LJJLIIIJJIZ();
    }

    @Override // com.bytedance.android.live.design.widget.SimpleLiveTextView
    public final void LJJLIIIIJ(Context context) {
        Drawable background = getBackground();
        if (background != null && !background.isAutoMirrored()) {
            background.mutate();
            background.setAutoMirrored(true);
        }
        LJJLIIIJL();
        LJJLIIIJJIZ();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        Drawable background = getBackground();
        if (background != null && !background.isAutoMirrored()) {
            background.mutate();
            background.setAutoMirrored(true);
        }
    }

    public C20743416Fc(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Drawable background = getBackground();
        if (background != null && !background.isAutoMirrored()) {
            background.mutate();
            background.setAutoMirrored(true);
        }
        LJJLIIIJL();
        LJJLIIIJJIZ();
    }

    public C20743416Fc(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Drawable background = getBackground();
        if (background != null && !background.isAutoMirrored()) {
            background.mutate();
            background.setAutoMirrored(true);
        }
        LJJLIIIJL();
        LJJLIIIJJIZ();
    }

    @Override // com.bytedance.android.live.design.widget.SimpleLiveTextView, androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        LJJLIIIJL();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        LJJLIIIJJIZ();
    }
}
