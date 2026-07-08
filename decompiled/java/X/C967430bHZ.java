package X;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0bHZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C967430bHZ extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C967130bH5 LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C967430bHZ(C967130bH5 c967130bH5, int i) {
        super(0);
        this.LL = c967130bH5;
        this.LLILLJJLI = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Iterator<InterfaceC967450bHb> it2 = this.LL.LJIJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().LJIILJJIL(this.LLILLJJLI, this.LL);
        }
        return Unit.LIZ;
    }
}
