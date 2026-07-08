package X;

import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.account.TTAccountInit;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.plugin.IPluginService;
import com.ss.android.ugc.aweme.user.UserStore;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: X.0XbA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C851740XbA {
    public final EnumC851330XaV LIZ;
    public EnumC851810XbH LIZIZ = EnumC851810XbH.NOT_START;
    public final List<AbstractC851770XbD> LIZJ = new ArrayList();
    public InterfaceC851820XbI LIZLLL;

    public final List<AbstractC851770XbD> LIZ() {
        final EnumC851330XaV enumC851330XaV = this.LIZ;
        return C1697810uHb.LJIIJJI(new AbstractC851770XbD(enumC851330XaV) { // from class: X.0XaQ
            public final EnumC851330XaV LIZ;

            public static C0XO2 LIZJ() {
                C848230XPh.LL.getClass();
                C0XO2 c0xo2 = C848230XPh.LLJI;
                if (c0xo2 != null) {
                    return c0xo2;
                }
                TTAccountInit.LIZ();
                C0XO0 c0xo0LIZLLL = C0XO0.LIZLLL(C848000XOk.LIZ());
                if (c0xo0LIZLLL != null) {
                    return c0xo0LIZLLL.LLLIIIL;
                }
                return null;
            }

            @Override // X.InterfaceC851780XbE
            public final EnumC852910Xd3 LLJJLIIIJLLLLLLLZ() {
                C0XO2 c0xo2LIZJ = LIZJ();
                if (c0xo2LIZJ != null) {
                    TextUtils.isEmpty(c0xo2LIZJ.LJIIIZ);
                }
                boolean z = (c0xo2LIZJ == null || TextUtils.isEmpty(c0xo2LIZJ.LJIIJ)) ? false : true;
                int i = C851320XaU.LIZ[this.LIZ.ordinal()];
                if (i == 1) {
                    return EnumC852910Xd3.INPUT_EMAIL_BIND;
                }
                if (i == 2) {
                    return EnumC852910Xd3.INPUT_PHONE_BIND;
                }
                if (i == 3) {
                    return !z ? EnumC852910Xd3.INPUT_EMAIL_BIND : EnumC852910Xd3.INPUT_PHONE_BIND;
                }
                throw new C1954807lC();
            }

            {
                this.LIZ = enumC851330XaV;
            }

            @Override // X.InterfaceC851780XbE
            public final boolean LIZ(Bundle bundle) {
                C0XO2 c0xo2LIZJ;
                C0XO9 c0xo9;
                SettingsManager.LIZLLL().getClass();
                if (SettingsManager.LIZ("optional_signup_secondary_pii", false) || (c0xo2LIZJ = LIZJ()) == null || (c0xo9 = c0xo2LIZJ.LJIIZILJ) == null || !c0xo9.LIZ) {
                    return false;
                }
                boolean z = !TextUtils.isEmpty(c0xo2LIZJ.LJIIIZ);
                boolean z2 = !TextUtils.isEmpty(c0xo2LIZJ.LJIIJ);
                int i = C851320XaU.LIZ[this.LIZ.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            if (z && z2) {
                                return false;
                            }
                        } else {
                            throw new C1954807lC();
                        }
                    } else if (z) {
                        return false;
                    }
                } else if (z2) {
                    return false;
                }
                return true;
            }

            /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
            /* JADX WARN: Removed duplicated region for block: B:30:0x00a0  */
            /* JADX WARN: Removed duplicated region for block: B:31:0x00a3  */
            @Override // X.InterfaceC851780XbE
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZIZ(android.os.Bundle r9) {
                /*
                    r8 = this;
                    X.0XO2 r2 = LIZJ()
                    r5 = 0
                    r3 = 1
                    if (r2 == 0) goto Lb2
                    java.lang.String r0 = r2.LJIIIZ
                    boolean r0 = android.text.TextUtils.isEmpty(r0)
                    if (r0 != 0) goto Lb2
                    r4 = 1
                L11:
                    java.lang.String r0 = r2.LJIIJ
                    boolean r0 = android.text.TextUtils.isEmpty(r0)
                    if (r0 != 0) goto L1a
                    r5 = 1
                L1a:
                    X.0Xd3 r0 = r8.LLJJLIIIJLLLLLLLZ()
                    int r1 = r0.getValue()
                    java.lang.String r0 = "current_page"
                    r9.putInt(r0, r1)
                    X.0XaV r1 = r8.LIZ
                    X.0XaV r0 = X.EnumC851330XaV.THIRD_PARTY
                    if (r1 != r0) goto La3
                    X.0Xce r0 = X.EnumC852660Xce.BIND_PHONE_OR_EMAIL_3P_SIGN_UP
                L2f:
                    java.lang.String r1 = "current_scene"
                    int r0 = r0.getValue()
                    r9.putInt(r1, r0)
                    java.lang.String r0 = "is_from_optional_signup"
                    r9.putBoolean(r0, r3)
                    java.lang.String r0 = "show_skip"
                    r9.putBoolean(r0, r3)
                    r1 = r5 ^ 1
                    java.lang.String r0 = "use_email"
                    r9.putBoolean(r0, r1)
                    r1 = r4 ^ 1
                    java.lang.String r0 = "use_phone"
                    r9.putBoolean(r0, r1)
                    X.0XaV r0 = r8.LIZ
                    int[] r1 = X.C851320XaU.LIZ
                    int r0 = r0.ordinal()
                    r1 = r1[r0]
                    if (r1 == r3) goto La0
                    r0 = 2
                    if (r1 == r0) goto La0
                    r0 = 3
                    if (r1 != r0) goto Lb7
                    java.lang.String r1 = "new_user_with_3p"
                L67:
                    java.lang.String r0 = "page"
                    X.C786410Ut5.LJJJI(r0, r1, r9)
                    X.0iJg r0 = X.EnumC1237820iJg.DYA_BIND_PHONE_NUMBER_SOURCE_TYPE_SIGN_UP
                    int r1 = r0.getValue()
                    java.lang.String r0 = "phone_number_source"
                    r9.putInt(r0, r1)
                    X.0iJf r0 = X.EnumC1237810iJf.DYA_BIND_EMAIL_SOURCE_TYPE_SIGN_UP
                    int r1 = r0.getValue()
                    java.lang.String r0 = "email_source"
                    r9.putInt(r0, r1)
                    if (r2 == 0) goto L9f
                    X.0XO9 r0 = r2.LJIIZILJ
                    if (r0 == 0) goto L9f
                    java.lang.String r1 = r0.LIZIZ
                    if (r1 == 0) goto L9f
                    java.lang.Class<com.ss.android.ugc.aweme.IForceBindingAccountService> r2 = com.ss.android.ugc.aweme.IForceBindingAccountService.class
                    r3 = 0
                    r6 = 14
                    r7 = 0
                    r4 = r3
                    r5 = r3
                    java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r2, r3, r4, r5, r6, r7)
                    com.ss.android.ugc.aweme.IForceBindingAccountService r0 = (com.ss.android.ugc.aweme.IForceBindingAccountService) r0
                    if (r0 == 0) goto L9f
                    r0.updateFrequencyGroupCacheAfterShow(r1)
                L9f:
                    return
                La0:
                    java.lang.String r1 = "new_user_with_1p"
                    goto L67
                La3:
                    X.0Xd3 r1 = r8.LLJJLIIIJLLLLLLLZ()
                    X.0Xd3 r0 = X.EnumC852910Xd3.INPUT_PHONE_BIND
                    if (r1 != r0) goto Lae
                    X.0Xce r0 = X.EnumC852660Xce.BIND_PHONE
                    goto L2f
                Lae:
                    X.0Xce r0 = X.EnumC852660Xce.BIND_EMAIL
                    goto L2f
                Lb2:
                    r4 = 0
                    if (r2 == 0) goto L1a
                    goto L11
                Lb7:
                    X.07lC r0 = new X.07lC
                    r0.<init>()
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C851280XaQ.LIZIZ(android.os.Bundle):void");
            }
        }, new AbstractC851770XbD(enumC851330XaV) { // from class: X.0Xan
            public final EnumC851330XaV LIZ;

            @Override // X.InterfaceC851780XbE
            public final EnumC852910Xd3 LLJJLIIIJLLLLLLLZ() {
                return this.LIZ == EnumC851330XaV.PHONE ? EnumC852910Xd3.CREATE_PASSWORD_FOR_PHONE : EnumC852910Xd3.CREATE_PASSWORD_FOR_EMAIL;
            }

            {
                this.LIZ = enumC851330XaV;
            }

            @Override // X.InterfaceC851780XbE
            public final boolean LIZ(Bundle bundle) {
                boolean z;
                boolean z2;
                int i = C851340XaW.LIZ[this.LIZ.ordinal()];
                IPluginService.ReinstallCheck deviceCheckResult = null;
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            return false;
                        }
                        throw new C1954807lC();
                    }
                    boolean z3 = bundle.getBoolean("is_from_new_user_journey", false);
                    IPluginService iPluginService = (IPluginService) PluggableExtentionKt.pluggableSpi$default(IPluginService.class, false, false, false, 14, null);
                    if (iPluginService != null) {
                        deviceCheckResult = iPluginService.getDeviceCheckResult();
                    }
                    if (deviceCheckResult == IPluginService.ReinstallCheck.NON_REINSTALL) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    int i2 = bundle.getInt("previous_page", EnumC852910Xd3.NONE.getValue());
                    if (i2 == EnumC852910Xd3.INPUT_EMAIL_SIGN_UP.getValue()) {
                        if (!C19285410ce.LIZ() && !bundle.getBoolean("is_need_verify_email", false)) {
                            return false;
                        }
                        if (z3 && z2 && ((Number) C0A62.LIZ.getValue()).intValue() == 1) {
                            return false;
                        }
                    } else {
                        if (i2 != EnumC852910Xd3.AGE_GATE_POST_EMAIL_SIGNUP.getValue() && i2 != EnumC852910Xd3.EMAIL_SIGNUP.getValue()) {
                            return false;
                        }
                        if (!C19285410ce.LIZ() && !bundle.getBoolean("is_need_verify_email", false)) {
                            return false;
                        }
                    }
                } else {
                    boolean z4 = bundle.getBoolean("is_from_new_user_journey", false);
                    IPluginService iPluginService2 = (IPluginService) PluggableExtentionKt.pluggableSpi$default(IPluginService.class, false, false, false, 14, null);
                    if (iPluginService2 != null) {
                        deviceCheckResult = iPluginService2.getDeviceCheckResult();
                    }
                    if (deviceCheckResult == IPluginService.ReinstallCheck.NON_REINSTALL) {
                        z = true;
                    } else {
                        z = false;
                    }
                    int i3 = bundle.getInt("previous_page", EnumC852910Xd3.NONE.getValue());
                    if (i3 == EnumC852910Xd3.INPUT_PHONE_SIGN_UP.getValue()) {
                        if (z4 && z && ((Number) C0A62.LIZ.getValue()).intValue() == 1) {
                            return false;
                        }
                    } else if (i3 != EnumC852910Xd3.AGE_GATE_POST_PHONE_SIGNUP.getValue() && i3 != EnumC852910Xd3.AGE_GATE_LOGIN.getValue()) {
                        return false;
                    }
                }
                return true;
            }

            @Override // X.InterfaceC851780XbE
            public final void LIZIZ(Bundle bundle) {
                int i = C851340XaW.LIZIZ[LLJJLIIIJLLLLLLLZ().ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        C852810Xct.LIZ.getClass();
                        if (C0XZ2.LIZIZ(C852810Xct.LJ(bundle))) {
                            bundle.putInt("previous_page", EnumC852910Xd3.EMAIL_LINK_LOGIN_OR_SIGNUP.getValue());
                        } else {
                            bundle.putInt("previous_page", EnumC852910Xd3.EMAIL_OTP_SIGNUP.getValue());
                        }
                        bundle.putBoolean("show_skip", true);
                        bundle.putInt("current_page", EnumC852910Xd3.CREATE_PASSWORD_FOR_EMAIL.getValue());
                        return;
                    }
                    return;
                }
                bundle.putBoolean("show_skip", true);
                bundle.putInt("current_page", EnumC852910Xd3.CREATE_PASSWORD_FOR_PHONE.getValue());
            }
        }, new AbstractC851770XbD() { // from class: X.0XaS
            @Override // X.InterfaceC851780XbE
            public final EnumC852910Xd3 LLJJLIIIJLLLLLLLZ() {
                return EnumC852910Xd3.PRIVACY_HIGHLIGHT_FOR_TEENS;
            }

            @Override // X.InterfaceC851780XbE
            public final boolean LIZ(Bundle bundle) {
                C848230XPh c848230XPh = C848230XPh.LL;
                UserStore.AccountUser accountUserLIZ = C848230XPh.LIZ(C848230XPh.LIZLLL());
                if (accountUserLIZ == null || accountUserLIZ.privacyHighlights != 1 || !((AbstractC848400XPy) C0XQ7.LJFF()).isNewUser()) {
                    return false;
                }
                return true;
            }

            @Override // X.InterfaceC851780XbE
            public final void LIZIZ(Bundle bundle) {
                bundle.putInt("next_page", EnumC852910Xd3.PRIVACY_HIGHLIGHT_FOR_TEENS.getValue());
            }
        }, new AbstractC851770XbD() { // from class: X.0XaR
            @Override // X.InterfaceC851780XbE
            public final EnumC852910Xd3 LLJJLIIIJLLLLLLLZ() {
                return EnumC852910Xd3.PRIVATE_ACCOUNT_PROMPT;
            }

            @Override // X.InterfaceC851780XbE
            public final boolean LIZ(Bundle bundle) {
                C848230XPh c848230XPh = C848230XPh.LL;
                UserStore.AccountUser accountUserLIZ = C848230XPh.LIZ(C848230XPh.LIZLLL());
                if (accountUserLIZ == null || accountUserLIZ.privateAccountPrompt <= 0 || !((AbstractC848400XPy) C0XQ7.LJFF()).isNewUser()) {
                    return false;
                }
                return true;
            }

            @Override // X.InterfaceC851780XbE
            public final void LIZIZ(Bundle bundle) {
                int i;
                C848230XPh c848230XPh = C848230XPh.LL;
                UserStore.AccountUser accountUserLIZ = C848230XPh.LIZ(C848230XPh.LIZLLL());
                if (accountUserLIZ != null) {
                    i = accountUserLIZ.privateAccountPrompt;
                } else {
                    i = 0;
                }
                bundle.putInt("next_page", EnumC852910Xd3.PRIVATE_ACCOUNT_PROMPT.getValue());
                bundle.putInt("private_account_prompt", i);
            }
        }, new AbstractC851770XbD() { // from class: X.0XbC
            @Override // X.InterfaceC851780XbE
            public final boolean LIZ(Bundle bundle) {
                return true;
            }

            @Override // X.InterfaceC851780XbE
            public final EnumC852910Xd3 LLJJLIIIJLLLLLLLZ() {
                return EnumC852910Xd3.CREATE_NICKNAME;
            }

            @Override // X.InterfaceC851780XbE
            public final void LIZIZ(Bundle bundle) {
                bundle.putInt("next_page", EnumC852910Xd3.CREATE_NICKNAME.getValue());
            }
        }, new AbstractC851770XbD() { // from class: X.0XbB
            @Override // X.InterfaceC851780XbE
            public final EnumC852910Xd3 LLJJLIIIJLLLLLLLZ() {
                return EnumC852910Xd3.PRIVATE_ACCOUNT_TIPS;
            }

            @Override // X.InterfaceC851780XbE
            public final boolean LIZ(Bundle bundle) {
                if (!C0XQ7.LJFF().getCurUser().notifyPrivatePolicy || !C0XQ7.LJFF().isNewUser() || bundle.getBoolean("is_from_new_user_journey", false) || bundle.getBoolean("is_from_new_user_journey_age_gate", false)) {
                    return false;
                }
                return true;
            }

            @Override // X.InterfaceC851780XbE
            public final void LIZIZ(Bundle bundle) {
                bundle.putInt("next_page", EnumC852910Xd3.PRIVATE_ACCOUNT_TIPS.getValue());
            }
        });
    }

    public C851740XbA(EnumC851330XaV enumC851330XaV) {
        this.LIZ = enumC851330XaV;
    }

    public final void LIZIZ(Bundle bundle) {
        if (this.LIZIZ != EnumC851810XbH.NOT_START) {
            return;
        }
        ((ArrayList) this.LIZJ).clear();
        List<AbstractC851770XbD> list = this.LIZJ;
        ArrayList arrayList = new ArrayList();
        for (AbstractC851770XbD abstractC851770XbD : LIZ()) {
            if (abstractC851770XbD.LIZ(bundle)) {
                arrayList.add(abstractC851770XbD);
            }
        }
        ((ArrayList) list).addAll(arrayList);
        this.LIZIZ = EnumC851810XbH.STARTED;
    }

    public final void LIZJ(List<Integer> list) {
        List<AbstractC851770XbD> listLIZ = LIZ();
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(listLIZ, 10));
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        for (AbstractC851770XbD abstractC851770XbD : listLIZ) {
            linkedHashMap.put(abstractC851770XbD.LLJJLIIIJLLLLLLLZ(), abstractC851770XbD);
        }
        ((ArrayList) this.LIZJ).clear();
        Iterator<Integer> it2 = list.iterator();
        while (it2.hasNext()) {
            int iIntValue = it2.next().intValue();
            EnumC852910Xd3.Companion.getClass();
            Object obj = linkedHashMap.get(C852970Xd9.LIZ(iIntValue));
            if (obj != null) {
                ((ArrayList) this.LIZJ).add(obj);
            }
        }
    }
}
