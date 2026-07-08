package X;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0bGv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C967030bGv extends C09AY implements Function0<List<? extends C967180bHA>> {
    public final /* synthetic */ C967130bH5 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C967030bGv(C967130bH5 c967130bH5) {
        super(0);
        this.LL = c967130bH5;
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends C967180bHA> invoke() {
        List<C967180bHA> listLJLJL;
        InterfaceC966930bGl interfaceC966930bGl = this.LL.LIZLLL;
        return (interfaceC966930bGl == null || (listLJLJL = interfaceC966930bGl.LJLJL()) == null) ? C13BV.INSTANCE : listLJLJL;
    }
}
