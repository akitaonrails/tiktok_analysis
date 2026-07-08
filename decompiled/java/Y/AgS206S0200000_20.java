package Y;

import X.C05P0;
import X.C0PEM;
import X.C1306050k5j;
import X.C1306400k6I;
import X.C1306430k6L;
import X.C2286608xc;
import X.C2296808zG;
import X.C23250099c;
import X.EnumC994870bzp;
import X.InterfaceC1364105Vn;
import X.InterfaceC346701Wf;
import com.bytedance.android.starship.engine.graph.foundation.Task;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS421S0200000_20;

/* JADX INFO: loaded from: classes21.dex */
public class AgS206S0200000_20 implements InterfaceC346701Wf {
    public final int $t;
    public Object l0;
    public Object l1;

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

    public AgS206S0200000_20(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
    }

    public static final Object emit$0(AgS206S0200000_20 agS206S0200000_20, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        Task.Output output = (Task.Output) obj;
        C1306430k6L.LIZ(new AwS421S0200000_20((C1306400k6I) agS206S0200000_20.l0, output, 1));
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1306050k5j((Function1) agS206S0200000_20.l1, output, null), 3);
        return Unit.LIZ;
    }

    public static final Object emit$1(AgS206S0200000_20 agS206S0200000_20, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        ((Boolean) obj).booleanValue();
        ((C05P0) agS206S0200000_20.l1).setValue(EnumC994870bzp.SHOW);
        ((Function2) agS206S0200000_20.l0).invoke("effects_scroll_wheel_icon_fade_in", C2286608xc.LJ(-1));
        return Unit.LIZ;
    }
}
