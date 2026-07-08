package X;

import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility;

/* JADX INFO: renamed from: X.12YH, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public class C12YH implements View.OnLongClickListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.$t) {
            case 0:
                return onLongClick$0(this, view);
            case 1:
                return onLongClick$1(this, view);
            case 2:
                return onLongClick$2(this, view);
            case 3:
                return onLongClick$3(this, view);
            case 4:
                return onLongClick$4(this, view);
            case 5:
                return onLongClick$5(this, view);
            default:
                return false;
        }
    }

    public C12YH(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final boolean onLongClick$0(C12YH c12yh, View view) {
        C19759512Sr c19759512Sr = (C19759512Sr) c12yh.l0;
        if (c19759512Sr.LLLF) {
            return true;
        }
        c19759512Sr.LLJZ = true;
        c19759512Sr.LLLLLLL("long_press");
        return true;
    }

    public static final boolean onLongClick$1(C12YH c12yh, View view) {
        C19759412Sq c19759412Sq = (C19759412Sq) c12yh.l0;
        if (c19759412Sq.LLJLLL) {
            return true;
        }
        c19759412Sq.LLJLILLLLZIIL = true;
        c19759412Sq.LLLLLLLLL("long_press");
        return true;
    }

    public static final boolean onLongClick$2(C12YH c12yh, View view) {
        C19762612Tw c19762612Tw = (C19762612Tw) c12yh.l0;
        if (c19762612Tw.LLJJIJIL) {
            return true;
        }
        c19762612Tw.LLLIIII = true;
        InterfaceC1461660o8i interfaceC1461660o8iLIZJ = ((InterfaceC1455850nzL) c19762612Tw.LLJLIL.getValue(c19762612Tw, C19762612Tw.LLLLJ[6])).AT().LIZJ();
        if (interfaceC1461660o8iLIZJ != null) {
            interfaceC1461660o8iLIZJ.R3(true);
        }
        C19762712Tx c19762712Tx = ((C19762612Tw) c12yh.l0).LLLII;
        if (c19762712Tx == null) {
            c19762712Tx = null;
        }
        c19762712Tx.LLILZ.end();
        c19762712Tx.LLILLL.start();
        ((C19762612Tw) c12yh.l0).LLLLIL(C1DPV.LIZIZ.LIZIZ(C1DPW.AUDIO_START_RECORD_START_EDIT, EnumC2249681D3m.EDIT), true);
        C0LAB c0labLLLILZLLLI = ((C19762612Tw) c12yh.l0).LLLILZLLLI();
        c0labLLLILZLLLI.LJ("enter_method", "long_press");
        C20684815ws.LJIILLIIL("record_dub_start", c0labLLLILZLLLI.LIZ);
        return true;
    }

    public static final boolean onLongClick$3(C12YH c12yh, View view) {
        TakoCardAbility takoCardAbility;
        ViewGroup viewGroupY4;
        InterfaceC665370Q7z interfaceC665370Q7z = ((C12NV) c12yh.l0).LLJILJIL;
        if (interfaceC665370Q7z != null && (takoCardAbility = (TakoCardAbility) C1558520qew.LIZ(interfaceC665370Q7z, TakoCardAbility.class, null)) != null && (viewGroupY4 = takoCardAbility.Y4()) != null) {
            viewGroupY4.performLongClick();
            return true;
        }
        return true;
    }

    public static final boolean onLongClick$4(C12YH c12yh, View view) {
        TakoCardAbility takoCardAbility;
        ViewGroup viewGroupY4;
        InterfaceC665370Q7z interfaceC665370Q7z = ((C12NU) c12yh.l0).LLJILJIL;
        if (interfaceC665370Q7z != null && (takoCardAbility = (TakoCardAbility) C1558520qew.LIZ(interfaceC665370Q7z, TakoCardAbility.class, null)) != null && (viewGroupY4 = takoCardAbility.Y4()) != null) {
            viewGroupY4.performLongClick();
            return true;
        }
        return true;
    }

    public static final boolean onLongClick$5(C12YH c12yh, View view) {
        C12U9 c12u9 = (C12U9) c12yh.l0;
        c12u9.LLLF = true;
        C12UE c12ue = c12u9.LLL;
        if (c12ue == null) {
            c12ue = null;
        }
        c12ue.LLILZ.end();
        c12ue.LLILLL.start();
        ((C12U9) c12yh.l0).LLLLIIIILLL(C1DPV.LIZIZ.LIZIZ(C1DPW.FTC_AUDIO_START_RECORD_START_LONG_CLICK, EnumC2249681D3m.EDIT), true);
        ((C12U9) c12yh.l0).getClass();
        return true;
    }
}
