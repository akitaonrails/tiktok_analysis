package X;

import android.app.Activity;
import android.content.DialogInterface;
import androidx.compose.foundation.layout.c;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.livesdk.iap.IapProductDetail;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.AdFreeSubscription;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.AdFreeTrialPageInfo;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.OfferInfo;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.ProductInfo;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.SubscriptionInfo;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.SubscriptionStatusInfo;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.personalization.PersonalizationViewModel;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.SubscriptionNotificationPrompt;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.SubscriptionVM;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.AwS0S0701000_12;
import kotlin.jvm.internal.AwS26S0401000_12;
import kotlin.jvm.internal.AwS41S1101000_12;
import kotlin.jvm.internal.Intrinsics;
import p2.g;

/* JADX INFO: renamed from: X.0tfZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1674230tfZ {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [T, com.bytedance.tux.sheet.BaseSheet, com.bytedance.tux.sheet.sheet.TuxSheet] */
    public static void LJ(final EnumC745880TNq enumC745880TNq, C19EG c19eg, final C20656615sK c20656615sK) {
        SubscriptionVM subscriptionVMLIZ;
        PersonalizationViewModel personalizationViewModel;
        ProductInfo productInfo;
        String str;
        AdFreeTrialPageInfo adFreeTrialPageInfo;
        final int i;
        FragmentManager supportFragmentManager;
        SubscriptionStatusInfo subscriptionStatusInfo;
        SubscriptionInfo subscriptionInfo;
        OfferInfo offerInfo;
        ViewModelProvider viewModelProviderOf;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(c19eg);
        if (c19egLIZIZ != null) {
            subscriptionVMLIZ = C0TQ7.LIZ(c19egLIZIZ);
        } else {
            subscriptionVMLIZ = null;
        }
        SubscriptionNotificationPrompt.LLIZLLLIL = subscriptionVMLIZ;
        C19EG c19egLIZIZ2 = C1388190mED.LIZIZ(c19eg);
        if (c19egLIZIZ2 != null && (viewModelProviderOf = ViewModelProviders.of(c19egLIZIZ2)) != null) {
            personalizationViewModel = (PersonalizationViewModel) viewModelProviderOf.get(PersonalizationViewModel.class);
        } else {
            personalizationViewModel = null;
        }
        SubscriptionNotificationPrompt.LLJI = personalizationViewModel;
        C0TOM.LIZ.getClass();
        AdFreeSubscription adFreeSubscriptionLJ = C0TOM.LJ();
        SubscriptionNotificationPrompt.LLJ = adFreeSubscriptionLJ;
        if (adFreeSubscriptionLJ != null && (subscriptionStatusInfo = adFreeSubscriptionLJ.subscriptionStatusInfo) != null && (subscriptionInfo = subscriptionStatusInfo.subscriptionInfo) != null && (offerInfo = subscriptionInfo.offerInfo) != null) {
            productInfo = offerInfo.productInfo;
        } else {
            productInfo = null;
        }
        C0TOS c0tos = C0TOS.LIZ;
        if (productInfo != null) {
            str = productInfo.merchantId;
        } else {
            str = null;
        }
        MutableLiveData<IapProductDetail> mutableLiveData = SubscriptionNotificationPrompt.LLJIJIL;
        c0tos.getClass();
        C0TOS.LIZIZ(str, productInfo, mutableLiveData, 1);
        int[] iArr = C745900TNs.LIZ;
        int i2 = iArr[enumC745880TNq.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    AdFreeSubscription adFreeSubscription = SubscriptionNotificationPrompt.LLJ;
                    if (adFreeSubscription != null) {
                        adFreeTrialPageInfo = adFreeSubscription.continuePaymentPage;
                    } else {
                        return;
                    }
                } else {
                    throw new C1954807lC();
                }
            } else {
                AdFreeSubscription adFreeSubscription2 = SubscriptionNotificationPrompt.LLJ;
                if (adFreeSubscription2 != null) {
                    adFreeTrialPageInfo = adFreeSubscription2.subscribeIntroReminderPage;
                } else {
                    return;
                }
            }
        } else {
            AdFreeSubscription adFreeSubscription3 = SubscriptionNotificationPrompt.LLJ;
            if (adFreeSubscription3 != null) {
                adFreeTrialPageInfo = adFreeSubscription3.subscribeIntroPage;
            } else {
                return;
            }
        }
        if (adFreeTrialPageInfo != null) {
            C259800zU c259800zU = new C259800zU();
            final C013C c013c = new C013C();
            int i3 = iArr[enumC745880TNq.ordinal()];
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 == 3) {
                        i = 6;
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    i = 5;
                }
            } else {
                i = 4;
            }
            ComposeView composeView = new ComposeView(c19eg, null, 6);
            composeView.setViewCompositionStrategy(C20088213iq.LIZIZ);
            C1669670tYD.LJ(composeView, EnumC1427810nG7.Auto, new C19719212De(1248057648, new AwS0S0701000_12(c19eg, adFreeTrialPageInfo, enumC745880TNq, c20656615sK, c259800zU, productInfo, i, c013c, 1), true));
            int i4 = 0;
            C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
            TuxSheet tuxSheet = c1390920mIc.LIZ;
            tuxSheet.LLJJIII = composeView;
            tuxSheet.LLJJIJIIJIL = true;
            tuxSheet.LLJLILLLLZIIL = false;
            tuxSheet.LLILLL = true;
            tuxSheet.LLJLLIL = true;
            c1390920mIc.LJIIIIZZ(1);
            int iLJIIIIZZ = (int) (0.85d * ((double) C12ES.LJIIIIZZ(C06MM.LIZ(c19eg))));
            ?? r1 = c1390920mIc.LIZ;
            r1.LLJJL = iLJIIIIZZ;
            r1.LLJLL = true;
            r1.LLILLJJLI = new DialogInterface.OnDismissListener() { // from class: X.0TNp
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    EnumC745880TNq enumC745880TNq2;
                    if (!c013c.element && ((enumC745880TNq2 = enumC745880TNq) == EnumC745880TNq.REMINDER_PAGE || enumC745880TNq2 == EnumC745880TNq.CONTINUE_PAY_PAGE)) {
                        SubscriptionVM subscriptionVM = SubscriptionNotificationPrompt.LLIZLLLIL;
                        if (subscriptionVM != null) {
                            subscriptionVM.BQ2(Integer.valueOf(i), "1");
                        }
                        PersonalizationViewModel personalizationViewModel2 = SubscriptionNotificationPrompt.LLJI;
                        if (personalizationViewModel2 != null) {
                            personalizationViewModel2.xQ2(1);
                        }
                    }
                    ComplianceServiceProvider.LJJI().LJIJJLI(null, 0);
                    C20656615sK c20656615sK2 = c20656615sK;
                    if (c20656615sK2 != null) {
                        c20656615sK2.LIZ();
                    }
                }
            };
            c259800zU.element = r1;
            C19EG c19egLIZIZ3 = C1388190mED.LIZIZ(c19eg);
            if (c19egLIZIZ3 != null && (supportFragmentManager = c19egLIZIZ3.getSupportFragmentManager()) != null) {
                ((DialogFragment) c259800zU.element).show(supportFragmentManager, "SubscriptionNotificationPrompt");
                if (enumC745880TNq != EnumC745880TNq.INTRO_PAGE) {
                    int i5 = iArr[enumC745880TNq.ordinal()];
                    if (i5 != 2) {
                        if (i5 == 3) {
                            i4 = 8;
                        }
                    } else {
                        i4 = 7;
                    }
                    SubscriptionVM subscriptionVM = SubscriptionNotificationPrompt.LLIZLLLIL;
                    if (subscriptionVM != null) {
                        subscriptionVM.xQ2(Integer.valueOf(i4), null, null);
                    }
                } else {
                    SubscriptionVM subscriptionVM2 = SubscriptionNotificationPrompt.LLIZLLLIL;
                    if (subscriptionVM2 != null) {
                        subscriptionVM2.BQ2(Integer.valueOf(i), "3");
                    }
                    SubscriptionVM subscriptionVM3 = SubscriptionNotificationPrompt.LLIZLLLIL;
                    if (subscriptionVM3 != null) {
                        subscriptionVM3.xQ2(12, null, null);
                    }
                }
                int mobType = enumC745880TNq.toMobType();
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LIZJ(mobType, "prompt_type");
                C20684815ws.LJIILLIIL("show_subscription_prompt", c2344009Gk.LIZ);
            }
        }
    }

    public final void LIZIZ(int i, InterfaceC1680500tpg interfaceC1680500tpg, String str) {
        int i2;
        int i3;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(57128879);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(str)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
            InterfaceC1685750ty9 interfaceC1685750ty9LJIIIZ = C1682520tsw.LJIIIZ(c1685760tyA, 24, 10);
            C1679920tok c1679920tok = C1679930tol.LIZ;
            InterfaceC1668050tVb.LIZ.getClass();
            C1688120u1y c1688120u1yLIZ = C1665750tRt.LIZ(c1679920tok, C1668040tVa.LJIIJ, c13zcLJIIJ, 0);
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LJIIIZ);
            g.LJLIIIL.getClass();
            AFwS214S0000000_25 aFwS214S0000000_25 = g.a.LIZIZ;
            if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                c13zcLJIIJ.LJJIII();
                if (c13zcLJIIJ.LJJJI) {
                    c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                } else {
                    c13zcLJIIJ.LJIILJJIL();
                }
                C1665930tSB.LIZ(c13zcLJIIJ, c1688120u1yLIZ, g.a.LJI);
                C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL, g.a.LJFF);
                AFwS311S0000000_25 aFwS311S0000000_25 = g.a.LJIIIIZZ;
                if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ))) {
                    c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ));
                    c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_25);
                }
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL, g.a.LIZLLL);
                C1668930tX1.LIZIZ(C1669660tYC.F, "", c.LJIILIIL(c1685760tyA, 20), ((C1685910tyP) ((C13FE) C1670400tZO.LIZIZ(c13zcLJIIJ).m4).getValue()).LIZ, 0.0f, 0.0f, false, c13zcLJIIJ, 432, 112);
                C1665790tRx.LIZ(c.LJIILLIIL(c1685760tyA, 8), c13zcLJIIJ);
                C1685190txF.LIZ(str, null, C1670400tZO.LIZIZ(c13zcLJIIJ).K3(), C1670400tZO.LJ(c13zcLJIIJ).LJJIIJ, 0L, 0, 0, false, 0, null, null, c13zcLJIIJ, i2 & 14, 0, 2034);
                c13zcLJIIJ.LJJJJL(true);
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS41S1101000_12(this, str, i, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [T, com.bytedance.tux.sheet.BaseSheet, com.bytedance.tux.sheet.sheet.TuxSheet] */
    public static void LJFF(Activity activity, int i, C20656615sK c20656615sK, AdFreeTrialPageInfo adFreeTrialPageInfo) {
        SubscriptionVM subscriptionVMLIZ;
        AdFreeTrialPageInfo adFreeTrialPageInfo2;
        FragmentManager supportFragmentManager;
        Integer num;
        AdFreeSubscription adFreeSubscription;
        AdFreeTrialPageInfo adFreeTrialPageInfo3 = adFreeTrialPageInfo;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(activity);
        if (c19egLIZIZ != null) {
            subscriptionVMLIZ = C0TQ7.LIZ(c19egLIZIZ);
        } else {
            subscriptionVMLIZ = null;
        }
        SubscriptionNotificationPrompt.LLIZLLLIL = subscriptionVMLIZ;
        C0TOM.LIZ.getClass();
        SubscriptionNotificationPrompt.LLJ = C0TOM.LJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[showWelcomePagePopUp] act: ");
        sbLIZ.append(activity);
        sbLIZ.append(" prompt type is ");
        sbLIZ.append(i);
        sbLIZ.append(" and subscription is ");
        AdFreeSubscription adFreeSubscription2 = SubscriptionNotificationPrompt.LLJ;
        if (adFreeSubscription2 != null) {
            adFreeTrialPageInfo2 = adFreeSubscription2.completePaymentWelcomePage;
        } else {
            adFreeTrialPageInfo2 = null;
        }
        sbLIZ.append(adFreeTrialPageInfo2);
        C1022620cia.LIZ("SubscriptionNotificationPrompt", C2188811AlT.LIZIZ(sbLIZ));
        int i2 = 1;
        if (adFreeTrialPageInfo3 == null) {
            if (i != 1) {
                if (i == 6 && (adFreeSubscription = SubscriptionNotificationPrompt.LLJ) != null) {
                    adFreeTrialPageInfo3 = adFreeSubscription.completePaymentWelcomePage;
                } else {
                    return;
                }
            } else {
                AdFreeSubscription adFreeSubscription3 = SubscriptionNotificationPrompt.LLJ;
                if (adFreeSubscription3 == null) {
                    return;
                } else {
                    adFreeTrialPageInfo3 = adFreeSubscription3.completePaymentWelcomePage;
                }
            }
            if (adFreeTrialPageInfo3 == null) {
                return;
            }
        }
        C259800zU c259800zU = new C259800zU();
        ComposeView composeView = new ComposeView(activity, null, 6);
        composeView.setViewCompositionStrategy(C20088213iq.LIZIZ);
        C1669670tYD.LJ(composeView, EnumC1427810nG7.Auto, new C19719212De(956735260, new AwS26S0401000_12(activity, (Activity) adFreeTrialPageInfo3, (AdFreeTrialPageInfo) i, (int) c20656615sK, (C20656615sK) c259800zU, (C259800zU<TuxSheet>) 0), true));
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJIII = composeView;
        tuxSheet.LLJJIJIIJIL = true;
        c1390920mIc.LJIIIIZZ(2);
        ?? r6 = c1390920mIc.LIZ;
        r6.LLJLILLLLZIIL = false;
        r6.LLILLJJLI = new DialogInterfaceOnDismissListenerC786080UsY(c20656615sK, 14);
        c259800zU.element = r6;
        C19EG c19egLIZIZ2 = C1388190mED.LIZIZ(activity);
        if (c19egLIZIZ2 != null && (supportFragmentManager = c19egLIZIZ2.getSupportFragmentManager()) != null) {
            ((DialogFragment) c259800zU.element).show(supportFragmentManager, "SubscriptionNotificationPrompt");
            SubscriptionVM subscriptionVM = SubscriptionNotificationPrompt.LLIZLLLIL;
            if (subscriptionVM != null) {
                subscriptionVM.xQ2(Integer.valueOf(i), null, null);
            }
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LIZJ(1, "prompt_type");
            AdFreeSubscription adFreeSubscription4 = SubscriptionNotificationPrompt.LLJ;
            if (adFreeSubscription4 == null || (num = adFreeSubscription4.subscriptionStatus) == null || num.intValue() != 2) {
                i2 = 0;
            }
            c2344009Gk.LIZJ(i2, "content_type");
            C20684815ws.LJIILLIIL("show_tt_plus_coldstart_reminder", c2344009Gk.LIZ);
        }
    }

    public final void LIZ(String str, float f, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        int i4;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1951402256);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(str)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJIJ(f)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 19) == 18 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            InterfaceC1668050tVb.LIZ.getClass();
            C1296880jqw c1296880jqw = C1668040tVa.LJIIJ;
            C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
            C1688120u1y c1688120u1yLIZ = C1665750tRt.LIZ(C1679930tol.LIZ, c1296880jqw, c13zcLJIIJ, 48);
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, c1685760tyA);
            g.LJLIIIL.getClass();
            AFwS214S0000000_25 aFwS214S0000000_25 = g.a.LIZIZ;
            if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                c13zcLJIIJ.LJJIII();
                if (c13zcLJIIJ.LJJJI) {
                    c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                } else {
                    c13zcLJIIJ.LJIILJJIL();
                }
                C1665930tSB.LIZ(c13zcLJIIJ, c1688120u1yLIZ, g.a.LJI);
                C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL, g.a.LJFF);
                AFwS311S0000000_25 aFwS311S0000000_25 = g.a.LJIIIIZZ;
                if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ))) {
                    c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ));
                    c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_25);
                }
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL, g.a.LIZLLL);
                float f2 = 6;
                C1668930tX1.LIZIZ(C1669660tYC.K, "", C1688600u2k.LIZLLL(c.LJIILIIL(c1685760tyA, 10 * f), 0.0f, f2, 1), C1670400tZO.LIZIZ(c13zcLJIIJ).N3(), 0.0f, 0.0f, false, c13zcLJIIJ, 48, 112);
                long jN3 = C1670400tZO.LIZIZ(c13zcLJIIJ).N3();
                C1693430uAX c1693430uAX = C1670400tZO.LJ(c13zcLJIIJ).LJJIIJ;
                long j = C1670400tZO.LJ(c13zcLJIIJ).LJJIIJ.LIZ.LIZIZ;
                C1682430tsn.LIZ(j);
                C1685190txF.LIZ(str, C1682520tsw.LJIIL(c1685760tyA, f2, 0.0f, 0.0f, 0.0f, 14), jN3, C1693430uAX.LIZ(0, 0, 16777213, 0L, C1682430tsn.LJFF(C1682440tso.LIZLLL(j) * f, C1682440tso.LIZIZ(j)), 0L, 0L, null, c1693430uAX, null, null), 0L, 0, 0, false, 0, null, null, c13zcLJIIJ, (i2 & 14) | 48, 0, 2032);
                c13zcLJIIJ.LJJJJL(true);
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new C0TPA(this, str, f, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x054b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(android.content.Context r63, com.bytedance.ies.ugc.aweme.commercialize.compliance.model.AdFreeTrialPageInfo r64, int r65, X.C20656615sK r66, kotlin.jvm.functions.Function0<kotlin.Unit> r67, X.InterfaceC1680500tpg r68, int r69) {
        /*
            Method dump skipped, instruction units count: 1626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1674230tfZ.LIZLLL(android.content.Context, com.bytedance.ies.ugc.aweme.commercialize.compliance.model.AdFreeTrialPageInfo, int, X.15sK, kotlin.jvm.functions.Function0, X.0tpg, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:198:0x07f1  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0876  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x09d5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x025a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(final android.content.Context r66, com.bytedance.ies.ugc.aweme.commercialize.compliance.model.AdFreeTrialPageInfo r67, X.EnumC745880TNq r68, X.C20656615sK r69, kotlin.jvm.functions.Function0<kotlin.Unit> r70, kotlin.jvm.functions.Function0<kotlin.Unit> r71, X.InterfaceC1680500tpg r72, int r73) {
        /*
            Method dump skipped, instruction units count: 2813
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1674230tfZ.LIZJ(android.content.Context, com.bytedance.ies.ugc.aweme.commercialize.compliance.model.AdFreeTrialPageInfo, X.0TNq, X.15sK, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.0tpg, int):void");
    }
}
