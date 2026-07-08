package X;

import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.previewlive.MultiGuestPreviewLiveSettingViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.avatar.MultiGuestAvatarPreviewFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.avatar.common.IAvatarBusinessAbility;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.anchor.LiveShowAnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.LiveShowMaskOrderEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.guest.LiveShowGuestViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.moderator.LiveShowModeratorViewModel;
import com.bytedance.android.live.liveinteract.multilive.model.GetShowContentResponse;
import com.bytedance.android.live.liveinteract.multilive.model.UpdateShowContentResponse;
import com.bytedance.android.live.liveinteract.multilive.social.model.AvatarListResp;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.chatroom.interact.model.CohostHistoryResponse;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.poi.service.PoiServiceImpl;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS194S1100000_18;
import kotlin.jvm.internal.AwS30S0010000_15;
import webcast.data.multi_guest_play.ShowConfig;
import webcast.data.multi_guest_play.ShowContent;
import webcast.data.multi_guest_play.ShowListUser;
import webcast.data.multi_guest_social_data.AvatarStyle;

/* JADX INFO: renamed from: X.01zd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C515501zd implements C09JN {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
            case 4:
                accept$4(this, obj);
                break;
            case 5:
                accept$5(this, obj);
                break;
            case 6:
                accept$6(this, obj);
                break;
            case 7:
                accept$7(this, obj);
                break;
            case 8:
                accept$8(this, obj);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                accept$9(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                accept$10(this, obj);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                accept$11(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                accept$12(this, obj);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                accept$13(this, obj);
                break;
            case 14:
                accept$14(this, obj);
                break;
            case 15:
                accept$15(this, obj);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$0(C515501zd c515501zd, Object obj) {
        C1C7U.LIZ("MultiGuestAvatarPreviewFragment@53ab.fetchAvatarList$disposable$1");
        C20441214yg.LIZIZ("MultiGuestAvatarPreviewFragment", "fetchList successfully");
        T t = ((BaseResponse) obj).data;
        MultiGuestAvatarPreviewFragment multiGuestAvatarPreviewFragment = (MultiGuestAvatarPreviewFragment) c515501zd.l0;
        boolean z = c515501zd.z1;
        AvatarListResp.ResponseData responseData = (AvatarListResp.ResponseData) t;
        multiGuestAvatarPreviewFragment.LLJILJILJ = responseData.imageSelectTips;
        List<AvatarStyle> list = responseData.styles;
        multiGuestAvatarPreviewFragment.LLJILLL = list;
        IAvatarBusinessAbility iAvatarBusinessAbility = multiGuestAvatarPreviewFragment.LLJJIJIIJIL;
        if (iAvatarBusinessAbility != null) {
            iAvatarBusinessAbility.QP1(list);
        }
        multiGuestAvatarPreviewFragment.NR(responseData.customMax, responseData.canCustomize, responseData.avatars, !z);
        C1C7U.LIZIZ("MultiGuestAvatarPreviewFragment@53ab.fetchAvatarList$disposable$1");
    }

    public static final void accept$1(C515501zd c515501zd, Object obj) {
        C1C7U.LIZ("MultiGuestAvatarPreviewFragment@53ab.fetchAvatarList$disposable$2");
        C20441214yg.LJIIIZ("MultiGuestAvatarPreviewFragment", "fetchList failed");
        ((MultiGuestAvatarPreviewFragment) c515501zd.l0).NR(0L, false, null, !c515501zd.z1);
        C1C7U.LIZIZ("MultiGuestAvatarPreviewFragment@53ab.fetchAvatarList$disposable$2");
    }

    public static final void accept$10(C515501zd c515501zd, Object obj) {
        C1C7U.LIZ("MultiGuestPreviewLiveSettingViewModel@4186.updateShowAvailableMicSlot$3");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateShowAvailableMicSlot error: ");
        sbLIZ.append(((Throwable) obj).getMessage());
        C20441214yg.LJ("MultiGuestPreviewLiveSettingViewModel", C2188811AlT.LIZIZ(sbLIZ));
        C1813460xI8.LIZIZ(((MultiGuestPreviewLiveSettingViewModel) c515501zd.l0).LLILZ, new AwS30S0010000_15(c515501zd.z1, 6));
        C1C7U.LIZIZ("MultiGuestPreviewLiveSettingViewModel@4186.updateShowAvailableMicSlot$3");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$11(C515501zd c515501zd, Object obj) {
        Long lValueOf;
        C1C7U.LIZ("LiveShowModeratorViewModel@48fd.getShowList$1");
        C923330a8R c923330a8R = C923330a8R.LIZ;
        C923330a8R.LJIILIIL("LiveShowModeratorViewModel_getShowList success");
        C20441214yg.LIZIZ("LiveShowModeratorViewModel", "getShowList successful");
        ShowContent showContent = ((GetShowContentResponse.ResponseData) ((BaseResponse) obj).data).showContent;
        if (showContent != null) {
            LiveShowModeratorViewModel liveShowModeratorViewModel = (LiveShowModeratorViewModel) c515501zd.l0;
            boolean z = c515501zd.z1;
            liveShowModeratorViewModel.AQ2(showContent.showingAndReadyList, showContent.finishedList, false);
            if (z) {
                ShowConfig showConfig = showContent.showConfig;
                ShowListUser showListUser = null;
                if (showConfig != null) {
                    lValueOf = Long.valueOf(showConfig.durationPerGuest);
                } else {
                    lValueOf = null;
                }
                Iterator<ShowListUser> it2 = showContent.showingAndReadyList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    ShowListUser next = it2.next();
                    if (next.status == 2) {
                        showListUser = next;
                        break;
                    }
                }
                liveShowModeratorViewModel.CQ2(new C303501Fp(lValueOf, showListUser, showContent.showingAndReadyList, showContent.finishedList));
            }
        }
        C1C7U.LIZIZ("LiveShowModeratorViewModel@48fd.getShowList$1");
    }

    public static final void accept$12(C515501zd c515501zd, Object obj) {
        C1C7U.LIZ("PoiServiceImpl@62a1.setPoiCollectStatus$1");
        com.ss.android.ugc.aweme.base.api.BaseResponse baseResponse = (com.ss.android.ugc.aweme.base.api.BaseResponse) obj;
        if (baseResponse == null) {
            ((Function2) c515501zd.l0).invoke(Boolean.FALSE, Boolean.valueOf(c515501zd.z1));
        } else if (baseResponse.status_code == 0) {
            ((Function2) c515501zd.l0).invoke(Boolean.TRUE, Boolean.valueOf(!c515501zd.z1));
        } else {
            ((Function2) c515501zd.l0).invoke(Boolean.FALSE, Boolean.valueOf(c515501zd.z1));
        }
        C1C7U.LIZIZ("PoiServiceImpl@62a1.setPoiCollectStatus$1");
    }

    public static final void accept$13(C515501zd c515501zd, Object obj) {
        C1C7U.LIZ("PoiServiceImpl@62a1.setPoiCollectStatus$2");
        ((Function2) c515501zd.l0).invoke(Boolean.FALSE, Boolean.valueOf(c515501zd.z1));
        C1C7U.LIZIZ("PoiServiceImpl@62a1.setPoiCollectStatus$2");
    }

    public static final void accept$14(C515501zd c515501zd, Object obj) {
        C1C7U.LIZ("InspirationSetting@a510.check$ignore$1");
        ((Function1) c515501zd.l0).invoke(Boolean.valueOf(c515501zd.z1));
        C1C7U.LIZIZ("InspirationSetting@a510.check$ignore$1");
    }

    public static final void accept$15(C515501zd c515501zd, Object obj) {
        C1C7U.LIZ("InspirationSetting@a510.check$ignore$2");
        ((Function1) c515501zd.l0).invoke(Boolean.valueOf(!c515501zd.z1));
        C1C7U.LIZIZ("InspirationSetting@a510.check$ignore$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$2(C515501zd c515501zd, Object obj) {
        Long lValueOf;
        C1C7U.LIZ("LiveShowAnchorViewModel@f562.getShowList$1");
        C20441214yg.LIZIZ("LiveShowAnchorViewModel", "getShowList successful");
        ShowContent showContent = ((GetShowContentResponse.ResponseData) ((BaseResponse) obj).data).showContent;
        if (showContent != null) {
            LiveShowAnchorViewModel liveShowAnchorViewModel = (LiveShowAnchorViewModel) c515501zd.l0;
            boolean z = c515501zd.z1;
            liveShowAnchorViewModel.AQ2(showContent.showingAndReadyList, showContent.finishedList, false);
            if (z) {
                ShowConfig showConfig = showContent.showConfig;
                ShowListUser showListUser = null;
                if (showConfig != null) {
                    lValueOf = Long.valueOf(showConfig.durationPerGuest);
                } else {
                    lValueOf = null;
                }
                Iterator<ShowListUser> it2 = showContent.showingAndReadyList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    ShowListUser next = it2.next();
                    if (next.status == 2) {
                        showListUser = next;
                        break;
                    }
                }
                liveShowAnchorViewModel.CQ2(new C303501Fp(lValueOf, showListUser, showContent.showingAndReadyList, showContent.finishedList));
            }
        }
        C1C7U.LIZIZ("LiveShowAnchorViewModel@f562.getShowList$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$3(C515501zd c515501zd, Object obj) {
        Long lValueOf;
        InterfaceC302601Fg interfaceC302601FgLIZ;
        C1C7U.LIZ("LiveShowGuestViewModel@6827.getShowList$1");
        C20441214yg.LIZIZ("LiveShowGuestViewModel", "getShowList successful");
        ShowContent showContent = ((GetShowContentResponse.ResponseData) ((BaseResponse) obj).data).showContent;
        if (showContent != null) {
            LiveShowGuestViewModel liveShowGuestViewModel = (LiveShowGuestViewModel) c515501zd.l0;
            boolean z = c515501zd.z1;
            boolean z2 = false;
            liveShowGuestViewModel.AQ2(showContent.showingAndReadyList, showContent.finishedList, false);
            liveShowGuestViewModel.BQ2(showContent.showConfig);
            if (z) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("get Show list, this: ");
                sbLIZ.append(showContent);
                C20441214yg.LIZIZ("remain time test", C2188811AlT.LIZIZ(sbLIZ));
                ShowConfig showConfig = showContent.showConfig;
                ShowListUser showListUser = null;
                if (showConfig != null) {
                    lValueOf = Long.valueOf(showConfig.durationPerGuest);
                } else {
                    lValueOf = null;
                }
                Iterator<ShowListUser> it2 = showContent.showingAndReadyList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    ShowListUser next = it2.next();
                    if (next.status == 2) {
                        showListUser = next;
                        break;
                    }
                }
                liveShowGuestViewModel.CQ2(new C303501Fp(lValueOf, showListUser, showContent.showingAndReadyList, showContent.finishedList));
                InterfaceC302601Fg interfaceC302601FgLIZ2 = C01FQ.LIZ();
                if ((interfaceC302601FgLIZ2 != null && interfaceC302601FgLIZ2.LJIIL() == 2) || ((interfaceC302601FgLIZ = C01FQ.LIZ()) != null && interfaceC302601FgLIZ.LJIIL() == 1)) {
                    z2 = true;
                }
                DataChannel dataChannel = liveShowGuestViewModel.LLJI;
                if (dataChannel != null) {
                    dataChannel.zW(LiveShowMaskOrderEvent.class, new C01H3(z2, liveShowGuestViewModel.LLILLJJLI.getValue()));
                }
            }
        }
        C1C7U.LIZIZ("LiveShowGuestViewModel@6827.getShowList$1");
    }

    public static final void accept$4(C515501zd c515501zd, Object obj) {
        C1C7U.LIZ("VideoCollectionModel@1b33.operator$1$manageCollection$1");
        ((AbstractC2126608Uu) obj).checkValid();
        ((C1171300gaO) c515501zd.l0).u0(0L, null, false, null, null, C1171750gb7.LIZ(), c515501zd.z1, false).LJL(C11S5.LIZ()).LJJLL(new C09JN() { // from class: X.00Nw
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj2) {
                C1C7U.LIZ("VideoCollectionModel@1b33.operator$1$manageCollection$1$1");
                C1C7U.LIZIZ("VideoCollectionModel@1b33.operator$1$manageCollection$1$1");
            }
        }, new C09JN() { // from class: X.00Nx
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj2) {
                C1C7U.LIZ("VideoCollectionModel@1b33.operator$1$manageCollection$1$2");
                C1C7U.LIZIZ("VideoCollectionModel@1b33.operator$1$manageCollection$1$2");
            }
        });
        C1C7U.LIZIZ("VideoCollectionModel@1b33.operator$1$manageCollection$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$5(C515501zd c515501zd, Object obj) {
        long j;
        CohostHistoryResponse.ResponseData responseData;
        C1C7U.LIZ("CoHostHistoryRepo@875e.realRequest$1");
        BaseResponse baseResponse = (BaseResponse) obj;
        C248300xd c248300xd = (C248300xd) c515501zd.l0;
        C11JF c11jf = c248300xd.LJI;
        if (c11jf != null) {
            c11jf.dispose();
        }
        CohostHistoryResponse.ResponseData responseData2 = null;
        c248300xd.LJI = null;
        C248300xd c248300xd2 = (C248300xd) c515501zd.l0;
        if (baseResponse != null && (responseData = (CohostHistoryResponse.ResponseData) baseResponse.data) != null) {
            j = responseData.oldestTimestampSec;
        } else {
            j = -1;
        }
        c248300xd2.LJFF = j;
        InterfaceC248400xe interfaceC248400xe = (InterfaceC248400xe) c248300xd2.LJ.getValue();
        if (baseResponse != null) {
            responseData2 = (CohostHistoryResponse.ResponseData) baseResponse.data;
        }
        interfaceC248400xe.LIZ(responseData2, c515501zd.z1);
        C1C7U.LIZIZ("CoHostHistoryRepo@875e.realRequest$1");
    }

    public static final void accept$6(C515501zd c515501zd, Object obj) {
        C1C7U.LIZ("CoHostHistoryRepo@875e.realRequest$2");
        Throwable th = (Throwable) obj;
        C248300xd c248300xd = (C248300xd) c515501zd.l0;
        C11JF c11jf = c248300xd.LJI;
        if (c11jf != null) {
            c11jf.dispose();
        }
        c248300xd.LJI = null;
        ((InterfaceC248400xe) ((C248300xd) c515501zd.l0).LJ.getValue()).LIZIZ(th, c515501zd.z1);
        C1C7U.LIZIZ("CoHostHistoryRepo@875e.realRequest$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$7(C515501zd c515501zd, Object obj) {
        ShowConfig showConfig;
        C1C7U.LIZ("LiveShowAnchorViewModel@f562.updateShowConfig$1");
        C20441214yg.LIZIZ("LiveShowAnchorViewModel", "updateShowList successful");
        MutableLiveData<ShowConfig> mutableLiveData = ((LiveShowAnchorViewModel) c515501zd.l0).LLILZ;
        ShowContent showContent = ((UpdateShowContentResponse.ResponseData) ((BaseResponse) obj).data).showContent;
        if (showContent != null) {
            showConfig = showContent.showConfig;
        } else {
            showConfig = null;
        }
        mutableLiveData.setValue(showConfig);
        if (!c515501zd.z1) {
            ((LiveShowAnchorViewModel) c515501zd.l0).wQ2();
        }
        C1C7U.LIZIZ("LiveShowAnchorViewModel@f562.updateShowConfig$1");
    }

    public static final void accept$8(C515501zd c515501zd, Object obj) {
        C1C7U.LIZ("HideAccountViewModel@96be.hideOrUnHideAccountFromSwitch$2$2");
        ((C127A) c515501zd.l0).LJIILJJIL(!c515501zd.z1);
        C1C7U.LIZIZ("HideAccountViewModel@96be.hideOrUnHideAccountFromSwitch$2$2");
    }

    public static final void accept$9(C515501zd c515501zd, Object obj) {
        Object objValueOf;
        C1C7U.LIZ("MultiGuestPreviewLiveSettingViewModel@4186.updateShowAvailableMicSlot$2");
        C470590Icr c470590Icr = (C470590Icr) obj;
        C930480aJy.LIZ.getClass();
        if (!C930480aJy.LJJIFFI(c470590Icr)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateShowAvailableMicSlot fail, statusCode: ");
            if (c470590Icr != null) {
                objValueOf = Integer.valueOf(c470590Icr.statusCode);
            } else {
                objValueOf = "null";
            }
            sbLIZ.append(objValueOf);
            C20441214yg.LJ("MultiGuestPreviewLiveSettingViewModel", C2188811AlT.LIZIZ(sbLIZ));
            C1813460xI8.LIZIZ(((MultiGuestPreviewLiveSettingViewModel) c515501zd.l0).LLILZ, new AwS30S0010000_15(c515501zd.z1, 5));
        }
        C1C7U.LIZIZ("MultiGuestPreviewLiveSettingViewModel@4186.updateShowAvailableMicSlot$2");
    }

    public C515501zd(Object obj, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z1 = z;
    }

    public C515501zd(PoiServiceImpl poiServiceImpl, AwS194S1100000_18 awS194S1100000_18, boolean z, int i) {
        this.$t = i;
        this.l0 = awS194S1100000_18;
        this.z1 = z;
    }
}
