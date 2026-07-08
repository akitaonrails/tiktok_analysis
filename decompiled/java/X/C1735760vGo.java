package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.view.View;
import android.widget.TextView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.social.thought.api.SocialThoughtService;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Field;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0vGo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1735760vGo extends C0I7D {
    public int LLIZ;
    public List<Pair<Integer, Integer>> LLIZLLLIL;
    public String LLJ;
    public boolean LLJI;
    public int LLJIJIL;
    public int LLJILJIL;
    public long LLJILJILJ;

    public final void LJIIJ() {
        Editable editableR = C2204961BRm.r(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmnYJbP0HxsIa5vyM7VV+FlmMqP4GA+SKQNJiHafJfBQRWaRAk+fbygYcvQDK3yXQVhxA==", null));
        setHint((editableR == null || editableR.length() == 0) ? this.LLJ : "");
    }

    public final void LJIIJJI() {
        Editable editableR = C2204961BRm.r(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmnYJbP0HxsIa5vyM7VV+FlmMqP4GA+SKQNJiHafJfBQRWaRAk+fbygYcvQDK3yXQVhxA==", null));
        setTextAlignment((editableR == null || editableR.length() == 0) ? 5 : 4);
    }

    public final void LJIIIIZZ() {
        LJIIIZ(((getWidth() > 0 ? getWidth() : 0) - getPaddingLeft()) - getPaddingRight());
    }

    public final List<Pair<Integer, Integer>> getAutoSizeSteps() {
        return this.LLIZLLLIL;
    }

    public final int getMaxFontSize() {
        return this.LLIZ;
    }

    public C1735760vGo(Context context) {
        final int iIntValue;
        int currentTextColor;
        int iIntValue2;
        super(context, null, 0);
        this.LLJ = "";
        this.LLJILJIL = -1;
        setBackground(null);
        setFocusable(true);
        setFocusableInTouchMode(true);
        setClickable(true);
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            setDefaultFocusHighlightEnabled(false);
        }
        setGravity(8388659);
        setImeOptions(6);
        setIncludeFontPadding(false);
        final int i2 = (int) (getResources().getDisplayMetrics().density * 2.0f);
        i2 = i2 < 1 ? 1 : i2;
        final float f = getResources().getDisplayMetrics().density * 1.0f;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a04, getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -16777216;
        }
        final AwS558S0100000_14 awS558S0100000_14 = new AwS558S0100000_14(this, 1558);
        Drawable drawable = new Drawable(iIntValue, i2, f, awS558S0100000_14) { // from class: X.0Ep5
            public final int LIZ;
            public final float LIZIZ;
            public final Function0<Integer> LIZJ;
            public final Paint LIZLLL;
            public final RectF LJ;

            @Override // android.graphics.drawable.Drawable
            public final int getIntrinsicHeight() {
                return -1;
            }

            @Override // android.graphics.drawable.Drawable
            public final int getOpacity() {
                return -3;
            }

            @Override // android.graphics.drawable.Drawable
            public final int getIntrinsicWidth() {
                return this.LIZ;
            }

            @Override // android.graphics.drawable.Drawable
            public final void draw(Canvas canvas) {
                int iIntValue3 = this.LIZJ.invoke().intValue();
                if (iIntValue3 >= 0 && iIntValue3 > 0 && !getBounds().isEmpty()) {
                    float fExactCenterX = getBounds().exactCenterX();
                    float fExactCenterY = getBounds().exactCenterY();
                    float f2 = iIntValue3 / 2.0f;
                    float f3 = this.LIZ / 2.0f;
                    this.LJ.set(fExactCenterX - f3, fExactCenterY - f2, fExactCenterX + f3, fExactCenterY + f2);
                    float f4 = this.LIZIZ;
                    if (f4 > 0.0f) {
                        canvas.drawRoundRect(this.LJ, f4, f4, this.LIZLLL);
                    } else {
                        canvas.drawRect(this.LJ, this.LIZLLL);
                    }
                }
            }

            @Override // android.graphics.drawable.Drawable
            public final void setAlpha(int i3) {
                this.LIZLLL.setAlpha(i3);
                invalidateSelf();
            }

            @Override // android.graphics.drawable.Drawable
            public final void setColorFilter(ColorFilter colorFilter) {
                this.LIZLLL.setColorFilter(colorFilter);
                invalidateSelf();
            }

            {
                this.LIZ = i2;
                this.LIZIZ = f;
                this.LIZJ = awS558S0100000_14;
                Paint paint = new Paint(1);
                paint.setColor(iIntValue);
                paint.setStyle(Paint.Style.FILL);
                this.LIZLLL = paint;
                this.LJ = new RectF();
            }
        };
        if (i >= 29) {
            setTextCursorDrawable(drawable);
        } else {
            try {
                Field declaredField = TextView.class.getDeclaredField("mEditor");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(this);
                if (obj != null) {
                    Field declaredField2 = obj.getClass().getDeclaredField("mDrawableForCursor");
                    declaredField2.setAccessible(true);
                    declaredField2.set(obj, drawable);
                }
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        setFilters(new InputFilter[]{new InputFilter() { // from class: X.0XoY
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i3, int i4, Spanned spanned, int i5, int i6) {
                String string = charSequence.subSequence(i3, i4).toString();
                String strLJJIFFI = u.LJJIFFI(string, "\n", " ", false);
                if (Intrinsics.LJFF(string, strLJJIFFI)) {
                    return null;
                }
                return strLJJIFFI;
            }
        }, new InputFilter.LengthFilter() { // from class: X.0iny
            {
                super(125);
            }

            @Override // android.text.InputFilter.LengthFilter, android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i3, int i4, Spanned spanned, int i5, int i6) {
                Object c098200Yq;
                CharSequence charSequenceFilter = super.filter(charSequence, i3, i4, spanned, i5, i6);
                if (charSequenceFilter != null) {
                    C1735760vGo c1735760vGo = this.LL;
                    c1735760vGo.getClass();
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    if (jUptimeMillis - c1735760vGo.LLJILJILJ >= 2000) {
                        Resources resources = c1735760vGo.getResources();
                        int iN3 = C786410Ut5.n3(resources, "thoughtsRedesign_inbox_toast_maximumCharacters", "plurals", c1735760vGo.getContext().getPackageName());
                        boolean z = false;
                        String strLIZIZ = null;
                        Object obj2 = null;
                        if (iN3 != 0) {
                            try {
                                c098200Yq = resources.getQuantityString(iN3, 125, 125);
                                C189200o6.m2constructorimpl(c098200Yq);
                            } catch (Throwable th2) {
                                TryCatchGuardChecker.doCheck(th2);
                                c098200Yq = new C098200Yq(th2);
                                C189200o6.m2constructorimpl(c098200Yq);
                            }
                            if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                                obj2 = c098200Yq;
                            }
                            strLIZIZ = (String) obj2;
                        }
                        if (strLIZIZ == null || a0.LJJJIL(strLIZIZ)) {
                            z = true;
                        }
                        if (z) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("Maximum ");
                            sbLIZ.append(125);
                            sbLIZ.append(" characters");
                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        }
                        c1735760vGo.LLJILJILJ = jUptimeMillis;
                        C1389890mGx c1389890mGx = new C1389890mGx(c1735760vGo);
                        c1389890mGx.LJIIJ(strLIZIZ);
                        c1389890mGx.LIZLLL(2000L);
                        c1389890mGx.LJIIJJI();
                    }
                    SocialThoughtService socialThoughtService = (SocialThoughtService) PluggableExtentionKt.pluggableSpi$default(SocialThoughtService.class, false, false, false, 14, null);
                    if (socialThoughtService != null && socialThoughtService.LIZIZ() != null) {
                        C341220DZg.LJIILJJIL();
                    }
                }
                return charSequenceFilter;
            }
        }});
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1h, getContext());
        if (numLIZJ2 != null) {
            currentTextColor = numLIZJ2.intValue();
        } else {
            currentTextColor = getCurrentTextColor();
        }
        setTextColor(currentTextColor);
        Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.a1k, getContext());
        if (numLIZJ3 != null) {
            iIntValue2 = numLIZJ3.intValue();
        } else {
            iIntValue2 = 2046820352;
        }
        setHintTextColor(iIntValue2);
        setOnEditorActionListener(new C1265830j2r(this, 4));
        LJIIJJI();
        addTextChangedListener(new C1775980wJg(this, 10));
    }

    public final void LJIIIZ(int i) throws Throwable {
        int i2;
        int iLIZLLL;
        if (!this.LLJI && (i2 = this.LLIZ) != 0) {
            if (this.LLJIJIL != i2) {
                this.LLJIJIL = i2;
                setTuxFont(i2);
                this.LLJILJIL = C0DIW.LIZLLL(i2);
            }
            List<Pair<Integer, Integer>> list = this.LLIZLLLIL;
            if (list == null || list.isEmpty() || (iLIZLLL = C0DIW.LIZLLL(this.LLIZ)) <= 0) {
                return;
            }
            Editable editableR = C2204961BRm.r(this, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmnYJbP0HxsIa5vyM7VV+FlmMqP4GA+SKQNJiHafJfBQRWaRAk+fbygYcvQDK3yXQVhxA==", null));
            if (i > 0 && editableR != null && editableR.length() != 0) {
                this.LLJI = true;
                try {
                    int iLIZ = C0DIW.LIZ(editableR, getPaint(), i, getResources().getDisplayMetrics().density, list, false);
                    if (iLIZ > 0 && iLIZ != this.LLJILJIL) {
                        this.LLJILJIL = iLIZ;
                        setTextSize(1, iLIZ);
                    }
                    this.LLJI = false;
                    return;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    this.LLJI = false;
                    throw th;
                }
            }
            if (iLIZLLL != this.LLJILJIL) {
                this.LLJILJIL = iLIZLLL;
                setTextSize(1, iLIZLLL);
            }
        }
    }

    public final void setAutoSizeSteps(List<Pair<Integer, Integer>> list) {
        if (Intrinsics.LJFF(this.LLIZLLLIL, list)) {
            return;
        }
        this.LLIZLLLIL = list;
        LJIIIIZZ();
    }

    public final void setMaxFontSize(int i) {
        if (this.LLIZ == i) {
            return;
        }
        this.LLIZ = i;
        LJIIIIZZ();
    }

    public final void setPrompt(String str) {
        this.LLJ = str;
        LJIIJ();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) throws Throwable {
        int size = View.MeasureSpec.getSize(i);
        if (size > 0) {
            LJIIIZ((size - getPaddingLeft()) - getPaddingRight());
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 && i > 0) {
            LJIIIIZZ();
        }
    }
}
