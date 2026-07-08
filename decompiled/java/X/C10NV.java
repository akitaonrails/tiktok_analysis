package X;

import Y.ARunnableS128S0100000_28;
import android.content.Intent;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.adchoice.ConsistentContentAndAdChoiceFragment;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IConsistentContentAndAdChoiceService;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.AdFreeTrialPageInfo;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.OfferInfo;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.PickYourAdPlanPage;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.ProductInfo;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.ILoginServiceAppDiff;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.configuration.filters.base.FilterAbilityModel;
import com.ss.android.ugc.aweme.configuration.models.NUAbilityNode;
import com.ss.android.ugc.aweme.configuration.models.NUJFlow;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.journey.INUJPushService;
import com.ss.android.ugc.aweme.journey.INewUserJourneyAppDiffService;
import com.ss.android.ugc.aweme.journey.step.interestselector.BaseInterestSelectionComponent;
import com.ss.android.ugc.aweme.journey.step.interestselector.InterestSelectionComponentRevampV1;
import com.ss.android.ugc.aweme.journey.step.interestselector.InterestSelectionSingleLineComponent;
import com.ss.android.ugc.aweme.journey.step.interestselector.TabletInterestSelectionComponent;
import com.ss.android.ugc.aweme.journey.step.privacyhighlights.PrivacyHighlightsForTeensComponent;
import com.ss.android.ugc.aweme.journey.step.privatetips.PrivateAccountTipsFragment;
import com.ss.android.ugc.aweme.journey.step.push.PushPermissionBackgroundFragment;
import com.ss.android.ugc.aweme.journey.step.swipeup.NujRevampSwipeUpComponent;
import com.ss.android.ugc.aweme.journey.step.swipeup.SwipeUpVideoComponent;
import com.ss.android.ugc.aweme.journey.step.trending.FollowCreatorsFragment;
import com.ss.android.ugc.aweme.plugin.journey.TrendingCreatorsPageStruct;
import com.ss.android.ugc.aweme.refactor.integration.NUJComponentFragment;
import com.ss.android.ugc.awemepushapi.IPushPermissionApi;
import com.tiktok.kmp.nuj.IKMPNewUserJourneyService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10NV, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10NV {
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x001d. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static List LIZ(final C1912470zrp c1912470zrp, NUJFlow nUJFlow) {
        C10ND c10nh;
        ArrayList arrayList = new ArrayList();
        for (NUAbilityNode nUAbilityNode : nUJFlow.flow) {
            String str = nUAbilityNode.id;
            switch (str.hashCode()) {
                case -2131636186:
                    if (!str.equals("consent_box")) {
                        C19240010Ow c19240010Ow = C19240010Ow.LIZ;
                        String str2 = nUAbilityNode.id;
                        c19240010Ow.getClass();
                        C19240010Ow.LIZ(str2);
                    } else {
                        c10nh = new C10MB(c1912470zrp, nUAbilityNode.filters);
                        arrayList.add(c10nh);
                    }
                    break;
                case -2056155769:
                    if (!str.equals("server_delay")) {
                        C19240010Ow c19240010Ow2 = C19240010Ow.LIZ;
                        String str22 = nUAbilityNode.id;
                        c19240010Ow2.getClass();
                        C19240010Ow.LIZ(str22);
                    } else {
                        final List<FilterAbilityModel> list = nUAbilityNode.filters;
                        c10nh = new C10NT<C1869040yjm>(list) { // from class: X.10NS
                            public final List<FilterAbilityModel> LIZLLL;

                            @Override // X.C10NF, X.C10ND
                            public final List<FilterAbilityModel> getFilters() {
                                return this.LIZLLL;
                            }

                            {
                                super(list, C10NW.JOURNEY_SERVER_DELAY_ID, "server_delay");
                                this.LIZLLL = list;
                            }

                            @Override // X.C10NJ
                            public final C10P7<C1869040yjm> LIZLLL(C1912470zrp c1912470zrp2, C10P6 c10p6) {
                                return new C19219010Gu(c1912470zrp2, c10p6);
                            }
                        };
                        arrayList.add(c10nh);
                    }
                    break;
                case -1980522643:
                    if (!str.equals("deep_link")) {
                        C19240010Ow c19240010Ow22 = C19240010Ow.LIZ;
                        String str222 = nUAbilityNode.id;
                        c19240010Ow22.getClass();
                        C19240010Ow.LIZ(str222);
                    } else {
                        final List<FilterAbilityModel> list2 = nUAbilityNode.filters;
                        c10nh = new C10NF<C1869040yjm>(c1912470zrp, list2) { // from class: X.10Nz
                            public final List<FilterAbilityModel> LIZLLL;
                            public final C1912470zrp LJ;

                            @Override // X.C10NF, X.C10ND
                            public final List<FilterAbilityModel> LIZ() {
                                FilterAbilityModel filterAbilityModel = C10OM.LIZ;
                                return C1697810uHb.LJIIJJI(C10OM.LJIIJ, C10OM.LJIIJJI);
                            }

                            @Override // X.C10NF, X.C10ND
                            public final C10QI LIZJ() {
                                C19233810Mm.LIZ.getClass();
                                return C19233810Mm.LIZ(C19234910Mx.class);
                            }

                            @Override // X.C10NF, X.C10ND
                            public final Boolean LJ() {
                                Intent intent;
                                if (C10OE.LIZIZ) {
                                    return Boolean.FALSE;
                                }
                                C10NB c10nb = this.LJ.LIZ.LJFF().LJ;
                                if (C10O0.LIZIZ((c10nb == null || (intent = c10nb.LIZIZ) == null) ? null : intent.getData())) {
                                    return Boolean.FALSE;
                                }
                                return null;
                            }

                            @Override // X.C10NF, X.C10ND
                            public final List<FilterAbilityModel> getFilters() {
                                return this.LIZLLL;
                            }

                            {
                                super(list2, C10NW.JOURNEY_DEEPLINK_ID, "deep_link");
                                this.LIZLLL = list2;
                                this.LJ = c1912470zrp;
                            }

                            @Override // X.C10NJ
                            public final C10P7<C1869040yjm> LIZLLL(C1912470zrp c1912470zrp2, C10P6 c10p6) {
                                return new C19242910Pz(c1912470zrp2, c10p6);
                            }
                        };
                        arrayList.add(c10nh);
                    }
                    break;
                case -1949717357:
                    if (!str.equals("interest_list")) {
                        C19240010Ow c19240010Ow222 = C19240010Ow.LIZ;
                        String str2222 = nUAbilityNode.id;
                        c19240010Ow222.getClass();
                        C19240010Ow.LIZ(str2222);
                    } else {
                        final List<FilterAbilityModel> list3 = nUAbilityNode.filters;
                        c10nh = new C10NF<C19242510Pv>(list3) { // from class: X.10O1
                            public final List<FilterAbilityModel> LIZLLL;

                            @Override // X.C10NF, X.C10ND
                            public final List<FilterAbilityModel> LIZ() {
                                FilterAbilityModel filterAbilityModel = C10OM.LIZ;
                                return C1697810uHb.LJIIJJI(C10OM.LIZIZ, C10OM.LIZJ);
                            }

                            @Override // X.C10NF, X.C10ND
                            public final Boolean LJ() {
                                return null;
                            }

                            @Override // X.C10NF, X.C10ND
                            public final C10QI LIZJ() {
                                C19233810Mm.LIZ.getClass();
                                return C19233810Mm.LIZ(C10HH.class);
                            }

                            @Override // X.C10NF, X.C10ND
                            public final List<FilterAbilityModel> getFilters() {
                                return this.LIZLLL;
                            }

                            {
                                super(list3, C10NW.JOURNEY_INTERESTS_ID, "interest_list");
                                this.LIZLLL = list3;
                            }

                            @Override // X.C10NJ
                            public final C10P7<C19242510Pv> LIZLLL(final C1912470zrp c1912470zrp2, final C10P6 c10p6) {
                                return new C10PJ<C19242510Pv>(c1912470zrp2, c10p6) { // from class: X.10O2
                                    @Override // X.C10P7
                                    public final C10NW type() {
                                        return C10NW.JOURNEY_INTERESTS_ID;
                                    }

                                    @Override // X.C10PJ
                                    public final NUJComponentFragment LJI(C1869040yjm c1869040yjm) {
                                        C19233810Mm.LIZ.getClass();
                                        C10HH c10hh = (C10HH) C19233810Mm.LIZ(C10HH.class);
                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                        sbLIZ.append("config: ");
                                        sbLIZ.append(c10hh);
                                        C1911410zq7.LIZ("InterestSelectComponent", C2188811AlT.LIZIZ(sbLIZ));
                                        String strLJFF = c10hh.LJFF();
                                        int iHashCode = strLJFF.hashCode();
                                        if (iHashCode != -1731964533) {
                                            if (iHashCode != -934356415) {
                                                if (iHashCode == -881377690 && strLJFF.equals("tablet")) {
                                                    return new TabletInterestSelectionComponent();
                                                }
                                            } else if (strLJFF.equals("revamp")) {
                                                return new InterestSelectionComponentRevampV1();
                                            }
                                        } else if (strLJFF.equals("single_line")) {
                                            return new InterestSelectionSingleLineComponent();
                                        }
                                        return new BaseInterestSelectionComponent();
                                    }
                                };
                            }
                        };
                        arrayList.add(c10nh);
                    }
                    break;
                case -1544064248:
                    if (!str.equals("consent_box_page")) {
                        C19240010Ow c19240010Ow2222 = C19240010Ow.LIZ;
                        String str22222 = nUAbilityNode.id;
                        c19240010Ow2222.getClass();
                        C19240010Ow.LIZ(str22222);
                    } else {
                        final List<FilterAbilityModel> list4 = nUAbilityNode.filters;
                        c10nh = new C10NF<C1869040yjm>(list4) { // from class: X.10NM
                            public final List<FilterAbilityModel> LIZLLL;

                            @Override // X.C10NF, X.C10ND
                            public final C10QI LIZJ() {
                                C19233810Mm.LIZ.getClass();
                                return C19233810Mm.LIZ(C19234110Mp.class);
                            }

                            @Override // X.C10NF, X.C10ND
                            public final Boolean LJ() {
                                String storeRegionUpperCase = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).getStoreRegionUpperCase();
                                if (Intrinsics.LJFF("KR", storeRegionUpperCase)) {
                                    return Boolean.FALSE;
                                }
                                if (!ComplianceServiceProvider.LJJIII().LJ()) {
                                    return Boolean.FALSE;
                                }
                                if (C294460BgS.LIZ() || !C1697810uHb.LJIIJJI("DE", "FR", "IT", "AT", "HU").contains(storeRegionUpperCase) || C102E.LIZ()) {
                                    return null;
                                }
                                return Boolean.FALSE;
                            }

                            @Override // X.C10NF, X.C10ND
                            public final List<FilterAbilityModel> getFilters() {
                                return this.LIZLLL;
                            }

                            {
                                super(list4, C10NW.JOURNEY_CONSENT_BOX_PAGE, "consent_box_page");
                                this.LIZLLL = list4;
                            }

                            @Override // X.C10NJ
                            public final C10P7<C1869040yjm> LIZLLL(C1912470zrp c1912470zrp2, C10P6 c10p6) {
                                return new C1912550zrx(c1912470zrp2, c10p6);
                            }
                        };
                        arrayList.add(c10nh);
                    }
                    break;
                case -1408137122:
                    if (!str.equals("content_language")) {
                        C19240010Ow c19240010Ow22222 = C19240010Ow.LIZ;
                        String str222222 = nUAbilityNode.id;
                        c19240010Ow22222.getClass();
                        C19240010Ow.LIZ(str222222);
                    } else {
                        final List<FilterAbilityModel> list5 = nUAbilityNode.filters;
                        c10nh = new C10NF<C10Q1>(list5) { // from class: X.10Nx
                            public final List<FilterAbilityModel> LIZLLL;
                            public final C01GW LJ;

                            @Override // X.C10NF, X.C10ND
                            public final C10QI LIZJ() {
                                C19233810Mm.LIZ.getClass();
                                return C19233810Mm.LIZ(C19234710Mv.class);
                            }

                            @Override // X.C10NF, X.C10ND
                            public final Boolean LJ() {
                                if (C19248710Sf.LIZIZ.LJIIJJI()) {
                                    return Boolean.FALSE;
                                }
                                if (((Boolean) this.LJ.getValue()).booleanValue()) {
                                    IKMPNewUserJourneyService iKMPNewUserJourneyService = (IKMPNewUserJourneyService) PluggableExtentionKt.pluggableSpi$default(IKMPNewUserJourneyService.class, false, false, false, 14, null);
                                    if (iKMPNewUserJourneyService != null) {
                                        iKMPNewUserJourneyService.LIZIZ();
                                        Boolean boolLIZ = C10R7.LIZ();
                                        if (boolLIZ != null) {
                                            return boolLIZ;
                                        }
                                    }
                                } else {
                                    C10PO.LIZ.getClass();
                                    C1912470zrp c1912470zrpLIZ = C10PO.LIZ();
                                    if (c1912470zrpLIZ == null || c1912470zrpLIZ.LIZ(C10NW.JOURNEY_CONTENTLANGUAGE_ID) == null) {
                                        return Boolean.FALSE;
                                    }
                                }
                                return null;
                            }

                            @Override // X.C10NF, X.C10ND
                            public final List<FilterAbilityModel> getFilters() {
                                return this.LIZLLL;
                            }

                            {
                                super(list5, C10NW.JOURNEY_CONTENTLANGUAGE_ID, "content_language");
                                this.LIZLLL = list5;
                                this.LJ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(687));
                            }

                            @Override // X.C10NJ
                            public final C10P7<C10Q1> LIZLLL(final C1912470zrp c1912470zrp2, final C10P6 c10p6) {
                                final boolean zBooleanValue = ((Boolean) this.LJ.getValue()).booleanValue();
                                return new C10PJ<C10Q1>(c1912470zrp2, c10p6, zBooleanValue) { // from class: X.10Py
                                    public final boolean LJI;

                                    @Override // X.C10P7
                                    public final C10NW type() {
                                        return C10NW.JOURNEY_CONTENTLANGUAGE_ID;
                                    }

                                    /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
                                    @Override // X.C10PJ
                                    /*
                                        Code decompiled incorrectly, please refer to instructions dump.
                                        To view partially-correct add '--show-bad-code' argument
                                    */
                                    public final com.ss.android.ugc.aweme.refactor.integration.NUJComponentFragment LJI(X.C1869040yjm r11) {
                                        /*
                                            r10 = this;
                                            X.10Q1 r11 = (X.C10Q1) r11
                                            com.ss.android.ugc.aweme.journey.step.contentlanguage.ContentLanguageFragment r6 = new com.ss.android.ugc.aweme.journey.step.contentlanguage.ContentLanguageFragment
                                            boolean r0 = r10.LJI
                                            if (r0 == 0) goto L23
                                            java.lang.Class<com.tiktok.kmp.nuj.IKMPNewUserJourneyService> r0 = com.tiktok.kmp.nuj.IKMPNewUserJourneyService.class
                                            r1 = 0
                                            r4 = 14
                                            r5 = 0
                                            r2 = r1
                                            r3 = r1
                                            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r0, r1, r2, r3, r4, r5)
                                            com.tiktok.kmp.nuj.IKMPNewUserJourneyService r0 = (com.tiktok.kmp.nuj.IKMPNewUserJourneyService) r0
                                            if (r0 == 0) goto L5b
                                            r0.LIZIZ()
                                            X.10RJ r9 = X.C10R7.LIZJ()
                                        L1f:
                                            r6.<init>(r9)
                                            return r6
                                        L23:
                                            if (r11 == 0) goto L5b
                                            X.10Px r1 = r11.LIZIZ
                                            if (r1 == 0) goto L5b
                                            X.10RJ r9 = new X.10RJ
                                            com.ss.android.ugc.aweme.plugin.journey.JourneyContentLanguageExtra r0 = r1.LIZIZ
                                            java.lang.String r8 = r0.title
                                            java.lang.String r7 = r0.text
                                            java.util.List<com.ss.android.ugc.aweme.plugin.journey.JourneyContentLanguage> r0 = r1.LIZ
                                            java.util.ArrayList r5 = new java.util.ArrayList
                                            r5.<init>()
                                            java.util.Iterator r4 = r0.iterator()
                                        L3c:
                                            boolean r0 = r4.hasNext()
                                            if (r0 == 0) goto L57
                                            java.lang.Object r0 = r4.next()
                                            com.ss.android.ugc.aweme.plugin.journey.JourneyContentLanguage r0 = (com.ss.android.ugc.aweme.plugin.journey.JourneyContentLanguage) r0
                                            X.10Rm r3 = new X.10Rm
                                            java.lang.String r2 = r0.code
                                            java.lang.String r1 = r0.en_name
                                            java.lang.String r0 = r0.local_name
                                            r3.<init>(r2, r1, r0)
                                            r5.add(r3)
                                            goto L3c
                                        L57:
                                            r9.<init>(r8, r7, r5)
                                            goto L1f
                                        L5b:
                                            r9 = 0
                                            goto L1f
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: X.C19242810Py.LJI(X.0yjm):com.ss.android.ugc.aweme.refactor.integration.NUJComponentFragment");
                                    }

                                    {
                                        this.LJI = zBooleanValue;
                                    }
                                };
                            }
                        };
                        arrayList.add(c10nh);
                    }
                    break;
                case -1268691127:
                    if (!str.equals("slogan_consent_box_page")) {
                        C19240010Ow c19240010Ow222222 = C19240010Ow.LIZ;
                        String str2222222 = nUAbilityNode.id;
                        c19240010Ow222222.getClass();
                        C19240010Ow.LIZ(str2222222);
                    } else {
                        final List<FilterAbilityModel> list6 = nUAbilityNode.filters;
                        c10nh = new C10NT<C1869040yjm>(list6) { // from class: X.10NR
                            public final List<FilterAbilityModel> LIZLLL;

                            @Override // X.C10NF, X.C10ND
                            public final C10QI LIZJ() {
                                C19233810Mm.LIZ.getClass();
                                return C19233810Mm.LIZ(C10N5.class);
                            }

                            @Override // X.C10NF, X.C10ND
                            public final List<FilterAbilityModel> getFilters() {
                                return this.LIZLLL;
                            }

                            {
                                super(list6, C10NW.JOURNEY_SLOGAN_AND_CONSENT_PAGE, "slogan_consent_box_page");
                                this.LIZLLL = list6;
                            }

                            @Override // X.C10NJ
                            public final C10P7<C1869040yjm> LIZLLL(C1912470zrp c1912470zrp2, C10P6 c10p6) {
                                return new C1912530zrv(c1912470zrp2, c10p6);
                            }
                        };
                        arrayList.add(c10nh);
                    }
                    break;
                case -958057003:
                    if (!str.equals("skippable_login")) {
                        C19240010Ow c19240010Ow2222222 = C19240010Ow.LIZ;
                        String str22222222 = nUAbilityNode.id;
                        c19240010Ow2222222.getClass();
                        C19240010Ow.LIZ(str22222222);
                    } else {
                        final List<FilterAbilityModel> list7 = nUAbilityNode.filters;
                        c10nh = new C10NF<C1869020yjk>(list7) { // from class: X.10O9
                            public final List<FilterAbilityModel> LIZLLL;

                            @Override // X.C10NF, X.C10ND
                            public final List<FilterAbilityModel> LIZ() {
                                FilterAbilityModel filterAbilityModel = C10OM.LIZ;
                                return C1697810uHb.LJIIJJI(C10OM.LIZLLL, C10OM.LJ);
                            }

                            @Override // X.C10NF, X.C10ND
                            public final Boolean LJ() {
                                return null;
                            }

                            @Override // X.C10NF, X.C10ND
                            public final C10QI LIZJ() {
                                C19233810Mm.LIZ.getClass();
                                return C19233810Mm.LIZ(C19235110Mz.class);
                            }

                            @Override // X.C10NF, X.C10ND
                            public final Pair<String, Boolean> LJFF() {
                                Pair<String, Boolean> pairLIZJ = C10NE.LIZJ(this);
                                if (!pairLIZJ.getSecond().booleanValue()) {
                                    C10OB.LIZ.getClass();
                                    if (C10OB.LIZIZ.length() == 0) {
                                        C10OB.LIZIZ("only_consentbox");
                                    }
                                    C10OB.LIZ();
                                }
                                return pairLIZJ;
                            }

                            @Override // X.C10NF, X.C10ND
                            public final List<FilterAbilityModel> getFilters() {
                                return this.LIZLLL;
                            }

                            {
                                super(list7, C10NW.JOURNEY_SKIPPABLE_LOGIN, "skippable_login");
                                this.LIZLLL = list7;
                            }

                            @Override // X.C10NJ
                            public final C10P7<C1869020yjk> LIZLLL(C1912470zrp c1912470zrp2, C10P6 c10p6) {
                                return new C19241010Pg(c1912470zrp2, c10p6);
                            }
                        };
                        arrayList.add(c10nh);
                    }
                    break;
                case -748824496:
                    if (!str.equals("slogan_page")) {
                        C19240010Ow c19240010Ow22222222 = C19240010Ow.LIZ;
                        String str222222222 = nUAbilityNode.id;
                        c19240010Ow22222222.getClass();
                        C19240010Ow.LIZ(str222222222);
                    } else {
                        final List<FilterAbilityModel> list8 = nUAbilityNode.filters;
                        c10nh = new C10NF<C1869040yjm>(list8) { // from class: X.10NI
                            public final List<FilterAbilityModel> LIZLLL;

                            @Override // X.C10NF, X.C10ND
                            public final List<FilterAbilityModel> getFilters() {
                                return this.LIZLLL;
                            }

                            {
                                super(list8, C10NW.JOURNEY_SLOGAN_ID, "slogan_page");
                                this.LIZLLL = list8;
                            }

                            @Override // X.C10NJ
                            public final C10P7<C1869040yjm> LIZLLL(C1912470zrp c1912470zrp2, C10P6 c10p6) {
                                return new C1912520zru(c1912470zrp2, c10p6);
                            }
                        };
                        arrayList.add(c10nh);
                    }
                    break;
                case -574896199:
                    if (!str.equals("ad_subscription")) {
                        C19240010Ow c19240010Ow222222222 = C19240010Ow.LIZ;
                        String str2222222222 = nUAbilityNode.id;
                        c19240010Ow222222222.getClass();
                        C19240010Ow.LIZ(str2222222222);
                    } else {
                        final List<FilterAbilityModel> list9 = nUAbilityNode.filters;
                        c10nh = new C10NF<C1917230zzV>(list9) { // from class: X.10NX
                            public final List<FilterAbilityModel> LIZLLL;

                            @Override // X.C10NF, X.C10ND
                            public final List<FilterAbilityModel> LIZ() {
                                FilterAbilityModel filterAbilityModel = C10OM.LIZ;
                                return C1697810uHb.LJIIJJI(C10OM.LJIIIIZZ, C10OM.LJII);
                            }

                            @Override // X.C10NF, X.C10ND
                            public final Boolean LJ() {
                                return null;
                            }

                            @Override // X.C10NF, X.C10ND
                            public final C10QI LIZJ() {
                                C19233810Mm.LIZ.getClass();
                                return C19233810Mm.LIZ(C19234310Mr.class);
                            }

                            @Override // X.C10NF, X.C10ND
                            public final List<FilterAbilityModel> getFilters() {
                                return this.LIZLLL;
                            }

                            {
                                super(list9, C10NW.JOURNEY_PICK_YOUR_PLAN_SUBSCRIPTION, "ad_subscription");
                                this.LIZLLL = list9;
                            }

                            @Override // X.C10NJ
                            public final C10P7<C1917230zzV> LIZLLL(C1912470zrp c1912470zrp2, C10P6 c10p6) {
                                return new C10P5<C1917230zzV>(c1912470zrp2, c10p6) { // from class: X.0zzU
                                    @Override // X.C10P7
                                    public final C10NW type() {
                                        return C10NW.JOURNEY_PICK_YOUR_PLAN_SUBSCRIPTION;
                                    }

                                    @Override // X.C10P5, X.C10P7
                                    public final void LIZLLL(C1912470zrp c1912470zrp3, C1869040yjm c1869040yjm, Function1 function1) {
                                        PickYourAdPlanPage pickYourAdPlanPage;
                                        OfferInfo offerInfo;
                                        ProductInfo productInfo;
                                        String str3;
                                        C1917230zzV c1917230zzV = (C1917230zzV) c1869040yjm;
                                        super.LIZLLL(c1912470zrp3, c1917230zzV, function1);
                                        C1912470zrp c1912470zrp4 = this.LIZ;
                                        C10H4 c10h4 = c1912470zrp4.LIZ;
                                        if (TextUtils.isEmpty(DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId())) {
                                            LJ();
                                        }
                                        IComplianceService iComplianceServiceLJIILIIL = ComplianceServiceProvider.LJIILIIL();
                                        if (c1917230zzV != null && (pickYourAdPlanPage = c1917230zzV.LIZIZ) != null) {
                                            List<OfferInfo> offerInfo2 = pickYourAdPlanPage.getOfferInfo();
                                            if (offerInfo2 != null && (offerInfo = (OfferInfo) ListProtector.get(offerInfo2, 1)) != null && (productInfo = offerInfo.productInfo) != null && (str3 = productInfo.productId) != null) {
                                                iComplianceServiceLJIILIIL.LJIIIZ(str3, c1917230zzV.LIZJ, new C1917100zzI(iComplianceServiceLJIILIIL, pickYourAdPlanPage, this, c10h4, c1912470zrp4), c10h4.LIZIZ());
                                                return;
                                            } else {
                                                LJ();
                                                return;
                                            }
                                        }
                                        LJ();
                                    }
                                };
                            }
                        };
                        arrayList.add(c10nh);
                    }
                    break;
                case -551745661:
                    if (!str.equals("free_trial")) {
                        C19240010Ow c19240010Ow2222222222 = C19240010Ow.LIZ;
                        String str22222222222 = nUAbilityNode.id;
                        c19240010Ow2222222222.getClass();
                        C19240010Ow.LIZ(str22222222222);
                    } else {
                        final List<FilterAbilityModel> list10 = nUAbilityNode.filters;
                        c10nh = new C10NF<C1917140zzM>(list10) { // from class: X.10NY
                            public final List<FilterAbilityModel> LIZLLL;

                            @Override // X.C10NF, X.C10ND
                            public final List<FilterAbilityModel> LIZ() {
                                FilterAbilityModel filterAbilityModel = C10OM.LIZ;
                                return C1697810uHb.LJIIJJI(C10OM.LJIIIZ, C10OM.LJII);
                            }

                            @Override // X.C10NF, X.C10ND
                            public final Boolean LJ() {
                                return null;
                            }

                            @Override // X.C10NF, X.C10ND
                            public final C10QI LIZJ() {
                                C19233810Mm.LIZ.getClass();
                                return C19233810Mm.LIZ(C19234810Mw.class);
                            }

                            @Override // X.C10NF, X.C10ND
                            public final List<FilterAbilityModel> getFilters() {
                                return this.LIZLLL;
                            }

                            {
                                super(list10, C10NW.JOURNEY_AD_FREE_TRIAL_SUBSCRIPTION, "free_trial");
                                this.LIZLLL = list10;
                            }

                            @Override // X.C10NJ
                            public final C10P7<C1917140zzM> LIZLLL(C1912470zrp c1912470zrp2, C10P6 c10p6) {
                                return new C10P5<C1917140zzM>(c1912470zrp2, c10p6) { // from class: X.0zzL
                                    @Override // X.C10P7
                                    public final C10NW type() {
                                        return C10NW.JOURNEY_AD_FREE_TRIAL_SUBSCRIPTION;
                                    }

                                    /* JADX WARN: Multi-variable type inference failed */
                                    /* JADX WARN: Type inference failed for: r0v1, types: [X.0zzK] */
                                    @Override // X.C10P5, X.C10P7
                                    public final void LIZLLL(C1912470zrp c1912470zrp3, C1869040yjm c1869040yjm, Function1 function1) {
                                        AdFreeTrialPageInfo adFreeTrialPageInfo;
                                        C1917140zzM c1917140zzM = (C1917140zzM) c1869040yjm;
                                        super.LIZLLL(c1912470zrp3, c1917140zzM, function1);
                                        C10H4 c10h4 = this.LIZ.LIZ;
                                        IComplianceService iComplianceServiceLJIILIIL = ComplianceServiceProvider.LJIILIIL();
                                        if (c1917140zzM != null && (adFreeTrialPageInfo = c1917140zzM.LIZIZ) != null) {
                                            Fragment fragmentLJJJJL = iComplianceServiceLJIILIIL.LJJJJL(new C0TNG() { // from class: X.0zzK
                                                @Override // X.C0TNG
                                                public final void LIZ() {
                                                    C1911410zq7.LIZ("NewFreeTrialComponent", "end subscription flow");
                                                    LJ();
                                                }
                                            }, adFreeTrialPageInfo);
                                            C1848530yCh.LIZLLL(this, "page_nuj_ad_free_trial", null);
                                            c10h4.LJ().invoke(fragmentLJJJJL, Boolean.TRUE);
                                            return;
                                        }
                                        LJ();
                                    }
                                };
                            }
                        };
                        arrayList.add(c10nh);
                    }
                    break;
                case -533399590:
                    if (!str.equals("m2_one_tap_login")) {
                        C19240010Ow c19240010Ow22222222222 = C19240010Ow.LIZ;
                        String str222222222222 = nUAbilityNode.id;
                        c19240010Ow22222222222.getClass();
                        C19240010Ow.LIZ(str222222222222);
                    } else {
                        final List<FilterAbilityModel> list11 = nUAbilityNode.filters;
                        c10nh = new C10NF<C1869040yjm>(list11) { // from class: X.10Nb
                            public final List<FilterAbilityModel> LIZLLL;

                            @Override // X.C10NF, X.C10ND
                            public final Boolean LJ() {
                                INewUserJourneyAppDiffService iNewUserJourneyAppDiffService = (INewUserJourneyAppDiffService) PluggableExtentionKt.pluggableSpi$default(INewUserJourneyAppDiffService.class, false, false, false, 14, null);
                                if (iNewUserJourneyAppDiffService != null) {
                                    iNewUserJourneyAppDiffService.LIZ();
                                }
                                return false;
                            }

                            @Override // X.C10NF, X.C10ND
                            public final List<FilterAbilityModel> getFilters() {
                                return this.LIZLLL;
                            }

                            {
                                super(list11, C10NW.JOURNEY_M2_ONE_TAP_LOGIN_ID, "m2_one_tap_login");
                                this.LIZLLL = list11;
                            }

                            @Override // X.C10NJ
                            public final C10P7<C1869040yjm> LIZLLL(final C1912470zrp c1912470zrp2, final C10P6 c10p6) {
                                return new C10P5<C1869040yjm>(c1912470zrp2, c10p6) { // from class: X.10Nj
                                    @Override // X.C10P7
                                    public final C10NW type() {
                                        return C10NW.JOURNEY_M2_ONE_TAP_LOGIN_ID;
                                    }

                                    @Override // X.C10P5, X.C10P7
                                    public final void LIZLLL(C1912470zrp c1912470zrp3, C1869040yjm c1869040yjm, Function1<? super C19240810Pe, Unit> function1) {
                                        Fragment mu2LoginWrapFragment;
                                        super.LIZLLL(c1912470zrp3, c1869040yjm, function1);
                                        INewUserJourneyAppDiffService iNewUserJourneyAppDiffService = (INewUserJourneyAppDiffService) PluggableExtentionKt.pluggableSpi$default(INewUserJourneyAppDiffService.class, false, false, false, 14, null);
                                        if (iNewUserJourneyAppDiffService != null) {
                                            iNewUserJourneyAppDiffService.LIZ();
                                        }
                                        C19334810kc c19334810kc = new C19334810kc(this, 1);
                                        ILoginServiceAppDiff iLoginServiceAppDiff = (ILoginServiceAppDiff) PluggableExtentionKt.pluggableSpi$default(ILoginServiceAppDiff.class, false, false, false, 14, null);
                                        if (iLoginServiceAppDiff != null && (mu2LoginWrapFragment = iLoginServiceAppDiff.getMu2LoginWrapFragment(c19334810kc)) != null) {
                                            this.LIZ.LIZ.LJ().invoke(mu2LoginWrapFragment, Boolean.TRUE);
                                        }
                                    }
                                };
                            }
                        };
                        arrayList.add(c10nh);
                    }
                    break;
                case -118177372:
                    if (!str.equals("consent_box_page_hu")) {
                        C19240010Ow c19240010Ow222222222222 = C19240010Ow.LIZ;
                        String str2222222222222 = nUAbilityNode.id;
                        c19240010Ow222222222222.getClass();
                        C19240010Ow.LIZ(str2222222222222);
                    } else {
                        final List<FilterAbilityModel> list12 = nUAbilityNode.filters;
                        c10nh = new C10NF<C1869040yjm>(list12) { // from class: X.10NN
                            public final List<FilterAbilityModel> LIZLLL;

                            @Override // X.C10NF, X.C10ND
                            public final C10QI LIZJ() {
                                C19233810Mm.LIZ.getClass();
                                return C19233810Mm.LIZ(C19234110Mp.class);
                            }

                            @Override // X.C10NF, X.C10ND
                            public final Boolean LJ() {
                                if (!ComplianceServiceProvider.LJJIII().LJ()) {
                                    return Boolean.FALSE;
                                }
                                if (C294460BgS.LIZ()) {
                                    return Boolean.FALSE;
                                }
                                IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
                                if (Intrinsics.LJFF(iAccountService != null ? iAccountService.getStoreRegionUpperCase() : null, "HU") && C102E.LIZ()) {
                                    return null;
                                }
                                return Boolean.FALSE;
                            }

                            @Override // X.C10NF, X.C10ND
                            public final List<FilterAbilityModel> getFilters() {
                                return this.LIZLLL;
                            }

                            {
                                super(list12, C10NW.JOURNEY_CONSENT_BOX_PAGE_HU, "consent_box_page_hu");
                                this.LIZLLL = list12;
                            }

                            @Override // X.C10NJ
                            public final C10P7<C1869040yjm> LIZLLL(C1912470zrp c1912470zrp2, C10P6 c10p6) {
                                return new C1912550zrx(c1912470zrp2, c10p6);
                            }
                        };
                        arrayList.add(c10nh);
                    }
                    break;
                case -88919616:
                    if (!str.equals("swipe_up")) {
                        C19240010Ow c19240010Ow2222222222222 = C19240010Ow.LIZ;
                        String str22222222222222 = nUAbilityNode.id;
                        c19240010Ow2222222222222.getClass();
                        C19240010Ow.LIZ(str22222222222222);
                    } else {
                        final List<FilterAbilityModel> list13 = nUAbilityNode.filters;
                        c10nh = new C10NF<C1869040yjm>(c1912470zrp, list13) { // from class: X.10PY
                            public final List<FilterAbilityModel> LIZLLL;
                            public final C1912470zrp LJ;

                            /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
                            @Override // X.C10NF, X.C10ND
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final java.lang.Boolean LJ() {
                                /*
                                    Method dump skipped, instruction units count: 218
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: X.C10PY.LJ():java.lang.Boolean");
                            }

                            @Override // X.C10NF, X.C10ND
                            public final List<FilterAbilityModel> getFilters() {
                                return this.LIZLLL;
                            }

                            {
                                super(list13, C10NW.JOURNEY_SWIPE_UP_ID, "swipe_up");
                                this.LIZLLL = list13;
                                this.LJ = c1912470zrp;
                            }

                            @Override // X.C10NJ
                            public final C10P7<C1869040yjm> LIZLLL(C1912470zrp c1912470zrp2, C10P6 c10p6) {
                                return new C10PJ<C1869040yjm>(c1912470zrp2, c10p6) { // from class: X.10PN
                                    @Override // X.C10P7
                                    public final C10NW type() {
                                        return C10NW.JOURNEY_SWIPE_UP_ID;
                                    }

                                    @Override // X.C10PJ
                                    public final NUJComponentFragment LJI(C1869040yjm c1869040yjm) {
                                        String strLIZLLL;
                                        NUJComponentFragment swipeUpVideoComponent;
                                        C10TH c10thLIZ = C19247010Ro.LIZ();
                                        if (c10thLIZ != null) {
                                            strLIZLLL = c10thLIZ.LIZLLL();
                                        } else {
                                            strLIZLLL = null;
                                        }
                                        if (Intrinsics.LJFF(strLIZLLL, "revamp")) {
                                            swipeUpVideoComponent = new NujRevampSwipeUpComponent();
                                        } else {
                                            swipeUpVideoComponent = new SwipeUpVideoComponent();
                                        }
                                        InterfaceC19236310Nl interfaceC19236310Nl = (InterfaceC19236310Nl) this.LIZ.LIZIZ(InterfaceC19236310Nl.class);
                                        if (interfaceC19236310Nl != null) {
                                            interfaceC19236310Nl.ki2();
                                        }
                                        InterfaceC19236310Nl interfaceC19236310Nl2 = (InterfaceC19236310Nl) this.LIZ.LIZIZ(InterfaceC19236310Nl.class);
                                        if (interfaceC19236310Nl2 != null) {
                                            interfaceC19236310Nl2.L32();
                                        }
                                        return swipeUpVideoComponent;
                                    }

                                    @Override // X.C10PJ, X.C10P5, X.C10P7
                                    public final void LIZLLL(C1912470zrp c1912470zrp3, C1869040yjm c1869040yjm, Function1<? super C19240810Pe, Unit> function1) {
                                        InterfaceC19236310Nl interfaceC19236310Nl = (InterfaceC19236310Nl) this.LIZ.LIZIZ(InterfaceC19236310Nl.class);
                                        if (interfaceC19236310Nl != null) {
                                            interfaceC19236310Nl.ki2();
                                        }
                                        InterfaceC19236310Nl interfaceC19236310Nl2 = (InterfaceC19236310Nl) this.LIZ.LIZIZ(InterfaceC19236310Nl.class);
                                        if (interfaceC19236310Nl2 != null) {
                                            interfaceC19236310Nl2.L32();
                                        }
                                        this.LIZ.LIZ.LIZJ();
                                        super.LIZLLL(c1912470zrp3, c1869040yjm, function1);
                                    }
                                };
                            }
                        };
                        arrayList.add(c10nh);
                    }
                    break;
                case 103149417:
                    if (!str.equals("login")) {
                        C19240010Ow c19240010Ow22222222222222 = C19240010Ow.LIZ;
                        String str222222222222222 = nUAbilityNode.id;
                        c19240010Ow22222222222222.getClass();
                        C19240010Ow.LIZ(str222222222222222);
                    } else {
                        final List<FilterAbilityModel> list14 = nUAbilityNode.filters;
                        c10nh = new C10NF<C1869020yjk>(list14) { // from class: X.10OA
                            public final List<FilterAbilityModel> LIZLLL;

                            @Override // X.C10NF, X.C10ND
                            public final List<FilterAbilityModel> LIZ() {
                                FilterAbilityModel filterAbilityModel = C10OM.LIZ;
                                return C1697810uHb.LJIIJJI(C10OM.LIZLLL, C10OM.LJ);
                            }

                            @Override // X.C10NF, X.C10ND
                            public final Boolean LJ() {
                                return null;
                            }

                            @Override // X.C10NF, X.C10ND
                            public final C10QI LIZJ() {
                                C19233810Mm.LIZ.getClass();
                                return C19233810Mm.LIZ(C19235010My.class);
                            }

                            @Override // X.C10NF, X.C10ND
                            public final Pair<String, Boolean> LJFF() {
                                Pair<String, Boolean> pairLIZJ = C10NE.LIZJ(this);
                                if (!pairLIZJ.getSecond().booleanValue()) {
                                    C10OB.LIZ.getClass();
                                    if (C10OB.LIZIZ.length() == 0) {
                                        C10OB.LIZIZ("only_consentbox");
                                    }
                                    C10OB.LIZ();
                                }
                                return pairLIZJ;
                            }

                            @Override // X.C10NF, X.C10ND
                            public final List<FilterAbilityModel> getFilters() {
                                return this.LIZLLL;
                            }

                            {
                                super(list14, C10NW.JOURNEY_LOGIN_ID, "login");
                                this.LIZLLL = list14;
                            }

                            @Override // X.C10NJ
                            public final C10P7<C1869020yjk> LIZLLL(C1912470zrp c1912470zrp2, C10P6 c10p6) {
                                return new C19241010Pg(c1912470zrp2, c10p6);
                            }
                        };
                        arrayList.add(c10nh);
                    }
                    break;
                case 305197373:
                    if (!str.equals("ad_choice")) {
                        C19240010Ow c19240010Ow222222222222222 = C19240010Ow.LIZ;
                        String str2222222222222222 = nUAbilityNode.id;
                        c19240010Ow222222222222222.getClass();
                        C19240010Ow.LIZ(str2222222222222222);
                    } else {
                        final List<FilterAbilityModel> list15 = nUAbilityNode.filters;
                        c10nh = new C10NF<C10Q5>(list15) { // from class: X.10NZ
                            public final List<FilterAbilityModel> LIZLLL;

                            @Override // X.C10NF, X.C10ND
                            public final Boolean LJ() {
                                return null;
                            }

                            @Override // X.C10NF, X.C10ND
                            public final List<FilterAbilityModel> LIZ() {
                                FilterAbilityModel filterAbilityModel = C10OM.LIZ;
                                return Collections.singletonList(C10OM.LJI);
                            }

                            @Override // X.C10NF, X.C10ND
                            public final C10QI LIZJ() {
                                C19233810Mm.LIZ.getClass();
                                return C19233810Mm.LIZ(C19234210Mq.class);
                            }

                            @Override // X.C10NF, X.C10ND
                            public final List<FilterAbilityModel> getFilters() {
                                return this.LIZLLL;
                            }

                            {
                                super(list15, C10NW.JOURNEY_CONSISTENT_CONTENT_AD_CHOICE, "ad_choice");
                                this.LIZLLL = list15;
                            }

                            @Override // X.C10NJ
                            public final C10P7<C10Q5> LIZLLL(C1912470zrp c1912470zrp2, C10P6 c10p6) {
                                return new C10P5<C10Q5>(c1912470zrp2, c10p6) { // from class: X.10Ni
                                    public final C01GW LJFF = C452501pT.LIZIZ(new AwS572S0100000_28(this, 16));

                                    @Override // X.C10P7
                                    public final C10NW type() {
                                        return C10NW.JOURNEY_CONSISTENT_CONTENT_AD_CHOICE;
                                    }

                                    @Override // X.C10P5, X.C10P7
                                    public final void LIZLLL(C1912470zrp c1912470zrp3, C1869040yjm c1869040yjm, Function1 function1) {
                                        super.LIZLLL(c1912470zrp3, c1869040yjm, function1);
                                        ConsistentContentAndAdChoiceFragment consistentContentAndAdChoiceFragmentLJ = ((IConsistentContentAndAdChoiceService) this.LJFF.getValue()).LJ();
                                        if (consistentContentAndAdChoiceFragmentLJ == null) {
                                            LJ();
                                        } else {
                                            C1848530yCh.LIZIZ("page_nuj_personalized_experience", null, 126);
                                            c1912470zrp3.LIZ.LJ().invoke(consistentContentAndAdChoiceFragmentLJ, Boolean.TRUE);
                                        }
                                    }
                                };
                            }
                        };
                        arrayList.add(c10nh);
                    }
                    break;
                case 469878770:
                    if (!str.equals("second_push_popup")) {
                        C19240010Ow c19240010Ow2222222222222222 = C19240010Ow.LIZ;
                        String str22222222222222222 = nUAbilityNode.id;
                        c19240010Ow2222222222222222.getClass();
                        C19240010Ow.LIZ(str22222222222222222);
                    } else {
                        final List<FilterAbilityModel> list16 = nUAbilityNode.filters;
                        c10nh = new AbstractC19239910Ov(list16) { // from class: X.10MJ
                            public final List<FilterAbilityModel> LIZLLL;
                            public final C01GW LJ;

                            @Override // X.AbstractC19239910Ov, X.C10ND
                            public final Boolean LJ() {
                                return null;
                            }

                            @Override // X.AbstractC19239910Ov, X.C10ND
                            public final C10QI LIZJ() {
                                C19233810Mm.LIZ.getClass();
                                return C19233810Mm.LIZ(C10N3.class);
                            }

                            @Override // X.AbstractC19239910Ov
                            public final void LJI() {
                                C10PP c10pp;
                                C1912470zrp c1912470zrpContext;
                                C10H4 c10h4;
                                IPushPermissionApi iPushPermissionApi = (IPushPermissionApi) ServiceManager.get().getService(IPushPermissionApi.class);
                                C10PO.LIZ.getClass();
                                C10P6 c10p6 = C10PO.LIZIZ;
                                C19EG c19egLIZIZ = (c10p6 == null || (c10pp = c10p6.LIZIZ.LIZ) == null || (c1912470zrpContext = c10pp.context()) == null || (c10h4 = c1912470zrpContext.LIZ) == null) ? null : c10h4.LIZIZ();
                                C10P6 c10p62 = C10PO.LIZIZ;
                                String str3 = c10p62 != null ? c10p62.LIZIZ.LJII : null;
                                if (C13LP.LJJJJ(str3, C1697810uHb.LJIIJJI("content_language", "swipe_up")) && iPushPermissionApi.LJIJ(C1BWL.LIZ())) {
                                    int iLJIIL = iPushPermissionApi.LJIIL();
                                    if (iLJIIL == 1) {
                                        int i = C2187451AjH.LIZ;
                                        if (C13LP.LJJJJ(str3, C1697810uHb.LJIIJJI("content_language", "swipe_up"))) {
                                            if (c19egLIZIZ != null) {
                                                ((INUJPushService) this.LJ.getValue()).LIZIZ(c19egLIZIZ);
                                            }
                                            this.LIZIZ = true;
                                        }
                                    } else if (iLJIIL != 2) {
                                        int i2 = C2187451AjH.LIZ;
                                    } else {
                                        int i3 = C2187451AjH.LIZ;
                                        if (!((INUJPushService) this.LJ.getValue()).LJ()) {
                                            ((INUJPushService) this.LJ.getValue()).LJII();
                                        }
                                        this.LIZIZ = true;
                                    }
                                }
                                C10MF c10mf = this.LIZJ;
                                if (c10mf != null) {
                                    c10mf.onEnd();
                                }
                            }

                            @Override // X.C10ND
                            public final List<FilterAbilityModel> getFilters() {
                                return this.LIZLLL;
                            }

                            {
                                super("second_push_popup");
                                this.LIZLLL = list16;
                                this.LJ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(600));
                            }
                        };
                        arrayList.add(c10nh);
                    }
                    break;
                case 632562545:
                    if (!str.equals("private_account")) {
                        C19240010Ow c19240010Ow22222222222222222 = C19240010Ow.LIZ;
                        String str222222222222222222 = nUAbilityNode.id;
                        c19240010Ow22222222222222222.getClass();
                        C19240010Ow.LIZ(str222222222222222222);
                    } else {
                        final List<FilterAbilityModel> list17 = nUAbilityNode.filters;
                        c10nh = new C10NF<C1869040yjm>(list17) { // from class: X.10Nc
                            public final List<FilterAbilityModel> LIZLLL;

                            @Override // X.C10NF, X.C10ND
                            public final Boolean LJ() {
                                return null;
                            }

                            @Override // X.C10NF, X.C10ND
                            public final C10QI LIZJ() {
                                C19233810Mm.LIZ.getClass();
                                return C19233810Mm.LIZ(C10N1.class);
                            }

                            @Override // X.C10NF, X.C10ND
                            public final List<FilterAbilityModel> getFilters() {
                                return this.LIZLLL;
                            }

                            {
                                super(list17, C10NW.JOURNEY_PRIVATE_ACCOUNT_TIPS_ID, "private_account");
                                this.LIZLLL = list17;
                            }

                            @Override // X.C10NJ
                            public final C10P7<C1869040yjm> LIZLLL(final C1912470zrp c1912470zrp2, final C10P6 c10p6) {
                                return new C10PJ<C1869040yjm>(c1912470zrp2, c10p6) { // from class: X.10Nd
                                    @Override // X.C10P7
                                    public final C10NW type() {
                                        return C10NW.JOURNEY_PRIVATE_ACCOUNT_TIPS_ID;
                                    }

                                    @Override // X.C10PJ
                                    public final NUJComponentFragment LJI(C1869040yjm c1869040yjm) {
                                        return new PrivateAccountTipsFragment();
                                    }

                                    @Override // X.C10PJ, X.C10P5, X.C10P7
                                    public final void LIZLLL(C1912470zrp c1912470zrp3, C1869040yjm c1869040yjm, Function1<? super C19240810Pe, Unit> function1) {
                                        InterfaceC19236310Nl interfaceC19236310Nl = (InterfaceC19236310Nl) this.LIZ.LIZIZ(InterfaceC19236310Nl.class);
                                        if (interfaceC19236310Nl != null) {
                                            interfaceC19236310Nl.ki2();
                                        }
                                        InterfaceC19236310Nl interfaceC19236310Nl2 = (InterfaceC19236310Nl) this.LIZ.LIZIZ(InterfaceC19236310Nl.class);
                                        if (interfaceC19236310Nl2 != null) {
                                            interfaceC19236310Nl2.L32();
                                        }
                                        this.LIZ.LIZ.LIZJ();
                                        super.LIZLLL(c1912470zrp3, c1869040yjm, function1);
                                    }
                                };
                            }
                        };
                        arrayList.add(c10nh);
                    }
                    break;
                case 706958995:
                    if (!str.equals("follow_trending_creators")) {
                        C19240010Ow c19240010Ow222222222222222222 = C19240010Ow.LIZ;
                        String str2222222222222222222 = nUAbilityNode.id;
                        c19240010Ow222222222222222222.getClass();
                        C19240010Ow.LIZ(str2222222222222222222);
                    } else {
                        final List<FilterAbilityModel> list18 = nUAbilityNode.filters;
                        c10nh = new C10NF<C1869040yjm>(list18) { // from class: X.10O4
                            public final List<FilterAbilityModel> LIZLLL;

                            @Override // X.C10NF, X.C10ND
                            public final C10QI LIZJ() {
                                C19233810Mm.LIZ.getClass();
                                return C19233810Mm.LIZ(C10N4.class);
                            }

                            @Override // X.C10NF, X.C10ND
                            public final Boolean LJ() {
                                AccountUserService accountUserServiceLJIIJ;
                                TrendingCreatorsPageStruct trendingCreatorsPageStruct;
                                C1673980tfA.LIZ.getClass();
                                C1673970tf9 c1673970tf9 = (C1673970tf9) C09IC.LIZIZ(C1673980tfA.LIZIZ).getValue();
                                boolean z = false;
                                IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
                                if (iAccountService != null && (accountUserServiceLJIIJ = iAccountService.LJIIJ()) != null && accountUserServiceLJIIJ.isLogin() && c1673970tf9 != null && (trendingCreatorsPageStruct = c1673970tf9.LIZ) != null && C1673980tfA.LIZ(trendingCreatorsPageStruct) != null && (!C1673980tfA.LIZIZ(trendingCreatorsPageStruct).isEmpty())) {
                                    z = true;
                                }
                                return Boolean.valueOf(z);
                            }

                            @Override // X.C10NF, X.C10ND
                            public final List<FilterAbilityModel> getFilters() {
                                return this.LIZLLL;
                            }

                            {
                                super(list18, C10NW.JOURNEY_FOLLOW_TRENDING_CREATORS, "follow_trending_creators");
                                this.LIZLLL = list18;
                            }

                            @Override // X.C10NJ
                            public final C10P7<C1869040yjm> LIZLLL(C1912470zrp c1912470zrp2, C10P6 c10p6) {
                                return new C10PJ<C1869040yjm>(c1912470zrp2, c10p6) { // from class: X.10O3
                                    @Override // X.C10P7
                                    public final C10NW type() {
                                        return C10NW.JOURNEY_FOLLOW_TRENDING_CREATORS;
                                    }

                                    @Override // X.C10PJ
                                    public final NUJComponentFragment LJI(C1869040yjm c1869040yjm) {
                                        return new FollowCreatorsFragment();
                                    }
                                };
                            }
                        };
                        arrayList.add(c10nh);
                    }
                    break;
                case 731942004:
                    if (!str.equals("push_auth_preposition_page")) {
                        C19240010Ow c19240010Ow2222222222222222222 = C19240010Ow.LIZ;
                        String str22222222222222222222 = nUAbilityNode.id;
                        c19240010Ow2222222222222222222.getClass();
                        C19240010Ow.LIZ(str22222222222222222222);
                    } else {
                        c10nh = new C10NH(c1912470zrp, nUAbilityNode.filters);
                        arrayList.add(c10nh);
                    }
                    break;
                case 1439097126:
                    if (!str.equals("push_popup_background")) {
                        C19240010Ow c19240010Ow22222222222222222222 = C19240010Ow.LIZ;
                        String str222222222222222222222 = nUAbilityNode.id;
                        c19240010Ow22222222222222222222.getClass();
                        C19240010Ow.LIZ(str222222222222222222222);
                    } else {
                        final List<FilterAbilityModel> list19 = nUAbilityNode.filters;
                        c10nh = new C10NF<C1869040yjm>(list19) { // from class: X.10NG
                            public final List<FilterAbilityModel> LIZLLL;

                            @Override // X.C10NF, X.C10ND
                            public final C10QI LIZJ() {
                                C19233810Mm.LIZ.getClass();
                                return C19233810Mm.LIZ(C19233910Mn.class);
                            }

                            @Override // X.C10NF, X.C10ND
                            public final Boolean LJ() {
                                if (C10NH.LJFF) {
                                    return Boolean.FALSE;
                                }
                                return null;
                            }

                            @Override // X.C10NF, X.C10ND
                            public final List<FilterAbilityModel> getFilters() {
                                return this.LIZLLL;
                            }

                            {
                                super(list19, C10NW.JOURNEY_PUSH_PERMISSION_BACKGROUND, "push_popup_background");
                                this.LIZLLL = list19;
                            }

                            @Override // X.C10NJ
                            public final C10P7<C1869040yjm> LIZLLL(C1912470zrp c1912470zrp2, C10P6 c10p6) {
                                return new C10PJ<C1869040yjm>(c1912470zrp2, c10p6) { // from class: X.0zrw
                                    @Override // X.C10P7
                                    public final C10NW type() {
                                        return C10NW.JOURNEY_PUSH_PERMISSION_BACKGROUND;
                                    }

                                    @Override // X.C10PJ
                                    public final NUJComponentFragment LJI(C1869040yjm c1869040yjm) {
                                        C1911410zq7.LIZ("PushPermissionBackgroundComponent", "to create fragment");
                                        return new PushPermissionBackgroundFragment();
                                    }
                                };
                            }
                        };
                        arrayList.add(c10nh);
                    }
                    break;
                case 1454920715:
                    if (!str.equals("age_gate")) {
                        C19240010Ow c19240010Ow222222222222222222222 = C19240010Ow.LIZ;
                        String str2222222222222222222222 = nUAbilityNode.id;
                        c19240010Ow222222222222222222222.getClass();
                        C19240010Ow.LIZ(str2222222222222222222222);
                    } else {
                        final List<FilterAbilityModel> list20 = nUAbilityNode.filters;
                        c10nh = new C10NF<C1869030yjl>(c1912470zrp, list20) { // from class: X.10OH
                            public final List<FilterAbilityModel> LIZLLL;
                            public final C1912470zrp LJ;

                            @Override // X.C10NF, X.C10ND
                            public final List<FilterAbilityModel> LIZ() {
                                FilterAbilityModel filterAbilityModel = C10OM.LIZ;
                                return Collections.singletonList(C10OM.LIZ);
                            }

                            @Override // X.C10NF, X.C10ND
                            public final C10QI LIZJ() {
                                C19233810Mm.LIZ.getClass();
                                return C19233810Mm.LIZ(C19234410Ms.class);
                            }

                            @Override // X.C10NF, X.C10ND
                            public final Boolean LJ() {
                                C1869030yjl c1869030yjl;
                                AccountUserService accountUserServiceLJIIJ;
                                IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
                                String storeRegionUpperCase = iAccountService != null ? iAccountService.getStoreRegionUpperCase() : null;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("PNUJ check agegate need show, store_region:");
                                sbLIZ.append(storeRegionUpperCase);
                                C1911410zq7.LIZ("PNUJ", C2188811AlT.LIZIZ(sbLIZ));
                                if (C19245710Rb.LIZLLL) {
                                    C1911410zq7.LIZ("PNUJ", "PNUJ Not show, b: skip by store check)");
                                    return Boolean.FALSE;
                                }
                                if (iAccountService != null && (accountUserServiceLJIIJ = iAccountService.LJIIJ()) != null && accountUserServiceLJIIJ.isLogin()) {
                                    C1911410zq7.LIZ("PNUJ", "PNUJ Not show, b: isLogin");
                                    return Boolean.FALSE;
                                }
                                C10PK c10pk = (C10PK) this.LJ.LIZIZ(C10PK.class);
                                if (c10pk != null) {
                                    c10pk.D92();
                                }
                                C10PO.LIZ.getClass();
                                C1912470zrp c1912470zrpLIZ = C10PO.LIZ();
                                C1869040yjm c1869040yjmLIZ = c1912470zrpLIZ != null ? c1912470zrpLIZ.LIZ(C10NW.JOURNEY_AGE_GATE_ID) : null;
                                if (!(c1869040yjmLIZ instanceof C1869030yjl) || (c1869030yjl = (C1869030yjl) c1869040yjmLIZ) == null || !c1869030yjl.LIZIZ) {
                                    C1911410zq7.LIZ("PNUJ", "PNUJ Not show, b: shouldTryAgeGate!=true");
                                    return Boolean.FALSE;
                                }
                                if (!C10RP.LIZ("PNUJ")) {
                                    return null;
                                }
                                C10SQ.LIZ(C10RP.LIZLLL());
                                C1911410zq7.LIZ("PNUJ", "PNUJ Not show, b: PreventDuplicateAgeGateHelper ageGateNotShowAgain");
                                return Boolean.FALSE;
                            }

                            @Override // X.C10NF, X.C10ND
                            public final List<FilterAbilityModel> getFilters() {
                                return this.LIZLLL;
                            }

                            {
                                super(list20, C10NW.JOURNEY_AGE_GATE_ID, "age_gate");
                                this.LIZLLL = list20;
                                this.LJ = c1912470zrp;
                            }

                            @Override // X.C10NJ
                            public final C10P7<C1869030yjl> LIZLLL(C1912470zrp c1912470zrp2, C10P6 c10p6) {
                                return new C10RO(c1912470zrp2, c10p6);
                            }
                        };
                        arrayList.add(c10nh);
                    }
                    break;
                case 1783423468:
                    if (!str.equals("privacy_for_teens")) {
                        C19240010Ow c19240010Ow2222222222222222222222 = C19240010Ow.LIZ;
                        String str22222222222222222222222 = nUAbilityNode.id;
                        c19240010Ow2222222222222222222222.getClass();
                        C19240010Ow.LIZ(str22222222222222222222222);
                    } else {
                        final List<FilterAbilityModel> list21 = nUAbilityNode.filters;
                        c10nh = new C10NF<C446960Hfq>(list21) { // from class: X.10Na
                            public final List<FilterAbilityModel> LIZLLL;

                            @Override // X.C10NF, X.C10ND
                            public final Boolean LJ() {
                                return null;
                            }

                            @Override // X.C10NF, X.C10ND
                            public final List<FilterAbilityModel> LIZ() {
                                FilterAbilityModel filterAbilityModel = C10OM.LIZ;
                                return Collections.singletonList(C10OM.LJFF);
                            }

                            @Override // X.C10NF, X.C10ND
                            public final C10QI LIZJ() {
                                C19233810Mm.LIZ.getClass();
                                return C19233810Mm.LIZ(C10N0.class);
                            }

                            @Override // X.C10NF, X.C10ND
                            public final List<FilterAbilityModel> getFilters() {
                                return this.LIZLLL;
                            }

                            {
                                super(list21, C10NW.JOURNEY_PRIVACY_HIGHLIGHTS_FOR_TEENS, "privacy_for_teens");
                                this.LIZLLL = list21;
                            }

                            @Override // X.C10NJ
                            public final C10P7<C446960Hfq> LIZLLL(final C1912470zrp c1912470zrp2, final C10P6 c10p6) {
                                return new C10PJ<C446960Hfq>(c1912470zrp2, c10p6) { // from class: X.10Nh
                                    @Override // X.C10P7
                                    public final C10NW type() {
                                        return C10NW.JOURNEY_PRIVACY_HIGHLIGHTS_FOR_TEENS;
                                    }

                                    @Override // X.C10PJ
                                    public final NUJComponentFragment LJI(C1869040yjm c1869040yjm) {
                                        return new PrivacyHighlightsForTeensComponent();
                                    }
                                };
                            }
                        };
                        arrayList.add(c10nh);
                    }
                    break;
                case 1938966343:
                    if (!str.equals("push_popup")) {
                        C19240010Ow c19240010Ow22222222222222222222222 = C19240010Ow.LIZ;
                        String str222222222222222222222222 = nUAbilityNode.id;
                        c19240010Ow22222222222222222222222.getClass();
                        C19240010Ow.LIZ(str222222222222222222222222);
                    } else {
                        final List<FilterAbilityModel> list22 = nUAbilityNode.filters;
                        c10nh = new AbstractC19239910Ov(list22) { // from class: X.10MH
                            public final List<FilterAbilityModel> LIZLLL;

                            @Override // X.AbstractC19239910Ov, X.C10ND
                            public final Boolean LJ() {
                                return null;
                            }

                            @Override // X.AbstractC19239910Ov, X.C10ND
                            public final C10QI LIZJ() {
                                C19233810Mm.LIZ.getClass();
                                return C19233810Mm.LIZ(C10N2.class);
                            }

                            @Override // X.AbstractC19239910Ov
                            public final void LJI() {
                                C10PP c10pp;
                                C1912470zrp c1912470zrpContext;
                                C10H4 c10h4;
                                INUJPushService iNUJPushService = (INUJPushService) ServiceManager.get().getService(INUJPushService.class);
                                IPushPermissionApi iPushPermissionApi = (IPushPermissionApi) ServiceManager.get().getService(IPushPermissionApi.class);
                                C10PO.LIZ.getClass();
                                C10P6 c10p6 = C10PO.LIZIZ;
                                C19EG c19egLIZIZ = (c10p6 == null || (c10pp = c10p6.LIZIZ.LIZ) == null || (c1912470zrpContext = c10pp.context()) == null || (c10h4 = c1912470zrpContext.LIZ) == null) ? null : c10h4.LIZIZ();
                                C10P6 c10p62 = C10PO.LIZIZ;
                                String str3 = c10p62 != null ? c10p62.LIZIZ.LJII : null;
                                C19233810Mm.LIZ.getClass();
                                C19233310Mh c19233310Mh = (C19233310Mh) C19233810Mm.LIZ(C19233310Mh.class);
                                if (!C1514430pVp.LIZLLL().booleanValue()) {
                                    iPushPermissionApi.LJIIJJI();
                                }
                                if (iPushPermissionApi.LJFF(C1BWL.LIZ()) && C13LP.LJJJJ(str3, C1697810uHb.LJIIJJI("interest_list", "content_language", "swipe_up"))) {
                                    C19241310Pj.LIZ.getClass();
                                    int i = C10MM.LIZ[C19241310Pj.LIZ().ordinal()];
                                    if (i == 1 || i == 2) {
                                        int i2 = C2187451AjH.LIZ;
                                        if (C13LP.LJJJJ(str3, C1697810uHb.LJIIJJI("interest_list", "content_language", "swipe_up"))) {
                                            if (c19egLIZIZ != null && (!Intrinsics.LJFF(str3, "interest_list") || !Intrinsics.LJFF(c19233310Mh.LJFF(), "revamp"))) {
                                                iNUJPushService.LIZLLL(c19egLIZIZ, "before_interest", false, true, null);
                                            }
                                            this.LIZIZ = true;
                                        }
                                    } else if (i == 3) {
                                        int i3 = C2187451AjH.LIZ;
                                        if (C13LP.LJJJJ(str3, C1697810uHb.LJIIJJI("content_language", "swipe_up"))) {
                                            if (c19egLIZIZ != null) {
                                                iNUJPushService.LIZLLL(c19egLIZIZ, "interest_done", false, true, null);
                                            }
                                            this.LIZIZ = true;
                                        }
                                    } else if (i != 4) {
                                        int i4 = C2187451AjH.LIZ;
                                    } else {
                                        int i5 = C2187451AjH.LIZ;
                                        if (!iNUJPushService.LIZJ()) {
                                            iNUJPushService.LJIIJ();
                                        }
                                        this.LIZIZ = true;
                                    }
                                }
                                C10MF c10mf = this.LIZJ;
                                if (c10mf != null) {
                                    c10mf.onEnd();
                                }
                            }

                            @Override // X.C10ND
                            public final List<FilterAbilityModel> getFilters() {
                                return this.LIZLLL;
                            }

                            {
                                super("push_popup");
                                this.LIZLLL = list22;
                            }
                        };
                        arrayList.add(c10nh);
                    }
                    break;
                case 1939067882:
                    if (!str.equals("store_age_check")) {
                        C19240010Ow c19240010Ow222222222222222222222222 = C19240010Ow.LIZ;
                        String str2222222222222222222222222 = nUAbilityNode.id;
                        c19240010Ow222222222222222222222222.getClass();
                        C19240010Ow.LIZ(str2222222222222222222222222);
                    } else {
                        final List<FilterAbilityModel> list23 = nUAbilityNode.filters;
                        c10nh = new C10NT<C1869040yjm>(list23) { // from class: X.10Nf
                            public final List<FilterAbilityModel> LIZLLL;

                            @Override // X.C10NF, X.C10ND
                            public final List<FilterAbilityModel> getFilters() {
                                return this.LIZLLL;
                            }

                            {
                                super(list23, C10NW.JOURNEY_SERVER_DELAY_ID, "store_age_check");
                                this.LIZLLL = list23;
                            }

                            @Override // X.C10NJ
                            public final C10P7<C1869040yjm> LIZLLL(final C1912470zrp c1912470zrp2, final C10P6 c10p6) {
                                return new C10P5<C1869040yjm>(c1912470zrp2, c10p6) { // from class: X.10RR
                                    @Override // X.C10P7
                                    public final C10NW type() {
                                        return C10NW.JOURNEY_STORE_AGE_CHECK;
                                    }

                                    @Override // X.C10P5, X.C10P7
                                    public final void LIZLLL(C1912470zrp c1912470zrp3, C1869040yjm c1869040yjm, Function1<? super C19240810Pe, Unit> function1) {
                                        super.LIZLLL(c1912470zrp3, c1869040yjm, function1);
                                        if (!C19245710Rb.LIZ) {
                                            LJ();
                                            return;
                                        }
                                        C10S0 c10s0 = new C10S0() { // from class: X.10RY
                                            @Override // X.C10S0
                                            public final void LIZJ() {
                                                LJ();
                                            }

                                            @Override // X.C10S0
                                            public final void LIZ(C19249810Sq c19249810Sq) {
                                                C19245710Rb.LIZLLL = true;
                                                String str3 = c19249810Sq.LIZJ;
                                                if (str3 == null) {
                                                    str3 = "";
                                                }
                                                C10SQ.LIZ(str3);
                                                LJ();
                                            }
                                        };
                                        C19247310Rr c19247310Rr = C19245710Rb.LIZIZ;
                                        if (c19247310Rr != null) {
                                            if (c19247310Rr.LIZ) {
                                                C19249810Sq c19249810Sq = c19247310Rr.LIZIZ;
                                                if (c19249810Sq != null) {
                                                    c10s0.LIZ(c19249810Sq);
                                                }
                                            } else if (c19247310Rr.LIZJ != null) {
                                                c10s0.LIZJ();
                                            }
                                        } else {
                                            ((ArrayList) C19245710Rb.LIZJ).add(c10s0);
                                        }
                                        C587550N2r.LIZ(1000L, new ARunnableS128S0100000_28(this, 9));
                                    }
                                };
                            }
                        };
                        arrayList.add(c10nh);
                    }
                    break;
                default:
                    C19240010Ow c19240010Ow2222222222222222222222222 = C19240010Ow.LIZ;
                    String str22222222222222222222222222 = nUAbilityNode.id;
                    c19240010Ow2222222222222222222222222.getClass();
                    C19240010Ow.LIZ(str22222222222222222222222222);
                    break;
            }
        }
        return arrayList;
    }
}
