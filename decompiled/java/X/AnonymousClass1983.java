package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.AFwS278S0000000_32;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS611S0100000_32;

/* JADX INFO: renamed from: X.1983, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class AnonymousClass1983 implements InterfaceC214889197v {
    public static final /* synthetic */ int LIZIZ = 0;
    public final C1DRG LIZ;

    public AnonymousClass1983(C1DRG c1drg) {
        this.LIZ = c1drg;
    }

    @Override // X.InterfaceC214889197v
    public final InterfaceC194555119t LIZ(Effect effect) {
        return LIZIZ(effect, null, null);
    }

    @Override // X.InterfaceC214889197v
    public final InterfaceC194555119t LIZIZ(Effect effect, C1628630sU1 c1628630sU1, C1628640sU2 c1628640sU2) {
        if (C1624570sNT.LJJ(effect)) {
            return new AnonymousClass1984(effect, this.LIZ, new AwS576S0100000_32(c1628640sU2, 358));
        }
        if (C1624570sNT.LJIILL(effect)) {
            if (C1624200sMs.LJIIIIZZ(effect)) {
                return new C1637820siq(effect, this.LIZ, 0, AFwS223S0000000_32.get$arr$(116), new AwS611S0100000_32(c1628640sU2, 184));
            }
            return new C1637820siq(effect, this.LIZ, 0, new AwS576S0100000_32(c1628640sU2, 359), AFwS278S0000000_32.get$arr$(100));
        }
        return new AnonymousClass1980(c1628640sU2);
    }
}
