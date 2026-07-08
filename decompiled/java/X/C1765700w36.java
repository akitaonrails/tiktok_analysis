package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0w36, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1765700w36 extends TuxTextView {
    public final SimpleDateFormat LLJJJJ;
    public final SimpleDateFormat LLJJJJJIL;
    public Function0<Unit> LLJJJJLIIL;
    public int LLJJL;
    public int LLJJLIIIJLLLLLLLZ;
    public String LLJL;
    public String LLJLIL;
    public int LLJLILLLLZIIL;

    public C1765700w36(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final int LJJJJJ() {
        return ((int) getPaint().measureText(this.LLJL)) + this.LLJLILLLLZIIL;
    }

    public final void setCountdownTimeMillis(long j) {
        String str;
        try {
            if (j <= 0) {
                C786410Ut5.O(this, 8);
                Function0<Unit> function0 = this.LLJJJJLIIL;
                if (function0 != null) {
                    function0.invoke();
                }
                this.LLJJJJLIIL = null;
                return;
            }
            if (j >= 86400000) {
                setText(String.valueOf((int) ((((j / 1000.0f) / 60.0f) / 60.0f) / 24.0f)));
                return;
            }
            if (j >= 3600000) {
                setText(this.LLJJJJ.format(new Date(j)));
                return;
            }
            if (this.LLJJLIIIJLLLLLLLZ == 1) {
                str = this.LLJJJJJIL.format(new Date(j));
            } else {
                str = this.LLJJJJ.format(new Date(j));
            }
            setText(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void setTimeEndListener(Function0<Unit> function0) {
        this.LLJJJJLIIL = function0;
    }

    @Override // com.bytedance.tux.input.TuxTextView, android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        int iMeasureText;
        int i;
        super.setText(charSequence, bufferType);
        int i2 = 0;
        if (this.LLJJLIIIJLLLLLLLZ == 1 && charSequence != null) {
            int i3 = 0;
            for (int i4 = 0; i4 < charSequence.length(); i4++) {
                if (charSequence.charAt(i4) == ':') {
                    i3++;
                }
            }
            if (i3 == 1) {
                i2 = 1;
            }
        }
        if (this.LLJJL != i2) {
            if (i2 == 1) {
                iMeasureText = (int) getPaint().measureText(this.LLJLIL);
                i = this.LLJLILLLLZIIL;
            } else {
                iMeasureText = (int) getPaint().measureText(this.LLJL);
                i = this.LLJLILLLLZIIL;
            }
            getLayoutParams().width = iMeasureText + i;
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
            setLayoutParams(layoutParams);
            this.LLJJL = i2;
        }
    }

    public C1765700w36(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        Locale locale = Locale.ENGLISH;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss", locale);
        this.LLJJJJ = simpleDateFormat;
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("mm:ss", locale);
        this.LLJJJJJIL = simpleDateFormat2;
        this.LLJL = "05:48:48";
        this.LLJLIL = "48:48";
        setTuxFont(92);
        setTextColor(C960203pA.LIZ(R.attr.a04, context));
        if (isInEditMode()) {
            setCountdownTimeMillis(86339999L);
        }
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("GMT"));
    }

    public final void LJJJJL(int i, int i2, String str) {
        this.LLJJLIIIJLLLLLLLZ = i;
        this.LLJL = str;
        int length = str.length();
        int i3 = 0;
        while (true) {
            if (i3 < length) {
                if (str.charAt(i3) == ':') {
                    break;
                } else {
                    i3++;
                }
            } else {
                i3 = -1;
                break;
            }
        }
        this.LLJLIL = str.substring(i3 + 1);
        this.LLJLILLLLZIIL = i2;
        if (getLayoutParams() != null) {
            setWidth(LJJJJJ());
        }
    }
}
