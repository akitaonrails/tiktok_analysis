package X;

import com.bytedance.incentive.taskevent.watchvideo.MultiDomainService;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0zWM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1899160zWM extends C09AY implements Function0<Unit> {
    public final /* synthetic */ MultiDomainService LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1899160zWM(MultiDomainService multiDomainService) {
        super(0);
        this.LL = multiDomainService;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C01U6.LIZIZ(new C1899250zWV());
        C1898970zW3.LIZ.clear();
        Iterator it2 = ((ArrayList) this.LL.LIZ).iterator();
        while (it2.hasNext()) {
            it2.next().getClass();
        }
        ((ArrayList) this.LL.LIZ).clear();
        return Unit.LIZ;
    }
}
