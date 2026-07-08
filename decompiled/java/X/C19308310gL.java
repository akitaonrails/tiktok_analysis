package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UgChannelPopup;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UgLoginBanner;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UgProfileActivityButton;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UrlModel;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;

/* JADX INFO: renamed from: X.10gL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19308310gL {
    public static boolean LJI;
    public static final C19308310gL LJII;
    public UgAwemeActivitySetting LIZ;
    public final List<WeakReference<InterfaceC1570250qxr>> LIZIZ = new ArrayList();
    public final C19308810gQ LIZJ;
    public String LIZLLL;
    public boolean LJ;
    public boolean LJFF;

    public final void LJFF() {
        InterfaceC1570250qxr interfaceC1570250qxr;
        LJI = true;
        LIZIZ();
        UgAwemeActivitySetting ugAwemeActivitySetting = this.LIZ;
        if (ugAwemeActivitySetting != null) {
            try {
                if (!ugAwemeActivitySetting.getOverallSwitch().booleanValue()) {
                    C19308810gQ c19308810gQ = this.LIZJ;
                    c19308810gQ.LIZJ = false;
                    c19308810gQ.LIZ.storeBoolean("has_showed_pop", false);
                    this.LIZJ.LIZ(0);
                    C19308810gQ c19308810gQ2 = this.LIZJ;
                    c19308810gQ2.LIZLLL = "";
                    c19308810gQ2.LIZ.storeString("activity_id_for_deeplink", "");
                }
            } catch (C316660CbA e) {
                TryCatchGuardChecker.doCheck(e);
            }
            for (Reference reference : C13LP.LLIIII(this.LIZIZ)) {
                if (reference != null && (interfaceC1570250qxr = (InterfaceC1570250qxr) reference.get()) != null) {
                    interfaceC1570250qxr.LIZ(this.LIZ);
                }
            }
        }
        if (!this.LJ || this.LJFF) {
            return;
        }
        C1440005kM.LIZ(new C739740T0a());
    }

    static {
        C19308310gL c19308310gL = C19309310gV.LIZ;
        LJII = C19309310gV.LIZ;
    }

    public final void LIZIZ() {
        UgLoginBanner loginBanner;
        UgChannelPopup channelPopup;
        try {
            this.LIZ = C0CLW.LIZIZ.LIZ.getAwemeActivitySetting();
            UrlModel resourceUrl = null;
            try {
                if (TextUtils.isEmpty(this.LIZLLL)) {
                    UgAwemeActivitySetting ugAwemeActivitySetting = this.LIZ;
                    if (!TextUtils.isEmpty((ugAwemeActivitySetting == null || (channelPopup = ugAwemeActivitySetting.getChannelPopup()) == null) ? null : channelPopup.getCampaignName())) {
                        InterfaceC19309110gT interfaceC19309110gT = C19309010gS.LIZ;
                        C15O7.LIZJ(new Callable() { // from class: X.10gN
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                C1C7U.LIZ("GoogleCampaignInfoApi$Companion@1f87.getGoogleCampaignInfo$1");
                                C844470XAv.LIZ.getClass();
                                AdvertisingIdClient.Info infoLIZIZ = C837870Wtt.LIZIZ(C844470XAv.LIZ());
                                if (infoLIZIZ != null) {
                                    C19309010gS.LIZ.LIZ(C2204961BRm.LLLLLIL(infoLIZIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOenbZrXkjWgDPmyC3alSqm15j+jPlbAhDet6rLYAtQooZ0=", null))).LJ(new InterfaceC2385309Wh() { // from class: X.10gM
                                        /* JADX WARN: Removed duplicated region for block: B:24:0x005a A[Catch: 0CbA -> 0x009c, TryCatch #0 {0CbA -> 0x009c, blocks: (B:5:0x0016, B:7:0x001b, B:9:0x0021, B:13:0x002a, B:14:0x002f, B:16:0x0035, B:18:0x003d, B:22:0x0048, B:31:0x0070, B:33:0x0079, B:34:0x007d, B:36:0x0085, B:37:0x008d, B:39:0x0093, B:24:0x005a, B:26:0x0060, B:28:0x0066, B:29:0x006a), top: B:45:0x0016 }] */
                                        /* JADX WARN: Removed duplicated region for block: B:31:0x0070 A[Catch: 0CbA -> 0x009c, TryCatch #0 {0CbA -> 0x009c, blocks: (B:5:0x0016, B:7:0x001b, B:9:0x0021, B:13:0x002a, B:14:0x002f, B:16:0x0035, B:18:0x003d, B:22:0x0048, B:31:0x0070, B:33:0x0079, B:34:0x007d, B:36:0x0085, B:37:0x008d, B:39:0x0093, B:24:0x005a, B:26:0x0060, B:28:0x0066, B:29:0x006a), top: B:45:0x0016 }] */
                                        @Override // X.InterfaceC2385309Wh
                                        /*
                                            Code decompiled incorrectly, please refer to instructions dump.
                                            To view partially-correct add '--show-bad-code' argument
                                        */
                                        public final java.lang.Object then(X.C15O7 r10) {
                                            /*
                                                r9 = this;
                                                java.lang.String r8 = "GoogleCampaignInfoApi$Companion@1f87.getGoogleCampaignInfo$1$1"
                                                X.C1C7U.LIZ(r8)
                                                java.lang.Object r0 = r10.LJIIL()
                                                if (r0 == 0) goto La0
                                                X.10gL r2 = X.C19308310gL.LJII
                                                java.lang.Object r7 = r10.LJIIL()
                                                com.ss.android.ugc.aweme.money.growth.GoogleCampaignInfo r7 = (com.ss.android.ugc.aweme.money.growth.GoogleCampaignInfo) r7
                                                r2.getClass()
                                                com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting r0 = r2.LIZ     // Catch: X.C316660CbA -> L9c
                                                r4 = 0
                                                if (r0 == 0) goto L26
                                                com.ss.android.ugc.aweme.global.config.settings.pojo.UgChannelPopup r0 = r0.getChannelPopup()     // Catch: X.C316660CbA -> L9c
                                                if (r0 == 0) goto L26
                                                java.util.List r0 = r0.getCampaignList()     // Catch: X.C316660CbA -> L9c
                                                goto L27
                                            L26:
                                                r0 = r4
                                            L27:
                                                r3 = 1
                                                if (r0 == 0) goto L5a
                                                java.util.Iterator r6 = r0.iterator()     // Catch: X.C316660CbA -> L9c
                                                r5 = 0
                                            L2f:
                                                boolean r0 = r6.hasNext()     // Catch: X.C316660CbA -> L9c
                                                if (r0 == 0) goto L58
                                                java.lang.Object r1 = r6.next()     // Catch: X.C316660CbA -> L9c
                                                java.lang.String r1 = (java.lang.String) r1     // Catch: X.C316660CbA -> L9c
                                                if (r5 != 0) goto L47
                                                java.lang.String r0 = r7.campaign     // Catch: X.C316660CbA -> L9c
                                                boolean r0 = android.text.TextUtils.equals(r0, r1)     // Catch: X.C316660CbA -> L9c
                                                if (r0 != 0) goto L47
                                                r5 = 0
                                                goto L48
                                            L47:
                                                r5 = 1
                                            L48:
                                                java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: X.C316660CbA -> L9c
                                                java.lang.String r0 = "hintGoogleCampaign："
                                                r1.append(r0)     // Catch: X.C316660CbA -> L9c
                                                r1.append(r5)     // Catch: X.C316660CbA -> L9c
                                                X.C2188811AlT.LIZIZ(r1)     // Catch: X.C316660CbA -> L9c
                                                goto L2f
                                            L58:
                                                if (r5 != 0) goto L70
                                            L5a:
                                                java.lang.String r1 = r7.campaign     // Catch: X.C316660CbA -> L9c
                                                com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting r0 = r2.LIZ     // Catch: X.C316660CbA -> L9c
                                                if (r0 == 0) goto L9a
                                                com.ss.android.ugc.aweme.global.config.settings.pojo.UgChannelPopup r0 = r0.getChannelPopup()     // Catch: X.C316660CbA -> L9c
                                                if (r0 == 0) goto L9a
                                                java.lang.String r0 = r0.getCampaignName()     // Catch: X.C316660CbA -> L9c
                                            L6a:
                                                boolean r0 = android.text.TextUtils.equals(r1, r0)     // Catch: X.C316660CbA -> L9c
                                                if (r0 == 0) goto La0
                                            L70:
                                                java.lang.String r0 = "google"
                                                r2.LJ(r0)     // Catch: X.C316660CbA -> L9c
                                                com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting r0 = r2.LIZ     // Catch: X.C316660CbA -> L9c
                                                if (r0 == 0) goto L7d
                                                java.lang.String r4 = r0.getActivityId()     // Catch: X.C316660CbA -> L9c
                                            L7d:
                                                r2.LIZLLL = r4     // Catch: X.C316660CbA -> L9c
                                                r2.LJ = r3     // Catch: X.C316660CbA -> L9c
                                                boolean r0 = r2.LJFF     // Catch: X.C316660CbA -> L9c
                                                if (r0 != 0) goto L8d
                                                X.0T0a r0 = new X.0T0a     // Catch: X.C316660CbA -> L9c
                                                r0.<init>()     // Catch: X.C316660CbA -> L9c
                                                X.C1440005kM.LIZ(r0)     // Catch: X.C316660CbA -> L9c
                                            L8d:
                                                boolean r0 = r2.LIZLLL()     // Catch: X.C316660CbA -> L9c
                                                if (r0 == 0) goto La0
                                                r2.LJII()     // Catch: X.C316660CbA -> L9c
                                                r2.LJIIIIZZ()     // Catch: X.C316660CbA -> L9c
                                                goto La0
                                            L9a:
                                                r0 = r4
                                                goto L6a
                                            L9c:
                                                r0 = move-exception
                                                com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                                            La0:
                                                X.C1C7U.LIZIZ(r8)
                                                return r10
                                            */
                                            throw new UnsupportedOperationException("Method not decompiled: X.C19308410gM.then(X.15O7):java.lang.Object");
                                        }
                                    }, C15O7.LJI, null);
                                }
                                Unit unit = Unit.LIZ;
                                C1C7U.LIZIZ("GoogleCampaignInfoApi$Companion@1f87.getGoogleCampaignInfo$1");
                                return unit;
                            }
                        });
                    }
                }
            } catch (C316660CbA e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (LIZLLL()) {
                LJII();
                LJIIIIZZ();
            }
            try {
                UgAwemeActivitySetting ugAwemeActivitySetting2 = this.LIZ;
                if (ugAwemeActivitySetting2 != null && (loginBanner = ugAwemeActivitySetting2.getLoginBanner()) != null) {
                    resourceUrl = loginBanner.getResourceUrl();
                }
                LIZJ(resourceUrl);
            } catch (C316660CbA e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        } catch (C316660CbA e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
    }

    public final boolean LIZLLL() {
        int i = this.LIZJ.LIZIZ;
        if (i == 2) {
            return false;
        }
        if (i == 1) {
            return true;
        }
        try {
            String str = this.LIZLLL;
            UgAwemeActivitySetting ugAwemeActivitySetting = this.LIZ;
            if (!TextUtils.equals(str, ugAwemeActivitySetting != null ? ugAwemeActivitySetting.getActivityId() : null)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("DeepLink not show： DeepLinkID != activityId--->");
                sbLIZ.append(this.LIZLLL);
                C2188811AlT.LIZIZ(sbLIZ);
                return false;
            }
            UgAwemeActivitySetting ugAwemeActivitySetting2 = this.LIZ;
            if (ugAwemeActivitySetting2 == null || ugAwemeActivitySetting2.getChannelPopup() == null) {
                return false;
            }
            this.LIZJ.LIZ(1);
            return true;
        } catch (C316660CbA e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public final boolean LJII() {
        UgChannelPopup channelPopup;
        try {
            UgAwemeActivitySetting ugAwemeActivitySetting = this.LIZ;
            return LIZJ((ugAwemeActivitySetting == null || (channelPopup = ugAwemeActivitySetting.getChannelPopup()) == null) ? null : channelPopup.getResourceUrl());
        } catch (C316660CbA e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public final void LJIIIIZZ() {
        UgProfileActivityButton profileActivityButton;
        try {
            UgAwemeActivitySetting ugAwemeActivitySetting = this.LIZ;
            LIZJ((ugAwemeActivitySetting == null || (profileActivityButton = ugAwemeActivitySetting.getProfileActivityButton()) == null) ? null : profileActivityButton.getResourceUrl());
        } catch (C316660CbA e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public C19308310gL() {
        C19308810gQ c19308810gQ = new C19308810gQ();
        this.LIZJ = c19308810gQ;
        this.LJFF = true;
        LIZIZ();
        this.LIZLLL = c19308810gQ.LIZLLL;
    }

    public static com.ss.android.ugc.aweme.base.model.UrlModel LJI(UrlModel urlModel) {
        List<String> urlList;
        com.ss.android.ugc.aweme.base.model.UrlModel urlModel2 = new com.ss.android.ugc.aweme.base.model.UrlModel();
        String uri = null;
        if (urlModel == null) {
            urlList = null;
        } else {
            try {
                urlList = urlModel.getUrlList();
            } catch (C316660CbA e) {
                TryCatchGuardChecker.doCheck(e);
                return urlModel2;
            }
        }
        urlModel2.setUrlList(urlList);
        if (urlModel != null) {
            uri = urlModel.getUri();
        }
        urlModel2.setUri(uri);
        return urlModel2;
    }

    public final boolean LIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("feacebook DeepLink:");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        if (TextUtils.indexOf(str, "snssdk1233://growth_activity_dialog") != 0 && TextUtils.indexOf(str, "snssdk1180://growth_activity_dialog") != 0) {
            return false;
        }
        this.LIZLLL = UriProtector.parse(str).getLastPathSegment();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("deepLinkRequestComplete:");
        sbLIZ2.append(str);
        C2188811AlT.LIZIZ(sbLIZ2);
        LJ("facebook");
        String str2 = this.LIZLLL;
        if (str2 != null) {
            C19308810gQ c19308810gQ = this.LIZJ;
            c19308810gQ.LIZLLL = str2;
            c19308810gQ.LIZ.storeString("activity_id_for_deeplink", str2);
        }
        this.LJ = true;
        if (!this.LJFF) {
            C1440005kM.LIZ(new C739740T0a());
        }
        if (LIZLLL()) {
            LJII();
            LJIIIIZZ();
        }
        return true;
    }

    public final boolean LIZJ(UrlModel urlModel) {
        com.ss.android.ugc.aweme.base.model.UrlModel urlModelLJI = LJI(urlModel);
        com.ss.android.ugc.aweme.base.model.UrlModel urlModelLJI2 = LJI(urlModel);
        if (!C1256140inE.LIZ(urlModelLJI2.getUrlList()) && C1324840ka2.LJIIZILJ(UriProtector.parse((String) ListProtector.get(urlModelLJI2.getUrlList(), 0)))) {
            return true;
        }
        C1324840ka2.LJIJ(urlModelLJI, 0, 0, new InterfaceC447230HgH() { // from class: X.10gR
            @Override // X.InterfaceC447230HgH
            public final void accept(Object obj) {
                if (obj != null) {
                    C19308310gL c19308310gL = this.LIZ;
                    if (c19308310gL.LJ && !c19308310gL.LJFF) {
                        C1440005kM.LIZ(new C739740T0a());
                    }
                }
            }
        });
        return false;
    }

    public final void LJ(String str) {
        try {
            if (this.LIZJ.LIZIZ == 2) {
                return;
            }
            String str2 = "old_user";
            if (C0CLW.LIZIZ.LIZ.getAwemeActivitySetting().getIsNewUser().booleanValue()) {
                str2 = "new_user";
            }
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("media_source", str);
            c2344009Gk.LJIIIIZZ("user_type", str2);
            C20684815ws.LJIILLIIL("coupon_targetusers", c2344009Gk.LIZ);
        } catch (C316660CbA e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
