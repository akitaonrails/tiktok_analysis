package X;

import kotlin.jvm.internal.AwS117S0110000_31;
import kotlin.jvm.internal.AwS397S0200000_31;

/* JADX INFO: renamed from: X.15yE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20693215yE extends AbstractC19318610i0<C20693115yD> implements InterfaceC19318910i3 {
    public final C20693115yD LLILZ;

    @Override // X.AbstractC19318610i0
    public final AbstractC19293010ds LIZLLL() {
        C20693115yD c20693115yD = this.LLILZ;
        if (c20693115yD != null) {
            return c20693115yD;
        }
        throw new RuntimeException("pls pass item or extends the FeedbackUnit");
    }

    public C20693215yE(C20693115yD c20693115yD) {
        this.LLILZ = c20693115yD;
    }

    @Override // X.AbstractC19318610i0
    public final void LJFF(boolean z) {
        LJI(new AwS117S0110000_31(this, 9));
    }

    @Override // X.InterfaceC19318910i3
    public final void LIZ(Boolean bool, Boolean bool2) {
        LJI(new AwS397S0200000_31(bool, bool2, 132));
    }
}
