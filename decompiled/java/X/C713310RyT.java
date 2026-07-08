package X;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RyT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C713310RyT extends C09AY implements Function1<C711340RvI, Boolean> {
    public C713310RyT() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(C711340RvI c711340RvI) {
        boolean z;
        C711340RvI c711340RvI2 = c711340RvI;
        if (C582980Mtk.LIZIZ(c711340RvI2.LIZ) && (!C292410Bd9.LIZ || !Intrinsics.LJFF(c711340RvI2.LIZJ, "create_playlist"))) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
