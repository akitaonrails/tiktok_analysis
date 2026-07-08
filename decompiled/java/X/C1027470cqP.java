package X;

import android.text.TextUtils;

/* JADX INFO: renamed from: X.0cqP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1027470cqP extends AbstractC1027370cqF {
    @Override // X.InterfaceC1027390cqH
    public final boolean LIZIZ() {
        return C988700bps.LIZ.LIZIZ().openMiniApp(LIZLLL(), LJI(), new C1611490s2N());
    }

    @Override // X.InterfaceC1027390cqH
    public final boolean LIZ() {
        if (TextUtils.isEmpty(LJI())) {
            return false;
        }
        return C1030670cvZ.LIZ(LJI());
    }

    public final String LJI() {
        return !TextUtils.isEmpty(LJ().LIZLLL.LIZ) ? LJ().LIZLLL.LIZ : LJ().LIZJ.LIZ;
    }
}
