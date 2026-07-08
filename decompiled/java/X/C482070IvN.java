package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0IvN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C482070IvN extends C09AY implements Function2<C03H5, Boolean, Unit> {
    public final /* synthetic */ C16FS LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C482070IvN(C16FS c16fs) {
        super(2);
        this.LL = c16fs;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(C03H5 c03h5, Boolean bool) {
        if (bool.booleanValue()) {
            C16FS c16fs = this.LL;
            if (c16fs != null) {
                c16fs.LJ();
            }
        } else {
            C16FS c16fs2 = this.LL;
            if (c16fs2 != null) {
                c16fs2.LJIIL();
            }
        }
        return Unit.LIZ;
    }
}
