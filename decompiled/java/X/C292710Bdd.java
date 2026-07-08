package X;

import java.util.Collections;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Bdd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C292710Bdd extends C09AY implements Function0<Set<String>> {
    public C292710Bdd() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Set<String> invoke() {
        InterfaceC307670C4f interfaceC307670C4f = C292560BdO.LIZIZ;
        if (interfaceC307670C4f == null) {
            interfaceC307670C4f = null;
        }
        return Collections.synchronizedSet(interfaceC307670C4f.LJ());
    }
}
