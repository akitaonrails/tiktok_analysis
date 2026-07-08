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

/* JADX INFO: renamed from: X.19lP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class ViewOnClickListenerC21632919lP extends AbstractC21634219lc implements View.OnClickListener {
    public C21632519lL LLJI;
    public final C21633819lY LLJIJIL;

    @Override // X.AbstractC21634219lc
    public final void LJ() {
        this.LLJIJIL.getClass();
    }

    @Override // X.AbstractC21634219lc
    public final C21633719lX LJFF() {
        return this.LLJIJIL;
    }

    public ViewOnClickListenerC21632919lP(C21633819lY c21633819lY) {
        String str;
        String str2;
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
        C786410Ut5.Sd(R.layout.dkl, C786410Ut5.ne(context), this.LLILLJJLI);
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
        View viewLIZIZ2 = LIZIZ(R.id.xxz);
        viewLIZIZ2.setBackgroundColor(-1);
        final C21632519lL c21632519lL = new C21632519lL(viewLIZIZ2, c21633819lY.LJIILIIL, c21633819lY.LJIIZILJ);
        this.LLJI = c21632519lL;
        Calendar calendar = c21633819lY.LJIILL;
        Calendar calendar2 = c21633819lY.LJIILLIIL;
        calendar = calendar == null ? Calendar.getInstance() : calendar;
        calendar2 = calendar2 == null ? Calendar.getInstance() : calendar2;
        calendar.set(2000, 0, 1);
        calendar2.set(2000, 0, 1);
        if (calendar.getTimeInMillis() > calendar2.getTimeInMillis()) {
            calendar2.add(5, 1);
        }
        c21632519lL.LIZIZ.setAdapter(new C21632319lJ(calendar.get(11), calendar2.get(11)));
        c21632519lL.LIZJ.setAdapter(new C21632419lK(0, 59));
        c21632519lL.LIZLLL.setAdapter(new C21632419lK(0, 59));
        c21632519lL.LJ = calendar;
        c21632519lL.LJFF = calendar2;
        c21632519lL.LIZIZ.setOnItemSelectedListener(new InterfaceC21631819lE() { // from class: X.19lM
            @Override // X.InterfaceC21631819lE
            public final void LJLJJI(int i) {
                Calendar calendar3 = c21632519lL.LJI;
                calendar3.set(2000, 0, 1);
                int currentItem = c21632519lL.LJ.get(11) + c21632519lL.LIZIZ.getCurrentItem();
                if (currentItem >= 24) {
                    calendar3.set(11, currentItem - 24);
                    calendar3.add(5, 1);
                } else {
                    calendar3.set(11, currentItem);
                }
                c21632519lL.LIZ(calendar3);
                c21632519lL.getClass();
            }
        });
        c21632519lL.LIZJ.setOnItemSelectedListener(new InterfaceC21631819lE() { // from class: X.19lN
            @Override // X.InterfaceC21631819lE
            public final void LJLJJI(int i) {
                Calendar calendar3 = c21632519lL.LJI;
                int i2 = calendar3.get(11);
                int i3 = c21632519lL.LJ.get(11);
                int i4 = c21632519lL.LJ.get(12);
                if (i3 == i2) {
                    calendar3.set(12, i4 + c21632519lL.LIZJ.getCurrentItem());
                } else {
                    calendar3.set(12, c21632519lL.LIZJ.getCurrentItem());
                }
                c21632519lL.LIZ(calendar3);
                c21632519lL.getClass();
            }
        });
        c21632519lL.LIZLLL.setOnItemSelectedListener(new InterfaceC21631819lE() { // from class: X.19lO
            @Override // X.InterfaceC21631819lE
            public final void LJLJJI(int i) {
                Calendar calendar3 = c21632519lL.LJI;
                int i2 = calendar3.get(11);
                int i3 = calendar3.get(12);
                int i4 = c21632519lL.LJ.get(11);
                int i5 = c21632519lL.LJ.get(12);
                int i6 = c21632519lL.LJ.get(13);
                if (i4 == i2 && i3 == i5) {
                    calendar3.set(13, i6 + c21632519lL.LIZLLL.getCurrentItem());
                } else {
                    calendar3.set(13, c21632519lL.LIZLLL.getCurrentItem());
                }
                c21632519lL.LIZ(calendar3);
                c21632519lL.getClass();
            }
        });
        Calendar calendar3 = c21633819lY.LJIILJJIL;
        C21632519lL c21632519lL2 = this.LLJI;
        if (c21632519lL2.LJ != null && c21632519lL2.LJFF != null) {
            calendar3 = calendar3 == null ? Calendar.getInstance() : calendar3;
            calendar3.set(2000, 0, 1);
            c21632519lL2.LIZ(calendar3);
        }
        this.LLJI.getClass();
        C21632519lL c21632519lL3 = this.LLJI;
        c21632519lL3.LIZIZ.setTextXOffset(0);
        c21632519lL3.LIZJ.setTextXOffset(0);
        c21632519lL3.LIZLLL.setTextXOffset(0);
        C21632519lL c21632519lL4 = this.LLJI;
        int i = c21633819lY.LJIIJ;
        c21632519lL4.LIZIZ.setItemsVisibleCount(i);
        c21632519lL4.LIZJ.setItemsVisibleCount(i);
        c21632519lL4.LIZLLL.setItemsVisibleCount(i);
        C21632519lL c21632519lL5 = this.LLJI;
        c21632519lL5.LIZIZ.setAlphaGradient(false);
        c21632519lL5.LIZJ.setAlphaGradient(false);
        c21632519lL5.LIZLLL.setAlphaGradient(false);
        AbstractC21634219lc.LJI();
        C21632519lL c21632519lL6 = this.LLJI;
        c21632519lL6.LIZIZ.setCyclic(false);
        c21632519lL6.LIZJ.setCyclic(false);
        c21632519lL6.LIZLLL.setCyclic(false);
        C21632519lL c21632519lL7 = this.LLJI;
        c21632519lL7.LIZIZ.setDividerColor(-2763307);
        c21632519lL7.LIZJ.setDividerColor(-2763307);
        c21632519lL7.LIZLLL.setDividerColor(-2763307);
        C21632519lL c21632519lL8 = this.LLJI;
        EnumC21631519lB enumC21631519lB = c21633819lY.LJIIIZ;
        c21632519lL8.LIZIZ.setDividerType(enumC21631519lB);
        c21632519lL8.LIZJ.setDividerType(enumC21631519lB);
        c21632519lL8.LIZLLL.setDividerType(enumC21631519lB);
        C21632519lL c21632519lL9 = this.LLJI;
        c21632519lL9.LIZIZ.setLineSpacingMultiplier(1.6f);
        c21632519lL9.LIZJ.setLineSpacingMultiplier(1.6f);
        c21632519lL9.LIZLLL.setLineSpacingMultiplier(1.6f);
        C21632519lL c21632519lL10 = this.LLJI;
        c21632519lL10.LIZIZ.setTextColorOut(-5723992);
        c21632519lL10.LIZJ.setTextColorOut(-5723992);
        c21632519lL10.LIZLLL.setTextColorOut(-5723992);
        C21632519lL c21632519lL11 = this.LLJI;
        c21632519lL11.LIZIZ.setTextColorCenter(-14013910);
        c21632519lL11.LIZJ.setTextColorCenter(-14013910);
        c21632519lL11.LIZLLL.setTextColorCenter(-14013910);
        C21632519lL c21632519lL12 = this.LLJI;
        c21632519lL12.LIZIZ.LLIZ = false;
        c21632519lL12.LIZJ.LLIZ = false;
        c21632519lL12.LIZLLL.LLIZ = false;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String strK4;
        String str = (String) view.getTag();
        if (str.equals("submit")) {
            C21633819lY c21633819lY = this.LLJIJIL;
            InterfaceC21635419lo interfaceC21635419lo = c21633819lY.LJIIJJI;
            if (interfaceC21635419lo != null) {
                String str2 = c21633819lY.LJIJ;
                if (str2 == null) {
                    str2 = ":";
                }
                boolean[] zArr = c21633819lY.LJIILIIL;
                Calendar calendar = this.LLJI.LJI;
                int i = calendar.get(11);
                int i2 = calendar.get(12);
                int i3 = calendar.get(13);
                if (zArr == null || zArr.length != 3 || zArr[2]) {
                    strK4 = C786410Ut5.k4(Locale.getDefault(), "%02d%s%02d%s%02d", new Object[]{Integer.valueOf(i), str2, Integer.valueOf(i2), str2, Integer.valueOf(i3)});
                } else if (zArr[1]) {
                    strK4 = C786410Ut5.k4(Locale.getDefault(), "%02d%s%02d", new Object[]{Integer.valueOf(i), str2, Integer.valueOf(i2)});
                } else {
                    strK4 = C786410Ut5.k4(Locale.getDefault(), "%02d", new Object[]{Integer.valueOf(i)});
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
