package X;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0E3k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C358420E3k extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C358410E3j LL;
    public final /* synthetic */ C370820EgK LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C358420E3k(C358410E3j c358410E3j, C370820EgK c370820EgK) {
        super(0);
        this.LL = c358410E3j;
        this.LLILLJJLI = c370820EgK;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ArrayList arrayList = new ArrayList();
        for (InterfaceC358430E3l interfaceC358430E3l : (ArrayList) this.LL.LIZJ) {
            if (interfaceC358430E3l.LIZLLL()) {
                arrayList.add(interfaceC358430E3l);
            }
        }
        ((ArrayList) this.LL.LIZJ).removeAll(arrayList);
        return Unit.LIZ;
    }
}
