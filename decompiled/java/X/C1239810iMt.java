package X;

import Y.ACListenerS154S0100000_19;
import Y.ARunnableS119S0100000_19;
import android.text.Editable;
import android.view.View;
import android.view.ViewStub;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0iMt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1239810iMt extends C1239830iMv {
    public static final /* synthetic */ int LLJIJIL = 0;
    public C1239720iMk LLIZLLLIL;
    public C21405318pn LLJ;
    public C424320GkQ LLJI;

    @Override // X.C1239830iMv
    public final View LIZJ() {
        this.LLILLL = new C854410XfT(EnumC854400XfS.PASSWORD);
        if (this.LL.getLayoutResource() <= 0) {
            this.LL.setLayoutResource(R.layout.zc);
        }
        View viewLJLLLL = C786410Ut5.LJLLLL(this.LL);
        this.LLIZLLLIL = (C1239720iMk) viewLJLLLL.findViewById(R.id.q3f);
        this.LLJ = (C21405318pn) viewLJLLLL.findViewById(R.id.q3h);
        this.LLJI = (C424320GkQ) viewLJLLLL.findViewById(R.id.q3i);
        C21405318pn c21405318pn = this.LLJ;
        if (c21405318pn == null) {
            c21405318pn = null;
        }
        c21405318pn.setTextWatcher(new C853720XeM() { // from class: X.0iMr
            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                boolean z;
                C1239810iMt c1239810iMt = this.LL;
                String string = null;
                if (c1239810iMt.LJII()) {
                    C854410XfT c854410XfT = c1239810iMt.LLILLL;
                    if (c854410XfT == null) {
                        c854410XfT = null;
                    }
                    c854410XfT.LIZJ();
                }
                C1239720iMk c1239720iMk = this.LL.LLIZLLLIL;
                if (c1239720iMk == null) {
                    c1239720iMk = null;
                }
                if (editable != null) {
                    string = editable.toString();
                }
                if (string != null && string.length() != 0) {
                    z = false;
                } else {
                    z = true;
                }
                c1239720iMk.setEnabled(true ^ z);
            }
        });
        C1239720iMk c1239720iMk = this.LLIZLLLIL;
        if (c1239720iMk == null) {
            c1239720iMk = null;
        }
        c1239720iMk.setEnabled(false);
        C1239720iMk c1239720iMk2 = this.LLIZLLLIL;
        if (c1239720iMk2 == null) {
            c1239720iMk2 = null;
        }
        C786410Ut5.u9(c1239720iMk2, new ACListenerS154S0100000_19(this, 307));
        if (this.LLILZIL == null) {
            LJIIIIZZ(null, "JSON is empty");
        } else {
            C09UZ.LIZ(new ARunnableS119S0100000_19(this, 220));
        }
        LJFF();
        return viewLJLLLL;
    }

    public final void LJIIIIZZ(Integer num, String str) {
        LJ(false);
        String strLIZIZ = LIZIZ(num, str);
        C424320GkQ c424320GkQ = this.LLJI;
        C1239720iMk c1239720iMk = null;
        if (c424320GkQ == null) {
            c424320GkQ = null;
        }
        c424320GkQ.LIZIZ(strLIZIZ);
        C1239720iMk c1239720iMk2 = this.LLIZLLLIL;
        if (c1239720iMk2 != null) {
            c1239720iMk = c1239720iMk2;
        }
        c1239720iMk.LIZ(true);
        InterfaceC1239890iN1 interfaceC1239890iN1 = this.LLILLJJLI;
        if (interfaceC1239890iN1 != null) {
            interfaceC1239890iN1.LLLII();
        }
    }

    public C1239810iMt(C19GS c19gs, ViewStub viewStub, InterfaceC1239890iN1 interfaceC1239890iN1) {
        super(c19gs, viewStub, interfaceC1239890iN1);
    }
}
