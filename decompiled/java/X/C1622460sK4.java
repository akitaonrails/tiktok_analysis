package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS111S0110000_25;

/* JADX INFO: renamed from: X.0sK4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1622460sK4 extends C1622490sK7 {
    public final List<InterfaceC1622470sK5> LIZJ;

    public C1622460sK4(C1698430uIb c1698430uIb) {
        super(c1698430uIb);
        this.LIZJ = new ArrayList();
    }

    @Override // X.C1622490sK7, X.C0LH1
    public final int LIZIZ(Effect effect, boolean z) {
        Iterator it2 = ((ArrayList) this.LIZJ).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            InterfaceC1622470sK5 interfaceC1622470sK5 = (InterfaceC1622470sK5) it2.next();
            if (interfaceC1622470sK5.LIZ(effect)) {
                new AwS111S0110000_25(this, z, 20);
                interfaceC1622470sK5.LIZIZ();
                effect = null;
                break;
            }
        }
        return C1622490sK7.LIZJ(this, effect, z, false, 4);
    }
}
