package X;

import kotlin.jvm.internal.AwS106S0110000_19;
import kotlin.jvm.internal.AwS133S1100000_19;
import kotlin.jvm.internal.AwS385S0200000_19;

/* JADX INFO: renamed from: X.0iLC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public class C1238760iLC extends AbstractC19318610i0<C19323610io> implements InterfaceC19318910i3 {
    public final C19323610io LLILZ;

    public C1238760iLC() {
        this(null);
    }

    @Override // X.AbstractC19318610i0
    /* JADX INFO: renamed from: LJII, reason: merged with bridge method [inline-methods] */
    public C19323610io LIZLLL() {
        C19323610io c19323610io = this.LLILZ;
        if (c19323610io != null) {
            return c19323610io;
        }
        throw new RuntimeException("pls pass item or extends the DisclosureUnit");
    }

    public C1238760iLC(C19323610io c19323610io) {
        this.LLILZ = c19323610io;
    }

    @Override // X.AbstractC19318610i0
    public final void LJFF(boolean z) {
        LJI(new AwS106S0110000_19(this, z, 10));
    }

    public final void LJIIIIZZ(String str) {
        LJI(new AwS133S1100000_19(this, str, 30));
    }

    public final void LJIIIZ(String str) {
        LJI(new AwS133S1100000_19(this, str, 31));
    }

    @Override // X.InterfaceC19318910i3
    public final void LIZ(Boolean bool, Boolean bool2) {
        LJI(new AwS385S0200000_19(bool, bool2, 130));
    }
}
