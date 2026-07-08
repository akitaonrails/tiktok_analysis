package X;

import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaComponent;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RVZ, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RVZ extends C09AY implements Function0<InterfaceC696870RVd<InteractAreaComponent>> {
    public final /* synthetic */ InteractAreaComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RVZ(InteractAreaComponent interactAreaComponent) {
        super(0);
        this.LL = interactAreaComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC696870RVd<InteractAreaComponent> invoke() {
        C696840RVa c696840RVa = new C696840RVa(new ArrayList());
        InteractAreaComponent interactAreaComponent = this.LL;
        c696840RVa.LIZIZ.invoke(new C696900RVg(interactAreaComponent, new C696960RVm(), new C696940RVk(interactAreaComponent)));
        c696840RVa.LIZIZ.invoke(new C696880RVe(interactAreaComponent));
        return c696840RVa;
    }
}
