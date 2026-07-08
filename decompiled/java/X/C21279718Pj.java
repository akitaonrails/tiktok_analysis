package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.18Pj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21279718Pj extends RelativeLayout {
    public final Context LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;

    public C21279718Pj(Context context) {
        this(context, null, 6);
    }

    public C21279718Pj(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final int getDescId() {
        return R.id.tjq;
    }

    public final int getImageId() {
        return R.id.tjs;
    }

    private final RelativeLayout getMContentView() {
        return (RelativeLayout) this.LLILLL.getValue();
    }

    private final TuxTextView getMDescTextView() {
        return (TuxTextView) this.LLILZ.getValue();
    }

    private final ImageView getMImageView() {
        return (ImageView) this.LLILZIL.getValue();
    }

    public final View getMRootView() {
        return (View) this.LLILLJJLI.getValue();
    }

    public final ViewGroup.LayoutParams getDescViewParams() {
        return getMDescTextView().getLayoutParams();
    }

    public final ViewGroup.LayoutParams getImageViewParams() {
        return getMImageView().getLayoutParams();
    }

    public final ViewGroup.LayoutParams getTagViewParams() {
        return getMContentView().getLayoutParams();
    }

    public final void LIZ(C21279618Pi c21279618Pi) {
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        int iIntValue4;
        int iIntValue5;
        int iIntValue6;
        int iIntValue7;
        int iIntValue8;
        int iIntValue9;
        if (TextUtils.isEmpty(c21279618Pi.LIZ)) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = c21279618Pi.LJIILLIIL;
        if (layoutParams != null) {
            C786410Ut5.e6(getMContentView(), layoutParams);
        }
        RelativeLayout.LayoutParams layoutParams2 = c21279618Pi.LJIIZILJ;
        if (layoutParams2 != null) {
            C786410Ut5.c6(getMImageView(), layoutParams2);
        }
        Integer num = c21279618Pi.LJIJ;
        int iIntValue10 = 0;
        if (num != null) {
            int iIntValue11 = num.intValue();
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) getDescViewParams();
            RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) getImageViewParams();
            layoutParams3.addRule(1, 0);
            if (iIntValue11 != 1 && iIntValue11 != 2) {
                layoutParams3.addRule(14);
                layoutParams4.addRule(14);
            } else {
                layoutParams3.addRule(15);
                layoutParams4.addRule(15);
            }
            if (iIntValue11 != 1) {
                if (iIntValue11 != 2) {
                    if (iIntValue11 != 3) {
                        if (iIntValue11 == 4) {
                            layoutParams4.addRule(3, getDescId());
                            Integer num2 = c21279618Pi.LJIJI;
                            if (num2 != null) {
                                iIntValue9 = num2.intValue();
                            } else {
                                iIntValue9 = 0;
                            }
                            layoutParams4.topMargin = iIntValue9;
                        }
                    } else {
                        layoutParams3.addRule(3, getImageId());
                        Integer num3 = c21279618Pi.LJIJI;
                        if (num3 != null) {
                            iIntValue8 = num3.intValue();
                        } else {
                            iIntValue8 = 0;
                        }
                        layoutParams3.topMargin = iIntValue8;
                    }
                } else {
                    Context context = getMImageView().getContext();
                    if (context != null && C426750GoL.LIZLLL(context)) {
                        layoutParams4.addRule(0, getDescId());
                        Integer num4 = c21279618Pi.LJIJI;
                        if (num4 != null) {
                            iIntValue7 = num4.intValue();
                        } else {
                            iIntValue7 = 0;
                        }
                        layoutParams4.rightMargin = iIntValue7;
                    } else {
                        layoutParams4.addRule(1, getDescId());
                        Integer num5 = c21279618Pi.LJIJI;
                        if (num5 != null) {
                            iIntValue6 = num5.intValue();
                        } else {
                            iIntValue6 = 0;
                        }
                        layoutParams4.leftMargin = iIntValue6;
                    }
                }
            } else {
                Context context2 = getMDescTextView().getContext();
                if (context2 != null && C426750GoL.LIZLLL(context2)) {
                    layoutParams3.addRule(0, getImageId());
                    Integer num6 = c21279618Pi.LJIJI;
                    if (num6 != null) {
                        iIntValue5 = num6.intValue();
                    } else {
                        iIntValue5 = 0;
                    }
                    layoutParams3.rightMargin = iIntValue5;
                } else {
                    layoutParams3.addRule(1, getImageId());
                    Integer num7 = c21279618Pi.LJIJI;
                    if (num7 != null) {
                        iIntValue4 = num7.intValue();
                    } else {
                        iIntValue4 = 0;
                    }
                    layoutParams3.leftMargin = iIntValue4;
                }
            }
            C786410Ut5.R6(getMDescTextView(), layoutParams3);
            C786410Ut5.c6(getMImageView(), layoutParams4);
        }
        if (c21279618Pi.LJIIIIZZ != null || c21279618Pi.LJIIIZ != null) {
            RelativeLayout.LayoutParams layoutParams5 = (RelativeLayout.LayoutParams) getTagViewParams();
            Integer num8 = c21279618Pi.LJIIIIZZ;
            if (num8 != null) {
                layoutParams5.width = num8.intValue();
            }
            Integer num9 = c21279618Pi.LJIIIZ;
            if (num9 != null) {
                layoutParams5.height = num9.intValue();
            }
            C786410Ut5.e6(getMContentView(), layoutParams5);
        }
        getMDescTextView().setText(c21279618Pi.LIZ);
        Integer num10 = c21279618Pi.LIZIZ;
        if (num10 != null) {
            getMDescTextView().setTextColor(num10.intValue());
        }
        Float f = c21279618Pi.LIZJ;
        if (f != null) {
            getMDescTextView().setTextSize(f.floatValue());
        }
        Integer num11 = c21279618Pi.LIZLLL;
        if (num11 != null) {
            getMDescTextView().setTuxFont(num11.intValue());
        }
        TextUtils.TruncateAt truncateAt = c21279618Pi.LJ;
        if (truncateAt != null) {
            getMDescTextView().setEllipsize(truncateAt);
        }
        Integer num12 = c21279618Pi.LJFF;
        if (num12 != null) {
            getMDescTextView().setMaxLines(num12.intValue());
        }
        Integer num13 = c21279618Pi.LJIILJJIL;
        if (num13 != null) {
            getMImageView().setImageResource(num13.intValue());
            C786410Ut5.LJZI(0, getMImageView());
        }
        Drawable drawable = c21279618Pi.LJIILL;
        if (drawable != null) {
            getMImageView().setImageDrawable(drawable);
            C786410Ut5.LJZI(0, getMImageView());
        }
        if (c21279618Pi.LJI != null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            Integer num14 = c21279618Pi.LJI;
            if (num14 != null) {
                gradientDrawable.setColor(num14.intValue());
            }
            Float f2 = c21279618Pi.LJII;
            if (f2 != null) {
                gradientDrawable.setCornerRadius(f2.floatValue());
            }
            getMContentView().setBackground(gradientDrawable);
        }
        if (c21279618Pi.LJIIL == null && c21279618Pi.LJIILIIL == null && c21279618Pi.LJIIJ == null && c21279618Pi.LJIIJJI == null) {
            return;
        }
        RelativeLayout mContentView = getMContentView();
        Integer num15 = c21279618Pi.LJIIJ;
        if (num15 != null) {
            iIntValue = num15.intValue();
        } else {
            iIntValue = 0;
        }
        Integer num16 = c21279618Pi.LJIIL;
        if (num16 != null) {
            iIntValue2 = num16.intValue();
        } else {
            iIntValue2 = 0;
        }
        Integer num17 = c21279618Pi.LJIIJJI;
        if (num17 != null) {
            iIntValue3 = num17.intValue();
        } else {
            iIntValue3 = 0;
        }
        Integer num18 = c21279618Pi.LJIILIIL;
        if (num18 != null) {
            iIntValue10 = num18.intValue();
        }
        mContentView.setPaddingRelative(iIntValue, iIntValue2, iIntValue3, iIntValue10);
    }

    public C21279718Pj(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        new LinkedHashMap();
        super(context, attributeSet, 0);
        this.LL = context;
        this.LLILLJJLI = C452501pT.LIZIZ(new C21280218Po(this));
        this.LLILLL = C452501pT.LIZIZ(new C21280418Pq(this));
        this.LLILZ = C452501pT.LIZIZ(new C21280318Pp(this));
        this.LLILZIL = C452501pT.LIZIZ(new C21280518Pr(this));
    }
}
