package X;

import android.content.Context;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.ChooseImageMethod;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.DownloadLiveReplayMethod;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.EditImageForSubMethod;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.UploadImageMethod;
import com.bytedance.android.livesdk.livesetting.hybrid.LiveHybridBridgeRegistryFallbackSetting;
import com.bytedance.android.livesdk.livesetting.hybrid.LiveHybridJsbAsyncDisableListSettingSetting;
import com.bytedance.android.livesdk.livesetting.hybrid.LiveHybridJsbDefaultAsyncEnableSettingSetting;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.IHostHybrid;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0dkr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1062470dkr extends C1543000qFu {
    public static final C1544630qIX<C1062490dkt> LIZIZ = new C1544630qIX<>(new C1062490dkt(false));
    public static final C1544630qIX<C2281601ESg> LIZJ = new C1544630qIX<>(C2281601ESg.LIZ);
    public static final C1062430dkn LIZLLL = ((IHostHybrid) C1161920gLG.LIZJ(IHostHybrid.class)).B92();
    public final String LIZ;

    @Override // X.C1543000qFu
    public final C1058990dfF LIZLLL() {
        if (C1544000qHW.LJIIZILJ) {
            return null;
        }
        return new C1058990dfF() { // from class: X.0dkh
            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            @Override // X.C1058990dfF
            public final C650250Pex LIZ(C1537480q70 c1537480q70, String str) {
                InterfaceC1059630dgH interfaceC1059630dgH;
                EnumC1062400dkk enumC1062400dkk;
                C650250Pex c650250Pex = null;
                if (!(c1537480q70 instanceof SparkContext)) {
                    return null;
                }
                C1062430dkn c1062430dkn = C1062470dkr.LIZLLL;
                if (c1062430dkn.LIZ && (c1062430dkn.LIZIZ || c1062430dkn.LIZLLL || c1062430dkn.LIZJ || c1062430dkn.LJFF || c1062430dkn.LJ)) {
                    return null;
                }
                final SparkContext sparkContext = (SparkContext) c1537480q70;
                switch (str.hashCode()) {
                    case -1701611132:
                        interfaceC1059630dgH = !str.equals("chooseImage") ? null : new InterfaceC1059630dgH() { // from class: X.0dkg
                            @Override // X.InterfaceC1059630dgH
                            public final AbstractC1835360xrS LIZ() {
                                return new ChooseImageMethod(sparkContext);
                            }
                        };
                        break;
                    case -1227895973:
                        interfaceC1059630dgH = !str.equals("chooseImageForSub") ? null : new InterfaceC1059630dgH() { // from class: X.0dkM
                            @Override // X.InterfaceC1059630dgH
                            public final AbstractC1835360xrS LIZ() {
                                return new C495440Jbq(sparkContext);
                            }
                        };
                        break;
                    case -862263651:
                        interfaceC1059630dgH = !str.equals("buyIapProduct") ? null : new InterfaceC1059630dgH() { // from class: X.0dkq
                            @Override // X.InterfaceC1059630dgH
                            public final AbstractC1835360xrS LIZ() {
                                return new C1807580x8e();
                            }
                        };
                        break;
                    case -854758008:
                        interfaceC1059630dgH = !str.equals("editImageForSub") ? null : new InterfaceC1059630dgH() { // from class: X.0dkm
                            @Override // X.InterfaceC1059630dgH
                            public final AbstractC1835360xrS LIZ() {
                                return new EditImageForSubMethod(sparkContext);
                            }
                        };
                        break;
                    case 1044464602:
                        interfaceC1059630dgH = !str.equals("uploadImage") ? null : new InterfaceC1059630dgH() { // from class: X.0dkp
                            @Override // X.InterfaceC1059630dgH
                            public final AbstractC1835360xrS LIZ() {
                                return new UploadImageMethod();
                            }
                        };
                        break;
                    case 1922537702:
                        interfaceC1059630dgH = !str.equals("downloadMediaToSystem") ? null : new InterfaceC1059630dgH() { // from class: X.0dko
                            @Override // X.InterfaceC1059630dgH
                            public final AbstractC1835360xrS LIZ() {
                                return new DownloadLiveReplayMethod();
                            }
                        };
                        break;
                    default:
                        interfaceC1059630dgH = null;
                        break;
                }
                if (interfaceC1059630dgH instanceof InterfaceC1059630dgH) {
                    InterfaceC1541990qEH interfaceC1541990qEHLJIJJ = c1537480q70.LJIJJ();
                    if (!C1544000qHW.LJIIZILJ) {
                        c650250Pex = new C650250Pex();
                        AbstractC1835360xrS abstractC1835360xrSLIZ = interfaceC1059630dgH.LIZ();
                        c650250Pex.LIZ = str;
                        abstractC1835360xrSLIZ.getClass();
                        int i = C1062380dki.LIZ[EnumC1062390dkj.PROTECTED.ordinal()];
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    if (i == 4) {
                                        enumC1062400dkk = EnumC1062400dkk.SECURE;
                                    } else {
                                        throw new C1954807lC();
                                    }
                                } else {
                                    enumC1062400dkk = EnumC1062400dkk.PUBLIC;
                                }
                            } else {
                                enumC1062400dkk = EnumC1062400dkk.PROTECT;
                            }
                        } else {
                            enumC1062400dkk = EnumC1062400dkk.PRIVATE;
                        }
                        c650250Pex.LIZIZ = enumC1062400dkk;
                        c650250Pex.LIZLLL = new C1543340qGS(new C259800zU(), interfaceC1059630dgH, sparkContext) { // from class: X.0dgI
                            public final C1059660dgK LIZIZ;
                            public final /* synthetic */ C259800zU<AbstractC1835360xrS<Object, Object>> LIZLLL;
                            public final /* synthetic */ InterfaceC1059630dgH LJ;
                            public final /* synthetic */ SparkContext LJFF;

                            @Override // X.C1543340qGS
                            public final void LIZLLL() {
                                AbstractC1835360xrS<Object, Object> abstractC1835360xrS = this.LIZLLL.element;
                                if (abstractC1835360xrS != null) {
                                    abstractC1835360xrS.LJIIIZ();
                                }
                                AbstractC1835360xrS<Object, Object> abstractC1835360xrS2 = this.LIZLLL.element;
                                if (abstractC1835360xrS2 != null) {
                                    abstractC1835360xrS2.LJIIIIZZ();
                                }
                            }

                            @Override // X.C1543340qGS, X.InterfaceC1538970q9P
                            public final void LJII(Context context) {
                                C1059660dgK c1059660dgK = this.LIZIZ;
                                if (c1059660dgK != null) {
                                    c1059660dgK.LIZ = context;
                                }
                            }

                            /* JADX WARN: Type inference failed for: r3v0, types: [T, X.0xrS, X.1BRD] */
                            @Override // X.C1543340qGS
                            public final void LIZIZ(Object obj, final C1543350qGT c1543350qGT) {
                                InterfaceC1541990qEH interfaceC1541990qEH;
                                Unit unit;
                                if (!(obj instanceof String) || (interfaceC1541990qEH = this.LIZJ) == null) {
                                    return;
                                }
                                C259800zU<AbstractC1835360xrS<Object, Object>> c259800zU = this.LIZLLL;
                                InterfaceC1059630dgH interfaceC1059630dgH2 = this.LJ;
                                final SparkContext sparkContext2 = this.LJFF;
                                try {
                                    ?? LIZ2 = interfaceC1059630dgH2.LIZ();
                                    c259800zU.element = LIZ2;
                                    if (LIZ2 == 0) {
                                        unit = null;
                                    } else {
                                        Object objLIZ = C1305930k5X.LIZ((String) obj, LIZ2);
                                        C1059660dgK c1059660dgKLIZ = this.LIZIZ;
                                        if (c1059660dgKLIZ == null) {
                                            c1059660dgKLIZ = C1059650dgJ.LIZ(interfaceC1541990qEH);
                                        }
                                        InterfaceC1807620x8i interfaceC1807620x8i = new InterfaceC1807620x8i() { // from class: X.0dTg
                                            @Override // X.InterfaceC1807620x8i
                                            public final void onFailed() throws JSONException {
                                                JSONObject jSONObject = new JSONObject();
                                                jSONObject.put("code", 0);
                                                jSONObject.put("error_msg", "");
                                                InterfaceC1531560pxS interfaceC1531560pxS = sparkContext2.hybridParams;
                                                if ((interfaceC1531560pxS != null ? interfaceC1531560pxS.getType() : null) != EnumC1067640dtC.WEB) {
                                                    JSONObject jSONObject2 = new JSONObject();
                                                    jSONObject2.put("data", jSONObject);
                                                    jSONObject = jSONObject2;
                                                }
                                                jSONObject.put("code", 0);
                                                c1543350qGT.LIZ(0, jSONObject, "onfail");
                                            }

                                            /* JADX WARN: Type inference fix 'apply assigned field type' failed
                                            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                                            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                                            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                                            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                                             */
                                            @Override // X.InterfaceC1807620x8i
                                            public final void LIZ(Object obj2) throws JSONException {
                                                JSONObject jSONObject;
                                                EnumC1067640dtC type;
                                                if (obj2 instanceof JSONObject) {
                                                    jSONObject = (JSONObject) obj2;
                                                } else if (obj2 != null) {
                                                    jSONObject = new JSONObject(GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, obj2));
                                                } else {
                                                    jSONObject = new JSONObject();
                                                }
                                                if (!jSONObject.has("code")) {
                                                    jSONObject.put("code", 1);
                                                }
                                                InterfaceC1531560pxS interfaceC1531560pxS = sparkContext2.hybridParams;
                                                if (interfaceC1531560pxS != null) {
                                                    type = interfaceC1531560pxS.getType();
                                                } else {
                                                    type = null;
                                                }
                                                JSONObject jSONObject2 = jSONObject;
                                                if (type != EnumC1067640dtC.WEB) {
                                                    JSONObject jSONObject3 = new JSONObject();
                                                    jSONObject3.put("data", jSONObject);
                                                    jSONObject3.put("code", jSONObject.optInt("code", 1));
                                                    jSONObject2 = jSONObject3;
                                                }
                                                c1543350qGT.LIZ(1, jSONObject2, "success");
                                            }

                                            @Override // X.InterfaceC1807620x8i
                                            public final void LIZIZ(JSONObject jSONObject) throws JSONException {
                                                EnumC1067640dtC type;
                                                JSONObject jSONObject2;
                                                InterfaceC1531560pxS interfaceC1531560pxS = sparkContext2.hybridParams;
                                                if (interfaceC1531560pxS != null) {
                                                    type = interfaceC1531560pxS.getType();
                                                } else {
                                                    type = null;
                                                }
                                                if (type == EnumC1067640dtC.WEB) {
                                                    jSONObject2 = jSONObject;
                                                } else {
                                                    jSONObject2 = new JSONObject();
                                                    jSONObject2.put("data", jSONObject);
                                                }
                                                jSONObject2.put("code", jSONObject.optInt("code", 1));
                                                c1543350qGT.LIZ(1, jSONObject2, "raw");
                                            }
                                        };
                                        LIZ2.LLILZ = c1059660dgKLIZ;
                                        LIZ2.LLILLL = interfaceC1807620x8i;
                                        LIZ2.LJII(objLIZ, c1059660dgKLIZ);
                                        unit = Unit.LIZ;
                                    }
                                    C189200o6.m2constructorimpl(unit);
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    C189200o6.m2constructorimpl(new C098200Yq(th));
                                }
                            }

                            {
                                C1059660dgK c1059660dgKLIZ;
                                this.LIZLLL = c259800zU;
                                this.LJ = interfaceC1059630dgH;
                                this.LJFF = sparkContext;
                                if (this.LIZJ == null) {
                                    c1059660dgKLIZ = null;
                                } else {
                                    c1059660dgKLIZ = C1059650dgJ.LIZ(this.LIZJ);
                                }
                                this.LIZIZ = c1059660dgKLIZ;
                            }
                        };
                    }
                }
                return c650250Pex;
            }
        };
    }

    @Override // X.C1543000qFu
    public final List<Class<? extends InterfaceC1063710dmr>> LJI() {
        ArrayList arrayList = new ArrayList();
        if (C1544000qHW.LJIIZILJ) {
            arrayList.add(C1062270dkX.class);
            arrayList.add(C1062180dkO.class);
            arrayList.add(C1062240dkU.class);
            arrayList.add(C1062250dkV.class);
            arrayList.add(C1062140dkK.class);
        } else {
            C1062430dkn c1062430dkn = LIZLLL;
            if (c1062430dkn.LIZ) {
                if (c1062430dkn.LIZIZ) {
                    arrayList.add(C1062270dkX.class);
                }
                if (c1062430dkn.LIZLLL) {
                    arrayList.add(C1062180dkO.class);
                }
                if (c1062430dkn.LIZJ) {
                    arrayList.add(C1062240dkU.class);
                }
                if (c1062430dkn.LJFF) {
                    arrayList.add(C1062250dkV.class);
                }
                if (c1062430dkn.LJ) {
                    arrayList.add(C1062140dkK.class);
                    return arrayList;
                }
            }
        }
        return arrayList;
    }

    @Override // X.C1543000qFu
    public final Map<Class<?>, C1544630qIX<?>> LJII() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(C1062490dkt.class, LIZIZ);
        if (LiveHybridJsbDefaultAsyncEnableSettingSetting.INSTANCE.getValue() && LiveHybridJsbAsyncDisableListSettingSetting.INSTANCE.enable(this.LIZ)) {
            linkedHashMap.put(C1545130qJL.class, LIZJ);
        }
        return linkedHashMap;
    }

    @Override // X.C1543000qFu
    public final C1543030qFx LJ() {
        return new C1543030qFx() { // from class: X.1ESf
            public static InterfaceC2268841DrG LIZIZ;

            @Override // X.C1543030qFx
            public final String LIZIZ() {
                return "webcast";
            }

            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            @Override // X.C1543030qFx
            public final Class<? extends InterfaceC1063710dmr> LIZ(String str) {
                Class<? extends AbstractC1549150qPp<?, ?>> localTestIDLMethodClassByName;
                Class cls;
                boolean zIsOffline;
                InterfaceC2268841DrG interfaceC2268841DrG;
                boolean zIsOffline2 = false;
                if (LIZIZ == null) {
                    try {
                        LIZIZ = (InterfaceC2268841DrG) Class.forName("com.bytedance.android.live.hybrid.bridge.registry.LiveFullBridgeRegistry").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        HashMap map = new HashMap(2);
                        map.put("error_msg", e.toString());
                        map.put("error_event", "jsb_registry_init_error");
                        C1CC2.LJII(1, "ttlive_jsbridge_registry_init_error", map);
                    }
                }
                InterfaceC2268841DrG interfaceC2268841DrG2 = LIZIZ;
                if (interfaceC2268841DrG2 != null) {
                    localTestIDLMethodClassByName = interfaceC2268841DrG2.getIDLMethodClassByName(str);
                } else {
                    localTestIDLMethodClassByName = null;
                }
                if (localTestIDLMethodClassByName == null) {
                    IHostAppContext iHostAppContext = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class);
                    if (iHostAppContext != null) {
                        zIsOffline = iHostAppContext.isOffline();
                    } else {
                        zIsOffline = false;
                    }
                    if (zIsOffline && (interfaceC2268841DrG = LIZIZ) != null) {
                        localTestIDLMethodClassByName = interfaceC2268841DrG.getLocalTestIDLMethodClassByName(str);
                    } else {
                        localTestIDLMethodClassByName = null;
                    }
                }
                if (localTestIDLMethodClassByName != null) {
                    return localTestIDLMethodClassByName;
                }
                if (!LiveHybridBridgeRegistryFallbackSetting.INSTANCE.getValue()) {
                    return null;
                }
                switch (str.hashCode()) {
                    case -2134953616:
                        cls = !str.equals("openVideoClipPage") ? null : C1841120y0k.class;
                        break;
                    case -2065052067:
                        cls = !str.equals("sendThirdPartyLog") ? null : C1505680pHi.class;
                        break;
                    case -1989825066:
                        cls = !str.equals("sendLogInteraction") ? null : C2399009ae.class;
                        break;
                    case -1975568730:
                        cls = !str.equals("copyToClipboard") ? null : C747740TUu.class;
                        break;
                    case -1918677036:
                        cls = !str.equals("downloadPartneringGame") ? null : C1886170zBP.class;
                        break;
                    case -1913697851:
                        cls = !str.equals("queryReplayDownloadInfo") ? null : C1835270xrJ.class;
                        break;
                    case -1904610315:
                        cls = !str.equals("getIncentiveTaskWLD") ? null : C1144120fsY.class;
                        break;
                    case -1861336913:
                        cls = !str.equals("getCoinIncentiveTaskParams") ? null : C1134810fdX.class;
                        break;
                    case -1849258755:
                        cls = !str.equals("shareGameLive") ? null : C514400KFi.class;
                        break;
                    case -1830739045:
                        cls = !str.equals("refreshGiftBagList") ? null : C1147950fyj.class;
                        break;
                    case -1815441339:
                        cls = !str.equals("downloadLiveEffect") ? null : C755850Tkt.class;
                        break;
                    case -1802379931:
                        cls = !str.equals("sharePanel") ? null : C0KR7.class;
                        break;
                    case -1779644801:
                        cls = !str.equals("gamePartnershipPopupWebview") ? null : C1793110wlJ.class;
                        break;
                    case -1765015526:
                        cls = !str.equals("OpenBackpackPanel") ? null : C1120720fGo.class;
                        break;
                    case -1721823457:
                        cls = !str.equals("baseInfo") ? null : C0KU1.class;
                        break;
                    case -1671297402:
                        cls = !str.equals("openMultiGuestAnchorPanel") ? null : C1793560wm2.class;
                        break;
                    case -1646287972:
                        cls = !str.equals("streamPlayerControl") ? null : C0KRI.class;
                        break;
                    case -1556887489:
                        cls = !str.equals("getCohostStatusEnable") ? null : C1874580ysi.class;
                        break;
                    case -1523947038:
                        cls = !str.equals("liveReplayTranscode") ? null : C1800620wxQ.class;
                        break;
                    case -1523132628:
                        cls = !str.equals("getRoomChatEnable") ? null : C21355418hk.class;
                        break;
                    case -1467174322:
                        cls = !str.equals("showCPPDialog") ? null : C20418214uy.class;
                        break;
                    case -1405790217:
                        cls = !str.equals("handleAutoExchangeResult") ? null : C1150200g2M.class;
                        break;
                    case -1387948825:
                        cls = !str.equals("giftGuidePopupOperation") ? null : C2179911ATd.class;
                        break;
                    case -1368037516:
                        cls = !str.equals("getGiftInfo") ? null : C1134350fcn.class;
                        break;
                    case -1332085432:
                        cls = !str.equals("dialog") ? null : C1AQ5.class;
                        break;
                    case -1328161321:
                        cls = !str.equals("isEnableSubonlyChat") ? null : C518460KUy.class;
                        break;
                    case -1327813924:
                        cls = !str.equals("gamePartnershipMixHideCard") ? null : C1504970pGZ.class;
                        break;
                    case -1325092156:
                        cls = !str.equals("handlePollPanelBack") ? null : C601280NiA.class;
                        break;
                    case -1296660405:
                        cls = !str.equals("openRegionListPage") ? null : C1AQA.class;
                        break;
                    case -1194981137:
                        cls = !str.equals("setLiveSticker") ? null : C1850480yFq.class;
                        break;
                    case -1141456780:
                        cls = !str.equals("getBalanceInfo") ? null : C1807040x7m.class;
                        break;
                    case -1136288639:
                        cls = !str.equals("closeSheetStack") ? null : C758690TpT.class;
                        break;
                    case -1136169755:
                        cls = !str.equals("openFileSelector") ? null : C20023213Wc.class;
                        break;
                    case -1104833325:
                        cls = !str.equals("getPostVideoMaxDuration") ? null : C1836750xth.class;
                        break;
                    case -1035821641:
                        cls = !str.equals("liveBannerItemStatusChanged") ? null : C1116580fA8.class;
                        break;
                    case -983782210:
                        cls = !str.equals("fetchSubInfoData") ? null : C20162813us.class;
                        break;
                    case -963363540:
                        cls = !str.equals("openPlaybookDetailPanel") ? null : C20411814tw.class;
                        break;
                    case -901304564:
                        cls = !str.equals("openVideoFullScreen") ? null : C1AQM.class;
                        break;
                    case -863743651:
                        cls = !str.equals("manageSubOnlyPanel") ? null : C1506820pJY.class;
                        break;
                    case -854530242:
                        cls = !str.equals("runPitayaTask") ? null : C1116860fAa.class;
                        break;
                    case -847413691:
                        cls = !str.equals("getStorage") ? null : C1505810pHv.class;
                        break;
                    case -812225218:
                        cls = !str.equals("getStoryGradientBackgroundImage") ? null : C0KQY.class;
                        break;
                    case -794273169:
                        cls = !str.equals("appInfo") ? null : C1AQ0.class;
                        break;
                    case -738535042:
                        cls = !str.equals("multiTabSubContainerSize") ? null : C0TTJ.class;
                        break;
                    case -693709175:
                        cls = !str.equals("getLinkMicStatus") ? null : C1801420wyi.class;
                        break;
                    case -688781993:
                        cls = !str.equals("removeStorage") ? null : C1505800pHu.class;
                        break;
                    case -617117728:
                        cls = !str.equals("joinFansClub") ? null : C21341118fR.class;
                        break;
                    case -504883626:
                        cls = !str.equals("openLive") ? null : C1119320fEY.class;
                        break;
                    case -501504083:
                        cls = !str.equals("fetchProductDetails") ? null : C1803120x1S.class;
                        break;
                    case -470004587:
                        cls = !str.equals("operateCustomBadgeKeyboard") ? null : C1888680zFS.class;
                        break;
                    case -459110501:
                        cls = !str.equals("getPhotoAlbumAuth") ? null : C1800680wxW.class;
                        break;
                    case -364226595:
                        cls = !str.equals("isInMultiWindowMode") ? null : C1793200wlS.class;
                        break;
                    case -361651212:
                        cls = !str.equals("changeScreenOrientation") ? null : C0TW3.class;
                        break;
                    case -342525398:
                        cls = !str.equals("iapForSubscriptionV2") ? null : C0KJM.class;
                        break;
                    case -331738228:
                        cls = !str.equals("LiveReplayShare") ? null : C1878670yzJ.class;
                        break;
                    case -278484401:
                        cls = !str.equals("openCommentPanel") ? null : C519810Ka3.class;
                        break;
                    case -266803431:
                        cls = !str.equals("userInfo") ? null : C1117070fAv.class;
                        break;
                    case -254997493:
                        cls = !str.equals("gameExitFullscreen") ? null : C1800930wxv.class;
                        break;
                    case -251410305:
                        cls = !str.equals("ShareGamePlayTogether") ? null : C516850KOt.class;
                        break;
                    case -208202848:
                        cls = !str.equals("openPlaybookBannerDetailPanel") ? null : C1878850yzb.class;
                        break;
                    case -171619485:
                        cls = !str.equals("partnershipMixOpenSchema") ? null : C1875100ytY.class;
                        break;
                    case -5973459:
                        cls = !str.equals("GetMultiGuestCommonParam") ? null : C1EAC.class;
                        break;
                    case 1095893:
                        cls = !str.equals("quickCohostStatusQuery") ? null : C1EA2.class;
                        break;
                    case 9019961:
                        cls = !str.equals("sendLogV3") ? null : C0KV5.class;
                        break;
                    case 9999915:
                        cls = !str.equals("getLiveHouseRoomStatus") ? null : C0KVP.class;
                        break;
                    case 11931111:
                        cls = !str.equals("getAdminInfo") ? null : C517400KQw.class;
                        break;
                    case 29178038:
                        cls = !str.equals("exchangeCoinsForLive") ? null : C1149620g1Q.class;
                        break;
                    case 94756344:
                        cls = !str.equals("close") ? null : C1145880fvO.class;
                        break;
                    case 97322682:
                        cls = !str.equals("fetch") ? null : C520560KbG.class;
                        break;
                    case 98822945:
                        cls = !str.equals("uploadImageForGame") ? null : C167R.class;
                        break;
                    case 100605765:
                        cls = !str.equals("openCountdownForAllPanel") ? null : C1877760yxq.class;
                        break;
                    case 103149417:
                        cls = !str.equals("login") ? null : C1117120fB0.class;
                        break;
                    case 110532135:
                        cls = !str.equals("toast") ? null : C1801530wyt.class;
                        break;
                    case 113457347:
                        cls = !str.equals("isGPSEnable") ? null : C757800To2.class;
                        break;
                    case 113464569:
                        cls = !str.equals("openLiveEventInviteGuestPanel") ? null : C1380190m1J.class;
                        break;
                    case 113951609:
                        cls = !str.equals("exitFullscreen") ? null : C1873560yr4.class;
                        break;
                    case 130932084:
                        cls = !str.equals("sendGiftV2") ? null : C1EAG.class;
                        break;
                    case 135667898:
                        cls = !str.equals("closeSubManagementPage") ? null : C1799470wvZ.class;
                        break;
                    case 137381439:
                        cls = !str.equals("OpenMultiGuestApplyPanel") ? null : C1506400pIs.class;
                        break;
                    case 177590940:
                        cls = !str.equals("gamePartnershipDetailPageData") ? null : C1849580yEO.class;
                        break;
                    case 266605796:
                        cls = !str.equals("gameOpenSheetSchema") ? null : C1800400wx4.class;
                        break;
                    case 273877843:
                        cls = !str.equals("openSubActionSheet") ? null : C0KFW.class;
                        break;
                    case 353686691:
                        cls = !str.equals("showLivePopup") ? null : C1530170pvD.class;
                        break;
                    case 384457610:
                        cls = !str.equals("openGiftPanel") ? null : C1120650fGh.class;
                        break;
                    case 405267931:
                        cls = !str.equals("disconnectMultiGuest") ? null : C1801430wyj.class;
                        break;
                    case 413983056:
                        cls = !str.equals("getCoHostParams") ? null : C1850890yGV.class;
                        break;
                    case 421812189:
                        cls = !str.equals("gamePartnershipMixJumpTab") ? null : C1505070pGj.class;
                        break;
                    case 458462688:
                        cls = !str.equals("StoryPageFromLiveEvent") ? null : C1B18.class;
                        break;
                    case 459474341:
                        cls = !str.equals("subLinkShare") ? null : C0KYV.class;
                        break;
                    case 547775784:
                        cls = !str.equals("formatCurrency") ? null : C1798860wua.class;
                        break;
                    case 555030310:
                        cls = !str.equals("subReportMonitor") ? null : C1826690xdT.class;
                        break;
                    case 583684516:
                        cls = !str.equals("openLiveNotificationSettings") ? null : C0KRC.class;
                        break;
                    case 589078167:
                        cls = !str.equals("getCreatorAB") ? null : C606080Npu.class;
                        break;
                    case 589554231:
                        cls = !str.equals("chooseImageForGame") ? null : C201974141c.class;
                        break;
                    case 602509327:
                        cls = !str.equals("revenueTaskInfo") ? null : C1147900fye.class;
                        break;
                    case 610780578:
                        cls = !str.equals("needShowCustomBizPopupAfterExchange") ? null : C1807500x8W.class;
                        break;
                    case 631327761:
                        cls = !str.equals("getSubStorage") ? null : C1506150pIT.class;
                        break;
                    case 652805007:
                        cls = !str.equals("setLiveGoalIndicatorSize") ? null : C1793670wmD.class;
                        break;
                    case 664278154:
                        cls = !str.equals("liveReplayRemux") ? null : C1800550wxJ.class;
                        break;
                    case 681598801:
                        cls = !str.equals("openLiveShowPanel") ? null : C1793420wlo.class;
                        break;
                    case 773388482:
                        cls = !str.equals("updateGoogleABSStatus") ? null : C1803250x1f.class;
                        break;
                    case 812977784:
                        cls = !str.equals("prefetchSchema") ? null : C1801410wyh.class;
                        break;
                    case 833769676:
                        cls = !str.equals("setAudienceLivePlayerMute") ? null : C516760KOk.class;
                        break;
                    case 837090941:
                        cls = !str.equals("openCoHostInvitePanel") ? null : C1116700fAK.class;
                        break;
                    case 851700386:
                        cls = !str.equals("getSubInfoData") ? null : C1506140pIS.class;
                        break;
                    case 877286009:
                        cls = !str.equals("partnershipMixPop") ? null : C1505020pGe.class;
                        break;
                    case 933100447:
                        cls = !str.equals("setLiveEffect") ? null : C1879630z0r.class;
                        break;
                    case 934196057:
                        cls = !str.equals("queryCachedGifts") ? null : C1141940fp2.class;
                        break;
                    case 950398559:
                        cls = !str.equals("comment") ? null : C1117000fAo.class;
                        break;
                    case 953020051:
                        cls = !str.equals("apiParam") ? null : C1EAP.class;
                        break;
                    case 972848306:
                        cls = !str.equals("sendMonitor") ? null : C0KRU.class;
                        break;
                    case 978152163:
                        cls = !str.equals("startVideoEdit") ? null : C1844590y6L.class;
                        break;
                    case 988298366:
                        cls = !str.equals("openPlaybookManagerPanel") ? null : C1878760yzS.class;
                        break;
                    case 997548627:
                        cls = !str.equals("liveShare") ? null : C517030KPl.class;
                        break;
                    case 1018065936:
                        cls = !str.equals("getUserLiveSettings") ? null : C1B24.class;
                        break;
                    case 1058973506:
                        cls = !str.equals("cohostStatusQuery") ? null : C1812390xGP.class;
                        break;
                    case 1061163489:
                        cls = !str.equals("userAction") ? null : C1812020xFo.class;
                        break;
                    case 1089391545:
                        cls = !str.equals("setStorage") ? null : C1506250pId.class;
                        break;
                    case 1107979063:
                        cls = !str.equals("chooseImageForSubV2") ? null : C207229167f.class;
                        break;
                    case 1156866322:
                        cls = !str.equals("openReplayPlayer") ? null : C21381718lz.class;
                        break;
                    case 1189849649:
                        cls = !str.equals("openStickerPanel") ? null : C1799790ww5.class;
                        break;
                    case 1191955014:
                        cls = !str.equals("gameJumpToApp") ? null : C1886230zBV.class;
                        break;
                    case 1247062232:
                        cls = !str.equals("sendGift") ? null : C1135730ff1.class;
                        break;
                    case 1298160691:
                        cls = !str.equals("isHavePinCard") ? null : C1793170wlP.class;
                        break;
                    case 1330260616:
                        cls = !str.equals("getGamePartnershipCachedData") ? null : C1878780yzU.class;
                        break;
                    case 1389365943:
                        cls = !str.equals("isUsingLiveEffect") ? null : C1879060yzw.class;
                        break;
                    case 1405458973:
                        cls = !str.equals("setSubStorage") ? null : C1506200pIY.class;
                        break;
                    case 1461021118:
                        cls = !str.equals("liveCoinConsumption") ? null : C1150600g30.class;
                        break;
                    case 1479368960:
                        cls = !str.equals("showLocationPicker") ? null : C1ALF.class;
                        break;
                    case 1500942303:
                        cls = !str.equals("partnershipMixRegisterEvent") ? null : C1504960pGY.class;
                        break;
                    case 1509434400:
                        cls = !str.equals("setLiveGoalIndicatorVisibility") ? null : C1889040zG2.class;
                        break;
                    case 1532184260:
                        cls = !str.equals("getBackpackInfo") ? null : C1144470ft7.class;
                        break;
                    case 1560416130:
                        cls = !str.equals("openStoreSubscribePage") ? null : C0KRP.class;
                        break;
                    case 1597234591:
                        cls = !str.equals("openInvoiceFile") ? null : C521240KcM.class;
                        break;
                    case 1625521610:
                        cls = !str.equals("preloadGiftEffect") ? null : C1182020grg.class;
                        break;
                    case 1626074171:
                        cls = !str.equals("gamePartnershipMixLynxCardDidFinishLoading") ? null : C1506770pJT.class;
                        break;
                    case 1688953395:
                        cls = !str.equals("getRoomTrackParam") ? null : C0KWP.class;
                        break;
                    case 1734864535:
                        cls = !str.equals("downloadFileWithLoadingView") ? null : C1839850xyh.class;
                        break;
                    case 1740278775:
                        cls = !str.equals("liveNotification") ? null : C517270KQj.class;
                        break;
                    case 1759243241:
                        cls = !str.equals("getGiftSettings") ? null : C1117020fAq.class;
                        break;
                    case 1797735134:
                        cls = !str.equals("updateReplayInfo") ? null : C1809350xBV.class;
                        break;
                    case 1856535667:
                        cls = !str.equals("openLiveInterruptGuideJumpSetting") ? null : C849020XSi.class;
                        break;
                    case 1871510438:
                        cls = !str.equals("getLiveTransactionSettingStatus") ? null : C1797470wsL.class;
                        break;
                    case 1894514417:
                        cls = !str.equals("showLynxPinCard") ? null : C1116650fAF.class;
                        break;
                    case 1994321851:
                        cls = !str.equals("postVideo") ? null : C1844660y6S.class;
                        break;
                    case 2101293058:
                        cls = !str.equals("partnershipMixPostEvent") ? null : C1505870pI1.class;
                        break;
                    default:
                        cls = null;
                        break;
                }
                if (cls != null) {
                    return cls;
                }
                IHostAppContext iHostAppContext2 = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class);
                if (iHostAppContext2 != null) {
                    zIsOffline2 = iHostAppContext2.isOffline();
                }
                if (!zIsOffline2 || !Intrinsics.LJFF(str, "updateGlobalProps")) {
                    return null;
                }
                return C1530080pv4.class;
            }
        };
    }

    public C1062470dkr(String str) {
        this.LIZ = str;
    }
}
