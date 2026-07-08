package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.11Fw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19471411Fw extends C427290GpD {
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public int LLJIJIL;
    public int LLJILJIL;
    public int LLJILJILJ;
    public boolean LLJILLL;
    public Typeface LLJJ;
    public boolean LLJJI;
    public boolean LLJJIII;

    public C19471411Fw(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final void LJJJJ() {
        if (this.LLJJ == null) {
            this.LLJJ = C19736612Jw.LIZ(C12MF.MEDIUM.getFONT_NAME());
        }
        Typeface typeface = this.LLJJ;
        if (typeface != null) {
            setTypeface(typeface);
        } else {
            setTypeface(getTypeface(), 1);
        }
    }

    public final void LJJJI() {
        if (C12VA.LIZ().LJFF) {
            setTextSize(12.0f);
            LJJJJ();
        } else {
            setTextSize(11.0f);
            setTypeface(Typeface.defaultFromStyle(0));
        }
    }

    public final void LJJJIL(boolean z) {
        this.LLJJIII = z;
        if (z) {
            if (this.LLIZLLLIL) {
                setTextColor(this.LLJILJILJ);
                return;
            }
            return;
        }
        setTextColor(this.LLJIJIL);
    }

    public final void setEnableUI(boolean z) {
        if (z) {
            if (this.LLJJIII) {
                if (this.LLIZLLLIL) {
                    setTextColor(this.LLJILJILJ);
                    return;
                }
                return;
            }
            setTextColor(this.LLJIJIL);
            return;
        }
        setTextColor(C960203pA.LIZ(R.attr.eh, getContext()));
    }

    public final void setOldPanelStyle(boolean z) {
        int i = C19733712It.LIZIZ;
        this.LLJIJIL = i;
        int iLIZJ = C19733712It.LIZJ(i);
        this.LLJILJIL = iLIZJ;
        if (this.LLJI) {
            iLIZJ = this.LLJIJIL;
        }
        setTextColor(iLIZJ);
    }

    public final void setSelectTextColor(int i) {
        this.LLJIJIL = i;
    }

    @Override // android.widget.TextView, android.view.View
    public void setSelected(boolean z) {
        int i;
        super.setSelected(z);
        if (this.LLJ) {
            if (z) {
                i = this.LLJIJIL;
            } else {
                i = this.LLJILJIL;
            }
            setTextColor(i);
        }
    }

    public final void setStatusTextColor(int i) {
        this.LLJILJILJ = i;
        LJJJIL(this.LLJJIII);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C19471411Fw(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        super(context, attributeSet, 0);
        this.LLIZLLLIL = true;
        this.LLJI = true;
        this.LLJILLL = true;
        this.LLJJ = C19736612Jw.LIZ(C12MF.MEDIUM.getFONT_NAME());
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.AVDmtView);
            typedArrayObtainStyledAttributes.getBoolean(R$styleable.AVDmtView_oldPanel, false);
            this.LLIZLLLIL = typedArrayObtainStyledAttributes.getBoolean(R$styleable.AVDmtView_clickChangeColor, true);
            typedArrayObtainStyledAttributes.getBoolean(R$styleable.AVDmtView_isChangeTextSize, false);
            this.LLJ = typedArrayObtainStyledAttributes.getBoolean(R$styleable.AVDmtView_isSelectState, false);
            this.LLJI = typedArrayObtainStyledAttributes.getBoolean(R$styleable.AVDmtView_isSelected, true);
            this.LLJILLL = typedArrayObtainStyledAttributes.getBoolean(R$styleable.AVDmtView_isChangeColor, true);
            this.LLJJI = typedArrayObtainStyledAttributes.getBoolean(R$styleable.AVDmtView_showBgColor, false);
            typedArrayObtainStyledAttributes.recycle();
        }
        if (this.LLJJI) {
            setBackgroundDrawable(C19733712It.LIZ(context, attributeSet));
        }
        this.LLJILJILJ = C960203pA.LIZ(R.attr.a04, getContext());
        int i2 = C19733712It.LIZIZ;
        this.LLJIJIL = i2;
        int iLIZJ = C19733712It.LIZJ(i2);
        this.LLJILJIL = iLIZJ;
        if (this.LLJILLL) {
            setTextColor(this.LLJI ? this.LLJIJIL : iLIZJ);
        }
    }
}
