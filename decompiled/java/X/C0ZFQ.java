package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZFQ, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZFQ implements C0ZFO {
    public final C869590Y9l LIZ;

    public final C0ZFR LIZIZ() {
        String localExtValue = this.LIZ.getLocalExtValue("interaction_state_key");
        C0ZFR c0zfr = C0ZFR.NOT_INTERACT;
        if (!Intrinsics.LJFF(localExtValue, c0zfr.getValue())) {
            C0ZFR c0zfr2 = C0ZFR.READY_TO_INTERACT;
            if (!Intrinsics.LJFF(localExtValue, c0zfr2.getValue())) {
                c0zfr2 = C0ZFR.INTERACTED;
                if (!Intrinsics.LJFF(localExtValue, c0zfr2.getValue())) {
                    c0zfr2 = C0ZFR.NOT_AVAILABLE;
                    if (Intrinsics.LJFF(localExtValue, c0zfr2.getValue())) {
                    }
                }
            }
            return c0zfr2;
        }
        return c0zfr;
    }

    @Override // X.C0ZFO
    public final boolean LIZ() {
        return (LIZIZ() == C0ZFR.INTERACTED || LIZIZ() == C0ZFR.NOT_AVAILABLE) ? false : true;
    }

    public final boolean LIZJ() {
        return LIZIZ() == C0ZFR.READY_TO_INTERACT;
    }

    public final void LJ() {
        if (LIZIZ() != C0ZFR.READY_TO_INTERACT) {
            return;
        }
        LIZLLL(C0ZFR.INTERACTED.getValue(), "light interaction. update interaction_state_key = interacted");
    }

    public final void LJFF() {
        if (LIZIZ() != C0ZFR.NOT_INTERACT) {
            return;
        }
        this.LIZ.addLocalExt("interaction_state_key", C0ZFR.READY_TO_INTERACT.getValue());
    }

    public final void LJI() {
        C0ZFR c0zfrLIZIZ = LIZIZ();
        C0ZFR c0zfr = C0ZFR.NOT_AVAILABLE;
        if (c0zfrLIZIZ == c0zfr || LIZIZ() == C0ZFR.INTERACTED) {
            return;
        }
        LIZLLL(c0zfr.getValue(), "light interaction. update interaction_state_key = not_available");
    }

    public C0ZFQ(C869590Y9l c869590Y9l) {
        this.LIZ = c869590Y9l;
    }

    public final void LIZLLL(String str, String str2) {
        this.LIZ.addLocalExt("interaction_state_key", str);
        C603540Nlo.LIZ(C0YNY.LIZ(InterfaceC874680YTa.LIZ).LIZIZ(), this.LIZ, "interaction_state_key", new C0Y3R(str), new C0Y3I(str2));
    }
}
