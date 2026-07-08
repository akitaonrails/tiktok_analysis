package X;

import Y.ACListenerS154S0100000_19;
import Y.ARunnableS119S0100000_19;
import android.content.Intent;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0iMs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1239800iMs extends C1239830iMv {
    public static final /* synthetic */ int LLJIJIL = 0;
    public C1239720iMk LLIZLLLIL;
    public ImageView LLJ;
    public String LLJI;

    @Override // X.C1239830iMv
    public final View LIZJ() {
        if (this.LL.getLayoutResource() <= 0) {
            this.LL.setLayoutResource(R.layout.ze);
        }
        View viewLJLLLL = C786410Ut5.LJLLLL(this.LL);
        this.LLJ = (ImageView) viewLJLLLL.findViewById(R.id.nnu);
        C1239720iMk c1239720iMk = (C1239720iMk) viewLJLLLL.findViewById(R.id.nnt);
        this.LLIZLLLIL = c1239720iMk;
        if (c1239720iMk == null) {
            c1239720iMk = null;
        }
        C10VO.LIZIZ(c1239720iMk);
        C1239720iMk c1239720iMk2 = this.LLIZLLLIL;
        if (c1239720iMk2 == null) {
            c1239720iMk2 = null;
        }
        c1239720iMk2.setEnabled(false);
        C1239720iMk c1239720iMk3 = this.LLIZLLLIL;
        if (c1239720iMk3 == null) {
            c1239720iMk3 = null;
        }
        C786410Ut5.u9(c1239720iMk3, new ACListenerS154S0100000_19(this, 305));
        if (this.LLILZIL == null) {
            LJIIJ(null, "JSON is empty");
            return viewLJLLLL;
        }
        C09UZ.LIZ(new ARunnableS119S0100000_19(this, 219));
        return viewLJLLLL;
    }

    public static String LJIIIIZZ(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public final void LJIIJ(Integer num, String str) {
        C1239720iMk c1239720iMk = this.LLIZLLLIL;
        if (c1239720iMk == null) {
            c1239720iMk = null;
        }
        c1239720iMk.LIZ(true);
        String strLIZIZ = LIZIZ(num, str);
        C1233040iBy c1233040iBy = new C1233040iBy(LIZ());
        c1233040iBy.LIZJ(strLIZIZ);
        c1233040iBy.LIZLLL();
        InterfaceC1239890iN1 interfaceC1239890iN1 = this.LLILLJJLI;
        if (interfaceC1239890iN1 != null) {
            interfaceC1239890iN1.LLLII();
        }
    }

    public C1239800iMs(C19GS c19gs, ViewStub viewStub, InterfaceC1239890iN1 interfaceC1239890iN1) {
        super(c19gs, viewStub, interfaceC1239890iN1);
    }

    public final void LJIIIZ(int i, int i2, Intent intent) {
        Integer numValueOf;
        String strLJIIIIZZ;
        String strLJIIIIZZ2;
        String strLJIIIIZZ3;
        Integer numValueOf2;
        String strLJIIIIZZ4;
        if (i == 123) {
            String strLJIIIIZZ5 = null;
            if (i2 == -1) {
                if (intent != null) {
                    strLJIIIIZZ = LJIIIIZZ(intent, "access_token");
                    strLJIIIIZZ2 = LJIIIIZZ(intent, "access_token_secret");
                    strLJIIIIZZ3 = LJIIIIZZ(intent, "code");
                    numValueOf2 = Integer.valueOf(intent.getIntExtra("expires_in", 0));
                    strLJIIIIZZ4 = LJIIIIZZ(intent, "platform_id");
                    if (strLJIIIIZZ4 == null) {
                    }
                    TwoStepAuthApi.LIZIZ().verifyThirdParty(strLJIIIIZZ, strLJIIIIZZ2, strLJIIIIZZ3, numValueOf2, 0, this.LLJI, Integer.valueOf(C07TE.LIZ(0, strLJIIIIZZ4)), null, this.LLIZ).LJ(new C1266160j3O(this, 11), C15O7.LJIIIIZZ, null);
                    return;
                }
                strLJIIIIZZ = null;
                strLJIIIIZZ2 = null;
                strLJIIIIZZ3 = null;
                numValueOf2 = null;
                strLJIIIIZZ4 = "";
                TwoStepAuthApi.LIZIZ().verifyThirdParty(strLJIIIIZZ, strLJIIIIZZ2, strLJIIIIZZ3, numValueOf2, 0, this.LLJI, Integer.valueOf(C07TE.LIZ(0, strLJIIIIZZ4)), null, this.LLIZ).LJ(new C1266160j3O(this, 11), C15O7.LJIIIIZZ, null);
                return;
            }
            if (intent != null) {
                numValueOf = Integer.valueOf(intent.getIntExtra("error_code", 0));
                strLJIIIIZZ5 = LJIIIIZZ(intent, "description");
            } else {
                numValueOf = null;
            }
            LJIIJ(numValueOf, strLJIIIIZZ5);
        }
    }
}
