package Y;

import X.C01GW;
import X.C09JN;
import X.C0H79;
import X.C0UO0;
import X.C11JF;
import X.C11NZ;
import X.C13BV;
import X.C1813460xI8;
import X.C1C7U;
import X.C20441214yg;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C470590Icr;
import X.C480460Ism;
import X.C501470JlZ;
import X.C915980Zwa;
import X.C930480aJy;
import X.C931740aM0;
import X.C931750aM1;
import X.C942210act;
import X.C944440agU;
import X.C947520alS;
import X.C948030amH;
import X.C948100amO;
import X.C948400ams;
import X.C950220apo;
import X.C950840aqo;
import X.C958830b3h;
import X.C960000b5a;
import X.C960610b6Z;
import X.C960790b6r;
import X.C970750bMv;
import X.C974480bSw;
import X.C974540bT2;
import X.InterfaceC420801kM;
import X.InterfaceC914930Zut;
import X.InterfaceC970770bMx;
import com.bytedance.android.live.liveinteract.cohost.remote.api.CoHostApi;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.previewlive.MultiGuestPreviewLiveSettingViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.randommatch.RandomMatchGuestViewModel;
import com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostSearchContract$AbsView;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import com.bytedance.android.livesdk.chatroom.interact.model.SearchRivalsResponse;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchQualityOptimizeSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AwS13S0002000_15;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes16.dex */
public class AfS82S0101000_15 implements C09JN {
    public final int $t;
    public int i1;
    public Object l0;

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
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List<com.bytedance.android.livesdk.chatroom.interact.model.SearchRivalsResponse$Cell>] */
    /* JADX WARN: Type inference failed for: r3v2, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List<com.bytedance.android.livesdk.chatroom.interact.model.SearchRivalsResponse$Cell>] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.Map<java.lang.Long, ? extends com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo>] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.util.HashMap, java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.util.HashMap, java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.Map<java.lang.Long, ? extends com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo>] */
    public static final void accept$0(AfS82S0101000_15 afS82S0101000_15, Object obj) {
        String str;
        ?? LJ;
        ?? LJ2;
        int size;
        int i;
        SearchRivalsResponse.ResponseData responseData;
        List<SearchRivalsResponse.Cell> list;
        ?? arrayList;
        ?? arrayList2;
        boolean z;
        SearchRivalsResponse.ResponseData responseData2;
        SearchRivalsResponse.ResponseData responseData3;
        List<SearchRivalsResponse.Cell> list2;
        SearchRivalsResponse.ResponseData responseData4;
        List<SearchRivalsResponse.Cell> list3;
        SearchRivalsResponse.ResponseData responseData5;
        List<SearchRivalsResponse.Cell> list4;
        SearchRivalsResponse.ResponseData responseData6;
        Map<Long, RivalExtraInfo> map;
        SearchRivalsResponse.ResponseData responseData7;
        Map<Long, RivalExtraInfo> map2;
        SearchRivalsResponse.ResponseData responseData8;
        SearchRivalsResponse.ResponseData responseData9;
        C1C7U.LIZ("MultiCoHostSearchPresenter@ec83.fetchExpandListData$1");
        BaseResponse baseResponse = (BaseResponse) obj;
        String str2 = null;
        if (baseResponse != null && (responseData9 = (SearchRivalsResponse.ResponseData) baseResponse.data) != null) {
            str = responseData9.searchId;
        } else {
            str = null;
        }
        if (Intrinsics.LJFF(str, ((C960610b6Z) afS82S0101000_15.l0).LLIZLLLIL)) {
            C960610b6Z c960610b6Z = (C960610b6Z) afS82S0101000_15.l0;
            C13BV c13bv = C13BV.INSTANCE;
            c960610b6Z.LLILLJJLI = c13bv;
            c960610b6Z.LLILLL = c13bv;
            if (baseResponse != null && (responseData8 = (SearchRivalsResponse.ResponseData) baseResponse.data) != null) {
                str2 = responseData8.searchId;
            }
            c960610b6Z.LLIZLLLIL = str2;
            if (baseResponse != null && (responseData7 = (SearchRivalsResponse.ResponseData) baseResponse.data) != null && (map2 = responseData7.rivalExtraInfos) != null) {
                LJ = new LinkedHashMap();
                for (Map.Entry<Long, RivalExtraInfo> entry : map2.entrySet()) {
                    if (entry.getKey() != null || entry.getValue() != null) {
                        LJ.put(entry.getKey(), entry.getValue());
                    }
                }
            } else {
                LJ = C2097608Jq.LJ();
            }
            c960610b6Z.LLJ = LJ;
            C960610b6Z c960610b6Z2 = (C960610b6Z) afS82S0101000_15.l0;
            if (baseResponse != null && (responseData6 = (SearchRivalsResponse.ResponseData) baseResponse.data) != null && (map = responseData6.rivalUserToExtraInfos) != null) {
                LJ2 = new LinkedHashMap();
                for (Map.Entry<Long, RivalExtraInfo> entry2 : map.entrySet()) {
                    if (entry2.getKey() != null || entry2.getValue() != null) {
                        LJ2.put(entry2.getKey(), entry2.getValue());
                    }
                }
            } else {
                LJ2 = C2097608Jq.LJ();
            }
            c960610b6Z2.LLJI = LJ2;
            C960610b6Z c960610b6Z3 = (C960610b6Z) afS82S0101000_15.l0;
            if (baseResponse != null && (responseData5 = (SearchRivalsResponse.ResponseData) baseResponse.data) != null && (list4 = responseData5.cellList) != null && list4.isEmpty()) {
                i = ((C960610b6Z) afS82S0101000_15.l0).LLJILJIL;
            } else {
                int i2 = ((C960610b6Z) afS82S0101000_15.l0).LLJILJIL;
                if (baseResponse != null && (responseData = (SearchRivalsResponse.ResponseData) baseResponse.data) != null && (list = responseData.cellList) != null) {
                    size = list.size();
                } else {
                    size = 0;
                }
                i = i2 + size;
            }
            c960610b6Z3.LLJILJIL = i;
            C960610b6Z c960610b6Z4 = (C960610b6Z) afS82S0101000_15.l0;
            if (baseResponse != null && (responseData4 = (SearchRivalsResponse.ResponseData) baseResponse.data) != null && (list3 = responseData4.cellList) != null) {
                arrayList = new ArrayList();
                for (SearchRivalsResponse.Cell cell : list3) {
                    if (cell.cellType != 3) {
                        arrayList.add(cell);
                    }
                }
            } else {
                arrayList = C13BV.INSTANCE;
            }
            c960610b6Z4.LLILLJJLI = arrayList;
            C960610b6Z c960610b6Z5 = (C960610b6Z) afS82S0101000_15.l0;
            if (baseResponse != null && (responseData3 = (SearchRivalsResponse.ResponseData) baseResponse.data) != null && (list2 = responseData3.cellList) != null) {
                arrayList2 = new ArrayList();
                for (SearchRivalsResponse.Cell cell2 : list2) {
                    if (cell2.cellType == 3) {
                        arrayList2.add(cell2);
                    }
                }
            } else {
                arrayList2 = C13BV.INSTANCE;
            }
            c960610b6Z5.LLILLL = arrayList2;
            C960610b6Z c960610b6Z6 = (C960610b6Z) afS82S0101000_15.l0;
            if (baseResponse != null && (responseData2 = (SearchRivalsResponse.ResponseData) baseResponse.data) != null) {
                z = responseData2.hasMore;
            } else {
                z = false;
            }
            int i3 = afS82S0101000_15.i1;
            c960610b6Z6.LLILZIL.remove(c960610b6Z6.LLILZ);
            if ((!c960610b6Z6.LLILLJJLI.isEmpty()) && c960610b6Z6.LLJILJILJ != 0) {
                c960610b6Z6.LJJIIJ(0, i3);
            }
            if (!c960610b6Z6.LLILLL.isEmpty()) {
                if (!c960610b6Z6.LLJIJIL) {
                    c960610b6Z6.LJJII();
                }
                c960610b6Z6.LJJIIJ(1, i3);
            }
            if (z && c960610b6Z6.LJJIIJZLJL()) {
                c960610b6Z6.LLILZIL.add(new C960790b6r());
                c960610b6Z6.LLILZ = c960610b6Z6.LLILZIL.size() - 1;
            }
            c960610b6Z6.LLILZIL = c960610b6Z6.LLILZIL;
            C960610b6Z c960610b6Z7 = (C960610b6Z) afS82S0101000_15.l0;
            MultiCoHostSearchContract$AbsView multiCoHostSearchContract$AbsView = (MultiCoHostSearchContract$AbsView) c960610b6Z7.LL;
            if (multiCoHostSearchContract$AbsView != null) {
                multiCoHostSearchContract$AbsView.PR(c960610b6Z7.LJJIIJZLJL());
            }
        }
        C1C7U.LIZIZ("MultiCoHostSearchPresenter@ec83.fetchExpandListData$1");
    }

    public static final void accept$1(AfS82S0101000_15 afS82S0101000_15, Object obj) {
        C1C7U.LIZ("RandomMatchGuestViewModel@4.cancel$2");
        C20441214yg.LJIIIZ("RandomMatchGuestViewModel", "cancel success");
        C930480aJy.LIZ.getClass();
        if (C930480aJy.LJJIFFI((C470590Icr) obj) && afS82S0101000_15.i1 == 1) {
            ((RandomMatchGuestViewModel) afS82S0101000_15.l0).yQ2("cancelSuccessFromCancelClick");
            C947520alS.LIZ("cancel_click");
        }
        C1C7U.LIZIZ("RandomMatchGuestViewModel@4.cancel$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$2(AfS82S0101000_15 afS82S0101000_15, Object obj) {
        C1C7U.LIZ("MultiMatchAudiencePresenter@edb8.checkBattleInfo$1$1");
        C470590Icr c470590Icr = (C470590Icr) obj;
        if (((C970750bMv) afS82S0101000_15.l0).mView != 0 && !C915980Zwa.LJFF().co0() && !C915980Zwa.LIZ().Al1()) {
            BattleInfoResponse battleInfoResponse = (BattleInfoResponse) c470590Icr.data;
            ((C970750bMv) afS82S0101000_15.l0).getClass();
            if (C970750bMv.LJJJZ()) {
                C974540bT2.LIZ.LJJJIL(c470590Icr, "audience_start");
            } else {
                C974480bSw.LJJII("audience_start", battleInfoResponse, false, false);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("checkBattleInfo, handleBattleInfo, info = ");
            sbLIZ.append(battleInfoResponse);
            C20441214yg.LJIIIZ("MultiMatchAudiencePrese", C2188811AlT.LIZIZ(sbLIZ));
            InterfaceC970770bMx interfaceC970770bMx = (InterfaceC970770bMx) ((C970750bMv) afS82S0101000_15.l0).mView;
            if (interfaceC970770bMx != null && !interfaceC970770bMx.CB0(battleInfoResponse) && LiveMatchQualityOptimizeSetting.INSTANCE.enableOptimize()) {
                ((C970750bMv) afS82S0101000_15.l0).LJJJJLL(afS82S0101000_15.i1);
            }
        }
        C1C7U.LIZIZ("MultiMatchAudiencePresenter@edb8.checkBattleInfo$1$1");
    }

    public static final void accept$3(AfS82S0101000_15 afS82S0101000_15, Object obj) {
        String str;
        String str2;
        Integer numValueOf;
        C1C7U.LIZ("MultiGuestPreviewLiveSettingViewModel@4186.updatePanelLayoutType$3");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updatePanelLayoutType error: ");
        sbLIZ.append(((Throwable) obj).getMessage());
        C20441214yg.LJ("MultiGuestPreviewLiveSettingViewModel", C2188811AlT.LIZIZ(sbLIZ));
        C948100amO c948100amOLIZ = C0H79.LIZ();
        if (c948100amOLIZ != null) {
            str = c948100amOLIZ.LIZLLL;
        } else {
            str = null;
        }
        String strValueOf = String.valueOf(str);
        C948100amO c948100amOLIZ2 = C0H79.LIZ();
        if (c948100amOLIZ2 != null) {
            str2 = c948100amOLIZ2.LJ;
        } else {
            str2 = null;
        }
        String strValueOf2 = String.valueOf(str2);
        C948100amO c948100amOLIZ3 = C0H79.LIZ();
        if (c948100amOLIZ3 != null) {
            numValueOf = Integer.valueOf(c948100amOLIZ3.LIZIZ());
        } else {
            numValueOf = null;
        }
        String strValueOf3 = String.valueOf(numValueOf);
        List listLJII = C942210act.LIZ.LJII(null, false);
        ArrayList arrayList = new ArrayList();
        Iterator it2 = listLJII.iterator();
        while (it2.hasNext()) {
            String strValueOf4 = String.valueOf(((C948400ams) it2.next()).LIZIZ);
            if (strValueOf4 != null) {
                arrayList.add(strValueOf4);
            }
        }
        C931740aM0.LJIIJJI(new C931750aM1("click", strValueOf, strValueOf2, strValueOf3, "false", arrayList, "origin_panel", ((MultiGuestPreviewLiveSettingViewModel) afS82S0101000_15.l0).LL, 112));
        C1813460xI8.LIZIZ(((MultiGuestPreviewLiveSettingViewModel) afS82S0101000_15.l0).LLILZ, new AwS13S0002000_15(((MultiGuestPreviewLiveSettingViewModel) afS82S0101000_15.l0).wQ2(afS82S0101000_15.i1), ((MultiGuestPreviewLiveSettingViewModel) afS82S0101000_15.l0).LLIZLLLIL.LIZ(afS82S0101000_15.i1).maxPosition - 1, 2));
        C1C7U.LIZIZ("MultiGuestPreviewLiveSettingViewModel@4186.updatePanelLayoutType$3");
    }

    public static final void accept$4(AfS82S0101000_15 afS82S0101000_15, Object obj) {
        C1C7U.LIZ("LayoutSettingRepository@176a.updateMultiGuestApplyAutoApprove$1");
        C930480aJy.LIZ.getClass();
        if (((BaseResponse) obj).statusCode == 0) {
            C20441214yg.LJIIIZ("LayoutSettingRepository", "updateMultiGuestApplyAutoApprove success");
            C948030amH c948030amH = (C948030amH) afS82S0101000_15.l0;
            c948030amH.LJI = afS82S0101000_15.i1;
            c948030amH.LIZLLL();
        }
        C1C7U.LIZIZ("LayoutSettingRepository@176a.updateMultiGuestApplyAutoApprove$1");
    }

    public static final void accept$5(AfS82S0101000_15 afS82S0101000_15, Object obj) {
        boolean z;
        long id;
        String str;
        Room room;
        C1C7U.LIZ("QuickCoHostKeepAliveManager@d36.keepAlive$1");
        C20441214yg.LIZIZ("QuickCoHostKeepAliveManager", "keepAlive request interval run");
        C01GW<C958830b3h> c01gw = C958830b3h.LJII;
        C958830b3h c958830b3hLIZ = C944440agU.LIZ();
        int i = afS82S0101000_15.i1;
        if (i == 2) {
            z = true;
        } else {
            z = false;
        }
        c958830b3hLIZ.getClass();
        c958830b3hLIZ.LJIIL(C958830b3h.LJJIII(i, z), "auto_match_request_scene", true);
        c958830b3hLIZ.LJIJJLI("auto_match_keep_alive_request");
        C480460Ism.LIZ().getClass();
        CoHostApi coHostApi = (CoHostApi) C480460Ism.LIZLLL(CoHostApi.class);
        DataChannel dataChannel = ((C960000b5a) afS82S0101000_15.l0).LIZ.getDataChannel();
        if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
            id = room.getId();
        } else {
            id = -1;
        }
        long jLJFF = C950220apo.LJFF();
        int i2 = afS82S0101000_15.i1;
        C950840aqo c950840aqo = ((C960000b5a) afS82S0101000_15.l0).LIZ.c0().LJIJJ;
        if (c950840aqo != null) {
            str = c950840aqo.LIZLLL;
        } else {
            str = null;
        }
        C11NZ<R> c11nzLJIILIIL = coHostApi.randomLinkMicKeepLive(id, jLJFF, i2, str).LJIILIIL(new C0UO0());
        int i3 = afS82S0101000_15.i1;
        C960000b5a c960000b5a = (C960000b5a) afS82S0101000_15.l0;
        InterfaceC420801kM interfaceC420801kMLJJLL = c11nzLJIILIIL.LJJLL(new AfS67S0201000_15(i3, c960000b5a, c958830b3hLIZ, 3), new AfS67S0201000_15(i3, c960000b5a, c958830b3hLIZ, 4));
        C960000b5a c960000b5a2 = (C960000b5a) afS82S0101000_15.l0;
        C11JF c11jf = c960000b5a2.LIZIZ;
        if (c11jf != null) {
            c11jf.dispose();
        }
        c960000b5a2.LIZIZ = (C11JF) interfaceC420801kMLJJLL;
        C1C7U.LIZIZ("QuickCoHostKeepAliveManager@d36.keepAlive$1");
    }

    public static final void accept$6(AfS82S0101000_15 afS82S0101000_15, Object obj) {
        int errorCode;
        String prompt;
        C501470JlZ c501470JlZ;
        C1C7U.LIZ("UpdateLayoutApiHandler@cdb6.requestAndApply$2");
        Throwable th = (Throwable) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("requestAndApply: network error action=");
        sbLIZ.append(afS82S0101000_15.i1);
        C20441214yg.LJFF("UpdateLayoutApiHandler", C2188811AlT.LIZIZ(sbLIZ), th);
        if ((th instanceof C501470JlZ) && (c501470JlZ = (C501470JlZ) th) != null) {
            errorCode = c501470JlZ.getErrorCode();
            prompt = c501470JlZ.getPrompt();
            if ((prompt == null || !(!a0.LJJJIL(prompt))) && ((prompt = c501470JlZ.getErrorMsg()) == null || !(!a0.LJJJIL(prompt)))) {
                prompt = "update layout request failed";
            }
        } else {
            errorCode = -1;
            prompt = "";
        }
        InterfaceC914930Zut interfaceC914930Zut = (InterfaceC914930Zut) afS82S0101000_15.l0;
        if (interfaceC914930Zut != null) {
            interfaceC914930Zut.LIZ(errorCode, prompt, th);
        }
        C1C7U.LIZIZ("UpdateLayoutApiHandler@cdb6.requestAndApply$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AfS82S0101000_15(int i, int i2, InterfaceC914930Zut<Unit> interfaceC914930Zut) {
        this.$t = interfaceC914930Zut;
        this.i1 = i;
        this.l0 = i2;
    }
}
