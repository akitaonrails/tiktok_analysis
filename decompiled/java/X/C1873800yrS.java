package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalsListsData;
import com.bytedance.android.livesdk.chatroom.model.interact.GiftGalleryBadgeInfo;
import com.bytedance.android.livesdk.chatroom.model.interact.GiftGalleryBadgeSection;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkMicGiftGalleryDisplayText;
import com.bytedance.android.livesdkapi.depend.model.live.ChannelInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yrS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1873800yrS extends AbstractC1873630yrB {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [X.0yrW] */
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, final CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        int value;
        final InterfaceC1873640yrC interfaceC1873640yrC = (InterfaceC1873640yrC) xBaseParamModel;
        final IInteractService iInteractService = (IInteractService) C1161920gLG.LIZJ(IInteractService.class);
        if (interfaceC1873640yrC.getScene().intValue() > 0) {
            value = interfaceC1873640yrC.getScene().intValue();
        } else if (iInteractService.mo2()) {
            value = EnumC961060b7I.WONT_INVITE_BUT_JUST_GET_FULL_LIST.getValue();
        } else if (iInteractService.y91() >= 2) {
            value = EnumC961060b7I.INVITE_MORE.getValue();
        } else {
            value = EnumC961060b7I.Normal.getValue();
        }
        iInteractService.au1(value, interfaceC1873640yrC.getEntrance().intValue(), interfaceC1873640yrC.getRivalSection().intValue(), new InterfaceC914930Zut<RivalsListsData>() { // from class: X.0yrW
            @Override // X.InterfaceC914930Zut
            public final void onSuccess(RivalsListsData rivalsListsData) {
                String containerID;
                Long lValueOf;
                Long lValueOf2;
                Integer numValueOf;
                Long lValueOf3;
                String str;
                List listSingletonList;
                GiftGalleryBadgeInfo giftGalleryBadgeInfo;
                GiftGalleryBadgeSection giftGalleryBadgeSection;
                LinkMicGiftGalleryDisplayText linkMicGiftGalleryDisplayText;
                String str2;
                GiftGalleryBadgeInfo giftGalleryBadgeInfo2;
                GiftGalleryBadgeSection giftGalleryBadgeSection2;
                ImageModel imageModel;
                GiftGalleryBadgeInfo giftGalleryBadgeInfo3;
                RivalsListsData rivalsListsData2 = rivalsListsData;
                ArrayList arrayList = new ArrayList();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                List<Room> list = rivalsListsData2.leagueRecommendList;
                String str3 = null;
                str3 = null;
                if (list != null) {
                    C1873800yrS c1873800yrS = this.LIZ;
                    for (Room room : list) {
                        c1873800yrS.getClass();
                        InterfaceC1873600yr8 interfaceC1873600yr8 = (InterfaceC1873600yr8) C1909107dp.LIZJ(InterfaceC1873600yr8.class, str3);
                        interfaceC1873600yr8.setUrlList(room.getOwner().getAvatarThumb().getUrls());
                        room.getLinkMicInfo();
                        FollowInfo followInfo = room.getOwner().getFollowInfo();
                        InterfaceC1873860yrY interfaceC1873860yrY = (InterfaceC1873860yrY) C1909107dp.LIZJ(InterfaceC1873860yrY.class, str3);
                        interfaceC1873860yrY.setNickname(room.getOwner().getNickName());
                        interfaceC1873860yrY.setDisplayId(room.getOwner().getDisplayId());
                        interfaceC1873860yrY.setNameLabel(C0KVU.LIZ(room.getOwner()));
                        interfaceC1873860yrY.setAvatarThumb(interfaceC1873600yr8);
                        InterfaceC634840OvC interfaceC634840OvC = c1873800yrS.IBridgeSdkContext;
                        if (interfaceC634840OvC != null) {
                            containerID = interfaceC634840OvC.getContainerID();
                        } else {
                            containerID = str3;
                        }
                        InterfaceC1873880yra interfaceC1873880yra = (InterfaceC1873880yra) C1909107dp.LIZJ(InterfaceC1873880yra.class, containerID);
                        interfaceC1873880yra.setFollowingCount(String.valueOf(followInfo.getFollowingCount()));
                        interfaceC1873880yra.setFollowerCount(String.valueOf(followInfo.getFollowerCount()));
                        interfaceC1873880yra.setFollowStatus(String.valueOf(followInfo.getFollowStatus()));
                        interfaceC1873880yra.setPushStatus(String.valueOf(followInfo.getPushStatus()));
                        interfaceC1873860yrY.setFollowInfo(interfaceC1873880yra);
                        InterfaceC1873870yrZ interfaceC1873870yrZ = (InterfaceC1873870yrZ) C1909107dp.LIZJ(InterfaceC1873870yrZ.class, str3);
                        ChannelInfo channelInfo = room.getLinkMicInfo().channelInfo;
                        Object objValueOf = str3;
                        if (channelInfo != null) {
                            objValueOf = Integer.valueOf(channelInfo.dimension);
                        }
                        interfaceC1873870yrZ.setDimension(String.valueOf(objValueOf));
                        ChannelInfo channelInfo2 = room.getLinkMicInfo().channelInfo;
                        if (channelInfo2 != null) {
                            lValueOf = Long.valueOf(channelInfo2.innerChannelId);
                        } else {
                            lValueOf = null;
                        }
                        interfaceC1873870yrZ.setInnerChannelId(String.valueOf(lValueOf));
                        ChannelInfo channelInfo3 = room.getLinkMicInfo().channelInfo;
                        if (channelInfo3 != null) {
                            lValueOf2 = Long.valueOf(channelInfo3.groupChannelId);
                        } else {
                            lValueOf2 = null;
                        }
                        interfaceC1873870yrZ.setGroupChannelId(String.valueOf(lValueOf2));
                        ChannelInfo channelInfo4 = room.getLinkMicInfo().channelInfo;
                        if (channelInfo4 != null) {
                            numValueOf = Integer.valueOf(channelInfo4.layout);
                        } else {
                            numValueOf = null;
                        }
                        interfaceC1873870yrZ.setLayout(String.valueOf(numValueOf));
                        InterfaceC1873660yrE interfaceC1873660yrE = (InterfaceC1873660yrE) C1909107dp.LIZJ(InterfaceC1873660yrE.class, null);
                        interfaceC1873660yrE.setChannelInfo(interfaceC1873870yrZ);
                        InterfaceC1873850yrX interfaceC1873850yrX = (InterfaceC1873850yrX) C1909107dp.LIZJ(InterfaceC1873850yrX.class, null);
                        interfaceC1873850yrX.setRoomId(String.valueOf(room.getId()));
                        interfaceC1873850yrX.setOwnerUserId(String.valueOf(room.getOwnerUserId()));
                        ChannelInfo channelInfo5 = room.getLinkMicInfo().channelInfo;
                        if (channelInfo5 != null) {
                            lValueOf3 = Long.valueOf(channelInfo5.innerChannelId);
                        } else {
                            lValueOf3 = null;
                        }
                        interfaceC1873850yrX.setInnerChannelId(String.valueOf(lValueOf3));
                        interfaceC1873850yrX.setOwner(interfaceC1873860yrY);
                        interfaceC1873850yrX.setLinkMic(interfaceC1873660yrE);
                        arrayList.add(interfaceC1873850yrX);
                        RivalExtraInfo rivalExtraInfo = rivalsListsData2.rivalExtraInfos.get(Long.valueOf(room.getId()));
                        Pair[] pairArr = new Pair[2];
                        String str4 = "";
                        if (rivalExtraInfo == null || (giftGalleryBadgeInfo3 = rivalExtraInfo.giftGalleryBadgeInfo) == null || (str = giftGalleryBadgeInfo3.darkModeBackgroundColor) == null) {
                            str = "";
                        }
                        pairArr[0] = new Pair("dark_mode_background_color", str);
                        Pair[] pairArr2 = new Pair[2];
                        Pair[] pairArr3 = new Pair[1];
                        if (rivalExtraInfo == null || (giftGalleryBadgeInfo2 = rivalExtraInfo.giftGalleryBadgeInfo) == null || (giftGalleryBadgeSection2 = giftGalleryBadgeInfo2.leagueInfo) == null || (imageModel = giftGalleryBadgeSection2.icon) == null || (listSingletonList = imageModel.getUrls()) == null) {
                            listSingletonList = Collections.singletonList("");
                        }
                        pairArr3[0] = new Pair("url_list", listSingletonList);
                        pairArr2[0] = new Pair("dark_mode_icon", C2097608Jq.LJIIJ(pairArr3));
                        Pair[] pairArr4 = new Pair[1];
                        if (rivalExtraInfo != null && (giftGalleryBadgeInfo = rivalExtraInfo.giftGalleryBadgeInfo) != null && (giftGalleryBadgeSection = giftGalleryBadgeInfo.leagueInfo) != null && (linkMicGiftGalleryDisplayText = giftGalleryBadgeSection.displayText) != null && (str2 = linkMicGiftGalleryDisplayText.content) != null) {
                            str4 = str2;
                        }
                        pairArr4[0] = new Pair("content", str4);
                        pairArr2[1] = new Pair("display_text", C2097608Jq.LJIIJ(pairArr4));
                        pairArr[1] = new Pair("league_info", C2097608Jq.LJIIJ(pairArr2));
                        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
                        if (rivalExtraInfo != null) {
                            linkedHashMap.put(String.valueOf(room.getId()), C2097608Jq.LJIIJ(new Pair("show_play_type", Integer.valueOf(rivalExtraInfo.showPlayType)), new Pair("invite_block_reason", Integer.valueOf(rivalExtraInfo.inviteBlockReason)), new Pair("detail_block_reason", Integer.valueOf(rivalExtraInfo.detailBlockReason)), new Pair("gift_gallery_badge_info", mapLJIIJ)));
                        }
                        arrayList2.add(String.valueOf(room.getOwner().getId()));
                        arrayList3.add(String.valueOf(room.getId()));
                        linkedHashMap2.put(String.valueOf(room.getOwner().getId()), String.valueOf(room.getId()));
                        str3 = null;
                    }
                }
                this.LIZ.getClass();
                InterfaceC1873610yr9 interfaceC1873610yr9 = (InterfaceC1873610yr9) C1909107dp.LIZJ(InterfaceC1873610yr9.class, str3);
                interfaceC1873610yr9.setLeagueRecommendList(arrayList);
                interfaceC1873610yr9.setRivalExtraInfos(linkedHashMap);
                this.LIZ.getClass();
                XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1873620yrA.class, str3);
                InterfaceC1873640yrC interfaceC1873640yrC2 = interfaceC1873640yrC;
                IInteractService iInteractService2 = iInteractService;
                InterfaceC1873620yrA interfaceC1873620yrA = (InterfaceC1873620yrA) xBaseModelLIZJ;
                interfaceC1873620yrA.setResponse(interfaceC1873610yr9);
                if (Intrinsics.LJFF(interfaceC1873640yrC2.getGetDisplayStatusMap(), 1)) {
                    Map<Long, RivalExtraInfo> mapLJ = rivalsListsData2.rivalExtraInfos;
                    if (mapLJ == null) {
                        mapLJ = C2097608Jq.LJ();
                    }
                    interfaceC1873620yrA.setDisplayStatusMap(iInteractService2.Lo1(arrayList2, linkedHashMap2, mapLJ));
                }
                completionBlock.onSuccess(interfaceC1873620yrA, "");
            }

            @Override // X.InterfaceC914930Zut
            public final void LIZ(int i, String str, Throwable th) {
                C2382909Vj.LIZ(completionBlock, i, str, null, 4);
            }
        });
    }
}
