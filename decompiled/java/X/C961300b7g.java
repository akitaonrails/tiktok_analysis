package X;

import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.cohost.playentity.DesignatedGiftConfig;
import com.bytedance.android.live.liveinteract.match.ui.fragment.MatchManagementPanelDialog;
import com.bytedance.android.live.liveinteract.match.ui.fragment.MatchManagementPanelSheet;
import com.bytedance.android.live.liveinteract.matchv2.connection.combinedmatch.view.CombinedMatchInviterPanelDialog;
import com.bytedance.android.live.liveinteract.multihost.biz.dialog.LinkDialog;
import com.bytedance.android.live.liveinteract.multihost.biz.link.fragment.multicohostfragmentcontainer.MultiHostInviteListDialog;
import com.bytedance.android.live.toolbar.DismissToolbarPopEvent;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHostTakeTheStageV3Setting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS203S0000000_15;

/* JADX INFO: renamed from: X.0b7g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C961300b7g {
    public static final C961300b7g LIZ = new C961300b7g();
    public static final ConcurrentHashMap<String, Long> LIZIZ = new ConcurrentHashMap<>();

    public static void LIZLLL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dismissCoHostInviteList , dialog map = ");
        ConcurrentHashMap<String, Long> concurrentHashMap = LIZIZ;
        sbLIZ.append(concurrentHashMap);
        sbLIZ.append('}');
        C20441214yg.LJIIIZ("MultiCoHostSheetHelper", C2188811AlT.LIZIZ(sbLIZ));
        Long l = concurrentHashMap.get("cohost_invite_list");
        if (l != null) {
            C19322110iZ.LIZ(l.longValue());
        }
        concurrentHashMap.remove("cohost_invite_list");
    }

    public static void LJ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dismissCoHostInviteListAndMangerPanel , dialog map = ");
        sbLIZ.append(LIZIZ);
        sbLIZ.append('}');
        C20441214yg.LJIIIZ("MultiCoHostSheetHelper", C2188811AlT.LIZIZ(sbLIZ));
        LIZ("cohost_invite_list");
    }

    public static void LJFF() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dismissCoHostInviteePanel , dialog map = ");
        sbLIZ.append(LIZIZ);
        sbLIZ.append('}');
        C20441214yg.LJIIIZ("MultiCoHostSheetHelper", C2188811AlT.LIZIZ(sbLIZ));
        LIZ("cohost_be_invited_panel");
    }

    public static void LIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dismiss tag = ");
        sbLIZ.append(str);
        sbLIZ.append(" dialogMap = ");
        ConcurrentHashMap<String, Long> concurrentHashMap = LIZIZ;
        sbLIZ.append(concurrentHashMap);
        C20441214yg.LJIIIZ("MultiCoHostSheetHelper", C2188811AlT.LIZIZ(sbLIZ));
        Long l = concurrentHashMap.get(str);
        if (l != null) {
            C19322110iZ.LIZ(l.longValue());
        }
        concurrentHashMap.remove(str);
    }

    public static void LIZIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dismissAll dialogMap = ");
        ConcurrentHashMap<String, Long> concurrentHashMap = LIZIZ;
        sbLIZ.append(concurrentHashMap);
        sbLIZ.append("}, source = ");
        sbLIZ.append(str);
        C20441214yg.LJIIIZ("MultiCoHostSheetHelper", C2188811AlT.LIZIZ(sbLIZ));
        Iterator<Map.Entry<String, Long>> it2 = concurrentHashMap.entrySet().iterator();
        while (it2.hasNext()) {
            C19322110iZ.LIZ(it2.next().getValue().longValue());
        }
        LIZIZ.clear();
        C943660afE.LIZIZ();
        C972360bPW c972360bPW = C972360bPW.LIZ;
        EnumC972350bPV enumC972350bPV = EnumC972350bPV.LEAVE;
        c972360bPW.getClass();
        long j = C972360bPW.LIZIZ;
        if (j != 0) {
            C972360bPW.LIZJ = enumC972350bPV;
            C19322110iZ.LIZ(j);
        }
        if (LiveCoHostTakeTheStageV3Setting.INSTANCE.isEnable()) {
            C956470azt.LIZ("dismissAll");
        }
        C951960asc.LIZJ();
    }

    public static void LJI(DataChannel dataChannel) {
        int iHashCode;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dismissInteractionFeaturesDialog, dataChannel=");
        if (dataChannel != null) {
            iHashCode = dataChannel.hashCode();
        } else {
            iHashCode = 0;
        }
        sbLIZ.append(iHashCode);
        C20441214yg.LJIIIZ("MultiCoHostSheetHelper", C2188811AlT.LIZIZ(sbLIZ));
        if (dataChannel != null) {
            dataChannel.FQ2(DismissToolbarPopEvent.class);
        }
    }

    public static boolean LJII(String str) {
        Long l = LIZIZ.get(str);
        if (l != null) {
            return C464790IKn.LIZ.LIZIZ(l.longValue());
        }
        return false;
    }

    public static boolean LJIIIIZZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isVisible tag = ");
        sbLIZ.append(str);
        sbLIZ.append(" dialogMap = ");
        ConcurrentHashMap<String, Long> concurrentHashMap = LIZIZ;
        sbLIZ.append(concurrentHashMap);
        C20441214yg.LJIIIZ("MultiCoHostSheetHelper", C2188811AlT.LIZIZ(sbLIZ));
        return concurrentHashMap.containsKey(str);
    }

    public static void LJIIIZ(DataChannel dataChannel, C978100bYm c978100bYm) {
        FragmentManager fragmentManager;
        if (dataChannel != null && (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) != null) {
            String str = CombinedMatchInviterPanelDialog._pnsPageId;
            c978100bYm.LIZ = dataChannel;
            C19322110iZ.LJFF(fragmentManager, new CombinedMatchInviterPanelDialog(c978100bYm), "match_combined_inviter_dialog", new InterfaceC1090170eTX() { // from class: X.0b7h
                @Override // X.InterfaceC1090170eTX
                public final void LIZ(long j) {
                    Long lValueOf = Long.valueOf(j);
                    ConcurrentHashMap<String, Long> concurrentHashMap = C961300b7g.LIZIZ;
                    concurrentHashMap.put("match_combined_inviter_dialog", lValueOf);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("openCombinedMatchInviterPanel dialogMap = ");
                    sbLIZ.append(concurrentHashMap);
                    sbLIZ.append(" token = ");
                    sbLIZ.append(j);
                    C20441214yg.LIZIZ("MultiCoHostSheetHelper", C2188811AlT.LIZIZ(sbLIZ));
                }
            }, 0);
        }
    }

    public static MatchManagementPanelDialog LJIIL(DataChannel dataChannel, C976780bWe c976780bWe) {
        FragmentManager fragmentManager;
        if (dataChannel != null && (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) != null) {
            String str = MatchManagementPanelDialog._pnsPageId;
            c976780bWe.LIZ = dataChannel;
            MatchManagementPanelDialog matchManagementPanelDialog = new MatchManagementPanelDialog(c976780bWe);
            C19322110iZ.LJFF(fragmentManager, matchManagementPanelDialog, "match_management_panel_dialog", new InterfaceC1090170eTX() { // from class: X.0aiL
                @Override // X.InterfaceC1090170eTX
                public final void LIZ(long j) {
                    Long lValueOf = Long.valueOf(j);
                    ConcurrentHashMap<String, Long> concurrentHashMap = C961300b7g.LIZIZ;
                    concurrentHashMap.put("match_management_panel_dialog", lValueOf);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("openMatchManagementPanelDialog dialogMap = ");
                    sbLIZ.append(concurrentHashMap);
                    sbLIZ.append(" token = ");
                    sbLIZ.append(j);
                    C20441214yg.LIZIZ("MultiCoHostSheetHelper", C2188811AlT.LIZIZ(sbLIZ));
                }
            }, 0);
            return matchManagementPanelDialog;
        }
        return null;
    }

    public static MatchManagementPanelSheet LJIILIIL(DataChannel dataChannel, C961680b8I c961680b8I) {
        FragmentManager fragmentManager;
        if (dataChannel != null && (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) != null) {
            MatchManagementPanelSheet matchManagementPanelSheet = new MatchManagementPanelSheet();
            matchManagementPanelSheet.LLJZIJLIL = c961680b8I.LIZ;
            matchManagementPanelSheet.LLL = c961680b8I.LIZIZ;
            C19322110iZ.LJFF(fragmentManager, matchManagementPanelSheet, "match_management_panel_dialog", new InterfaceC1090170eTX() { // from class: X.0aiM
                @Override // X.InterfaceC1090170eTX
                public final void LIZ(long j) {
                    Long lValueOf = Long.valueOf(j);
                    ConcurrentHashMap<String, Long> concurrentHashMap = C961300b7g.LIZIZ;
                    concurrentHashMap.put("match_management_panel_dialog", lValueOf);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("openMatchManagementPanelSheet dialogMap = ");
                    sbLIZ.append(concurrentHashMap);
                    sbLIZ.append(" token = ");
                    sbLIZ.append(j);
                    C20441214yg.LIZIZ("MultiCoHostSheetHelper", C2188811AlT.LIZIZ(sbLIZ));
                }
            }, 0);
            return matchManagementPanelSheet;
        }
        return null;
    }

    public static void LJIIJJI(DataChannel dataChannel, boolean z, WeakReference weakReference, C943950afh c943950afh, boolean z2) {
        EnumC961320b7i enumC961320b7i;
        FragmentManager fragmentManager;
        String str;
        long jLIZ = C158B.LIZ();
        if (z) {
            enumC961320b7i = EnumC961320b7i.QUICK_COHOST_TIMEOUT;
        } else if (C915980Zwa.LJII().LLILZLL(true).size() < 2 && !C915980Zwa.LJII().LLI().isLinking()) {
            enumC961320b7i = EnumC961320b7i.COMPRESS_TITLE_ICON;
        } else {
            enumC961320b7i = EnumC961320b7i.COMPRESS_TITLE_ICON_IN_COHOST;
        }
        if (dataChannel != null && (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) != null) {
            String str2 = MultiHostInviteListDialog._pnsPageId;
            C961290b7f c961290b7f = new C961290b7f();
            c961290b7f.LIZIZ = false;
            c961290b7f.LIZJ = null;
            c961290b7f.LJ = z;
            c961290b7f.LJFF = enumC961320b7i;
            c961290b7f.LIZLLL = weakReference;
            c961290b7f.LJI = c943950afh;
            c961290b7f.LIZ = dataChannel;
            C19322110iZ.LJFF(fragmentManager, new MultiHostInviteListDialog(c961290b7f), "cohost_invite_list", new InterfaceC1090170eTX() { // from class: X.0ah7
                @Override // X.InterfaceC1090170eTX
                public final void LIZ(long j) {
                    Long lValueOf = Long.valueOf(j);
                    ConcurrentHashMap<String, Long> concurrentHashMap = C961300b7g.LIZIZ;
                    concurrentHashMap.put("cohost_invite_list", lValueOf);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("openInviteListPanel dialogMap = ");
                    sbLIZ.append(concurrentHashMap);
                    sbLIZ.append(" token = ");
                    sbLIZ.append(j);
                    C20441214yg.LIZIZ("MultiCoHostSheetHelper", C2188811AlT.LIZIZ(sbLIZ));
                }
            }, 0);
            C955440ayE c955440ayE = new C955440ayE();
            long jLIZ2 = C158B.LIZ() - jLIZ;
            c955440ayE.LJIIL(Integer.valueOf(z ? 1 : 0), "list_type", true);
            AbstractC962030b8r.LJIIJ(c955440ayE.LIZLLL, "prepare_duration", Long.valueOf(jLIZ2), true);
            if (z2) {
                str = "click";
            } else {
                str = "show";
            }
            AbstractC962030b8r.LJIIJ(c955440ayE.LIZLLL, "trigger_action", str, true);
            c955440ayE.LJIJJLI("invitee_list_show");
        }
    }

    public static void LJIIJ(C961300b7g c961300b7g, DataChannel dataChannel, LifecycleOwner lifecycleOwner, C961760b8Q c961760b8Q, C914740Zua c914740Zua, boolean z, Function0 function0, int i) {
        Function0 function02 = function0;
        boolean z2 = z;
        C914740Zua c914740Zua2 = c914740Zua;
        C946060aj6<DesignatedGiftConfig> c946060aj6 = null;
        if ((i & 4) != 0) {
            c961760b8Q = null;
        }
        if ((i & 8) != 0) {
            c914740Zua2 = null;
        }
        if ((i & 16) != 0) {
            z2 = false;
        }
        if ((i & 32) != 0) {
            function02 = AFwS203S0000000_15.get$arr$(387);
        }
        c961300b7g.getClass();
        if (c961760b8Q != null) {
            c946060aj6 = c961760b8Q.LIZ;
        }
        LinkDialog linkDialog = new LinkDialog(lifecycleOwner);
        EnumC977660bY4 enumC977660bY4 = EnumC977660bY4.TYPE_MATCH_GIFT_SELECT;
        C979740bbQ c979740bbQ = new C979740bbQ(false, false, c946060aj6, c914740Zua2, z2, function02);
        linkDialog.LLILZIL = enumC977660bY4;
        linkDialog.LLILZLL = c979740bbQ;
        C957750b1x.LIZ(dataChannel, linkDialog, "LinkDialog");
    }
}
