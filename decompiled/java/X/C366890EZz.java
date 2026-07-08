package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS1S0101002_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EZz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C366890EZz extends View {
    public final Paint LL;
    public final boolean LLILLJJLI;
    public boolean LLILLL;
    public float LLILZ;
    public float LLILZIL;
    public Integer LLILZLL;
    public Integer LLIZ;
    public Integer LLIZLLLIL;
    public int LLJ;
    public C0ECX LLJI;
    public C0ECX LLJIJIL;
    public C0ECX LLJILJIL;
    public float LLJILJILJ;
    public EnumC360750ECj LLJILLL;
    public float LLJJ;
    public float LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJI;
    public boolean LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public boolean LLJJJ;
    public InterfaceC1631630sYr<? super Float, ? super Float, ? super Boolean, ? super EnumC360750ECj, Unit> LLJJJIL;
    public Function1<? super String, Unit> LLJJJJ;
    public Function0<Unit> LLJJJJJIL;
    public Function1<? super String, Unit> LLJJJJLIIL;
    public Function1<? super EnumC360750ECj, Boolean> LLJJL;
    public EnumC366900Ea0 LLJJLIIIJLLLLLLLZ;
    public final Map<EnumC366900Ea0, C366910Ea1> LLJL;

    public final boolean LIZJ() {
        return this.LLJILLL == EnumC360750ECj.COMBO;
    }

    public final void LJ() {
        if (this.LLJJIJI && LIZLLL(EnumC360750ECj.ENTER)) {
            float maxEndTimeForEnter = getMaxEndTimeForEnter();
            C0ECX enterTime = getEnterTime();
            if (enterTime != null) {
                C0ECX enterTime2 = getEnterTime();
                enterTime.LIZIZ = Math.min(enterTime2 != null ? enterTime2.LIZIZ : 0.0f, maxEndTimeForEnter);
            }
        }
        if (this.LLJJIJIIJIL && this.LLJILLL == EnumC360750ECj.COMBO) {
            float minStartTimeForCombo = getMinStartTimeForCombo();
            C0ECX comboTime = getComboTime();
            float f = comboTime != null ? comboTime.LIZIZ : 1.0f;
            C0ECX comboTime2 = getComboTime();
            if (comboTime2 != null) {
                C0ECX comboTime3 = getComboTime();
                comboTime2.LIZ = C13LZ.LIZLLL(comboTime3 != null ? comboTime3.LIZ : 0.0f, minStartTimeForCombo, f);
            }
        }
        if (this.LLJJIJIL && this.LLJILLL == EnumC360750ECj.COMBO) {
            float maxEndTimeForCombo = getMaxEndTimeForCombo();
            C0ECX comboTime4 = getComboTime();
            float f2 = comboTime4 != null ? comboTime4.LIZ : 0.0f;
            C0ECX comboTime5 = getComboTime();
            if (comboTime5 != null) {
                C0ECX comboTime6 = getComboTime();
                comboTime5.LIZIZ = C13LZ.LIZLLL(comboTime6 != null ? comboTime6.LIZIZ : 0.0f, f2, maxEndTimeForCombo);
            }
        }
        if (this.LLJJJ && LIZLLL(EnumC360750ECj.EXIT)) {
            float minStartTimeForExit = getMinStartTimeForExit();
            C0ECX exitTime = getExitTime();
            if (exitTime != null) {
                C0ECX exitTime2 = getExitTime();
                exitTime.LIZ = Math.max(exitTime2 != null ? exitTime2.LIZ : 0.0f, minStartTimeForExit);
            }
        }
    }

    public final boolean LJIIJJI() {
        EnumC360750ECj enumC360750ECj = this.LLJILLL;
        return enumC360750ECj == EnumC360750ECj.ENTER || enumC360750ECj == EnumC360750ECj.EXIT;
    }

    private final float getMaxEndTimeForCombo() {
        C0ECX exitTime = getExitTime();
        if (exitTime != null) {
            return exitTime.LIZ;
        }
        return 1.0f;
    }

    private final float getMaxEndTimeForEnter() {
        if (getComboTime() != null) {
            C0ECX comboTime = getComboTime();
            if (comboTime != null) {
                return comboTime.LIZ;
            }
            return 0.0f;
        }
        if (getExitTime() == null) {
            return 1.0f;
        }
        C0ECX exitTime = getExitTime();
        if (exitTime != null) {
            return exitTime.LIZ;
        }
        return 0.0f;
    }

    private final float getMinStartTimeForCombo() {
        C0ECX enterTime = getEnterTime();
        if (enterTime != null) {
            return enterTime.LIZIZ;
        }
        return 0.0f;
    }

    private final float getMinStartTimeForExit() {
        C0ECX enterTime;
        if (getComboTime() != null) {
            C0ECX comboTime = getComboTime();
            if (comboTime != null) {
                return comboTime.LIZIZ;
            }
            return 0.0f;
        }
        if (getEnterTime() == null || (enterTime = getEnterTime()) == null) {
            return 0.0f;
        }
        return enterTime.LIZIZ;
    }

    public final boolean LJIIIZ() {
        if (getComboTime() == null) {
            return false;
        }
        C0ECX comboTime = getComboTime();
        float f = comboTime != null ? comboTime.LIZIZ : 0.0f;
        C0ECX comboTime2 = getComboTime();
        return Math.abs(f - (comboTime2 != null ? comboTime2.LIZ : 0.0f)) < 0.01f;
    }

    public final boolean LJIIJ() {
        if (getEnterTime() == null || getExitTime() == null) {
            return false;
        }
        C0ECX enterTime = getEnterTime();
        float f = enterTime != null ? enterTime.LIZIZ : 0.0f;
        C0ECX exitTime = getExitTime();
        return Math.abs(f - (exitTime != null ? exitTime.LIZ : 0.0f)) < 0.01f;
    }

    public final C0ECX getComboTime() {
        return this.LLJILJIL;
    }

    public final C0ECX getEnterTime() {
        return this.LLJI;
    }

    public final C0ECX getExitTime() {
        return this.LLJIJIL;
    }

    public final Function1<EnumC360750ECj, Boolean> getOnCheckDrawEnable() {
        return this.LLJJL;
    }

    public final Function1<String, Unit> getOnDragingTypeChange() {
        return this.LLJJJJ;
    }

    public final Function1<String, Unit> getOnEndTouch() {
        return this.LLJJJJLIIL;
    }

    public final Function0<Unit> getOnStartTouch() {
        return this.LLJJJJJIL;
    }

    public final InterfaceC1631630sYr<Float, Float, Boolean, EnumC360750ECj, Unit> getOnTimeChanged() {
        return this.LLJJJIL;
    }

    public final EnumC360750ECj getSelectedAnimType() {
        return this.LLJILLL;
    }

    public static int LIZ(int i) {
        return Color.argb(128, Color.red(i), Color.green(i), Color.blue(i));
    }

    private final void setBgColor(int i) {
        this.LLJ = i;
        invalidate();
    }

    private final void setComboColor(Integer num) {
        this.LLIZ = num;
        invalidate();
    }

    private final void setEnterColor(Integer num) {
        this.LLILZLL = num;
        invalidate();
    }

    private final void setExitColor(Integer num) {
        this.LLIZLLLIL = num;
        invalidate();
    }

    private final void setHandleBgColor(int i) {
        invalidate();
    }

    private final void setHandleRadius(float f) {
        this.LLILZ = f;
        this.LLJILJILJ = f * 2.5f;
        invalidate();
    }

    private final void setHandleStyle(EnumC366900Ea0 enumC366900Ea0) {
        this.LLJJLIIIJLLLLLLLZ = enumC366900Ea0;
        invalidate();
    }

    private final void setLineHeight(float f) {
        this.LLILZIL = f;
        invalidate();
    }

    public final boolean LIZLLL(EnumC360750ECj enumC360750ECj) {
        if (this.LLJJL != null) {
            if (LJIIJJI()) {
                Function1<? super EnumC360750ECj, Boolean> function1 = this.LLJJL;
                if (function1 == null) {
                    return false;
                }
                return function1.invoke(enumC360750ECj).booleanValue();
            }
            EnumC360750ECj enumC360750ECj2 = EnumC360750ECj.COMBO;
            if (enumC360750ECj != enumC360750ECj2 || this.LLJILLL != enumC360750ECj2) {
                return false;
            }
        }
        return true;
    }

    public final float LJIILIIL(float f) {
        if (this.LLILLJJLI) {
            return getWidth() - f;
        }
        return f;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        Float fValueOf;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        int iLIZ;
        float f11;
        float f12;
        float f13;
        int iLIZ2;
        super.onDraw(canvas);
        float height = getHeight() / 2.0f;
        float f14 = this.LLILZIL;
        float f15 = 2;
        float f16 = f14 / f15;
        Paint paint = this.LL;
        paint.setStrokeWidth(f14);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(this.LLJ);
        float f18 = 0.0f;
        float f19 = f16 + 0.0f;
        canvas.drawLine(LJIILIIL(f19), height, LJIILIIL(((getWidth() - 0.0f) - 0.0f) - f16), height, this.LL);
        int iLIZ3 = 0;
        if (getEnterTime() != null) {
            C0ECX enterTime = getEnterTime();
            if (enterTime != null) {
                f11 = enterTime.LIZIZ;
            } else {
                f11 = 0.0f;
            }
            C0ECX enterTime2 = getEnterTime();
            if (enterTime2 != null) {
                f12 = enterTime2.LIZ;
            } else {
                f12 = 0.0f;
            }
            if (f11 - f12 > 0.0f) {
                this.LL.setStyle(Paint.Style.STROKE);
                this.LL.setStrokeCap(Paint.Cap.ROUND);
                getEnterTime();
                C0ECX enterTime3 = getEnterTime();
                if (enterTime3 != null) {
                    f13 = enterTime3.LIZIZ;
                } else {
                    f13 = 0.0f;
                }
                Integer num = this.LLILZLL;
                if (num != null) {
                    iLIZ2 = num.intValue();
                } else {
                    iLIZ2 = 0;
                }
                Paint paint2 = this.LL;
                if (!LJIIJJI() || !LIZLLL(EnumC360750ECj.ENTER)) {
                    iLIZ2 = LIZ(iLIZ2);
                }
                paint2.setColor(iLIZ2);
                float fLJIILIIL = LJIILIIL(f19);
                float fLJIILIIL2 = LJIILIIL(((((getWidth() - 0.0f) - 0.0f) * f13) + 0.0f) - f16);
                Path path = new Path();
                path.moveTo(fLJIILIIL, height);
                path.lineTo(fLJIILIIL2, height);
                canvas.drawPath(path, this.LL);
                this.LL.setStrokeCap(Paint.Cap.BUTT);
                canvas.drawLine(fLJIILIIL2, height, fLJIILIIL2, height, this.LL);
            }
        }
        if (getComboTime() != null) {
            C0ECX comboTime = getComboTime();
            if (comboTime != null) {
                f7 = comboTime.LIZIZ;
            } else {
                f7 = 0.0f;
            }
            C0ECX comboTime2 = getComboTime();
            if (comboTime2 != null) {
                f8 = comboTime2.LIZ;
            } else {
                f8 = 0.0f;
            }
            if (f7 - f8 > 0.0f) {
                this.LL.setStyle(Paint.Style.STROKE);
                this.LL.setStrokeCap(Paint.Cap.ROUND);
                C0ECX comboTime3 = getComboTime();
                if (comboTime3 != null) {
                    f9 = comboTime3.LIZ;
                } else {
                    f9 = 0.0f;
                }
                C0ECX comboTime4 = getComboTime();
                if (comboTime4 != null) {
                    f10 = comboTime4.LIZIZ;
                } else {
                    f10 = 0.0f;
                }
                Integer num2 = this.LLIZ;
                if (num2 != null) {
                    iLIZ = num2.intValue();
                } else {
                    iLIZ = 0;
                }
                Paint paint3 = this.LL;
                if (this.LLJILLL != EnumC360750ECj.COMBO) {
                    iLIZ = LIZ(iLIZ);
                }
                paint3.setColor(iLIZ);
                canvas.drawLine(LJIILIIL((((getWidth() - 0.0f) - 0.0f) * f9) + 0.0f + f16), height, LJIILIIL(((((getWidth() - 0.0f) - 0.0f) * f10) + 0.0f) - f16), height, this.LL);
            }
        }
        if (getExitTime() != null) {
            C0ECX exitTime = getExitTime();
            if (exitTime != null) {
                f2 = exitTime.LIZIZ;
            } else {
                f2 = 0.0f;
            }
            C0ECX exitTime2 = getExitTime();
            if (exitTime2 != null) {
                f3 = exitTime2.LIZ;
            } else {
                f3 = 0.0f;
            }
            if (f2 - f3 > 0.0f) {
                this.LL.setStyle(Paint.Style.STROKE);
                this.LL.setStrokeCap(Paint.Cap.ROUND);
                C0ECX exitTime3 = getExitTime();
                if (exitTime3 != null) {
                    f4 = exitTime3.LIZ;
                } else {
                    f4 = 0.0f;
                }
                C0ECX exitTime4 = getExitTime();
                if (exitTime4 != null) {
                    f5 = exitTime4.LIZIZ;
                } else {
                    f5 = 0.0f;
                }
                Integer num3 = this.LLIZLLLIL;
                if (num3 != null) {
                    iLIZ3 = num3.intValue();
                }
                Paint paint4 = this.LL;
                if (!LJIIJJI() || !LIZLLL(EnumC360750ECj.EXIT)) {
                    iLIZ3 = LIZ(iLIZ3);
                }
                paint4.setColor(iLIZ3);
                C0ECX enterTime4 = getEnterTime();
                Float fValueOf2 = null;
                if (enterTime4 != null) {
                    fValueOf = Float.valueOf(enterTime4.LIZIZ);
                } else {
                    fValueOf = null;
                }
                C0ECX exitTime5 = getExitTime();
                if (exitTime5 != null) {
                    fValueOf2 = Float.valueOf(exitTime5.LIZ);
                }
                if (Intrinsics.LJ(fValueOf, fValueOf2)) {
                    f6 = f16 / f15;
                } else {
                    f6 = 0.0f;
                }
                canvas.drawLine(LJIILIIL((((getWidth() - 0.0f) - 0.0f) * f4) + 0.0f + f16 + f6), height, LJIILIIL(((((getWidth() - 0.0f) - 0.0f) * f5) + 0.0f) - f16), height, this.LL);
            }
        }
        EnumC360750ECj enumC360750ECj = this.LLJILLL;
        if (enumC360750ECj != null) {
            EnumC360750ECj enumC360750ECj2 = EnumC360750ECj.COMBO;
            if (enumC360750ECj == enumC360750ECj2) {
                if (getComboTime() != null && this.LLJILLL == enumC360750ECj2) {
                    C0ECX comboTime5 = getComboTime();
                    if (comboTime5 != null) {
                        f = comboTime5.LIZ;
                    } else {
                        f = 0.0f;
                    }
                    C0ECX comboTime6 = getComboTime();
                    if (comboTime6 != null) {
                        f18 = comboTime6.LIZIZ;
                    }
                    Integer num4 = this.LLIZ;
                    if (num4 != null) {
                        int iIntValue = num4.intValue();
                        if (this.LLJJIJIL) {
                            LJII(getWidth() * f, height, iIntValue, canvas, true);
                            LJII(getWidth() * f18, height, iIntValue, canvas, false);
                            return;
                        } else {
                            LJII(getWidth() * f18, height, iIntValue, canvas, false);
                            LJII(getWidth() * f, height, iIntValue, canvas, true);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            if (!LJIIJJI()) {
                return;
            }
            if (this.LLJJIJI) {
                LJI(height, canvas);
                LJFF(height, canvas);
            } else {
                LJFF(height, canvas);
                LJI(height, canvas);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:148:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x016b  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r16) {
        /*
            Method dump skipped, instruction units count: 1233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C366890EZz.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setComboTime(C0ECX c0ecx) {
        LIZIZ(c0ecx, getEnterTime(), getExitTime());
        this.LLJILJIL = c0ecx;
        invalidate();
    }

    public final void setEnterTime(C0ECX c0ecx) {
        LIZIZ(c0ecx, getComboTime(), getExitTime());
        this.LLJI = c0ecx;
        invalidate();
    }

    public final void setExitTime(C0ECX c0ecx) {
        LIZIZ(c0ecx, getEnterTime(), getComboTime());
        this.LLJIJIL = c0ecx;
        invalidate();
    }

    public final void setOnCheckDrawEnable(Function1<? super EnumC360750ECj, Boolean> function1) {
        this.LLJJL = function1;
    }

    public final void setOnDragingTypeChange(Function1<? super String, Unit> function1) {
        this.LLJJJJ = function1;
    }

    public final void setOnEndTouch(Function1<? super String, Unit> function1) {
        this.LLJJJJLIIL = function1;
    }

    public final void setOnStartTouch(Function0<Unit> function0) {
        this.LLJJJJJIL = function0;
    }

    public final void setOnTimeChanged(InterfaceC1631630sYr<? super Float, ? super Float, ? super Boolean, ? super EnumC360750ECj, Unit> interfaceC1631630sYr) {
        this.LLJJJIL = interfaceC1631630sYr;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setSelectedAnimType(java.lang.String r5) {
        /*
            r4 = this;
            r3 = 0
            r4.LLILLL = r3
            r4.LLJJIII = r3
            int r2 = r5.hashCode()
            r0 = -510575962(0xffffffffe1913aa6, float:-3.348755E20)
            r1 = 1
            if (r2 == r0) goto L3c
            r0 = 41552559(0x27a0aaf, float:1.8370165E-37)
            if (r2 == r0) goto L2d
            r0 = 1307747558(0x4df2a4e6, float:5.0886163E8)
            if (r2 != r0) goto L4b
            java.lang.String r0 = "out_video_anim"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L4b
            r4.LLJJJ = r1
            r4.LLJJIJI = r3
            X.0ECj r0 = X.EnumC360750ECj.EXIT
        L27:
            r4.LLJILLL = r0
            r4.invalidate()
            return
        L2d:
            java.lang.String r0 = "in_video_anim"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L4b
            r4.LLJJIJI = r1
            r4.LLJJJ = r3
            X.0ECj r0 = X.EnumC360750ECj.ENTER
            goto L27
        L3c:
            java.lang.String r0 = "combo_video_anim"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L4b
            r4.LLJJIJIIJIL = r1
            r4.LLJJIJIL = r3
            X.0ECj r0 = X.EnumC360750ECj.COMBO
            goto L27
        L4b:
            r0 = 0
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C366890EZz.setSelectedAnimType(java.lang.String):void");
    }

    public C366890EZz(Context context, AttributeSet attributeSet) {
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        super(context, attributeSet, 0);
        Paint paint = new Paint(1);
        this.LL = paint;
        this.LLILLJJLI = C426750GoL.LIZLLL(context);
        float fLIZIZ = C0EGK.LIZIZ() * 16.0f;
        float fLIZIZ2 = C0EGK.LIZIZ() * 4.0f;
        Integer numLJIIIIZZ = LJIIIIZZ(context, Integer.valueOf(R.attr.ob));
        Integer numLJIIIIZZ2 = LJIIIIZZ(context, Integer.valueOf(R.attr.ny));
        Integer numLJIIIIZZ3 = LJIIIIZZ(context, Integer.valueOf(R.attr.os));
        Integer numLJIIIIZZ4 = LJIIIIZZ(context, Integer.valueOf(R.attr.a03));
        if (numLJIIIIZZ4 != null) {
            iIntValue = numLJIIIIZZ4.intValue();
        } else {
            iIntValue = 0;
        }
        this.LLILZ = fLIZIZ;
        this.LLILZIL = fLIZIZ2;
        this.LLILZLL = numLJIIIIZZ;
        this.LLIZ = numLJIIIIZZ2;
        this.LLIZLLLIL = numLJIIIIZZ3;
        this.LLJ = iIntValue;
        this.LLJILJILJ = 1.5f * fLIZIZ;
        this.LLJJ = -1.0f;
        this.LLJJI = -1.0f;
        EnumC366900Ea0 enumC366900Ea0 = EnumC366900Ea0.ROUNDED;
        this.LLJJLIIIJLLLLLLLZ = enumC366900Ea0;
        this.LLJL = C2097908Jt.LIZJ(new Pair(enumC366900Ea0, new C366910Ea1(fLIZIZ, context)));
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.AnimationTimelineSeekBar, 0, 0);
        try {
            this.LLILZ = typedArrayObtainStyledAttributes.getDimension(R$styleable.AnimationTimelineSeekBar_handleRadius, fLIZIZ);
            this.LLILZIL = typedArrayObtainStyledAttributes.getDimension(R$styleable.AnimationTimelineSeekBar_lineHeight, fLIZIZ2);
            int i = R$styleable.AnimationTimelineSeekBar_enterColor;
            if (numLJIIIIZZ != null) {
                iIntValue2 = numLJIIIIZZ.intValue();
            } else {
                iIntValue2 = 0;
            }
            this.LLILZLL = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(i, iIntValue2));
            int i2 = R$styleable.AnimationTimelineSeekBar_comboColor;
            if (numLJIIIIZZ2 != null) {
                iIntValue3 = numLJIIIIZZ2.intValue();
            } else {
                iIntValue3 = 0;
            }
            this.LLIZ = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(i2, iIntValue3));
            this.LLIZLLLIL = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(R$styleable.AnimationTimelineSeekBar_exitColor, numLJIIIIZZ3 != null ? numLJIIIIZZ3.intValue() : 0));
            this.LLJ = typedArrayObtainStyledAttributes.getColor(R$styleable.AnimationTimelineSeekBar_bgColor, iIntValue);
            typedArrayObtainStyledAttributes.getColor(R$styleable.AnimationTimelineSeekBar_handleBgColor, -1);
            typedArrayObtainStyledAttributes.recycle();
            paint.setStrokeCap(Paint.Cap.ROUND);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public static Integer LJIIIIZZ(Context context, Integer num) {
        if (num == null) {
            return null;
        }
        return C1308910kAL.LIZJ(num.intValue(), context);
    }

    public final void LJFF(float f, Canvas canvas) {
        float f2;
        if (getEnterTime() != null && LJIIJJI() && LIZLLL(EnumC360750ECj.ENTER)) {
            C0ECX enterTime = getEnterTime();
            if (enterTime != null) {
                f2 = enterTime.LIZIZ;
            } else {
                f2 = 0.0f;
            }
            Integer num = this.LLILZLL;
            if (num != null) {
                LJII(getWidth() * f2, f, num.intValue(), canvas, false);
            }
        }
    }

    public final void LJI(float f, Canvas canvas) {
        float f2;
        if (getExitTime() != null && LJIIJJI() && LIZLLL(EnumC360750ECj.EXIT)) {
            C0ECX exitTime = getExitTime();
            if (exitTime != null) {
                f2 = exitTime.LIZ;
            } else {
                f2 = 0.0f;
            }
            Integer num = this.LLIZLLLIL;
            if (num != null) {
                LJII(getWidth() * f2, f, num.intValue(), canvas, true);
            }
        }
    }

    public static void LIZIZ(C0ECX c0ecx, C0ECX c0ecx2, C0ECX c0ecx3) {
        if (c0ecx != null) {
            if (c0ecx2 != null && c0ecx.LIZ < c0ecx2.LIZIZ && c0ecx.LIZIZ > c0ecx2.LIZ) {
                c0ecx.LIZIZ = c0ecx2.LIZ;
            }
            if (c0ecx3 != null) {
                float f = c0ecx.LIZ;
                float f2 = c0ecx3.LIZIZ;
                if (f < f2 && c0ecx.LIZIZ > c0ecx3.LIZ) {
                    c0ecx.LIZ = f2;
                }
            }
        }
    }

    public static boolean LJIIL(C366890EZz c366890EZz, float f, float f2, float f3, float f4) {
        float f5 = c366890EZz.LLJILJILJ;
        c366890EZz.getClass();
        if (Math.abs(f - f3) < f5 && Math.abs(f2 - f4) < f5) {
            return true;
        }
        return false;
    }

    public final void LJII(float f, float f2, int i, Canvas canvas, boolean z) {
        float width;
        int iIntValue;
        int i2;
        int i3;
        Integer numLIZJ;
        float f3 = this.LLILZ;
        float f4 = f + f3;
        if (f - f3 < 0.0f) {
            width = (f3 / 2) + 0.0f;
        } else if (f4 > getWidth() - 0.0f) {
            width = (getWidth() - 0.0f) - (this.LLILZ / 2);
        } else {
            width = f;
        }
        C366910Ea1 c366910Ea1 = this.LLJL.get(this.LLJJLIIIJLLLLLLLZ);
        if (c366910Ea1 != null) {
            float fLJIILIIL = LJIILIIL(width);
            Paint paint = this.LL;
            float fLIZIZ = C0EGK.LIZIZ() * 4.0f;
            float fLIZIZ2 = C0EGK.LIZIZ() * 2.0f;
            Context context = c366910Ea1.LIZ;
            if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.zj, context)) != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = -1;
            }
            paint.setShadowLayer(fLIZIZ, 0.0f, fLIZIZ2, iIntValue);
            float f5 = c366910Ea1.LIZIZ * 1.0f;
            float f6 = 1.25f * f5;
            float f7 = 2;
            float f8 = f5 / f7;
            float f9 = f6 / f7;
            float fLIZ = C0EGK.LIZ(6);
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(-1);
            canvas.drawRoundRect(fLJIILIIL - f8, f2 - f9, fLJIILIIL + f8, f2 + f9, fLIZ, fLIZ, paint);
            paint.clearShadowLayer();
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(C0EGK.LIZIZ() * 2.0f);
            paint.setStrokeJoin(Paint.Join.ROUND);
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setColor(i);
            float f10 = (c366910Ea1.LIZIZ * 5.0f) / 8.0f;
            float f11 = 1.0f * f10;
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS1S0101002_5(c366910Ea1, f10, f11, i, 1));
            C01GW c01gwLIZIZ2 = C452501pT.LIZIZ(new AwS1S0101002_5(c366910Ea1, f10, f11, i, 0));
            float f12 = f10 / f7;
            float f13 = fLJIILIIL - f12;
            float f14 = f11 / f7;
            float f15 = f2 - f14;
            float f16 = fLJIILIIL + f12;
            float f18 = f2 + f14;
            if (((Boolean) c366910Ea1.LIZLLL.getValue()).booleanValue()) {
                i3 = -((int) (f16 + f10));
                i2 = -((int) (f13 + f10));
            } else {
                i2 = (int) f13;
                i3 = (int) f16;
            }
            if (z) {
                ((Drawable) c01gwLIZIZ2.getValue()).getBounds().set(i2, (int) f15, i3, (int) f18);
                ((TuxIconDrawable) c01gwLIZIZ2.getValue()).draw(canvas);
                return;
            }
            ((Drawable) c01gwLIZIZ.getValue()).getBounds().set(i2, (int) f15, i3, (int) f18);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("drawArrow: rightIcon = ");
            sbLIZ.append(((Drawable) c01gwLIZIZ.getValue()).getBounds().left);
            sbLIZ.append(", ");
            sbLIZ.append(((Drawable) c01gwLIZIZ.getValue()).getBounds().right);
            sbLIZ.append(' ');
            C2188811AlT.LIZIZ(sbLIZ);
            ((TuxIconDrawable) c01gwLIZIZ.getValue()).draw(canvas);
        }
    }
}
