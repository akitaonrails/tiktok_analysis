package X;

import com.ss.android.ugc.aweme.im.message.template.card.OnboardingCardTemplate;

/* JADX INFO: renamed from: X.0NZR, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NZR {
    public static final C0NZR LIZ = new C0NZR();

    public static C0NZT LIZ(C869590Y9l c869590Y9l) {
        int value;
        C0NZT c0nzt;
        Integer numLJIIJJI;
        OnboardingCardTemplate onboardingCardTemplate = (OnboardingCardTemplate) C0Z2Z.LIZ(c869590Y9l, OnboardingCardTemplate.class);
        String str = c869590Y9l.getLocalExt().get("onboarding_status");
        if (str != null && (numLJIIJJI = C2095008Iq.LJIIJJI(str)) != null) {
            value = numLJIIJJI.intValue();
        } else {
            value = C0NZT.ONBOARDING_CARD_STATUS_UNKNOWN.getValue();
        }
        int value2 = C0NZT.fromValue(value).getValue();
        if (onboardingCardTemplate == null || (c0nzt = onboardingCardTemplate.onboardingCardStatus) == null) {
            c0nzt = C0NZT.ONBOARDING_CARD_STATUS_UNKNOWN;
        }
        return C0NZT.fromValue(Math.max(value2, c0nzt.getValue()));
    }

    public static void LIZJ(C869590Y9l c869590Y9l, C0NZT c0nzt) {
        int value;
        Integer numLJIIJJI;
        if (c869590Y9l == null) {
            return;
        }
        String str = c869590Y9l.getLocalExt().get("onboarding_status");
        if (str != null && (numLJIIJJI = C2095008Iq.LJIIJJI(str)) != null) {
            value = numLJIIJJI.intValue();
        } else {
            value = C0NZT.ONBOARDING_CARD_STATUS_UNKNOWN.getValue();
        }
        if (c0nzt.getValue() > C0NZT.fromValue(value).getValue()) {
            String strValueOf = String.valueOf(c0nzt.getValue());
            c869590Y9l.getLocalExt().put("onboarding_status", strValueOf);
            C603540Nlo.LIZ(C0YNY.LIZ(InterfaceC874680YTa.LIZ).LIZIZ(), c869590Y9l, "onboarding_status", new C0Y3R(strValueOf), new C0Y3I("onboarding card status update"));
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0NZP(c869590Y9l, c0nzt, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.C869590Y9l r13, X.C0NZT r14, X.InterfaceC1364105Vn<? super java.lang.Boolean> r15) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0NZR.LIZIZ(X.0Y9l, X.0NZT, X.05Vn):java.lang.Object");
    }
}
