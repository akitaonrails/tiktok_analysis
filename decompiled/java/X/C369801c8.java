package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.01c8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C369801c8 {
    public final long LIZ;
    public AnonymousClass0956 LIZIZ;

    public C369801c8(long j) {
        this.LIZ = j;
    }

    public final void LIZ(Function0<Unit> function0) {
        AnonymousClass0956 anonymousClass0956 = this.LIZIZ;
        if (anonymousClass0956 != null && anonymousClass0956.isActive()) {
            System.out.println((Object) "Timer is already running.");
        } else {
            this.LIZIZ = C23250099c.LIZLLL(C2296808zG.LIZIZ(), null, null, new C342501Up(this, function0, null), 3);
        }
    }
}
