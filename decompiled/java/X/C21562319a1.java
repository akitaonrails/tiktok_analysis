package X;

import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.DateSelector;
import com.google.android.material.datepicker.Month;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: X.19a1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21562319a1 extends BaseAdapter {
    public static final int LLILZLL = C21565019aS.LJIIIIZZ(null).getMaximum(4);
    public final Month LL;
    public final DateSelector<?> LLILLJJLI;
    public Collection<Long> LLILLL;
    public C19PE LLILZ;
    public final CalendarConstraints LLILZIL;

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }

    public final int LIZIZ() {
        return this.LL.LJII();
    }

    public final int LIZLLL() {
        return (this.LL.LJII() + this.LL.LLILZ) - 1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.LL.LLILZ + LIZIZ();
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: LIZJ, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int i) {
        if (i >= this.LL.LJII() && i <= LIZLLL()) {
            Month month = this.LL;
            return Long.valueOf(month.LJIIIZ((i - month.LJII()) + 1));
        }
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i / this.LL.LLILLL;
    }

    public final void LJ(long j, TextView textView) {
        C19RU c19ru;
        if (textView == null) {
            return;
        }
        if (this.LLILZIL.validator.ZH(j)) {
            textView.setEnabled(true);
            Iterator<Long> it2 = this.LLILLJJLI.Vy().iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (C21565019aS.LIZ(j) == C21565019aS.LIZ(it2.next().longValue())) {
                        c19ru = this.LLILZ.LIZIZ;
                        break;
                    }
                } else if (C21565019aS.LJII().getTimeInMillis() == j) {
                    c19ru = this.LLILZ.LIZJ;
                } else {
                    c19ru = this.LLILZ.LIZ;
                }
            }
        } else {
            textView.setEnabled(false);
            c19ru = this.LLILZ.LJI;
        }
        c19ru.LIZIZ(textView);
    }

    public final void LJFF(C21562219a0 c21562219a0, long j) {
        if (Month.LJI(j).equals(this.LL)) {
            LJ(j, (TextView) c21562219a0.getChildAt((c21562219a0.getAdapter().LIZIZ() + (this.LL.LJIIJ(j) - 1)) - c21562219a0.getFirstVisiblePosition()));
        }
    }

    public C21562319a1(Month month, DateSelector<?> dateSelector, CalendarConstraints calendarConstraints) {
        this.LL = month;
        this.LLILLJJLI = dateSelector;
        this.LLILZIL = calendarConstraints;
        this.LLILLL = dateSelector.Vy();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00d3  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View getView(int r10, android.view.View r11, android.view.ViewGroup r12) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21562319a1.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
