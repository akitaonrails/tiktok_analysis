package X;

import kotlin.jvm.internal.AwS397S0200000_31;
import kotlin.jvm.internal.AwS43S0010000_31;

/* JADX INFO: renamed from: X.15tF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20662315tF extends AbstractC19318610i0<C20693315yF> implements InterfaceC19318910i3 {
    public final C20693315yF LLILZ;

    public C20662315tF() {
        this(null);
    }

    @Override // X.AbstractC19318610i0
    public final AbstractC19293010ds LIZLLL() {
        C20693315yF c20693315yF = this.LLILZ;
        if (c20693315yF != null) {
            return c20693315yF;
        }
        throw new RuntimeException("pls pass item or extends the LabelUnit");
    }

    public C20662315tF(C20693315yF c20693315yF) {
        this.LLILZ = c20693315yF;
    }

    @Override // X.AbstractC19318610i0
    public final void LJFF(boolean z) {
        LJI(new AwS43S0010000_31(18));
    }

    @Override // X.InterfaceC19318910i3
    public final void LIZ(Boolean bool, Boolean bool2) {
        LJI(new AwS397S0200000_31(bool, bool2, 111));
    }
}
