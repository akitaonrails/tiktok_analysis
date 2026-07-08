package X;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: renamed from: X.12MC, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12MC extends C12ME {
    public ClipDrawable LLJJIJI;

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.widget.ProgressBar
    public void setProgress(int i) {
        super.setProgress(i);
        ClipDrawable clipDrawable = this.LLJJIJI;
        if (clipDrawable != null) {
            clipDrawable.setLevel((i * 10000) / getMax());
        }
    }

    public C12MC(Context context, AttributeSet attributeSet) {
        boolean z;
        int dimension;
        int dimension2;
        int dimension3;
        super(context, attributeSet, R.attr.seekBarStyle);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.AVDmtView);
            dimension = (int) typedArrayObtainStyledAttributes.getDimension(R$styleable.AVDmtView_roundRadius, 0.0f);
            dimension3 = (int) typedArrayObtainStyledAttributes.getDimension(R$styleable.AVDmtView_thumbWidth, 0.0f);
            dimension2 = (int) typedArrayObtainStyledAttributes.getDimension(R$styleable.AVDmtView_thumbHeight, 0.0f);
            z = typedArrayObtainStyledAttributes.getBoolean(R$styleable.AVDmtView_textChangeColor, false);
        } else {
            z = false;
            dimension = 0;
            dimension2 = 0;
            dimension3 = 0;
        }
        int i = C19733712It.LIZIZ;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(i);
        gradientDrawable.setStroke(0, i);
        gradientDrawable.setSize(dimension3, dimension2);
        setThumb(gradientDrawable);
        setSplitTrack(true);
        int iLIZ = C960203pA.LIZ(com.zhiliaoapp.musically.R.attr.a04, getContext());
        ClipDrawable clipDrawable = new ClipDrawable(C426580Go4.LIZJ(iLIZ, iLIZ, 0, dimension), 3, 1);
        this.LLJJIJI = clipDrawable;
        clipDrawable.setLevel((getProgress() * 10000) / getMax());
        int iLIZ2 = C960203pA.LIZ(com.zhiliaoapp.musically.R.attr.ei, getContext());
        setProgressDrawable(new LayerDrawable(new Drawable[]{C426580Go4.LIZJ(iLIZ2, iLIZ2, 0, dimension), this.LLJJIJI}));
        if (z) {
            setTextColor((16777215 & i) | Integer.MIN_VALUE);
        }
    }
}
