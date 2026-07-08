package X;

import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0ykD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1869310ykD extends C09AY implements Function0<Set<? extends String>> {
    public final /* synthetic */ C1869320ykE LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1869310ykD(C1869320ykE c1869320ykE) {
        super(0);
        this.LL = c1869320ykE;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Set<? extends String> invoke() {
        return C13LP.LLIIJI(a0.LJJLIIIJILLIZJL(this.LL.LIZLLL("delay_region_list", "US,GB,PL,CH,AT,NL,FR,IT,ES,SE,BE,IE,DK,NO,RO,FI,CZ,DE"), new String[]{","}, 0, 6));
    }
}
