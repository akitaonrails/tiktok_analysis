package X;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0zQG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1895380zQG extends C09AY implements Function1<C1895120zPq, Unit> {
    public C1895380zQG() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1895120zPq c1895120zPq) {
        C1895550zQX.LL.getClass();
        C1895550zQX.LLILLL = false;
        Iterator<? extends InterfaceC1895240zQ2> it2 = C1895550zQX.LLILZ.iterator();
        while (it2.hasNext()) {
            it2.next().clear();
        }
        return Unit.LIZ;
    }
}
