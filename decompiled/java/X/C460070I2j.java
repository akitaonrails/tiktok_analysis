package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0I2j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C460070I2j extends FrameLayout {
    public final LinearLayout LL;
    public final TuxTextView LLILLJJLI;
    public final FrameLayout LLILLL;
    public final FrameLayout LLILZ;
    public final boolean LLILZIL;
    public int LLILZLL;
    public final Map<FrameLayout, View> LLIZ;

    private final GradientDrawable getContainerBackground() {
        Drawable background = this.LL.getBackground();
        if (background instanceof GradientDrawable) {
            return (GradientDrawable) background;
        }
        return null;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    public final void LIZLLL() {
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        int iLIZIZ = 0;
        if (isSelected()) {
            if (this.LLILZIL) {
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a00, getContext());
                if (numLIZJ == null) {
                    return;
                } else {
                    iIntValue = numLIZJ.intValue();
                }
            } else {
                Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a03, getContext());
                if (numLIZJ2 == null) {
                    return;
                } else {
                    iIntValue = numLIZJ2.intValue();
                }
            }
            if (this.LLILZIL) {
                Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.a0o, getContext());
                if (numLIZJ3 == null) {
                    return;
                } else {
                    iIntValue2 = numLIZJ3.intValue();
                }
            } else {
                Integer numLIZJ4 = C1308910kAL.LIZJ(R.attr.a1h, getContext());
                if (numLIZJ4 == null) {
                    return;
                } else {
                    iIntValue2 = numLIZJ4.intValue();
                }
            }
            Integer numLIZJ5 = C1308910kAL.LIZJ(R.attr.a01, getContext());
            if (numLIZJ5 == null) {
                return;
            } else {
                iIntValue3 = numLIZJ5.intValue();
            }
        } else {
            if (this.LLILZIL) {
                Integer numLIZJ6 = C1308910kAL.LIZJ(R.attr.a03, getContext());
                if (numLIZJ6 == null) {
                    return;
                } else {
                    iIntValue = numLIZJ6.intValue();
                }
            } else {
                iIntValue = 0;
            }
            Integer numLIZJ7 = C1308910kAL.LIZJ(R.attr.a1j, getContext());
            if (numLIZJ7 == null) {
                return;
            }
            iIntValue2 = numLIZJ7.intValue();
            Integer numLIZJ8 = C1308910kAL.LIZJ(R.attr.a01, getContext());
            if (numLIZJ8 == null) {
                return;
            } else {
                iIntValue3 = numLIZJ8.intValue();
            }
        }
        if (!isEnabled()) {
            iIntValue = C460080I2k.LIZ(0.4f, iIntValue);
            iIntValue2 = C460080I2k.LIZ(0.4f, iIntValue2);
            iIntValue3 = C460080I2k.LIZ(0.4f, iIntValue3);
        } else if (isPressed()) {
            Integer numLIZJ9 = C1308910kAL.LIZJ(R.attr.a03, getContext());
            iIntValue = this.LLILZIL ? numLIZJ9 != null ? C2441009hQ.LJIIJ(numLIZJ9.intValue(), iIntValue) : iIntValue : C460080I2k.LIZ(0.5f, iIntValue);
            if (!this.LLILZIL) {
                iIntValue2 = C460080I2k.LIZ(0.5f, iIntValue2);
            }
            iIntValue3 = C460080I2k.LIZ(0.5f, iIntValue3);
        }
        GradientDrawable containerBackground = getContainerBackground();
        if (containerBackground != null) {
            if (iIntValue3 != 0 && !this.LLILZIL) {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(0.5f)));
            }
            containerBackground.setColor(iIntValue);
            containerBackground.setStroke(iLIZIZ, iIntValue3);
            containerBackground.setCornerRadius(C418440Gaw.LIZIZ(16));
        }
        this.LLILLJJLI.setTextColor(iIntValue2);
        TuxIconView tuxIconViewLIZIZ = C460080I2k.LIZIZ(this.LLILLL);
        if (tuxIconViewLIZIZ != null) {
            tuxIconViewLIZIZ.setTintColor(iIntValue2);
        }
        TuxIconView tuxIconViewLIZIZ2 = C460080I2k.LIZIZ(this.LLILZ);
        if (tuxIconViewLIZIZ2 != null) {
            tuxIconViewLIZIZ2.setTintColor(iIntValue2);
        }
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (isHapticFeedbackEnabled()) {
            performHapticFeedback(3);
        }
        return super.performClick();
    }

    public final int getParentWidth$profile_release() {
        return this.LLILZLL;
    }

    public C460070I2j(Context context) {
        super(context);
        C1261170ivL.LIZ.getClass();
        this.LLILZIL = C1261170ivL.LIZ();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setGravity(17);
        linearLayout.setOrientation(0);
        C426750GoL.LJIIL(linearLayout, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), 0, 16);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(16));
        linearLayout.setBackground(gradientDrawable);
        addView(linearLayout, new FrameLayout.LayoutParams(-2, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32))));
        this.LL = linearLayout;
        FrameLayout frameLayout = new FrameLayout(context);
        C786410Ut5.LJZ(8, frameLayout);
        linearLayout.addView(frameLayout, new ViewGroup.LayoutParams(-2, -2));
        this.LLILLL = frameLayout;
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setTuxFont(52);
        tuxTextView.setMinWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)));
        tuxTextView.setMaxWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(208)));
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setMaxLines(1);
        tuxTextView.setTextAlignment(4);
        C786410Ut5.LLLLZLL(tuxTextView, 8);
        linearLayout.addView(tuxTextView, C1229200i5m.LIZIZ(-2, -2, 0, 0, 0, 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), 60));
        this.LLILLJJLI = tuxTextView;
        FrameLayout frameLayout2 = new FrameLayout(context);
        C786410Ut5.LJZ(8, frameLayout2);
        linearLayout.addView(frameLayout2, new ViewGroup.LayoutParams(-2, -2));
        this.LLILZ = frameLayout2;
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
        setPadding(0, iLIZIZ, 0, iLIZIZ);
        setHapticFeedbackEnabled(true);
        LIZLLL();
        this.LLIZ = new LinkedHashMap();
    }

    private final void setLabel(String str) {
        this.LLILLJJLI.setText(str);
        TuxTextView tuxTextView = this.LLILLJJLI;
        int i = 0;
        if (str == null || str.length() == 0) {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, tuxTextView);
    }

    private final void setLeadingIcon(C460090I2l c460090I2l) {
        LIZ(this.LLILLL, c460090I2l);
    }

    private final void setTrailingIcon(C460090I2l c460090I2l) {
        LIZ(this.LLILZ, c460090I2l);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        LIZLLL();
    }

    public final void setParentWidth$profile_release(int i) {
        this.LLILZLL = i;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        super.setPressed(z);
        LIZLLL();
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        super.setSelected(z);
        LIZLLL();
    }

    public final void LIZ(FrameLayout frameLayout, C460090I2l c460090I2l) {
        if (c460090I2l == null) {
            LIZIZ(null, frameLayout);
            return;
        }
        int i = c460090I2l.LIZ;
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        TuxIconView tuxIconViewLIZIZ = C460080I2k.LIZIZ(frameLayout);
        if (tuxIconViewLIZIZ != null) {
            tuxIconViewLIZIZ.setIconRes(i);
        } else {
            tuxIconViewLIZIZ = new TuxIconView(getContext(), null, 0, 6, null);
            C786410Ut5.M6(tuxIconViewLIZIZ, new FrameLayout.LayoutParams(iLIZIZ, iLIZIZ));
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = i;
            c419910GdJ.LIZIZ = iLIZIZ;
            c419910GdJ.LIZJ = iLIZIZ;
            tuxIconViewLIZIZ.setTuxIcon(c419910GdJ);
        }
        LIZIZ(tuxIconViewLIZIZ, frameLayout);
        LIZLLL();
    }

    public final void LIZIZ(TuxIconView tuxIconView, FrameLayout frameLayout) {
        if (this.LLIZ.containsKey(frameLayout) && Intrinsics.LJFF(((LinkedHashMap) this.LLIZ).get(frameLayout), tuxIconView)) {
            return;
        }
        this.LLIZ.put(frameLayout, tuxIconView);
        if (tuxIconView != null) {
            frameLayout.addView(tuxIconView);
            if (getRight() + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)) > this.LLILZLL) {
                ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                C786410Ut5.a6(frameLayout, layoutParams);
                C786410Ut5.LJLLLLLL(0, frameLayout);
                return;
            }
            ViewGroup.LayoutParams layoutParams2 = frameLayout.getLayoutParams();
            layoutParams2.width = 0;
            C786410Ut5.a6(frameLayout, layoutParams2);
            C786410Ut5.LJLLLLLL(0, frameLayout);
            ViewGroup.LayoutParams layoutParams3 = frameLayout.getLayoutParams();
            layoutParams3.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            C786410Ut5.a6(frameLayout, layoutParams3);
            return;
        }
        ViewGroup.LayoutParams layoutParams4 = frameLayout.getLayoutParams();
        layoutParams4.width = 0;
        C786410Ut5.a6(frameLayout, layoutParams4);
        C786410Ut5.LJJJJIZL(frameLayout);
        C786410Ut5.LJLLLLLL(8, frameLayout);
    }

    public final void LIZJ(String str, C460090I2l c460090I2l, C460090I2l c460090I2l2) {
        setLabel(str);
        setLeadingIcon(c460090I2l);
        setTrailingIcon(c460090I2l2);
        setContentDescription(str);
    }
}
