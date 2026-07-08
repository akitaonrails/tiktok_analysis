package X;

import android.content.res.Resources;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import avg.f;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.material.timepicker.TimeModel;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.Locale;
import mf.a;

/* JADX INFO: renamed from: X.19Xb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21554519Xb implements InterfaceC21555819Xo, C19ZW {
    public final LinearLayout LL;
    public final TimeModel LLILLJJLI;
    public final C21554919Xf LLILLL;
    public final C21554819Xe LLILZ;
    public final C21545419To LLILZIL;
    public final C21545419To LLILZLL;
    public final EditText LLIZ;
    public final EditText LLIZLLLIL;
    public C21542019Sg LLJ;

    public final void LIZLLL() {
        C21542019Sg c21542019Sg = this.LLJ;
        if (c21542019Sg == null) {
            return;
        }
        c21542019Sg.LIZIZ(this.LLILLJJLI.LLILZIL == 0 ? R.id.o3g : R.id.o3h);
    }

    @Override // X.C19ZW
    public final void hide() {
        View focusedChild = this.LL.getFocusedChild();
        if (focusedChild == null) {
            C786410Ut5.LJZL(8, this.LL);
            return;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) C446980Hfs.LIZIZ(this.LL.getContext(), InputMethodManager.class);
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(focusedChild.getWindowToken(), 0);
        }
        C786410Ut5.LJZL(8, this.LL);
    }

    @Override // X.C19ZW
    public final void invalidate() {
        LIZJ(this.LLILLJJLI);
    }

    @Override // X.C19ZW
    public final void show() {
        C786410Ut5.LJZL(0, this.LL);
    }

    @Override // X.InterfaceC21555819Xo
    public final void LIZ(int i) {
        boolean z;
        this.LLILLJJLI.LLILZ = i;
        C21545419To c21545419To = this.LLILZIL;
        boolean z2 = true;
        if (i == 12) {
            z = true;
        } else {
            z = false;
        }
        c21545419To.setChecked(z);
        C21545419To c21545419To2 = this.LLILZLL;
        if (i != 10) {
            z2 = false;
        }
        c21545419To2.setChecked(z2);
        LIZLLL();
    }

    public final void LIZJ(TimeModel timeModel) {
        this.LLIZ.removeTextChangedListener(this.LLILZ);
        this.LLIZLLLIL.removeTextChangedListener(this.LLILLL);
        Locale locale = this.LL.getResources().getConfiguration().locale;
        String strK4 = C786410Ut5.k4(locale, "%02d", new Object[]{Integer.valueOf(timeModel.LLILLL)});
        String strK42 = C786410Ut5.k4(locale, "%02d", new Object[]{Integer.valueOf(timeModel.LIZIZ())});
        this.LLILZIL.setText(strK4);
        this.LLILZLL.setText(strK42);
        this.LLIZ.addTextChangedListener(this.LLILZ);
        this.LLIZLLLIL.addTextChangedListener(this.LLILLL);
        LIZLLL();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [X.19Xi] */
    /* JADX WARN: Type inference failed for: r8v0, types: [X.19Xe, android.text.TextWatcher] */
    /* JADX WARN: Type inference failed for: r9v0, types: [X.19Xf, android.text.TextWatcher] */
    public C21554519Xb(LinearLayout linearLayout, TimeModel timeModel) {
        ?? r9 = new C0DL6() { // from class: X.19Xf
            @Override // X.C0DL6, android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                try {
                    if (TextUtils.isEmpty(editable)) {
                        TimeModel timeModel2 = this.LL.LLILLJJLI;
                        timeModel2.getClass();
                        timeModel2.LLILLL = 0;
                    } else {
                        int i = CastIntegerProtector.parseInt(editable.toString());
                        TimeModel timeModel3 = this.LL.LLILLJJLI;
                        timeModel3.getClass();
                        timeModel3.LLILLL = i % 60;
                    }
                } catch (NumberFormatException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        };
        this.LLILLL = r9;
        ?? r8 = new C0DL6() { // from class: X.19Xe
            @Override // X.C0DL6, android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                try {
                    if (TextUtils.isEmpty(editable)) {
                        this.LL.LLILLJJLI.LIZJ(0);
                    } else {
                        this.LL.LLILLJJLI.LIZJ(CastIntegerProtector.parseInt(editable.toString()));
                    }
                } catch (NumberFormatException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        };
        this.LLILZ = r8;
        this.LL = linearLayout;
        this.LLILLJJLI = timeModel;
        Resources resources = linearLayout.getResources();
        C21545419To c21545419To = (C21545419To) linearLayout.findViewById(R.id.o3u);
        this.LLILZIL = c21545419To;
        C21545419To c21545419To2 = (C21545419To) linearLayout.findViewById(R.id.o3n);
        this.LLILZLL = c21545419To2;
        TextView textView = (TextView) c21545419To.findViewById(R.id.o3r);
        TextView textView2 = (TextView) c21545419To2.findViewById(R.id.o3r);
        textView.setText(resources.getString(2131837061));
        textView2.setText(resources.getString(2131837060));
        c21545419To.setTag(R.id.un7, 12);
        c21545419To2.setTag(R.id.un7, 10);
        if (timeModel.LL == 0) {
            C21542019Sg c21542019Sg = (C21542019Sg) linearLayout.findViewById(R.id.o3i);
            this.LLJ = c21542019Sg;
            c21542019Sg.LLILZ.add(new InterfaceC21542519Sl() { // from class: X.19Xn
                @Override // X.InterfaceC21542519Sl
                public final void LIZ(int i, boolean z) {
                    int i2;
                    if (i == R.id.o3h) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    TimeModel timeModel2 = this.LIZ.LLILLJJLI;
                    if (i2 != timeModel2.LLILZIL) {
                        timeModel2.LLILZIL = i2;
                        int i3 = timeModel2.LLILLJJLI;
                        if (i3 < 12) {
                            if (i2 == 1) {
                                timeModel2.LLILLJJLI = i3 + 12;
                            }
                        } else {
                            if (i2 != 0) {
                                return;
                            }
                            timeModel2.LLILLJJLI = i3 - 12;
                        }
                    }
                }
            });
            C21542019Sg c21542019Sg2 = this.LLJ;
            int visibility = c21542019Sg2.getVisibility();
            c21542019Sg2.setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, c21542019Sg2);
            LIZLLL();
        }
        ?? r0 = new View.OnClickListener() { // from class: X.19Xi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.LL.LIZ(((Integer) view.getTag(R.id.un7)).intValue());
            }
        };
        LIZIZ(c21545419To2, r0);
        LIZIZ(c21545419To, r0);
        C0ZE0 c0ze0 = timeModel.hourInputValidator;
        InputFilter[] filters = c21545419To2.LLILLL.getFilters();
        InputFilter[] inputFilterArr = (InputFilter[]) Arrays.copyOf(filters, filters.length + 1);
        inputFilterArr[filters.length] = c0ze0;
        c21545419To2.LLILLL.setFilters(inputFilterArr);
        C0ZE0 c0ze02 = timeModel.minuteInputValidator;
        InputFilter[] filters2 = c21545419To.LLILLL.getFilters();
        InputFilter[] inputFilterArr2 = (InputFilter[]) Arrays.copyOf(filters2, filters2.length + 1);
        inputFilterArr2[filters2.length] = c0ze02;
        c21545419To.LLILLL.setFilters(inputFilterArr2);
        EditText editText = c21545419To2.getTextInput().getEditText();
        this.LLIZ = editText;
        EditText editText2 = c21545419To.getTextInput().getEditText();
        this.LLIZLLLIL = editText2;
        ViewOnKeyListenerC21554419Xa viewOnKeyListenerC21554419Xa = new ViewOnKeyListenerC21554419Xa(c21545419To2, c21545419To, timeModel);
        c21545419To2.setChipDelegate(new C690410R6h(linearLayout.getContext(), 2131837051));
        c21545419To.setChipDelegate(new C690410R6h(linearLayout.getContext(), 2131837053));
        editText.addTextChangedListener(r8);
        editText2.addTextChangedListener(r9);
        LIZJ(timeModel);
        C21543419Su textInput = c21545419To2.getTextInput();
        C21543419Su textInput2 = c21545419To.getTextInput();
        EditText editText3 = textInput.getEditText();
        EditText editText4 = textInput2.getEditText();
        editText3.setImeOptions(268435461);
        editText4.setImeOptions(268435462);
        editText3.setOnEditorActionListener(viewOnKeyListenerC21554419Xa);
        editText3.setOnKeyListener(viewOnKeyListenerC21554419Xa);
        editText4.setOnKeyListener(viewOnKeyListenerC21554419Xa);
    }

    public static void LIZIZ(C21545419To c21545419To, ViewOnClickListenerC21555219Xi viewOnClickListenerC21555219Xi) {
        View.OnClickListener fVar = viewOnClickListenerC21555219Xi;
        if (C1848410yCV.LIZ) {
            fVar = new f(viewOnClickListenerC21555219Xi);
        }
        a aVar = new a(fVar);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c21545419To);
        }
        c21545419To.setOnClickListener(aVar);
    }
}
