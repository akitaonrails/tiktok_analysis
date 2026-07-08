package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.12M5, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12M5 extends FrameLayout implements C12MA {
    public C12M4 LL;
    public C12M4 LLILLJJLI;
    public C12M4 LLILLL;
    public int LLILZ;
    public final int LLILZIL;
    public Paint LLILZLL;
    public final boolean LLIZ;
    public final boolean LLIZLLLIL;
    public String[] LLJ;
    public final String[] LLJI;
    public InterfaceC1194210hBL LLJIJIL;
    public final float LLJILJIL;
    public int LLJILJILJ;
    public int LLJILLL;
    public float LLJJ;
    public int LLJJI;
    public float LLJJIII;

    public static String LIZIZ(int i) {
        StringBuilder sb = new StringBuilder();
        String strValueOf = String.valueOf(i);
        if (strValueOf.length() < 2) {
            sb.append(CardStruct.IStatusCode.DEFAULT);
        }
        sb.append(strValueOf);
        return sb.toString();
    }

    private final void setupNumberPickerView(C12M4 c12m4) {
        float f = this.LLJILJIL;
        c12m4.setPadding(0, (int) (14 * f), 0, (int) (((double) f) * 11.5d));
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams((int) (60 * this.LLJILJIL), -2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c12m4);
        c12m4.setLayoutParams(layoutParams);
    }

    public final int[] LIZJ(int i) {
        int i2;
        int[] iArr = new int[3];
        this.LLILZ = i;
        int i3 = i / 60;
        int i4 = i3 / 60;
        int i5 = i3 - (i4 * 60);
        if (this.LLIZ) {
            i2 = i4 % 12;
        } else {
            i2 = i4 % 24;
        }
        String[] strArr = this.LLJ;
        if (strArr == null) {
            strArr = null;
        }
        int iIndexOf = Arrays.asList(Arrays.copyOf(strArr, strArr.length)).indexOf(LIZIZ(i2));
        String[] strArr2 = this.LLJI;
        int iIndexOf2 = Arrays.asList(Arrays.copyOf(strArr2, strArr2.length)).indexOf(LIZIZ(i5));
        iArr[0] = iIndexOf;
        iArr[1] = iIndexOf2;
        return iArr;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        RectF rectF = this.LLILLL.LLJJJJ;
        float f = rectF.top;
        float f2 = rectF.bottom;
        Paint paint = this.LLILZLL;
        canvas.drawLine(0.0f, f, getWidth(), f, paint);
        canvas.drawLine(0.0f, f2, getWidth(), f2, paint);
    }

    public final void setNonRecurrent(boolean z) {
        this.LLILLJJLI.setNonRecurrent(z);
        this.LLILLL.setNonRecurrent(z);
    }

    public final void setTime(int i) {
        int i2;
        int[] iArrLIZJ = LIZJ(i);
        if (this.LLIZ) {
            C12M4 c12m4 = this.LL;
            if (i < this.LLILZIL) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            c12m4.LJFF(i2);
        }
        this.LLILLJJLI.LJFF(iArrLIZJ[0]);
        this.LLILLL.LJFF(iArrLIZJ[1]);
    }

    public static void LJ(C12M4 c12m4, int i) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) c12m4.getLayoutParams();
        layoutParams.addRule(i);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c12m4);
        c12m4.setLayoutParams(layoutParams);
    }

    @Override // X.C12MA
    public final void LIZ(C12M4 c12m4, int i, int i2) {
        if (Intrinsics.LJFF(c12m4, this.LL)) {
            if (i == 0) {
                if (i2 == 1) {
                    this.LLILZ += this.LLILZIL;
                }
            } else if (i == 1 && i2 == 0) {
                this.LLILZ -= this.LLILZIL;
            }
        } else if (Intrinsics.LJFF(c12m4, this.LLILLJJLI)) {
            this.LLILZ += (i2 - i) * 60 * 60;
        } else if (Intrinsics.LJFF(c12m4, this.LLILLL)) {
            this.LLILZ += (i2 - i) * 60;
        }
        InterfaceC1194210hBL interfaceC1194210hBL = this.LLJIJIL;
        if (interfaceC1194210hBL != null) {
            interfaceC1194210hBL.LIZ(this.LLILZ);
        }
    }

    /* JADX WARN: Type inference failed for: r1v14, types: [X.12M7] */
    /* JADX WARN: Type inference failed for: r2v4, types: [X.12M7] */
    /* JADX WARN: Type inference failed for: r2v6, types: [X.12M7] */
    public C12M5(Context context, int i, boolean z, boolean z2) {
        int i2;
        super(context, null, 0);
        this.LLILZIL = 43200;
        String[] strArr = new String[60];
        for (int i3 = 0; i3 < 60; i3++) {
            strArr[i3] = "";
        }
        for (int i4 = 0; i4 < 60; i4++) {
            if (i4 < 10) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append('0');
                sbLIZ.append(i4);
                strArr[i4] = C2188811AlT.LIZIZ(sbLIZ);
            } else {
                strArr[i4] = String.valueOf(i4);
            }
        }
        this.LLJI = strArr;
        float f = getResources().getDisplayMetrics().density;
        this.LLJILJIL = f;
        this.LLIZ = z;
        this.LLIZLLLIL = z2;
        this.LLILZ = i;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, R$styleable.TimeWheelPicker, 0, 0);
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.ng, typedValue, true);
        this.LLJILLL = typedArrayObtainStyledAttributes.getColor(R$styleable.TimeWheelPicker_dividerColor, typedValue.data);
        this.LLJJ = typedArrayObtainStyledAttributes.getDimension(R$styleable.TimeWheelPicker_dividerStroke, 1.0f * f);
        TypedValue typedValue2 = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.a1h, typedValue2, true);
        int i5 = typedValue2.data;
        this.LLJILJILJ = i5;
        this.LLJJI = typedArrayObtainStyledAttributes.getColor(R$styleable.TimeWheelPicker_pickerTextColor, i5);
        this.LLJJIII = typedArrayObtainStyledAttributes.getDimension(R$styleable.TimeWheelPicker_pickerTextSize, f * 17.0f);
        typedArrayObtainStyledAttributes.recycle();
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        this.LLILLJJLI = new C12M4(getContext());
        this.LLILLL = new C12M4(getContext());
        setupNumberPickerView(this.LLILLJJLI);
        setupNumberPickerView(this.LLILLL);
        if (z) {
            this.LL = new C12M4(getContext());
            setupNumberPickerView(this.LL);
            LIZLLL(relativeLayout, layoutParams, 65, this.LLIZ);
            String[] strArr2 = new String[12];
            int i6 = 0;
            do {
                strArr2[i6] = "";
                i6++;
            } while (i6 < 12);
            strArr2[0] = "12";
            int i7 = 1;
            loop3: while (true) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append('0');
                sbLIZ2.append(i7);
                strArr2[i7] = C2188811AlT.LIZIZ(sbLIZ2);
                while (true) {
                    i7++;
                    if (i7 >= 12) {
                        break loop3;
                    } else if (i7 >= 10) {
                        strArr2[i7] = String.valueOf(i7);
                    }
                }
            }
            this.LLJ = strArr2;
            if (this.LLIZLLLIL) {
                LJ(this.LLILLJJLI, 20);
                LJ(this.LLILLL, 14);
                LJ(this.LL, 21);
                addView(relativeLayout);
            } else {
                LJ(this.LL, 20);
                LJ(this.LLILLJJLI, 14);
                LJ(this.LLILLL, 21);
                addView(relativeLayout);
            }
            this.LL.LLLF = this;
            String[] strArr3 = {getContext().getResources().getString(2131844870), getContext().getResources().getString(2131844871)};
            final C12M4 c12m4 = this.LL;
            c12m4.LLLF = this;
            ?? r2 = new Object(c12m4) { // from class: X.12M7
                public final C12M4 LIZ;

                public final C12M4 LIZ() {
                    this.LIZ.LJI();
                    this.LIZ.LJ();
                    this.LIZ.invalidate();
                    return this.LIZ;
                }

                {
                    this.LIZ = c12m4;
                }
            };
            c12m4.setMTextArray(strArr3);
            c12m4.setMEndNumber(1);
            c12m4.LLLIIII = true;
            if (this.LLILZ < this.LLILZIL) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            c12m4.LLJJ = i2;
            this.LL = r2.LIZ();
        } else {
            String[] strArr4 = new String[24];
            int i8 = 0;
            do {
                strArr4[i8] = "";
                i8++;
            } while (i8 < 24);
            int i9 = 0;
            loop6: while (true) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append('0');
                sbLIZ3.append(i9);
                strArr4[i9] = C2188811AlT.LIZIZ(sbLIZ3);
                while (true) {
                    i9++;
                    if (i9 >= 24) {
                        break loop6;
                    } else if (i9 >= 10) {
                        strArr4[i9] = String.valueOf(i9);
                    }
                }
            }
            this.LLJ = strArr4;
            LIZLLL(relativeLayout, layoutParams, 112, this.LLIZ);
            LJ(this.LLILLJJLI, 20);
            LJ(this.LLILLL, 21);
            addView(relativeLayout);
        }
        int[] iArrLIZJ = LIZJ(this.LLILZ);
        final C12M4 c12m42 = this.LLILLJJLI;
        c12m42.LLLF = this;
        this.LLILLL.LLLF = this;
        ?? r1 = new Object(c12m42) { // from class: X.12M7
            public final C12M4 LIZ;

            public final C12M4 LIZ() {
                this.LIZ.LJI();
                this.LIZ.LJ();
                this.LIZ.invalidate();
                return this.LIZ;
            }

            {
                this.LIZ = c12m42;
            }
        };
        String[] strArr5 = this.LLJ;
        c12m42.setMTextArray(strArr5 == null ? null : strArr5);
        String[] strArr6 = this.LLJ;
        c12m42.setMEndNumber((strArr6 != null ? strArr6 : null).length - 1);
        c12m42.LLLIIII = false;
        c12m42.LLJJ = iArrLIZJ[0];
        this.LLILLJJLI = r1.LIZ();
        final C12M4 c12m43 = this.LLILLL;
        ?? r22 = new Object(c12m43) { // from class: X.12M7
            public final C12M4 LIZ;

            public final C12M4 LIZ() {
                this.LIZ.LJI();
                this.LIZ.LJ();
                this.LIZ.invalidate();
                return this.LIZ;
            }

            {
                this.LIZ = c12m43;
            }
        };
        c12m43.setMTextArray(this.LLJI);
        c12m43.setMEndNumber(this.LLJI.length - 1);
        c12m43.LLLIIII = false;
        c12m43.LLJJ = iArrLIZJ[1];
        this.LLILLL = r22.LIZ();
        boolean z3 = this.LLIZ;
        if (z3) {
            this.LLILLJJLI.LLLFF = new C12M9() { // from class: X.12M6
                @Override // X.C12M9
                public final void LIZ() {
                    C12M5 c12m5 = this.LIZ;
                    C12M4 c12m44 = c12m5.LL;
                    if (c12m44.LLJJ == 0) {
                        c12m44.LJFF(1);
                        c12m5.LLILZ += c12m5.LLILZIL;
                    } else {
                        c12m44.LJFF(0);
                        c12m5.LLILZ -= c12m5.LLILZIL;
                    }
                    InterfaceC1194210hBL interfaceC1194210hBL = c12m5.LLJIJIL;
                    if (interfaceC1194210hBL != null) {
                        interfaceC1194210hBL.LIZ(c12m5.LLILZ);
                    }
                }
            };
        }
        int i10 = this.LLJJI;
        if (i10 != this.LLJILJILJ) {
            if (z3) {
                C12M4 c12m44 = this.LL;
                c12m44.LLJI = i10;
                c12m44.LIZLLL();
                c12m44.invalidate();
            }
            C12M4 c12m45 = this.LLILLJJLI;
            c12m45.LLJI = i10;
            c12m45.LIZLLL();
            c12m45.invalidate();
            C12M4 c12m46 = this.LLILLL;
            c12m46.LLJI = i10;
            c12m46.LIZLLL();
            c12m46.invalidate();
        }
        float f2 = this.LLJJIII;
        if (f2 != this.LLJILJIL * 17.0f) {
            if (this.LLIZ) {
                C12M4 c12m47 = this.LL;
                c12m47.LLJIJIL = f2;
                c12m47.LIZJ();
                c12m47.invalidate();
            }
            C12M4 c12m48 = this.LLILLJJLI;
            c12m48.LLJIJIL = f2;
            c12m48.LIZJ();
            c12m48.invalidate();
            C12M4 c12m49 = this.LLILLL;
            c12m49.LLJIJIL = f2;
            c12m49.LIZJ();
            c12m49.invalidate();
        }
        Paint paint = new Paint();
        this.LLILZLL = paint;
        paint.setColor(this.LLJILLL);
        this.LLILZLL.setStrokeWidth(this.LLJJ);
    }

    public final void LIZLLL(RelativeLayout relativeLayout, RelativeLayout.LayoutParams layoutParams, int i, boolean z) {
        int i2 = (int) (i * this.LLJILJIL);
        layoutParams.setMargins(i2, 0, i2, 0);
        C786410Ut5.e6(relativeLayout, layoutParams);
        relativeLayout.addView(this.LLILLJJLI);
        relativeLayout.addView(this.LLILLL);
        if (z) {
            relativeLayout.addView(this.LL);
        }
    }
}
