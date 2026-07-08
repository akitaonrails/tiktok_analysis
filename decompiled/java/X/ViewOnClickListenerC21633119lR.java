package X;

import android.app.Dialog;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import java.util.Calendar;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: X.19lR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class ViewOnClickListenerC21633119lR extends AbstractC21634219lc implements View.OnClickListener {
    public C21633219lS LLJI;
    public final C21633819lY LLJIJIL;

    @Override // X.AbstractC21634219lc
    public final void LJ() {
        this.LLJIJIL.getClass();
    }

    @Override // X.AbstractC21634219lc
    public final C21633719lX LJFF() {
        return this.LLJIJIL;
    }

    public ViewOnClickListenerC21633119lR(C21633819lY c21633819lY) {
        String str;
        String str2;
        int i;
        int i2;
        super(c21633819lY.LIZJ);
        this.LLJIJIL = c21633819lY;
        Context context = c21633819lY.LIZJ;
        Dialog dialog = this.LLILZIL;
        if (dialog != null) {
            LJFF().getClass();
            dialog.setCancelable(true);
        }
        LIZLLL();
        LIZJ();
        C786410Ut5.Sd(R.layout.dkj, C786410Ut5.ne(context), this.LLILLJJLI);
        TextView textView = (TextView) LIZIZ(R.id.z7j);
        View viewLIZIZ = LIZIZ(R.id.txk);
        Button button = (Button) LIZIZ(R.id.cmg);
        Button button2 = (Button) LIZIZ(R.id.clv);
        button.setTag("submit");
        button2.setTag("cancel");
        C786410Ut5.L7(button, this);
        C786410Ut5.L7(button2, this);
        Map<String, String> mapLIZ = c21633819lY.LJIIZILJ.LIZ();
        if (TextUtils.isEmpty(null)) {
            str = mapLIZ.get("confirm");
        } else {
            str = null;
        }
        button.setText(str);
        button2.setText(TextUtils.isEmpty(null) ? mapLIZ.get("cancel") : null);
        if (TextUtils.isEmpty(c21633819lY.LIZLLL)) {
            str2 = "";
        } else {
            str2 = c21633819lY.LIZLLL;
        }
        textView.setText(str2);
        button.setTextColor(c21633819lY.LJ);
        button2.setTextColor(c21633819lY.LJFF);
        textView.setTextColor(c21633819lY.LJI);
        viewLIZIZ.setBackgroundColor(-657931);
        float f = 17;
        button.setTextSize(f);
        button2.setTextSize(f);
        textView.setTextSize(c21633819lY.LJII);
        View viewLIZIZ2 = LIZIZ(R.id.fg0);
        viewLIZIZ2.setBackgroundColor(-1);
        this.LLJI = new C21633219lS(viewLIZIZ2, c21633819lY.LJIIL, c21633819lY.LJIIZILJ);
        if (c21633819lY.LJIILL == null) {
            Calendar calendar = Calendar.getInstance();
            c21633819lY.LJIILL = calendar;
            calendar.set(1900, 0, 1);
        }
        if (c21633819lY.LJIILLIIL == null) {
            Calendar calendar2 = Calendar.getInstance();
            c21633819lY.LJIILLIIL = calendar2;
            calendar2.set(2100, 11, 31);
        }
        if (c21633819lY.LJIILL.get(1) < 1900 || c21633819lY.LJIILL.get(1) > 2100) {
            c21633819lY.LJIILL.set(1900, 0, 1);
        }
        if (c21633819lY.LJIILLIIL.get(1) < 1900 || c21633819lY.LJIILLIIL.get(1) > 2100) {
            c21633819lY.LJIILLIIL.set(2100, 11, 31);
        }
        C21633219lS c21633219lS = this.LLJI;
        Calendar calendar3 = c21633819lY.LJIILL;
        Calendar calendar4 = c21633819lY.LJIILLIIL;
        c21633219lS.getClass();
        if (calendar3 == null) {
            if (calendar4 != null) {
                int i3 = calendar4.get(1);
                int i4 = calendar4.get(2) + 1;
                int i5 = calendar4.get(5);
                int i6 = c21633219lS.LJ;
                if (i3 > i6) {
                    c21633219lS.LJFF = i3;
                    c21633219lS.LJII = i4;
                    c21633219lS.LJIIIZ = i5;
                } else if (i3 == i6) {
                    int i7 = c21633219lS.LJI;
                    if (i4 > i7) {
                        c21633219lS.LJFF = i3;
                        c21633219lS.LJII = i4;
                        c21633219lS.LJIIIZ = i5;
                    } else if (i4 == i7 && i5 > c21633219lS.LJIIIIZZ) {
                        c21633219lS.LJFF = i3;
                        c21633219lS.LJII = i4;
                        c21633219lS.LJIIIZ = i5;
                    }
                }
            }
        } else if (calendar4 == null) {
            int i8 = calendar3.get(1);
            int i9 = calendar3.get(2) + 1;
            int i10 = calendar3.get(5);
            int i11 = c21633219lS.LJFF;
            if (i8 < i11) {
                c21633219lS.LJI = i9;
                c21633219lS.LJIIIIZZ = i10;
                c21633219lS.LJ = i8;
            } else if (i8 == i11) {
                int i12 = c21633219lS.LJII;
                if (i9 < i12) {
                    c21633219lS.LJI = i9;
                    c21633219lS.LJIIIIZZ = i10;
                    c21633219lS.LJ = i8;
                } else if (i9 == i12 && i10 < c21633219lS.LJIIIZ) {
                    c21633219lS.LJI = i9;
                    c21633219lS.LJIIIIZZ = i10;
                    c21633219lS.LJ = i8;
                }
            }
        } else {
            c21633219lS.LJ = calendar3.get(1);
            c21633219lS.LJFF = calendar4.get(1);
            c21633219lS.LJI = calendar3.get(2) + 1;
            c21633219lS.LJII = calendar4.get(2) + 1;
            c21633219lS.LJIIIIZZ = calendar3.get(5);
            c21633219lS.LJIIIZ = calendar4.get(5);
        }
        if (c21633819lY.LJIILL != null && c21633819lY.LJIILLIIL != null) {
            if (c21633819lY.LJIILJJIL == null) {
                c21633819lY.LJIILJJIL = Calendar.getInstance();
            }
            if (c21633819lY.LJIILJJIL.getTimeInMillis() < c21633819lY.LJIILL.getTimeInMillis()) {
                c21633819lY.LJIILJJIL.setTimeInMillis(c21633819lY.LJIILL.getTimeInMillis());
            }
            if (c21633819lY.LJIILJJIL.getTimeInMillis() > c21633819lY.LJIILLIIL.getTimeInMillis()) {
                c21633819lY.LJIILJJIL.setTimeInMillis(c21633819lY.LJIILLIIL.getTimeInMillis());
            }
            int i13 = c21633819lY.LJIILJJIL.get(1);
            int i14 = c21633819lY.LJIILJJIL.get(2) + 1;
            int i15 = c21633819lY.LJIILJJIL.get(5);
            C21633219lS c21633219lS2 = this.LLJI;
            c21633219lS2.LJIIJ = i13;
            c21633219lS2.LJIIJJI = i14;
            c21633219lS2.LJIIL = i15;
            c21633219lS2.LIZIZ.setAdapter(new C21632419lK(c21633219lS2.LJ, c21633219lS2.LJFF));
            c21633219lS2.LIZIZ.setCurrentIndex(i13 - c21633219lS2.LJ);
            int i16 = c21633219lS2.LJ;
            int i17 = c21633219lS2.LJFF;
            if (i16 == i17) {
                i = c21633219lS2.LJI;
                i2 = c21633219lS2.LJII;
            } else {
                if (i13 == i16) {
                    i = c21633219lS2.LJI;
                } else if (i13 == i17) {
                    i2 = c21633219lS2.LJII;
                    i = 1;
                } else {
                    i = 1;
                }
                i2 = 12;
            }
            c21633219lS2.LIZJ.setAdapter(new C21632419lK(i, i2));
            c21633219lS2.LIZJ.setCurrentIndex(i14 - i);
            c21633219lS2.LIZJ(i13, i14, i15, true);
            this.LLJI.getClass();
            C21633219lS c21633219lS3 = this.LLJI;
            c21633219lS3.LIZIZ.setTextXOffset(0);
            c21633219lS3.LIZJ.setTextXOffset(0);
            c21633219lS3.LIZLLL.setTextXOffset(0);
            C21633219lS c21633219lS4 = this.LLJI;
            int i18 = c21633819lY.LJIIJ;
            c21633219lS4.LIZLLL.setItemsVisibleCount(i18);
            c21633219lS4.LIZJ.setItemsVisibleCount(i18);
            c21633219lS4.LIZIZ.setItemsVisibleCount(i18);
            C21633219lS c21633219lS5 = this.LLJI;
            c21633219lS5.LIZLLL.setAlphaGradient(false);
            c21633219lS5.LIZJ.setAlphaGradient(false);
            c21633219lS5.LIZIZ.setAlphaGradient(false);
            AbstractC21634219lc.LJI();
            C21633219lS c21633219lS6 = this.LLJI;
            c21633219lS6.LIZIZ.setCyclic(false);
            c21633219lS6.LIZJ.setCyclic(false);
            c21633219lS6.LIZLLL.setCyclic(false);
            C21633219lS c21633219lS7 = this.LLJI;
            c21633219lS7.LIZLLL.setDividerColor(-2763307);
            c21633219lS7.LIZJ.setDividerColor(-2763307);
            c21633219lS7.LIZIZ.setDividerColor(-2763307);
            C21633219lS c21633219lS8 = this.LLJI;
            EnumC21631519lB enumC21631519lB = c21633819lY.LJIIIZ;
            c21633219lS8.LIZLLL.setDividerType(enumC21631519lB);
            c21633219lS8.LIZJ.setDividerType(enumC21631519lB);
            c21633219lS8.LIZIZ.setDividerType(enumC21631519lB);
            C21633219lS c21633219lS9 = this.LLJI;
            c21633219lS9.LIZLLL.setLineSpacingMultiplier(1.6f);
            c21633219lS9.LIZJ.setLineSpacingMultiplier(1.6f);
            c21633219lS9.LIZIZ.setLineSpacingMultiplier(1.6f);
            C21633219lS c21633219lS10 = this.LLJI;
            c21633219lS10.LIZLLL.setTextColorOut(-5723992);
            c21633219lS10.LIZJ.setTextColorOut(-5723992);
            c21633219lS10.LIZIZ.setTextColorOut(-5723992);
            C21633219lS c21633219lS11 = this.LLJI;
            c21633219lS11.LIZLLL.setTextColorCenter(-14013910);
            c21633219lS11.LIZJ.setTextColorCenter(-14013910);
            c21633219lS11.LIZIZ.setTextColorCenter(-14013910);
            C21633219lS c21633219lS12 = this.LLJI;
            c21633219lS12.LIZLLL.LLIZ = false;
            c21633219lS12.LIZJ.LLIZ = false;
            c21633219lS12.LIZIZ.LLIZ = false;
            return;
        }
        throw new IllegalStateException("you should call setRangDate() first");
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String strK4;
        String str = (String) view.getTag();
        if (str.equals("submit")) {
            InterfaceC21635419lo interfaceC21635419lo = this.LLJIJIL.LJIIJJI;
            if (interfaceC21635419lo != null) {
                C21633219lS c21633219lS = this.LLJI;
                c21633219lS.getClass();
                Calendar calendar = Calendar.getInstance();
                calendar.set(c21633219lS.LJIIJ, c21633219lS.LJIIJJI - 1, c21633219lS.LJIIL);
                String str2 = this.LLJIJIL.LJIJ;
                if (str2 == null) {
                    str2 = "-";
                }
                int i = calendar.get(1);
                int i2 = calendar.get(2) + 1;
                int i3 = calendar.get(5);
                boolean[] zArr = this.LLJIJIL.LJIIL;
                if (zArr.length != 3 || zArr[2]) {
                    strK4 = C786410Ut5.k4(Locale.getDefault(), "%04d%s%02d%s%02d", new Object[]{Integer.valueOf(i), str2, Integer.valueOf(i2), str2, Integer.valueOf(i3)});
                } else if (zArr[1]) {
                    strK4 = C786410Ut5.k4(Locale.getDefault(), "%04d%s%02d", new Object[]{Integer.valueOf(i), str2, Integer.valueOf(i2)});
                } else {
                    strK4 = C786410Ut5.k4(Locale.getDefault(), "%04d", new Object[]{Integer.valueOf(i)});
                }
                interfaceC21635419lo.LIZ(strK4);
            }
            this.LLIZ = true;
        } else if (str.equals("cancel")) {
            InterfaceC21635319ln interfaceC21635319ln = this.LLJIJIL.LIZ;
            if (interfaceC21635319ln != null) {
                interfaceC21635319ln.onCancel();
            }
            this.LLIZ = true;
        }
        LIZ();
    }
}
