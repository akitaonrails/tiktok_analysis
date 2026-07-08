package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Scm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C725340Scm extends C09AY implements Function1<C724170Sat, Unit> {
    public C725340Scm() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C724170Sat c724170Sat) {
        AbstractC738140SxQ abstractC738140SxQ;
        C724170Sat c724170Sat2 = c724170Sat;
        Object obj = c724170Sat2.LIZJ;
        if ((obj instanceof AbstractC738140SxQ) && (abstractC738140SxQ = (AbstractC738140SxQ) obj) != null && abstractC738140SxQ.isHitTrack()) {
            C08TN.LIZ().LIZIZ(c724170Sat2.LIZ, c724170Sat2.LIZJ.getClass().getSimpleName());
        }
        return Unit.LIZ;
    }
}
