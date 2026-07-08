package X;

import android.content.Context;
import android.content.res.TypedArray;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.15nl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20628315nl {
    public static final /* synthetic */ int LJ = 0;
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final boolean LIZLLL;

    public C20628315nl(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, R$styleable.SkeletonBaseProps, R.attr.yr, 0);
        this.LIZ = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SkeletonBaseProps_tux_skeletonRadius, 0);
        int i = R$styleable.SkeletonBaseProps_tux_skeletonPlaceholderColor;
        C450710Hlt.LIZ(typedArrayObtainStyledAttributes, i);
        int color = typedArrayObtainStyledAttributes.getColor(i, 0);
        this.LIZIZ = color;
        this.LIZJ = typedArrayObtainStyledAttributes.getColor(R$styleable.SkeletonBaseProps_tux_skeletonPulsingColor, color);
        this.LIZLLL = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SkeletonBaseProps_tux_skeletonLoading, false);
        typedArrayObtainStyledAttributes.recycle();
    }
}
