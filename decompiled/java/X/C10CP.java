package X;

import android.content.res.TypedArray;
import android.view.View;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.10CP, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10CP {
    public final View LIZ;
    public Boolean LIZIZ;
    public Boolean LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final int LJI;

    public C10CP(View view) {
        this.LIZ = view;
        TypedArray typedArrayObtainStyledAttributes = view.getContext().obtainStyledAttributes(null, R$styleable.TuxTextCell, R.attr.z2, 0);
        this.LJ = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxTextCell__tux_textCellBackgroundColor, -1);
        this.LIZLLL = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TuxTextCell__tux_textCellBackgroundRadius, -1);
        this.LJFF = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TuxTextCell__tux_textCellBackgroundPaddingTopBottom, -1);
        this.LJI = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TuxTextCell__tux_textCellBackgroundPaddingStartEnd, -1);
        typedArrayObtainStyledAttributes.recycle();
    }
}
