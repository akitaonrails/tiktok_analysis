package X;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0FLy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C388720FLy extends C1DYT {
    public C1664680tQA<TextStickerModel> LLIZLLLIL;
    public final C01GW LLJ;
    public Float LLJI;
    public C0FM5 LLJIJIL;
    public boolean LLJILJIL;

    public C0FM0 getTextSizeHelper() {
        return (C0FM0) this.LLJ.getValue();
    }

    public final float getTouchDownSize() {
        Float f = this.LLJI;
        if (f != null) {
            return f.floatValue();
        }
        return 28.0f;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return !this.LLJILJIL;
    }

    public final float getTouchUpSize() {
        C0FM0 textSizeHelper = getTextSizeHelper();
        C0FM2<?> c0fm2 = textSizeHelper.LIZJ;
        if (c0fm2 == null) {
            return 28.0f;
        }
        float fLIZJ = c0fm2.LIZJ();
        float progress = textSizeHelper.LIZ.getProgress();
        float min = Build.VERSION.SDK_INT >= 26 ? textSizeHelper.LIZ.getMin() : 0;
        float max = textSizeHelper.LIZ.getMax();
        float f = textSizeHelper.LIZLLL;
        float f2 = textSizeHelper.LJ;
        if (progress > min) {
            f = progress >= max ? f2 : ((f * (max - progress)) + (f2 * (progress - min))) / (max - min);
        }
        if (Float.valueOf(fLIZJ * f) != null) {
            return C814420VxA.LIZIZ(r0.floatValue());
        }
        return 28.0f;
    }

    @Override // X.C1DYT, android.widget.AbsSeekBar, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0FM5 c0fm5;
        int min = 0;
        if (getVisibility() != 0 || this.LLIZLLLIL == null) {
            return false;
        }
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (zOnTouchEvent) {
            int action = motionEvent.getAction();
            Float fValueOf = null;
            if (action != 0) {
                if (action == 1 || action == 3) {
                    Float f = this.LLJI;
                    C0FM0 textSizeHelper = getTextSizeHelper();
                    C0FM2<?> c0fm2 = textSizeHelper.LIZJ;
                    if (c0fm2 != null) {
                        float fLIZJ = c0fm2.LIZJ();
                        float progress = textSizeHelper.LIZ.getProgress();
                        if (Build.VERSION.SDK_INT >= 26) {
                            min = textSizeHelper.LIZ.getMin();
                        }
                        float f2 = min;
                        float max = textSizeHelper.LIZ.getMax();
                        float f3 = textSizeHelper.LIZLLL;
                        float f4 = textSizeHelper.LJ;
                        if (progress > f2) {
                            if (progress >= max) {
                                f3 = f4;
                            } else {
                                f3 = ((f3 * (max - progress)) + (f4 * (progress - f2))) / (max - f2);
                            }
                        }
                        if (Float.valueOf(fLIZJ * f3) != null) {
                            fValueOf = Float.valueOf(C814420VxA.LIZIZ(r0.floatValue()));
                        }
                    }
                    if (!Intrinsics.LJ(f, fValueOf) && (c0fm5 = this.LLJIJIL) != null) {
                        c0fm5.LIZ();
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("prevSize: ");
                    sbLIZ.append(f);
                    sbLIZ.append(", size: ");
                    sbLIZ.append(fValueOf);
                    C2188811AlT.LIZIZ(sbLIZ);
                    return zOnTouchEvent;
                }
            } else {
                C0FM2<?> c0fm22 = getTextSizeHelper().LIZJ;
                if (c0fm22 != null) {
                    fValueOf = Float.valueOf(c0fm22.LIZLLL());
                }
                this.LLJI = fValueOf;
                return zOnTouchEvent;
            }
        }
        return zOnTouchEvent;
    }

    public final void setEnableTextAnimOpt(boolean z) {
        this.LLJILJIL = z;
    }

    public final void setOnAdjustTextRollbarListener(Function0<Unit> function0) {
        getTextSizeHelper().LJII = function0;
    }

    public final void setOnTextSizeChangedListener(C0FM5 c0fm5) {
        this.LLJIJIL = c0fm5;
    }

    public C388720FLy(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1271));
    }
}
