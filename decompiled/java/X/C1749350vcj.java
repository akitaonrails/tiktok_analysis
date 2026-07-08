package X;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import g1c.AjS11S0101000_26;
import g1c.AjS6S0201000_26;

/* JADX INFO: renamed from: X.0vcj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1749350vcj extends AbstractC1729606py {
    public static final int LLJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(100));
    public static final int LLJIJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
    public static final int LLJILJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
    public static final int LLJILJILJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(9));
    public final SmartImageView LL;
    public final View LLILLJJLI;
    public final TuxTextView LLILLL;
    public final TuxTextView LLILZ;
    public final ViewGroup LLILZIL;
    public final View LLILZLL;
    public final TuxIconView LLIZ;
    public TuxTextView LLIZLLLIL;
    public String LLJ;

    public final View getGalleryView() {
        return this.LLIZ;
    }

    public /* synthetic */ C1749350vcj(Context context) {
        this(context, null, 0);
    }

    private final void setTextStyle(boolean z) {
        Integer numLIZJ;
        if (z) {
            numLIZJ = C1308910kAL.LIZJ(R.attr.a1q, getContext());
        } else {
            numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, getContext());
        }
        if (numLIZJ != null) {
            numLIZJ.intValue();
            this.LLILLL.setTextColor(numLIZJ.intValue());
        }
    }

    public final void n0(int i) {
        int iLIZIZ;
        if (i == EnumC1749360vck.SPLITTHREE.getValue()) {
            iLIZIZ = ((C1743690vTb.LIZIZ() - (LLJILJIL * 2)) - (LLJIJIL * 2)) / 3;
        } else if (i == EnumC1749360vck.PERCENT.getValue()) {
            iLIZIZ = (int) (((double) (C1743690vTb.LIZIZ() - LLJILJIL)) * 0.277d);
        } else {
            iLIZIZ = LLJI;
        }
        if (iLIZIZ > 0) {
            SmartImageView smartImageView = this.LL;
            ViewGroup.LayoutParams layoutParams = smartImageView.getLayoutParams();
            layoutParams.height = iLIZIZ;
            C786410Ut5.G6(smartImageView, layoutParams);
            ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
            layoutParams2.width = iLIZIZ;
            layoutParams2.height = -2;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
            setLayoutParams(layoutParams2);
        }
    }

    public final void setBenefitTextViewHeight(int i) {
        if (this.LLILZ.getLayoutParams().height != i) {
            TuxTextView tuxTextView = this.LLILZ;
            ViewGroup.LayoutParams layoutParams = tuxTextView.getLayoutParams();
            layoutParams.height = i;
            C786410Ut5.R6(tuxTextView, layoutParams);
        }
    }

    @Override // X.AbstractC1729606py
    public void setChildViewAlpha(float f) {
        C786410Ut5.u5(this.LL, f);
        C786410Ut5.B5(this.LLILLL, f);
        C786410Ut5.B5(this.LLILZ, f);
        TuxTextView tuxTextView = this.LLIZLLLIL;
        if (tuxTextView != null) {
            C786410Ut5.B5(tuxTextView, f);
        }
    }

    public final void setSpecTextContainerHeight(int i) {
        int i2 = this.LLILZIL.getLayoutParams().height;
        int i3 = LLJILJILJ;
        if (i2 != i + i3) {
            ViewGroup viewGroup = this.LLILZIL;
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            layoutParams.height = i + i3;
            C786410Ut5.X5(layoutParams, viewGroup);
        }
    }

    public final void setSpecTextMaxLines(int i) {
        if (i != this.LLILLL.getMaxLines()) {
            this.LLILLL.setMaxLines(i);
        }
    }

    public final void setSpecTextViewHeight(int i) {
        if (this.LLILLL.getLayoutParams().height != i) {
            TuxTextView tuxTextView = this.LLILLL;
            ViewGroup.LayoutParams layoutParams = tuxTextView.getLayoutParams();
            layoutParams.height = i;
            C786410Ut5.R6(tuxTextView, layoutParams);
        }
    }

    public final void setTextMaxWidth(int i) {
        if (this.LLILLL.getMaxWidth() != i) {
            this.LLILLL.setMaxWidth(i);
            this.LLILZ.setMaxWidth(i);
        }
    }

    @Override // X.AbstractC1729606py
    public final void i0(boolean z, boolean z2) {
        h0(this.LLILZLL, z, z2, C418440Gaw.LIZIZ(8), C418440Gaw.LIZIZ(4), C418440Gaw.LIZIZ(4));
        setTextStyle(z2);
    }

    public C1749350vcj(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(LLJI, -2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
        C991303uB.LIZ(context, R.layout.ayv, this, true);
        this.LL = (SmartImageView) findViewById(R.id.vgs);
        this.LLILLL = (TuxTextView) findViewById(R.id.vh0);
        this.LLILZ = (TuxTextView) findViewById(R.id.vgp);
        this.LLILZIL = (ViewGroup) findViewById(R.id.vgz);
        this.LLILZLL = findViewById(R.id.vgq);
        TuxIconView tuxIconView = (TuxIconView) findViewById(R.id.vgt);
        this.LLIZ = tuxIconView;
        View viewFindViewById = findViewById(R.id.vgu);
        this.LLILLJJLI = viewFindViewById;
        GradientDrawable gradientDrawable = new GradientDrawable();
        float fLIZIZ = C418440Gaw.LIZIZ(8);
        gradientDrawable.setCornerRadii(new float[]{fLIZIZ, fLIZIZ, fLIZIZ, fLIZIZ, 0.0f, 0.0f, 0.0f, 0.0f});
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.fr, context);
        if (numLIZJ != null) {
            gradientDrawable.setColor(numLIZJ.intValue());
        }
        viewFindViewById.setBackground(gradientDrawable);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
        c419910GdJ.LIZ = R.raw.icon_arrow_up_right_and_arrow_down_left;
        c419910GdJ.LJ = Integer.valueOf(R.attr.zi);
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(getContext());
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
        c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.ze);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(200));
        tuxIconView.setImageDrawable(C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(getContext())));
    }

    public final void j0(boolean z, boolean z2, int i, InterfaceC1749380vcm interfaceC1749380vcm) {
        i0(z, z2);
        if (interfaceC1749380vcm != null) {
            C786410Ut5.I7(new AjS11S0101000_26(interfaceC1749380vcm, i, 0), this);
            C786410Ut5.I7(new AjS6S0201000_26(interfaceC1749380vcm, this, i, 0), this.LLIZ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b2 A[PHI: r4
      0x00b2: PHI (r4v6 java.lang.String) = (r4v2 java.lang.String), (r4v3 java.lang.String), (r4v5 java.lang.String), (r4v8 java.lang.String) binds: [B:37:0x00a8, B:40:0x00b0, B:34:0x00a0, B:30:0x0092] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ba A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l0(com.ss.android.ugc.aweme.ecommerce.service.vo.Image r20, java.lang.String r21, com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropTag r22, int r23) {
        /*
            Method dump skipped, instruction units count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1749350vcj.l0(com.ss.android.ugc.aweme.ecommerce.service.vo.Image, java.lang.String, com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropTag, int):void");
    }
}
