package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0RzT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C713930RzT extends C09AY implements Function1<C711340RvI, Boolean> {
    public C713930RzT() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(C711340RvI c711340RvI) {
        boolean z;
        Integer num;
        C711340RvI c711340RvI2 = c711340RvI;
        if (c711340RvI2.LIZ.getAwemeType() == 101 && ((num = c711340RvI2.LJI) == null ? !C1ER1.LIZIZ.LJJJLL(c711340RvI2.LIZJ) : num.intValue() == 0)) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
