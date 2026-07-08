package X;

import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0rMD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1585350rMD extends C09AY implements Function0<C1585370rMF> {
    public final /* synthetic */ C1585230rM1 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1585350rMD(C1585230rM1 c1585230rM1) {
        super(0);
        this.LL = c1585230rM1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C1585370rMF invoke() {
        C1585230rM1 c1585230rM1 = this.LL;
        C1585370rMF c1585370rMF = new C1585370rMF();
        Iterator it2 = ((Set) c1585370rMF.LJ.getValue()).iterator();
        while (it2.hasNext()) {
            ((AbstractC1585310rM9) it2.next()).LIZ = c1585230rM1;
        }
        ((C1585380rMG) c1585370rMF.LIZLLL.getValue()).LIZ = c1585230rM1;
        return c1585370rMF;
    }
}
