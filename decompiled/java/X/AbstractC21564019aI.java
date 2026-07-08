package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.Month;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

/* JADX INFO: renamed from: X.19aI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public abstract class AbstractC21564019aI extends C0DL6 {
    public final C21543419Su LL;
    public final DateFormat LLILLJJLI;
    public final CalendarConstraints LLILLL;
    public final String LLILZ;
    public final RunnableC21564119aJ LLILZIL;
    public RunnableC21564219aK LLILZLL;

    public abstract void LIZ();

    public abstract void LIZIZ(Long l);

    /* JADX WARN: Type inference failed for: r0v2, types: [X.19aJ] */
    public AbstractC21564019aI(final String str, DateFormat dateFormat, C21543419Su c21543419Su, CalendarConstraints calendarConstraints) {
        this.LLILLJJLI = dateFormat;
        this.LL = c21543419Su;
        this.LLILLL = calendarConstraints;
        this.LLILZ = c21543419Su.getContext().getString(2131837554);
        this.LLILZIL = new Runnable() { // from class: X.19aJ
            public final void LIZ() {
                AbstractC21564019aI abstractC21564019aI = this.LLILLJJLI;
                C21543419Su c21543419Su2 = abstractC21564019aI.LL;
                DateFormat dateFormat2 = abstractC21564019aI.LLILLJJLI;
                Context context = c21543419Su2.getContext();
                String string = context.getString(2131837549);
                String strJ4 = C786410Ut5.j4(context.getString(2131837551), new Object[]{str});
                String strJ42 = C786410Ut5.j4(context.getString(2131837550), new Object[]{dateFormat2.format(new Date(C21565019aS.LJII().getTimeInMillis()))});
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(string);
                sbLIZ.append("\n");
                sbLIZ.append(strJ4);
                sbLIZ.append("\n");
                sbLIZ.append(strJ42);
                c21543419Su2.setError(C2188811AlT.LIZIZ(sbLIZ));
                this.LLILLJJLI.LIZ();
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("DateFormatTextWatcher@981f.<init>$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("DateFormatTextWatcher@981f.<init>$1");
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [X.19aK] */
    @Override // X.C0DL6, android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        HandlerHook.viewRemoveCallbacks(this.LL, this.LLILZIL);
        HandlerHook.viewRemoveCallbacks(this.LL, this.LLILZLL);
        this.LL.setError(null);
        LIZIZ(null);
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        try {
            Date date = this.LLILLJJLI.parse(charSequence.toString());
            this.LL.setError(null);
            final long time = date.getTime();
            if (this.LLILLL.validator.ZH(time)) {
                CalendarConstraints calendarConstraints = this.LLILLL;
                if (calendarConstraints.start.LJIIIZ(1) <= time) {
                    Month month = calendarConstraints.end;
                    if (time <= month.LJIIIZ(month.LLILZ)) {
                        LIZIZ(Long.valueOf(date.getTime()));
                        return;
                    }
                }
            }
            this.LLILZLL = new Runnable() { // from class: X.19aK
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("DateFormatTextWatcher@981f.createRangeErrorCallback$1");
                    try {
                        AbstractC21564019aI abstractC21564019aI = this.LLILLJJLI;
                        abstractC21564019aI.LL.setError(C786410Ut5.j4(abstractC21564019aI.LLILZ, new Object[]{C21564419aM.LIZ(time)}));
                        this.LLILLJJLI.LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("DateFormatTextWatcher@981f.createRangeErrorCallback$1");
                }
            };
            HandlerHook.viewPostDelay(this.LL, this.LLILZLL, 1000L);
        } catch (ParseException e) {
            TryCatchGuardChecker.doCheck(e);
            HandlerHook.viewPostDelay(this.LL, this.LLILZIL, 1000L);
        }
    }
}
