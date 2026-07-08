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

/* JADX INFO: renamed from: X.0esT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1105630esT extends C20743416Fc {
    public float LLJJLIIIJLLLLLLLZ;
    public int LLJL;
    public int LLJLIL;
    public String LLJLILLLLZIIL;
    public float LLJLL;
    public int LLJLLIL;
    public boolean LLJLLL;
    public final Map<String, Float> LLJZ;
    public C1105640esU LLJZIJLIL;
    public boolean LLL;

    private final int getExtraWidth() {
        return this.LLJL + getPaddingLeft() + getPaddingRight();
    }

    public final void LJJLIIIJLJLI(boolean z) {
        boolean z2;
        float fMeasureText;
        if (!this.LLJLLL) {
            this.LLJJLIIIJLLLLLLLZ = 0.0f;
            int i = 0;
            do {
                float fMeasureText2 = getPaint().measureText(String.valueOf(i));
                if (fMeasureText2 > this.LLJJLIIIJLLLLLLLZ) {
                    this.LLJJLIIIJLLLLLLLZ = fMeasureText2;
                }
                i++;
            } while (i < 10);
            for (Map.Entry entry : ((LinkedHashMap) this.LLJZ).entrySet()) {
                String str = (String) entry.getKey();
                float fFloatValue = ((Number) entry.getValue()).floatValue();
                float fMeasureText3 = getPaint().measureText(str);
                if (fMeasureText3 != fFloatValue) {
                    this.LLJZ.put(str, Float.valueOf(fMeasureText3));
                }
            }
            this.LLJLLL = true;
            if (z) {
                String str2 = this.LLJLILLLLZIIL;
                LJJLIIIJLJLI(false);
                boolean z3 = !Intrinsics.LJFF(this.LLJLILLLLZIIL, String.valueOf(getText()));
                if (!z3 && Intrinsics.LJFF(str2, String.valueOf(getText()))) {
                    return;
                }
                float extraWidth = getExtraWidth();
                if (Intrinsics.LJFF(str2, this.LLJLILLLLZIIL)) {
                    z2 = false;
                } else {
                    C1105640esU c1105640esU = new C1105640esU();
                    for (int i2 = 0; i2 < str2.length(); i2++) {
                        char cCharAt = str2.charAt(i2);
                        if ('0' <= cCharAt && cCharAt < ':') {
                            c1105640esU.LIZ += this.LLJJLIIIJLLLLLLLZ;
                        } else {
                            Float f = (Float) ((LinkedHashMap) this.LLJZ).get(String.valueOf(cCharAt));
                            if (f != null) {
                                c1105640esU.LIZ += f.floatValue();
                            } else {
                                float f2 = c1105640esU.LIZ;
                                String strValueOf = String.valueOf(cCharAt);
                                Float f3 = (Float) ((LinkedHashMap) this.LLJZ).get(strValueOf);
                                if (f3 != null) {
                                    fMeasureText = f3.floatValue();
                                } else {
                                    fMeasureText = getPaint().measureText(strValueOf);
                                    this.LLJZ.put(strValueOf, Float.valueOf(fMeasureText));
                                }
                                c1105640esU.LIZ = f2 + fMeasureText;
                            }
                        }
                    }
                    if (str2.length() == this.LLJLILLLLZIIL.length() && c1105640esU.LIZ == this.LLJZIJLIL.LIZ) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    this.LLJZIJLIL = c1105640esU;
                }
                if (z3 || z2 || extraWidth != this.LLJLL) {
                    this.LLJLLIL = (int) (this.LLJZIJLIL.LIZ + extraWidth);
                    if (getMaxWidth() != -1) {
                        int i3 = this.LLJLLIL;
                        int maxWidth = getMaxWidth();
                        if (i3 > maxWidth) {
                            i3 = maxWidth;
                        }
                        this.LLJLLIL = i3;
                    }
                    if (getMinWidth() != -1) {
                        int i4 = this.LLJLLIL;
                        int minWidth = getMinWidth();
                        if (i4 < minWidth) {
                            i4 = minWidth;
                        }
                        this.LLJLLIL = i4;
                    }
                    if (this.LLJLLIL != getLayoutParams().width) {
                        getLayoutParams().width = this.LLJLLIL;
                        ViewGroup.LayoutParams layoutParams = getLayoutParams();
                        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
                        setLayoutParams(layoutParams);
                    }
                }
                this.LLJLL = extraWidth;
                this.LLJLILLLLZIIL = str2;
                setText(str2);
            }
        }
    }

    @Override // com.bytedance.android.live.design.widget.SimpleLiveTextView, android.widget.TextView
    public void setCompoundDrawablePadding(int i) {
        this.LLJLIL = i;
        super.setCompoundDrawablePadding(i);
    }

    @Override // android.widget.TextView
    public void setLetterSpacing(float f) {
        super.setLetterSpacing(f);
        if (this.LLL) {
            LJJLIIIJLJLI(true);
        }
    }

    public final void setOptState(boolean z) {
        this.LLL = z;
    }

    @Override // com.bytedance.android.live.design.widget.SimpleLiveTextView, android.widget.TextView
    public void setTypeface(Typeface typeface) throws Throwable {
        super.setTypeface(typeface);
        if (this.LLL) {
            LJJLIIIJLJLI(true);
        }
    }

    public C1105630esT(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLJLILLLLZIIL = "";
        this.LLJZ = new LinkedHashMap();
        this.LLJZIJLIL = new C1105640esU();
    }

    @Override // com.bytedance.android.live.design.widget.SimpleLiveTextView, X.C16F5, androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public final void setTextSize(int i, float f) throws Throwable {
        super.setTextSize(i, f);
        if (this.LLL) {
            LJJLIIIJLJLI(true);
        }
    }

    @Override // X.C20743416Fc, androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
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
            i = this.LLJLIL;
        }
        if (iWidth2 != 0) {
            i2 = this.LLJLIL;
        }
        this.LLJL = i + i2 + iWidth + iWidth2;
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }
}
