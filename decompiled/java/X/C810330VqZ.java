package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0VqZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C810330VqZ extends C09AY implements Function0<Unit> {
    public C810330VqZ() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (C19212010Ec.LIZJ.LJJLL()) {
            int iMin = Math.min(C1903780zdo.LJIIIIZZ(), 99);
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("syncInboxBadge: ");
            sbLIZ.append(iMin);
            C1720106oR.LJI("SyncInbox2AppBadge", C2188811AlT.LIZIZ(sbLIZ));
            if (iMin > 0) {
                C0VFK c0vfkLIZJ = C0VFK.LIZJ();
                C844470XAv.LIZ.getClass();
                c0vfkLIZJ.LIZ(iMin, C844470XAv.LIZ());
            } else {
                C0VFK c0vfkLIZJ2 = C0VFK.LIZJ();
                C844470XAv.LIZ.getClass();
                c0vfkLIZJ2.LIZ(0, C844470XAv.LIZ());
            }
        }
        return Unit.LIZ;
    }
}
