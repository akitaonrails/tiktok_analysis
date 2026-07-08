package Y;

import X.C08LY;
import X.C09RB;
import X.C13BV;
import X.C1939607ik;
import X.C700390Rdd;
import X.C702940Rhk;
import X.C702990Rhp;
import X.C703070Rhx;
import X.C703160Ri6;
import X.C703260RiG;
import X.C703270RiH;
import X.C703290RiJ;
import X.EnumC699470Rc9;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes12.dex */
public class AObjectS93S1100000_11 implements Function0 {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS93S1100000_11 aObjectS93S1100000_11) {
        EnumC699470Rc9 enumC699470Rc9;
        boolean z;
        C703290RiJ c703290RiJ = (C703290RiJ) aObjectS93S1100000_11.l1;
        String str = aObjectS93S1100000_11.s0;
        C702940Rhk c702940RhkLIZJ = c703290RiJ.LJI().getState().LIZIZ;
        if (c702940RhkLIZJ == null) {
            c702940RhkLIZJ = c703290RiJ.LJII.LIZJ();
        }
        C703070Rhx c703070Rhx = c702940RhkLIZJ.LIZIZ.get(str);
        if (c703070Rhx != null) {
            enumC699470Rc9 = c703070Rhx.LIZ;
        } else {
            enumC699470Rc9 = null;
        }
        if (enumC699470Rc9 == EnumC699470Rc9.AVAILABLE) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$1(AObjectS93S1100000_11 aObjectS93S1100000_11) {
        C703290RiJ c703290RiJ = (C703290RiJ) aObjectS93S1100000_11.l1;
        final String str = aObjectS93S1100000_11.s0;
        C703270RiH c703270RiH = c703290RiJ.LJIIIIZZ;
        C702990Rhp state = c703290RiJ.LJI().getState();
        c703270RiH.getClass();
        C702940Rhk c702940Rhk = state.LIZIZ;
        if (c702940Rhk == null) {
            return C13BV.INSTANCE;
        }
        List<C703160Ri6> list = state.LIZ.get(str);
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        if (list.isEmpty()) {
            return C13BV.INSTANCE;
        }
        final C703260RiG c703260RiG = c703270RiH.LIZ;
        final C703070Rhx c703070Rhx = c702940Rhk.LIZIZ.get(str);
        final Map<String, List<C703160Ri6>> map = state.LIZ;
        final Set<String> setKeySet = state.LJIIIIZZ.keySet();
        final C700390Rdd c700390Rdd = new C700390Rdd(c702940Rhk.LIZJ);
        c703260RiG.getClass();
        return C09RB.LJJII(new C08LY(C09RB.LJIIIZ(C09RB.LJIIIZ(new C1939607ik(list), new AObjectS114S0000000_11(1)), new Function1() { // from class: X.0RiF
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                C703260RiG c703260RiG2 = c703260RiG;
                String str2 = str;
                C703070Rhx c703070Rhx2 = c703070Rhx;
                Map map2 = map;
                Set set = setKeySet;
                C700390Rdd c700390Rdd2 = c700390Rdd;
                c703260RiG2.LIZ.getClass();
                return Boolean.valueOf(C703150Ri5.LIZ(str2, (C703160Ri6) obj, c703070Rhx2, map2, set, c700390Rdd2).LIZ);
            }
        }), new AObjectS114S0000000_11(2)));
    }

    public AObjectS93S1100000_11(C703290RiJ c703290RiJ, String str, int i) {
        this.$t = i;
        this.l1 = c703290RiJ;
        this.s0 = str;
    }
}
