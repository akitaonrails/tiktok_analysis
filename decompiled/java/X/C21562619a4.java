package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.MaterialCalendar;
import com.google.android.material.datepicker.Month;
import com.zhiliaoapp.musically.R;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: renamed from: X.19a4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21562619a4 extends AbstractC21673619ry<C21563819aG> {
    public final MaterialCalendar<?> LL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LL.LLILZ.yearSpan;
    }

    public C21562619a4(MaterialCalendar<?> materialCalendar) {
        this.LL = materialCalendar;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C19RU c19ru;
        C21563819aG c21563819aG = (C21563819aG) viewHolder;
        final int i2 = this.LL.LLILZ.start.LLILLJJLI + i;
        String string = c21563819aG.LL.getContext().getString(2131837553);
        c21563819aG.LL.setText(C786410Ut5.k4(Locale.getDefault(), "%d", new Object[]{Integer.valueOf(i2)}));
        c21563819aG.LL.setContentDescription(C786410Ut5.j4(string, new Object[]{Integer.valueOf(i2)}));
        C19PE c19pe = this.LL.LLIZ;
        Calendar calendarLJII = C21565019aS.LJII();
        if (calendarLJII.get(1) == i2) {
            c19ru = c19pe.LJFF;
        } else {
            c19ru = c19pe.LIZLLL;
        }
        Iterator<Long> it2 = this.LL.LLILLL.Vy().iterator();
        while (it2.hasNext()) {
            calendarLJII.setTimeInMillis(it2.next().longValue());
            if (calendarLJII.get(1) == i2) {
                c19ru = c19pe.LJ;
            }
        }
        c19ru.LIZIZ(c21563819aG.LL);
        C786410Ut5.T7(c21563819aG.LL, new View.OnClickListener() { // from class: X.19a9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Month monthLJFF = Month.LJFF(i2, this.LLILLJJLI.LL.LLILZIL.LL);
                CalendarConstraints calendarConstraints = this.LLILLJJLI.LL.LLILZ;
                if (monthLJFF.compareTo(calendarConstraints.start) < 0) {
                    monthLJFF = calendarConstraints.start;
                } else if (monthLJFF.compareTo(calendarConstraints.end) > 0) {
                    monthLJFF = calendarConstraints.end;
                }
                this.LLILLJJLI.LL.NR(monthLJFF);
                this.LLILLJJLI.LL.OR(EnumC21173817tY.DAY);
            }
        });
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C21563819aG c21563819aG = new C21563819aG((TextView) C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.dp1, viewGroup, false));
        try {
            View view = c21563819aG.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c21563819aG.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c21563819aG.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C21563819aG.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c21563819aG.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c21563819aG.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C21563819aG.class.getName();
        return c21563819aG;
    }
}
