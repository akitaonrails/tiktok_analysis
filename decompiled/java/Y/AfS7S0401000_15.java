package Y;

import X.C01GW;
import X.C09JN;
import X.C19EG;
import X.C1C7U;
import X.C20441214yg;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C470590Icr;
import X.C497740JfY;
import X.C500260Jjc;
import X.C501470JlZ;
import X.C501520Jle;
import X.C501540Jlg;
import X.C783320Uo6;
import X.C783330Uo7;
import X.C783350Uo9;
import X.C914280Ztq;
import X.C914590ZuL;
import X.C915980Zwa;
import X.C930480aJy;
import X.C943660afE;
import X.C944440agU;
import X.C948030amH;
import X.C948620anE;
import X.C950840aqo;
import X.C955540ayO;
import X.C956990b0j;
import X.C958790b3d;
import X.C958830b3h;
import X.C959600b4w;
import X.C959660b52;
import X.C959680b54;
import X.C959990b5Z;
import X.C960260b60;
import X.C962110b8z;
import X.EnumC958840b3i;
import X.EnumC958900b3o;
import X.EnumC959690b55;
import X.EnumC959750b5B;
import X.EnumC960290b63;
import X.InterfaceC914930Zut;
import X.InterfaceC937900aVw;
import X.InterfaceC940060aZQ;
import X.InterfaceC954910axN;
import X.InterfaceC959730b59;
import X.InterfaceC959930b5T;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.liveinteract.linkroom.InteractService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.LayoutSettingContract;
import com.bytedance.android.live.liveinteract.multihost.event.CoHostPunishPermissionChannel;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.chatroom.interact.model.AutoMatchResp;
import com.bytedance.android.livesdk.chatroom.model.interact.CheckPermissionResponse;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS250S0000000_15;
import kotlin.jvm.internal.AwS139S0201000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.AwS73S0301000_15;
import kotlin.jvm.internal.Intrinsics;
import tikcast.linkmic.common.AnchorPanelLayoutTypeSetting;
import tikcast.linkmic.common.LayoutData;
import tikcast.linkmic.common.LayoutState;
import tikcast.linkmic.common.MultiGuestLayoutExtra;
import webcast.api.linkmic_multi_guest.GuideLayoutUpdateResponse;

/* JADX INFO: loaded from: classes16.dex */
public class AfS7S0401000_15 implements C09JN {
    public final int $t;
    public int i4;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

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
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$0(AfS7S0401000_15 afS7S0401000_15, Object obj) {
        CheckPermissionResponse checkPermissionResponse;
        C1C7U.LIZ("InteractService@c732.coHostInviteOrApply$3");
        BaseResponse baseResponse = (BaseResponse) obj;
        if (baseResponse != null) {
            checkPermissionResponse = (CheckPermissionResponse) baseResponse.data;
        } else {
            checkPermissionResponse = null;
        }
        if (checkPermissionResponse != null) {
            ((DataChannel) afS7S0401000_15.l0).SX0(C956990b0j.class, checkPermissionResponse);
            ((DataChannel) afS7S0401000_15.l0).zW(CoHostPunishPermissionChannel.class, new C914590ZuL(checkPermissionResponse.anchorPunished, 2));
            if (checkPermissionResponse.multiHostPermission && checkPermissionResponse.anchorOnboardPermit && !checkPermissionResponse.anchorPunished) {
                InteractService.LJJIIJ((C914280Ztq) afS7S0401000_15.l2, afS7S0401000_15.i4, (InterfaceC914930Zut) afS7S0401000_15.l1, (ConcurrentHashMap) afS7S0401000_15.l3);
            } else {
                InteractService.LJJIIJZLJL((InterfaceC914930Zut) afS7S0401000_15.l1, C497740JfY.LJIJI(2131841160));
            }
        } else {
            C20441214yg.LJ("InteractService", "response is null");
            InteractService.LJJIIJZLJL((InterfaceC914930Zut) afS7S0401000_15.l1, C497740JfY.LJIJI(2131841160));
        }
        C1C7U.LIZIZ("InteractService@c732.coHostInviteOrApply$3");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$1(AfS7S0401000_15 afS7S0401000_15, Object obj) {
        AutoMatchResp.ResponseData responseData;
        InterfaceC914930Zut<C960260b60> interfaceC914930Zut;
        List<ImageModel> list;
        String str;
        C1C7U.LIZ("TeamPairNoneCoordinator@ddaa.startQuickCoHostForTeamPair$2");
        BaseResponse baseResponse = (BaseResponse) obj;
        C959680b54 c959680b54 = (C959680b54) afS7S0401000_15.l0;
        int i = afS7S0401000_15.i4;
        EnumC959750b5B enumC959750b5B = (EnumC959750b5B) afS7S0401000_15.l1;
        String str2 = null;
        if (baseResponse != null) {
            responseData = (AutoMatchResp.ResponseData) baseResponse.data;
        } else {
            responseData = null;
        }
        C950840aqo c950840aqo = (C950840aqo) afS7S0401000_15.l2;
        if (c950840aqo != null) {
            interfaceC914930Zut = c950840aqo.LIZIZ;
        } else {
            interfaceC914930Zut = null;
        }
        c959680b54.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("auto match call success, entranceType = ");
        sbLIZ.append(enumC959750b5B);
        sbLIZ.append(", response = ");
        sbLIZ.append(responseData);
        C20441214yg.LIZIZ("TeamPairNoneCoordinator", C2188811AlT.LIZIZ(sbLIZ));
        C959600b4w c959600b4wC0 = c959680b54.LIZ.c0();
        if (responseData != null) {
            list = responseData.avatars;
        } else {
            list = null;
        }
        c959600b4wC0.LJ = list;
        if (responseData != null) {
            C959990b5Z.LIZ(responseData);
        }
        InterfaceC959730b59 interfaceC959730b59 = c959680b54.LIZ;
        if (responseData != null) {
            str2 = responseData.sessionId;
        }
        interfaceC959730b59.LJFF(String.valueOf(str2));
        c959680b54.LIZ.getDelegate().LIZIZ(i, C955540ayO.LIZIZ);
        if (responseData != null) {
            C960260b60 c960260b60 = new C960260b60(responseData.settings, responseData.sessionId, 0, "");
            if (interfaceC914930Zut != null) {
                interfaceC914930Zut.onSuccess(c960260b60);
            }
        }
        C01GW<C958830b3h> c01gw = C958830b3h.LJII;
        C958830b3h c958830b3hLIZ = C944440agU.LIZ();
        String strName = enumC959750b5B.name();
        long j = c959680b54.LIZ.c0().LIZJ;
        long j2 = c959680b54.LIZ.c0().LIZLLL;
        if (responseData == null || (str = responseData.sessionId) == null) {
            str = "";
        }
        c958830b3hLIZ.LJJII(i, strName, false, str, j, j2);
        ((Function0) afS7S0401000_15.l3).invoke();
        C1C7U.LIZIZ("TeamPairNoneCoordinator@ddaa.startQuickCoHostForTeamPair$2");
    }

    public static final void accept$2(AfS7S0401000_15 afS7S0401000_15, Object obj) {
        InterfaceC914930Zut<C960260b60> interfaceC914930Zut;
        String message;
        C1C7U.LIZ("TeamPairNoneCoordinator@ddaa.startQuickCoHostForTeamPair$3");
        Throwable th = (Throwable) obj;
        C959680b54 c959680b54 = (C959680b54) afS7S0401000_15.l0;
        int i = afS7S0401000_15.i4;
        EnumC959750b5B enumC959750b5B = (EnumC959750b5B) afS7S0401000_15.l1;
        C950840aqo c950840aqo = (C950840aqo) afS7S0401000_15.l2;
        if (c950840aqo != null) {
            interfaceC914930Zut = c950840aqo.LIZIZ;
        } else {
            interfaceC914930Zut = null;
        }
        c959680b54.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("auto match result failed, entranceType = ");
        sbLIZ.append(enumC959750b5B);
        sbLIZ.append(" throwable = ");
        sbLIZ.append(th);
        C20441214yg.LJ("TeamPairNoneCoordinator", C2188811AlT.LIZIZ(sbLIZ));
        C01GW<C958830b3h> c01gw = C958830b3h.LJII;
        C944440agU.LIZ().LJJ(enumC959750b5B.name(), c959680b54.LIZ.c0().LIZJ, c959680b54.LIZ.c0().LIZLLL, th, false, i);
        if (interfaceC914930Zut != null) {
            if (th == null || (message = th.getMessage()) == null) {
                message = "";
            }
            interfaceC914930Zut.LIZ(1, message, th);
        }
        ((Function0) afS7S0401000_15.l3).invoke();
        C1C7U.LIZIZ("TeamPairNoneCoordinator@ddaa.startQuickCoHostForTeamPair$3");
    }

    public static final void accept$3(AfS7S0401000_15 afS7S0401000_15, Object obj) {
        C1C7U.LIZ("LayoutSettingContract@73d7.realHandleItemClickInUseMode$1$2");
        ((LayoutSettingContract) afS7S0401000_15.l0).LJJJJL(afS7S0401000_15.i4, (Function0) afS7S0401000_15.l1, (Function1) afS7S0401000_15.l2, (Function0) afS7S0401000_15.l3);
        C1C7U.LIZIZ("LayoutSettingContract@73d7.realHandleItemClickInUseMode$1$2");
    }

    public static final void accept$4(AfS7S0401000_15 afS7S0401000_15, Object obj) {
        InterfaceC914930Zut<C960260b60> interfaceC914930Zut;
        boolean z;
        Integer numValueOf;
        Integer numValueOf2;
        Throwable exc;
        String string;
        C501520Jle c501520Jle;
        C19EG c19egLIZ;
        C501520Jle c501520Jle2;
        String message;
        C1C7U.LIZ("QuickCoHostStateNone@7571.startQuickCoHost$4");
        Throwable th = (Throwable) obj;
        C958790b3d c958790b3d = InterfaceC954910axN.LIZ;
        AFwS250S0000000_15 aFwS250S0000000_15 = AFwS250S0000000_15.get$arr$(195);
        c958790b3d.getClass();
        C958790b3d.LIZJ(th, aFwS250S0000000_15);
        C959660b52 c959660b52 = (C959660b52) afS7S0401000_15.l0;
        EnumC959750b5B enumC959750b5B = (EnumC959750b5B) afS7S0401000_15.l1;
        int i = afS7S0401000_15.i4;
        C955540ayO c955540ayO = (C955540ayO) afS7S0401000_15.l2;
        C950840aqo c950840aqo = (C950840aqo) afS7S0401000_15.l3;
        if (c950840aqo != null) {
            interfaceC914930Zut = c950840aqo.LIZIZ;
        } else {
            interfaceC914930Zut = null;
        }
        c959660b52.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("auto match result failed, entranceType = ");
        sbLIZ.append(enumC959750b5B);
        sbLIZ.append(" throwable = ");
        sbLIZ.append(th);
        C20441214yg.LJ("QuickCoHostStateNone", C2188811AlT.LIZIZ(sbLIZ));
        C01GW<C958830b3h> c01gw = C958830b3h.LJII;
        C958830b3h c958830b3hLIZ = C944440agU.LIZ();
        long j = c959660b52.LIZ.c0().LIZJ;
        long j2 = c959660b52.LIZ.c0().LIZLLL;
        if (c959660b52.LIZ.d0() == EnumC958840b3i.QUICK_RECOMMEND_DURING_COHOST) {
            z = true;
        } else {
            z = false;
        }
        c958830b3hLIZ.LJJ("TYPE_INVITEE_LIST_DIALOG", j, j2, th, z, 0);
        String str = "";
        if (interfaceC914930Zut != null) {
            if (th == null || (message = th.getMessage()) == null) {
                message = "";
            }
            interfaceC914930Zut.LIZ(1, message, th);
        }
        c959660b52.LJJIJ(EnumC958900b3o.NONE, null, EnumC959690b55.AUTO_MATCH_FAILED);
        boolean z2 = th instanceof C501470JlZ;
        if (z2 && (c501520Jle2 = (C501520Jle) th) != null) {
            numValueOf = Integer.valueOf(c501520Jle2.getErrorCode());
        } else {
            numValueOf = null;
        }
        if (numValueOf != null && ((numValueOf.intValue() == 20065 || numValueOf.intValue() == 4003063 || numValueOf.intValue() == 4032022 || numValueOf.intValue() == 4032023) && (c19egLIZ = C500260Jjc.LIZ(C497740JfY.LJII())) != null && numValueOf != null)) {
            if (numValueOf.intValue() != 20065 && numValueOf.intValue() != 4003063) {
                if (numValueOf.intValue() == 4032023) {
                    c959660b52.LJJIJIL(numValueOf.intValue(), 1, i, "single_confirm", "live_visibility_restricted");
                    C943660afE.LJ(new C783350Uo9(c19egLIZ, new AwS139S0201000_15(c959660b52, numValueOf, i, 3)));
                } else {
                    if (numValueOf.intValue() == 4032022) {
                        c959660b52.LJJIJIL(numValueOf.intValue(), 2, i, "allow_and_send", "non_friend_disabled");
                        AwS73S0301000_15 awS73S0301000_15 = new AwS73S0301000_15(c959660b52, numValueOf, i, c959660b52.LIZ.c0().LJIJJ, 2);
                        AwS139S0201000_15 awS139S0201000_15 = new AwS139S0201000_15(c959660b52, numValueOf, i, 4);
                        C783330Uo7 c783330Uo7 = new C783330Uo7(c19egLIZ);
                        c783330Uo7.LIZIZ = awS73S0301000_15;
                        c783330Uo7.LIZJ = awS139S0201000_15;
                        C943660afE.LJ(new C783320Uo6(c783330Uo7));
                    }
                    numValueOf2 = null;
                    C501540Jlg.LJ(C497740JfY.LJII(), th);
                }
                numValueOf2 = null;
            } else {
                c959660b52.LJJIJIL(numValueOf.intValue(), 1, i, "single_confirm", "private_account");
                numValueOf2 = null;
                C962110b8z.LIZ(c19egLIZ, EnumC960290b63.QUICK_PAIR_INFORMATIVE, null, new AwS139S0201000_15(c959660b52, numValueOf, i, 2));
            }
        } else {
            numValueOf2 = null;
            C501540Jlg.LJ(C497740JfY.LJII(), th);
        }
        InterfaceC959930b5T delegate = c959660b52.LIZ.getDelegate();
        if (th == null) {
            exc = new Exception();
        } else {
            exc = th;
        }
        delegate.LIZLLL(i, c955540ayO, exc);
        if (Intrinsics.LJFF(c955540ayO, C955540ayO.LJJJLL)) {
            if (z2 && (c501520Jle = (C501520Jle) th) != null) {
                numValueOf2 = Integer.valueOf(c501520Jle.getErrorCode());
            }
            Pair[] pairArr = new Pair[3];
            pairArr[0] = new Pair("auto_match_scene", String.valueOf(i));
            if (numValueOf2 != null && (string = numValueOf2.toString()) != null) {
                str = string;
            }
            pairArr[1] = new Pair("error_code", str);
            pairArr[2] = new Pair("auto_cohost_success", CardStruct.IStatusCode.DEFAULT);
            C948620anE.LIZJ("start_auto_match", "failed", "auto_match", "api_failed", C2097608Jq.LJIIIIZZ(pairArr));
        }
        C1C7U.LIZIZ("QuickCoHostStateNone@7571.startQuickCoHost$4");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$5(AfS7S0401000_15 afS7S0401000_15, Object obj) {
        int i;
        int i2;
        String str;
        InterfaceC940060aZQ interfaceC940060aZQ;
        int iIntValue;
        LayoutState layoutState;
        String str2;
        LayoutState layoutState2;
        LayoutState layoutState3;
        MultiGuestLayoutExtra multiGuestLayoutExtra;
        LayoutState layoutState4;
        MultiGuestLayoutExtra multiGuestLayoutExtra2;
        LayoutState layoutState5;
        C1C7U.LIZ("LayoutSettingRepository@176a.switchLayoutInternal$1");
        C470590Icr c470590Icr = (C470590Icr) obj;
        C930480aJy.LIZ.getClass();
        if (C930480aJy.LJJIFFI(c470590Icr)) {
            C20441214yg.LJIIIZ("LayoutSettingRepository", "switchLayout success");
            GuideLayoutUpdateResponse.ResponseData responseData = (GuideLayoutUpdateResponse.ResponseData) c470590Icr.data;
            LayoutData layoutData = responseData.roomLayoutData;
            Function1 function1 = (Function1) afS7S0401000_15.l0;
            if (function1 != null) {
                if (layoutData != null) {
                    layoutState5 = layoutData.layout;
                } else {
                    layoutState5 = null;
                }
                function1.invoke(layoutState5);
            }
            C948030amH c948030amH = (C948030amH) afS7S0401000_15.l1;
            LayoutData layoutData2 = responseData.roomLayoutData;
            if (layoutData2 != null && (layoutState4 = layoutData2.layout) != null && (multiGuestLayoutExtra2 = layoutState4.multiGuestLayoutExtra) != null) {
                i = multiGuestLayoutExtra2.currentPanelLayoutType;
            } else {
                i = 1;
            }
            c948030amH.LIZIZ = i;
            Pair pairLJI = C500260Jjc.LJI(c948030amH.LIZJ, new AwS594S0100000_15(c948030amH, 918));
            if (layoutData != null && (layoutState3 = layoutData.layout) != null && (multiGuestLayoutExtra = layoutState3.multiGuestLayoutExtra) != null) {
                i2 = multiGuestLayoutExtra.currentMaxPosition;
            } else {
                i2 = 0;
            }
            if (((Number) pairLJI.getSecond()).intValue() >= 0) {
                AnchorPanelLayoutTypeSetting anchorPanelLayoutTypeSetting = (AnchorPanelLayoutTypeSetting) pairLJI.getFirst();
                if (anchorPanelLayoutTypeSetting != null) {
                    anchorPanelLayoutTypeSetting.maxPosition = i2;
                }
                Object first = pairLJI.getFirst();
                if (first != null) {
                    ListProtector.set(((C948030amH) afS7S0401000_15.l1).LIZJ, ((Number) pairLJI.getSecond()).intValue(), first);
                }
            } else {
                List<AnchorPanelLayoutTypeSetting> list = ((C948030amH) afS7S0401000_15.l1).LIZJ;
                AnchorPanelLayoutTypeSetting anchorPanelLayoutTypeSetting2 = new AnchorPanelLayoutTypeSetting();
                anchorPanelLayoutTypeSetting2.panelLayoutType = ((C948030amH) afS7S0401000_15.l1).LIZIZ;
                anchorPanelLayoutTypeSetting2.maxPosition = i2;
                list.add(anchorPanelLayoutTypeSetting2);
            }
            C948030amH c948030amH2 = (C948030amH) afS7S0401000_15.l1;
            LayoutData layoutData3 = responseData.roomLayoutData;
            String str3 = "";
            if (layoutData3 == null || (layoutState2 = layoutData3.layout) == null || (str = layoutState2.layoutKey) == null) {
                str = "";
            }
            c948030amH2.LJFF = str;
            if (layoutData3 != null && (layoutState = layoutData3.layout) != null && (str2 = layoutState.layoutId) != null) {
                str3 = str2;
            }
            c948030amH2.LJ = str3;
            if (afS7S0401000_15.i4 == 1) {
                Integer num = (Integer) afS7S0401000_15.l2;
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 4;
                }
                c948030amH2.LIZLLL = iIntValue;
            }
            ((C948030amH) afS7S0401000_15.l1).LIZLLL();
            C948030amH c948030amH3 = (C948030amH) afS7S0401000_15.l1;
            String str4 = c470590Icr.LIZIZ;
            c948030amH3.getClass();
            if (layoutData != null) {
                InterfaceC937900aVw interfaceC937900aVwCi = C915980Zwa.LJIIIIZZ().Ci(null);
                if ((interfaceC937900aVwCi instanceof InterfaceC940060aZQ) && (interfaceC940060aZQ = (InterfaceC940060aZQ) interfaceC937900aVwCi) != null) {
                    interfaceC940060aZQ.LJJLIIJ(layoutData, str4, "LayoutSettingRepository_switchLayout");
                }
            }
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("switchLayout fail, status code: ");
            sbLIZ.append(c470590Icr.statusCode);
            C20441214yg.LJ("LayoutSettingRepository", C2188811AlT.LIZIZ(sbLIZ));
            Function0 function0 = (Function0) afS7S0401000_15.l3;
            if (function0 != null) {
                function0.invoke();
            }
        }
        C1C7U.LIZIZ("LayoutSettingRepository@176a.switchLayoutInternal$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AfS7S0401000_15(Object obj, LayoutSettingContract layoutSettingContract, int i, Function0<Unit> function0, Function1<? super LayoutState, Unit> function1, Function0<Unit> function02) {
        this.$t = function02;
        this.l0 = obj;
        this.i4 = layoutSettingContract;
        this.l1 = i;
        this.l2 = function0;
        this.l3 = function1;
    }
}
