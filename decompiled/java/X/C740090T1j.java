package X;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0T1j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C740090T1j extends C09AY implements Function0<Unit> {
    public C740090T1j() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ArrayList arrayList = (ArrayList) C1898110zUf.LLILZ;
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((InterfaceC1898130zUh) it2.next()).LIZ();
            }
        }
        return Unit.LIZ;
    }
}
