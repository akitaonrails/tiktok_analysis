package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS426S0200000_25;

/* JADX INFO: renamed from: X.0sqg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1642680sqg extends LinearLayout {
    public final boolean LL;
    public final C1322110kVd LLILLJJLI;
    public final TextView LLILLL;
    public final C01GW LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public float LLIZ;
    public float LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public final String LLJILJIL;

    private final View getDotView() {
        return (View) this.LLILZ.getValue();
    }

    public final void LIZIZ() {
        int i = this.LLJ ? this.LLILZIL : this.LLILZLL;
        this.LLILLL.setTextColor(i);
        this.LLILLJJLI.setImageAlpha(Color.alpha(i));
    }

    public final void LIZJ() {
        if (!this.LLJI) {
            C19734012Iw.LIZJ(this.LLILLL);
        } else if (!this.LLJ || this.LLJIJIL) {
            this.LLILLL.setTypeface(Typeface.defaultFromStyle(0));
        } else {
            C19734012Iw.LIZJ(this.LLILLL);
            this.LLILLL.setTypeface(Typeface.defaultFromStyle(1));
        }
    }

    private final int getIconHeight() {
        return (int) C11VU.LIZIZ(24.0f, getContext());
    }

    public final boolean getPreloadXml() {
        return this.LL;
    }

    public final int getSelectColor() {
        return this.LLILZIL;
    }

    public final TextView getTextView() {
        return this.LLILLL;
    }

    public final int getUnSelectColor() {
        return this.LLILZLL;
    }

    public final void LIZ(boolean z) {
        int i;
        View dotView = getDotView();
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, dotView);
    }

    public final void LIZLLL(InterfaceC1330440kj4 interfaceC1330440kj4) {
        if (interfaceC1330440kj4 != null && (this.LLILLJJLI.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.LLILLJJLI.getLayoutParams();
            int iconHeight = getIconHeight();
            marginLayoutParams.height = iconHeight;
            marginLayoutParams.width = (int) (interfaceC1330440kj4.getWidth() * (iconHeight / interfaceC1330440kj4.getHeight()));
            this.LLILLJJLI.setAspectRatio(interfaceC1330440kj4.getWidth() / interfaceC1330440kj4.getHeight());
            C786410Ut5.c7(this.LLILLJJLI, marginLayoutParams);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null) {
            AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo).setRoleDescription(this.LLJILJIL);
        }
    }

    public final void setDotColor(int i) {
        View dotView = getDotView();
        C1643380sro c1643380sro = new C1643380sro();
        c1643380sro.LIZLLL(1);
        c1643380sro.LIZIZ(i);
        c1643380sro.LJ(i, 0);
        dotView.setBackground(c1643380sro.LIZ());
    }

    public final void setImage(UrlModel urlModel) {
        setImageVisibility(true);
        C1324750kZt.LJII(this.LLILLJJLI, urlModel, Bitmap.Config.ARGB_8888, true, new C1698460uIe(this, 0));
    }

    public final void setImageVisibility(boolean z) {
        int i;
        C1322110kVd c1322110kVd = this.LLILLJJLI;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LLZZLLIL(c1322110kVd, i);
    }

    public final void setOnlyBoldOnSelection(boolean z) {
        if (z == this.LLJI) {
            return;
        }
        this.LLJI = z;
        LIZJ();
    }

    public final void setSelectColor(int i) {
        if (this.LLILZIL == i) {
            return;
        }
        this.LLILZIL = i;
        if (this.LLJ) {
            LIZIZ();
        }
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        float f;
        super.setSelected(z);
        this.LLJ = z;
        LIZIZ();
        if (this.LLJ) {
            f = this.LLIZ;
        } else {
            f = this.LLIZLLLIL;
        }
        if (this.LLILLL.getTextSize() != f) {
            this.LLILLL.setTextSize(f);
        }
        LIZJ();
    }

    public final void setText(String str) {
        if (!TextUtils.isEmpty(str)) {
            setTextVisibility(true);
            this.LLILLL.setText(str);
        } else {
            setTextVisibility(false);
        }
        setContentDescription(str);
    }

    public final void setTextVisibility(boolean z) {
        int i;
        TextView textView = this.LLILLL;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LLIL(textView, i);
    }

    public final void setUnSelectColor(int i) {
        if (this.LLILZLL == i) {
            return;
        }
        this.LLILZLL = i;
        if (!this.LLJ) {
            LIZIZ();
        }
    }

    public final void setImage(String str) {
        setImageVisibility(true);
        C1324750kZt.LJIIIZ(this.LLILLJJLI, str, -1, -1);
    }

    public final void setText(int i) {
        setText(getContext().getResources().getString(i));
    }

    public final void setImage(int i) {
        setImageVisibility(true);
        this.LLILLJJLI.setImageResource(i);
    }

    public final void setImage(Drawable drawable) {
        setImageVisibility(true);
        this.LLILLJJLI.setImageDrawable(drawable);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1642680sqg(int i, Context context, boolean z) {
        View viewTd;
        super(context, null, 0);
        z = (i & 8) != 0 ? false : z;
        this.LL = z;
        this.LLILZ = C452501pT.LIZIZ(new AwS426S0200000_25(this, context, 128));
        this.LLILZIL = context.getResources().getColor(R.color.a0u);
        this.LLILZLL = context.getResources().getColor(R.color.a0v);
        this.LLIZ = 15.0f;
        this.LLIZLLLIL = 15.0f;
        this.LLJI = true;
        this.LLJILJIL = context.getResources().getString(2131823349);
        if (z) {
            viewTd = C21146717pB.LIZIZ(context, R.layout.fvr, this, true);
        } else {
            viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.fvr, this, true);
        }
        this.LLILLJJLI = (C1322110kVd) viewTd.findViewById(R.id.wy2);
        TextView textView = (TextView) viewTd.findViewById(R.id.wy6);
        this.LLILLL = textView;
        textView.setTextSize(15.0f);
        textView.setImportantForAccessibility(2);
        LIZIZ();
        LIZJ();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
        C1652270t69.LIZIZ(48.0f, 48.0f, textView);
    }
}
