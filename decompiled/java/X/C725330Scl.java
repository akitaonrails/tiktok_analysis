package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Scl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C725330Scl extends C09AY implements Function1<C724160Sas, Unit> {
    public C725330Scl() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C724160Sas c724160Sas) {
        AbstractC738140SxQ abstractC738140SxQ;
        C724160Sas c724160Sas2 = c724160Sas;
        Object obj = c724160Sas2.LIZJ;
        if ((obj instanceof AbstractC738140SxQ) && (abstractC738140SxQ = (AbstractC738140SxQ) obj) != null && abstractC738140SxQ.isHitTrack()) {
            C08TN.LIZ().LIZIZ(c724160Sas2.LIZ, c724160Sas2.LIZJ.getClass().getSimpleName());
        }
        return Unit.LIZ;
    }
}
