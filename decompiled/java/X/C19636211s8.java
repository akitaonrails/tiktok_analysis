package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;
import java.util.Calendar;

/* JADX INFO: renamed from: X.11s8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19636211s8 extends LinearLayout {
    public Calendar LL;
    public C19642111t5 LLILLJJLI;
    public C19642111t5 LLILLL;
    public C19642111t5 LLILZ;
    public final LayoutInflater LLILZIL;
    public InterfaceC19638311sT LLILZLL;

    public final void LIZIZ() {
        C19637611sM c19637611sM;
        C19642111t5 c19642111t5 = this.LLILLJJLI;
        if (c19642111t5 == null) {
            c19642111t5 = null;
        }
        int currentPosition = c19642111t5.getCurrentPosition();
        C19642111t5 c19642111t52 = this.LLILLL;
        if (c19642111t52 == null) {
            c19642111t52 = null;
        }
        int currentPosition2 = c19642111t52.getCurrentPosition();
        Calendar calendar = this.LL;
        if (calendar == null) {
            calendar = null;
        }
        int i = calendar.get(11);
        int i2 = calendar.get(12);
        if (currentPosition == 0) {
            if (currentPosition2 > i) {
                i2 = 0;
            }
            c19637611sM = new C19637611sM(i, 23, i2, 59);
        } else if (currentPosition != 30) {
            c19637611sM = new C19637611sM(0, 23, 0, 59);
        } else {
            if (currentPosition2 < i) {
                i2 = 59;
            }
            c19637611sM = new C19637611sM(0, i, 0, i2);
        }
        C19642111t5 c19642111t53 = this.LLILLL;
        if (c19642111t53 == null) {
            c19642111t53 = null;
        }
        c19642111t53.setMinValue(c19637611sM.LIZ);
        C19642111t5 c19642111t54 = this.LLILLL;
        if (c19642111t54 == null) {
            c19642111t54 = null;
        }
        c19642111t54.setMaxValue(c19637611sM.LIZIZ);
        C19642111t5 c19642111t55 = this.LLILLL;
        if (c19642111t55 == null) {
            c19642111t55 = null;
        }
        int currentPosition3 = c19642111t55.getCurrentPosition();
        int i3 = c19637611sM.LIZ;
        if (currentPosition3 < i3) {
            C19642111t5 c19642111t56 = this.LLILLL;
            if (c19642111t56 == null) {
                c19642111t56 = null;
            }
            c19642111t56.LJI(i3);
        }
        C19642111t5 c19642111t57 = this.LLILLL;
        if (c19642111t57 == null) {
            c19642111t57 = null;
        }
        int currentPosition4 = c19642111t57.getCurrentPosition();
        int i4 = c19637611sM.LIZIZ;
        if (currentPosition4 > i4) {
            C19642111t5 c19642111t58 = this.LLILLL;
            if (c19642111t58 == null) {
                c19642111t58 = null;
            }
            c19642111t58.LJI(i4);
        }
        C19642111t5 c19642111t59 = this.LLILLL;
        if (c19642111t59 == null) {
            c19642111t59 = null;
        }
        c19642111t59.requestLayout();
        C19642111t5 c19642111t510 = this.LLILZ;
        if (c19642111t510 == null) {
            c19642111t510 = null;
        }
        c19642111t510.setMinValue(c19637611sM.LIZJ);
        C19642111t5 c19642111t511 = this.LLILZ;
        if (c19642111t511 == null) {
            c19642111t511 = null;
        }
        c19642111t511.setMaxValue(c19637611sM.LIZLLL);
        C19642111t5 c19642111t512 = this.LLILZ;
        if (c19642111t512 == null) {
            c19642111t512 = null;
        }
        int currentPosition5 = c19642111t512.getCurrentPosition();
        int i5 = c19637611sM.LIZJ;
        if (currentPosition5 < i5) {
            C19642111t5 c19642111t513 = this.LLILZ;
            if (c19642111t513 == null) {
                c19642111t513 = null;
            }
            c19642111t513.LJI(i5);
        }
        C19642111t5 c19642111t514 = this.LLILZ;
        if (c19642111t514 == null) {
            c19642111t514 = null;
        }
        int currentPosition6 = c19642111t514.getCurrentPosition();
        int i6 = c19637611sM.LIZLLL;
        if (currentPosition6 > i6) {
            C19642111t5 c19642111t515 = this.LLILZ;
            if (c19642111t515 == null) {
                c19642111t515 = null;
            }
            c19642111t515.LJI(i6);
        }
        C19642111t5 c19642111t516 = this.LLILZ;
        (c19642111t516 != null ? c19642111t516 : null).requestLayout();
    }

    public final int getDayOfMonth() {
        Calendar calendar = this.LL;
        if (calendar == null) {
            calendar = null;
        }
        return calendar.get(5);
    }

    public final int getMonth() {
        Calendar calendar = this.LL;
        if (calendar == null) {
            calendar = null;
        }
        return calendar.get(2) + 1;
    }

    public final int getYear() {
        Calendar calendar = this.LL;
        if (calendar == null) {
            calendar = null;
        }
        return calendar.get(1);
    }

    public final void setDateChangedListener(InterfaceC19638311sT interfaceC19638311sT) {
        this.LLILZLL = interfaceC19638311sT;
    }

    public final void setSelectTimeMiles(long j) {
        Calendar calendar = this.LL;
        C19642111t5 c19642111t5 = null;
        if (calendar == null) {
            calendar = null;
        }
        long timeInMillis = j - calendar.getTimeInMillis();
        Calendar calendar2 = this.LL;
        if (calendar2 == null) {
            calendar2 = null;
        }
        float f = timeInMillis;
        int i = (int) (f / 8.64E7f);
        int i2 = (int) (((int) (f - (i * 8.64E7f))) / 3600000.0f);
        float f2 = calendar2.get(12) + ((int) (((int) (r2 - (i2 * 3600000.0f))) / 60000.0f));
        int i3 = (int) (f2 % 60.0f);
        float f3 = ((int) (f2 / 60.0f)) + i2 + calendar2.get(11);
        int i4 = (int) (f3 % 24.0f);
        int i5 = i + ((int) (f3 / 24.0f));
        C19642111t5 c19642111t52 = this.LLILLJJLI;
        if (c19642111t52 == null) {
            c19642111t52 = null;
        }
        c19642111t52.LJI(i5);
        C19642111t5 c19642111t53 = this.LLILLL;
        if (c19642111t53 == null) {
            c19642111t53 = null;
        }
        c19642111t53.LJI(i4);
        C19642111t5 c19642111t54 = this.LLILZ;
        if (c19642111t54 != null) {
            c19642111t5 = c19642111t54;
        }
        c19642111t5.LJI(i3);
        LIZIZ();
    }

    public C19636211s8(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLILZIL = (LayoutInflater) C786410Ut5.H2(context, "layout_inflater");
    }

    public static void LIZ(int i, C19642111t5 c19642111t5) {
        c19642111t5.setMinValue(0);
        c19642111t5.setMaxValue(i);
        c19642111t5.setPickerItemCount(5);
        c19642111t5.setWrapSelectorWheel(false);
        c19642111t5.setSelectedTextColor(R.color.b6);
        c19642111t5.setUnselectedTextColor(R.color.cw);
    }
}
