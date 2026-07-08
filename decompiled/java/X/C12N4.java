package X;

import kotlin.jvm.internal.AwS115S0110000_29;
import kotlin.jvm.internal.AwS395S0200000_29;

/* JADX INFO: renamed from: X.12N4, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12N4 extends AbstractC19318610i0<C20694015yM> implements InterfaceC19318910i3 {
    public final C20694015yM LLILZ;

    @Override // X.AbstractC19318610i0
    public final AbstractC19293010ds LIZLLL() {
        C20694015yM c20694015yM = this.LLILZ;
        if (c20694015yM != null) {
            return c20694015yM;
        }
        throw new RuntimeException("pls pass item or extends the EventUnit");
    }

    public C12N4(C20694015yM c20694015yM) {
        this.LLILZ = c20694015yM;
    }

    @Override // X.AbstractC19318610i0
    public final void LJFF(boolean z) {
        LJI(new AwS115S0110000_29(this, z, 8));
    }

    @Override // X.InterfaceC19318910i3
    public final void LIZ(Boolean bool, Boolean bool2) {
        LJI(new AwS395S0200000_29(bool, bool2, 105));
    }
}
