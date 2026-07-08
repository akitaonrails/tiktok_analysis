package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0SK9, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SK9 extends C09AY implements Function0<Boolean> {
    public C0SK9() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(((C0SK2.LIZJ() & 2) == 0 || (C0SK2.LIZJ() & 4) == 0) ? false : true);
    }
}
