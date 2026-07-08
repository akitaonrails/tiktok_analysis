package X;

import g3a.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS59S1000000_8;

/* JADX INFO: renamed from: X.0L5v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C537410L5v extends a implements InterfaceC1408530ml1 {
    public final Function0<Unit> LLIZLLLIL;

    @Override // X.InterfaceC1408530ml1
    public final /* synthetic */ boolean LIZ() {
        return false;
    }

    @Override // X.InterfaceC1408530ml1
    public final /* synthetic */ boolean LIZIZ() {
        return false;
    }

    @Override // g3a.a, X.AbstractRunnableC21377818lM, java.lang.Runnable, X.InterfaceC1408530ml1
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("DefaultFlexibleTask@6e61.run");
        try {
            this.LLIZLLLIL.invoke();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DefaultFlexibleTask@6e61.run");
    }

    @Override // X.InterfaceC1408530ml1
    public final EnumC194317110p LIZJ() {
        return EnumC194317110p.P1;
    }

    public C537410L5v(String str, Function0<Unit> function0) {
        this.LLIZLLLIL = function0;
        LJ(new AwS59S1000000_8(str, 12));
    }
}
