package Y;

import X.C1157400gDy;
import X.C1157410gDz;
import X.C1665030tQj;
import X.EnumC1154770g9j;
import X.InterfaceC1157420gE0;
import X.InterfaceC1364105Vn;
import X.InterfaceC332260D0u;
import X.InterfaceC346701Wf;
import kotlin.Unit;

/* JADX INFO: loaded from: classes19.dex */
public class AgS299S0100000_18 implements InterfaceC346701Wf {
    public final int $t;
    public Object l0;

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

    public AgS299S0100000_18(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object emit$0(AgS299S0100000_18 agS299S0100000_18, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        EnumC1154770g9j enumC1154770g9j;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        InterfaceC1157420gE0 value = ((C1665030tQj) agS299S0100000_18.l0).LLILLJJLI.getValue();
        ((C1665030tQj) agS299S0100000_18.l0).getClass();
        if (zBooleanValue) {
            enumC1154770g9j = EnumC1154770g9j.EFFECT_PANEL;
        } else {
            enumC1154770g9j = EnumC1154770g9j.RECORD_PANEL;
        }
        if (value instanceof C1157400gDy) {
            ((C1665030tQj) agS299S0100000_18.l0).LLILLJJLI.setValue(new C1157400gDy(((C1157400gDy) value).LIZ, enumC1154770g9j));
        } else if (value instanceof C1157410gDz) {
            ((C1665030tQj) agS299S0100000_18.l0).LLILLJJLI.setValue(new C1157410gDz(((C1157410gDz) value).LIZ, enumC1154770g9j));
        }
        return Unit.LIZ;
    }

    public static final Object emit$1(AgS299S0100000_18 agS299S0100000_18, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        ((InterfaceC332260D0u) agS299S0100000_18.l0).setValue(obj);
        return Unit.LIZ;
    }
}
