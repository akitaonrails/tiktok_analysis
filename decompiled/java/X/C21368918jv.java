package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.widget.Button;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.ss.android.ugc.aweme.settings.PhotoModeLineHeightConfig;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18jv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21368918jv extends C1355730lNr implements C0SP0 {
    public static final Object LLJLL = new Object();
    public int LLJJJJ;
    public final int LLJJJJJIL;
    public int LLJJJJLIIL;
    public boolean LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public String LLJLIL;
    public boolean LLJLILLLLZIIL;

    public final boolean getScreenAntiBurnEnabled() {
        return false;
    }

    private final C21370018k6 getAutoSizeHelper() {
        return (C21370018k6) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    public final void LJJJJLL() {
        int i = this.LLJJJJJIL;
        int i2 = this.LLJJJJLIIL;
        boolean z = true;
        if (1 > i2 || i2 >= i) {
            C21370018k6 autoSizeHelper = getAutoSizeHelper();
            autoSizeHelper.LIZJ = -1;
            autoSizeHelper.LIZLLL = -1;
            autoSizeHelper.LJFF = new int[0];
            autoSizeHelper.LIZIZ = false;
            z = false;
        } else {
            C21370018k6 autoSizeHelper2 = getAutoSizeHelper();
            int i3 = this.LLJJJJLIIL;
            int i4 = this.LLJJJJJIL;
            autoSizeHelper2.getClass();
            if (i3 <= 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Minimum auto-size text size ( ");
                sbLIZ.append(i3);
                sbLIZ.append(" px) is less or equal to (0px)");
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                strLIZIZ.toString();
                throw new IllegalArgumentException(strLIZIZ);
            }
            if (i4 <= i3) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Maximum auto-size text size ( ");
                sbLIZ2.append(i4);
                sbLIZ2.append(" px) is less or equal to minimum auto-size text size ( ");
                sbLIZ2.append(i3);
                sbLIZ2.append(" px)");
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                strLIZIZ2.toString();
                throw new IllegalArgumentException(strLIZIZ2);
            }
            autoSizeHelper2.LIZJ = i3;
            autoSizeHelper2.LIZLLL = i4;
            int i5 = 1;
            while (true) {
                i3++;
                if (i3 > autoSizeHelper2.LIZLLL) {
                    break;
                } else {
                    i5++;
                }
            }
            int[] iArr = new int[i5];
            int i6 = autoSizeHelper2.LIZJ;
            for (int i7 = 0; i7 < i5; i7++) {
                iArr[i7] = i6;
                i6++;
            }
            autoSizeHelper2.LJFF = iArr;
            autoSizeHelper2.LIZIZ = true;
            autoSizeHelper2.LIZ(1);
        }
        this.LLJJL = z;
        setText(getText());
    }

    public final void LJJJJL() {
        float f = C293300Bea.LIZ().letterSpacingPercent;
        if (f != 0.0f) {
            String str = this.LLJLIL;
            if (Intrinsics.LJFF(str != null ? str.toLowerCase(Locale.ROOT) : null, "en")) {
                setLetterSpacing(f / 100);
                return;
            }
        }
        setLetterSpacing(0.0f);
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return (isClickable() && getMovementMethod() == null && getKeyListener() == null) ? Button.class.getName() : super.getAccessibilityClassName();
    }

    public final int getMinTextSize() {
        return this.LLJJJJLIIL;
    }

    public boolean getShouldBlockSystemSelectionActionMode() {
        return this.LLJLILLLLZIIL;
    }

    private final void setMinTextSize(float f) {
        setMinTextSizePx(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(f))));
    }

    private final void setMinTextSizePx(int i) {
        this.LLJJJJLIIL = i;
        LJJJJLL();
    }

    @Override // X.C1355730lNr, X.C1355740lNs, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Layout layout;
        if (getShouldBlockSystemSelectionActionMode()) {
            CharSequence text = getText();
            if (text != null && (text instanceof Spanned) && (layout = getLayout()) != null) {
                try {
                    int iU3 = C786410Ut5.U3(layout, layout.getLineForVertical((int) ((motionEvent.getY() - getTotalPaddingTop()) + getScrollY())), (motionEvent.getX() - getTotalPaddingLeft()) + getScrollX());
                    if (iU3 < 0 || iU3 >= text.length() || ((Spanned) text).getSpans(iU3, iU3, ClickableSpan.class).length == 0) {
                        return true;
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // X.C0SP0
    public void setShouldBlockSystemSelectionActionMode(boolean z) {
        this.LLJLILLLLZIIL = z;
    }

    public final void setSpanLineHeight(int i) {
        this.LLJJJJ = i;
    }

    public final void setTextColorRes(int i) {
        Integer numLIZJ;
        Context context = getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(i, context)) != null) {
            setTextColor(numLIZJ.intValue());
        }
    }

    public final void setTuxFont(int i) {
        LJJJJLL();
    }

    @Override // android.view.View
    public final ActionMode startActionMode(ActionMode.Callback callback) {
        if (getShouldBlockSystemSelectionActionMode()) {
            return null;
        }
        return super.startActionMode(callback);
    }

    public final void setMinTextSize(int i) {
        this.LLJJJJLIIL = i;
    }

    public C21368918jv(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.z4);
        this.LLJJJJJIL = -1;
        this.LLJJJJLIIL = -1;
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS576S0100000_32(this, 745));
        this.LLJLIL = "";
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TuxTextView, R.attr.z4, 0);
        this.LLJJJJLIIL = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TuxTextView_tux_minTextSize, -1);
        int i = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxTextView_tux_font, 0);
        typedArrayObtainStyledAttributes.recycle();
        if (Build.VERSION.SDK_INT >= 28) {
            setFallbackLineSpacing(false);
        }
        setTuxFont(i);
    }

    public final void LJJJJLI(CharSequence charSequence, String str) {
        boolean z;
        PhotoModeLineHeightConfig photoModeLineHeightConfig;
        float fFloatValue;
        Float f;
        this.LLJLIL = str;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        if (spannableStringBuilder.length() > 0) {
            C786410Ut5.q2(spannableStringBuilder, LLJLL, 0, spannableStringBuilder.length(), 18);
        }
        if (C07QQ.LIZ() >= 1) {
            z = true;
        } else {
            z = false;
        }
        String lowerCase = null;
        if (z) {
            Map<String, String> map = C2273381Dya.LIZ;
            float textSize = getTextSize();
            C0SUE c0sueLIZ = C2273381Dya.LIZ(this.LLJLIL);
            if (c0sueLIZ != null && (f = c0sueLIZ.LIZIZ) != null) {
                Integer numValueOf = Integer.valueOf(C814420VxA.LIZIZ(textSize * f.floatValue()));
                if (numValueOf.intValue() > 0) {
                    setSpanLineHeight(numValueOf.intValue());
                    setText(spannableStringBuilder);
                    LJJJJL();
                    return;
                }
            }
        }
        if (!C293300Bea.LIZ().enableLooseLineHeight) {
            setText(spannableStringBuilder);
            if (Build.VERSION.SDK_INT >= 28) {
                setLineHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22)));
                return;
            } else {
                C21382118m3.LJFF(this, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22)));
                return;
            }
        }
        PhotoModeLineHeightConfig photoModeLineHeightConfig2 = C2273371DyZ.LIZ;
        try {
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            photoModeLineHeightConfig = C2273371DyZ.LIZ;
            PhotoModeLineHeightConfig photoModeLineHeightConfig3 = (PhotoModeLineHeightConfig) settingsManagerLIZLLL.LJIIIIZZ("photo_mode_line_height_chart", PhotoModeLineHeightConfig.class, photoModeLineHeightConfig);
            if (photoModeLineHeightConfig3 != null) {
                photoModeLineHeightConfig = photoModeLineHeightConfig3;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            photoModeLineHeightConfig = C2273371DyZ.LIZ;
        }
        Map<String, Float> map2 = photoModeLineHeightConfig.photoModeLineHeightConfig;
        String str2 = this.LLJLIL;
        if (str2 != null) {
            lowerCase = str2.toLowerCase(Locale.ROOT);
        }
        Float f2 = map2.get(lowerCase);
        if (f2 != null) {
            fFloatValue = f2.floatValue();
        } else {
            fFloatValue = photoModeLineHeightConfig.defaultLineHeight;
        }
        setSpanLineHeight((int) (fFloatValue * getTextSize()));
        setText(spannableStringBuilder);
        LJJJJL();
    }

    @Override // X.C1355730lNr, androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.LLJJL) {
            getPaint().setTextSize(this.LLJJJJJIL);
        }
        super.onMeasure(i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a7  */
    @Override // android.widget.TextView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setText(java.lang.CharSequence r11, android.widget.TextView.BufferType r12) {
        /*
            Method dump skipped, instruction units count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21368918jv.setText(java.lang.CharSequence, android.widget.TextView$BufferType):void");
    }

    @Override // android.view.View
    public final ActionMode startActionMode(ActionMode.Callback callback, int i) {
        if (getShouldBlockSystemSelectionActionMode()) {
            return null;
        }
        return super.startActionMode(callback, i);
    }

    public static void LJJJJJ(C444910HcX c444910HcX, int i, Integer num) {
        C0H11 c0h11;
        Integer numValueOf;
        if (i > 0) {
            C0H11[] c0h11Arr = (C0H11[]) c444910HcX.getSpans(0, c444910HcX.length(), C0H11.class);
            ArrayList arrayList = new ArrayList();
            for (C0H11 c0h112 : c0h11Arr) {
                if (true ^ c0h112.LLILZ) {
                    arrayList.add(c0h112);
                }
            }
            Iterator it2 = arrayList.iterator();
            Object next = null;
            if (it2.hasNext()) {
                next = it2.next();
                if (it2.hasNext()) {
                    int i2 = ((C0H11) next).LL;
                    do {
                        Object next2 = it2.next();
                        int i3 = ((C0H11) next2).LL;
                        if (i2 < i3) {
                            next = next2;
                            i2 = i3;
                        }
                    } while (it2.hasNext());
                }
            }
            C0H11 c0h113 = (C0H11) next;
            if (c0h113 != null && (numValueOf = Integer.valueOf(c0h113.LL)) != null && numValueOf.intValue() > 0) {
                c0h11 = new C0H11(numValueOf.intValue(), num);
            } else {
                c0h11 = new C0H11(i, num);
                c0h11.LLILZ = true;
            }
            for (C0H11 c0h114 : c0h11Arr) {
                c444910HcX.removeSpan(c0h114);
            }
            C786410Ut5.s2(c444910HcX, c0h11, 0, c444910HcX.length(), 17);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (this.LLJJL) {
            getAutoSizeHelper().LIZ(2);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.LLJJL) {
            getAutoSizeHelper().LIZ(3);
        }
    }
}
