package X;

import android.content.Context;
import com.bytedance.touchpoint.core.pendant.manager.BasePendantManager;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS80S0301000_28;

/* JADX INFO: renamed from: X.0zX1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1899570zX1 implements InterfaceC1896920zSk {
    public static final C01GW<C1899570zX1> LIZLLL = C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, AFwS217S0000000_28.get$arr$(552));
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(554));
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(555));
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(553));

    @Override // X.InterfaceC1896920zSk
    public final void LIZJ() {
        ((Map) this.LIZIZ.getValue()).clear();
    }

    @Override // X.InterfaceC1896920zSk
    public final boolean LIZ(String str) {
        Integer num = (Integer) ((Map) this.LIZIZ.getValue()).get(str);
        if (num != null && num.intValue() == 1) {
            return true;
        }
        return false;
    }

    public final void LIZLLL(BasePendantManager basePendantManager) {
        ((List) this.LIZJ.getValue()).add(basePendantManager);
    }

    @Override // X.InterfaceC1896920zSk
    public final void LIZIZ(Context context, C1894690zP9 c1894690zP9) {
        C01U6.LIZIZ(new AwS80S0301000_28(this, context, c1894690zP9, 0));
    }

    public final void LJ(int i, String str) {
        ((Map) this.LIZIZ.getValue()).put(str, Integer.valueOf(i));
    }
}
