package X;

import android.view.LayoutInflater;
import android.widget.LinearLayout;
import java.util.Calendar;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10hv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public class C19318110hv extends LinearLayout implements InterfaceC19318310hx {
    public C12KT LL;
    public C12KT LLILLJJLI;
    public C12KT LLILLL;
    public LinearLayout LLILZ;
    public Calendar LLILZIL;
    public Calendar LLILZLL;
    public InterfaceC19298210ei LLIZ;
    public boolean LLIZLLLIL;
    public final LayoutInflater LLJ;

    public final int getDayOfMonth() {
        return this.LLILZIL.get(5);
    }

    public final int getMonth() {
        return this.LLILZIL.get(2) + 1;
    }

    public final int getYear() {
        return this.LLILZIL.get(1);
    }

    public final LinearLayout getContainer() {
        return this.LLILZ;
    }

    public final C12KT getDayOfMonthPicker() {
        return this.LLILLL;
    }

    public final LayoutInflater getLayoutInflater() {
        return this.LLJ;
    }

    public final C12KT getMonthPicker() {
        return this.LLILLJJLI;
    }

    public final C12KT getYearPicker() {
        return this.LL;
    }

    public final void LIZIZ(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(6, calendar.getActualMaximum(6));
        calendar.add(1, -1);
        if (calendar.getTime().before(date)) {
            calendar = Calendar.getInstance();
            calendar.set(date.getYear() + 1900, 11, 31);
        }
        setNonRecurrentForYear(true);
        LIZJ(date);
        setUpperBoundDate(calendar);
    }

    public final void LIZJ(Date date) {
        if (this.LLILZIL == null) {
            this.LLILZIL = Calendar.getInstance();
        }
        this.LLILZIL.setTime(date);
        C12KT c12kt = this.LLILLL;
        if (c12kt != null) {
            c12kt.LJFF(this.LLILZIL.getActualMaximum(5));
        }
        C12KT c12kt2 = this.LL;
        if (c12kt2 != null) {
            c12kt2.LJ(this.LLILZIL.get(1));
        }
        C12KT c12kt3 = this.LLILLJJLI;
        if (c12kt3 != null) {
            c12kt3.LJ(this.LLILZIL.get(2) + 1);
        }
        C12KT c12kt4 = this.LLILLL;
        if (c12kt4 != null) {
            c12kt4.LJ(this.LLILZIL.get(5));
        }
    }

    public final void setContainer(LinearLayout linearLayout) {
        this.LLILZ = linearLayout;
    }

    public final void setDayOfMonthPicker(C12KT c12kt) {
        this.LLILLL = c12kt;
    }

    public final void setLowerBoundDate(Calendar calendar) {
        C12KT c12kt;
        if (calendar != null && (c12kt = this.LL) != null) {
            c12kt.LLJJIII = calendar.get(1);
            c12kt.LJI();
            c12kt.LIZLLL();
            c12kt.invalidate();
        }
    }

    public final void setMonthPicker(C12KT c12kt) {
        this.LLILLJJLI = c12kt;
    }

    public final void setNonRecurrentForYear(boolean z) {
        C12KT c12kt = this.LL;
        if (c12kt != null) {
            c12kt.setNonRecurrent(z);
        }
    }

    public final void setUpperBoundDate(Calendar calendar) {
        C12KT c12kt;
        this.LLILZLL = calendar;
        if (calendar != null) {
            C12KT c12kt2 = this.LL;
            if (c12kt2 != null) {
                c12kt2.LJFF(calendar.get(1));
            }
            if (this.LLILZIL.get(1) == this.LLILZLL.get(1)) {
                C12KT c12kt3 = this.LLILLJJLI;
                if (c12kt3 != null) {
                    c12kt3.LJFF(this.LLILZLL.get(2) + 1);
                }
                if (this.LLILZIL.get(2) == this.LLILZLL.get(2) && (c12kt = this.LLILLL) != null) {
                    c12kt.LJFF(this.LLILZLL.get(5));
                }
            }
        }
    }

    public final void setYearPicker(C12KT c12kt) {
        this.LL = c12kt;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x006e, code lost:
    
        r2 = 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:123:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C19318110hv(android.content.Context r23, android.util.AttributeSet r24) {
        /*
            Method dump skipped, instruction units count: 702
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19318110hv.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    @Override // X.InterfaceC19318310hx
    public final void LIZ(C12KT c12kt, int i) {
        int actualMaximum;
        int i2 = 2;
        int i3 = 1;
        if (Intrinsics.LJFF(c12kt, this.LL)) {
            int i4 = this.LLILZIL.get(5);
            int i5 = this.LLILZIL.get(2);
            Calendar calendar = this.LLILZLL;
            Calendar calendar2 = this.LLILZIL;
            if (calendar != null && i == calendar.get(1)) {
                int i6 = calendar.get(2);
                if (i5 > i6) {
                    i5 = i6;
                }
                C12KT c12kt2 = this.LLILLJJLI;
                if (c12kt2 != null) {
                    c12kt2.LJFF(calendar.get(2) + 1);
                }
            } else {
                if (calendar2 != null) {
                    actualMaximum = calendar2.getActualMaximum(2);
                } else {
                    actualMaximum = 11;
                }
                C12KT c12kt3 = this.LLILLJJLI;
                if (c12kt3 != null) {
                    c12kt3.LJFF(actualMaximum + 1);
                }
            }
            this.LLILZIL.set(i, i5, 1);
            int actualMaximum2 = this.LLILZIL.getActualMaximum(5);
            Calendar calendar3 = this.LLILZLL;
            if (calendar3 != null && i == calendar3.get(1) && i5 == this.LLILZLL.get(2)) {
                actualMaximum2 = this.LLILZLL.get(5);
            }
            if (i4 > actualMaximum2) {
                i4 = actualMaximum2;
            }
            this.LLILZIL.set(5, i4);
            C12KT c12kt4 = this.LLILLL;
            if (c12kt4 != null) {
                c12kt4.LJFF(actualMaximum2);
            }
        } else {
            if (Intrinsics.LJFF(c12kt, this.LLILLJJLI)) {
                int i7 = this.LLILZIL.get(5);
                Calendar calendar4 = this.LLILZIL;
                int i8 = i - 1;
                calendar4.set(calendar4.get(1), i8, 1);
                int actualMaximum3 = this.LLILZIL.getActualMaximum(5);
                if (this.LLILZLL != null && this.LLILZIL.get(1) == this.LLILZLL.get(1) && i8 == this.LLILZLL.get(2)) {
                    actualMaximum3 = this.LLILZLL.get(5);
                }
                if (i7 > actualMaximum3) {
                    i7 = actualMaximum3;
                }
                this.LLILZIL.set(5, i7);
                C12KT c12kt5 = this.LLILLL;
                if (c12kt5 != null) {
                    c12kt5.LJFF(actualMaximum3);
                }
            } else if (Intrinsics.LJFF(c12kt, this.LLILLL)) {
                this.LLILZIL.set(5, i);
                i2 = 3;
            } else {
                i2 = 0;
            }
            i3 = i2;
        }
        InterfaceC19298210ei interfaceC19298210ei = this.LLIZ;
        if (interfaceC19298210ei != null) {
            getYear();
            getMonth();
            getDayOfMonth();
            interfaceC19298210ei.LIZ(this.LLILZIL, i3);
        }
    }
}
