package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Gmp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C425810Gmp extends FrameLayout {
    public final C425780Gmm LL;
    public final C427660Gpo LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public int LLILZIL;

    private final void setSizeDp(int i) {
        this.LLILZIL = i;
        this.LL.setSize(i);
        this.LLILLJJLI.setSize(this.LLILZIL);
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LLILZIL)));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.LL.getLayoutParams();
        layoutParams.width = iLIZIZ;
        layoutParams.height = iLIZIZ;
        C425780Gmm c425780Gmm = this.LL;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c425780Gmm);
        c425780Gmm.setLayoutParams(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.LLILLJJLI.getLayoutParams();
        layoutParams2.width = iLIZIZ;
        layoutParams2.height = iLIZIZ;
        layoutParams2.setMarginStart(iLIZIZ - this.LLILLL);
        C786410Ut5.H6(this.LLILLJJLI, layoutParams2);
        this.LL.setCutoutOffset(iLIZIZ - this.LLILLL);
        this.LL.setGapSize(this.LLILZ);
        requestLayout();
    }

    public final void setGapPx(int i) {
        this.LLILZ = i;
        this.LL.setGapSize(i);
    }

    public final void setOverlapPx(int i) {
        this.LLILLL = i;
        setSizeDp(this.LLILZIL);
    }

    public final void setSize(int i) {
        setSizeDp(i);
    }

    public C425810Gmp(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
        this.LLILZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
        this.LLILZIL = 72;
        C425780Gmm c425780Gmm = new C425780Gmm(context, null, R.attr.xh);
        this.LL = c425780Gmm;
        C427660Gpo c427660Gpo = new C427660Gpo(context, null, R.attr.xh);
        this.LLILLJJLI = c427660Gpo;
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iLIZIZ, iLIZIZ);
        layoutParams.gravity = 8388627;
        addView(c425780Gmm, layoutParams);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(iLIZIZ, iLIZIZ);
        layoutParams2.gravity = 8388627;
        layoutParams2.setMarginStart(iLIZIZ - this.LLILLL);
        addView(c427660Gpo, layoutParams2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.PoiDualAvatarView, 0, 0);
        setSizeDp(typedArrayObtainStyledAttributes.getInt(R$styleable.PoiDualAvatarView_poi_dualAvatarSize, 72));
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void LIZ(UrlModel urlModel, UrlModel urlModel2) {
        if (urlModel != null) {
            ImageUrlModel imageUrlModelLIZ = C438710HIf.LIZ(urlModel);
            C425780Gmm c425780Gmm = this.LL;
            c425780Gmm.LLL = true;
            c425780Gmm.invalidate();
            C427660Gpo.LJIIJJI(this.LL, imageUrlModelLIZ, true, null, null, false, false, null, null, false, null, 768);
            C425780Gmm c425780Gmm2 = this.LL;
            int visibility = c425780Gmm2.getVisibility();
            c425780Gmm2.setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, c425780Gmm2);
        } else {
            C425780Gmm c425780Gmm3 = this.LL;
            int visibility2 = c425780Gmm3.getVisibility();
            c425780Gmm3.setVisibility(8);
            C1602160rnK.LIZIZ(visibility2, 8, c425780Gmm3);
        }
        if (urlModel2 != null) {
            C427660Gpo.LJIIJJI(this.LLILLJJLI, C438710HIf.LIZ(urlModel2), true, null, null, false, true, null, null, false, null, 768);
            C786410Ut5.LLLLLJIL(this.LLILLJJLI, 0);
            C786410Ut5.LLLLLJIL(this.LLILLJJLI, 0);
        } else {
            C786410Ut5.LLLLLJIL(this.LLILLJJLI, 8);
        }
        if (urlModel == null) {
            if (urlModel2 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.LLILLJJLI.getLayoutParams();
                marginLayoutParams.setMarginStart(0);
                C786410Ut5.H6(this.LLILLJJLI, marginLayoutParams);
                return;
            }
            return;
        }
        if (urlModel2 == null) {
            return;
        }
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LLILZIL)));
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.LLILLJJLI.getLayoutParams();
        marginLayoutParams2.setMarginStart(iLIZIZ - this.LLILLL);
        C786410Ut5.H6(this.LLILLJJLI, marginLayoutParams2);
    }
}
