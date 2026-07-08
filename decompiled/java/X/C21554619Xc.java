package X;

import com.google.android.material.timepicker.TimeModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: renamed from: X.19Xc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21554619Xc implements InterfaceC21542819So, InterfaceC21555819Xo, InterfaceC21556019Xq, InterfaceC21543219Ss, C19ZW {
    public static final String[] LLILZLL = {"12", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11"};
    public static final String[] LLIZ = {"00", "2", "4", "6", "8", "10", "12", "14", "16", "18", "20", "22"};
    public static final String[] LLIZLLLIL = {"00", "5", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55"};
    public final C21554719Xd LL;
    public final TimeModel LLILLJJLI;
    public float LLILLL;
    public float LLILZ;
    public boolean LLILZIL;

    public final int LIZIZ() {
        return this.LLILLJJLI.LL == 1 ? 15 : 30;
    }

    public final void LIZLLL() {
        C21554719Xd c21554719Xd = this.LL;
        TimeModel timeModel = this.LLILLJJLI;
        int i = timeModel.LLILZIL;
        int iLIZIZ = timeModel.LIZIZ();
        int i2 = this.LLILLJJLI.LLILLL;
        c21554719Xd.getClass();
        c21554719Xd.LLILZIL.LIZIZ(i == 1 ? R.id.o3h : R.id.o3g);
        Locale locale = c21554719Xd.getResources().getConfiguration().locale;
        String strK4 = C786410Ut5.k4(locale, "%02d", new Object[]{Integer.valueOf(i2)});
        String strK42 = C786410Ut5.k4(locale, "%02d", new Object[]{Integer.valueOf(iLIZIZ)});
        c21554719Xd.LL.setText(strK4);
        c21554719Xd.LLILLJJLI.setText(strK42);
    }

    @Override // X.C19ZW
    public final void hide() {
        C21554719Xd c21554719Xd = this.LL;
        int visibility = c21554719Xd.getVisibility();
        c21554719Xd.setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, c21554719Xd);
    }

    @Override // X.C19ZW
    public final void invalidate() {
        this.LLILZ = this.LLILLJJLI.LIZIZ() * LIZIZ();
        TimeModel timeModel = this.LLILLJJLI;
        this.LLILLL = timeModel.LLILLL * 6;
        LIZJ(timeModel.LLILZ, false);
        LIZLLL();
    }

    @Override // X.C19ZW
    public final void show() {
        C21554719Xd c21554719Xd = this.LL;
        int visibility = c21554719Xd.getVisibility();
        c21554719Xd.setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, c21554719Xd);
    }

    @Override // X.InterfaceC21555819Xo
    public final void LIZ(int i) {
        LIZJ(i, true);
    }

    public C21554619Xc(C21554719Xd c21554719Xd, TimeModel timeModel) {
        this.LL = c21554719Xd;
        this.LLILLJJLI = timeModel;
        if (timeModel.LL == 0) {
            C21542019Sg c21542019Sg = c21554719Xd.LLILZIL;
            int visibility = c21542019Sg.getVisibility();
            c21542019Sg.setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, c21542019Sg);
        }
        ((ArrayList) c21554719Xd.LLILLL.LLIZ).add(this);
        c21554719Xd.setOnSelectionChangeListener(this);
        c21554719Xd.setOnPeriodChangeListener(this);
        c21554719Xd.setOnActionUpListener(this);
        LJ("%d", LLILZLL);
        LJ("%d", LLIZ);
        LJ("%02d", LLIZLLLIL);
        invalidate();
    }

    public final void LIZJ(int i, boolean z) {
        boolean z2;
        String[] strArr;
        int i2;
        float f;
        if (i == 12) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LL.setAnimateOnTouchUp(z2);
        TimeModel timeModel = this.LLILLJJLI;
        timeModel.LLILZ = i;
        C21554719Xd c21554719Xd = this.LL;
        if (z2) {
            strArr = LLIZLLLIL;
            i2 = 2131837054;
        } else {
            if (timeModel.LL == 1) {
                strArr = LLIZ;
            } else {
                strArr = LLILZLL;
            }
            i2 = 2131837052;
        }
        c21554719Xd.LLILZ.i0(i2, strArr);
        C21554719Xd c21554719Xd2 = this.LL;
        if (z2) {
            f = this.LLILLL;
        } else {
            f = this.LLILZ;
        }
        c21554719Xd2.LLILLL.LIZIZ(f, z);
        this.LL.setActiveSelection(i);
        this.LL.setMinuteHourDelegate(new C690410R6h(this.LL.getContext(), 2131837051));
        this.LL.setHourClickDelegate(new C690410R6h(this.LL.getContext(), 2131837053));
    }

    public final void LJ(String str, String[] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = TimeModel.LIZ(this.LL.getResources(), strArr[i], str);
        }
    }

    @Override // X.InterfaceC21542819So
    public final void LLZZJLIL(float f, boolean z) {
        if (this.LLILZIL) {
            return;
        }
        TimeModel timeModel = this.LLILLJJLI;
        int i = timeModel.LLILLJJLI;
        int i2 = timeModel.LLILLL;
        int iRound = Math.round(f);
        TimeModel timeModel2 = this.LLILLJJLI;
        if (timeModel2.LLILZ == 12) {
            timeModel2.LLILLL = ((iRound + 3) / 6) % 60;
            this.LLILLL = (float) Math.floor(r0 * 6);
        } else {
            this.LLILLJJLI.LIZJ((iRound + (LIZIZ() / 2)) / LIZIZ());
            this.LLILZ = this.LLILLJJLI.LIZIZ() * LIZIZ();
        }
        if (!z) {
            LIZLLL();
            TimeModel timeModel3 = this.LLILLJJLI;
            if (timeModel3.LLILLL != i2 || timeModel3.LLILLJJLI != i) {
                this.LL.performHapticFeedback(4);
            }
        }
    }
}
