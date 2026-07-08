package X;

import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.DateValidatorPointForward;
import com.google.android.material.datepicker.Month;

/* JADX INFO: renamed from: X.19Zv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21561719Zv {
    public static final long LJ = C21565019aS.LIZ(Month.LJFF(1900, 0).LLILZIL);
    public static final long LJFF = C21565019aS.LIZ(Month.LJFF(2100, 11).LLILZIL);
    public final long LIZ;
    public final long LIZIZ;
    public Long LIZJ;
    public final CalendarConstraints.DateValidator LIZLLL;

    public C21561719Zv(CalendarConstraints calendarConstraints) {
        this.LIZ = LJ;
        this.LIZIZ = LJFF;
        this.LIZLLL = new DateValidatorPointForward(Long.MIN_VALUE);
        this.LIZ = calendarConstraints.start.LLILZIL;
        this.LIZIZ = calendarConstraints.end.LLILZIL;
        this.LIZJ = Long.valueOf(calendarConstraints.openAt.LLILZIL);
        this.LIZLLL = calendarConstraints.validator;
    }
}
