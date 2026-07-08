package X;

import Y.ACListenerS162S0100000_28;
import Y.AfS197S0100000_28;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ad.feed.reminder.AdNoticeCalendar;
import com.ss.android.ugc.aweme.feed.model.live.NewLiveRoomStruct;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS607S0100000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zsN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1912810zsN {
    public final C19EG LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final long LJ;
    public final AdNoticeCalendar LJFF;
    public final String LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public final String LJIIJ;
    public final String LJIIJJI;
    public final String LJIIL;
    public final C1912850zsR LJIILIIL = new C1912850zsR();
    public final View LJIILJJIL;
    public final TextView LJIILL;
    public final TextView LJIILLIIL;
    public final TextView LJIIZILJ;
    public final C197039127h LJIJ;
    public final C197039127h LJIJI;
    public final LinearLayout LJIJJ;
    public final C1390410mHn LJIJJLI;
    public final View LJIL;
    public final C01GW LJJ;
    public int LJJI;
    public final int LJJIFFI;
    public boolean LJJII;
    public NewLiveRoomStruct LJJIII;
    public boolean LJJIIJ;

    public final void LJFF() {
        AwS607S0100000_28 awS607S0100000_28;
        boolean z;
        String string;
        if (Intrinsics.LJFF(this.LIZJ, "countdown_reminder")) {
            if (LIZLLL()) {
                LJIIJ(this, this.LIZ.getResources().getString(2131824705), new ACListenerS162S0100000_28(this, 92), null, null, false, 48);
                return;
            }
        } else if (Intrinsics.LJFF(this.LIZJ, "countdown_reminder_live")) {
            if (LIZLLL()) {
                LJIIJ(this, this.LJJII ? this.LIZ.getResources().getString(2131824712) : this.LIZ.getResources().getString(2131824706), new ACListenerS162S0100000_28(this, 93), null, null, this.LJJII, 32);
                return;
            }
        } else if (Intrinsics.LJFF(this.LIZJ, "countdown_reminder_game") && LIZLLL()) {
            LJIIJ(this, this.LIZ.getResources().getString(2131824704), new ACListenerS162S0100000_28(this, 94), null, null, false, 48);
            return;
        }
        if (this.LJJI == 0) {
            LJIIJ(this, this.LIZ.getResources().getString(2131824708), new ACListenerS162S0100000_28(this, 95), null, null, false, 48);
            return;
        }
        if (this.LJFF != null) {
            awS607S0100000_28 = new AwS607S0100000_28(this, 193);
            string = this.LIZ.getResources().getString(2131824703);
            z = true;
        } else {
            awS607S0100000_28 = null;
            z = false;
            string = null;
        }
        LJIIJ(this, string, awS607S0100000_28 != null ? new ACListenerS162S0100000_28(awS607S0100000_28, 96) : null, this.LIZ.getResources().getString(2131824707), new ACListenerS162S0100000_28(new AwS607S0100000_28(this, 194), 96), z, 32);
    }

    public final void LIZIZ() {
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJ(this.LJIILJJIL, C343970De7.LIZ);
    }

    public final void LJI() {
        if (Intrinsics.LJFF(this.LIZJ, "countdown_reminder")) {
            this.LJIILL.setText(this.LIZ.getResources().getString(2131824724, this.LIZLLL));
            this.LJIILLIIL.setText((String) this.LJJ.getValue());
            if (this.LJJI == 1) {
                this.LJIIZILJ.setText(this.LIZ.getResources().getString(2131824714));
            } else {
                this.LJIIZILJ.setText(this.LIZ.getResources().getString(2131824717, this.LIZLLL));
            }
            if (LIZLLL()) {
                this.LJIIZILJ.setText(this.LIZ.getResources().getString(2131824720));
                return;
            }
            return;
        }
        if (Intrinsics.LJFF(this.LIZJ, "countdown_reminder_live")) {
            this.LJIILL.setText(this.LIZ.getResources().getString(2131824711, this.LIZLLL));
            this.LJIILLIIL.setText((String) this.LJJ.getValue());
            if (this.LJJI == 1) {
                this.LJIIZILJ.setText(this.LIZ.getResources().getString(2131824716));
            } else {
                this.LJIIZILJ.setText(this.LIZ.getResources().getString(2131824719, this.LIZLLL));
            }
            if (LIZLLL()) {
                if (this.LJJII) {
                    this.LJIIZILJ.setText(this.LIZ.getResources().getString(2131824723, this.LIZLLL));
                    return;
                } else {
                    this.LJIIZILJ.setText(this.LIZ.getResources().getString(2131824721));
                    return;
                }
            }
            return;
        }
        if (Intrinsics.LJFF(this.LIZJ, "countdown_reminder_game")) {
            if (LIZLLL()) {
                this.LJIILL.setText(this.LIZ.getResources().getString(2131824710, this.LIZLLL));
            } else {
                this.LJIILL.setText(this.LIZ.getResources().getString(2131824709, this.LIZLLL));
            }
            this.LJIILLIIL.setText((String) this.LJJ.getValue());
            if (this.LJJI == 1) {
                this.LJIIZILJ.setText(this.LIZ.getResources().getString(2131824715, this.LIZLLL));
            } else {
                this.LJIIZILJ.setText(this.LIZ.getResources().getString(2131824718, this.LIZLLL));
            }
            if (LIZLLL()) {
                String str = this.LJIIL;
                if (str == null) {
                    str = "Google Play";
                }
                this.LJIIZILJ.setText(this.LIZ.getResources().getString(2131824722, str));
            }
        }
    }

    public final void LJIIIIZZ() {
        if (this.LJJIIJ) {
            return;
        }
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        View view = this.LJIILJJIL;
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJIII = view;
        tuxSheet.LLJJIJIIJIL = false;
        tuxSheet.LLILLJJLI = new DialogInterfaceOnDismissListenerC19333210kM(this, 10);
        tuxSheet.showNow(this.LIZ.getSupportFragmentManager(), null);
        this.LJJIIJ = true;
    }

    public final void LJIIIZ() {
        if (Intrinsics.LJFF(this.LIZJ, "countdown_reminder") || Intrinsics.LJFF(this.LIZJ, "countdown_reminder_game")) {
            LJII(false);
            LIZJ();
        } else {
            if (!Intrinsics.LJFF(this.LIZJ, "countdown_reminder_live")) {
                LIZIZ();
                return;
            }
            String str = this.LJII;
            if (str != null) {
                this.LJIILIIL.LIZ(str, this.LJIIIIZZ, new AfS197S0100000_28(this, 56), new AfS197S0100000_28(this, 57));
            }
        }
    }

    public final void LIZJ() {
        LJI();
        LJFF();
        LJIIIIZZ();
        String str = this.LIZIZ;
        String str2 = this.LIZJ;
        String str3 = this.LJIIIZ;
        String str4 = this.LJIIJJI;
        boolean zLIZLLL = LIZLLL();
        boolean z = this.LJJII;
        C1022820ciu c1022820ciuLJ = C2184171Adz.LJ("draw_ad", "othershow", str3, str4, null);
        c1022820ciuLJ.LIZJ(zLIZLLL ? "expired_reminder_window" : "reminder_window", "refer");
        c1022820ciuLJ.LIZIZ(TextUtils.equals(str, "draw_ad") ? "1" : "2", "window_type");
        if (zLIZLLL && Intrinsics.LJFF(str2, "countdown_reminder_live")) {
            c1022820ciuLJ.LIZIZ(z ? "1" : "2", "live_status");
        }
        c1022820ciuLJ.LJII();
    }

    public final boolean LIZLLL() {
        return System.currentTimeMillis() > this.LJ;
    }

    public static int LJ(C197039127h c197039127h) {
        String string = c197039127h.getText().toString();
        Rect rect = new Rect();
        c197039127h.getPaint().getTextBounds(string, 0, string.length(), rect);
        return rect.width();
    }

    public final float LIZ(float f) {
        return C12ES.LIZJ(f, this.LIZ);
    }

    public final void LJII(boolean z) {
        int i;
        int i2 = 0;
        if (z) {
            i = 0;
            i2 = 8;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, this.LJIL);
        if (i == 0) {
            this.LJIJJLI.LIZJ();
        } else {
            this.LJIJJLI.LIZLLL();
        }
        C786410Ut5.LLIL(this.LJIILL, i2);
        C786410Ut5.LLIL(this.LJIILLIIL, i2);
        C786410Ut5.LLIL(this.LJIIZILJ, i2);
        C786410Ut5.LJZL(i2, this.LJIJJ);
    }

    public static void LJIIJ(C1912810zsN c1912810zsN, String str, View.OnClickListener onClickListener, String str2, ACListenerS162S0100000_28 aCListenerS162S0100000_28, boolean z, int i) {
        boolean z2;
        int width;
        if ((i & 16) != 0) {
            z = true;
        }
        if ((i & 32) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        c1912810zsN.LJIJ.setEnabled(z);
        c1912810zsN.LJIJI.setEnabled(z2);
        if (str == null) {
            C786410Ut5.LLLLLLJ(c1912810zsN.LJIJ, 8);
        } else {
            C786410Ut5.LLLLLLJ(c1912810zsN.LJIJ, 0);
        }
        if (str2 == null) {
            C786410Ut5.LLLLLLJ(c1912810zsN.LJIJI, 8);
        } else {
            C786410Ut5.LLLLLLJ(c1912810zsN.LJIJI, 0);
        }
        C786410Ut5.U8(c1912810zsN.LJIJ, onClickListener);
        C786410Ut5.U8(c1912810zsN.LJIJI, aCListenerS162S0100000_28);
        C197039127h c197039127h = c1912810zsN.LJIJ;
        if (str == null) {
            str = "";
        }
        c197039127h.setText(str);
        C197039127h c197039127h2 = c1912810zsN.LJIJI;
        if (str2 == null) {
            str2 = "";
        }
        c197039127h2.setText(str2);
        int iLJ = LJ(c1912810zsN.LJIJ);
        int iLJ2 = LJ(c1912810zsN.LJIJI);
        if (iLJ <= iLJ2) {
            iLJ = iLJ2;
        }
        if (c1912810zsN.LJIJJ.getWidth() <= 0) {
            c1912810zsN.LJIJJ.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            width = c1912810zsN.LJIJJ.getMeasuredWidth();
        } else {
            width = c1912810zsN.LJIJJ.getWidth();
        }
        if (iLJ > (width - c1912810zsN.LIZ(45.0f)) / 2) {
            C786410Ut5.LJJJJJL(c1912810zsN.LJIJJ);
            c1912810zsN.LJIJJ.addView(c1912810zsN.LJIJ);
            c1912810zsN.LJIJJ.addView(c1912810zsN.LJIJI);
            LinearLayout linearLayout = c1912810zsN.LJIJJ;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.topMargin = (int) c1912810zsN.LIZ(44.0f);
            layoutParams.bottomMargin = (int) c1912810zsN.LIZ(20.0f);
            layoutParams.setMarginStart((int) c1912810zsN.LIZ(32.0f));
            layoutParams.setMarginEnd((int) c1912810zsN.LIZ(32.0f));
            C786410Ut5.d6(linearLayout, layoutParams);
            c1912810zsN.LJIJJ.setOrientation(1);
            if (c1912810zsN.LJIJ.getVisibility() == 0) {
                C786410Ut5.J6(c1912810zsN.LJIJ, new LinearLayout.LayoutParams(-1, -2));
            }
            if (c1912810zsN.LJIJI.getVisibility() == 0) {
                C197039127h c197039127h3 = c1912810zsN.LJIJI;
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                layoutParams2.topMargin = (int) c1912810zsN.LIZ(8.0f);
                C786410Ut5.J6(c197039127h3, layoutParams2);
                return;
            }
            return;
        }
        C786410Ut5.LJJJJJL(c1912810zsN.LJIJJ);
        c1912810zsN.LJIJJ.addView(c1912810zsN.LJIJI);
        c1912810zsN.LJIJJ.addView(c1912810zsN.LJIJ);
        LinearLayout linearLayout2 = c1912810zsN.LJIJJ;
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.topMargin = (int) c1912810zsN.LIZ(44.0f);
        layoutParams3.bottomMargin = (int) c1912810zsN.LIZ(20.0f);
        layoutParams3.setMarginStart((int) c1912810zsN.LIZ(32.0f));
        layoutParams3.setMarginEnd((int) c1912810zsN.LIZ(32.0f));
        C786410Ut5.d6(linearLayout2, layoutParams3);
        c1912810zsN.LJIJJ.setOrientation(0);
        if (c1912810zsN.LJIJI.getVisibility() == 0) {
            C197039127h c197039127h4 = c1912810zsN.LJIJI;
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams4.weight = 1.0f;
            C786410Ut5.J6(c197039127h4, layoutParams4);
        }
        if (c1912810zsN.LJIJ.getVisibility() != 0) {
            return;
        }
        C197039127h c197039127h5 = c1912810zsN.LJIJ;
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams5.weight = 1.0f;
        layoutParams5.leftMargin = (int) c1912810zsN.LIZ(8.0f);
        C786410Ut5.J6(c197039127h5, layoutParams5);
    }

    public C1912810zsN(C19EG c19eg, String str, String str2, String str3, String str4, long j, AdNoticeCalendar adNoticeCalendar, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.LIZ = c19eg;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str4;
        this.LJ = j;
        this.LJFF = adNoticeCalendar;
        this.LJI = str5;
        this.LJII = str6;
        this.LJIIIIZZ = str7;
        this.LJIIIZ = str8;
        this.LJIIJ = str9;
        this.LJIIJJI = str10;
        this.LJIIL = str11;
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(c19eg), R.layout.fah, null, false);
        this.LJIILJJIL = viewTd;
        this.LJJ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 702));
        this.LJJIFFI = 5;
        this.LJIILL = (TextView) viewTd.findViewById(R.id.title);
        this.LJIJJLI = (C1390410mHn) viewTd.findViewById(R.id.nl1);
        this.LJIL = viewTd.findViewById(R.id.nlo);
        this.LJIILLIIL = (TextView) viewTd.findViewById(R.id.wlq);
        this.LJIIZILJ = (TextView) viewTd.findViewById(R.id.o8v);
        this.LJIJ = (C197039127h) viewTd.findViewById(R.id.ctl);
        this.LJIJI = (C197039127h) viewTd.findViewById(R.id.cuq);
        this.LJIJJ = (LinearLayout) viewTd.findViewById(R.id.cx1);
        C786410Ut5.I7(new ACListenerS162S0100000_28(this, 91), viewTd.findViewById(R.id.jxr));
        if (Intrinsics.LJFF(str2, "countdown_reminder_live")) {
            this.LJJIFFI = 6;
        } else {
            if (!Intrinsics.LJFF(str2, "countdown_reminder_game")) {
                return;
            }
            this.LJJIFFI = 7;
        }
    }
}
