package X;

import android.net.Uri;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.DismissPreviewSettingDialogEvent;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.billboard.IBillboardService;
import com.bytedance.android.livesdk.chatroom.event.DonationBoardVisibleEvent;
import com.bytedance.android.livesdk.dataChannel.DonationInfoUpdateEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.SelectedDonationStickerChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveDonationOptSetting;
import com.bytedance.android.livesdk.model.DonationSticker;
import com.bytedance.android.livesdk.model.OrganizationModel;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import webcast.data.host_board.BoardCell;
import webcast.data.host_board.ClickAction;
import webcast.data.host_board.HostBoard;
import webcast.data.host_board.ImageStyle;
import webcast.data.host_board.Padding;

/* JADX INFO: renamed from: X.00zm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C261600zm implements InterfaceC769510UGn, InterfaceC1141530foN {
    public final DataChannel LL;
    public final InterfaceC261700zn LLILLJJLI;
    public String LLILLL = "";
    public String LLILZ = "";
    public final C11NJ LLILZIL = new C11NJ();

    @Override // X.InterfaceC769510UGn
    public final void LIZ() {
        C1548820qPI.LJIIIIZZ("donation_added_nonprofit", this);
        C1548820qPI.LJIIIIZZ("donation_removed_nonprofit", this);
    }

    @Override // X.InterfaceC769510UGn
    public final void LIZLLL() {
        C1548820qPI.LIZLLL("donation_added_nonprofit", this);
        C1548820qPI.LIZLLL("donation_removed_nonprofit", this);
    }

    public final void LJI() {
        String string;
        Room room;
        User owner;
        String string2;
        Room room2;
        User owner2;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_donation_sticker_infoboard_remove");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(this.LLILLL, "NGO_name");
        c474500IjALIZ.LJJII(this.LLILZ, "fundraiser_id");
        DataChannel dataChannel = this.LL;
        String str = "";
        if (dataChannel == null || (room2 = (Room) dataChannel.gg0(RoomChannel.class)) == null || (owner2 = room2.getOwner()) == null || (string = Long.valueOf(owner2.getId()).toString()) == null) {
            string = "";
        }
        c474500IjALIZ.LJJII(string, "fundraiser_owner_id");
        DataChannel dataChannel2 = this.LL;
        if (dataChannel2 != null && (room = (Room) dataChannel2.gg0(RoomChannel.class)) != null && (owner = room.getOwner()) != null && (string2 = Long.valueOf(owner.getId()).toString()) != null) {
            str = string2;
        }
        c474500IjALIZ.LJJII(str, "from_user_id");
        c474500IjALIZ.LIZ();
    }

    @Override // X.InterfaceC769510UGn
    public final void LIZJ(LifecycleOwner lifecycleOwner) {
        LIZLLL();
        C262100zr c262100zr = C261900zp.LIZ;
        if (c262100zr != null) {
            LJ(c262100zr);
            C261900zp.LIZ = null;
        }
        DataChannel dataChannel = this.LL;
        if (dataChannel != null) {
            dataChannel.BQ2(lifecycleOwner, DonationInfoUpdateEvent.class, new C5183020f(this, 263));
        }
        this.LLILZIL.LIZ(C784440Upu.LIZ().LJFF(lifecycleOwner, C201100q1.class).LIZJ(new C516201zk(this, 289)));
        this.LLILZIL.LIZ(C784440Upu.LIZ().LJFF(lifecycleOwner, C201000q0.class).LIZJ(new C09JN() { // from class: X.00pz
            @Override // X.C09JN
            public final void accept(Object obj) {
                Object c098200Yq;
                String str;
                C1C7U.LIZ("DonationStickerJsEventSubscriber@9cf1.observeEvent$4");
                C201000q0 c201000q0 = (C201000q0) obj;
                if (Intrinsics.LJFF(c201000q0.LIZ.bizType, "donation") && this.LL.LLILZ.length() == 0) {
                    C261600zm c261600zm = this.LL;
                    HostBoard hostBoard = c201000q0.LIZ;
                    c261600zm.LLILZ = hostBoard.boardId;
                    Object obj2 = null;
                    try {
                        byte[] bArr = hostBoard.paramsData;
                        if (bArr != null) {
                            HashMap<String, Object> mapLJLZ = C500260Jjc.LJLZ(bArr);
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            for (Map.Entry<String, Object> entry : mapLJLZ.entrySet()) {
                                if (entry.getValue() instanceof String) {
                                    linkedHashMap.put(entry.getKey(), entry.getValue());
                                }
                            }
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap(C2097908Jt.LIZIZ(linkedHashMap.size()));
                            for (T t : linkedHashMap.entrySet()) {
                                linkedHashMap2.put(((Map.Entry) t).getKey(), (String) ((Map.Entry) t).getValue());
                            }
                            c098200Yq = new HashMap(linkedHashMap2);
                        } else {
                            c098200Yq = null;
                        }
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    if (C189200o6.m5exceptionOrNullimpl(c098200Yq) == null) {
                        obj2 = c098200Yq;
                    }
                    HashMap map = (HashMap) obj2;
                    if (map == null || (str = (String) map.get("ngo_name")) == null) {
                        str = "";
                    }
                    c261600zm.LLILLL = str;
                    DataChannel dataChannel2 = this.LL.LL;
                    if (dataChannel2 != null) {
                        dataChannel2.LC0(DonationBoardVisibleEvent.class, Boolean.TRUE);
                    }
                }
                C1C7U.LIZIZ("DonationStickerJsEventSubscriber@9cf1.observeEvent$4");
            }
        }));
    }

    public final void LJ(C262100zr c262100zr) {
        boolean z;
        String strGw2;
        Room room;
        if (this.LLILZ.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        Long lValueOf = null;
        if (z) {
            IBillboardService iBillboardService = (IBillboardService) C1161920gLG.LIZJ(IBillboardService.class);
            String str = this.LLILZ;
            HostBoard hostBoardLJFF = LJFF(c262100zr);
            C011V c011v = C011V.BROADCAST;
            DataChannel dataChannel = this.LL;
            if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
                lValueOf = Long.valueOf(room.getId());
            }
            strGw2 = iBillboardService.cX1(str, hostBoardLJFF, c011v, lValueOf, null);
        } else {
            DataChannel dataChannel2 = this.LL;
            if (dataChannel2 != null) {
                dataChannel2.LC0(DonationBoardVisibleEvent.class, Boolean.TRUE);
            }
            strGw2 = ((IBillboardService) C1161920gLG.LIZJ(IBillboardService.class)).gw2(LJFF(c262100zr), C011V.BROADCAST, 0L, null);
        }
        this.LLILZ = strGw2;
    }

    public final HostBoard LJFF(C262100zr c262100zr) {
        String strLJFF;
        String strLJFF2;
        String strLJFF3;
        String strLJFF4;
        String strLJFF5;
        String string;
        String strLIZ;
        String string2;
        String string3;
        Long lValueOf;
        String string4;
        String strLJFF6;
        List<String> listSingletonList;
        boolean z;
        String strLJIJJ;
        String strLJFF7;
        Room room;
        User owner;
        Room room2;
        User owner2;
        Room room3;
        LiveMode streamType;
        Room room4;
        InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
        if (interfaceC1107590evd == null || (strLJFF = C1871910yoP.LJFF(interfaceC1107590evd, "name", "")) == null) {
            strLJFF = "";
        }
        this.LLILLL = strLJFF;
        InterfaceC1107590evd interfaceC1107590evd2 = c262100zr.LIZIZ;
        if (interfaceC1107590evd2 == null || (strLJFF2 = C1871910yoP.LJFF(interfaceC1107590evd2, "orgId", "")) == null) {
            strLJFF2 = "";
        }
        InterfaceC1107590evd interfaceC1107590evd3 = c262100zr.LIZIZ;
        if (interfaceC1107590evd3 == null || (strLJFF3 = C1871910yoP.LJFF(interfaceC1107590evd3, "fundraiserId", "")) == null) {
            strLJFF3 = "";
        }
        InterfaceC1107590evd interfaceC1107590evd4 = c262100zr.LIZIZ;
        if (interfaceC1107590evd4 == null || (strLJFF4 = C1871910yoP.LJFF(interfaceC1107590evd4, "currentAmount", "")) == null) {
            strLJFF4 = "";
        }
        InterfaceC1107590evd interfaceC1107590evd5 = c262100zr.LIZIZ;
        if (interfaceC1107590evd5 == null || (strLJFF5 = C1871910yoP.LJFF(interfaceC1107590evd5, "goalAmount", "")) == null) {
            strLJFF5 = "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("jsEvent.params?.optString(\"goalAmount\"): ");
        sbLIZ.append(strLJFF5);
        C20441214yg.LIZIZ("donation", C2188811AlT.LIZIZ(sbLIZ));
        HostBoard hostBoard = new HostBoard();
        hostBoard.bizType = "donation";
        hostBoard.subBizType = "donation";
        hostBoard.boardId = strLJFF3;
        HashMap map = new HashMap();
        DataChannel dataChannel = this.LL;
        if (dataChannel == null || (room4 = (Room) dataChannel.gg0(RoomChannel.class)) == null || (string = Long.valueOf(room4.getId()).toString()) == null) {
            string = "";
        }
        map.put("room_id", string);
        map.put("ngo_name", this.LLILLL);
        map.put("fundraiser_id", strLJFF3);
        map.put("set_fundraiser_goal_amt", strLJFF5);
        DataChannel dataChannel2 = this.LL;
        if (dataChannel2 == null || (room3 = (Room) dataChannel2.gg0(RoomChannel.class)) == null || (streamType = room3.getStreamType()) == null) {
            strLIZ = "";
        } else {
            strLIZ = C354201Zc.LIZ(streamType);
        }
        map.put("live_type", strLIZ);
        DataChannel dataChannel3 = this.LL;
        if (dataChannel3 == null || (room2 = (Room) dataChannel3.gg0(RoomChannel.class)) == null || (owner2 = room2.getOwner()) == null || (string2 = Long.valueOf(owner2.getId()).toString()) == null) {
            string2 = "";
        }
        map.put("fundraiser_owner_id", string2);
        DataChannel dataChannel4 = this.LL;
        if (dataChannel4 == null || (room = (Room) dataChannel4.gg0(RoomChannel.class)) == null || (owner = room.getOwner()) == null || (string3 = Long.valueOf(owner.getId()).toString()) == null) {
            string3 = "";
        }
        map.put("from_user_id", string3);
        hostBoard.paramsData = C500260Jjc.LJLLLL(map);
        ClickAction clickAction = new ClickAction();
        ClickAction.NavigateToAppRoute navigateToAppRoute = new ClickAction.NavigateToAppRoute();
        DataChannel dataChannel5 = this.LL;
        if (dataChannel5 == null) {
            string4 = "";
        } else {
            Room room5 = (Room) dataChannel5.gg0(RoomChannel.class);
            Uri.Builder builderAppendQueryParameter = UriProtector.parse("aweme://pns/fundraiser/sheet?").buildUpon().appendQueryParameter("organization_id", strLJFF2).appendQueryParameter("fundraiser_id", strLJFF3).appendQueryParameter("enter_from", "camera").appendQueryParameter("enter_method", "live").appendQueryParameter("item_type", "2");
            if (room5 != null) {
                lValueOf = Long.valueOf(room5.getId());
            } else {
                lValueOf = null;
            }
            string4 = builderAppendQueryParameter.appendQueryParameter("item_id_str", String.valueOf(lValueOf)).appendQueryParameter("is_bottomsheet", "true").appendQueryParameter("tiktok_live_donation_optimize", String.valueOf(LiveDonationOptSetting.INSTANCE.abKey())).build().toString();
        }
        navigateToAppRoute.route = string4;
        clickAction.navigateToAppRoute = navigateToAppRoute;
        hostBoard.clickAction = clickAction;
        BoardCell[] boardCellArr = new BoardCell[4];
        BoardCell boardCell = new BoardCell();
        boardCell.type = "title";
        boardCell.alignment = 2;
        boardCell.text = C20642515q3.LJI(2131824912);
        boardCellArr[0] = boardCell;
        BoardCell boardCell2 = new BoardCell();
        boardCell2.type = "divider_line";
        boardCell2.alignment = 2;
        Padding padding = new Padding();
        padding.paddingLeft = 0;
        padding.paddingRight = 0;
        padding.paddingTop = 8;
        padding.paddingBottom = 10;
        boardCell2.padding = padding;
        boardCellArr[1] = boardCell2;
        BoardCell boardCell3 = new BoardCell();
        boardCell3.type = "image";
        boardCell3.alignment = 2;
        ImageModel imageModel = new ImageModel();
        InterfaceC1107590evd interfaceC1107590evd6 = c262100zr.LIZIZ;
        if (interfaceC1107590evd6 == null || (strLJFF6 = C1871910yoP.LJFF(interfaceC1107590evd6, "iconUri", "")) == null) {
            strLJFF6 = "";
        }
        imageModel.setUri(strLJFF6);
        InterfaceC1107590evd interfaceC1107590evd7 = c262100zr.LIZIZ;
        if (interfaceC1107590evd7 == null || (strLJFF7 = C1871910yoP.LJFF(interfaceC1107590evd7, "iconUrl", "")) == null || (listSingletonList = Collections.singletonList(strLJFF7)) == null) {
            listSingletonList = C13BV.INSTANCE;
        }
        imageModel.setUrls(listSingletonList);
        imageModel.height = 44;
        imageModel.width = 44;
        boardCell3.image = imageModel;
        ImageStyle imageStyle = new ImageStyle();
        imageStyle.round = true;
        boardCell3.imageStyle = imageStyle;
        boardCellArr[2] = boardCell3;
        BoardCell boardCell4 = new BoardCell();
        boardCell4.type = "text";
        boardCell4.alignment = 2;
        if (strLJFF5.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            strLJIJJ = C497740JfY.LJIJJ(2131824911, strLJFF4, strLJFF5, this.LLILLL);
        } else {
            strLJIJJ = C497740JfY.LJIJJ(2131824910, strLJFF4, this.LLILLL);
        }
        boardCell4.text = strLJIJJ;
        Padding padding2 = new Padding();
        padding2.paddingLeft = 0;
        padding2.paddingRight = 0;
        padding2.paddingTop = 10;
        padding2.paddingBottom = 4;
        boardCell4.padding = padding2;
        boardCellArr[3] = boardCell4;
        hostBoard.cellList = C1697810uHb.LJIILJJIL(boardCellArr);
        Padding padding3 = new Padding();
        padding3.paddingLeft = 8;
        padding3.paddingRight = 8;
        padding3.paddingTop = 8;
        padding3.paddingBottom = 8;
        hostBoard.padding = padding3;
        return hostBoard;
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        String strLJFF;
        String strLJFF2;
        String strLJFF3;
        String strLJFF4;
        String strLJFF5;
        String strLJFF6;
        List<String> listSingletonList;
        long jLongValue;
        String strLJFF7;
        String strLJFF8;
        DataChannel dataChannel;
        String str = c262100zr.LIZ;
        String str2 = "";
        if (Intrinsics.LJFF(str, "donation_added_nonprofit")) {
            if (C500260Jjc.LJJIJLIJ()) {
                InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
                if (interfaceC1107590evd == null || (strLJFF8 = C1871910yoP.LJFF(interfaceC1107590evd, "orgId", "")) == null) {
                    strLJFF8 = "";
                }
                if (C1533950q1J.LJ(strLJFF8) && (dataChannel = this.LL) != null) {
                    dataChannel.SX0(C749510Taf.class, strLJFF8);
                }
                C766270U4b.LIZLLL(2131849358);
                DataChannel dataChannel2 = this.LL;
                if (dataChannel2 != null) {
                    dataChannel2.FQ2(DismissPreviewSettingDialogEvent.class);
                }
            }
            if (LiveDonationOptSetting.INSTANCE.enable()) {
                if (C500260Jjc.LJJIJLIJ()) {
                    C261900zp.LIZ = c262100zr;
                    return;
                } else {
                    LJ(c262100zr);
                    return;
                }
            }
            OrganizationModel organizationModel = new OrganizationModel();
            InterfaceC1107590evd interfaceC1107590evd2 = c262100zr.LIZIZ;
            if (interfaceC1107590evd2 == null || (strLJFF = C1871910yoP.LJFF(interfaceC1107590evd2, "name", "")) == null) {
                strLJFF = "";
            }
            organizationModel.name = strLJFF;
            InterfaceC1107590evd interfaceC1107590evd3 = c262100zr.LIZIZ;
            if (interfaceC1107590evd3 == null || (strLJFF2 = C1871910yoP.LJFF(interfaceC1107590evd3, "desc", "")) == null) {
                strLJFF2 = "";
            }
            organizationModel.desc = strLJFF2;
            InterfaceC1107590evd interfaceC1107590evd4 = c262100zr.LIZIZ;
            if (interfaceC1107590evd4 == null || (strLJFF3 = C1871910yoP.LJFF(interfaceC1107590evd4, "orgId", "")) == null) {
                strLJFF3 = "";
            }
            organizationModel.organizationId = strLJFF3;
            InterfaceC1107590evd interfaceC1107590evd5 = c262100zr.LIZIZ;
            if (interfaceC1107590evd5 == null || (strLJFF4 = C1871910yoP.LJFF(interfaceC1107590evd5, "detailUrl", "")) == null) {
                strLJFF4 = "";
            }
            organizationModel.detailUrl = strLJFF4;
            InterfaceC1107590evd interfaceC1107590evd6 = c262100zr.LIZIZ;
            if (interfaceC1107590evd6 == null || (strLJFF5 = C1871910yoP.LJFF(interfaceC1107590evd6, "donateLink", "")) == null) {
                strLJFF5 = "";
            }
            organizationModel.donateLink = strLJFF5;
            ImageModel imageModel = new ImageModel();
            InterfaceC1107590evd interfaceC1107590evd7 = c262100zr.LIZIZ;
            if (interfaceC1107590evd7 == null || (strLJFF6 = C1871910yoP.LJFF(interfaceC1107590evd7, "iconUri", "")) == null) {
                strLJFF6 = "";
            }
            imageModel.setUri(strLJFF6);
            InterfaceC1107590evd interfaceC1107590evd8 = c262100zr.LIZIZ;
            if (interfaceC1107590evd8 == null || (strLJFF7 = C1871910yoP.LJFF(interfaceC1107590evd8, "iconUrl", "")) == null || (listSingletonList = Collections.singletonList(strLJFF7)) == null) {
                listSingletonList = C13BV.INSTANCE;
            }
            imageModel.setUrls(listSingletonList);
            organizationModel.icon = imageModel;
            DonationSticker donationSticker = new DonationSticker();
            String str3 = organizationModel.donateLink;
            if (str3 != null && !a0.LJJJIL(str3)) {
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(organizationModel.donateLink), "campaignId");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
                    str2 = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
                }
                Long lLJIILIIL = C2095008Iq.LJIILIIL(str2);
                if (lLJIILIIL != null) {
                    jLongValue = lLJIILIIL.longValue();
                } else {
                    jLongValue = 0;
                }
            } else {
                jLongValue = 6;
            }
            donationSticker.id = jLongValue;
            donationSticker.type = 3;
            donationSticker.content = organizationModel;
            DataChannel dataChannel3 = this.LL;
            if (dataChannel3 != null) {
                dataChannel3.zW(SelectedDonationStickerChannel.class, donationSticker.LIZ());
            }
            InterfaceC261700zn interfaceC261700zn = this.LLILLJJLI;
            if (interfaceC261700zn == null) {
                return;
            }
            interfaceC261700zn.LIZ();
            return;
        }
        if (!Intrinsics.LJFF(str, "donation_removed_nonprofit")) {
            return;
        }
        if (LiveDonationOptSetting.INSTANCE.enable()) {
            if (C500260Jjc.LJJIJLIJ()) {
                C261900zp.LIZ = null;
                return;
            }
            if (((IBillboardService) C1161920gLG.LIZJ(IBillboardService.class)).rN2(this.LLILZ, C011V.BROADCAST, 0L)) {
                LJI();
                this.LLILZ = "";
                this.LLILLL = "";
            }
            DataChannel dataChannel4 = this.LL;
            if (dataChannel4 == null) {
                return;
            }
            dataChannel4.LC0(DonationBoardVisibleEvent.class, Boolean.FALSE);
            return;
        }
        InterfaceC261700zn interfaceC261700zn2 = this.LLILLJJLI;
        if (interfaceC261700zn2 == null) {
            return;
        }
        interfaceC261700zn2.LIZIZ();
    }

    public C261600zm(DataChannel dataChannel, C2177391AJl c2177391AJl) {
        this.LL = dataChannel;
        this.LLILLJJLI = c2177391AJl;
    }

    @Override // X.InterfaceC769510UGn
    public final void LIZIZ(boolean z, boolean z2) {
        LIZ();
        if (!z) {
            C261900zp.LIZ = null;
        }
        if (z2) {
            this.LLILZIL.LJ();
        }
    }
}
