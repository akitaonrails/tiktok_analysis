package X;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.bean.TextHeaderBoardTextFontStyleData;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.14vv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20424114vv extends FrameLayout implements InterfaceC20423814vs {
    public final C20743416Fc LL;
    public final View LLILLJJLI;
    public final ImageView LLILLL;
    public ObjectAnimator LLILZ;
    public TextHeaderBoardTextFontStyleData LLILZIL;
    public InterfaceC20423814vs LLILZLL;
    public final Drawable LLIZ;
    public final Drawable LLIZLLLIL;

    public final void LIZIZ() {
        Integer numValueOf;
        TextHeaderBoardTextFontStyleData textHeaderBoardTextFontStyleData = this.LLILZIL;
        if (textHeaderBoardTextFontStyleData == null || (numValueOf = Integer.valueOf(textHeaderBoardTextFontStyleData.LIZIZ)) == null) {
            return;
        }
        if (numValueOf.intValue() == 1) {
            C786410Ut5.LJZI(4, this.LLILLL);
            return;
        }
        if (numValueOf != null) {
            if (numValueOf.intValue() != 3) {
                if (numValueOf.intValue() == 2) {
                    C786410Ut5.LJZI(0, this.LLILLL);
                    ObjectAnimator objectAnimator = this.LLILZ;
                    if (objectAnimator != null) {
                        objectAnimator.cancel();
                    }
                    this.LLILZ = null;
                    C786410Ut5.Cb(this.LLILLL, 0.0f);
                    this.LLILLL.setImageDrawable(C800330VaR.LIZIZ(getContext(), R.drawable.ckr));
                    return;
                }
                return;
            }
            C786410Ut5.LJZI(0, this.LLILLL);
            this.LLILLL.setImageDrawable(C800330VaR.LIZIZ(getContext(), R.drawable.cks));
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.LLILLL, "rotation", 0.0f, 360.0f);
            this.LLILZ = objectAnimatorOfFloat;
            if (objectAnimatorOfFloat != null) {
                objectAnimatorOfFloat.setDuration(800L);
            }
            ObjectAnimator objectAnimator2 = this.LLILZ;
            if (objectAnimator2 != null) {
                objectAnimator2.setRepeatMode(1);
            }
            ObjectAnimator objectAnimator3 = this.LLILZ;
            if (objectAnimator3 != null) {
                objectAnimator3.setRepeatCount(-1);
            }
            ObjectAnimator objectAnimator4 = this.LLILZ;
            if (objectAnimator4 != null) {
                C786410Ut5.Pd(objectAnimator4);
            }
        }
    }

    @Override // X.InterfaceC20423814vs
    public final void LIZJ() {
        TextHeaderBoardTextFontStyleData textHeaderBoardTextFontStyleData = this.LLILZIL;
        if (textHeaderBoardTextFontStyleData != null) {
            textHeaderBoardTextFontStyleData.LIZIZ = 2;
            LIZIZ();
        }
        InterfaceC20423814vs interfaceC20423814vs = this.LLILZLL;
        if (interfaceC20423814vs != null) {
            interfaceC20423814vs.LIZJ();
        }
    }

    public final TextHeaderBoardTextFontStyleData getFontData() {
        return this.LLILZIL;
    }

    public C20424114vv(Context context) throws Throwable {
        super(context, null);
        View viewSd = C786410Ut5.Sd(R.layout.h5a, C972080bP4.LIZ(C786410Ut5.ne(context)), this);
        C20743416Fc c20743416Fc = (C20743416Fc) viewSd.findViewById(R.id.xn8);
        this.LL = c20743416Fc;
        this.LLILLL = (ImageView) viewSd.findViewById(R.id.xn7);
        this.LLILLJJLI = viewSd.findViewById(R.id.txt_bg);
        int iLIZIZ = (int) C497740JfY.LIZIZ(99.0f);
        int iLIZIZ2 = C20736316Cj.LIZIZ(R.attr.afa, context);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(iLIZIZ2);
        float f = iLIZIZ;
        gradientDrawable.setCornerRadius(f);
        this.LLIZ = gradientDrawable;
        int iLIZIZ3 = C20736316Cj.LIZIZ(R.attr.exn, context);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setColor(iLIZIZ3);
        gradientDrawable2.setCornerRadius(f);
        this.LLIZLLLIL = gradientDrawable2;
        c20743416Fc.setTextColor(C20736316Cj.LIZIZ(R.attr.ewy, context));
    }

    private final void setFontDataInternal(TextHeaderBoardTextFontStyleData textHeaderBoardTextFontStyleData) {
        if (textHeaderBoardTextFontStyleData != null) {
            this.LLILZIL = textHeaderBoardTextFontStyleData;
            if (!TextUtils.isEmpty(textHeaderBoardTextFontStyleData.fontDisplayName)) {
                this.LL.setText(textHeaderBoardTextFontStyleData.fontDisplayName);
            }
        }
    }

    public final void LIZLLL(TextHeaderBoardTextFontStyleData textHeaderBoardTextFontStyleData) {
        Typeface typefaceLJ;
        if (textHeaderBoardTextFontStyleData == null) {
            return;
        }
        setFontDataInternal(textHeaderBoardTextFontStyleData);
        TextHeaderBoardTextFontStyleData textHeaderBoardTextFontStyleData2 = this.LLILZIL;
        if (textHeaderBoardTextFontStyleData2 != null && (typefaceLJ = C20424314vx.LJ(textHeaderBoardTextFontStyleData2.fileName)) != null) {
            this.LL.setTypeface(typefaceLJ);
        }
        LIZIZ();
    }

    public final void setDownloadCallback(InterfaceC20423814vs interfaceC20423814vs) {
        this.LLILZLL = interfaceC20423814vs;
    }

    public final void setFontData(TextHeaderBoardTextFontStyleData textHeaderBoardTextFontStyleData) {
        this.LLILZIL = textHeaderBoardTextFontStyleData;
    }

    public final void setTextFontTypeLayoutBackground(int i) {
        Drawable drawable;
        int iLIZIZ;
        if (i == 0 || i != 1) {
            drawable = this.LLIZLLLIL;
            iLIZIZ = C20736316Cj.LIZIZ(R.attr.exp, getContext());
        } else {
            drawable = this.LLIZ;
            iLIZIZ = C20736316Cj.LIZIZ(R.attr.eth, getContext());
        }
        View view = this.LLILLJJLI;
        if (view != null) {
            view.setBackground(drawable);
        }
        this.LL.setTextColor(iLIZIZ);
    }

    @Override // X.InterfaceC20423814vs
    public final void LIZ(TextHeaderBoardTextFontStyleData textHeaderBoardTextFontStyleData, boolean z) throws Throwable {
        Typeface typefaceLJ;
        LIZIZ();
        TextHeaderBoardTextFontStyleData textHeaderBoardTextFontStyleData2 = this.LLILZIL;
        boolean z2 = true;
        boolean z3 = false;
        if (textHeaderBoardTextFontStyleData2 != null && textHeaderBoardTextFontStyleData2.LIZIZ != 1) {
            return;
        }
        InterfaceC20423814vs interfaceC20423814vs = this.LLILZLL;
        if (interfaceC20423814vs != null) {
            if (textHeaderBoardTextFontStyleData2 != null) {
                if (textHeaderBoardTextFontStyleData2.LIZIZ != 1) {
                    z2 = false;
                }
                z3 = z2;
            }
            interfaceC20423814vs.LIZ(textHeaderBoardTextFontStyleData2, z3);
        }
        TextHeaderBoardTextFontStyleData textHeaderBoardTextFontStyleData3 = this.LLILZIL;
        if (textHeaderBoardTextFontStyleData3 != null && (typefaceLJ = C20424314vx.LJ(textHeaderBoardTextFontStyleData3.fileName)) != null) {
            this.LL.setTypeface(typefaceLJ);
        }
    }
}
