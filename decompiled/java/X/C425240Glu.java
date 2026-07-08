package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: renamed from: X.0Glu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C425240Glu extends RecyclerView {
    public int LL;
    public int LLILLJJLI;
    public int LLILLL;

    public final void setSecondPanel(boolean z) {
        if (z) {
            int iLIZIZ = C19733712It.LIZIZ(false, z, false, false);
            setBackground(C426580Go4.LIZJ(iLIZIZ, iLIZIZ, 0, 0));
        }
    }

    public C425240Glu(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C425240Glu(Context context, AttributeSet attributeSet, int i) {
        Drawable drawableLIZ;
        super(context, attributeSet, i);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.AVDmtView);
            boolean z = typedArrayObtainStyledAttributes.getBoolean(R$styleable.AVDmtView_isChangeColor, false);
            this.LL = (int) typedArrayObtainStyledAttributes.getDimension(R$styleable.AVDmtView_itemMargin, 0.0f);
            this.LLILLJJLI = (int) typedArrayObtainStyledAttributes.getDimension(R$styleable.AVDmtView_firstItemMargin, 0.0f);
            this.LLILLL = (int) typedArrayObtainStyledAttributes.getDimension(R$styleable.AVDmtView_lastItemMargin, 0.0f);
            boolean z2 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.AVDmtView_itemShowBorder, true);
            int iLIZJ = (int) C12ES.LIZJ(2.0f, context);
            if (z2) {
                int i2 = this.LL;
                if (i2 > 0) {
                    this.LL = i2 - (iLIZJ * 2);
                }
                int i3 = this.LLILLJJLI;
                if (i3 > 0) {
                    this.LLILLJJLI = i3 - iLIZJ;
                }
                int i4 = this.LLILLL;
                if (i4 > 0) {
                    this.LLILLL = i4 - iLIZJ;
                }
            }
            if (z && (drawableLIZ = C19733712It.LIZ(context, attributeSet)) != null) {
                setBackground(drawableLIZ);
            }
            addItemDecoration(new C0IDF(this, 6));
        }
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC438390HGz());
    }
}
