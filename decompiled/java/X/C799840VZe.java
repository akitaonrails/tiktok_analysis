package X;

import com.ss.android.ugc.aweme.experiment.ReDexExperimentOpt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0VZe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C799840VZe implements InterfaceC799860VZg {
    public final List<InterfaceC799860VZg> LIZ = new ArrayList();

    private final void LIZ$redex$base(InterfaceC800080Va2 interfaceC800080Va2) {
        Iterator<InterfaceC799860VZg> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(interfaceC800080Va2);
        }
    }

    private final void LIZ$redex$opt(InterfaceC800080Va2 interfaceC800080Va2) {
        List<InterfaceC799860VZg> list = this.LIZ;
        int i = 0;
        int size = list.size();
        while (i < size) {
            InterfaceC799860VZg interfaceC799860VZg = list.get(i);
            i++;
            interfaceC799860VZg.LIZ(interfaceC800080Va2);
        }
    }

    private final void LIZIZ$redex$base(InterfaceC800080Va2 interfaceC800080Va2) {
        Iterator<InterfaceC799860VZg> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZIZ(interfaceC800080Va2);
        }
    }

    private final void LIZIZ$redex$opt(InterfaceC800080Va2 interfaceC800080Va2) {
        List<InterfaceC799860VZg> list = this.LIZ;
        int i = 0;
        int size = list.size();
        while (i < size) {
            InterfaceC799860VZg interfaceC799860VZg = list.get(i);
            i++;
            interfaceC799860VZg.LIZIZ(interfaceC800080Va2);
        }
    }

    @Override // X.InterfaceC799860VZg
    public final void LIZ(InterfaceC800080Va2 interfaceC800080Va2) {
        if (!ReDexExperimentOpt.getAbTest()) {
            LIZ$redex$base(interfaceC800080Va2);
        } else {
            LIZ$redex$opt(interfaceC800080Va2);
        }
    }

    @Override // X.InterfaceC799860VZg
    public final void LIZIZ(InterfaceC800080Va2 interfaceC800080Va2) {
        if (!ReDexExperimentOpt.getAbTest()) {
            LIZIZ$redex$base(interfaceC800080Va2);
        } else {
            LIZIZ$redex$opt(interfaceC800080Va2);
        }
    }

    @Override // X.InterfaceC799860VZg
    public final void LIZJ(InterfaceC800080Va2 interfaceC800080Va2) {
        Iterator<InterfaceC799860VZg> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZJ(interfaceC800080Va2);
        }
    }
}
