package X;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import androidx.biometric.BiometricPrompt;
import androidx.fragment.app.Fragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS606S0100000_27;

/* JADX INFO: renamed from: X.0xtI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1836500xtI {
    public static final C1836500xtI LIZ = new C1836500xtI();

    public static EnumC1801900wzU LIZ(Context context) {
        C21642419mw c21642419mw = new C21642419mw(new C1836550xtN(context));
        if (Build.VERSION.SDK_INT >= 30) {
            int iLIZ = c21642419mw.LIZ(15);
            if (iLIZ != -2) {
                if (iLIZ != 0) {
                    if (iLIZ != 1) {
                        if (iLIZ != 11) {
                            if (iLIZ != 12) {
                                return EnumC1801900wzU.UNAVAILABLE;
                            }
                            return EnumC1801900wzU.UNAVAILABLE;
                        }
                        return EnumC1801900wzU.UNSET;
                    }
                    return EnumC1801900wzU.UNAVAILABLE;
                }
                return EnumC1801900wzU.AVAILABLE;
            }
            return EnumC1801900wzU.UNAVAILABLE;
        }
        return EnumC1801900wzU.UNAVAILABLE;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [X.0xIE, X.19n6] */
    public static void LIZIZ(Context context, String str, String str2, final Function1 function1) {
        BiometricPrompt biometricPrompt;
        final C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("business", "activity_center");
        c2344009Gk.LJIIIIZZ("page_tag", str2);
        c2344009Gk.LJIIIIZZ("biometric_type", "fingerprint");
        C20684815ws.LJIILLIIL("start_biometric_auth", c2344009Gk.LIZ);
        final AwS606S0100000_27 awS606S0100000_27 = new AwS606S0100000_27(c2344009Gk, 613);
        ?? r4 = new AbstractC21643419n6() { // from class: X.0xIE
            @Override // X.AbstractC21643419n6
            public final void LIZIZ() {
                Function1<EnumC1791270wiL, Unit> function12 = awS606S0100000_27;
                EnumC1791270wiL enumC1791270wiL = EnumC1791270wiL.FAILED;
                function12.invoke(enumC1791270wiL);
                function1.invoke(enumC1791270wiL);
            }

            @Override // X.AbstractC21643419n6
            public final void LIZJ(C20223714Bf c20223714Bf) {
                C20684815ws.LJIILLIIL("biometric_auth_success", c2344009Gk.LIZ);
                function1.invoke(EnumC1791270wiL.SUCCEED);
            }

            @Override // X.AbstractC21643419n6
            public final void LIZ(int i, CharSequence charSequence) {
                Function1<EnumC1791270wiL, Unit> function12 = awS606S0100000_27;
                EnumC1791270wiL enumC1791270wiL = EnumC1791270wiL.CANCELED;
                function12.invoke(enumC1791270wiL);
                function1.invoke(enumC1791270wiL);
            }
        };
        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        if (c19egLIZIZ == null) {
            if (abstractC1387200mCcLIZIZ != null) {
                Activity activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ();
                if (activityLIZIZ != null) {
                    c19egLIZIZ = C1388190mED.LIZIZ(activityLIZIZ);
                    if (c19egLIZIZ == null) {
                        if (abstractC1387200mCcLIZIZ == null) {
                            return;
                        }
                    }
                    biometricPrompt = new BiometricPrompt(c19egLIZIZ, C838410Wul.LIZJ(context), (C1813520xIE) r4);
                }
                Fragment fragmentLIZLLL = abstractC1387200mCcLIZIZ.LIZLLL();
                if (fragmentLIZLLL != null) {
                    biometricPrompt = new BiometricPrompt(fragmentLIZLLL, C838410Wul.LIZJ(context), (AbstractC21643419n6) r4);
                } else {
                    return;
                }
            } else {
                return;
            }
        } else {
            biometricPrompt = new BiometricPrompt(c19egLIZIZ, C838410Wul.LIZJ(context), (C1813520xIE) r4);
        }
        C1836520xtK c1836520xtK = new C1836520xtK();
        c1836520xtK.LIZ = context.getString(2131834574);
        c1836520xtK.LIZLLL = 33023;
        biometricPrompt.LIZ(c1836520xtK.LIZ(), null);
    }
}
