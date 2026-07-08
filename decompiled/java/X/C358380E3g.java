package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0E3g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C358380E3g extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C370820EgK LL;
    public final /* synthetic */ C358370E3f LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C358380E3g(C370820EgK c370820EgK, C358370E3f c358370E3f) {
        super(0);
        this.LL = c370820EgK;
        this.LLILLJJLI = c358370E3f;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ArrayList arrayList = new ArrayList();
        List<InterfaceC358400E3i> list = this.LLILLJJLI.LJ;
        C370820EgK c370820EgK = this.LL;
        for (InterfaceC358400E3i interfaceC358400E3i : (ArrayList) list) {
            if (interfaceC358400E3i.LIZ(c370820EgK.LIZIZ, c370820EgK.LIZ)) {
                arrayList.add(interfaceC358400E3i);
            }
        }
        ((ArrayList) this.LLILLJJLI.LJ).removeAll(arrayList);
        return Unit.LIZ;
    }
}
