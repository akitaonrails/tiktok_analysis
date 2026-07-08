package Y;

import X.C380350Evh;
import X.C426320Gne;
import X.C786410Ut5;
import X.InterfaceC1364105Vn;
import X.InterfaceC346701Wf;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public class AgS164S0300000_5 implements InterfaceC346701Wf {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC346701Wf
    public final Object emit(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        switch (this.$t) {
            case 0:
                return emit$0(this, obj, interfaceC1364105Vn);
            case 1:
                return emit$1(this, obj, interfaceC1364105Vn);
            default:
                return null;
        }
    }

    public static final Object emit$0(AgS164S0300000_5 agS164S0300000_5, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        Pair pair = (Pair) obj;
        float fFloatValue = ((Number) pair.getFirst()).floatValue();
        float fFloatValue2 = ((Number) pair.getSecond()).floatValue();
        int iIntValue = ((Number) ((Pair) agS164S0300000_5.l0).getFirst()).intValue() + ((int) ((((Number) ((Pair) agS164S0300000_5.l1).getFirst()).intValue() - r3) * fFloatValue2));
        int iIntValue2 = ((Number) ((Pair) agS164S0300000_5.l0).getSecond()).intValue() + ((int) ((((Number) ((Pair) agS164S0300000_5.l1).getSecond()).intValue() - r2) * fFloatValue2));
        C380350Evh c380350Evh = (C380350Evh) agS164S0300000_5.l2;
        View view = c380350Evh.LLJJJIL;
        if (view != null) {
            C786410Ut5.T4(view, fFloatValue);
            if (c380350Evh.LLLLILI().LIZ.LIZ) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                marginLayoutParams.bottomMargin = iIntValue2;
                marginLayoutParams.setMarginStart(iIntValue);
                C786410Ut5.W5(view, marginLayoutParams);
            }
        }
        return Unit.LIZ;
    }

    public static final Object emit$1(AgS164S0300000_5 agS164S0300000_5, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        Pair pair = (Pair) obj;
        float fFloatValue = ((Number) pair.getFirst()).floatValue();
        float fFloatValue2 = ((Number) pair.getSecond()).floatValue();
        int iIntValue = ((Number) ((Pair) agS164S0300000_5.l0).getFirst()).intValue() + ((int) ((((Number) ((Pair) agS164S0300000_5.l1).getFirst()).intValue() - r3) * fFloatValue2));
        int iIntValue2 = ((Number) ((Pair) agS164S0300000_5.l0).getSecond()).intValue() + ((int) ((((Number) ((Pair) agS164S0300000_5.l1).getSecond()).intValue() - r2) * fFloatValue2));
        C426320Gne c426320Gne = ((C380350Evh) agS164S0300000_5.l2).LLJJJJJIL;
        if (c426320Gne != null) {
            C786410Ut5.E5(c426320Gne, fFloatValue);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) c426320Gne.getLayoutParams();
            marginLayoutParams.bottomMargin = iIntValue2;
            marginLayoutParams.setMarginStart(iIntValue);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c426320Gne);
            c426320Gne.setLayoutParams(marginLayoutParams);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AgS164S0300000_5(Pair pair, Pair<Integer, Integer> pair2, Pair<Integer, Integer> pair3, C380350Evh c380350Evh) {
        this.$t = c380350Evh;
        this.l0 = pair;
        this.l1 = pair2;
        this.l2 = pair3;
    }
}
