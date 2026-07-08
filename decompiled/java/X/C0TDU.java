package X;

import android.graphics.RectF;
import com.zhiliaoapp.musically.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0TDU, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TDU {
    public static final /* synthetic */ C0TDU[] LLIZ;
    public static final /* synthetic */ C2254308sP LLIZLLLIL;
    public static final C0TDU LeftBottom;
    public static final C0TDU LeftTop;
    public static final C0TDU RightBottom;
    public static final C0TDU RightTop;
    public final int LL;
    public final String LLILLJJLI;
    public final RectF LLILLL;
    public final RectF LLILZ;
    public final RectF LLILZIL;
    public final RectF LLILZLL;

    public static InterfaceC2044707zh<C0TDU> getEntries() {
        return LLIZLLLIL;
    }

    static {
        C0TDU c0tdu = new C0TDU("LeftTop", 0, R.id.gb_, "up_left", new RectF(0.032f, 0.2044335f, 0.45866665f, 0.35221675f), new RectF(0.033333335f, 0.240625f, 0.36666667f, 0.38125f), new RectF(0.03f, 0.06486487f, 0.23f, 0.38918918f), new RectF(0.025f, 0.06666667f, 0.2125f, 0.31666666f));
        LeftTop = c0tdu;
        C0TDU c0tdu2 = new C0TDU("RightTop", 1, R.id.gbb, "up_right", new RectF(0.5413333f, 0.2044335f, 0.968f, 0.35221675f), new RectF(0.6333333f, 0.240625f, 0.96666664f, 0.38125f), new RectF(0.77f, 0.06486487f, 0.97f, 0.38918918f), new RectF(0.7875f, 0.06666667f, 0.0234375f, 0.31666666f));
        RightTop = c0tdu2;
        C0TDU c0tdu3 = new C0TDU("LeftBottom", 2, R.id.gb9, "down_left", new RectF(0.032f, 0.47536945f, 0.45866665f, 0.62315273f), new RectF(0.033333335f, 0.353125f, 0.36666667f, 0.49375f), new RectF(0.03f, 0.6108108f, 0.23f, 0.9351351f), new RectF(0.025f, 0.68333334f, 0.2125f, 0.93333334f));
        LeftBottom = c0tdu3;
        C0TDU c0tdu4 = new C0TDU("RightBottom", 3, R.id.gba, "down_right", new RectF(0.5413333f, 0.47536945f, 0.968f, 0.62315273f), new RectF(0.6333333f, 0.353125f, 0.96666664f, 0.49375f), new RectF(0.77f, 0.6108108f, 0.97f, 0.9351351f), new RectF(0.7875f, 0.68333334f, 0.0234375f, 0.93333334f));
        RightBottom = c0tdu4;
        C0TDU[] c0tduArr = {c0tdu, c0tdu2, c0tdu3, c0tdu4};
        LLIZ = c0tduArr;
        LLIZLLLIL = new C2254308sP(c0tduArr);
    }

    public static C0TDU[] values() {
        return (C0TDU[]) LLIZ.clone();
    }

    public final String getLogString() {
        return this.LLILLJJLI;
    }

    public final int getResId() {
        return this.LL;
    }

    public static C0TDU valueOf(String str) {
        return (C0TDU) C08FF.LIZ(C0TDU.class, str);
    }

    public final RectF getRectPort(boolean z, boolean z2, float f) {
        RectF rectF;
        if (z2) {
            if (z) {
                rectF = this.LLILZLL;
            } else {
                rectF = this.LLILZIL;
            }
        } else if (z) {
            rectF = this.LLILZ;
        } else {
            rectF = this.LLILLL;
        }
        if (f != 0.0f && Math.abs(f) <= Float.MAX_VALUE) {
            RectF rectF2 = new RectF(rectF);
            rectF2.bottom = rectF2.top + ((rectF2.right - rectF2.left) / f);
            return rectF2;
        }
        return rectF;
    }

    public final RectF getRectPortNew(boolean z, boolean z2, float f) {
        RectF rectF;
        if (z2) {
            if (z) {
                rectF = this.LLILZLL;
            } else {
                rectF = this.LLILZIL;
            }
        } else if (z) {
            rectF = this.LLILZ;
        } else {
            rectF = this.LLILLL;
        }
        if (f != 0.0f && Math.abs(f) <= Float.MAX_VALUE) {
            RectF rectF2 = new RectF(rectF);
            float f2 = rectF2.bottom;
            float f3 = rectF2.top;
            rectF2.bottom = f3 + (((f2 - f3) / 0.46182266f) * f);
            return rectF2;
        }
        return rectF;
    }

    public C0TDU(String str, int i, int i2, String str2, RectF rectF, RectF rectF2, RectF rectF3, RectF rectF4) {
        this.LL = i2;
        this.LLILLJJLI = str2;
        this.LLILLL = rectF;
        this.LLILZ = rectF2;
        this.LLILZIL = rectF3;
        this.LLILZLL = rectF4;
    }
}
