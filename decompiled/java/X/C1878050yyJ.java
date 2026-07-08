package X;

import com.bytedance.touchpoint.api.ITouchPointService;
import com.ss.android.ugc.aweme.accountxbridge.IAccountBDXBridgeService;
import com.ss.android.ugc.aweme.audiomode.vopclone.service.IVopBDXBridgeService;
import com.ss.android.ugc.aweme.bridge.idlshelling.JSBAIMigrationALLJSBSSettings;
import com.ss.android.ugc.aweme.bridge.idlshelling.JSBAIMigrationALLJSBSTWOSettings;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.jsbridge.IPnSJSBridgeService;
import com.ss.android.ugc.aweme.ecommerce.IECommerceXBridgeService;
import com.ss.android.ugc.aweme.favorites.service.IFavoriteService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.i18n.xbridge.ICommerceXBridgetService;
import com.ss.android.ugc.aweme.i18n.xbridge.IEcPublishBridgeService;
import com.ss.android.ugc.aweme.i18n.xbridge.IMainXBridgetService;
import com.ss.android.ugc.aweme.i18n.xbridge.IOGCXBridgeService;
import com.ss.android.ugc.aweme.i18n.xbridge.IPGCXBridgeService;
import com.ss.android.ugc.aweme.i18n.xbridge.IPineDramaXBridgeService;
import com.ss.android.ugc.aweme.i18n.xbridge.IProfileBridgeService;
import com.ss.android.ugc.aweme.i18n.xbridge.ISearchBDXBridgeService;
import com.ss.android.ugc.aweme.i18n.xbridge.ITakoXBridgeService;
import com.ss.android.ugc.aweme.i18n.xbridge.ITemplateBridgeService;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.inbox.service.IInboxXBridgeService;
import com.ss.android.ugc.aweme.jsb.IAnchorBDXBridgeService;
import com.ss.android.ugc.aweme.live.ILiveBDXBridgeService;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.localservice.service.ILocalServicePassThroughService;
import com.ss.android.ugc.aweme.music.service.IMusicAddToDspCoreService;
import com.ss.android.ugc.aweme.opensdkservice.IOpenIABService;
import com.ss.android.ugc.aweme.outreach.dispersion.spi.OutreachOperationService;
import com.ss.android.ugc.aweme.pipo.IPipoService;
import com.ss.android.ugc.aweme.pipo.ccdc.IPipoCcdcService;
import com.ss.android.ugc.aweme.rich.jsb.ICommerceMultiHostBridgeList;
import com.ss.android.ugc.aweme.service.IPitayaOfflineService;
import com.ss.android.ugc.aweme.setting.services.ICreatorToolService;
import com.ss.android.ugc.aweme.share.ShareExtService;
import com.ss.android.ugc.aweme.share.ShareH5Service;
import com.ss.android.ugc.aweme.shortvideo.jsb.ICreativeToolXBridgeService;
import com.ss.android.ugc.aweme.ug.IUgCommonService;
import com.ss.android.ugc.aweme.upvote.service.IUpvoteService;
import com.ss.android.ugc.tiktok.location_api.service.ILocationService;
import com.ss.android.ugc.tiktok.pns.feedsafety.api.filtervideo.IFilterVideoService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yyJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1878050yyJ {
    public static final C1878050yyJ LIZJ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZLLL;
    public volatile C1878330yyl LIZ;
    public volatile C1878330yyl LIZIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1878050yyJ.class, "bdxbridgeRegisters", "getBdxbridgeRegisters()Lknit/Option;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1878050yyJ.class, "bdxbridgeAdapterRegister", "getBdxbridgeAdapterRegister()Lknit/Option;", 0);
        c09r3.getClass();
        LIZLLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
        LIZJ = new C1878050yyJ();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0534  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0542  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x055e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0368  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZLLL() {
        /*
            Method dump skipped, instruction units count: 1397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1878050yyJ.LIZLLL():void");
    }

    public final C1878330yyl<List<C04P7>> LIZ() {
        C1878330yyl<List<C04P7>> c1878330yyl = this.LIZIZ;
        if (c1878330yyl == null) {
            synchronized (this) {
                c1878330yyl = this.LIZIZ;
                if (c1878330yyl == null) {
                    C1878330yyl<List<C04P7>> c1878330yyl2 = new C1878330yyl<>(C13LQ.LJJLL(new Object[]{new C04P7() { // from class: X.0dhd
                        @Override // X.C04P7
                        public final List<Class<? extends InterfaceC1063710dmr>> LIZ() {
                            ArrayList arrayList = new ArrayList();
                            if (C1544000qHW.LJIIZILJ) {
                                arrayList.add(C1058080ddm.class);
                                arrayList.add(C1060640dhu.class);
                                arrayList.add(C1061120dig.class);
                                arrayList.add(C1030560cvO.class);
                                arrayList.add(C1030540cvM.class);
                                arrayList.add(C1030520cvK.class);
                                arrayList.add(C1020730cfX.class);
                                arrayList.add(C1062560dl0.class);
                                arrayList.add(C1038690d8V.class);
                                arrayList.add(C1061900djw.class);
                                arrayList.add(C1050560dRe.class);
                                arrayList.add(C686240Qvu.class);
                                arrayList.add(C1061340dj2.class);
                                arrayList.add(C1060570dhn.class);
                                arrayList.add(C1060590dhp.class);
                                arrayList.add(C1060610dhr.class);
                                arrayList.add(C1061500djI.class);
                                arrayList.add(C1060550dhl.class);
                                arrayList.add(C1060630dht.class);
                                arrayList.add(C1061670djZ.class);
                                arrayList.add(C1061040diY.class);
                                arrayList.add(C1062590dl3.class);
                                arrayList.add(C1064250dnj.class);
                                arrayList.add(C1063460dmS.class);
                                arrayList.add(C20108413m6.class);
                                arrayList.add(C1062640dl8.class);
                                arrayList.add(C1062540dky.class);
                                arrayList.add(C1061650djX.class);
                                arrayList.add(C1062010dk7.class);
                                arrayList.add(C686200Qvq.class);
                                arrayList.add(C1061240dis.class);
                                arrayList.add(C1062520dkw.class);
                                arrayList.add(C1058670dej.class);
                                arrayList.add(C1028310crl.class);
                                arrayList.add(C1061990dk5.class);
                                arrayList.add(C1057960dda.class);
                                arrayList.add(C1020350cev.class);
                                arrayList.add(C1062680dlC.class);
                                arrayList.add(C1062610dl5.class);
                                arrayList.add(C1060440dha.class);
                                arrayList.add(C1055560dZi.class);
                                arrayList.add(C1061960dk2.class);
                                arrayList.add(C1061630djV.class);
                                arrayList.add(C1061300diy.class);
                                arrayList.add(C1060490dhf.class);
                                arrayList.add(C1020670cfR.class);
                                arrayList.add(C1062050dkB.class);
                                arrayList.add(C1060250dhH.class);
                                arrayList.add(C1062670dlB.class);
                                arrayList.add(C1061820djo.class);
                                arrayList.add(C1061840djq.class);
                                arrayList.add(C1061860djs.class);
                                arrayList.add(C1038670d8T.class);
                                arrayList.add(C1062690dlD.class);
                                arrayList.add(C1048310dO1.class);
                                arrayList.add(C1062030dk9.class);
                                arrayList.add(C1020620cfM.class);
                                arrayList.add(C0TV1.class);
                                arrayList.add(C1047160dMA.class);
                                arrayList.add(C1058060ddk.class);
                                arrayList.add(C1061920djy.class);
                                arrayList.add(C1058040ddi.class);
                                arrayList.add(C1058640deg.class);
                                arrayList.add(C1061020diW.class);
                                arrayList.add(C1061320dj0.class);
                                arrayList.add(C1061520djK.class);
                                arrayList.add(C1061530djL.class);
                                arrayList.add(C1061510djJ.class);
                                arrayList.add(C1061940dk0.class);
                            } else {
                                JSBAIMigrationALLJSBSSettings.JSBAIMigrationALLJSBSModel jSBAIMigrationALLJSBSModelLIZ = JSBAIMigrationALLJSBSSettings.LIZ();
                                if (jSBAIMigrationALLJSBSModelLIZ.enable) {
                                    if (jSBAIMigrationALLJSBSModelLIZ.request) {
                                        arrayList.add(C1058080ddm.class);
                                    }
                                    if (jSBAIMigrationALLJSBSModelLIZ.open2sv) {
                                        arrayList.add(C1060640dhu.class);
                                    }
                                    if (jSBAIMigrationALLJSBSModelLIZ.popDigitalWellbeingVerifyView) {
                                        arrayList.add(C1061120dig.class);
                                    }
                                    if (jSBAIMigrationALLJSBSModelLIZ.openHybrid) {
                                        arrayList.add(C1030560cvO.class);
                                    }
                                    if (jSBAIMigrationALLJSBSModelLIZ.getSharedMemoryItem) {
                                        arrayList.add(C1030540cvM.class);
                                    }
                                    if (jSBAIMigrationALLJSBSModelLIZ.setSharedMemoryItem) {
                                        arrayList.add(C1030520cvK.class);
                                    }
                                    if (jSBAIMigrationALLJSBSModelLIZ.getTheme) {
                                        arrayList.add(C1020730cfX.class);
                                    }
                                    if (jSBAIMigrationALLJSBSModelLIZ.initPipo) {
                                        arrayList.add(C1062560dl0.class);
                                    }
                                    if (jSBAIMigrationALLJSBSModelLIZ.share) {
                                        arrayList.add(C1038690d8V.class);
                                    }
                                    if (jSBAIMigrationALLJSBSModelLIZ.uniUserInfo) {
                                        arrayList.add(C1061900djw.class);
                                    }
                                    if (jSBAIMigrationALLJSBSModelLIZ.getContainerData) {
                                        arrayList.add(C1050560dRe.class);
                                    }
                                    if (jSBAIMigrationALLJSBSModelLIZ.searchKeywordChange) {
                                        arrayList.add(C686240Qvu.class);
                                    }
                                    if (jSBAIMigrationALLJSBSModelLIZ.IBEPreRenderReady) {
                                        arrayList.add(C1061340dj2.class);
                                    }
                                    if (jSBAIMigrationALLJSBSModelLIZ.recentLoginUsersInfo) {
                                        arrayList.add(C1060570dhn.class);
                                    }
                                    if (jSBAIMigrationALLJSBSModelLIZ.loginFromH5) {
                                        arrayList.add(C1060590dhp.class);
                                    }
                                    if (jSBAIMigrationALLJSBSModelLIZ.loginH5Failed) {
                                        arrayList.add(C1060610dhr.class);
                                    }
                                    if (jSBAIMigrationALLJSBSModelLIZ.getPurchaseItemList) {
                                        arrayList.add(C1061500djI.class);
                                    }
                                    if (jSBAIMigrationALLJSBSModelLIZ.update_account_info) {
                                        arrayList.add(C1060550dhl.class);
                                    }
                                    if (jSBAIMigrationALLJSBSModelLIZ.downloadMedia) {
                                        arrayList.add(C1060630dht.class);
                                    }
                                    if (jSBAIMigrationALLJSBSModelLIZ.copyTextToPasteBoard) {
                                        arrayList.add(C1061670djZ.class);
                                    }
                                    if (jSBAIMigrationALLJSBSModelLIZ.openLiveRoom) {
                                        arrayList.add(C1061040diY.class);
                                    }
                                    if (jSBAIMigrationALLJSBSModelLIZ.open_effect_record) {
                                        arrayList.add(C1062590dl3.class);
                                    }
                                    if (jSBAIMigrationALLJSBSModelLIZ.xrequest) {
                                        arrayList.add(C1064250dnj.class);
                                    }
                                    if (jSBAIMigrationALLJSBSModelLIZ.xopen) {
                                        arrayList.add(C1063460dmS.class);
                                    }
                                    if (jSBAIMigrationALLJSBSModelLIZ.prefetch) {
                                        arrayList.add(C20108413m6.class);
                                    }
                                    if (jSBAIMigrationALLJSBSModelLIZ.open_short_video) {
                                        arrayList.add(C1062640dl8.class);
                                    }
                                    if (jSBAIMigrationALLJSBSModelLIZ.popTuringVerifyView) {
                                        arrayList.add(C1062540dky.class);
                                    }
                                    if (jSBAIMigrationALLJSBSModelLIZ.routeToWhatsapp) {
                                        arrayList.add(C1061650djX.class);
                                    }
                                    if (jSBAIMigrationALLJSBSModelLIZ.scan) {
                                        arrayList.add(C1062010dk7.class);
                                    }
                                    if (jSBAIMigrationALLJSBSModelLIZ.openAwemeDetail) {
                                        arrayList.add(C686200Qvq.class);
                                    }
                                    if (jSBAIMigrationALLJSBSModelLIZ.openRecord) {
                                        arrayList.add(C1061240dis.class);
                                    }
                                    if (jSBAIMigrationALLJSBSModelLIZ.openVideoEdit) {
                                        arrayList.add(C1062520dkw.class);
                                    }
                                    if (jSBAIMigrationALLJSBSModelLIZ.getAppInfo) {
                                        arrayList.add(C1058670dej.class);
                                    }
                                    if (jSBAIMigrationALLJSBSModelLIZ.getSettings) {
                                        arrayList.add(C1028310crl.class);
                                    }
                                    if (jSBAIMigrationALLJSBSModelLIZ.loadFeedsFlow) {
                                        arrayList.add(C1061990dk5.class);
                                    }
                                    if (jSBAIMigrationALLJSBSModelLIZ.setNativeItem) {
                                        arrayList.add(C1057960dda.class);
                                    }
                                    if (jSBAIMigrationALLJSBSModelLIZ.showToast) {
                                        arrayList.add(C1020350cev.class);
                                    }
                                    if (jSBAIMigrationALLJSBSModelLIZ.uploadFile) {
                                        arrayList.add(C1062680dlC.class);
                                    }
                                    if (jSBAIMigrationALLJSBSModelLIZ.fileSelection) {
                                        arrayList.add(C1062610dl5.class);
                                    }
                                    if (jSBAIMigrationALLJSBSModelLIZ.broadcast) {
                                        arrayList.add(C1060440dha.class);
                                    }
                                    if (jSBAIMigrationALLJSBSModelLIZ.isAppInstalled) {
                                        arrayList.add(C1055560dZi.class);
                                    }
                                    if (jSBAIMigrationALLJSBSModelLIZ.isAppInstall) {
                                        arrayList.add(C1061960dk2.class);
                                    }
                                    if (jSBAIMigrationALLJSBSModelLIZ.openSingletonSchema) {
                                        arrayList.add(C1061630djV.class);
                                    }
                                    if (jSBAIMigrationALLJSBSModelLIZ.openRechargePanel) {
                                        arrayList.add(C1061300diy.class);
                                    }
                                    if (jSBAIMigrationALLJSBSModelLIZ.charge) {
                                        arrayList.add(C1060490dhf.class);
                                    }
                                    if (jSBAIMigrationALLJSBSModelLIZ.loadGeckoResources) {
                                        arrayList.add(C1020670cfR.class);
                                    }
                                    if (jSBAIMigrationALLJSBSModelLIZ.noticePermission) {
                                        arrayList.add(C1062050dkB.class);
                                    }
                                    if (jSBAIMigrationALLJSBSModelLIZ.loginWithPlatform) {
                                        arrayList.add(C1060250dhH.class);
                                    }
                                }
                                JSBAIMigrationALLJSBSTWOSettings.JSBAIMigrationALLJSBSTWOModel jSBAIMigrationALLJSBSTWOModelLIZ = JSBAIMigrationALLJSBSTWOSettings.LIZ();
                                if (jSBAIMigrationALLJSBSTWOModelLIZ.enable) {
                                    if (jSBAIMigrationALLJSBSTWOModelLIZ.followPACheckMethod) {
                                        arrayList.add(C1062670dlB.class);
                                    }
                                    if (jSBAIMigrationALLJSBSTWOModelLIZ.getDigitalWellbeingStatus) {
                                        arrayList.add(C1061820djo.class);
                                    }
                                    if (jSBAIMigrationALLJSBSTWOModelLIZ.getFormattedTime) {
                                        arrayList.add(C1061840djq.class);
                                    }
                                    if (jSBAIMigrationALLJSBSTWOModelLIZ.setDigitalWellbeingStatus) {
                                        arrayList.add(C1061860djs.class);
                                    }
                                    if (jSBAIMigrationALLJSBSTWOModelLIZ.shareSearch) {
                                        arrayList.add(C1038670d8T.class);
                                    }
                                    if (jSBAIMigrationALLJSBSTWOModelLIZ.fetch) {
                                        arrayList.add(C1062690dlD.class);
                                    }
                                    if (jSBAIMigrationALLJSBSTWOModelLIZ.sendLog) {
                                        arrayList.add(C1048310dO1.class);
                                    }
                                    if (jSBAIMigrationALLJSBSTWOModelLIZ.sendLogV3) {
                                        arrayList.add(C1062030dk9.class);
                                    }
                                    if (jSBAIMigrationALLJSBSTWOModelLIZ.adInfo) {
                                        arrayList.add(C1020620cfM.class);
                                    }
                                    if (jSBAIMigrationALLJSBSTWOModelLIZ.copyToClipboard) {
                                        arrayList.add(C0TV1.class);
                                    }
                                    if (jSBAIMigrationALLJSBSTWOModelLIZ.close) {
                                        arrayList.add(C1047160dMA.class);
                                    }
                                    if (jSBAIMigrationALLJSBSTWOModelLIZ.login) {
                                        arrayList.add(C1058060ddk.class);
                                    }
                                    if (jSBAIMigrationALLJSBSTWOModelLIZ.userInfo) {
                                        arrayList.add(C1061920djy.class);
                                    }
                                    if (jSBAIMigrationALLJSBSTWOModelLIZ.appInfo) {
                                        arrayList.add(C1058040ddi.class);
                                    }
                                    if (jSBAIMigrationALLJSBSTWOModelLIZ.uniAppInfo) {
                                        arrayList.add(C1058640deg.class);
                                    }
                                    if (jSBAIMigrationALLJSBSTWOModelLIZ.feedbackSubmitSuccess) {
                                        arrayList.add(C1061020diW.class);
                                    }
                                    if (jSBAIMigrationALLJSBSTWOModelLIZ.IBEDidFinishInteraction) {
                                        arrayList.add(C1061320dj0.class);
                                    }
                                    if (jSBAIMigrationALLJSBSTWOModelLIZ.rechargeV3Failed) {
                                        arrayList.add(C1061520djK.class);
                                    }
                                    if (jSBAIMigrationALLJSBSTWOModelLIZ.openGBLOCRpage) {
                                        arrayList.add(C1061530djL.class);
                                    }
                                    if (jSBAIMigrationALLJSBSTWOModelLIZ.preloadLiveWalletCashier) {
                                        arrayList.add(C1061510djJ.class);
                                    }
                                    if (jSBAIMigrationALLJSBSTWOModelLIZ.IBEDidStartInteraction) {
                                        arrayList.add(C1061940dk0.class);
                                    }
                                }
                            }
                            C1060000dgs.LIZ.getClass();
                            arrayList.addAll(C1060000dgs.LIZ());
                            return arrayList;
                        }
                    }}));
                    this.LIZIZ = c1878330yyl2;
                    return c1878330yyl2;
                }
            }
        }
        return c1878330yyl;
    }

    public final C1878330yyl<List<InterfaceC1472505pb>> LIZIZ() {
        C1878330yyl<List<InterfaceC1472505pb>> c1878330yyl = this.LIZ;
        if (c1878330yyl == null) {
            synchronized (this) {
                c1878330yyl = this.LIZ;
                if (c1878330yyl == null) {
                    C1878330yyl<List<InterfaceC1472505pb>> c1878330yyl2 = new C1878330yyl<>(C13LQ.LJJLL(new Object[]{new InterfaceC1472505pb() { // from class: X.07dS
                        @Override // X.InterfaceC1472505pb
                        public final List<Class<? extends AbstractC1549150qPp<?, ?>>> LIZ() {
                            return Collections.singletonList(C338500DOu.class);
                        }
                    }, new InterfaceC1472505pb() { // from class: X.07dQ
                        @Override // X.InterfaceC1472505pb
                        public final List<Class<? extends AbstractC1549150qPp<?, ?>>> LIZ() {
                            return ((Boolean) C076E.LIZ.getValue()).booleanValue() ? C1009360cNC.LJ() : C13BV.INSTANCE;
                        }
                    }, new InterfaceC1472505pb() { // from class: X.0sBr
                        @Override // X.InterfaceC1472505pb
                        public final List<Class<? extends AbstractC1549150qPp<?, ?>>> LIZ() {
                            return C1697810uHb.LJIIJJI(C0KTQ.class, C1617260sBg.class, C0KTS.class, C1617240sBe.class);
                        }
                    }, new InterfaceC1472505pb() { // from class: X.07dU
                        @Override // X.InterfaceC1472505pb
                        public final List<Class<? extends AbstractC1549150qPp<?, ?>>> LIZ() {
                            return Collections.singletonList(C906920Zhy.class);
                        }
                    }, new C1381670m3h(), new InterfaceC1472505pb() { // from class: X.07dR
                        @Override // X.InterfaceC1472505pb
                        public final List<Class<? extends AbstractC1549150qPp<?, ?>>> LIZ() {
                            return Collections.singletonList(C2196711AyD.class);
                        }
                    }, new InterfaceC1472505pb() { // from class: X.05pJ
                        @Override // X.InterfaceC1472505pb
                        public final List<Class<? extends AbstractC1549150qPp<?, ?>>> LIZ() {
                            return C1697810uHb.LJIIJJI(C1462605o0.class, C1470505pH.class, C1462805o2.class, C1471905pV.class);
                        }
                    }, new InterfaceC1472505pb() { // from class: X.07di
                        @Override // X.InterfaceC1472505pb
                        public final List<Class<? extends AbstractC1549150qPp<?, ?>>> LIZ() {
                            return Collections.singletonList(C0KFL.class);
                        }
                    }, new InterfaceC1472505pb() { // from class: X.05pK
                        @Override // X.InterfaceC1472505pb
                        public final List<Class<? extends AbstractC1549150qPp<?, ?>>> LIZ() {
                            return Collections.singletonList(C1466605oe.class);
                        }
                    }}));
                    this.LIZ = c1878330yyl2;
                    return c1878330yyl2;
                }
            }
        }
        return c1878330yyl;
    }

    public static final void LIZJ() {
        List<Class<? extends AbstractC1549150qPp<?, ?>>> listLIZ;
        IPipoService iPipoService;
        Class<? extends InterfaceC1063710dmr> clsLJIIZILJ;
        IPipoService iPipoService2;
        Class<? extends InterfaceC1063710dmr> clsLJIIZILJ2;
        IPipoService iPipoService3;
        Class<? extends InterfaceC1063710dmr> clsLJIIZILJ3;
        IPipoService iPipoService4;
        Class<? extends InterfaceC1063710dmr> clsLJIIZILJ4;
        IPipoService iPipoService5;
        Class<? extends InterfaceC1063710dmr> clsLJIIZILJ5;
        IPipoService iPipoService6;
        Class<? extends InterfaceC1063710dmr> clsLJIIZILJ6;
        IPipoService iPipoService7;
        Class<? extends InterfaceC1063710dmr> clsLJIIZILJ7;
        ArrayList arrayList;
        C13BV c13bvProvideXBridgetIDLMethodList;
        List<Class<? extends AbstractC1549150qPp<?, ?>>> listProvideXBridgetIDLMethodList;
        List<Class<? extends AbstractC1549150qPp<?, ?>>> listLIZIZ;
        List<Class<? extends AbstractC1549150qPp<?, ?>>> listProvideXBridgetIDLMethodList2;
        List<Class<? extends AbstractC1549150qPp<?, ?>>> listLJIIIIZZ;
        List<Class<? extends AbstractC1549150qPp<?, ?>>> listProvideXBridgetIDLMethodList3;
        List<Class<? extends AbstractC1549150qPp<?, ?>>> listProvideXBridgetIDLMethodList4;
        List<Class<? extends AbstractC1549150qPp<?, ?>>> listProvideXBridgetIDLMethodList5;
        List<Class<? extends InterfaceC1063710dmr>> listProvideXBridgetIDLMethodList6;
        Class<? extends InterfaceC1063710dmr> clsLJIIZILJ8;
        Class<? extends InterfaceC1063710dmr> clsLJIIZILJ9;
        Class<? extends InterfaceC1063710dmr> clsLJIIZILJ10;
        Class<? extends InterfaceC1063710dmr> clsLJIIZILJ11;
        Class<? extends InterfaceC1063710dmr> clsLJIIZILJ12;
        Class<? extends InterfaceC1063710dmr> clsLJIIZILJ13;
        Class<? extends InterfaceC1063710dmr> clsLJIIZILJ14;
        List<Class<? extends InterfaceC1063710dmr>> listProvideXBridgetIDLMethodList7;
        List<Class<? extends AbstractC1549150qPp<?, ?>>> listLIZ2;
        List<Class<? extends AbstractC1549150qPp<?, ?>>> listProvideXBridgetIDLMethodList8;
        List<Class<? extends InterfaceC1063710dmr>> listLIZ3;
        List<Class<? extends AbstractC1549150qPp<?, ?>>> listLJIIIIZZ2;
        List<Class<? extends AbstractC1549150qPp<?, ?>>> listLJIILIIL;
        List<Class<? extends AbstractC1549150qPp<?, ?>>> listProvideXBridgetIDLMethodList9;
        Class<? extends InterfaceC1063710dmr> clsLJFF;
        List<Class<? extends AbstractC1549150qPp<?, ?>>> listProvideXBridgetIDLMethodList10;
        C13BV c13bvProvideXBridgetIDLMethodList2;
        List<Class<? extends InterfaceC1063710dmr>> listLJIIIIZZ3;
        ILiveBDXBridgeService iLiveBDXBridgeServiceL3;
        List<Class<? extends AbstractC1549150qPp<?, ?>>> listProvideXBridgetIDLMethodList11;
        List<Class<? extends InterfaceC1063710dmr>> listLIZ4;
        InterfaceC1765906vp imXBridgeProviderService;
        List<Class<? extends AbstractC1549150qPp<?, ?>>> listLIZ5;
        List<Class<? extends InterfaceC1063710dmr>> listProvideXBridgetIDLMethodList12;
        List<Class<? extends InterfaceC1063710dmr>> listProvideXBridgetIDLMethodList13;
        List<Class<? extends AbstractC1549150qPp<?, ?>>> listProvideXBridgetIDLMethodList14;
        List<Class<? extends AbstractC1549150qPp<?, ?>>> listProvideXBridgetIDLMethodList15;
        List<Class<? extends AbstractC1549150qPp<?, ?>>> listProvideXBridgetIDLMethodList16;
        List<Class<? extends InterfaceC1063710dmr>> listProvideXBridgetIDLMethodList17;
        List<Class<? extends InterfaceC1063710dmr>> listProvideXBridgetIDLMethodList18;
        List<Class<? extends AbstractC1549150qPp<?, ?>>> listProvideXBridgetIDLMethodList19;
        List<Class<? extends AbstractC1549150qPp<?, ?>>> listProvideXBridgetIDLMethodList20;
        List<Class<? extends AbstractC1549150qPp<?, ?>>> listProvideXBridgetIDLMethodList21;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (C1544000qHW.LIZ.get() && C1544000qHW.LIZJ) {
            C20684815ws.LJIILLIIL("bdxbridge_init_event", C2097608Jq.LJIIIIZZ(new Pair("bdxbridge_init_cost", String.valueOf(System.currentTimeMillis() - jCurrentTimeMillis)), new Pair("optimized", "true"), new Pair("only_one_time", "true")));
            return;
        }
        C1543490qGh.LIZIZ(C1872260yoy.class, null, 6);
        C1543490qGh.LIZIZ(C1052460dUi.class, null, 6);
        C1543490qGh.LIZIZ(C1052560dUs.class, null, 6);
        C1543490qGh.LIZIZ(C844040X9e.class, null, 6);
        C1543490qGh.LIZIZ(C0TWZ.class, null, 6);
        C1543490qGh.LIZIZ(C1498790p6b.class, null, 6);
        C1543490qGh.LIZIZ(C0XJR.class, null, 6);
        C1543490qGh.LIZIZ(C1844710y6X.class, null, 6);
        C1543490qGh.LIZIZ(C20690615xo.class, null, 6);
        C1543490qGh.LIZIZ(C1503060pDU.class, null, 6);
        C1543490qGh.LIZIZ(C1887580zDg.class, null, 6);
        C1543490qGh.LIZIZ(C2198161B1i.class, null, 6);
        C1543490qGh.LIZIZ(C2198261B1s.class, null, 6);
        C1543490qGh.LIZIZ(C1553960qXa.class, null, 6);
        C1543490qGh.LIZIZ(C1553970qXb.class, null, 6);
        C1543490qGh.LIZIZ(C1503540pEG.class, null, 6);
        Boolean bool = Boolean.TRUE;
        C1063910dnB.LIZ(bool, "BDXBridge_bridge_idl_migration");
        C1543490qGh.LIZIZ(C1531490pxL.class, null, 6);
        C1063910dnB.LIZ(bool, "bridge_idl_migration_xGetAPIParams");
        C1543490qGh.LIZIZ(C1063930dnD.class, null, 6);
        C1543490qGh.LIZIZ(C1873220yqW.class, null, 6);
        C1543490qGh.LIZIZ(C1873200yqU.class, null, 6);
        C1063910dnB.LIZ(bool, "bridge_idl_migration_xPublishEvent");
        LIZJ.getClass();
        LIZLLL();
        C1543490qGh.LIZIZ(C1549380qQC.class, null, 6);
        C1543490qGh.LIZIZ(C1540470qBp.class, null, 6);
        C844470XAv.LIZ.getClass();
        if (Intrinsics.LJFF(C844470XAv.LJIILL, "local_test")) {
            C1543490qGh.LIZIZ(C2389009Xs.class, null, 6);
        }
        IMainXBridgetService iMainXBridgetService = (IMainXBridgetService) PluggableExtentionKt.pluggableSpi$default(IMainXBridgetService.class, false, false, false, 14, null);
        if (iMainXBridgetService != null && (listProvideXBridgetIDLMethodList21 = iMainXBridgetService.provideXBridgetIDLMethodList()) != null) {
            Iterator<Class<? extends AbstractC1549150qPp<?, ?>>> it2 = listProvideXBridgetIDLMethodList21.iterator();
            while (it2.hasNext()) {
                C1543490qGh.LIZIZ(it2.next(), null, 6);
            }
        }
        ICommerceXBridgetService iCommerceXBridgetService = (ICommerceXBridgetService) PluggableExtentionKt.pluggableSpi$default(ICommerceXBridgetService.class, false, false, false, 14, null);
        if (iCommerceXBridgetService != null && (listProvideXBridgetIDLMethodList20 = iCommerceXBridgetService.provideXBridgetIDLMethodList()) != null) {
            Iterator<Class<? extends AbstractC1549150qPp<?, ?>>> it3 = listProvideXBridgetIDLMethodList20.iterator();
            while (it3.hasNext()) {
                C1543490qGh.LIZIZ(it3.next(), null, 6);
            }
        }
        ICommerceMultiHostBridgeList iCommerceMultiHostBridgeList = (ICommerceMultiHostBridgeList) PluggableExtentionKt.pluggableSpi$default(ICommerceMultiHostBridgeList.class, false, false, false, 14, null);
        if (iCommerceMultiHostBridgeList != null && (listProvideXBridgetIDLMethodList19 = iCommerceMultiHostBridgeList.provideXBridgetIDLMethodList()) != null) {
            Iterator<Class<? extends AbstractC1549150qPp<?, ?>>> it4 = listProvideXBridgetIDLMethodList19.iterator();
            while (it4.hasNext()) {
                C1543490qGh.LIZIZ(it4.next(), null, 6);
            }
        }
        IECommerceXBridgeService iECommerceXBridgeService = (IECommerceXBridgeService) PluggableExtentionKt.pluggableSpi$default(IECommerceXBridgeService.class, false, false, false, 14, null);
        if (iECommerceXBridgeService != null) {
            iECommerceXBridgeService.LIZ();
        }
        ICreativeToolXBridgeService iCreativeToolXBridgeService = (ICreativeToolXBridgeService) PluggableExtentionKt.pluggableSpi$default(ICreativeToolXBridgeService.class, false, false, false, 14, null);
        if (iCreativeToolXBridgeService != null && (listProvideXBridgetIDLMethodList18 = iCreativeToolXBridgeService.provideXBridgetIDLMethodList()) != null) {
            Iterator<Class<? extends InterfaceC1063710dmr>> it5 = listProvideXBridgetIDLMethodList18.iterator();
            while (it5.hasNext()) {
                C1543490qGh.LIZIZ(it5.next(), null, 6);
            }
        }
        IInboxXBridgeService iInboxXBridgeService = (IInboxXBridgeService) PluggableExtentionKt.pluggableSpi$default(IInboxXBridgeService.class, false, false, false, 14, null);
        if (iInboxXBridgeService != null && (listProvideXBridgetIDLMethodList17 = iInboxXBridgeService.provideXBridgetIDLMethodList()) != null) {
            Iterator<Class<? extends InterfaceC1063710dmr>> it6 = listProvideXBridgetIDLMethodList17.iterator();
            while (it6.hasNext()) {
                C1543490qGh.LIZIZ(it6.next(), null, 6);
            }
        }
        ISearchBDXBridgeService iSearchBDXBridgeService = (ISearchBDXBridgeService) PluggableExtentionKt.pluggableSpi$default(ISearchBDXBridgeService.class, false, false, false, 14, null);
        if (iSearchBDXBridgeService != null && (listProvideXBridgetIDLMethodList16 = iSearchBDXBridgeService.provideXBridgetIDLMethodList()) != null) {
            Iterator<Class<? extends AbstractC1549150qPp<?, ?>>> it7 = listProvideXBridgetIDLMethodList16.iterator();
            while (it7.hasNext()) {
                C1543490qGh.LIZIZ(it7.next(), null, 6);
            }
        }
        ITakoXBridgeService iTakoXBridgeService = (ITakoXBridgeService) PluggableExtentionKt.pluggableSpi$default(ITakoXBridgeService.class, false, false, false, 14, null);
        if (iTakoXBridgeService != null && (listProvideXBridgetIDLMethodList15 = iTakoXBridgeService.provideXBridgetIDLMethodList()) != null) {
            Iterator<Class<? extends AbstractC1549150qPp<?, ?>>> it8 = listProvideXBridgetIDLMethodList15.iterator();
            while (it8.hasNext()) {
                C1543490qGh.LIZIZ(it8.next(), null, 6);
            }
        }
        IPGCXBridgeService iPGCXBridgeService = (IPGCXBridgeService) PluggableExtentionKt.pluggableSpi$default(IPGCXBridgeService.class, false, false, false, 14, null);
        if (iPGCXBridgeService != null && (listProvideXBridgetIDLMethodList14 = iPGCXBridgeService.provideXBridgetIDLMethodList()) != null) {
            Iterator<Class<? extends AbstractC1549150qPp<?, ?>>> it9 = listProvideXBridgetIDLMethodList14.iterator();
            while (it9.hasNext()) {
                C1543490qGh.LIZIZ(it9.next(), null, 6);
            }
        }
        IAccountBDXBridgeService iAccountBDXBridgeService = (IAccountBDXBridgeService) PluggableExtentionKt.pluggableSpi$default(IAccountBDXBridgeService.class, false, false, false, 14, null);
        if (iAccountBDXBridgeService != null && (listProvideXBridgetIDLMethodList13 = iAccountBDXBridgeService.provideXBridgetIDLMethodList()) != null) {
            Iterator<Class<? extends InterfaceC1063710dmr>> it10 = listProvideXBridgetIDLMethodList13.iterator();
            while (it10.hasNext()) {
                C1543490qGh.LIZIZ(it10.next(), null, 6);
            }
        }
        IAnchorBDXBridgeService iAnchorBDXBridgeService = (IAnchorBDXBridgeService) PluggableExtentionKt.pluggableSpi$default(IAnchorBDXBridgeService.class, false, false, false, 14, null);
        if (iAnchorBDXBridgeService != null && (listProvideXBridgetIDLMethodList12 = iAnchorBDXBridgeService.provideXBridgetIDLMethodList()) != null) {
            Iterator<Class<? extends InterfaceC1063710dmr>> it11 = listProvideXBridgetIDLMethodList12.iterator();
            while (it11.hasNext()) {
                C1543490qGh.LIZIZ(it11.next(), null, 6);
            }
        }
        IIMService iIMService = (IIMService) PluggableExtentionKt.pluggableSpi$default(IIMService.class, false, false, false, 14, null);
        if (iIMService != null && (imXBridgeProviderService = iIMService.getImXBridgeProviderService()) != null && (listLIZ5 = imXBridgeProviderService.LIZ()) != null) {
            Iterator<Class<? extends AbstractC1549150qPp<?, ?>>> it12 = listLIZ5.iterator();
            while (it12.hasNext()) {
                C1543490qGh.LIZIZ(it12.next(), null, 6);
            }
        }
        ComplianceServiceProvider.LIZIZ.getClass();
        List<Class<? extends AbstractC1549150qPp<?, ?>>> listProvideXBridgetIDLMethodList22 = ComplianceServiceProvider.LJIIJ().provideXBridgetIDLMethodList();
        if (listProvideXBridgetIDLMethodList22 != null) {
            Iterator<Class<? extends AbstractC1549150qPp<?, ?>>> it13 = listProvideXBridgetIDLMethodList22.iterator();
            while (it13.hasNext()) {
                C1543490qGh.LIZIZ(it13.next(), null, 6);
            }
        }
        List<Class<? extends AbstractC1549150qPp<?, ?>>> listProvideXBridgetIDLMethodList23 = ComplianceServiceProvider.LJI().provideXBridgetIDLMethodList();
        if (listProvideXBridgetIDLMethodList23 != null) {
            Iterator<Class<? extends AbstractC1549150qPp<?, ?>>> it14 = listProvideXBridgetIDLMethodList23.iterator();
            while (it14.hasNext()) {
                C1543490qGh.LIZIZ(it14.next(), null, 6);
            }
        }
        IFilterVideoService iFilterVideoService = (IFilterVideoService) PluggableExtentionKt.pluggableSpi$default(IFilterVideoService.class, false, false, false, 14, null);
        if (iFilterVideoService == null || (listLIZ = iFilterVideoService.LIZ()) == null) {
            listLIZ = C13BV.INSTANCE;
        }
        Iterator<Class<? extends AbstractC1549150qPp<?, ?>>> it15 = listLIZ.iterator();
        while (it15.hasNext()) {
            C1543490qGh.LIZIZ(it15.next(), null, 6);
        }
        List<Class<? extends AbstractC1549150qPp<?, ?>>> listProvideXBridgetIDLMethodList24 = ComplianceServiceProvider.LJIJJ().provideXBridgetIDLMethodList();
        if (listProvideXBridgetIDLMethodList24 != null) {
            Iterator<Class<? extends AbstractC1549150qPp<?, ?>>> it16 = listProvideXBridgetIDLMethodList24.iterator();
            while (it16.hasNext()) {
                C1543490qGh.LIZIZ(it16.next(), null, 6);
            }
        }
        IPnSJSBridgeService iPnSJSBridgeService = (IPnSJSBridgeService) PluggableExtentionKt.pluggableSpi$default(IPnSJSBridgeService.class, false, false, false, 14, null);
        if (iPnSJSBridgeService != null && (listLIZ4 = iPnSJSBridgeService.LIZ()) != null) {
            Iterator<Class<? extends InterfaceC1063710dmr>> it17 = listLIZ4.iterator();
            while (it17.hasNext()) {
                C1543490qGh.LIZIZ(it17.next(), null, 6);
            }
        }
        ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        if (iLiveOuterService != null && (iLiveBDXBridgeServiceL3 = iLiveOuterService.L3()) != null && (listProvideXBridgetIDLMethodList11 = iLiveBDXBridgeServiceL3.provideXBridgetIDLMethodList()) != null) {
            Iterator<Class<? extends AbstractC1549150qPp<?, ?>>> it18 = listProvideXBridgetIDLMethodList11.iterator();
            while (it18.hasNext()) {
                C1543490qGh.LIZIZ(it18.next(), null, 6);
            }
        }
        ShareH5Service shareH5Service = (ShareH5Service) PluggableExtentionKt.pluggableSpi$default(ShareH5Service.class, false, false, false, 14, null);
        if (shareH5Service != null && (listLJIIIIZZ3 = shareH5Service.LJIIIIZZ()) != null) {
            Iterator<Class<? extends InterfaceC1063710dmr>> it19 = listLJIIIIZZ3.iterator();
            while (it19.hasNext()) {
                C1543490qGh.LIZIZ(it19.next(), null, 6);
            }
        }
        IVopBDXBridgeService iVopBDXBridgeService = (IVopBDXBridgeService) PluggableExtentionKt.pluggableSpi$default(IVopBDXBridgeService.class, false, false, false, 14, null);
        if (iVopBDXBridgeService != null && (c13bvProvideXBridgetIDLMethodList2 = iVopBDXBridgeService.provideXBridgetIDLMethodList()) != null) {
            Iterator it20 = c13bvProvideXBridgetIDLMethodList2.iterator();
            while (it20.hasNext()) {
                C1543490qGh.LIZIZ((Class) it20.next(), null, 6);
            }
        }
        IFavoriteService iFavoriteService = (IFavoriteService) PluggableExtentionKt.pluggableSpi$default(IFavoriteService.class, false, false, false, 14, null);
        if (iFavoriteService != null && (listProvideXBridgetIDLMethodList10 = iFavoriteService.provideXBridgetIDLMethodList()) != null) {
            Iterator<Class<? extends AbstractC1549150qPp<?, ?>>> it21 = listProvideXBridgetIDLMethodList10.iterator();
            while (it21.hasNext()) {
                C1543490qGh.LIZIZ(it21.next(), null, 6);
            }
        }
        Iterator it22 = C1878060yyK.LIZ().iterator();
        while (it22.hasNext()) {
            C1543490qGh.LIZIZ((Class) it22.next(), null, 6);
        }
        IUgCommonService iUgCommonService = (IUgCommonService) PluggableExtentionKt.pluggableSpi$default(IUgCommonService.class, false, false, false, 14, null);
        if (iUgCommonService != null && (clsLJFF = iUgCommonService.LJFF()) != null) {
            C1543490qGh.LIZIZ(clsLJFF, null, 6);
        }
        ShareExtService shareExtService = (ShareExtService) PluggableExtentionKt.pluggableSpi$default(ShareExtService.class, false, false, false, 14, null);
        if (shareExtService != null && (listProvideXBridgetIDLMethodList9 = shareExtService.provideXBridgetIDLMethodList()) != null) {
            Iterator<Class<? extends AbstractC1549150qPp<?, ?>>> it23 = listProvideXBridgetIDLMethodList9.iterator();
            while (it23.hasNext()) {
                C1543490qGh.LIZIZ(it23.next(), null, 6);
            }
        }
        ILocationService iLocationService = (ILocationService) PluggableExtentionKt.pluggableSpi$default(ILocationService.class, false, false, false, 14, null);
        if (iLocationService != null && (listLJIILIIL = iLocationService.LJIILIIL()) != null) {
            Iterator<Class<? extends AbstractC1549150qPp<?, ?>>> it24 = listLJIILIIL.iterator();
            while (it24.hasNext()) {
                C1543490qGh.LIZIZ(it24.next(), null, 6);
            }
        }
        ILocalServicePassThroughService iLocalServicePassThroughService = (ILocalServicePassThroughService) PluggableExtentionKt.pluggableSpi$default(ILocalServicePassThroughService.class, false, false, false, 14, null);
        if (iLocalServicePassThroughService != null && (listLJIIIIZZ2 = iLocalServicePassThroughService.LJIIIIZZ()) != null) {
            Iterator<Class<? extends AbstractC1549150qPp<?, ?>>> it25 = listLJIIIIZZ2.iterator();
            while (it25.hasNext()) {
                C1543490qGh.LIZIZ(it25.next(), null, 6);
            }
        }
        IProfileBridgeService iProfileBridgeService = (IProfileBridgeService) PluggableExtentionKt.pluggableSpi$default(IProfileBridgeService.class, false, false, false, 14, null);
        if (iProfileBridgeService != null && (listLIZ3 = iProfileBridgeService.LIZ()) != null) {
            Iterator<Class<? extends InterfaceC1063710dmr>> it26 = listLIZ3.iterator();
            while (it26.hasNext()) {
                C1543490qGh.LIZIZ(it26.next(), null, 6);
            }
        }
        Iterator it27 = ((ArrayList) C1878080yyM.LIZ()).iterator();
        while (it27.hasNext()) {
            C1543490qGh.LIZIZ((Class) it27.next(), null, 6);
        }
        IMusicAddToDspCoreService iMusicAddToDspCoreService = (IMusicAddToDspCoreService) PluggableExtentionKt.pluggableSpi$default(IMusicAddToDspCoreService.class, false, false, false, 14, null);
        if (iMusicAddToDspCoreService != null && (listProvideXBridgetIDLMethodList8 = iMusicAddToDspCoreService.provideXBridgetIDLMethodList()) != null) {
            Iterator<Class<? extends AbstractC1549150qPp<?, ?>>> it28 = listProvideXBridgetIDLMethodList8.iterator();
            while (it28.hasNext()) {
                C1543490qGh.LIZIZ(it28.next(), null, 6);
            }
        }
        IPitayaOfflineService iPitayaOfflineService = (IPitayaOfflineService) PluggableExtentionKt.pluggableSpi$default(IPitayaOfflineService.class, false, false, false, 14, null);
        if (iPitayaOfflineService != null) {
            iPitayaOfflineService.LIZ();
        }
        C1878070yyL.LIZ();
        IOpenIABService iOpenIABService = (IOpenIABService) PluggableExtentionKt.pluggableSpi$default(IOpenIABService.class, false, false, false, 14, null);
        if (iOpenIABService != null && (listLIZ2 = iOpenIABService.LIZ()) != null) {
            Iterator<Class<? extends AbstractC1549150qPp<?, ?>>> it29 = listLIZ2.iterator();
            while (it29.hasNext()) {
                C1543490qGh.LIZIZ(it29.next(), null, 6);
            }
        }
        IPipoService iPipoService8 = (IPipoService) PluggableExtentionKt.pluggableSpi$default(IPipoService.class, false, false, false, 14, null);
        if (iPipoService8 != null) {
            iPipoService8.LJ();
        }
        IPipoService iPipoService9 = (IPipoService) PluggableExtentionKt.pluggableSpi$default(IPipoService.class, false, false, false, 14, null);
        if (iPipoService9 != null && (listProvideXBridgetIDLMethodList7 = iPipoService9.provideXBridgetIDLMethodList()) != null) {
            Iterator<Class<? extends InterfaceC1063710dmr>> it30 = listProvideXBridgetIDLMethodList7.iterator();
            while (it30.hasNext()) {
                C1543490qGh.LIZIZ(it30.next(), null, 6);
            }
        }
        if (C1544000qHW.LJIIZILJ) {
            IPipoService iPipoService10 = (IPipoService) PluggableExtentionKt.pluggableSpi$default(IPipoService.class, false, false, false, 14, null);
            if (iPipoService10 != null && (clsLJIIZILJ14 = iPipoService10.LJIIZILJ("pipo.encryptString")) != null) {
                C1543490qGh.LIZIZ(clsLJIIZILJ14, null, 6);
            }
            IPipoService iPipoService11 = (IPipoService) PluggableExtentionKt.pluggableSpi$default(IPipoService.class, false, false, false, 14, null);
            if (iPipoService11 != null && (clsLJIIZILJ13 = iPipoService11.LJIIZILJ("pipo.executeRiskJS")) != null) {
                C1543490qGh.LIZIZ(clsLJIIZILJ13, null, 6);
            }
            IPipoService iPipoService12 = (IPipoService) PluggableExtentionKt.pluggableSpi$default(IPipoService.class, false, false, false, 14, null);
            if (iPipoService12 != null && (clsLJIIZILJ12 = iPipoService12.LJIIZILJ("pipoAppInfo")) != null) {
                C1543490qGh.LIZIZ(clsLJIIZILJ12, null, 6);
            }
            IPipoService iPipoService13 = (IPipoService) PluggableExtentionKt.pluggableSpi$default(IPipoService.class, false, false, false, 14, null);
            if (iPipoService13 != null && (clsLJIIZILJ11 = iPipoService13.LJIIZILJ("pipo.getStarlingData")) != null) {
                C1543490qGh.LIZIZ(clsLJIIZILJ11, null, 6);
            }
            IPipoService iPipoService14 = (IPipoService) PluggableExtentionKt.pluggableSpi$default(IPipoService.class, false, false, false, 14, null);
            if (iPipoService14 != null && (clsLJIIZILJ10 = iPipoService14.LJIIZILJ("pipo.fetch")) != null) {
                C1543490qGh.LIZIZ(clsLJIIZILJ10, null, 6);
            }
            IPipoService iPipoService15 = (IPipoService) PluggableExtentionKt.pluggableSpi$default(IPipoService.class, false, false, false, 14, null);
            if (iPipoService15 != null && (clsLJIIZILJ9 = iPipoService15.LJIIZILJ("pipo.onEvent")) != null) {
                C1543490qGh.LIZIZ(clsLJIIZILJ9, null, 6);
            }
            IPipoService iPipoService16 = (IPipoService) PluggableExtentionKt.pluggableSpi$default(IPipoService.class, false, false, false, 14, null);
            if (iPipoService16 != null && (clsLJIIZILJ8 = iPipoService16.LJIIZILJ("pipo.openWebView")) != null) {
                C1543490qGh.LIZIZ(clsLJIIZILJ8, null, 6);
            }
        } else {
            JSBAIMigrationALLJSBSTWOSettings.JSBAIMigrationALLJSBSTWOModel jSBAIMigrationALLJSBSTWOModelLIZ = JSBAIMigrationALLJSBSTWOSettings.LIZ();
            if (jSBAIMigrationALLJSBSTWOModelLIZ.enable) {
                if (jSBAIMigrationALLJSBSTWOModelLIZ.pipoencryptString && (iPipoService7 = (IPipoService) PluggableExtentionKt.pluggableSpi$default(IPipoService.class, false, false, false, 14, null)) != null && (clsLJIIZILJ7 = iPipoService7.LJIIZILJ("pipo.encryptString")) != null) {
                    C1543490qGh.LIZIZ(clsLJIIZILJ7, null, 6);
                }
                if (jSBAIMigrationALLJSBSTWOModelLIZ.pipoexecuteRiskJS && (iPipoService6 = (IPipoService) PluggableExtentionKt.pluggableSpi$default(IPipoService.class, false, false, false, 14, null)) != null && (clsLJIIZILJ6 = iPipoService6.LJIIZILJ("pipo.executeRiskJS")) != null) {
                    C1543490qGh.LIZIZ(clsLJIIZILJ6, null, 6);
                }
                if (jSBAIMigrationALLJSBSTWOModelLIZ.pipoAppInfo && (iPipoService5 = (IPipoService) PluggableExtentionKt.pluggableSpi$default(IPipoService.class, false, false, false, 14, null)) != null && (clsLJIIZILJ5 = iPipoService5.LJIIZILJ("pipoAppInfo")) != null) {
                    C1543490qGh.LIZIZ(clsLJIIZILJ5, null, 6);
                }
                if (jSBAIMigrationALLJSBSTWOModelLIZ.pipogetStarlingData && (iPipoService4 = (IPipoService) PluggableExtentionKt.pluggableSpi$default(IPipoService.class, false, false, false, 14, null)) != null && (clsLJIIZILJ4 = iPipoService4.LJIIZILJ("pipo.getStarlingData")) != null) {
                    C1543490qGh.LIZIZ(clsLJIIZILJ4, null, 6);
                }
                if (jSBAIMigrationALLJSBSTWOModelLIZ.pipofetch && (iPipoService3 = (IPipoService) PluggableExtentionKt.pluggableSpi$default(IPipoService.class, false, false, false, 14, null)) != null && (clsLJIIZILJ3 = iPipoService3.LJIIZILJ("pipo.fetch")) != null) {
                    C1543490qGh.LIZIZ(clsLJIIZILJ3, null, 6);
                }
                if (jSBAIMigrationALLJSBSTWOModelLIZ.pipoonEvent && (iPipoService2 = (IPipoService) PluggableExtentionKt.pluggableSpi$default(IPipoService.class, false, false, false, 14, null)) != null && (clsLJIIZILJ2 = iPipoService2.LJIIZILJ("pipo.onEvent")) != null) {
                    C1543490qGh.LIZIZ(clsLJIIZILJ2, null, 6);
                }
                if (jSBAIMigrationALLJSBSTWOModelLIZ.pipoopenWebView && (iPipoService = (IPipoService) PluggableExtentionKt.pluggableSpi$default(IPipoService.class, false, false, false, 14, null)) != null && (clsLJIIZILJ = iPipoService.LJIIZILJ("pipo.openWebView")) != null) {
                    C1543490qGh.LIZIZ(clsLJIIZILJ, null, 6);
                }
            }
        }
        IPipoCcdcService iPipoCcdcService = (IPipoCcdcService) PluggableExtentionKt.pluggableSpi$default(IPipoCcdcService.class, false, false, false, 14, null);
        if (iPipoCcdcService != null && (listProvideXBridgetIDLMethodList6 = iPipoCcdcService.provideXBridgetIDLMethodList()) != null) {
            Iterator<Class<? extends InterfaceC1063710dmr>> it31 = listProvideXBridgetIDLMethodList6.iterator();
            while (it31.hasNext()) {
                C1543490qGh.LIZIZ(it31.next(), null, 6);
            }
        }
        IEcPublishBridgeService iEcPublishBridgeService = (IEcPublishBridgeService) C13LP.LJJJLIIL(ServiceManager.get().getServices(IEcPublishBridgeService.class));
        if (iEcPublishBridgeService != null && (listProvideXBridgetIDLMethodList5 = iEcPublishBridgeService.provideXBridgetIDLMethodList()) != null) {
            Iterator<Class<? extends AbstractC1549150qPp<?, ?>>> it32 = listProvideXBridgetIDLMethodList5.iterator();
            while (it32.hasNext()) {
                C1543490qGh.LIZIZ(it32.next(), null, 6);
            }
        }
        ITemplateBridgeService iTemplateBridgeService = (ITemplateBridgeService) C13LP.LJJJLIIL(ServiceManager.get().getServices(ITemplateBridgeService.class));
        if (iTemplateBridgeService != null && (listProvideXBridgetIDLMethodList4 = iTemplateBridgeService.provideXBridgetIDLMethodList()) != null) {
            Iterator<Class<? extends AbstractC1549150qPp<?, ?>>> it33 = listProvideXBridgetIDLMethodList4.iterator();
            while (it33.hasNext()) {
                C1543490qGh.LIZIZ(it33.next(), null, 6);
            }
        }
        IUpvoteService iUpvoteService = (IUpvoteService) PluggableExtentionKt.pluggableSpi$default(IUpvoteService.class, false, false, false, 14, null);
        if (iUpvoteService != null && (listProvideXBridgetIDLMethodList3 = iUpvoteService.provideXBridgetIDLMethodList()) != null) {
            Iterator<Class<? extends AbstractC1549150qPp<?, ?>>> it34 = listProvideXBridgetIDLMethodList3.iterator();
            while (it34.hasNext()) {
                C1543490qGh.LIZIZ(it34.next(), null, 6);
            }
        }
        ITouchPointService iTouchPointService = (ITouchPointService) PluggableExtentionKt.pluggableSpi$default(ITouchPointService.class, false, false, false, 14, null);
        if (iTouchPointService != null && (listLJIIIIZZ = iTouchPointService.LJIIIIZZ()) != null) {
            Iterator<Class<? extends AbstractC1549150qPp<?, ?>>> it35 = listLJIIIIZZ.iterator();
            while (it35.hasNext()) {
                C1543490qGh.LIZIZ(it35.next(), null, 6);
            }
        }
        ICreatorToolService iCreatorToolService = (ICreatorToolService) PluggableExtentionKt.pluggableSpi$default(ICreatorToolService.class, false, false, false, 14, null);
        if (iCreatorToolService != null && (listProvideXBridgetIDLMethodList2 = iCreatorToolService.provideXBridgetIDLMethodList()) != null) {
            Iterator<Class<? extends AbstractC1549150qPp<?, ?>>> it36 = listProvideXBridgetIDLMethodList2.iterator();
            while (it36.hasNext()) {
                C1543490qGh.LIZIZ(it36.next(), null, 6);
            }
        }
        OutreachOperationService outreachOperationService = (OutreachOperationService) PluggableExtentionKt.pluggableSpi$default(OutreachOperationService.class, false, false, false, 14, null);
        if (outreachOperationService != null && (listLIZIZ = outreachOperationService.LIZIZ()) != null) {
            Iterator<Class<? extends AbstractC1549150qPp<?, ?>>> it37 = listLIZIZ.iterator();
            while (it37.hasNext()) {
                C1543490qGh.LIZIZ(it37.next(), null, 6);
            }
        }
        Object obj = LIZJ.LIZIZ().LL;
        if (Intrinsics.LJFF(obj, C1610310s0T.LIZ)) {
            obj = null;
        }
        List list = (List) obj;
        if (list != null) {
            list.size();
        }
        if (list != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator it38 = list.iterator();
            while (it38.hasNext()) {
                arrayList.add(it38.next().getClass().getName());
            }
        } else {
            arrayList = null;
        }
        Objects.toString(arrayList);
        if (list != null) {
            Iterator it39 = list.iterator();
            while (it39.hasNext()) {
                List<Class<? extends AbstractC1549150qPp<?, ?>>> listLIZ6 = ((InterfaceC1472505pb) it39.next()).LIZ();
                listLIZ6.size();
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listLIZ6, 10));
                Iterator<Class<? extends AbstractC1549150qPp<?, ?>>> it40 = listLIZ6.iterator();
                while (it40.hasNext()) {
                    arrayList2.add(it40.next().getName());
                }
                Iterator<Class<? extends AbstractC1549150qPp<?, ?>>> it41 = listLIZ6.iterator();
                while (it41.hasNext()) {
                    C1543490qGh.LIZIZ(it41.next(), null, 6);
                }
            }
        }
        Object obj2 = LIZJ.LIZ().LL;
        if (Intrinsics.LJFF(obj2, C1610310s0T.LIZ)) {
            obj2 = null;
        }
        List list2 = (List) obj2;
        if (list2 != null) {
            list2.size();
            Iterator it42 = list2.iterator();
            while (it42.hasNext()) {
                List<Class<? extends InterfaceC1063710dmr>> listLIZ7 = ((C04P7) it42.next()).LIZ();
                if (listLIZ7 != null) {
                    Iterator<Class<? extends InterfaceC1063710dmr>> it43 = listLIZ7.iterator();
                    while (it43.hasNext()) {
                        C1543490qGh.LIZIZ(it43.next(), null, 6);
                    }
                }
            }
        }
        IOGCXBridgeService iOGCXBridgeService = (IOGCXBridgeService) PluggableExtentionKt.pluggableSpi$default(IOGCXBridgeService.class, false, false, false, 14, null);
        if (iOGCXBridgeService != null && (listProvideXBridgetIDLMethodList = iOGCXBridgeService.provideXBridgetIDLMethodList()) != null) {
            Iterator<Class<? extends AbstractC1549150qPp<?, ?>>> it44 = listProvideXBridgetIDLMethodList.iterator();
            while (it44.hasNext()) {
                C1543490qGh.LIZIZ(it44.next(), null, 6);
            }
        }
        IPineDramaXBridgeService iPineDramaXBridgeService = (IPineDramaXBridgeService) PluggableExtentionKt.pluggableSpi$default(IPineDramaXBridgeService.class, false, false, false, 14, null);
        if (iPineDramaXBridgeService != null && (c13bvProvideXBridgetIDLMethodList = iPineDramaXBridgeService.provideXBridgetIDLMethodList()) != null) {
            Iterator it45 = c13bvProvideXBridgetIDLMethodList.iterator();
            while (it45.hasNext()) {
                C1543490qGh.LIZIZ((Class) it45.next(), null, 6);
            }
        }
        C20684815ws.LJIILLIIL("bdxbridge_init_event", C2097608Jq.LJIIIIZZ(new Pair("bdxbridge_init_cost", String.valueOf(System.currentTimeMillis() - jCurrentTimeMillis)), new Pair("optimized", String.valueOf(C1544000qHW.LIZJ)), new Pair("only_one_time", "false")));
        C1063910dnB.LIZ("true", "BDXBridgeStarter_finish");
        C1544000qHW.LIZ.set(true);
        C1544000qHW.LJIILLIIL.LIZ("BDXBridgeStarter_finish");
    }
}
