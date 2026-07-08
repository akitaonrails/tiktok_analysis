package X;

import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;
import java.util.Calendar;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10hu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public class C19318010hu extends LinearLayout implements InterfaceC19318310hx {
    public C12KT LL;
    public C12KT LLILLJJLI;
    public C12KT LLILLL;
    public LinearLayout LLILZ;
    public Calendar LLILZIL;
    public Calendar LLILZLL;
    public InterfaceC19301510fF LLIZ;
    public final LayoutInflater LLIZLLLIL;

    public void LIZIZ() {
        C786410Ut5.Td(this.LLIZLLLIL, R.layout.a5i, this, true);
        this.LLILZ = (LinearLayout) findViewById(R.id.q2y);
        this.LL = (C12KT) findViewById(R.id.year_picker);
        this.LLILLJJLI = (C12KT) findViewById(R.id.okh);
        C12KT c12kt = (C12KT) findViewById(R.id.fg5);
        this.LLILLL = c12kt;
        C12KT c12kt2 = this.LL;
        if (c12kt2 != null) {
            c12kt2.LLLIL = this;
        }
        C12KT c12kt3 = this.LLILLJJLI;
        if (c12kt3 != null) {
            c12kt3.LLLIL = this;
        }
        if (c12kt != null) {
            c12kt.LLLIL = this;
        }
    }

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
        return this.LLIZLLLIL;
    }

    public final C12KT getMonthPicker() {
        return this.LLILLJJLI;
    }

    public final C12KT getYearPicker() {
        return this.LL;
    }

    public final void LIZJ(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(6, calendar.getActualMaximum(6));
        calendar.add(1, -1);
        if (calendar.getTime().before(date)) {
            calendar = Calendar.getInstance();
            calendar.set(date.getYear() + 1900, 11, 31);
        }
        setNonRecurrentForYear(true);
        LIZLLL(date);
        setUpperBoundDate(calendar);
    }

    public final void LIZLLL(Date date) {
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
        Calendar calendar2;
        C12KT c12kt;
        if (calendar == null) {
            calendar2 = Calendar.getInstance();
        } else {
            calendar2 = calendar;
        }
        this.LLILZLL = calendar2;
        if (calendar != null) {
            C12KT c12kt2 = this.LL;
            if (c12kt2 != null) {
                c12kt2.LJFF(calendar2.get(1));
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

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0027, code lost:
    
        r2 = 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C19318010hu(android.content.Context r23, android.util.AttributeSet r24) {
        /*
            Method dump skipped, instruction units count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19318010hu.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    @Override // X.InterfaceC19318310hx
    public final void LIZ(C12KT c12kt, int i) {
        int i2 = 2;
        int i3 = 1;
        if (Intrinsics.LJFF(c12kt, this.LL)) {
            int i4 = this.LLILZIL.get(5);
            int i5 = this.LLILZIL.get(2);
            Calendar calendar = this.LLILZLL;
            if (calendar != null && i == calendar.get(1)) {
                if (i5 > this.LLILZLL.get(2)) {
                    i5 = this.LLILZLL.get(2);
                }
                C12KT c12kt2 = this.LLILLJJLI;
                if (c12kt2 != null) {
                    c12kt2.LJFF(this.LLILZLL.get(2) + 1);
                }
            } else {
                C12KT c12kt3 = this.LLILLJJLI;
                if (c12kt3 != null) {
                    c12kt3.LJFF(this.LLILZIL.getActualMaximum(2) + 1);
                }
            }
            this.LLILZIL.set(i, i5, 1);
            int actualMaximum = this.LLILZIL.getActualMaximum(5);
            Calendar calendar2 = this.LLILZLL;
            if (calendar2 != null && i == calendar2.get(1) && i5 == this.LLILZLL.get(2)) {
                actualMaximum = this.LLILZLL.get(5);
            }
            if (i4 > actualMaximum) {
                i4 = actualMaximum;
            }
            this.LLILZIL.set(5, i4);
            C12KT c12kt4 = this.LLILLL;
            if (c12kt4 != null) {
                c12kt4.LJFF(actualMaximum);
            }
        } else {
            if (Intrinsics.LJFF(c12kt, this.LLILLJJLI)) {
                int i6 = this.LLILZIL.get(5);
                Calendar calendar3 = this.LLILZIL;
                int i7 = i - 1;
                calendar3.set(calendar3.get(1), i7, 1);
                int actualMaximum2 = this.LLILZIL.getActualMaximum(5);
                if (this.LLILZLL != null && this.LLILZIL.get(1) == this.LLILZLL.get(1) && i7 == this.LLILZLL.get(2)) {
                    actualMaximum2 = this.LLILZLL.get(5);
                }
                if (i6 > actualMaximum2) {
                    i6 = actualMaximum2;
                }
                this.LLILZIL.set(5, i6);
                C12KT c12kt5 = this.LLILLL;
                if (c12kt5 != null) {
                    c12kt5.LJFF(actualMaximum2);
                }
            } else if (Intrinsics.LJFF(c12kt, this.LLILLL)) {
                this.LLILZIL.set(5, i);
                i2 = 3;
            } else {
                i2 = 0;
            }
            i3 = i2;
        }
        InterfaceC19301510fF interfaceC19301510fF = this.LLIZ;
        if (interfaceC19301510fF != null) {
            getYear();
            getMonth();
            getDayOfMonth();
            interfaceC19301510fF.LIZ(this.LLILZIL, i3);
        }
    }
}
