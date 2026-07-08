package X;

import com.bytedance.ttnet.TTNetInit;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0CFp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C310630CFp implements InterfaceC1101140elE {
    public final Set<Function1<Integer, Unit>> LIZ = new LinkedHashSet();

    @Override // X.InterfaceC1101140elE
    public final synchronized void LJI() {
        if (this.LIZ.isEmpty()) {
            return;
        }
        int effectiveConnectionType = TTNetInit.getEffectiveConnectionType();
        Iterator<Function1<Integer, Unit>> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().invoke(Integer.valueOf(effectiveConnectionType));
        }
    }

    @Override // X.InterfaceC1101140elE
    public final void start() {
    }

    @Override // X.InterfaceC1101140elE
    public final void stop() {
    }

    @Override // X.InterfaceC1101140elE
    public final void destroy() {
        this.LIZ.clear();
    }

    public final void LIZ(C1090220eTc c1090220eTc) {
        this.LIZ.add(c1090220eTc);
    }
}
