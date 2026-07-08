package Y;

import X.AbstractC19311610gs;
import X.C036E;
import X.C05YD;
import X.C0D5O;
import X.C0D5P;
import X.C0D5Q;
import X.C10WT;
import X.C1233040iBy;
import X.C1238110iK9;
import X.C1245050iVL;
import X.C1558520qew;
import X.C1868530yix;
import X.C1889330zGV;
import X.C1889360zGY;
import X.C1889530zGp;
import X.C19299010eq;
import X.C1954807lC;
import X.C19EG;
import X.C1BV2;
import X.C2188811AlT;
import X.C786410Ut5;
import X.C852680Xcg;
import X.DialogC1389620mGW;
import X.EnumC1889520zGo;
import X.InterfaceC1364105Vn;
import X.InterfaceC346701Wf;
import X.InterfaceC665370Q7z;
import X.InterfaceC852200Xbu;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.router.SmartRoute;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.account.experiment.ThirdPartyDeprecationExperiment5;
import com.ss.android.ugc.aweme.account.login.auth.I18nSignUpActivity;
import com.ss.android.ugc.aweme.account.login.auth.SignupViewModel;
import com.ss.android.ugc.aweme.account.login.auth.ui.login.LoginSignupTabFragment;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.business.fbv.FBVCheckResponse;
import com.ss.android.ugc.aweme.compliance.business.fbv.FBVNoticeObserver;
import com.ss.android.ugc.aweme.inbox.followerv2.FollowerUserCardWidgetContainer;
import com.ss.android.ugc.aweme.inbox.followerv2.FollowerWidgetContainer;
import com.ss.android.ugc.aweme.inbox.widget.multi.UserCardSkeletonLoadingWidget;
import com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidgetStatus;
import com.ss.android.ugc.aweme.inbox.widget.v2.ability.FollowerPageAbilityCenter$IRecommendUserAbility;
import com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxCommonAbilityCenter$IBaseRecommendUserAbility;
import com.ss.android.ugc.aweme.notification.v2.NotificationFragmentV2;
import com.ss.android.ugc.aweme.notification.v2.widget.container.NotificationUserCardWidgetContainer;
import com.ss.android.ugc.aweme.pns.agegate.ui.view.PNSAgeGateContainerFragment;
import com.ss.android.ugc.aweme.pns.agegate.viewmodels.PNSBaseAgeGateViewModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public class AgS308S0100000_28 implements InterfaceC346701Wf {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC346701Wf
    public final Object emit(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        switch (this.$t) {
            case 0:
                return emit$0(this, obj, interfaceC1364105Vn);
            case 1:
                return emit$1(this, obj, interfaceC1364105Vn);
            case 2:
                return emit$2(this, obj, interfaceC1364105Vn);
            case 3:
                return emit$3(this, obj, interfaceC1364105Vn);
            case 4:
                return emit$4(this, obj, interfaceC1364105Vn);
            case 5:
                return emit$5(this, obj, interfaceC1364105Vn);
            case 6:
                return emit$6(this, obj, interfaceC1364105Vn);
            case 7:
                return emit$7(this, obj, interfaceC1364105Vn);
            case 8:
                return emit$8(this, obj, interfaceC1364105Vn);
            case BdTuring.TYPE_ECAF /* 9 */:
                return emit$9(this, obj, interfaceC1364105Vn);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return emit$10(this, obj, interfaceC1364105Vn);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return emit$11(this, obj, interfaceC1364105Vn);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return emit$12(this, obj, interfaceC1364105Vn);
            default:
                return null;
        }
    }

    public AgS308S0100000_28(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object emit$0(AgS308S0100000_28 agS308S0100000_28, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) throws Throwable {
        C0D5P c0d5p = (C0D5P) obj;
        if (c0d5p instanceof C1868530yix) {
            final I18nSignUpActivity i18nSignUpActivity = (I18nSignUpActivity) agS308S0100000_28.l0;
            C1868530yix c1868530yix = (C1868530yix) c0d5p;
            boolean z = c1868530yix.LIZ;
            String str = c1868530yix.LIZIZ;
            final String str2 = c1868530yix.LIZJ;
            final String str3 = c1868530yix.LIZLLL;
            final Bundle bundle = c1868530yix.LJ;
            i18nSignUpActivity.getClass();
            if (ThirdPartyDeprecationExperiment5.LJFF(str)) {
                C1BV2 c1bv2 = i18nSignUpActivity.LLJJI;
                if (c1bv2 != null) {
                    c1bv2.LIZLLL(0L, str, false);
                }
            } else {
                try {
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (C036E.LIZ.LIZIZ()) {
                    I18nSignUpActivity.LLZLI(2211);
                    C786410Ut5.LJJJI("login_panel_type", str3, bundle);
                    if (z && ComplianceServiceProvider.LIZLLL().LJFF() && ComplianceServiceProvider.LIZLLL().LJI()) {
                        SmartRoute smartRouteLIZIZ = C852680Xcg.LIZIZ(i18nSignUpActivity);
                        bundle.putBoolean("age_gate_block", true);
                        smartRouteLIZIZ.withParam(bundle);
                        smartRouteLIZIZ.open();
                    } else if (Intrinsics.LJFF(str, "tiktok")) {
                        i18nSignUpActivity.LLLZZIL();
                        SignupViewModel signupViewModelLLLLZLLLI = i18nSignUpActivity.LLLLZLLLI();
                        String string = i18nSignUpActivity.getString(2131821732);
                        DialogC1389620mGW dialogC1389620mGW = i18nSignUpActivity.LLJI;
                        signupViewModelLLLLZLLLI.getClass();
                        SignupViewModel.WQ2(i18nSignUpActivity, dialogC1389620mGW, string);
                    } else {
                        C1238110iK9 c1238110iK9 = C1238110iK9.LIZ;
                        InterfaceC852200Xbu interfaceC852200Xbu = new InterfaceC852200Xbu() { // from class: X.10h4
                            @Override // X.InterfaceC852200Xbu
                            public final String dm() {
                                return "";
                            }

                            @Override // X.InterfaceC852200Xbu
                            public final String LJJLIIIJJI() {
                                return i18nSignUpActivity.LLLLZLLLI().getEnterFrom();
                            }

                            @Override // X.InterfaceC852200Xbu
                            public final String LLIIJI() {
                                return i18nSignUpActivity.LLLLZLLLI().getEnterMethod();
                            }

                            @Override // X.InterfaceC852200Xbu
                            public final String channel() {
                                return (String) i18nSignUpActivity.LLLLZLLLI().LLJJIJI.getValue();
                            }

                            @Override // X.InterfaceC852200Xbu
                            public final String Nn() {
                                return str2;
                            }

                            @Override // X.InterfaceC852200Xbu
                            public final String bt() {
                                return str3;
                            }

                            @Override // X.InterfaceC852200Xbu
                            public final Bundle getExtras() {
                                return bundle;
                            }
                        };
                        c1238110iK9.getClass();
                        Intent intentLIZ = C1238110iK9.LIZ(i18nSignUpActivity, z, str, interfaceC852200Xbu);
                        c1238110iK9.getClass();
                        C1238110iK9.LIZIZ(i18nSignUpActivity, intentLIZ, null);
                    }
                } else {
                    C1233040iBy c1233040iBy = new C1233040iBy(i18nSignUpActivity);
                    c1233040iBy.LIZIZ(2131837962);
                    c1233040iBy.LIZLLL();
                }
            }
        } else if (c0d5p instanceof C0D5O) {
            AbstractC19311610gs abstractC19311610gs = ((I18nSignUpActivity) agS308S0100000_28.l0).LLJILLL;
            if (abstractC19311610gs != null) {
                abstractC19311610gs.LIZIZ(((C0D5O) c0d5p).LIZ);
            }
        } else if (c0d5p instanceof C0D5Q) {
            AbstractC19311610gs abstractC19311610gs2 = ((I18nSignUpActivity) agS308S0100000_28.l0).LLJILLL;
            if (abstractC19311610gs2 != null) {
                abstractC19311610gs2.LJ();
            }
        } else {
            throw new C1954807lC();
        }
        return Unit.LIZ;
    }

    public static final Object emit$1(AgS308S0100000_28 agS308S0100000_28, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) throws Throwable {
        I18nSignUpActivity i18nSignUpActivity;
        C0D5P c0d5p = (C0D5P) obj;
        if (c0d5p instanceof C1868530yix) {
            final LoginSignupTabFragment loginSignupTabFragment = (LoginSignupTabFragment) agS308S0100000_28.l0;
            C1868530yix c1868530yix = (C1868530yix) c0d5p;
            boolean z = c1868530yix.LIZ;
            String str = c1868530yix.LIZIZ;
            final String str2 = c1868530yix.LIZJ;
            final String str3 = c1868530yix.LIZLLL;
            final Bundle bundle = c1868530yix.LJ;
            C19EG activity = loginSignupTabFragment.getActivity();
            if ((activity instanceof I18nSignUpActivity) && (i18nSignUpActivity = (I18nSignUpActivity) activity) != null) {
                if (ThirdPartyDeprecationExperiment5.LJFF(str)) {
                    C1BV2 c1bv2 = loginSignupTabFragment.LLILLJJLI;
                    if (c1bv2 != null) {
                        c1bv2.LIZLLL(0L, str, false);
                    }
                } else {
                    loginSignupTabFragment.requireContext();
                    try {
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    if (C036E.LIZ.LIZIZ()) {
                        I18nSignUpActivity.LLZLI(2211);
                        C786410Ut5.LJJJI("login_panel_type", str3, bundle);
                        if (z && ComplianceServiceProvider.LIZLLL().LJFF() && ComplianceServiceProvider.LIZLLL().LJI()) {
                            SmartRoute smartRouteLIZIZ = C852680Xcg.LIZIZ(loginSignupTabFragment.requireContext());
                            bundle.putBoolean("age_gate_block", true);
                            smartRouteLIZIZ.withParam(bundle);
                            smartRouteLIZIZ.open();
                        } else if (Intrinsics.LJFF(str, "tiktok")) {
                            i18nSignUpActivity.LLLZZIL();
                            SignupViewModel signupViewModelMR = loginSignupTabFragment.MR();
                            C19EG c19egRequireActivity = loginSignupTabFragment.requireActivity();
                            String string = loginSignupTabFragment.getString(2131821732);
                            DialogC1389620mGW dialogC1389620mGW = i18nSignUpActivity.LLJI;
                            signupViewModelMR.getClass();
                            SignupViewModel.WQ2(c19egRequireActivity, dialogC1389620mGW, string);
                        } else {
                            C1238110iK9 c1238110iK9 = C1238110iK9.LIZ;
                            C19EG c19egRequireActivity2 = loginSignupTabFragment.requireActivity();
                            InterfaceC852200Xbu interfaceC852200Xbu = new InterfaceC852200Xbu() { // from class: X.10h5
                                @Override // X.InterfaceC852200Xbu
                                public final String dm() {
                                    return "";
                                }

                                @Override // X.InterfaceC852200Xbu
                                public final String LJJLIIIJJI() {
                                    return loginSignupTabFragment.MR().getEnterFrom();
                                }

                                @Override // X.InterfaceC852200Xbu
                                public final String LLIIJI() {
                                    return loginSignupTabFragment.MR().getEnterMethod();
                                }

                                @Override // X.InterfaceC852200Xbu
                                public final String channel() {
                                    return (String) loginSignupTabFragment.MR().LLJJIJI.getValue();
                                }

                                @Override // X.InterfaceC852200Xbu
                                public final String Nn() {
                                    return str2;
                                }

                                @Override // X.InterfaceC852200Xbu
                                public final String bt() {
                                    return str3;
                                }

                                @Override // X.InterfaceC852200Xbu
                                public final Bundle getExtras() {
                                    return bundle;
                                }
                            };
                            c1238110iK9.getClass();
                            Intent intentLIZ = C1238110iK9.LIZ(c19egRequireActivity2, z, str, interfaceC852200Xbu);
                            C19EG c19egRequireActivity3 = loginSignupTabFragment.requireActivity();
                            c1238110iK9.getClass();
                            C1238110iK9.LIZIZ(c19egRequireActivity3, intentLIZ, loginSignupTabFragment);
                        }
                    } else {
                        C1233040iBy c1233040iBy = new C1233040iBy(loginSignupTabFragment.requireContext());
                        c1233040iBy.LIZIZ(2131837962);
                        c1233040iBy.LIZLLL();
                    }
                }
            }
        } else if (c0d5p instanceof C0D5O) {
            ((LoginSignupTabFragment) agS308S0100000_28.l0).NR().LIZIZ(((C0D5O) c0d5p).LIZ);
        } else if (c0d5p instanceof C0D5Q) {
            ((LoginSignupTabFragment) agS308S0100000_28.l0).NR().LJ();
        } else {
            throw new C1954807lC();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$10(Y.AgS308S0100000_28 r5, java.lang.Object r6, X.InterfaceC1364105Vn r7) {
        /*
            boolean r0 = r7 instanceof X.C1889280zGQ
            if (r0 == 0) goto L3f
            r4 = r7
            X.0zGQ r4 = (X.C1889280zGQ) r4
            int r2 = r4.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3f
            int r2 = r2 - r1
            r4.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLJJLI
            r2 = 1
            if (r0 == 0) goto L25
            if (r0 != r2) goto L45
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r1 = r5.l0
            X.01Wf r1 = (X.InterfaceC346701Wf) r1
            X.0zGX r0 = X.C1889350zGX.LIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r6, r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L22
            r4.LLILLJJLI = r2
            java.lang.Object r0 = r1.emit(r6, r4)
            if (r0 != r3) goto L22
            return r3
        L3f:
            X.0zGQ r4 = new X.0zGQ
            r4.<init>(r5, r7)
            goto L12
        L45:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS308S0100000_28.emit$10(Y.AgS308S0100000_28, java.lang.Object, X.05Vn):java.lang.Object");
    }

    public static final Object emit$11(AgS308S0100000_28 agS308S0100000_28, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        C1889530zGp c1889530zGp = NotificationFragmentV2.LLJILJIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getEndStatusFlow() widgetStatus = ");
        sbLIZ.append(((NotificationUserCardWidgetContainer) agS308S0100000_28.l0).ko());
        sbLIZ.append(", notificationIsEnd = ");
        sbLIZ.append(zBooleanValue);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1889530zGp.getClass();
        C1889530zGp.LIZ("NotificationUserCardWidgetContainer", strLIZIZ);
        NotificationUserCardWidgetContainer notificationUserCardWidgetContainer = (NotificationUserCardWidgetContainer) agS308S0100000_28.l0;
        notificationUserCardWidgetContainer.LLJJIJIIJIL = zBooleanValue;
        if (notificationUserCardWidgetContainer.ko().isEnable()) {
            ((NotificationUserCardWidgetContainer) agS308S0100000_28.l0).ap();
            NotificationUserCardWidgetContainer notificationUserCardWidgetContainer2 = (NotificationUserCardWidgetContainer) agS308S0100000_28.l0;
            notificationUserCardWidgetContainer2.Co(notificationUserCardWidgetContainer2.ko());
        }
        return Unit.LIZ;
    }

    public static final Object emit$12(AgS308S0100000_28 agS308S0100000_28, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        C19299010eq c19299010eqLJI;
        PNSBaseAgeGateViewModel pNSBaseAgeGateViewModelPR = ((PNSAgeGateContainerFragment) agS308S0100000_28.l0).PR();
        MutableLiveData<C19299010eq> mutableLiveData = pNSBaseAgeGateViewModelPR.LLJJ;
        C10WT c10wt = pNSBaseAgeGateViewModelPR.LLILLL;
        if (c10wt != null) {
            c19299010eqLJI = c10wt.LJI();
        } else {
            c19299010eqLJI = null;
        }
        mutableLiveData.postValue(c19299010eqLJI);
        return Unit.LIZ;
    }

    public static final Object emit$2(AgS308S0100000_28 agS308S0100000_28, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        FBVCheckResponse fBVCheckResponse = (FBVCheckResponse) obj;
        ((FBVNoticeObserver) agS308S0100000_28.l0).LLILLL.LJFF = fBVCheckResponse;
        ((FBVNoticeObserver) agS308S0100000_28.l0).LIZIZ(fBVCheckResponse);
        return Unit.LIZ;
    }

    public static final Object emit$3(AgS308S0100000_28 agS308S0100000_28, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        int iIntValue = ((Number) obj).intValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FollowerUserCardWidgetContainer, before, follower isToEnd: ");
        sbLIZ.append(iIntValue);
        sbLIZ.append(", canShow = ");
        sbLIZ.append(((FollowerUserCardWidgetContainer) agS308S0100000_28.l0).LLJJ);
        sbLIZ.append(", widgetStatus: ");
        sbLIZ.append(((FollowerUserCardWidgetContainer) agS308S0100000_28.l0).ko());
        sbLIZ.append(", super.widgetStatus: ");
        sbLIZ.append(super/*com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidgetContainer*/.ko());
        C1245050iVL.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        FollowerUserCardWidgetContainer followerUserCardWidgetContainer = (FollowerUserCardWidgetContainer) agS308S0100000_28.l0;
        boolean z = true;
        if (iIntValue != 1) {
            z = false;
        }
        followerUserCardWidgetContainer.LLJJ = z;
        if (super/*com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidgetContainer*/.ko().isCompleted()) {
            FollowerUserCardWidgetContainer followerUserCardWidgetContainer2 = (FollowerUserCardWidgetContainer) agS308S0100000_28.l0;
            followerUserCardWidgetContainer2.Zo(followerUserCardWidgetContainer2);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$4(Y.AgS308S0100000_28 r6, java.lang.Object r7, X.InterfaceC1364105Vn r8) {
        /*
            boolean r0 = r8 instanceof X.C1889320zGU
            if (r0 == 0) goto L3f
            r5 = r8
            X.0zGU r5 = (X.C1889320zGU) r5
            int r2 = r5.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3f
            int r2 = r2 - r1
            r5.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLJJLI
            r3 = 1
            if (r0 == 0) goto L25
            if (r0 != r3) goto L45
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r2 = r6.l0
            X.01Wf r2 = (X.InterfaceC346701Wf) r2
            r0 = r7
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            r0 = -1
            if (r1 == r0) goto L22
            r5.LLILLJJLI = r3
            java.lang.Object r0 = r2.emit(r7, r5)
            if (r0 != r4) goto L22
            return r4
        L3f:
            X.0zGU r5 = new X.0zGU
            r5.<init>(r6, r8)
            goto L12
        L45:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS308S0100000_28.emit$4(Y.AgS308S0100000_28, java.lang.Object, X.05Vn):java.lang.Object");
    }

    public static final Object emit$5(AgS308S0100000_28 agS308S0100000_28, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        Pair pair = (Pair) obj;
        InboxWidgetStatus inboxWidgetStatus = (InboxWidgetStatus) pair.getFirst();
        InboxWidgetStatus inboxWidgetStatus2 = (InboxWidgetStatus) pair.getSecond();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FollowerWidgetContainer, user card status: ");
        sbLIZ.append(pair);
        C1245050iVL.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (inboxWidgetStatus2.isHide()) {
            ((FollowerWidgetContainer) agS308S0100000_28.l0).ap(false);
        }
        if (inboxWidgetStatus.isShow()) {
            ((FollowerWidgetContainer) agS308S0100000_28.l0).LLJJJJLIIL = true;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$6(Y.AgS308S0100000_28 r6, java.lang.Object r7, X.InterfaceC1364105Vn r8) {
        /*
            boolean r0 = r8 instanceof X.C1889740zHA
            if (r0 == 0) goto L46
            r5 = r8
            X.0zHA r5 = (X.C1889740zHA) r5
            int r2 = r5.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L46
            int r2 = r2 - r1
            r5.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLJJLI
            r3 = 1
            if (r0 == 0) goto L25
            if (r0 != r3) goto L4c
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r2 = r6.l0
            X.01Wf r2 = (X.InterfaceC346701Wf) r2
            r0 = r7
            kotlin.Pair r0 = (kotlin.Pair) r0
            java.lang.Object r1 = r0.getFirst()
            X.0zGX r0 = X.C1889350zGX.LIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L22
            r5.LLILLJJLI = r3
            java.lang.Object r0 = r2.emit(r7, r5)
            if (r0 != r4) goto L22
            return r4
        L46:
            X.0zHA r5 = new X.0zHA
            r5.<init>(r6, r8)
            goto L12
        L4c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS308S0100000_28.emit$6(Y.AgS308S0100000_28, java.lang.Object, X.05Vn):java.lang.Object");
    }

    public static final Object emit$7(AgS308S0100000_28 agS308S0100000_28, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        C05YD<InboxWidgetStatus> c05ydEX0;
        Pair pair = (Pair) obj;
        int iIntValue = ((Number) pair.getFirst()).intValue();
        if (pair.getSecond() == EnumC1889520zGo.HAS_MORE && iIntValue == 1) {
            UserCardSkeletonLoadingWidget userCardSkeletonLoadingWidget = (UserCardSkeletonLoadingWidget) agS308S0100000_28.l0;
            userCardSkeletonLoadingWidget.getClass();
            InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(userCardSkeletonLoadingWidget);
            InboxWidgetStatus value = null;
            InboxCommonAbilityCenter$IBaseRecommendUserAbility inboxCommonAbilityCenter$IBaseRecommendUserAbility = (InboxCommonAbilityCenter$IBaseRecommendUserAbility) C1558520qew.LIZ(interfaceC665370Q7zLJIIL, FollowerPageAbilityCenter$IRecommendUserAbility.class, null);
            if (inboxCommonAbilityCenter$IBaseRecommendUserAbility != null && (c05ydEX0 = inboxCommonAbilityCenter$IBaseRecommendUserAbility.EX0()) != null) {
                value = c05ydEX0.getValue();
            }
            C1889360zGY c1889360zGY = C1889360zGY.LIZ;
            if (Intrinsics.LJFF(value, c1889360zGY)) {
                return Unit.LIZ;
            }
            if (!Intrinsics.LJFF(((UserCardSkeletonLoadingWidget) agS308S0100000_28.l0).LLILZIL, C1889330zGV.LIZ)) {
                ((UserCardSkeletonLoadingWidget) agS308S0100000_28.l0).Co(c1889360zGY);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$8(Y.AgS308S0100000_28 r6, java.lang.Object r7, X.InterfaceC1364105Vn r8) {
        /*
            boolean r0 = r8 instanceof X.C1889300zGS
            if (r0 == 0) goto L3f
            r5 = r8
            X.0zGS r5 = (X.C1889300zGS) r5
            int r2 = r5.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3f
            int r2 = r2 - r1
            r5.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLJJLI
            r3 = 1
            if (r0 == 0) goto L25
            if (r0 != r3) goto L45
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r2 = r6.l0
            X.01Wf r2 = (X.InterfaceC346701Wf) r2
            r0 = r7
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            r0 = -1
            if (r1 == r0) goto L22
            r5.LLILLJJLI = r3
            java.lang.Object r0 = r2.emit(r7, r5)
            if (r0 != r4) goto L22
            return r4
        L3f:
            X.0zGS r5 = new X.0zGS
            r5.<init>(r6, r8)
            goto L12
        L45:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS308S0100000_28.emit$8(Y.AgS308S0100000_28, java.lang.Object, X.05Vn):java.lang.Object");
    }

    public static final Object emit$9(AgS308S0100000_28 agS308S0100000_28, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        InboxWidgetStatus inboxWidgetStatus = (InboxWidgetStatus) obj;
        if (inboxWidgetStatus.isShow() || inboxWidgetStatus.isHide()) {
            ((UserCardSkeletonLoadingWidget) agS308S0100000_28.l0).Co(C1889330zGV.LIZ);
        }
        return Unit.LIZ;
    }
}
