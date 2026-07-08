package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.14MT, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14MT extends C09AY implements Function0<Boolean> {
    public C14MT() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        boolean z = true;
        if (!C2213981Bky.LIZIZ.LIZLLL() && C0C64.LJIILLIIL().LJIJ(31744, 0, "fix_vshot_provider_leak", true) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
