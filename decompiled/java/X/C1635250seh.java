package X;

import Y.AkS486S0100000_25;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffectModel;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0seh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1635250seh extends AbstractC1635300sem<ProviderEffect, C1634860se4, ProviderEffectModel> {
    public final Function0<InterfaceC1635390sev> LIZJ;
    public final String LIZLLL;
    public final String LJ;

    public final int getPosition() {
        return ((C1634860se4) this.LIZ.get()).LIZ;
    }

    public final boolean hasNext() {
        return ((C1634860se4) this.LIZ.get()).LIZIZ;
    }

    @Override // X.C11T3
    public final C11NZ requestActual(Object obj) {
        Pair pair = (Pair) obj;
        int iIntValue = ((Number) pair.getFirst()).intValue();
        C1634860se4 c1634860se4 = (C1634860se4) pair.getSecond();
        return LJI(iIntValue, c1634860se4).LJIL(new AkS486S0100000_25(c1634860se4, 34)).LJJIJLIJ();
    }

    @Override // X.AbstractC1635300sem
    public final boolean LJ(C1634860se4 c1634860se4, C1634860se4 c1634860se42) {
        if (c1634860se4.LIZ == c1634860se42.LIZ) {
            return true;
        }
        return false;
    }

    public C11KS LJI(final int i, final C1634860se4 c1634860se4) {
        return AbstractC19484711Kz.LJII(new InterfaceC300801Eo() { // from class: X.0sei
            @Override // X.InterfaceC300801Eo
            public final void subscribe(InterfaceC2329309At<C1641660sp2<ProviderEffectModel>> interfaceC2329309At) {
                Map mapLIZJ;
                if (Intrinsics.LJFF(this.LL.LIZLLL, "tenor")) {
                    mapLIZJ = C2097908Jt.LIZJ(new Pair("cursor_id", c1634860se4.LIZJ));
                } else {
                    mapLIZJ = null;
                }
                InterfaceC1635390sev interfaceC1635390sevInvoke = this.LL.LIZJ.invoke();
                C1635250seh c1635250seh = this.LL;
                interfaceC1635390sevInvoke.pg(c1635250seh.LIZLLL, c1634860se4.LIZ, i, c1635250seh.LJ, null, mapLIZJ, new C1635280sek((C11KT) interfaceC2329309At));
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1635250seh(Function0<? extends InterfaceC1635390sev> function0, String str, String str2, C1634860se4 c1634860se4) {
        super(c1634860se4);
        this.LIZJ = function0;
        this.LIZLLL = str;
        this.LJ = str2;
    }
}
