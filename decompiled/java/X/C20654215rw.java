package X;

import com.ss.android.ugc.aweme.frequency.model.RuleHitState;
import java.util.concurrent.ConcurrentLinkedDeque;
import kotlin.Pair;
import kotlin.jvm.internal.AwS275S0300000_31;
import kotlin.jvm.internal.AwS432S0200000_31;

/* JADX INFO: renamed from: X.15rw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20654215rw implements InterfaceC20673715v5<C20654015ru> {
    public final InterfaceC20654115rv LIZ;

    public C20654215rw(InterfaceC20654115rv interfaceC20654115rv) {
        this.LIZ = interfaceC20654115rv;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC20673715v5
    public final void LIZ(C20673615v4 c20673615v4) {
        C20654015ru c20654015ru = (C20654015ru) c20673615v4.LIZIZ;
        InterfaceC20654515rz interfaceC20654515rz = c20654015ru.LJ;
        if (interfaceC20654515rz != null) {
            new AwS432S0200000_31(c20654015ru, this, 133);
            interfaceC20654515rz.d();
        }
        Pair<Boolean, RuleHitState> pairLIZIZ = this.LIZ.LIZIZ(c20654015ru);
        RuleHitState second = pairLIZIZ.getSecond();
        if (second != null) {
            ((ConcurrentLinkedDeque) c20654015ru.LJI).push(second);
        }
        InterfaceC20654515rz interfaceC20654515rz2 = c20654015ru.LJ;
        if (interfaceC20654515rz2 != null) {
            new AwS275S0300000_31(c20654015ru, this, second, 43);
            interfaceC20654515rz2.d();
        }
        if (pairLIZIZ.getFirst().booleanValue()) {
            c20673615v4.LIZ();
        }
    }
}
