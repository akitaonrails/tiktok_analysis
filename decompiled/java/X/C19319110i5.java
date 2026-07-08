package X;

import kotlin.jvm.internal.AwS114S0110000_28;
import kotlin.jvm.internal.AwS394S0200000_28;

/* JADX INFO: renamed from: X.10i5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public class C19319110i5 extends AbstractC19318610i0<C19319010i4> implements InterfaceC19318910i3 {
    public final C19319010i4 LLILZ;

    public C19319110i5() {
        this(null);
    }

    @Override // X.AbstractC19318610i0
    /* JADX INFO: renamed from: LJII, reason: merged with bridge method [inline-methods] */
    public C19319010i4 LIZLLL() {
        C19319010i4 c19319010i4 = this.LLILZ;
        if (c19319010i4 != null) {
            return c19319010i4;
        }
        throw new RuntimeException("pls pass item or extends the DividerUnit");
    }

    public C19319110i5(C19319010i4 c19319010i4) {
        this.LLILZ = c19319010i4;
    }

    @Override // X.AbstractC19318610i0
    public final void LJFF(boolean z) {
        LJI(new AwS114S0110000_28(this, z, 7));
    }

    @Override // X.InterfaceC19318910i3
    public final void LIZ(Boolean bool, Boolean bool2) {
        LJI(new AwS394S0200000_28(bool, bool2, 86));
    }
}
