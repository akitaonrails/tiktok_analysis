package X;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Gx0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C432120Gx0 extends C16F5 {
    public static final /* synthetic */ int LLJJJJLIIL = 0;
    public float LLJJ;
    public int LLJJI;
    public int LLJJIII;
    public String LLJJIJI;
    public float LLJJIJIIJIL;
    public int LLJJIJIL;
    public boolean LLJJJ;
    public final Map<String, Float> LLJJJIL;
    public C432130Gx1 LLJJJJ;
    public boolean LLJJJJJIL;

    private final int getExtraWidth() {
        return this.LLJJI + getPaddingLeft() + getPaddingRight();
    }

    public final void LJJJJI(boolean z) {
        this.LLJJ = 0.0f;
        int i = 0;
        do {
            float fMeasureText = getPaint().measureText(String.valueOf(i));
            if (fMeasureText > this.LLJJ) {
                this.LLJJ = fMeasureText;
            }
            i++;
        } while (i < 10);
        for (Map.Entry entry : ((LinkedHashMap) this.LLJJJIL).entrySet()) {
            String str = (String) entry.getKey();
            float fFloatValue = ((Number) entry.getValue()).floatValue();
            float fMeasureText2 = getPaint().measureText(str);
            if (fMeasureText2 != fFloatValue) {
                this.LLJJJIL.put(str, Float.valueOf(fMeasureText2));
            }
        }
        this.LLJJJ = true;
        if (z) {
            LJJJJIZL(this.LLJJIJI, true);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablePadding(int i) {
        this.LLJJIII = i;
        super.setCompoundDrawablePadding(i);
    }

    @Override // android.widget.TextView
    public void setLetterSpacing(float f) {
        super.setLetterSpacing(f);
        if (this.LLJJJJJIL && this.LLJJJ) {
            LJJJJI(true);
        }
    }

    public final void setOptState(boolean z) {
        this.LLJJJJJIL = z;
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface) {
        super.setTypeface(typeface);
        if (this.LLJJJJJIL && this.LLJJJ) {
            LJJJJI(true);
        }
    }

    public C432120Gx0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLJJIJI = "";
        this.LLJJJIL = new LinkedHashMap();
        this.LLJJJJ = new C432130Gx1();
    }

    public final int LJJJJIZL(String str, boolean z) {
        boolean z2;
        float fMeasureText;
        if (!this.LLJJJ) {
            LJJJJI(false);
        }
        boolean z3 = !Intrinsics.LJFF(this.LLJJIJI, getText().toString());
        if (!z3 && Intrinsics.LJFF(str, getText().toString()) && !z) {
            return this.LLJJIJIL;
        }
        float extraWidth = getExtraWidth();
        if (Intrinsics.LJFF(str, this.LLJJIJI) && !z) {
            z2 = false;
        } else {
            C432130Gx1 c432130Gx1 = new C432130Gx1();
            for (int i = 0; i < str.length(); i++) {
                char cCharAt = str.charAt(i);
                if ('0' <= cCharAt && cCharAt < ':') {
                    c432130Gx1.LIZ += this.LLJJ;
                } else {
                    Float f = (Float) ((LinkedHashMap) this.LLJJJIL).get(String.valueOf(cCharAt));
                    if (f != null) {
                        c432130Gx1.LIZ += f.floatValue();
                    } else {
                        float f2 = c432130Gx1.LIZ;
                        String strValueOf = String.valueOf(cCharAt);
                        Float f3 = (Float) ((LinkedHashMap) this.LLJJJIL).get(strValueOf);
                        if (f3 != null) {
                            fMeasureText = f3.floatValue();
                        } else {
                            fMeasureText = getPaint().measureText(strValueOf);
                            this.LLJJJIL.put(strValueOf, Float.valueOf(fMeasureText));
                        }
                        c432130Gx1.LIZ = f2 + fMeasureText;
                    }
                }
            }
            if (str.length() == this.LLJJIJI.length() && c432130Gx1.LIZ == this.LLJJJJ.LIZ) {
                z2 = false;
            } else {
                z2 = true;
            }
            this.LLJJJJ = c432130Gx1;
        }
        if (z3 || z2 || extraWidth != this.LLJJIJIIJIL || z) {
            this.LLJJIJIL = (int) (this.LLJJJJ.LIZ + extraWidth);
            if (getMaxWidth() != -1) {
                int i2 = this.LLJJIJIL;
                int maxWidth = getMaxWidth();
                if (i2 > maxWidth) {
                    i2 = maxWidth;
                }
                this.LLJJIJIL = i2;
            }
            if (getMinWidth() != -1) {
                int i3 = this.LLJJIJIL;
                int minWidth = getMinWidth();
                if (i3 < minWidth) {
                    i3 = minWidth;
                }
                this.LLJJIJIL = i3;
            }
            if (this.LLJJIJIL != getLayoutParams().width) {
                getLayoutParams().width = this.LLJJIJIL;
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
                setLayoutParams(layoutParams);
            }
        }
        this.LLJJIJIIJIL = extraWidth;
        this.LLJJIJI = str;
        setText(str);
        return this.LLJJIJIL;
    }

    @Override // X.C16F5, androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public final void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        if (this.LLJJJJJIL && this.LLJJJ) {
            LJJJJI(true);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        int iWidth;
        int iWidth2;
        int i;
        Rect bounds;
        Rect bounds2;
        int i2 = 0;
        if (drawable != null && (bounds2 = drawable.getBounds()) != null) {
            iWidth = bounds2.width();
        } else {
            iWidth = 0;
        }
        if (drawable3 != null && (bounds = drawable3.getBounds()) != null) {
            iWidth2 = bounds.width();
        } else {
            iWidth2 = 0;
        }
        if (iWidth == 0) {
            i = 0;
        } else {
            i = this.LLJJIII;
        }
        if (iWidth2 != 0) {
            i2 = this.LLJJIII;
        }
        this.LLJJI = i + i2 + iWidth + iWidth2;
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }
}
