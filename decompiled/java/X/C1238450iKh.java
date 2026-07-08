package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity;
import com.ss.android.ugc.aweme.account.verify.EmailConsentPageFragment;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iKh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1238450iKh {
    public static void LIZ(final CommonFlowActivity commonFlowActivity, final String str, final Function1 function1) {
        C853700XeK.LIZ.getClass();
        if (!C853700XeK.LIZ() && str != null && str.length() != 0 && C852950Xd7.LIZIZ.contains(str)) {
            final EmailConsentPageFragment emailConsentPageFragment = new EmailConsentPageFragment();
            emailConsentPageFragment.LLJLIL = new InterfaceC1238480iKk() { // from class: X.0iKp
                public final /* synthetic */ String LIZ = "manage_account_page";

                @Override // X.InterfaceC1238480iKk
                public final void LJIJ() {
                }

                @Override // X.InterfaceC1238480iKk
                public final void LJJJJ() throws Throwable {
                    int iIntValue;
                    ComplianceServiceProvider.LJIJ().LIZIZ(EnumC1238710iL7.GRANTED);
                    C1238470iKj.LIZ(this.LIZ, "get_updates");
                    if (Intrinsics.LJFF(str, "settings_page_bind_email")) {
                        C707370Rot.LIZ.LIZIZ("email_consent_status").postValue(new C745430TLx(true));
                    } else {
                        Intent intent = new Intent();
                        intent.putExtra("bind_email_result", 1);
                        Activity activity = commonFlowActivity;
                        if (activity != null) {
                            C0WZX c0wzx = new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOurYJDb0ibECfF1owsk1PEpk5Z4NKqzreHIumIMPIE1+BChO7DG", null);
                            C0WST c0wst = new C0WST();
                            Object[] objArr = {2, intent};
                            C0WZW c0wzw = new C0WZW(false, "(ILandroid/content/Intent;)V", c0wzx);
                            C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11071, "com/ss/android/ugc/aweme/account/login/v2/base/CommonFlowActivity", "setResult", activity, objArr, "void", c0wzw);
                            if (c0wsuLIZIZ.LIZ) {
                                c0wst.LIZ(11071, "com/ss/android/ugc/aweme/account/login/v2/base/CommonFlowActivity", "setResult", null, objArr, activity, c0wzw, false);
                            } else {
                                Object[] objArr2 = c0wsuLIZIZ.LIZJ;
                                if (objArr2 != null) {
                                    Object obj = objArr2[0];
                                    if (obj != null) {
                                        activity = (Activity) obj;
                                    }
                                    Object obj2 = objArr2[1];
                                    iIntValue = obj2 != null ? ((Integer) obj2).intValue() : 2;
                                    Object obj3 = c0wsuLIZIZ.LIZJ[2];
                                    if (obj3 != null) {
                                        intent = (Intent) obj3;
                                    }
                                } else {
                                    iIntValue = 2;
                                }
                                activity.setResult(iIntValue, intent);
                                c0wst.LIZ(11071, "com/ss/android/ugc/aweme/account/login/v2/base/CommonFlowActivity", "setResult", null, objArr, activity, c0wzw, true);
                            }
                        }
                    }
                    commonFlowActivity.finish();
                }

                @Override // X.InterfaceC1238480iKk
                public final void onCancel() {
                    ComplianceServiceProvider.LJIJ().LIZIZ(EnumC1238710iL7.REJECTED);
                    C1238470iKj.LIZ(this.LIZ, "no_thanks");
                    commonFlowActivity.finish();
                }
            };
            Bundle bundle = new Bundle();
            C786410Ut5.LJJJI("enter_from", "manage_account_page", bundle);
            emailConsentPageFragment.setArguments(bundle);
            ComplianceServiceProvider.LJIJ().LIZJ("manage_account_page", new InterfaceC251700yB() { // from class: X.0iKi
                @Override // X.InterfaceC251700yB
                public final void LIZJ() {
                    commonFlowActivity.finish();
                }

                @Override // X.InterfaceC251700yB
                public final void LIZ(boolean z) {
                    function1.invoke(Boolean.valueOf(z));
                }

                @Override // X.InterfaceC251700yB
                public final void LIZIZ(boolean z) {
                    if (z) {
                        EmailConsentPageFragment emailConsentPageFragment2 = emailConsentPageFragment;
                        C19EH c19ehLJIIJ = commonFlowActivity.getSupportFragmentManager().LJIIJ();
                        c19ehLJIIJ.LJIJ(R.id.iiv, emailConsentPageFragment2, null);
                        c19ehLJIIJ.LJII(null);
                        c19ehLJIIJ.LJIIIZ();
                        return;
                    }
                    commonFlowActivity.finish();
                }
            });
            return;
        }
        function1.invoke(Boolean.FALSE);
    }
}
