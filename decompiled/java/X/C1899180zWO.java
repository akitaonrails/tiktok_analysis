package X;

import com.bytedance.incentive.taskevent.interactive.InteractiveServiceImpl;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0zWO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1899180zWO extends C09AY implements Function0<Unit> {
    public final /* synthetic */ InteractiveServiceImpl LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1899180zWO(InteractiveServiceImpl interactiveServiceImpl) {
        super(0);
        this.LL = interactiveServiceImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Iterator it2 = ((ArrayList) this.LL.LIZIZ).iterator();
        while (it2.hasNext()) {
            ((AbstractC1899090zWF) it2.next()).LJI();
        }
        Iterator it3 = ((ArrayList) this.LL.LIZJ).iterator();
        while (it3.hasNext()) {
            ((AbstractC1899090zWF) it3.next()).LJI();
        }
        Iterator it4 = ((ArrayList) this.LL.LIZLLL).iterator();
        while (it4.hasNext()) {
            ((AbstractC1899090zWF) it4.next()).LJI();
        }
        Iterator it5 = ((ArrayList) this.LL.LJ).iterator();
        while (it5.hasNext()) {
            ((AbstractC1899090zWF) it5.next()).LJI();
        }
        ((ArrayList) this.LL.LIZLLL).clear();
        ((ArrayList) this.LL.LIZIZ).clear();
        ((ArrayList) this.LL.LIZJ).clear();
        ((ArrayList) this.LL.LJ).clear();
        return Unit.LIZ;
    }
}
