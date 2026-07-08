package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: renamed from: X.19M5, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C19M5 extends AppCompatTextView {
    public C2247981Cyi LLIZLLLIL;

    public final C2247981Cyi getDrawableTextViewParams() {
        return this.LLIZLLLIL;
    }

    public final void setDrawableTextViewParams(C2247981Cyi c2247981Cyi) {
        if (c2247981Cyi != null) {
            C2247951Cyf.LIZ(this, c2247981Cyi);
        } else {
            c2247981Cyi = null;
        }
        this.LLIZLLLIL = c2247981Cyi;
    }

    public C19M5(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.VectorTextView);
            setDrawableTextViewParams(new C2247981Cyi(C1867030ygX.LIZ(typedArrayObtainStyledAttributes.getResourceId(R$styleable.VectorTextView_balloon_drawableStart, Integer.MIN_VALUE)), C1867030ygX.LIZ(typedArrayObtainStyledAttributes.getResourceId(R$styleable.VectorTextView_balloon_drawableEnd, Integer.MIN_VALUE)), C1867030ygX.LIZ(typedArrayObtainStyledAttributes.getResourceId(R$styleable.VectorTextView_balloon_drawableBottom, Integer.MIN_VALUE)), C1867030ygX.LIZ(typedArrayObtainStyledAttributes.getResourceId(R$styleable.VectorTextView_balloon_drawableTop, Integer.MIN_VALUE)), null, null, null, null, C1867030ygX.LIZ(typedArrayObtainStyledAttributes.getResourceId(R$styleable.VectorTextView_balloon_drawablePadding, Integer.MIN_VALUE)), C1867030ygX.LIZ(typedArrayObtainStyledAttributes.getColor(R$styleable.VectorTextView_balloon_drawableTintColor, Integer.MIN_VALUE)), C1867030ygX.LIZ(typedArrayObtainStyledAttributes.getResourceId(R$styleable.VectorTextView_balloon_drawableWidth, Integer.MIN_VALUE)), C1867030ygX.LIZ(typedArrayObtainStyledAttributes.getResourceId(R$styleable.VectorTextView_balloon_drawableHeight, Integer.MIN_VALUE)), C1867030ygX.LIZ(typedArrayObtainStyledAttributes.getResourceId(R$styleable.VectorTextView_balloon_drawableSquareSize, Integer.MIN_VALUE)), 8176));
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
