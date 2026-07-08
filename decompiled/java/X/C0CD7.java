package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0CD7, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CD7 extends C09AY implements Function0<Boolean> {
    public C0CD7() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        boolean z = false;
        if (C0CD2.LJFF().getBoolean("optimize_asyncnetworkinit_v2", false) && C2456309jt.LIZJ()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
