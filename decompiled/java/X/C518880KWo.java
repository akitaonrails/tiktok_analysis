package X;

import com.bytedance.android.livesdk.comp.api.pcs.util.SMBPageActionChannel;
import com.bytedance.android.livesdk.subscribe.model.GetSubInfoResponse;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.n;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: renamed from: X.0KWo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C518880KWo implements InterfaceC1141530foN {
    public static final C518880KWo LL = new C518880KWo();
    public static DataChannel LLILLJJLI;
    public static EnumC518930KWt LLILLL;
    public static Map<String, String> LLILZ;

    public static void LIZ() {
        DataChannel dataChannel;
        final EnumC518930KWt enumC518930KWt = LLILLL;
        if (enumC518930KWt == null || (dataChannel = LLILLJJLI) == null) {
            return;
        }
        final Map<String, String> map = LLILZ;
        dataChannel.zW(SMBPageActionChannel.class, new AbstractC518960KWw(enumC518930KWt, map) { // from class: X.0KWx
        });
    }

    public static final void LIZIZ() {
        final EnumC518930KWt enumC518930KWt = LLILLL;
        if (enumC518930KWt != null) {
            DataChannel dataChannel = LLILLJJLI;
            if (dataChannel != null) {
                final Map<String, String> map = LLILZ;
                dataChannel.zW(SMBPageActionChannel.class, new AbstractC518960KWw(enumC518930KWt, map) { // from class: X.0KWu
                });
            }
            LL.LJI();
        }
    }

    public static final void LIZJ() {
        DataChannel dataChannel;
        EnumC518930KWt enumC518930KWt = LLILLL;
        if (enumC518930KWt == null || (dataChannel = LLILLJJLI) == null) {
            return;
        }
        dataChannel.zW(SMBPageActionChannel.class, new C518950KWv(enumC518930KWt, LLILZ));
    }

    public static final void LIZLLL() {
        n nVar = C199200pi.LIZ.get(String.valueOf(UserService.getInstance().user().getCurrentUserId()));
        if (nVar != null) {
            GsonProtectorUtils.fromJson(C19748512Ol.LIZJ, nVar.toString(), GetSubInfoResponse.class);
        }
    }

    public final void LJFF() {
        C1548820qPI.LIZLLL("playbook_request_data", this);
        C1548820qPI.LIZLLL("playbook_leads_opt_in_button_clicked", this);
        EventBus.LIZLLL().LJIJJ(this);
    }

    public final void LJI() {
        C1548820qPI.LJIIIIZZ("playbook_request_data", this);
        C1548820qPI.LJIIIIZZ("playbook_leads_opt_in_button_clicked", this);
        EventBus.LIZLLL().LJJI(this);
        LLILLJJLI = null;
        LLILLL = null;
        LLILZ = null;
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        Object obj;
        Map<String, Object> mapLIZ;
        String str = c262100zr.LIZ;
        if (Intrinsics.LJFF(str, "playbook_request_data")) {
            InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
            Object obj2 = null;
            if (interfaceC1107590evd != null && (mapLIZ = interfaceC1107590evd.LIZ()) != null) {
                mapLIZ.get("page_data");
                obj = mapLIZ.get("page_status");
            } else {
                obj = null;
            }
            if (obj instanceof Boolean) {
                obj2 = obj;
            }
            if (!Intrinsics.LJFF(obj2, Boolean.TRUE) && Intrinsics.LJFF(obj2, Boolean.FALSE)) {
                LIZIZ();
                return;
            }
            return;
        }
        if (!Intrinsics.LJFF(str, "playbook_leads_opt_in_button_clicked")) {
            return;
        }
        LIZ();
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onEvent(C518900KWq c518900KWq) {
        if (LLILLL != EnumC518930KWt.SERVICEPLUS_HOST_SIDE) {
            return;
        }
        LIZIZ();
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onEvent(C518980KWy c518980KWy) {
        if (LLILLL != EnumC518930KWt.SERVICEPLUS_AUDIENCE_SIDE) {
            return;
        }
        LIZIZ();
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onEvent(C518890KWp c518890KWp) {
        LIZ();
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onEvent(C518910KWr c518910KWr) {
        LIZ();
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0264, code lost:
    
        r1 = r1.getUrls();
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0268, code lost:
    
        if (r1 == null) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x026a, code lost:
    
        r8 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r1, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x026e, code lost:
    
        r6.LJFF(r7, X.C2097908Jt.LIZJ(new kotlin.Pair("avatar", r8)), false, false, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0280, code lost:
    
        if (r3 == null) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0282, code lost:
    
        r1 = r3.getOwner();
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0286, code lost:
    
        if (r1 == null) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0288, code lost:
    
        r1 = r1.getAvatarLarge();
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x028c, code lost:
    
        if (r1 == null) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x028e, code lost:
    
        r1 = r1.getUrls();
     */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        r3 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r17.gg0(com.bytedance.android.livesdk.dataChannel.RoomChannel.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0292, code lost:
    
        if (r1 == null) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0295, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0297, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x02a2, code lost:
    
        if (r1 == false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
    
        if (r3 == null) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        r2 = r7.J8();
        X.C518880KWo.LLILLJJLI = r17;
        X.C518880KWo.LLILZ = r18;
        r9 = "";
        r8 = null;
        r8 = null;
        r8 = null;
        r8 = null;
        r8 = null;
        r8 = null;
        r8 = null;
        r8 = null;
        r8 = null;
        r8 = null;
        r8 = null;
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
    
        if (X.C500260Jjc.LJJIJLIJ() == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004c, code lost:
    
        X.C20441214yg.LIZIZ("SMBEntranceHelper", "openServicePlusInGoLivePage");
        r1 = X.C497740JfY.LJII();
        r5 = (com.bytedance.android.livesdk.subscribe.model.GetSubInfoResponse) r17.gg0(com.bytedance.android.livesdk.dataChannel.SubInfoResponseChannel.class);
        r3 = (X.C2660011e) r17.gg0(X.C770500UKi.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0065, code lost:
    
        if (r3 == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0067, code lost:
    
        r2 = r3.LIZ(X.InterfaceC518920KWs.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006d, code lost:
    
        r2 = (X.InterfaceC518920KWs) r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006f, code lost:
    
        if (r2 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0071, code lost:
    
        r6 = r2.getShowEntrance();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0075, code lost:
    
        if (r6 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007b, code lost:
    
        if (r6.length() != 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007d, code lost:
    
        r6 = "live_take_page";
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007f, code lost:
    
        X.C518880KWo.LLILLL = X.EnumC518930KWt.SERVICEPLUS_HOST_SIDE;
        LJFF();
        LIZJ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0089, code lost:
    
        if (r5 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008d, code lost:
    
        if (r5.smbOptInStatus != 1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008f, code lost:
    
        r2 = com.bytedance.android.livesdk.userservice.UserService.getInstance().user();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0097, code lost:
    
        if (r2 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0099, code lost:
    
        r4 = r2.LJIJJLI();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009d, code lost:
    
        if (r4 == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009f, code lost:
    
        r8 = java.lang.Long.valueOf(r4.getId());
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a7, code lost:
    
        r7 = java.lang.String.valueOf(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ab, code lost:
    
        if (r4 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ad, code lost:
    
        r8 = r4.getSecUid();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b1, code lost:
    
        if (r8 != null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b3, code lost:
    
        r8 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b4, code lost:
    
        r4 = com.bytedance.android.livesdk.livesetting.broadcast.subscription.SubscribeUpsellLynxUrlSetting.INSTANCE.getSmbManagementPage(r6, r7, r8, r7, false, "", "", false);
        r3 = X.C2188811AlT.LIZ();
        r3.append("openServicePlusInGoLivePage SMB_STATUS_OPT_IN managementSchema=");
        r3.append(r4);
        X.C20441214yg.LIZIZ("SMBEntranceHelper", X.C2188811AlT.LIZIZ(r3));
        ((com.bytedance.android.live.actionhandler.IActionHandlerService) X.C1161920gLG.LIZJ(com.bytedance.android.live.actionhandler.IActionHandlerService.class)).handle(r1, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00dd, code lost:
    
        X.C20441214yg.LIZIZ("SMBEntranceHelper", "openServicePlusPage end");
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e2, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e3, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e5, code lost:
    
        X.C20441214yg.LIZIZ("SMBEntranceHelper", "openServicePlusInGoLivePage !SMB_STATUS_OPT_IN");
        r8 = java.lang.String.valueOf(com.bytedance.android.livesdk.userservice.UserService.getInstance().user().getCurrentUserId());
        r2 = com.bytedance.android.livesdk.userservice.UserService.getInstance().user().LJIJJLI();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0108, code lost:
    
        if (r2 == null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x010a, code lost:
    
        r2 = r2.getSecUid();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x010e, code lost:
    
        if (r2 == null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0110, code lost:
    
        r9 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0111, code lost:
    
        ((com.bytedance.android.livesdk.comp.api.pcs.IPcsService) X.C1161920gLG.LIZJ(com.bytedance.android.livesdk.comp.api.pcs.IPcsService.class)).xf().LJIJ(r1, new com.bytedance.android.livesdk.comp.api.pcs.data.model.PcsServicePlusOptinPageParams(r8, r9, r6, 0, "", new java.util.HashMap()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x012e, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0131, code lost:
    
        if (r5 == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0133, code lost:
    
        if (r2 == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0135, code lost:
    
        r4 = X.C497740JfY.LJII();
        r10 = com.bytedance.android.livesdk.livesetting.broadcast.subscription.SubscribeUpsellLynxUrlSetting.INSTANCE;
        r1 = X.C500260Jjc.LJJLIIIIJ(X.C518880KWo.LLILLJJLI);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0143, code lost:
    
        if (r1 == null) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0145, code lost:
    
        r1 = java.lang.Long.valueOf(r1.getOwnerUserId());
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x014d, code lost:
    
        r12 = java.lang.String.valueOf(r1);
        r1 = X.C500260Jjc.LJJLIIIIJ(X.C518880KWo.LLILLJJLI);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0157, code lost:
    
        if (r1 == null) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0159, code lost:
    
        r1 = java.lang.Long.valueOf(r1.getOwnerUserId());
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0161, code lost:
    
        r13 = java.lang.String.valueOf(r1);
        r1 = X.C500260Jjc.LJJLIIIIJ(X.C518880KWo.LLILLJJLI);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x016b, code lost:
    
        if (r1 == null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x016d, code lost:
    
        r1 = r1.getOwner();
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0171, code lost:
    
        if (r1 == null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0173, code lost:
    
        r1 = r1.getSecUid();
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0177, code lost:
    
        if (r1 == null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0179, code lost:
    
        r9 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x017a, code lost:
    
        r3 = r10.getSmbAnchorServicePage("live_detail_anchor_toolbar_service_plus", r12, r13, r9, "");
        r2 = X.C2188811AlT.LIZ();
        r2.append("openServicePlusHostSide smbManagementSchema=");
        r2.append(r3);
        X.C20441214yg.LIZIZ("SMBEntranceHelper", X.C2188811AlT.LIZIZ(r2));
        X.C518880KWo.LLILLL = X.EnumC518930KWt.SERVICEPLUS_HOST_SIDE;
        LJFF();
        LIZJ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x019e, code lost:
    
        if (r4 == null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01a0, code lost:
    
        ((com.bytedance.android.live.actionhandler.IActionHandlerService) X.C1161920gLG.LIZJ(com.bytedance.android.live.actionhandler.IActionHandlerService.class)).handle(r4, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01ab, code lost:
    
        ((com.bytedance.android.livesdk.comp.api.pcs.IPcsService) X.C1161920gLG.LIZJ(com.bytedance.android.livesdk.comp.api.pcs.IPcsService.class)).ei().LIZLLL();
        r3 = X.C518990KWz.LIZ;
        r1 = X.C500260Jjc.LJJLIIIIJ(X.C518880KWo.LLILLJJLI);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01c2, code lost:
    
        if (r1 == null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01c4, code lost:
    
        r1 = java.lang.Long.valueOf(r1.getOwnerUserId());
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01cc, code lost:
    
        r4 = java.lang.String.valueOf(r1);
        r1 = X.C500260Jjc.LJJLIIIIJ(X.C518880KWo.LLILLJJLI);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01d6, code lost:
    
        if (r1 == null) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01d8, code lost:
    
        r1 = java.lang.Long.valueOf(r1.getId());
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01e0, code lost:
    
        r6 = java.lang.String.valueOf(r1);
        r1 = X.C500260Jjc.LJJLIIIIJ(X.C518880KWo.LLILLJJLI);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01ea, code lost:
    
        if (r1 == null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01ec, code lost:
    
        r1 = r1.smbInfo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01ee, code lost:
    
        if (r1 == null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01f0, code lost:
    
        r8 = java.lang.Integer.valueOf(r1.smbOptInSource);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01f6, code lost:
    
        r3.LIZIZ(r4, "live_detail_anchor_toolbar_service_plus", r6, false, r8, new java.util.LinkedHashMap(), X.C518880KWo.LLILLJJLI);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0205, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0207, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0209, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x020c, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x020f, code lost:
    
        X.C20441214yg.LIZIZ("SMBEntranceHelper", "openServicePlusAudienceSide");
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0214, code lost:
    
        if (r3 == null) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0216, code lost:
    
        r1 = r3.getOwner();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x021a, code lost:
    
        if (r1 == null) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x021c, code lost:
    
        r1 = r1.getSecUid();
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0220, code lost:
    
        if (r1 == null) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0222, code lost:
    
        r9 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0223, code lost:
    
        if (r3 == null) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0225, code lost:
    
        r1 = java.lang.Long.valueOf(r3.getId());
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x022d, code lost:
    
        r7 = new X.C521380Kca("live_detail_service_plus", r9, false, java.lang.String.valueOf(r1));
        X.C518880KWo.LLILLL = X.EnumC518930KWt.SERVICEPLUS_AUDIENCE_SIDE;
        LJFF();
        LIZJ();
        r6 = ((com.bytedance.android.livesdk.comp.api.pcs.IPcsService) X.C1161920gLG.LIZJ(com.bytedance.android.livesdk.comp.api.pcs.IPcsService.class)).xf();
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0254, code lost:
    
        if (com.bytedance.android.livesdk.livesetting.OptAvatarLargeUseSetting.INSTANCE.enable() == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0256, code lost:
    
        if (r3 == null) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0258, code lost:
    
        r1 = r3.getOwner();
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x025c, code lost:
    
        if (r1 == null) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x025e, code lost:
    
        r1 = r1.getAvatarThumb();
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0262, code lost:
    
        if (r1 == null) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002e, code lost:
    
        if (r8.smbDisplay == true) goto L10;
     */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(com.bytedance.ies.sdk.datachannel.DataChannel r17, java.util.Map r18) {
        /*
            Method dump skipped, instruction units count: 700
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C518880KWo.LJ(com.bytedance.ies.sdk.datachannel.DataChannel, java.util.Map):void");
    }
}
