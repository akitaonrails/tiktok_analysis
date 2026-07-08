package X;

import android.app.Activity;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.IForceBindingAccountService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS14S2300000_13;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0XVa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C849720XVa {
    public static final C849720XVa LIZ = new C849720XVa();

    public static void LIZ(Activity activity, final IForceBindingAccountService.BindPromptConfig bindPromptConfig, IForceBindingAccountService.BindPromptConfig bindPromptConfig2, final String str, final String str2, final C0XVZ c0xvz, final InterfaceC849390XTt interfaceC849390XTt) {
        Integer numValueOf;
        IForceBindingAccountService iForceBindingAccountService = (IForceBindingAccountService) ServiceManager.get().getService(IForceBindingAccountService.class);
        if (c0xvz == C0XVZ.SKIPPABLE_LOGOUT_PROMPT) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(R.raw.icon_shield_tick);
        }
        final AwS14S2300000_13 awS14S2300000_13 = new AwS14S2300000_13(bindPromptConfig2, activity, str, str2, interfaceC849390XTt, 1);
        iForceBindingAccountService.showDialog(activity, bindPromptConfig, str, str2, numValueOf, null, new InterfaceC1237760iJa() { // from class: X.0iJb
            public final IForceBindingAccountService LIZ = (IForceBindingAccountService) ServiceManager.get().getService(IForceBindingAccountService.class);

            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            @Override // X.InterfaceC1237760iJa
            public final void onButtonClick(String str3) {
                EnumC1237830iJh enumC1237830iJh;
                switch (str3.hashCode()) {
                    case -1097329270:
                        if (str3.equals("logout")) {
                            if (C849730XVb.LIZ[c0xvz.ordinal()] == 3) {
                                C1237780iJc c1237780iJc = C1237780iJc.LIZ;
                                String str4 = str;
                                String str5 = str2;
                                EnumC1237790iJd enumC1237790iJd = EnumC1237790iJd.LOGOUT;
                                EnumC1237830iJh enumC1237830iJh2 = EnumC1237830iJh.SKIPPABLE;
                                c1237780iJc.getClass();
                                C1237780iJc.LJ(str4, str5, enumC1237790iJd, enumC1237830iJh2);
                                interfaceC849390XTt.LIZ();
                            }
                        }
                        break;
                    case -280283050:
                        if (str3.equals("verify_email")) {
                            C1237780iJc c1237780iJc2 = C1237780iJc.LIZ;
                            String str6 = str;
                            String str7 = str2;
                            int i = bindPromptConfig.groupId;
                            EnumC1237790iJd enumC1237790iJd2 = EnumC1237790iJd.VERIFY_EMAIL;
                            this.LIZ.getCurrentLoginUser3pPlatform();
                            c1237780iJc2.getClass();
                            C1237780iJc.LIZ("verify_email", str6, str7, i, enumC1237790iJd2, null, null, null, null);
                        }
                        break;
                    case 89277620:
                        if (str3.equals("phone_binding")) {
                            C1237780iJc c1237780iJc3 = C1237780iJc.LIZ;
                            String str8 = str;
                            String str9 = str2;
                            EnumC1237790iJd enumC1237790iJd3 = EnumC1237790iJd.BIND_PHONE;
                            if (c0xvz == C0XVZ.FORCE_BIND) {
                                enumC1237830iJh = EnumC1237830iJh.FORCE;
                            } else {
                                enumC1237830iJh = EnumC1237830iJh.SKIPPABLE;
                            }
                            c1237780iJc3.getClass();
                            C1237780iJc.LIZLLL(str8, str9, enumC1237790iJd3, enumC1237830iJh);
                        }
                        break;
                    case 1671672458:
                        if (str3.equals("dismiss")) {
                            int i2 = C849730XVb.LIZ[c0xvz.ordinal()];
                            if (i2 != 1) {
                                if (i2 != 2) {
                                    if (i2 == 3) {
                                        C1237780iJc c1237780iJc4 = C1237780iJc.LIZ;
                                        String str10 = str;
                                        String str11 = str2;
                                        EnumC1237790iJd enumC1237790iJd4 = EnumC1237790iJd.DISMISS;
                                        EnumC1237830iJh enumC1237830iJh3 = EnumC1237830iJh.SKIPPABLE;
                                        c1237780iJc4.getClass();
                                        C1237780iJc.LJ(str10, str11, enumC1237790iJd4, enumC1237830iJh3);
                                    }
                                } else {
                                    C1237780iJc c1237780iJc5 = C1237780iJc.LIZ;
                                    String str12 = str;
                                    String str13 = str2;
                                    EnumC1237790iJd enumC1237790iJd5 = EnumC1237790iJd.LOGOUT;
                                    EnumC1237830iJh enumC1237830iJh4 = EnumC1237830iJh.SKIPPABLE;
                                    c1237780iJc5.getClass();
                                    C1237780iJc.LIZLLL(str12, str13, enumC1237790iJd5, enumC1237830iJh4);
                                    awS14S2300000_13.invoke();
                                }
                            } else {
                                C1237780iJc c1237780iJc6 = C1237780iJc.LIZ;
                                String str14 = str;
                                String str15 = str2;
                                EnumC1237790iJd enumC1237790iJd6 = EnumC1237790iJd.DISMISS;
                                EnumC1237830iJh enumC1237830iJh5 = EnumC1237830iJh.FORCE;
                                c1237780iJc6.getClass();
                                C1237780iJc.LIZLLL(str14, str15, enumC1237790iJd6, enumC1237830iJh5);
                            }
                        }
                        break;
                }
            }

            @Override // X.InterfaceC1237760iJa
            public final void onDialogShow(boolean z) {
                EnumC1237830iJh enumC1237830iJh;
                if (z) {
                    if (bindPromptConfig.buttons.isEmpty()) {
                        C0WQI.LIZ(6, "ShowBindDialogHandler", "Error getting first button action type!");
                        return;
                    }
                    if (Intrinsics.LJFF(((IForceBindingAccountService.BindPromptButtonConfig) ListProtector.get(bindPromptConfig.buttons, 0)).actionType, "verify_email")) {
                        C1237780iJc c1237780iJc = C1237780iJc.LIZ;
                        String str3 = str;
                        String str4 = str2;
                        int i = bindPromptConfig.groupId;
                        c1237780iJc.getClass();
                        C1237780iJc.LIZJ(i, null, null, "verify_email", str3, str4, null);
                        return;
                    }
                    C1237780iJc c1237780iJc2 = C1237780iJc.LIZ;
                    String str5 = str;
                    String str6 = str2;
                    if (c0xvz == C0XVZ.FORCE_BIND) {
                        enumC1237830iJh = EnumC1237830iJh.FORCE;
                    } else {
                        enumC1237830iJh = EnumC1237830iJh.SKIPPABLE;
                    }
                    c1237780iJc2.getClass();
                    C0XGR c0xgr = new C0XGR();
                    c0xgr.LIZLLL("enter_from", str5);
                    c0xgr.LIZLLL("enter_method", str6);
                    c0xgr.LIZLLL("popup_type", enumC1237830iJh.getValue());
                    C20684815ws.LJIILLIIL("logout_phone_binding_popup_show", c0xgr.LIZ);
                }
            }

            @Override // X.InterfaceC1237760iJa
            public final void onPhoneBindResult(boolean z) {
                if (z) {
                    int i = C849730XVb.LIZ[c0xvz.ordinal()];
                    if (i != 1 && i != 2) {
                        return;
                    }
                    interfaceC849390XTt.LIZ();
                }
            }
        });
    }
}
