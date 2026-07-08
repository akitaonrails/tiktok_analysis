package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: renamed from: X.11Fo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19470611Fo extends C19470511Fn {
    public final C1D92 LLLII;

    public C19470611Fo(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        TypedArray typedArrayObtainStyledAttributes = null;
        try {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.AVDmtView);
            int dimension = (int) typedArrayObtainStyledAttributes.getDimension(R$styleable.AVDmtView_itemImgWidth, 0.0f);
            int dimension2 = (int) typedArrayObtainStyledAttributes.getDimension(R$styleable.AVDmtView_itemImgHeight, 0.0f);
            C1D92 c1d92 = new C1D92(context, attributeSet, 4);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dimension, dimension2, 17);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1d92);
            c1d92.setLayoutParams(layoutParams);
            c1d92.setRadius(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
            FrameLayout imgLayout = getImgLayout();
            if (imgLayout != null) {
                imgLayout.addView(c1d92, 0);
            }
            this.LLLII = c1d92;
            typedArrayObtainStyledAttributes.recycle();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (typedArrayObtainStyledAttributes != null) {
                typedArrayObtainStyledAttributes.recycle();
            }
            throw th;
        }
    }
}
