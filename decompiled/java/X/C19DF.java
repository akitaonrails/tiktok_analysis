package X;

import com.bytedance.ies.foundation.fragment.BaseFragment;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: renamed from: X.19DF, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C19DF extends C09AY implements Function0<List<? extends C19DG>> {
    public C19DF() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends C19DG> invoke() {
        return C1697810uHb.LJIIJJI(new C19DG() { // from class: X.19DD
            public final boolean LJIJ() {
                C06W3 next;
                Iterator<C06W3> it2 = LJIIZILJ().LIZ().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    if (next instanceof C1239450iMJ) {
                        break;
                    }
                }
                C1239450iMJ c1239450iMJ = (C1239450iMJ) (next instanceof C1239450iMJ ? next : null);
                if (c1239450iMJ != null) {
                    return c1239450iMJ.LIZ;
                }
                return false;
            }

            @Override // X.C19DE, X.C1EKA
            public final void LJIIJJI(BaseFragment baseFragment) {
                EventBus eventBusLIZLLL = EventBus.LIZLLL();
                if (LJIJ() && eventBusLIZLLL.LJIIJ(baseFragment)) {
                    eventBusLIZLLL.LJJI(baseFragment);
                }
            }

            @Override // X.C19DE, X.C1EKA
            public final void LJIILJJIL(BaseFragment baseFragment) {
                EventBus eventBusLIZLLL = EventBus.LIZLLL();
                if (!eventBusLIZLLL.LJIIJ(baseFragment) && LJIJ()) {
                    eventBusLIZLLL.LJIJJ(baseFragment);
                }
            }
        }, new C19DC());
    }
}
