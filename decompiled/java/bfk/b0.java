package bfk;

import X.C01GW;
import X.C0AUH;
import X.C0CHQ;
import X.C1295960jpS;
import X.C12ES;
import X.C1308910kAL;
import X.C446980Hfs;
import X.C786410Ut5;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes26.dex */
public class b0 extends ConstraintLayout {
    public TextView LL;
    public TextView LLILLJJLI;
    public C1295960jpS LLILLL;
    public TuxIconView LLILZ;
    public ViewGroup LLILZIL;
    public boolean LLILZLL;
    public final int LLIZ;
    public final int LLIZLLLIL;
    public final int LLJ;

    public b0() {
        throw null;
    }

    public final void e0() {
        this.LL.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
    }

    public View getContentView() {
        C1295960jpS c1295960jpS = this.LLILLL;
        return (c1295960jpS == null || c1295960jpS.getVisibility() != 0) ? this.LL : this.LLILLL;
    }

    public CharSequence getTagText() {
        return this.LLILLJJLI.getText();
    }

    public C1295960jpS getLottieView() {
        return this.LLILLL;
    }

    public TextView getTextView() {
        return this.LL;
    }

    public b0(Context context) {
        this(context, 0);
    }

    public final void h0(int i) {
        int paddingTop;
        int iLIZJ = (int) C12ES.LIZJ(12, getContext());
        TextView textView = this.LL;
        int iLIZJ2 = (int) C12ES.LIZJ(12, getContext());
        if (i != -1) {
            paddingTop = (int) C12ES.LIZJ(i, getContext());
        } else {
            paddingTop = this.LL.getPaddingTop();
        }
        textView.setPadding(iLIZJ2, paddingTop, iLIZJ, (int) C12ES.LIZJ(6, getContext()));
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (z) {
            if (this.LL.isSelected()) {
                this.LL.setTextColor(this.LLIZ);
                return;
            } else {
                this.LL.setTextColor(this.LLIZLLLIL);
                return;
            }
        }
        this.LL.setTextColor(this.LLJ);
    }

    public void setTabSelected(boolean z) {
        this.LL.setSelected(z);
    }

    public void setText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        this.LL.setText(charSequence);
    }

    public void setTextColor(int i) {
        this.LL.setTextColor(i);
    }

    public void setTextFont(int i) {
        ((TuxTextView) this.LL).setTuxFont(i);
    }

    public void setTextStartDrawable(Drawable drawable) {
        if (drawable == null) {
            this.LL.setCompoundDrawables(null, null, null, null);
        } else {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            this.LL.setCompoundDrawables(drawable, null, null, null);
        }
    }

    public b0(Context context, int i) {
        boolean z;
        super(context, null, 0);
        this.LLIZ = C446980Hfs.LIZ(getContext(), R.color.f569bc);
        this.LLIZLLLIL = C446980Hfs.LIZ(getContext(), R.color.bg);
        this.LLJ = C446980Hfs.LIZ(getContext(), R.color.bh);
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.fj3, this, true);
        this.LL = (TextView) viewTd.findViewById(R.id.wy6);
        this.LLILZIL = (ViewGroup) viewTd.findViewById(R.id.wy4);
        String appLanguage = C0CHQ.LIZ().getAppLanguage();
        if (appLanguage.equals("es") || appLanguage.equals("ru") || appLanguage.equals("tr") || appLanguage.equals("uk")) {
            C01GW c01gw = C0AUH.LIZ;
            if (((Number) c01gw.getValue()).intValue() == 16) {
                int iLIZJ = (int) C12ES.LIZJ(8.0f, getContext());
                this.LL.setPadding(iLIZJ, iLIZJ, iLIZJ, iLIZJ);
            } else {
                if (((Number) c01gw.getValue()).intValue() == 18) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    int iLIZJ2 = (int) C12ES.LIZJ(9.0f, getContext());
                    this.LL.setPadding(iLIZJ2, iLIZJ2, iLIZJ2, iLIZJ2);
                } else if (((Number) c01gw.getValue()).intValue() == 20) {
                    int iLIZJ3 = (int) C12ES.LIZJ(9.0f, getContext());
                    this.LL.setPadding(iLIZJ3, iLIZJ3, iLIZJ3, iLIZJ3);
                }
            }
        }
        this.LL.setShadowLayer(C12ES.LIZJ(6.0f, getContext()), 0.0f, 0.0f, C1308910kAL.LIZJ(R.attr.e3, getContext()).intValue());
        this.LLILLJJLI = (TextView) viewTd.findViewById(R.id.wy5);
        this.LLILLL = (C1295960jpS) viewTd.findViewById(R.id.wy3);
    }
}
