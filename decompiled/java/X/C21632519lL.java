package X;

import android.view.View;
import com.zhiliaoapp.musically.R;
import java.util.Calendar;

/* JADX INFO: renamed from: X.19lL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21632519lL {
    public final View LIZ;
    public final C21631219l8 LIZIZ;
    public final C21631219l8 LIZJ;
    public final C21631219l8 LIZLLL;
    public Calendar LJ;
    public Calendar LJFF;
    public Calendar LJI;

    public final void LIZ(Calendar calendar) {
        int i;
        int i2;
        int i3;
        if (calendar.getTimeInMillis() < this.LJ.getTimeInMillis()) {
            Calendar calendar2 = this.LJ;
            calendar = Calendar.getInstance();
            calendar.setTimeInMillis(calendar2.getTimeInMillis());
        } else if (calendar.getTimeInMillis() > this.LJFF.getTimeInMillis()) {
            Calendar calendar3 = this.LJFF;
            calendar = Calendar.getInstance();
            calendar.setTimeInMillis(calendar3.getTimeInMillis());
        }
        int i4 = calendar.get(11);
        int i5 = calendar.get(12);
        int i6 = calendar.get(13);
        int i7 = this.LJ.get(11);
        int i8 = this.LJ.get(12);
        int i9 = this.LJ.get(13);
        int i10 = this.LJFF.get(11);
        int i11 = this.LJFF.get(12);
        int i12 = this.LJFF.get(13);
        if (i7 == i10) {
            this.LIZIZ.setAdapter(new C21632419lK(i7, i10));
            i3 = i4 - i7;
            this.LIZJ.setAdapter(new C21632419lK(i8, i11));
            i2 = i5 - i8;
            if (i8 == i11) {
                this.LIZLLL.setAdapter(new C21632419lK(i9, i12));
            } else if (i5 == i8) {
                this.LIZLLL.setAdapter(new C21632419lK(i9, 59));
            } else if (i5 == i11) {
                this.LIZLLL.setAdapter(new C21632419lK(0, i12));
            } else {
                this.LIZLLL.setAdapter(new C21632419lK(0, 59));
            }
            i6 -= i9;
        } else {
            if (i7 < i10) {
                this.LIZIZ.setAdapter(new C21632419lK(i7, i10));
                i = i4 - i7;
            } else {
                this.LIZIZ.setAdapter(new C21632319lJ(i7, i10));
                i = i4 - i7;
                if (i < 0) {
                    i += 24;
                }
            }
            if (i4 == i7) {
                this.LIZJ.setAdapter(new C21632419lK(i8, 59));
                int i13 = i5 - i8;
                if (i5 == i8) {
                    this.LIZLLL.setAdapter(new C21632419lK(i9, 59));
                    i6 -= i9;
                } else {
                    this.LIZLLL.setAdapter(new C21632419lK(0, 59));
                }
                i5 = i13;
            } else if (i4 == i10) {
                this.LIZJ.setAdapter(new C21632419lK(0, i11));
                if (i5 == i11) {
                    this.LIZLLL.setAdapter(new C21632419lK(0, i12));
                } else {
                    this.LIZLLL.setAdapter(new C21632419lK(0, 59));
                }
            } else {
                this.LIZJ.setAdapter(new C21632419lK(0, 59));
                this.LIZLLL.setAdapter(new C21632419lK(0, 59));
            }
            i2 = i5;
            i3 = i;
        }
        this.LJI = calendar;
        this.LIZIZ.setCurrentIndex(i3);
        this.LIZJ.setCurrentIndex(i2);
        this.LIZLLL.setCurrentIndex(i6);
    }

    public C21632519lL(View view, boolean[] zArr, InterfaceC1305140k4G interfaceC1305140k4G) {
        int i;
        int i2;
        Calendar calendar = Calendar.getInstance();
        calendar.set(2000, 0, 1, 0, 0, 0);
        this.LJ = calendar;
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(2000, 0, 1, 23, 59, 59);
        this.LJFF = calendar2;
        Calendar calendar3 = Calendar.getInstance();
        calendar3.set(2000, 0, 1);
        this.LJI = calendar3;
        this.LIZ = view;
        C21631219l8 c21631219l8 = (C21631219l8) view.findViewById(R.id.jss);
        this.LIZIZ = c21631219l8;
        C21631219l8 c21631219l82 = (C21631219l8) view.findViewById(R.id.ocn);
        this.LIZJ = c21631219l82;
        C21631219l8 c21631219l83 = (C21631219l8) view.findViewById(R.id.ugc);
        this.LIZLLL = c21631219l83;
        c21631219l8.setLocalizeAdapter(interfaceC1305140k4G);
        c21631219l82.setLocalizeAdapter(interfaceC1305140k4G);
        c21631219l83.setLocalizeAdapter(interfaceC1305140k4G);
        c21631219l8.setGravity(17);
        c21631219l82.setGravity(17);
        c21631219l83.setGravity(17);
        if (zArr.length == 3) {
            if (zArr[0]) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LLLLJ(c21631219l8, i);
            if (zArr[1]) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            C786410Ut5.LLLLJ(c21631219l82, i2);
            C786410Ut5.LLLLJ(c21631219l83, zArr[2] ? 0 : 8);
            float f = 18;
            c21631219l8.setTextSize(f);
            c21631219l82.setTextSize(f);
            c21631219l83.setTextSize(f);
            return;
        }
        throw new IllegalArgumentException("type[] length is not 3");
    }
}
