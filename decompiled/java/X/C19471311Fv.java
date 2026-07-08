package X;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.11Fv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19471311Fv extends FrameLayout {
    public C1322110kVd LL;
    public AppCompatTextView LLILLJJLI;
    public View LLILLL;
    public TuxTextView LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public boolean LLIZ;

    public final int getSelectColor() {
        return this.LLILZIL;
    }

    public final int getUnSelectColor() {
        return this.LLILZLL;
    }

    public C19471311Fv(Context context) {
        C19471411Fw c19471411Fw;
        super(context, null, 0);
        this.LLILZIL = -1;
        this.LLILZLL = -1;
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.cuv, this, true);
        this.LL = (C1322110kVd) viewTd.findViewById(R.id.wy2);
        this.LLILLJJLI = (AppCompatTextView) viewTd.findViewById(R.id.wy6);
        this.LLILLL = viewTd.findViewById(R.id.wy1);
        int iLIZ = C960203pA.LIZ(R.attr.a1r, context);
        View view = this.LLILLL;
        (view == null ? null : view).setBackground(C426580Go4.LIZ(iLIZ, iLIZ, 0));
        AppCompatTextView appCompatTextView = this.LLILLJJLI;
        if (appCompatTextView != null) {
            appCompatTextView.setTextSize(15.0f);
            if (C12VA.LIZ().LIZIZ) {
                if ((appCompatTextView instanceof C19471411Fw) && (c19471411Fw = (C19471411Fw) appCompatTextView) != null) {
                    c19471411Fw.LJJJJ();
                }
            } else {
                appCompatTextView.setTypeface(Typeface.defaultFromStyle(0));
            }
            appCompatTextView.setSingleLine();
            this.LLILZ = (TuxTextView) viewTd.findViewById(R.id.wy0);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
            setLayoutParams(layoutParams);
            int i = C19733712It.LIZIZ;
            this.LLILZIL = i;
            this.LLILZLL = C19733712It.LIZJ(i);
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public final void setItemMarginLR(float f) {
        LinearLayout.LayoutParams layoutParams;
        int iLIZJ = (int) C12ES.LIZJ(f, getContext());
        ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
        if ((layoutParams2 instanceof LinearLayout.LayoutParams) && (layoutParams = (LinearLayout.LayoutParams) layoutParams2) != null) {
            layoutParams.leftMargin = iLIZJ;
            layoutParams.rightMargin = iLIZJ;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
            setLayoutParams(layoutParams);
        }
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        int i;
        C19471411Fw c19471411Fw;
        super.setSelected(z);
        if (z) {
            i = this.LLILZIL;
        } else {
            i = this.LLILZLL;
        }
        AppCompatTextView appCompatTextView = this.LLILLJJLI;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(i);
        }
        C1322110kVd c1322110kVd = this.LL;
        if (c1322110kVd == null) {
            c1322110kVd = null;
        }
        c1322110kVd.setImageAlpha(Color.alpha(i));
        if (!this.LLIZ && C12VA.LIZ().LIZJ) {
            if (z) {
                AppCompatTextView appCompatTextView2 = this.LLILLJJLI;
                if ((appCompatTextView2 instanceof C19471411Fw) && (c19471411Fw = (C19471411Fw) appCompatTextView2) != null) {
                    c19471411Fw.LJJJJ();
                }
                AppCompatTextView appCompatTextView3 = this.LLILLJJLI;
                if (appCompatTextView3 != null) {
                    appCompatTextView3.setTypeface(Typeface.defaultFromStyle(1));
                    return;
                }
                return;
            }
            AppCompatTextView appCompatTextView4 = this.LLILLJJLI;
            if (appCompatTextView4 == null) {
                return;
            }
            appCompatTextView4.setTypeface(Typeface.defaultFromStyle(0));
        }
    }

    public final void setText(String str) {
        if (!TextUtils.isEmpty(str)) {
            AppCompatTextView appCompatTextView = this.LLILLJJLI;
            if (appCompatTextView != null) {
                C786410Ut5.LLILL(appCompatTextView, 0);
            }
            C1322110kVd c1322110kVd = this.LL;
            if (c1322110kVd == null) {
                c1322110kVd = null;
            }
            C786410Ut5.LLZZLLIL(c1322110kVd, 8);
            AppCompatTextView appCompatTextView2 = this.LLILLJJLI;
            if (appCompatTextView2 != null) {
                appCompatTextView2.setText(str);
            }
        }
    }

    public final void setTextPaddingLR(float f) {
        int iLIZJ = (int) C12ES.LIZJ(f, getContext());
        setPadding(iLIZJ, getPaddingTop(), iLIZJ, getPaddingBottom());
    }

    public final void setText(int i) {
        setText(getContext().getResources().getString(i));
    }

    public final void LIZ(int i, int i2) {
        if (!C12VA.LIZ().LIZLLL) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) (C12ES.LJIIJ(getContext()) / 4.5f), -2);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
            setLayoutParams(layoutParams);
        } else if (i == 0) {
            setPadding((int) C12ES.LIZJ(6.0f, getContext()), 0, 0, 0);
        } else {
            if (i != i2 - 1) {
                return;
            }
            setPadding(0, 0, (int) C12ES.LIZJ(6.0f, getContext()), 0);
        }
    }
}
