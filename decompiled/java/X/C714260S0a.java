package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0S0a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C714260S0a extends C09AY implements Function1<C711340RvI, Boolean> {
    public C714260S0a() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(C711340RvI c711340RvI) {
        boolean z;
        if (c711340RvI.LIZ.getAwemeType() == 106) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
