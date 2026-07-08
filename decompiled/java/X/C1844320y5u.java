package X;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0y5u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1844320y5u extends C16F5 {
    public static final C603820NmG<C817160W3u, C1844330y5v> LLJJJIL = new C603820NmG<>(15);
    public boolean LLJJ;
    public float LLJJI;
    public float LLJJIII;
    public int LLJJIJI;
    public int LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public boolean LLJJJ;

    public final void LJJJJI(boolean z) {
        CharSequence text;
        if (this.LLJJIJIL && this.LLJJIJIIJIL > 0 && (text = getText()) != null && text.length() != 0) {
            final String string = getText().toString();
            C603820NmG<C817160W3u, C1844330y5v> c603820NmG = LLJJJIL;
            final float textSize = getTextSize();
            final int i = this.LLJJIJIIJIL;
            C1844330y5v c1844330y5vLIZJ = c603820NmG.LIZJ((C817160W3u) new Object(string, textSize, i) { // from class: X.0W3u
                public final String LIZ;
                public final float LIZIZ;
                public final int LIZJ;

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C817160W3u)) {
                        return false;
                    }
                    C817160W3u c817160W3u = (C817160W3u) obj;
                    return Intrinsics.LJFF(this.LIZ, c817160W3u.LIZ) && Float.compare(this.LIZIZ, c817160W3u.LIZIZ) == 0 && this.LIZJ == c817160W3u.LIZJ;
                }

                public final int hashCode() {
                    return (((this.LIZ.hashCode() * 31) + Float.floatToIntBits(this.LIZIZ)) * 31) + this.LIZJ;
                }

                {
                    this.LIZ = string;
                    this.LIZIZ = textSize;
                    this.LIZJ = i;
                }
            });
            if (c1844330y5vLIZJ != null) {
                this.LLJJ = c1844330y5vLIZJ.LIZ;
                float textSize2 = getTextSize();
                float f = c1844330y5vLIZJ.LIZIZ;
                if (textSize2 != f) {
                    setTextSize(f);
                }
                float letterSpacing = getLetterSpacing();
                float f2 = c1844330y5vLIZJ.LIZJ;
                if (letterSpacing != f2) {
                    super.setLetterSpacing(f2);
                    return;
                }
                return;
            }
            if (getPaint().measureText(string) > this.LLJJIJIIJIL) {
                float textSize3 = getTextSize();
                DisplayMetrics displayMetrics = C497740JfY.LIZIZ;
                float f3 = (-0.6f) / (textSize3 / displayMetrics.density);
                if (getLetterSpacing() > f3) {
                    super.setLetterSpacing(f3);
                    LJJJJI(false);
                    return;
                }
                if (getTextSize() > ((int) C497740JfY.LIZIZ(10.0f))) {
                    super.setTextSize(1, 10.0f);
                    super.setLetterSpacing((-0.6f) / (getTextSize() / displayMetrics.density));
                    if (getPaint().measureText(string) >= this.LLJJIJIIJIL) {
                        super.setTextSize(0, this.LLJJI);
                        super.setLetterSpacing(this.LLJJIII);
                    }
                }
                this.LLJJ = false;
            } else {
                this.LLJJ = z;
            }
            final float textSize4 = getTextSize();
            final int i2 = this.LLJJIJIIJIL;
            c603820NmG.LIZLLL((C817160W3u) new Object(string, textSize4, i2) { // from class: X.0W3u
                public final String LIZ;
                public final float LIZIZ;
                public final int LIZJ;

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C817160W3u)) {
                        return false;
                    }
                    C817160W3u c817160W3u = (C817160W3u) obj;
                    return Intrinsics.LJFF(this.LIZ, c817160W3u.LIZ) && Float.compare(this.LIZIZ, c817160W3u.LIZIZ) == 0 && this.LIZJ == c817160W3u.LIZJ;
                }

                public final int hashCode() {
                    return (((this.LIZ.hashCode() * 31) + Float.floatToIntBits(this.LIZIZ)) * 31) + this.LIZJ;
                }

                {
                    this.LIZ = string;
                    this.LIZIZ = textSize4;
                    this.LIZJ = i2;
                }
            }, new C1844330y5v(getTextSize(), getLetterSpacing(), this.LLJJ));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        LLJJJIL.LJIIIZ(-1);
    }

    public final void setEnableAdaptive(boolean z) {
        this.LLJJIJIL = z;
        if (!z) {
            super.setTextSize(0, this.LLJJI);
            super.setLetterSpacing(this.LLJJIII);
        }
    }

    public final void setFixedContainerMaxWidth(int i) {
        this.LLJJIJI = i;
        if (this.LLJJIJIL && i > 0) {
            if (!this.LLJJ) {
                this.LLJJIJIIJIL = i;
                setText(getText());
            } else {
                this.LLJJIJIIJIL = i;
                LJJJJI(true);
            }
        }
        this.LLJJIJIIJIL = i;
    }

    public final void setFullDisplayed(boolean z) {
        this.LLJJ = z;
    }

    @Override // android.widget.TextView
    public void setLetterSpacing(float f) {
        super.setLetterSpacing(f);
        this.LLJJIII = f;
    }

    public final void setScrollEnabled(boolean z) {
        this.LLJJJ = z;
    }

    public C1844320y5u(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLJJ = true;
        this.LLJJIJI = -1;
        this.LLJJJ = true;
        this.LLJJI = getTextSize();
        this.LLJJIII = getLetterSpacing();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int paddingStart;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 0) {
            paddingStart = -1;
        } else {
            paddingStart = (size - getPaddingStart()) - getPaddingEnd();
        }
        int i3 = this.LLJJIJI;
        if (i3 > 0) {
            paddingStart = i3;
        }
        if (this.LLJJIJIL && paddingStart > 0) {
            int i4 = this.LLJJIJIIJIL;
            if (paddingStart > i4 && !this.LLJJ) {
                this.LLJJIJIIJIL = paddingStart;
                setText(getText());
            } else if (this.LLJJ && paddingStart < i4) {
                this.LLJJIJIIJIL = paddingStart;
                LJJJJI(true);
            }
        }
        this.LLJJIJIIJIL = paddingStart;
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        if (this.LLJJJ) {
            super.scrollTo(i, i2);
        }
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        float f = this.LLJJI;
        if (f > 0.0f && this.LLJJIJIL) {
            super.setTextSize(0, f);
            super.setLetterSpacing(this.LLJJIII);
        }
        LJJJJI(true);
    }

    @Override // X.C16F5, androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public final void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        this.LLJJI = getTextSize();
    }
}
