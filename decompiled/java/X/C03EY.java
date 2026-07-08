package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.03EY, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03EY extends FrameLayout {
    public final ConstraintLayout LL;
    public final TuxIconView LLILLJJLI;
    public final TuxTextView LLILLL;
    public final TuxIconView LLILZ;
    public final TuxIconView LLILZIL;
    public final C419910GdJ LLILZLL;
    public final C419910GdJ LLIZ;
    public final C384050F3z LLIZLLLIL;

    public C03EY(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final C384050F3z getDefaultBackgroundIcon() {
        return this.LLIZLLLIL;
    }

    public C03EY(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.af4, this, true);
        this.LL = (ConstraintLayout) findViewById(R.id.dow);
        this.LLILLJJLI = (TuxIconView) findViewById(R.id.dos);
        this.LLILLL = (TuxTextView) findViewById(R.id.dou);
        this.LLILZ = (TuxIconView) findViewById(R.id.dot);
        this.LLILZIL = (TuxIconView) findViewById(R.id.dor);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_laurel_leading_ltr;
        Integer numValueOf = Integer.valueOf(R.attr.nt);
        c419910GdJ.LJ = numValueOf;
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(7));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
        this.LLILZLL = c419910GdJ;
        C419910GdJ c419910GdJ2 = new C419910GdJ();
        c419910GdJ2.LIZ = R.raw.icon_laurel_trailing_ltr;
        c419910GdJ2.LJ = numValueOf;
        c419910GdJ2.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(7));
        c419910GdJ2.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
        this.LLIZ = c419910GdJ2;
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.ns);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(4));
        this.LLIZLLLIL = c384050F3z;
    }

    public static void LIZ(C03EY c03ey, String str, int i, C384050F3z c384050F3z, boolean z, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, int i2) {
        C419910GdJ c419910GdJ;
        C419910GdJ c419910GdJ2;
        int i3;
        Drawable drawableLIZ;
        if ((i2 & 1) != 0) {
            c419910GdJ = c03ey.LLILZLL;
        } else {
            c419910GdJ = null;
        }
        if ((i2 & 2) != 0) {
            str = null;
        }
        if ((i2 & 4) != 0) {
            i = 81;
        }
        if ((i2 & 8) != 0) {
            c419910GdJ2 = c03ey.LLIZ;
        } else {
            c419910GdJ2 = null;
        }
        if ((i2 & 16) != 0) {
            c384050F3z = c03ey.LLIZLLLIL;
        }
        if ((i2 & 32) != 0) {
            z = false;
        }
        if ((i2 & 64) != 0) {
            num = null;
        }
        if ((i2 & 128) != 0) {
            num2 = null;
        }
        if ((i2 & 256) != 0) {
            num3 = null;
        }
        if ((i2 & 512) != 0) {
            num4 = null;
        }
        if ((i2 & 1024) != 0) {
            num5 = null;
        }
        if ((i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            num6 = null;
        }
        if ((i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            num7 = null;
        }
        TuxIconView tuxIconView = c03ey.LLILLJJLI;
        if (tuxIconView != null) {
            tuxIconView.setTuxIcon(c419910GdJ);
        }
        TuxTextView tuxTextView = c03ey.LLILLL;
        if (tuxTextView != null) {
            tuxTextView.setText(str);
        }
        TuxTextView tuxTextView2 = c03ey.LLILLL;
        if (tuxTextView2 != null) {
            tuxTextView2.setTuxFont(i);
        }
        TuxIconView tuxIconView2 = c03ey.LLILZ;
        if (tuxIconView2 != null) {
            tuxIconView2.setTuxIcon(c419910GdJ2);
        }
        ConstraintLayout constraintLayout = c03ey.LL;
        if (constraintLayout != null) {
            if (c384050F3z != null) {
                drawableLIZ = c384050F3z.LIZ(c03ey.getContext());
            } else {
                drawableLIZ = null;
            }
            constraintLayout.setBackground(drawableLIZ);
        }
        TuxIconView tuxIconView3 = c03ey.LLILZIL;
        if (tuxIconView3 != null) {
            if (z) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            C786410Ut5.LLLLLLZZ(tuxIconView3, i3);
        }
        TuxIconView tuxIconView4 = c03ey.LLILZIL;
        if (tuxIconView4 != null) {
            if (num2 != null && num2.intValue() > 0) {
                tuxIconView4.setIconHeight(num2.intValue());
            }
            if (num3 != null && num3.intValue() > 0) {
                tuxIconView4.setIconWidth(num3.intValue());
            }
        }
        ConstraintLayout constraintLayout2 = c03ey.LL;
        if (constraintLayout2 != null && num != null && num.intValue() > 0) {
            int iIntValue = num.intValue();
            constraintLayout2.setPaddingRelative(constraintLayout2.getPaddingStart(), iIntValue, constraintLayout2.getPaddingEnd(), iIntValue);
        }
        if (num5 != null) {
            int iIntValue2 = num5.intValue();
            TuxIconView tuxIconView5 = c03ey.LLILLJJLI;
            if (tuxIconView5 != null) {
                tuxIconView5.setTintColor(iIntValue2);
            }
        }
        if (num6 != null) {
            int iIntValue3 = num6.intValue();
            TuxIconView tuxIconView6 = c03ey.LLILZ;
            if (tuxIconView6 != null) {
                tuxIconView6.setTintColor(iIntValue3);
            }
        }
        if (num4 != null) {
            int iIntValue4 = num4.intValue();
            TuxTextView tuxTextView3 = c03ey.LLILLL;
            if (tuxTextView3 != null) {
                tuxTextView3.setTextColor(iIntValue4);
            }
        }
        if (num7 != null && num7.intValue() > 0) {
            int iIntValue5 = num7.intValue();
            TuxTextView tuxTextView4 = c03ey.LLILLL;
            if (tuxTextView4 != null) {
                tuxTextView4.setMaxWidth(iIntValue5);
            }
        }
    }
}
