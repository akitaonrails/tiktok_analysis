package X;

import android.graphics.Rect;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.layout.component.render.MultiGuestLayoutRenderV2;
import com.bytedance.android.live.liveinteract.multiguestv3.main.sharerevnue.ISharedRevenueAbility;
import com.bytedance.android.live.liveinteract.multiguestv3.main.sharerevnue.MultiGuestAnchorShareRevenueViewModel;
import com.bytedance.android.live.liveinteract.platform.statemanager.LinkStatusViewModel;
import com.bytedance.android.live.liveinteract.platform.statemanager.iablility.ILinkStateAbility;
import com.bytedance.android.livesdk.dataChannel.ShortCutPanelShowChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.tiktok.kmp.live.socialgamebusinessapi.event.MultiLetsDanceDataEvent;
import com.tiktok.kmp.live.socialgamebusinessapi.service.ILiveDanceService;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AFwS250S0000000_15;
import kotlin.jvm.internal.AwS134S0110000_16;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: renamed from: X.0aYV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C939490aYV implements InterfaceC941510abl {
    public final ViewGroup LIZ;
    public final ViewGroup LIZIZ;
    public final DataChannel LIZJ;
    public final InterfaceC923120a86 LIZLLL;
    public final C01GW LJ;
    public final C01GW LJFF;
    public final C01GW LJI;
    public final C01GW LJII;
    public final C01GW LJIIIIZZ;
    public final C01GW LJIIIZ;
    public final C01GW LJIIJ;

    @Override // X.InterfaceC941510abl
    public final void LIZ(Map<String, InterfaceC942030acb> map) {
        for (String str : (List) this.LJII.getValue()) {
            if (map.get(str) == null) {
                map.put(str, LIZJ(str));
                InterfaceC942030acb interfaceC942030acb = map.get(str);
                if (interfaceC942030acb != null) {
                    InterfaceC940060aZQ interfaceC940060aZQ = null;
                    InterfaceC937900aVw interfaceC937900aVwCi = C915980Zwa.LJIIIIZZ().Ci(null);
                    if (interfaceC937900aVwCi instanceof InterfaceC940060aZQ) {
                        interfaceC940060aZQ = (InterfaceC940060aZQ) interfaceC937900aVwCi;
                    }
                    interfaceC942030acb.LJIJ(interfaceC940060aZQ);
                }
            }
        }
    }

    @Override // X.InterfaceC941510abl
    public final void LIZIZ(Map<String, InterfaceC942030acb> map) {
        for (Object obj : (List) this.LJII.getValue()) {
            InterfaceC942030acb interfaceC942030acb = map.get(obj);
            if (interfaceC942030acb != null) {
                interfaceC942030acb.onDetach();
            }
            map.remove(obj);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final AbstractC939360aYI LIZJ(String str) {
        switch (str.hashCode()) {
            case -1999202542:
                if (!str.equals("live_room_window_frame_change_plugin")) {
                    return null;
                }
                final ViewGroup viewGroup = this.LIZ;
                final ViewGroup viewGroup2 = this.LIZIZ;
                final DataChannel dataChannel = this.LIZJ;
                return new AbstractC941490abj(viewGroup, viewGroup2, dataChannel) { // from class: X.0abi
                    public final ViewGroup LLILZ;
                    public final ViewGroup LLILZIL;
                    public final DataChannel LLILZLL;

                    @Override // X.InterfaceC942100aci
                    public final Rect LJIILL(C957020b0m c957020b0m, Rect rect) {
                        int iIntValue;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("onLinkMicWindowWillChangeFrame window=");
                        sbLIZ.append(c957020b0m);
                        sbLIZ.append(" rect=");
                        sbLIZ.append(rect);
                        C937310aUz.LJII("LiveRoomWindowFrameChangePlugin", C2188811AlT.LIZIZ(sbLIZ));
                        Integer num = (Integer) this.LLILZLL.gg0(ShortCutPanelShowChannel.class);
                        if (num != null && (iIntValue = num.intValue()) > 0) {
                            C465260IMi c465260IMi = C939890aZ9.LIZ;
                            if (C939890aZ9.LJI(c957020b0m.getIdentity())) {
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("needOffsetBottomToolbar=true window.identity=");
                                sbLIZ2.append(c957020b0m.getIdentity());
                                sbLIZ2.append(" rect=");
                                sbLIZ2.append(rect);
                                C937310aUz.LJII("LiveRoomWindowFrameChangePlugin", C2188811AlT.LIZIZ(sbLIZ2));
                                Rect rect2 = new Rect(rect);
                                rect2.top = rect.top - iIntValue;
                                rect2.bottom = rect.bottom - iIntValue;
                                rect = rect2;
                            } else {
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append("needOffsetBottomToolbar=false window.identity=");
                                sbLIZ3.append(c957020b0m.getIdentity());
                                sbLIZ3.append(" rect=");
                                sbLIZ3.append(rect);
                                C937310aUz.LJII("LiveRoomWindowFrameChangePlugin", C2188811AlT.LIZIZ(sbLIZ3));
                            }
                        } else {
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append("shortCutPanelHeight=0 window.identity=");
                            sbLIZ4.append(c957020b0m.getIdentity());
                            sbLIZ4.append(" rect=");
                            sbLIZ4.append(rect);
                            C937310aUz.LJII("LiveRoomWindowFrameChangePlugin", C2188811AlT.LIZIZ(sbLIZ4));
                        }
                        return C941460abg.LIZ(rect, c957020b0m, this.LLILZ.getContext());
                    }

                    {
                        this.LLILZ = viewGroup;
                        this.LLILZIL = viewGroup2;
                        this.LLILZLL = dataChannel;
                    }
                };
            case -1943271594:
                if (!str.equals("preview_live_business_plugin")) {
                    return null;
                }
                return new C917080ZyM(this.LIZ, this.LIZIZ, this.LIZJ);
            case -1815478661:
                if (!str.equals("sei_write_plugin")) {
                    return null;
                }
                final ViewGroup viewGroup3 = this.LIZ;
                final ViewGroup viewGroup4 = this.LIZIZ;
                return new AbstractC939360aYI(viewGroup3, viewGroup4) { // from class: X.0aVg
                    public final ViewGroup LLILZ;
                    public final ViewGroup LLILZIL;

                    @Override // X.AbstractC939360aYI, X.InterfaceC942030acb
                    public final void LJIL(C942080acg c942080acg) {
                        C937730aVf.LIZ();
                    }

                    {
                        this.LLILZ = viewGroup3;
                        this.LLILZIL = viewGroup4;
                    }
                };
            case -1632841074:
                if (!str.equals("apply_view_manager_plugin")) {
                    return null;
                }
                return new C939520aYY(this.LIZ, this.LIZIZ, this.LIZJ);
            case -1560434015:
                if (!str.equals("live_room_business_plugin")) {
                    return null;
                }
                return new C917090ZyN(this.LIZ, this.LIZIZ, this.LIZJ);
            case -1443902019:
                if (!str.equals("water_mark_plugin")) {
                    return null;
                }
                final ViewGroup viewGroup5 = this.LIZ;
                final ViewGroup viewGroup6 = this.LIZIZ;
                final DataChannel dataChannel2 = this.LIZJ;
                return new AbstractC939360aYI(viewGroup5, viewGroup6, dataChannel2) { // from class: X.0aYW
                    public final ViewGroup LLILZ;
                    public final ViewGroup LLILZIL;
                    public final DataChannel LLILZLL;

                    @Override // X.AbstractC939360aYI, X.InterfaceC942030acb
                    public final void LJIJ(InterfaceC940060aZQ interfaceC940060aZQ) {
                        super.LJIJ(interfaceC940060aZQ);
                        this.LLILZLL.BQ2(this, MultiGuestLayoutRenderV2.SwitchLayoutEvent.class, AFwS250S0000000_15.get$arr$(204));
                    }

                    {
                        this.LLILZ = viewGroup5;
                        this.LLILZIL = viewGroup6;
                        this.LLILZLL = dataChannel2;
                    }
                };
            case -1279247946:
                if (!str.equals("draw_guess_plugin")) {
                    return null;
                }
                return new C916990ZyD(this.LIZ, this.LIZIZ, this.LIZJ);
            case -1134778034:
                if (!str.equals("mic_seat_emoji_plugin")) {
                    return null;
                }
                return new C942040acc(this.LIZ, this.LIZIZ, this.LIZJ);
            case -896337256:
                if (!str.equals("voice_chat_business_plugin")) {
                    return null;
                }
                return new C923110a85(this.LIZ, this.LIZIZ, C940770aaZ.LIZ(), this.LIZJ);
            case -838586855:
                if (!str.equals("live_room_anchor_business_plugin")) {
                    return null;
                }
                final ViewGroup viewGroup7 = this.LIZ;
                final ViewGroup viewGroup8 = this.LIZIZ;
                return new AbstractC939360aYI(viewGroup7, viewGroup8) { // from class: X.0aYX
                    public final ViewGroup LLILZ;
                    public final ViewGroup LLILZIL;
                    public boolean LLILZLL = true;

                    @Override // X.AbstractC939360aYI, X.InterfaceC942030acb
                    public final void LJIL(C942080acg c942080acg) {
                        this.LLILZLL = false;
                    }

                    {
                        this.LLILZ = viewGroup7;
                        this.LLILZIL = viewGroup8;
                    }

                    @Override // X.AbstractC939360aYI, X.InterfaceC942030acb
                    public final C939730aYt LJIILLIIL(C939730aYt c939730aYt, C957020b0m c957020b0m) {
                        if (this.LLILZLL) {
                            C930540aK4.LJJIJL(c939730aYt);
                            return null;
                        }
                        return c939730aYt;
                    }
                };
            case -746368922:
                if (!str.equals("lets_dance_plugin")) {
                    return null;
                }
                final ViewGroup viewGroup9 = this.LIZ;
                final ViewGroup viewGroup10 = this.LIZIZ;
                final DataChannel dataChannel3 = this.LIZJ;
                return new AbstractC939360aYI(viewGroup9, viewGroup10, dataChannel3) { // from class: X.0aca
                    public final ViewGroup LLILZ;
                    public final ViewGroup LLILZIL;
                    public final DataChannel LLILZLL;

                    @Override // X.AbstractC939360aYI, X.InterfaceC942030acb
                    public final void LJIIJJI(EnumC965730bEp enumC965730bEp) {
                        C949060anw c949060anwYo1;
                        C947420alI c947420alILJII;
                        if (enumC965730bEp != EnumC965730bEp.INNER && C942160aco.LIZ() && (c949060anwYo1 = ((ILiveDanceService) C1161920gLG.LIZJ(ILiveDanceService.class)).Yo1()) != null && (c947420alILJII = c949060anwYo1.LJII()) != null && c947420alILJII.LIZJ != null) {
                            C937310aUz.LJII("MultiGuestLetsDancePlugin", "switch to co-host, Quit Game");
                            this.LLILZLL.LC0(MultiLetsDanceDataEvent.class, C947420alI.LIZ(c947420alILJII, EnumC947440alK.NONE, null, null, null, null, null, null, null, 1019));
                        }
                    }

                    @Override // X.AbstractC939360aYI, X.InterfaceC942030acb
                    public final void LJIL(C942080acg c942080acg) {
                        C947430alJ.LIZ(c942080acg, this.LLILZLL);
                    }

                    {
                        this.LLILZ = viewGroup9;
                        this.LLILZIL = viewGroup10;
                        this.LLILZLL = dataChannel3;
                    }
                };
            case -421514520:
                if (!str.equals("play_record_manager_plugin")) {
                    return null;
                }
                return new C922340a6q(this.LIZ, this.LIZIZ, this.LIZJ);
            case -17782979:
                if (!str.equals("preview_live_window_frame_change_plugin")) {
                    return null;
                }
                return new C941470abh(this.LIZ, this.LIZIZ, this.LIZJ);
            case 190855764:
                if (!str.equals("preview_live_gradient_layer_plugin")) {
                    return null;
                }
                return new C948720anO(this.LIZ, this.LIZIZ, this.LIZJ);
            case 442254461:
                if (!str.equals("gift_panel_plugin")) {
                    return null;
                }
                return new C938190aWP(this.LIZ, this.LIZIZ, this.LIZJ);
            case 844833658:
                if (!str.equals("agree_apply_guide_plugin")) {
                    return null;
                }
                final ViewGroup viewGroup11 = this.LIZ;
                final ViewGroup viewGroup12 = this.LIZIZ;
                final DataChannel dataChannel4 = this.LIZJ;
                return new AbstractC939360aYI(viewGroup11, viewGroup12, dataChannel4) { // from class: X.0aW0
                    public final ViewGroup LLILZ;
                    public final ViewGroup LLILZIL;
                    public final DataChannel LLILZLL;
                    public C943360aek LLIZ;

                    @Override // X.AbstractC939360aYI, X.InterfaceC942030acb
                    public final void onDetach() {
                        C943360aek c943360aek;
                        super.onDetach();
                        if (!C937930aVz.LIZ() || (c943360aek = this.LLIZ) == null) {
                            return;
                        }
                        c943360aek.LIZ();
                    }

                    @Override // X.AbstractC939360aYI, X.InterfaceC942030acb
                    public final void LJIJ(InterfaceC940060aZQ interfaceC940060aZQ) {
                        super.LJIJ(interfaceC940060aZQ);
                        if (C937930aVz.LIZ()) {
                            this.LLIZ = new C943360aek(this.LLILZLL, null);
                        }
                    }

                    {
                        this.LLILZ = viewGroup11;
                        this.LLILZIL = viewGroup12;
                        this.LLILZLL = dataChannel4;
                    }
                };
            case 1089733394:
                if (!str.equals("state_proxy_plugin")) {
                    return null;
                }
                final ViewGroup viewGroup13 = this.LIZ;
                final ViewGroup viewGroup14 = this.LIZIZ;
                final DataChannel dataChannel5 = this.LIZJ;
                return new AbstractC939360aYI(viewGroup13, viewGroup14, dataChannel5) { // from class: X.0aEs
                    public final ViewGroup LLILZ;
                    public final ViewGroup LLILZIL;
                    public final String LLILZLL = "MultiGuestV3StateProxyPlugin";
                    public final C938400aWk LLIZ;

                    @Override // X.AbstractC939360aYI, X.InterfaceC942030acb
                    public final void onDetach() {
                        this.LLIZ.LIZIZ();
                    }

                    @Override // X.AbstractC939360aYI, X.InterfaceC942030acb
                    public final void LJIIIIZZ(EnumC934000aPe enumC934000aPe) {
                        LinkStatusViewModel linkStatusViewModel;
                        if (enumC934000aPe != EnumC934000aPe.ANCHOR && enumC934000aPe != EnumC934000aPe.GUEST) {
                            C937310aUz.LIZLLL(this.LLILZLL, "uninstallAbility");
                            InterfaceC665370Q7z interfaceC665370Q7zLJ = C1555540qa8.LJ(this.LLILZ);
                            if (interfaceC665370Q7zLJ != null) {
                                InterfaceC494301wD interfaceC494301wDLIZIZ = C1555540qa8.LIZIZ(interfaceC665370Q7zLJ, ILinkStateAbility.class, null);
                                if ((interfaceC494301wDLIZIZ instanceof LinkStatusViewModel) && (linkStatusViewModel = (LinkStatusViewModel) interfaceC494301wDLIZIZ) != null) {
                                    linkStatusViewModel.eB1(interfaceC665370Q7zLJ);
                                }
                                C926770aDz.LIZ(interfaceC665370Q7zLJ, false);
                            }
                            this.LLIZ.LIZ();
                            return;
                        }
                        C937310aUz.LIZLLL(this.LLILZLL, "installAbility");
                        Fragment fragmentLIZ = C946803n0.LIZ(this.LLILZ);
                        if (fragmentLIZ == null) {
                            return;
                        }
                        C19719912Dl c19719912DlLIZ = C13LE.LIZ(LinkStatusViewModel.class);
                        LinkStatusViewModel linkStatusViewModel2 = (LinkStatusViewModel) C737770Swp.LIZ(new AwS560S0100000_16((C13IQ) c19719912DlLIZ, 659), new C452070Ho5(), C724750Sbp.LJII(fragmentLIZ), C724750Sbp.LJIIIZ(fragmentLIZ), new C940900aam(), new AwS134S0110000_16(fragmentLIZ, 7), new AwS134S0110000_16(fragmentLIZ, 6), new C987103tV(fragmentLIZ, false), AFwS250S0000000_15.get$arr$(134), c19719912DlLIZ);
                        InterfaceC665370Q7z interfaceC665370Q7zLIZLLL = C1555540qa8.LIZLLL(this.LLILZ);
                        C926770aDz.LIZ(interfaceC665370Q7zLIZLLL, true);
                        linkStatusViewModel2.iT0(interfaceC665370Q7zLIZLLL);
                        this.LLIZ.LIZLLL(linkStatusViewModel2);
                    }

                    {
                        this.LLILZ = viewGroup13;
                        this.LLILZIL = viewGroup14;
                        this.LLIZ = new C938400aWk(this, dataChannel5, null);
                    }
                };
            case 1181366285:
                if (!str.equals("share_bg_plugin")) {
                    return null;
                }
                return new C939260aY8(this.LIZ, this.LIZIZ, this.LIZLLL, this.LIZJ);
            case 1858409750:
                if (!str.equals("share_revenue_plugin")) {
                    return null;
                }
                final ViewGroup viewGroup15 = this.LIZ;
                final ViewGroup viewGroup16 = this.LIZIZ;
                final DataChannel dataChannel6 = this.LIZJ;
                return new AbstractC939360aYI(viewGroup15, viewGroup16, dataChannel6) { // from class: X.0ZyK
                    public final ViewGroup LLILZ;
                    public final ViewGroup LLILZIL;
                    public final DataChannel LLILZLL;
                    public ISharedRevenueAbility LLIZ;

                    @Override // X.AbstractC939360aYI, X.InterfaceC942030acb
                    public final void LJIJ(InterfaceC940060aZQ interfaceC940060aZQ) {
                        MultiGuestAnchorShareRevenueViewModel multiGuestAnchorShareRevenueViewModelKn1;
                        super.LJIJ(interfaceC940060aZQ);
                        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) this.LLILZLL.gg0(C956790b0P.class);
                        if (interfaceC665370Q7z != null) {
                            ISharedRevenueAbility iSharedRevenueAbility = (ISharedRevenueAbility) C1555540qa8.LIZIZ(interfaceC665370Q7z, ISharedRevenueAbility.class, null);
                            this.LLIZ = iSharedRevenueAbility;
                            if (iSharedRevenueAbility != null && (multiGuestAnchorShareRevenueViewModelKn1 = iSharedRevenueAbility.Kn1()) != null) {
                                MultiGuestAnchorShareRevenueViewModel.vQ2(multiGuestAnchorShareRevenueViewModelKn1, this, new AwS594S0100000_15(this, 948));
                            }
                        }
                    }

                    {
                        this.LLILZ = viewGroup15;
                        this.LLILZIL = viewGroup16;
                        this.LLILZLL = dataChannel6;
                    }
                };
            case 1967106849:
                if (!str.equals("padding_plugin")) {
                    return null;
                }
                return new C939350aYH(this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL, -1L);
            default:
                return null;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final Map<String, InterfaceC942030acb> LIZLLL(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        switch (str.hashCode()) {
            case -1362910461:
                if (str.equals("preview_live")) {
                    for (String str2 : (List) this.LJIIIZ.getValue()) {
                        linkedHashMap.put(str2, LIZJ(str2));
                    }
                }
                break;
            case -305560939:
                if (str.equals("voice_chat_room")) {
                    for (String str3 : (List) this.LJIIIIZZ.getValue()) {
                        linkedHashMap.put(str3, LIZJ(str3));
                    }
                }
                break;
            case 861108545:
                if (str.equals("feed_stream")) {
                    for (String str4 : (List) this.LJIIJ.getValue()) {
                        linkedHashMap.put(str4, LIZJ(str4));
                    }
                }
                break;
            case 1008942158:
                if (str.equals("live_room")) {
                    for (String str5 : (List) this.LJI.getValue()) {
                        linkedHashMap.put(str5, LIZJ(str5));
                    }
                    if (C930540aK4.LIZJ()) {
                        for (String str6 : (List) this.LJ.getValue()) {
                            linkedHashMap.put(str6, LIZJ(str6));
                        }
                    } else {
                        for (String str7 : (List) this.LJFF.getValue()) {
                            linkedHashMap.put(str7, LIZJ(str7));
                        }
                    }
                    if (!C915980Zwa.LIZLLL().w9()) {
                        for (String str8 : (List) this.LJII.getValue()) {
                            linkedHashMap.put(str8, LIZJ(str8));
                        }
                    }
                }
                break;
        }
        Map<String, Object> map = C1338270kvh.LIZ;
        return linkedHashMap;
    }

    public C939490aYV(ViewGroup viewGroup, ViewGroup viewGroup2, DataChannel dataChannel) {
        InterfaceC923120a86 interfaceC923120a86LIZ = C940770aaZ.LIZ();
        this.LIZ = viewGroup;
        this.LIZIZ = viewGroup2;
        this.LIZJ = dataChannel;
        this.LIZLLL = interfaceC923120a86LIZ;
        this.LJ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1459));
        this.LJFF = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1460));
        this.LJI = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(395));
        this.LJII = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(394));
        this.LJIIIIZZ = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(397));
        this.LJIIIZ = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(396));
        this.LJIIJ = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(393));
    }
}
