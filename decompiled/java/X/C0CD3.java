package X;

import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0CD3, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CD3 extends C09AY implements Function0<Set<String>> {
    public C0CD3() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Set<String> invoke() {
        return C0CD2.LJFF().getStringSet("net_pre_connect_opt_domain", C0CD4.LIZ.domains);
    }
}
