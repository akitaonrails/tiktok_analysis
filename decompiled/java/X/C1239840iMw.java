package X;

import Y.ACListenerS154S0100000_19;
import Y.ARunnableS119S0100000_19;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0iMw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1239840iMw extends C1239830iMv implements InterfaceC1237610iJL {
    public static final /* synthetic */ int LLJJI = 0;
    public C1237240iIk LLIZLLLIL;
    public C21407818qC LLJ;
    public C19713212Aw LLJI;
    public TextView LLJIJIL;
    public TextView LLJILJIL;
    public View LLJILJILJ;
    public View LLJILLL;
    public boolean LLJJ;

    @Override // X.C1239830iMv
    public final View LIZJ() {
        this.LLILLL = new C854410XfT(EnumC854400XfS.EMAIL);
        if (this.LL.getLayoutResource() <= 0) {
            this.LL.setLayoutResource(R.layout.zb);
        }
        View viewLJLLLL = C786410Ut5.LJLLLL(this.LL);
        this.LLJI = (C19713212Aw) viewLJLLLL.findViewById(R.id.gyn);
        this.LLJIJIL = (TextView) viewLJLLLL.findViewById(R.id.gyj);
        this.LLJ = (C21407818qC) viewLJLLLL.findViewById(R.id.gym);
        this.LLJILJILJ = viewLJLLLL.findViewById(R.id.gyo);
        this.LLIZLLLIL = (C1237240iIk) viewLJLLLL.findViewById(R.id.gyp);
        this.LLJILLL = viewLJLLLL.findViewById(R.id.gyk);
        this.LLJILJIL = (TextView) viewLJLLLL.findViewById(R.id.gyl);
        C1237240iIk c1237240iIk = this.LLIZLLLIL;
        if (c1237240iIk == null) {
            c1237240iIk = null;
        }
        c1237240iIk.LLJJLIIIJLLLLLLLZ = "s";
        c1237240iIk.LLJJJJLIIL = 60000L;
        c1237240iIk.LLJJL = 1000L;
        c1237240iIk.setText(String.valueOf(60000 / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) + "s");
        C1237240iIk c1237240iIk2 = this.LLIZLLLIL;
        if (c1237240iIk2 == null) {
            c1237240iIk2 = null;
        }
        c1237240iIk2.setCallback(new C1236960iII() { // from class: X.0iMz
            @Override // X.InterfaceC1237230iIj
            public final void LIZLLL() {
                C1237240iIk c1237240iIk3 = this.LL.LLIZLLLIL;
                if (c1237240iIk3 == null) {
                    c1237240iIk3 = null;
                }
                C786410Ut5.c(c1237240iIk3, 8);
                View view = this.LL.LLJILJILJ;
                (view != null ? view : null).setEnabled(true);
            }

            @Override // X.InterfaceC1237230iIj
            public final void onStart() {
                C1237240iIk c1237240iIk3 = this.LL.LLIZLLLIL;
                if (c1237240iIk3 == null) {
                    c1237240iIk3 = null;
                }
                C786410Ut5.c(c1237240iIk3, 0);
                View view = this.LL.LLJILJILJ;
                (view != null ? view : null).setEnabled(false);
            }
        });
        View view = this.LLJILJILJ;
        if (view == null) {
            view = null;
        }
        view.setEnabled(false);
        View view2 = this.LLJILJILJ;
        if (view2 == null) {
            view2 = null;
        }
        C786410Ut5.I7(new ACListenerS154S0100000_19(this, 304), view2);
        C21407818qC c21407818qC = this.LLJ;
        if (c21407818qC == null) {
            c21407818qC = null;
        }
        c21407818qC.setEnabled(false);
        C21407818qC c21407818qC2 = this.LLJ;
        if (c21407818qC2 == null) {
            c21407818qC2 = null;
        }
        c21407818qC2.LJIIJ();
        C21407818qC c21407818qC3 = this.LLJ;
        if (c21407818qC3 == null) {
            c21407818qC3 = null;
        }
        c21407818qC3.LJIIIIZZ();
        C21407818qC c21407818qC4 = this.LLJ;
        if (c21407818qC4 == null) {
            c21407818qC4 = null;
        }
        c21407818qC4.setCallback(this);
        C21407818qC c21407818qC5 = this.LLJ;
        if (c21407818qC5 == null) {
            c21407818qC5 = null;
        }
        c21407818qC5.setInputLength(6);
        if (this.LLILZIL == null) {
            LJIIJ(null, "JSON is empty");
        } else {
            C09UZ.LIZ(new ARunnableS119S0100000_19(this, 218));
        }
        LJFF();
        return viewLJLLLL;
    }

    public final void LJIIIIZZ() {
        View view = this.LLJILLL;
        if (view == null) {
            view = null;
        }
        C786410Ut5.LJLLLLLL(8, view);
        C21407818qC c21407818qC = this.LLJ;
        (c21407818qC != null ? c21407818qC : null).LJIIIZ();
    }

    public final void LJIIIZ() {
        C19713212Aw c19713212Aw = this.LLJI;
        if (c19713212Aw == null) {
            c19713212Aw = null;
        }
        c19713212Aw.LIZJ();
        C19713212Aw c19713212Aw2 = this.LLJI;
        C786410Ut5.w1(c19713212Aw2 != null ? c19713212Aw2 : null, 8);
    }

    @Override // X.InterfaceC1237610iJL
    public final void LJJJLIIL() {
        if (this.LLJJ) {
            C21407818qC c21407818qC = this.LLJ;
            if (c21407818qC == null) {
                c21407818qC = null;
            }
            c21407818qC.setText("");
            this.LLJJ = false;
        }
        LJIIIIZZ();
    }

    @Override // X.InterfaceC1237610iJL
    public final void LJJLL() {
        if (LJII()) {
            C854410XfT c854410XfT = this.LLILLL;
            if (c854410XfT == null) {
                c854410XfT = null;
            }
            c854410XfT.LIZJ();
        }
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("enter_from", "signup_panel");
        c0xgr.LIZLLL("enter_method", "idv_auto_trigger");
        c0xgr.LIZLLL("page", "signup_idv");
        c0xgr.LIZLLL("send_type", "code_and_link");
        C20684815ws.LJIILLIIL("start_email_code_typing", c0xgr.LIZ);
    }

    public final void LJIIJJI(String str) {
        TwoStepAuthApi.LIZIZ().sendEmailCode(this.LLIZ, 24, 2).LJ(new C1266150j3N(this, str, 1), C15O7.LJIIIIZZ, null);
    }

    public final void LJIIJ(Integer num, String str) {
        LJ(false);
        LJIIIZ();
        String strLIZIZ = LIZIZ(num, str);
        View view = this.LLJILLL;
        C21407818qC c21407818qC = null;
        if (view == null) {
            view = null;
        }
        C786410Ut5.LJLLLLLL(0, view);
        TextView textView = this.LLJILJIL;
        if (textView == null) {
            textView = null;
        }
        textView.setText(strLIZIZ);
        C21407818qC c21407818qC2 = this.LLJ;
        if (c21407818qC2 != null) {
            c21407818qC = c21407818qC2;
        }
        c21407818qC.LJIIJJI();
        InterfaceC1239890iN1 interfaceC1239890iN1 = this.LLILLJJLI;
        if (interfaceC1239890iN1 != null) {
            interfaceC1239890iN1.LLLII();
        }
    }

    @Override // X.InterfaceC1237610iJL
    public final void Tk(String str, String str2) {
        this.LLJJ = false;
        C19713212Aw c19713212Aw = this.LLJI;
        if (c19713212Aw == null) {
            c19713212Aw = null;
        }
        C786410Ut5.w1(c19713212Aw, 0);
        C19713212Aw c19713212Aw2 = this.LLJI;
        if (c19713212Aw2 == null) {
            c19713212Aw2 = null;
        }
        c19713212Aw2.LIZIZ();
        LJIIIIZZ();
        TwoStepAuthApi.LIZIZ().verifyEmailCode(1, C08HN.LIZ(null), C08HN.LIZ(str), CastIntegerProtector.parseInt(C08HN.LIZ("24")), this.LLIZ).LJ(new C1266150j3N(this, str2, 0), C15O7.LJIIIIZZ, null);
    }

    public C1239840iMw(C19GS c19gs, ViewStub viewStub, InterfaceC1239890iN1 interfaceC1239890iN1) {
        super(c19gs, viewStub, interfaceC1239890iN1);
    }
}
