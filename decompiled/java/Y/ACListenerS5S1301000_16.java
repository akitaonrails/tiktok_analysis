package Y;

import X.C1023960ckk;
import X.C1035880d3y;
import X.C1069080dvW;
import X.C1069260dvo;
import X.C1E1H;
import X.C1E1J;
import X.C1E1L;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.List;
import kotlin.jvm.internal.AFwS252S0000000_16;

/* JADX INFO: loaded from: classes17.dex */
public class ACListenerS5S1301000_16 implements View.OnClickListener {
    public final int $t;
    public int i4;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
            case 3:
                onClick$3(this, view);
                break;
            case 4:
                onClick$4(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS5S1301000_16 aCListenerS5S1301000_16, View view) {
        AwemeRawAd awemeRawAd;
        C1069260dvo c1069260dvo = new C1069260dvo(((C1069080dvW) aCListenerS5S1301000_16.l1).LJIL());
        C1023960ckk c1023960ckk = C1E1J.LIZ;
        C1035880d3y c1035880d3y = ((C1069080dvW) aCListenerS5S1301000_16.l1).LLIZ;
        if (c1035880d3y != null) {
            awemeRawAd = c1035880d3y.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        c1069260dvo.logAd(c1023960ckk, awemeRawAd, AFwS252S0000000_16.get$arr$(610));
        ((C1069080dvW) aCListenerS5S1301000_16.l1).LIZLLL();
        ((C1069080dvW) aCListenerS5S1301000_16.l1).LJIJJLI(false, false, false, aCListenerS5S1301000_16.s0, (List) aCListenerS5S1301000_16.l2, aCListenerS5S1301000_16.i4, (Integer) aCListenerS5S1301000_16.l3);
    }

    public static final void onClick$1(ACListenerS5S1301000_16 aCListenerS5S1301000_16, View view) {
        AwemeRawAd awemeRawAd;
        C1069260dvo c1069260dvo = new C1069260dvo(((C1069080dvW) aCListenerS5S1301000_16.l1).LJIL());
        C1023960ckk c1023960ckk = C1E1L.LIZ;
        C1035880d3y c1035880d3y = ((C1069080dvW) aCListenerS5S1301000_16.l1).LLIZ;
        if (c1035880d3y != null) {
            awemeRawAd = c1035880d3y.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        c1069260dvo.logAd(c1023960ckk, awemeRawAd, AFwS252S0000000_16.get$arr$(611));
        Keva.getRepo("autofill_info").storeBoolean("click_autofill_keyboard_expand_icon", true);
        ((C1069080dvW) aCListenerS5S1301000_16.l1).LJIJJLI(true, true, false, aCListenerS5S1301000_16.s0, (List) aCListenerS5S1301000_16.l2, aCListenerS5S1301000_16.i4, (Integer) aCListenerS5S1301000_16.l3);
    }

    public static final void onClick$2(ACListenerS5S1301000_16 aCListenerS5S1301000_16, View view) {
        AwemeRawAd awemeRawAd;
        C1069260dvo c1069260dvo = new C1069260dvo(((C1069080dvW) aCListenerS5S1301000_16.l1).LJIL());
        C1023960ckk c1023960ckk = C1E1L.LIZ;
        C1035880d3y c1035880d3y = ((C1069080dvW) aCListenerS5S1301000_16.l1).LLIZ;
        if (c1035880d3y != null) {
            awemeRawAd = c1035880d3y.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        c1069260dvo.logAd(c1023960ckk, awemeRawAd, AFwS252S0000000_16.get$arr$(612));
        Keva.getRepo("autofill_info").storeBoolean("click_autofill_keyboard_expand_icon", true);
        ((C1069080dvW) aCListenerS5S1301000_16.l1).LJIJJLI(false, false, true, aCListenerS5S1301000_16.s0, (List) aCListenerS5S1301000_16.l2, aCListenerS5S1301000_16.i4, (Integer) aCListenerS5S1301000_16.l3);
    }

    public static final void onClick$3(ACListenerS5S1301000_16 aCListenerS5S1301000_16, View view) {
        ((C1069080dvW) aCListenerS5S1301000_16.l1).LJIIL(0);
        C1069080dvW c1069080dvW = (C1069080dvW) aCListenerS5S1301000_16.l1;
        String str = aCListenerS5S1301000_16.s0;
        c1069080dvW.LLJZIJLIL = str;
        List<String> list = (List) aCListenerS5S1301000_16.l2;
        c1069080dvW.LLL = list;
        int i = aCListenerS5S1301000_16.i4;
        c1069080dvW.LLLF = i;
        Integer num = (Integer) aCListenerS5S1301000_16.l3;
        c1069080dvW.LLLLLJLJLL = num;
        c1069080dvW.LLLFZ = i;
        c1069080dvW.LLLI = num;
        c1069080dvW.LLLFF = str;
        c1069080dvW.LLLFFI = list;
        InputMethodManager inputMethodManager = c1069080dvW.LLLLJ;
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(c1069080dvW.LLIZLLLIL, 0);
        }
    }

    public static final void onClick$4(ACListenerS5S1301000_16 aCListenerS5S1301000_16, View view) {
        AwemeRawAd awemeRawAd;
        C1069260dvo c1069260dvo = new C1069260dvo(((C1069080dvW) aCListenerS5S1301000_16.l1).LJIL());
        C1023960ckk c1023960ckk = C1E1H.LIZ;
        C1035880d3y c1035880d3y = ((C1069080dvW) aCListenerS5S1301000_16.l1).LLIZ;
        if (c1035880d3y != null) {
            awemeRawAd = c1035880d3y.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        c1069260dvo.logAd(c1023960ckk, awemeRawAd, AFwS252S0000000_16.get$arr$(617));
        ((C1069080dvW) aCListenerS5S1301000_16.l1).LIZLLL();
        ((C1069080dvW) aCListenerS5S1301000_16.l1).LJIJJLI(true, false, false, aCListenerS5S1301000_16.s0, (List) aCListenerS5S1301000_16.l2, aCListenerS5S1301000_16.i4, (Integer) aCListenerS5S1301000_16.l3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ACListenerS5S1301000_16(C1069080dvW c1069080dvW, C1069080dvW c1069080dvW2, String str, List<String> list, int i, Integer num) {
        this.$t = num;
        this.l1 = c1069080dvW;
        this.s0 = c1069080dvW2;
        this.l2 = str;
        this.i4 = list;
        this.l3 = i;
    }
}
