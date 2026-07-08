package X;

import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.bef.effectsdk.EffectSDKBuildConfig;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService;
import com.bytedance.ies.ugc.aweme.commercialize.intelligence.IAdReRankServiceManagerService;
import com.bytedance.ies.ugc.aweme.commercialize.intelligence.featurecenter.ICommerceFeatureCenter;
import com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ad.comment.pitaya.PitayaServiceManager;
import com.ss.android.ugc.aweme.ad.feed.experiment.VSAProductIdRecordSetting;
import com.ss.android.ugc.aweme.boc.IBOCFrequencyControlUtils;
import com.ss.android.ugc.aweme.commercialize.data.utils.AdSessionPositionHelper;
import com.ss.android.ugc.aweme.commercialize.service.IFeedAppDetectService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSDeviceConsentService;
import com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService;
import com.ss.android.ugc.aweme.feed.api.recommend.RecommendFeedProcessorRegistry;
import com.ss.android.ugc.aweme.feed.model.FeedInsertRelationManager;
import com.ss.android.ugc.aweme.feed.model.ServerBaseComponentConfig;
import com.ss.android.ugc.aweme.feed.model.ServerBaseFcpConfig;
import com.ss.android.ugc.aweme.feed.spi.ICommonFeedCustomLogic;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.frequency.model.CommonFrequencyClientInfo;
import com.ss.android.ugc.aweme.frequency.model.NotAllowOutreachItemInfo;
import com.ss.android.ugc.aweme.frequency.model.OutreachFrequencyInfo;
import com.ss.android.ugc.aweme.litemode.LiteModePushConfig;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import com.ss.android.ugc.aweme.mention.service.QuickMentionThresholdServiceImpl;
import com.ss.android.ugc.aweme.outreach.frequency.IOutreachFrequency;
import com.ss.android.ugc.aweme.poi.anchor.IPoiAnchorService;
import com.ss.android.ugc.aweme.poi_api.service.IPoiService;
import com.ss.android.ugc.aweme.search.ISearchService;
import com.ss.android.ugc.aweme.search.ISearchServiceLowEnd;
import com.ss.android.ugc.aweme.service.IFeedDebugService;
import com.ss.android.ugc.aweme.service.IFilterBotService;
import com.ss.android.ugc.aweme.tablet.api.IDeviceCapability;
import com.ss.android.ugc.aweme.web.permission.IAdWebPermissionService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS353S0000000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rrh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1604870rrh extends C09AY implements Function0<List<? extends InterfaceC1333005Jo<C0XLL>>> {
    public final /* synthetic */ C1604930rrn LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1604870rrh(C1604930rrn c1604930rrn) {
        super(0);
        this.LL = c1604930rrn;
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends InterfaceC1333005Jo<C0XLL>> invoke() {
        getClass();
        return C13LP.LJLIL(RecommendFeedProcessorRegistry.INSTANCE.requestProcessors(), C1697810uHb.LJIIJJI(new InterfaceC1333005Jo<C0XLL>() { // from class: X.0rrm
            @Override // X.InterfaceC1333005Jo
            public final String getTag() {
                return "core";
            }

            @Override // X.InterfaceC1333005Jo
            public final int getType() {
                return 0;
            }

            @Override // X.InterfaceC1333005Jo
            public final void LIZ(C1440305kP<C0XLL> c1440305kP) {
                int iIntValue;
                String strLIZ;
                C0XLL c0xll = c1440305kP.LIZJ;
                C1EST c1est = c0xll.LIZ;
                C1601460rmC c1601460rmC = c1440305kP.LIZIZ;
                int i = c1601460rmC.LIZIZ;
                int i2 = c1601460rmC.LIZ;
                Long l = c1601460rmC.LJ;
                Long l2 = c1601460rmC.LJFF;
                Integer num = c1601460rmC.LJI;
                Integer num2 = c1601460rmC.LJII;
                if (num2 != null) {
                    iIntValue = num2.intValue();
                } else {
                    iIntValue = 0;
                }
                C844470XAv.LIZ.getClass();
                String string = Long.toString(C844470XAv.LJ());
                String sdkVersion = EffectSDKBuildConfig.getSdkVersion();
                if (c1601460rmC.LJJIIZI != 0) {
                    i = 12;
                }
                c1est.LJFF = l2;
                c1est.LJ = l;
                c1est.LIZLLL = Integer.valueOf(i2);
                c1est.LJI = num;
                c1est.LJII = Integer.valueOf(iIntValue);
                c1est.LJIIIZ = Integer.valueOf(i);
                c1est.LLJJL = string;
                c0xll.LIZLLL.LIZ("Content-Type", "application/x-protobuf");
                if (ComplianceServiceProvider.LJIILJJIL().LJII(null)) {
                    if (((Boolean) C0C25.LIZLLL.getValue()).booleanValue() && !TextUtils.isEmpty(C818020W7c.LIZ())) {
                        strLIZ = C818020W7c.LIZ();
                        if (strLIZ != null) {
                        }
                    } else {
                        strLIZ = "";
                    }
                    c0xll.LIZLLL.LIZ("Cookie", strLIZ);
                }
                c0xll.LIZ("app_version", string);
                c0xll.LIZ("effect_sdk_version", sdkVersion);
                c0xll.LIZ("pull_type", String.valueOf(i));
            }
        }, new InterfaceC1333005Jo<C0XLL>() { // from class: X.0rqC
            @Override // X.InterfaceC1333005Jo
            public final String getTag() {
                return "ad";
            }

            @Override // X.InterfaceC1333005Jo
            public final int getType() {
                return 0;
            }

            @Override // X.InterfaceC1333005Jo
            public final void LIZ(C1440305kP<C0XLL> c1440305kP) {
                String string;
                Integer numValueOf;
                boolean z;
                String strLIZJ;
                String strU4;
                long jR4;
                long jLJ;
                boolean zLIZJ;
                C1EST c1est = c1440305kP.LIZJ.LIZ;
                C1601460rmC c1601460rmC = c1440305kP.LIZIZ;
                int iVc = ((IAdWebPermissionService) ServiceManager.get().getService(IAdWebPermissionService.class)).Vc();
                long jLIZLLL = ((IFeedAppDetectService) ServiceManager.get().getService(IFeedAppDetectService.class)).LIZLLL();
                String strLIZLLL = AnonymousClass1440.LIZLLL();
                String str = C1030680cva.LJI;
                Long l = C1030680cva.LJII;
                if (l == null || (string = l.toString()) == null) {
                    string = "";
                }
                C1150504el.LIZ().LIZLLL("feed_get_live_splash_id", false);
                System.currentTimeMillis();
                C1150504el.LIZ().LJI("feed_get_live_splash_id", false);
                int i = c1601460rmC.LIZIZ;
                if (i == 4 || i == 0) {
                    C1603350rpF.LIZ = SystemClock.uptimeMillis();
                }
                String strLIZ = C1489110oqz.LIZ("feed");
                int iLJIILL = ComplianceServiceProvider.LJIILIIL().LJIILL();
                int i2 = c1601460rmC.LIZIZ;
                if (i2 != 4 && i2 != 0 && i2 != 1) {
                    if (i2 == 2) {
                        numValueOf = Integer.valueOf(C0N4K.LIZ.size() + 1);
                    } else {
                        numValueOf = null;
                    }
                } else {
                    numValueOf = 0;
                }
                ICommerceFeatureCenter iCommerceFeatureCenter = (ICommerceFeatureCenter) PluggableExtentionKt.pluggableSpi$default(ICommerceFeatureCenter.class, false, false, false, 14, null);
                if (iCommerceFeatureCenter != null && iCommerceFeatureCenter.LIZLLL()) {
                    z = true;
                    iCommerceFeatureCenter.LJ();
                } else {
                    z = false;
                }
                int i3 = c1601460rmC.LIZIZ;
                if (i3 != 2 && i3 != 1) {
                    jR4 = -1;
                    strLIZJ = "";
                    strU4 = "";
                } else {
                    if (z) {
                        if (iCommerceFeatureCenter == null || (strLIZJ = iCommerceFeatureCenter.LIZJ()) == null) {
                            strLIZJ = "";
                        }
                    } else {
                        strLIZJ = PitayaServiceManager.LIZLLL().LIZJ();
                    }
                    IAdReRankServiceManagerService iAdReRankServiceManagerService = (IAdReRankServiceManagerService) ServiceManager.get().getService(IAdReRankServiceManagerService.class);
                    EnumC584610MwN enumC584610MwN = EnumC584610MwN.FEED;
                    strU4 = iAdReRankServiceManagerService.LIZIZ(enumC584610MwN).U4();
                    jR4 = ((IAdReRankServiceManagerService) ServiceManager.get().getService(IAdReRankServiceManagerService.class)).LIZIZ(enumC584610MwN).R4();
                }
                if (c1601460rmC.LIZIZ != 2) {
                    C0N4K.LIZ.clear();
                    C0N4K.LIZIZ.clear();
                } else {
                    Set<String> set = C0N4K.LIZ;
                }
                String strLJIIIIZZ = null;
                if (((IPNSDeviceConsentService) ServiceManager.get().getService(IPNSDeviceConsentService.class)).LJII(null)) {
                    c1est.LJJJJZI = strLIZLLL;
                    c1est.LJLLJ = strLIZ;
                    c1est.LJJJJZ = Integer.valueOf(iLJIILL);
                }
                IBOCFrequencyControlUtils iBOCFrequencyControlUtils = (IBOCFrequencyControlUtils) PluggableExtentionKt.pluggableSpi$default(IBOCFrequencyControlUtils.class, false, false, false, 14, null);
                if (iBOCFrequencyControlUtils != null) {
                    jLJ = iBOCFrequencyControlUtils.LJ();
                } else {
                    jLJ = 0;
                }
                C1009500cNQ c1009500cNQ = (C1009500cNQ) C1619720sFe.LIZ.LIZ(76);
                if (c1009500cNQ != null) {
                    zLIZJ = c1009500cNQ.LIZJ();
                } else {
                    zLIZJ = false;
                }
                int iLIZIZ = ComplianceServiceProvider.LJIILIIL().LIZIZ();
                c1est.LJIILIIL = str;
                c1est.LJJLJ = string;
                c1est.LJIJI = numValueOf;
                c1est.LJJIJLIJ = strLIZJ;
                c1est.LJJIL = strU4;
                c1est.LLJJIJIL = Long.valueOf(jR4);
                c1est.LLJLIL = Integer.valueOf(iVc);
                c1est.LLLF = Long.valueOf(jLIZLLL);
                c1est.LLLLIILL = Long.valueOf(jLJ);
                c1est.LLLLIL = Boolean.valueOf(zLIZJ);
                c1est.LLLLLZIL = Integer.valueOf(iLIZIZ);
                int i4 = c1601460rmC.LIZIZ;
                if (i4 != 0 && i4 != 4 && ((VSAProductIdRecordSetting.VSAProductIdRecordParam) VSAProductIdRecordSetting.LIZIZ.getValue()).enable) {
                    C1048110dNh.LIZLLL.getClass();
                    String str2 = C1048110dNh.LJ().LIZJ;
                    if (str2 == null) {
                        str2 = "";
                    }
                    c1est.LLLLL = str2;
                }
                if (C300530BqF.LIZ()) {
                    int i5 = c1601460rmC.LIZIZ;
                    if (i5 != 0 && i5 != 8) {
                        AdSessionPositionHelper adSessionPositionHelper = AdSessionPositionHelper.LIZ;
                        Integer numValueOf2 = Integer.valueOf(i5);
                        String str3 = c1601460rmC.LJJIJIIJI;
                        adSessionPositionHelper.getClass();
                        strLJIIIIZZ = AdSessionPositionHelper.LJIIIIZZ(numValueOf2, "fyp", str3);
                    }
                    c1est.LLJJJJ = strLJIIIIZZ;
                    return;
                }
                c1est.LLJJJJ = c1601460rmC.LJIILL;
            }
        }, new InterfaceC1333005Jo<C0XLL>() { // from class: X.0rrO
            @Override // X.InterfaceC1333005Jo
            public final String getTag() {
                return "common_request";
            }

            @Override // X.InterfaceC1333005Jo
            public final int getType() {
                return 0;
            }

            /* JADX WARN: Removed duplicated region for block: B:106:0x0233  */
            /* JADX WARN: Removed duplicated region for block: B:121:0x026c  */
            /* JADX WARN: Removed duplicated region for block: B:125:0x0271  */
            /* JADX WARN: Removed duplicated region for block: B:148:0x02fe  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0047  */
            /* JADX WARN: Removed duplicated region for block: B:176:0x0276 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:178:0x0236 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
            /* JADX WARN: Removed duplicated region for block: B:25:0x008d  */
            /* JADX WARN: Removed duplicated region for block: B:31:0x00a2  */
            /* JADX WARN: Removed duplicated region for block: B:47:0x00e7  */
            /* JADX WARN: Removed duplicated region for block: B:48:0x00e9  */
            /* JADX WARN: Removed duplicated region for block: B:61:0x011f  */
            /* JADX WARN: Removed duplicated region for block: B:82:0x01b2  */
            /* JADX WARN: Removed duplicated region for block: B:85:0x01be  */
            /* JADX WARN: Removed duplicated region for block: B:88:0x01cd  */
            /* JADX WARN: Removed duplicated region for block: B:91:0x01d2  */
            /* JADX WARN: Removed duplicated region for block: B:92:0x01d9  */
            @Override // X.InterfaceC1333005Jo
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(X.C1440305kP<X.C0XLL> r22) throws org.json.JSONException {
                /*
                    Method dump skipped, instruction units count: 1008
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1604680rrO.LIZ(X.05kP):void");
            }
        }, new InterfaceC1333005Jo<C0XLL>() { // from class: X.0rrQ
            @Override // X.InterfaceC1333005Jo
            public final String getTag() {
                return "compliance";
            }

            @Override // X.InterfaceC1333005Jo
            public final int getType() {
                return 1;
            }

            @Override // X.InterfaceC1333005Jo
            public final void LIZ(C1440305kP<C0XLL> c1440305kP) {
                boolean z;
                String strLJII;
                int i;
                C0XLL c0xll = c1440305kP.LIZJ;
                C1EST c1est = c0xll.LIZ;
                C1601460rmC c1601460rmC = c1440305kP.LIZIZ;
                int iLJJIIZI = ComplianceServiceProvider.LJIL().LJJIIZI();
                boolean z2 = true;
                if (C0CD2.LIZJ() == -1 && !C0CNS.LIZIZ()) {
                    z = false;
                } else {
                    z = true;
                }
                Boolean bool = c1601460rmC.LJIIJJI;
                Boolean bool2 = Boolean.TRUE;
                if (Intrinsics.LJFF(bool, bool2) && z && ((IComplianceService) ServiceManager.get().getService(IComplianceService.class)).LJIIL()) {
                    strLJII = null;
                } else {
                    strLJII = ComplianceServiceProvider.LJJI().LJII();
                }
                if (Intrinsics.LJFF(c1601460rmC.LJIIJJI, bool2) && z) {
                    IComplianceSettingsService iComplianceSettingsServiceLJJI = ComplianceServiceProvider.LJJI();
                    if (strLJII != null && strLJII.length() != 0) {
                        i = 0;
                    } else {
                        i = 1;
                    }
                    iComplianceSettingsServiceLJJI.LJJIJIIJI(i ^ 1);
                }
                int iOrdinal = C0NG6.PERSONALIZED.ordinal();
                boolean zLIZIZ = C1567040qsg.LIZIZ();
                c0xll.LIZ("is_non_personalized", String.valueOf(zLIZIZ ? 1 : 0));
                c0xll.LIZ("cmpl_enc", strLJII);
                c1est.LJJIIZI = Integer.valueOf(iLJJIIZI);
                c1est.LJJZ = strLJII;
                c1est.LJJIJL = Integer.valueOf(iOrdinal);
                if (!zLIZIZ) {
                    z2 = false;
                }
                c1est.LJJLIL = Boolean.valueOf(z2);
            }
        }, new InterfaceC1333005Jo<C0XLL>() { // from class: X.1CNO
            @Override // X.InterfaceC1333005Jo
            public final String getTag() {
                return "fcp";
            }

            @Override // X.InterfaceC1333005Jo
            public final int getType() {
                return 1;
            }

            @Override // X.InterfaceC1333005Jo
            public final void LIZ(C1440305kP<C0XLL> c1440305kP) {
                ServerBaseComponentConfig serverBaseComponentConfig;
                String str;
                C1EST c1est = c1440305kP.LIZJ.LIZ;
                ServerBaseFcpConfig serverBaseFcpConfig = C707650RpL.LIZIZ;
                C1CNQ c1cnqBuild = null;
                if (serverBaseFcpConfig != null && (serverBaseComponentConfig = serverBaseFcpConfig.serverBaseComponentConfig) != null && (str = serverBaseComponentConfig.serverBaseComponentConfigHash) != null && str.length() != 0) {
                    C1CNN c1cnn = new C1CNN();
                    c1cnn.LIZLLL = str;
                    C1CNM c1cnmBuild = c1cnn.build();
                    C1CNR c1cnr = new C1CNR();
                    c1cnr.LIZLLL = c1cnmBuild;
                    c1cnqBuild = c1cnr.build();
                }
                c1est.LLLFFI = c1cnqBuild;
            }
        }, new InterfaceC1333005Jo<C0XLL>() { // from class: X.10Uh
            public final C01GW LIZ = C452501pT.LIZIZ(new C19254210Ui());

            @Override // X.InterfaceC1333005Jo
            public final String getTag() {
                return "new_user";
            }

            @Override // X.InterfaceC1333005Jo
            public final int getType() {
                return 0;
            }

            /* JADX WARN: Removed duplicated region for block: B:110:0x02c1  */
            /* JADX WARN: Removed duplicated region for block: B:115:0x02da  */
            /* JADX WARN: Removed duplicated region for block: B:118:0x02ea  */
            /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
            /* JADX WARN: Removed duplicated region for block: B:133:0x0319  */
            /* JADX WARN: Removed duplicated region for block: B:134:0x031c  */
            /* JADX WARN: Removed duplicated region for block: B:135:0x031f  */
            /* JADX WARN: Removed duplicated region for block: B:145:0x033e  */
            /* JADX WARN: Removed duplicated region for block: B:151:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:26:0x00b6  */
            /* JADX WARN: Removed duplicated region for block: B:27:0x00b8  */
            /* JADX WARN: Removed duplicated region for block: B:83:0x022c  */
            /* JADX WARN: Removed duplicated region for block: B:86:0x023e  */
            /* JADX WARN: Removed duplicated region for block: B:89:0x0256  */
            /* JADX WARN: Removed duplicated region for block: B:92:0x0260  */
            @Override // X.InterfaceC1333005Jo
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(X.C1440305kP<X.C0XLL> r22) {
                /*
                    Method dump skipped, instruction units count: 833
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C19254110Uh.LIZ(X.05kP):void");
            }
        }, new InterfaceC1333005Jo<C0XLL>() { // from class: X.0rrk
            @Override // X.InterfaceC1333005Jo
            public final String getTag() {
                return "search";
            }

            @Override // X.InterfaceC1333005Jo
            public final int getType() {
                return 1;
            }

            @Override // X.InterfaceC1333005Jo
            public final void LIZ(C1440305kP<C0XLL> c1440305kP) {
                Object service;
                Object service2;
                C1EST c1est = c1440305kP.LIZJ.LIZ;
                if (C1157804fw.LIZ()) {
                    service = ServiceManager.get().getService(ISearchServiceLowEnd.class);
                    if (service == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.search.ISearchRequestProcessorPartial");
                    }
                } else {
                    service = ServiceManager.get().getService(ISearchService.class);
                    if (service == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.search.ISearchRequestProcessorPartial");
                    }
                }
                String strD0 = ((InterfaceC1604910rrl) service).D0();
                if (C1157804fw.LIZ()) {
                    service2 = ServiceManager.get().getService(ISearchServiceLowEnd.class);
                    if (service2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.search.ISearchRequestProcessorPartial");
                    }
                } else {
                    service2 = ServiceManager.get().getService(ISearchService.class);
                    if (service2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.search.ISearchRequestProcessorPartial");
                    }
                }
                Long L = ((InterfaceC1604910rrl) service2).L();
                c1est.LLJJLIIIJLLLLLLLZ = strD0;
                c1est.LLJL = L;
            }
        }, new C1DC5(), new InterfaceC1333005Jo<C0XLL>() { // from class: X.0rrg
            @Override // X.InterfaceC1333005Jo
            public final String getTag() {
                return "social";
            }

            @Override // X.InterfaceC1333005Jo
            public final int getType() {
                return 0;
            }

            @Override // X.InterfaceC1333005Jo
            public final void LIZ(C1440305kP<C0XLL> c1440305kP) {
                C1601460rmC c1601460rmC = c1440305kP.LIZIZ;
                C1EST c1est = c1440305kP.LIZJ.LIZ;
                String str = c1601460rmC.LJIJJ;
                int iLIZ = C826660Wbo.LIZ();
                if (((IPNSDeviceConsentService) ServiceManager.get().getService(IPNSDeviceConsentService.class)).LJII(null)) {
                    c1est.LJIIL = Integer.valueOf(iLIZ);
                }
                List<C1601740rme> insertRelationV2List = FeedInsertRelationManager.toInsertRelationV2List(str);
                if (insertRelationV2List != null) {
                    c1est.getClass();
                    C1516540pZE.LIZ(insertRelationV2List);
                    c1est.LJJLIIJ = insertRelationV2List;
                }
                c1est.LLJLLIL = Boolean.valueOf(c1601460rmC.LJJI);
                c1est.LLLFZ = Boolean.valueOf(!QuickMentionThresholdServiceImpl.LJFF().LIZJ());
            }
        }, new InterfaceC1333005Jo<C0XLL>() { // from class: X.14aa
            @Override // X.InterfaceC1333005Jo
            public final String getTag() {
                return "survey";
            }

            @Override // X.InterfaceC1333005Jo
            public final int getType() {
                return 0;
            }

            @Override // X.InterfaceC1333005Jo
            public final void LIZ(C1440305kP<C0XLL> c1440305kP) {
                C1EST c1est = c1440305kP.LIZJ.LIZ;
                C1601460rmC c1601460rmC = c1440305kP.LIZIZ;
                String str = c1601460rmC.LJIIZILJ;
                c1est.LJLIIIL = c1601460rmC.LJIJI;
                c1est.LJJLIIIJL = str;
                C2224051C2x c2224051C2x = new C2224051C2x();
                C20291314aV.LIZ.getClass();
                C20291514aX.LIZ.getClass();
                List listLIZ = C20291514aX.LIZ();
                ArrayList arrayList = new ArrayList();
                for (Object obj : (ArrayList) listLIZ) {
                    C20292814ak c20292814ak = (C20292814ak) obj;
                    int i = C20291514aX.LIZLLL;
                    if (i >= c20292814ak.LIZLLL - 20 && i <= c20292814ak.LJ) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((C20292814ak) it2.next()).LIZJ);
                }
                C1939607ik c1939607ik = new C1939607ik(arrayList2);
                C20291514aX.LIZ.getClass();
                CopyOnWriteArrayList<C20292814ak> copyOnWriteArrayList = C20291514aX.LJFF;
                ArrayList arrayList3 = new ArrayList();
                for (C20292814ak c20292814ak2 : copyOnWriteArrayList) {
                    C20292814ak c20292814ak3 = c20292814ak2;
                    if (c20292814ak3.LIZIZ <= 0 || c20292814ak3.LIZ < 0) {
                        arrayList3.add(c20292814ak2);
                    }
                }
                ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(arrayList3, 10));
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    arrayList4.add(((C20292814ak) it3.next()).LIZJ);
                }
                List<String> listLJJII = C09RB.LJJII(C09RB.LJIJI(C09RB.LJIIIZ(C09RB.LJIL(c1939607ik, arrayList4), new C14ZF()), new C14ZH()));
                C20291314aV.LJII.LJIIJJI(new AnonymousClass0052(listLJJII));
                C1516540pZE.LIZ(listLJJII);
                c2224051C2x.LIZLLL = listLJJII;
                C14ZT.LIZ.getClass();
                if (!listLJJII.isEmpty()) {
                    ArrayList arrayList5 = new ArrayList();
                    arrayList5.addAll(listLJJII);
                    C14ZT.LJIILIIL("collect_survey_params", new C14ZU(arrayList5, C20291514aX.LIZLLL));
                    C20291714aZ c20291714aZ = C20291714aZ.LIZ;
                    C20292214ae c20292214ae = new C20292214ae(listLJJII);
                    c20291714aZ.getClass();
                    C20291714aZ.LIZIZ(c20292214ae);
                }
                c1est.LLJJIJI = c2224051C2x.build();
                if (((Number) C269630AhV.LIZ.getValue()).intValue() > 0) {
                    c1est.LLLILZJ = new C760702y5(Boolean.FALSE);
                }
            }
        }, new InterfaceC1333005Jo<C0XLL>() { // from class: X.1CHJ
            @Override // X.InterfaceC1333005Jo
            public final String getTag() {
                return "tablet";
            }

            @Override // X.InterfaceC1333005Jo
            public final int getType() {
                return 1;
            }

            @Override // X.InterfaceC1333005Jo
            public final void LIZ(C1440305kP<C0XLL> c1440305kP) {
                EnumC1094680eao enumC1094680eao;
                String str;
                int i;
                int i2;
                int iH;
                C1601460rmC c1601460rmC = c1440305kP.LIZIZ;
                C1EST c1est = c1440305kP.LIZJ.LIZ;
                IDeviceCapability iDeviceCapability = (IDeviceCapability) PluggableExtentionKt.pluggableSpi$default(IDeviceCapability.class, false, false, false, 14, null);
                int i3 = 1;
                if (C19252910Tv.LIZIZ.LIZLLL().LJIIJ().LIZ() == 1) {
                    enumC1094680eao = EnumC1094680eao.LANDSCAPE;
                } else {
                    enumC1094680eao = EnumC1094680eao.PORTRAIT;
                }
                int landscapeType = enumC1094680eao.getLandscapeType();
                int i4 = !C1386360mBG.LJII(true) ? 1 : 0;
                C1389350mG5 c1389350mG5LIZJ = C1389340mG4.LIZJ(null, null);
                if (iDeviceCapability != null && iDeviceCapability.k(null)) {
                    str = "Fold screen";
                } else if (C1389340mG4.LJ() < 650) {
                    str = "Small screen";
                } else if (C1389340mG4.LJ() < 800) {
                    str = "Medium screen";
                } else {
                    str = "Large screen";
                }
                if (iDeviceCapability != null && iDeviceCapability.i()) {
                    i = 1;
                } else {
                    i = 0;
                }
                c1est.LJJJJLI = Integer.valueOf(i);
                c1est.LJJJJL = Integer.valueOf(landscapeType);
                c1est.LLIIIILZ = Integer.valueOf(i4);
                if (iDeviceCapability != null && iDeviceCapability.k(null)) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                c1est.LLLLLLIL = Integer.valueOf(i2);
                int iJ = -1;
                if (iDeviceCapability != null) {
                    iH = iDeviceCapability.h();
                } else {
                    iH = -1;
                }
                c1est.LLLLLLJ = Integer.valueOf(iH);
                if (iDeviceCapability == null || !iDeviceCapability.m(null)) {
                    i3 = 0;
                }
                c1est.LLLLLLL = Integer.valueOf(i3);
                if (iDeviceCapability != null) {
                    iJ = iDeviceCapability.j();
                }
                c1est.LLLLLLLLL = Integer.valueOf(iJ);
                c1est.LLLLLLLLLL = Integer.valueOf(c1389350mG5LIZJ.LJI ? 1 : 0);
                c1est.LLLLLLLZIL = Long.valueOf(c1389350mG5LIZJ.LIZIZ());
                c1est.LLLLLLZ = Long.valueOf(c1389350mG5LIZJ.LIZ());
                c1est.LLLLLLZZ = str;
                ICommonFeedCustomLogic iCommonFeedCustomLogic = (ICommonFeedCustomLogic) PluggableExtentionKt.pluggableSpi$default(ICommonFeedCustomLogic.class, false, false, false, 14, null);
                if (iCommonFeedCustomLogic != null) {
                    C1CHI c1chi = new C1CHI();
                    c1chi.LIZLLL = Integer.valueOf(i4);
                    c1chi.build();
                    iCommonFeedCustomLogic.LJIIIIZZ();
                }
                ISplashAdService iSplashAdService = (ISplashAdService) PluggableExtentionKt.pluggableSpi$default(ISplashAdService.class, false, false, false, 14, null);
                if (iSplashAdService != null) {
                    String strLIZIZ = iSplashAdService.LJJIZ().LIZIZ();
                    if (C1533950q1J.LJ(strLIZIZ)) {
                        c1est.LLLILZLLLI = strLIZIZ;
                    }
                    String strLJJJ = iSplashAdService.LJJJ();
                    if (c1601460rmC.LIZIZ == 8 && C1533950q1J.LJ(strLJJJ)) {
                        c1est.LLLLIIL = strLJJJ;
                    }
                }
            }
        }, new InterfaceC1333005Jo<C0XLL>() { // from class: X.1D9G
            @Override // X.InterfaceC1333005Jo
            public final String getTag() {
                return "live";
            }

            @Override // X.InterfaceC1333005Jo
            public final int getType() {
                return 0;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:114:0x0221 A[PHI: r12
              0x0221: PHI (r12v3 int) = (r12v2 int), (r12v1 int) binds: [B:107:0x0210, B:113:0x021f] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:119:0x022d  */
            /* JADX WARN: Type inference failed for: r7v0 */
            /* JADX WARN: Type inference failed for: r7v1, types: [int] */
            /* JADX WARN: Type inference failed for: r7v10 */
            /* JADX WARN: Type inference failed for: r7v8 */
            /* JADX WARN: Type inference failed for: r7v9 */
            @Override // X.InterfaceC1333005Jo
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(X.C1440305kP<X.C0XLL> r17) {
                /*
                    Method dump skipped, instruction units count: 639
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1D9G.LIZ(X.05kP):void");
            }
        }, new InterfaceC1333005Jo<C0XLL>() { // from class: X.0znK
            @Override // X.InterfaceC1333005Jo
            public final String getTag() {
                return "mock";
            }

            @Override // X.InterfaceC1333005Jo
            public final int getType() {
                return 0;
            }

            @Override // X.InterfaceC1333005Jo
            public final void LIZ(C1440305kP<C0XLL> c1440305kP) {
                int i;
                String upperCase;
                Boolean qualityProtectionSwitch;
                C1EST c1est = c1440305kP.LIZJ.LIZ;
                C844470XAv.LIZ.getClass();
                if (TextUtils.equals(C844470XAv.LJIILL, "local_test") && (qualityProtectionSwitch = ((LocalTestApi) ServiceManager.get().getService(LocalTestApi.class)).getQualityProtectionSwitch()) != null && qualityProtectionSwitch.booleanValue()) {
                    i = 1;
                } else {
                    i = 0;
                }
                c1est.LJJJJI = Integer.valueOf(i);
                if (i != 0) {
                    upperCase = "";
                } else {
                    try {
                        TelephonyManager telephonyManager = (TelephonyManager) C786410Ut5.H2(C844470XAv.LIZ(), "phone");
                        AtomicBoolean atomicBoolean = C794320VDy.LIZ;
                        upperCase = C1300840jxK.LJIIIIZZ(telephonyManager);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        upperCase = "";
                    }
                    if (!TextUtils.isEmpty(upperCase)) {
                        upperCase = upperCase.toUpperCase(Locale.US);
                    }
                }
                c1est.LJJJJJ = upperCase;
                IFeedDebugService iFeedDebugService = (IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class, false, false);
                if (iFeedDebugService != null) {
                    iFeedDebugService.LJIJI();
                }
                c1est.LJLIL = "";
                C844470XAv.LIZ.getClass();
                if (TextUtils.equals(C844470XAv.LJIILL, "local_test")) {
                    IFilterBotService iFilterBotService = (IFilterBotService) ServiceManager.get().getService(IFilterBotService.class);
                    C844470XAv.LIZ();
                    iFilterBotService.LIZ();
                }
                c1est.LJJJJ = "";
            }
        }, new InterfaceC1333005Jo<C0XLL>() { // from class: X.0rrU
            @Override // X.InterfaceC1333005Jo
            public final String getTag() {
                return "request_log";
            }

            @Override // X.InterfaceC1333005Jo
            public final int getType() {
                return 1;
            }

            @Override // X.InterfaceC1333005Jo
            public final void LIZ(C1440305kP<C0XLL> c1440305kP) {
                c1440305kP.LIZLLL.LJIIJJI(new C1604730rrT(c1440305kP.LIZIZ));
            }
        }, new InterfaceC1333005Jo<C0XLL>() { // from class: X.15wC
            @Override // X.InterfaceC1333005Jo
            public final String getTag() {
                return "fcp";
            }

            @Override // X.InterfaceC1333005Jo
            public final int getType() {
                return 1;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r7v1, types: [X.13BV] */
            /* JADX WARN: Type inference failed for: r7v2, types: [java.util.List, java.util.List<X.1COr>] */
            /* JADX WARN: Type inference failed for: r7v3, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r8v1, types: [X.13BV] */
            /* JADX WARN: Type inference failed for: r8v2, types: [java.util.List, java.util.List<X.1COu>] */
            /* JADX WARN: Type inference failed for: r8v3, types: [java.util.ArrayList] */
            @Override // X.InterfaceC1333005Jo
            public final void LIZ(C1440305kP<C0XLL> c1440305kP) {
                String key;
                boolean z;
                Object second;
                CommonFrequencyClientInfo commonFrequencyClientInfoLIZ;
                ?? arrayList;
                ?? arrayList2;
                C1EST c1est = c1440305kP.LIZJ.LIZ;
                C1584320rKY.LIZ.getClass();
                EnumC1584360rKc enumC1584360rKcLJIIIIZZ = C1584320rKY.LJIIIIZZ("For You");
                C2229771COx c2229771COxBuild = null;
                if (enumC1584360rKcLJIIIIZZ != null) {
                    key = enumC1584360rKcLJIIIIZZ.getKey();
                } else {
                    key = null;
                }
                if (key != null && key.length() != 0) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z) {
                    IOutreachFrequency iOutreachFrequency = (IOutreachFrequency) PluggableExtentionKt.pluggableSpi$default(IOutreachFrequency.class, false, false, false, 14, null);
                    if (iOutreachFrequency != null && (commonFrequencyClientInfoLIZ = iOutreachFrequency.LIZ(AFwS353S0000000_31.get$arr$(1), EnumC20654715s1.FEED_COMPONENT.getTypeName(), key)) != null) {
                        C2229781COy c2229781COy = new C2229781COy();
                        List<OutreachFrequencyInfo> list = commonFrequencyClientInfoLIZ.entityFrequencyInfo;
                        if (list != null) {
                            arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                            for (OutreachFrequencyInfo outreachFrequencyInfo : list) {
                                C2229751COv c2229751COv = new C2229751COv();
                                String str = outreachFrequencyInfo.outreachType;
                                if (str == null) {
                                    str = "";
                                }
                                c2229751COv.LIZLLL = str;
                                List<NotAllowOutreachItemInfo> list2 = outreachFrequencyInfo.notAllowKeyList;
                                if (list2 != null) {
                                    arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
                                    for (NotAllowOutreachItemInfo notAllowOutreachItemInfo : list2) {
                                        C2229721COs c2229721COs = new C2229721COs();
                                        String str2 = notAllowOutreachItemInfo.key;
                                        if (str2 == null) {
                                            str2 = "";
                                        }
                                        c2229721COs.LIZLLL = str2;
                                        String str3 = notAllowOutreachItemInfo.reason;
                                        if (str3 == null) {
                                            str3 = "";
                                        }
                                        c2229721COs.LJ = str3;
                                        arrayList2.add(c2229721COs.build());
                                    }
                                } else {
                                    arrayList2 = C13BV.INSTANCE;
                                }
                                C1516540pZE.LIZ(arrayList2);
                                c2229751COv.LJ = arrayList2;
                                arrayList.add(c2229751COv.build());
                            }
                        } else {
                            arrayList = C13BV.INSTANCE;
                        }
                        C1516540pZE.LIZ(arrayList);
                        c2229781COy.LIZLLL = arrayList;
                        c2229771COxBuild = c2229781COy.build();
                    }
                    c1est.LLLLIILLL = c2229771COxBuild;
                }
                if (((Boolean) C0B66.LIZ.getValue()).booleanValue()) {
                    int iIntValue = c1est.LJIIIZ.intValue();
                    List list3 = (List) C299300BoG.LIZIZ.getValue();
                    ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list3, 10));
                    Iterator it2 = list3.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(Integer.valueOf(((Number) it2.next()).intValue()));
                    }
                    List listLLIIII = C13LP.LLIIII(arrayList3);
                    if (listLLIIII.isEmpty() || !listLLIIII.contains(Integer.valueOf(iIntValue))) {
                        Pair<C20554115bn, Map<String, Object>> pairLJIIIZ = C20554315bp.LIZIZ.LJIIIZ(EnumC20654715s1.FYP);
                        if (pairLJIIIZ.getFirst().LIZ != 0 || (second = pairLJIIIZ.getSecond()) == null) {
                            second = "{}";
                        }
                        c1est.LLLLILI = C08JS.LIZLLL(second);
                    }
                }
            }
        }, new InterfaceC1333005Jo<C0XLL>() { // from class: X.0rud
            @Override // X.InterfaceC1333005Jo
            public final String getTag() {
                return "following";
            }

            @Override // X.InterfaceC1333005Jo
            public final int getType() {
                return 1;
            }

            @Override // X.InterfaceC1333005Jo
            public final void LIZ(C1440305kP<C0XLL> c1440305kP) {
                C1EST c1est = c1440305kP.LIZJ.LIZ;
                C1ECA.LIZ.getClass();
                boolean zLIZIZ = C1ECA.LIZIZ();
                c1est.LLLLJI = new C1C0S(Boolean.valueOf(C1ECA.LIZ()), Boolean.valueOf(zLIZIZ), Boolean.valueOf(C1ECA.LIZJ()));
            }
        }, new InterfaceC1333005Jo<C0XLL>() { // from class: X.0rri
            @Override // X.InterfaceC1333005Jo
            public final String getTag() {
                return "RequestLsConfigProcessor";
            }

            @Override // X.InterfaceC1333005Jo
            public final int getType() {
                return 1;
            }

            @Override // X.InterfaceC1333005Jo
            public final void LIZ(C1440305kP<C0XLL> c1440305kP) {
                Boolean boolShouldAddNearbyExplore;
                IPoiAnchorService iPoiAnchorService = (IPoiAnchorService) PluggableExtentionKt.pluggableSpi$default(IPoiService.class, false, false, false, 14, null);
                if (iPoiAnchorService != null && (boolShouldAddNearbyExplore = iPoiAnchorService.shouldAddNearbyExplore()) != null && boolShouldAddNearbyExplore.booleanValue()) {
                    c1440305kP.LIZJ.LIZ.LLLLLIL = Boolean.TRUE;
                }
            }
        }, new InterfaceC1333005Jo<C0XLL>() { // from class: X.0zgH
            @Override // X.InterfaceC1333005Jo
            public final String getTag() {
                return "lite_mode";
            }

            @Override // X.InterfaceC1333005Jo
            public final int getType() {
                return 1;
            }

            @Override // X.InterfaceC1333005Jo
            public final void LIZ(C1440305kP<C0XLL> c1440305kP) {
                LiteModePushConfig liteModePushConfigLIZ;
                try {
                    if (C1905290zgF.LIZIZ() && (liteModePushConfigLIZ = C1905280zgE.LIZ()) != null && liteModePushConfigLIZ.pushPlan == 3) {
                        C1905300zgG.LIZ.getClass();
                        if (C1905300zgG.LIZIZ() > 0 && System.currentTimeMillis() - C1905300zgG.LIZIZ() < 604800000) {
                            LiteModePushConfig liteModePushConfigLIZ2 = C1905280zgE.LIZ();
                            if ((liteModePushConfigLIZ2 == null || liteModePushConfigLIZ2.enablePreciseExp != 0) && C1833307Fz.LIZ() != 1) {
                                return;
                            }
                            C1EST c1est = c1440305kP.LIZJ.LIZ;
                            c1est.LLLLLZ = 1;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("LiteModeRequestProcessor: ");
                            sbLIZ.append(c1est.LLLLLZ);
                            C2188811AlT.LIZIZ(sbLIZ);
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        }));
    }
}
