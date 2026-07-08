package X;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.browser.IHybridStorageService;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.comp.api.subscription.api.SubscribeApi;
import com.bytedance.android.livesdk.comp.api.subscription.event.GetSubInfoResponseEventGlobal;
import com.bytedance.android.livesdk.comp.api.subscription.event.SubNoteToastEvent;
import com.bytedance.android.livesdk.livesetting.broadcast.PreviewEnterFpsOptSetting;
import com.bytedance.android.livesdk.livesetting.subscription.SubscribeInvitationLynxUrlSetting;
import com.bytedance.android.livesdk.subscribe.model.GetSubInfoResponse;
import com.bytedance.android.livesdk.subscribe.model.SubSettingStatus;
import com.bytedance.android.livesdk.subscribe.model.invite.GetInvitationStatusResponse;
import com.bytedance.android.livesdk.subscribe.model.invite.SubEnable;
import com.bytedance.android.livesdk.subscribe.model.invite.SubEntrance;
import com.bytedance.android.livesdk.subscribe.model.invite.SubInvitationCode;
import com.bytedance.android.livesdk.subscribe.model.invite.SubInvitationEntrance;
import com.bytedance.android.livesdk.subscribe.model.invite.SubInvitationInviteeStatus;
import com.bytedance.android.livesdk.subscribe.model.invite.SubOptInStatus;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostPgcSubsService;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.n;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AwS121S1100000_7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0JSu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C492420JSu implements InterfaceC1141530foN, InterfaceC493650JXn {
    public final String LL;
    public Boolean LLILLJJLI;
    public final List<InterfaceC492460JSy> LLILLL;
    public GetSubInfoResponse LLILZ;
    public Function1<? super String, Unit> LLILZIL;
    public boolean LLILZLL;

    @Override // X.InterfaceC493680JXq
    public final void onDestroy() {
        C1548820qPI.LJIIIIZZ("anchor_subscribe_finished_guide", this);
        C1548820qPI.LJIIIIZZ("anchor_subscribe_emotes_status_change", this);
        C1548820qPI.LJIIIIZZ("anchor_subscribe_badge_status_change", this);
        C1548820qPI.LJIIIIZZ("anchor_subscribe_status_submit_event", this);
        C1548820qPI.LJIIIIZZ("anchor_subscribe_note_status_change", this);
        C1548820qPI.LJIIIIZZ("anchor_subscribe_c2c_trans_disagree", this);
        C1548820qPI.LJIIIIZZ("smb_optin_process_ended", this);
    }

    public final void LJII() {
        C11ON c11onLJJJJZI;
        C11NZ<n> pgcSubscribeInfo;
        C11NZ<n> pgcSubscribeInfo2;
        if (TextUtils.isEmpty(UserService.getInstance().user().getCurrentUser().getSecUid())) {
            return;
        }
        InterfaceC2262081DgM currentUser = UserService.getInstance().user().getCurrentUser();
        IHostPgcSubsService iHostPgcSubsService = (IHostPgcSubsService) C1161920gLG.LIZJ(IHostPgcSubsService.class);
        if (PreviewEnterFpsOptSetting.INSTANCE.enable()) {
            if (iHostPgcSubsService == null || (pgcSubscribeInfo2 = iHostPgcSubsService.getPgcSubscribeInfo(true, currentUser.getSecUid(), true, this.LL, 0)) == null || (c11onLJJJJZI = pgcSubscribeInfo2.LJL(C11S5.LIZ()).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.0JLp
                @Override // X.InterfaceC1487280oo2
                public final Object apply(Object obj) {
                    n nVar = (n) obj;
                    C490290JKp.LIZ.getClass();
                    return new Pair(nVar, C490290JKp.LIZ(nVar));
                }
            }).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.0JLq
                @Override // X.InterfaceC1487280oo2
                public final Object apply(Object obj) {
                    Pair pair = (Pair) obj;
                    n nVar = (n) pair.getFirst();
                    Object second = pair.getSecond();
                    C490180JKe.LIZ(nVar);
                    return second;
                }
            })) == null) {
                C480460Ism.LIZ().getClass();
                c11onLJJJJZI = C510380Jzw.LJIILJJIL(((SubscribeApi) C480460Ism.LIZLLL(SubscribeApi.class)).getSubscribeInfo(true, currentUser.getSecUid(), true, this.LL, 0).LJL(C11S5.LIZ()), EnumC510330Jzr.SUBINFO, this.LL, null, C2097608Jq.LJ(), AFwS237S0000000_7.get$arr$(353)).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.0JLo
                    @Override // X.InterfaceC1487280oo2
                    public final Object apply(Object obj) {
                        T t = ((BaseResponse) obj).data;
                        C490290JKp.LIZ.getClass();
                        return new Pair(t, C490290JKp.LIZ((n) t));
                    }
                }).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.0JLn
                    @Override // X.InterfaceC1487280oo2
                    public final Object apply(Object obj) {
                        Pair pair = (Pair) obj;
                        n nVar = (n) pair.getFirst();
                        Object second = pair.getSecond();
                        C490180JKe.LIZ(nVar);
                        return second;
                    }
                });
            }
        } else if (iHostPgcSubsService == null || (pgcSubscribeInfo = iHostPgcSubsService.getPgcSubscribeInfo(true, currentUser.getSecUid(), true, this.LL, 0)) == null || (c11onLJJJJZI = pgcSubscribeInfo.LJIILIIL(new C0UO0()).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.0JLm
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                n nVar = (n) obj;
                C490180JKe.LIZ(nVar);
                C490290JKp.LIZ.getClass();
                return C490290JKp.LIZ(nVar);
            }
        })) == null) {
            C480460Ism.LIZ().getClass();
            c11onLJJJJZI = C510380Jzw.LJIILJJIL(((SubscribeApi) C480460Ism.LIZLLL(SubscribeApi.class)).getSubscribeInfo(true, currentUser.getSecUid(), true, this.LL, 0).LJIILIIL(new C0UO0()), EnumC510330Jzr.SUBINFO, this.LL, null, C2097608Jq.LJ(), AFwS237S0000000_7.get$arr$(353)).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.0JLl
                @Override // X.InterfaceC1487280oo2
                public final Object apply(Object obj) {
                    BaseResponse baseResponse = (BaseResponse) obj;
                    C490180JKe.LIZ((n) baseResponse.data);
                    C490290JKp c490290JKp = C490290JKp.LIZ;
                    n nVar = (n) baseResponse.data;
                    c490290JKp.getClass();
                    return C490290JKp.LIZ(nVar);
                }
            });
        }
        c11onLJJJJZI.LJJLL(new C09JN() { // from class: X.0JT0
            @Override // X.C09JN
            public final void accept(Object obj) {
                boolean z;
                Boolean boolValueOf;
                Boolean boolValueOf2;
                Function1<? super String, Unit> function1;
                SubEnable subEnable;
                GetSubInfoResponse getSubInfoResponse;
                SubInvitationEntrance subInvitationEntrance;
                SubInvitationEntrance subInvitationEntrance2;
                SubSettingStatus subSettingStatus;
                C1C7U.LIZ("SubscribeEntranceHelper@9d5b.fetchInitialStatus$1");
                GetSubInfoResponse getSubInfoResponse2 = (GetSubInfoResponse) obj;
                this.LL.LLILLJJLI = Boolean.valueOf(getSubInfoResponse2.initialized);
                this.LL.LLILZ = getSubInfoResponse2;
                DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
                dataChannelGlobal.FQ2(GetSubInfoResponseEventGlobal.class, getSubInfoResponse2);
                this.LL.getClass();
                User.sSubPermission = getSubInfoResponse2.enable;
                SubEntrance subEntrance = getSubInfoResponse2.subEntrance;
                if (subEntrance != null) {
                    z = subEntrance.showSubEntranceGoLive;
                } else {
                    z = false;
                }
                User.sShowSubEntranceGoLive = z;
                User.subSplitStatus = getSubInfoResponse2.subSplitStatus;
                dataChannelGlobal.JQ2(C930720aKM.class, Integer.valueOf(getSubInfoResponse2.qualification ? 1 : 0));
                C492420JSu c492420JSu = this.LL;
                if (c492420JSu.LLILZLL) {
                    c492420JSu.LLILZLL = false;
                    GetSubInfoResponse getSubInfoResponse3 = c492420JSu.LLILZ;
                    if (getSubInfoResponse3 != null && (subSettingStatus = getSubInfoResponse3.noteInfo) != null) {
                        dataChannelGlobal.FQ2(SubNoteToastEvent.class, Integer.valueOf(subSettingStatus.currentStatus));
                    }
                }
                Iterator it2 = ((CopyOnWriteArrayList) this.LL.LLILLL).iterator();
                while (it2.hasNext()) {
                    ((InterfaceC492460JSy) it2.next()).LIZ();
                }
                C492420JSu c492420JSu2 = this.LL;
                GetSubInfoResponse getSubInfoResponse4 = c492420JSu2.LLILZ;
                if (getSubInfoResponse4 != null && (subInvitationEntrance2 = getSubInfoResponse4.invitationEntrance) != null) {
                    boolValueOf = Boolean.valueOf(subInvitationEntrance2.beInvited);
                } else {
                    boolValueOf = null;
                }
                if (C500260Jjc.LJJJI(boolValueOf) && (((getSubInfoResponse = c492420JSu2.LLILZ) == null || (subInvitationEntrance = getSubInfoResponse.invitationEntrance) == null || subInvitationEntrance.invitationStatus < 20) && Intrinsics.LJFF(C0KPJ.ye.LIZIZ(), Boolean.TRUE))) {
                    Function1<? super String, Unit> function12 = c492420JSu2.LLILZIL;
                    if (function12 != null) {
                        function12.invoke(null);
                    }
                } else {
                    GetSubInfoResponse getSubInfoResponse5 = c492420JSu2.LLILZ;
                    if (getSubInfoResponse5 != null && (subEnable = getSubInfoResponse5.subEnable) != null) {
                        boolValueOf2 = Boolean.valueOf(subEnable.canEnable);
                    } else {
                        boolValueOf2 = null;
                    }
                    if (C500260Jjc.LJJJI(boolValueOf2)) {
                        Boolean boolLIZIZ = C0KPJ.ye.LIZIZ();
                        Boolean bool = Boolean.TRUE;
                        if (Intrinsics.LJFF(boolLIZIZ, bool)) {
                            SubscribeInvitationLynxUrlSetting subscribeInvitationLynxUrlSetting = SubscribeInvitationLynxUrlSetting.INSTANCE;
                            if (subscribeInvitationLynxUrlSetting.showActivityEntry() && !Intrinsics.LJFF(C0KPJ.ze.LIZIZ(subscribeInvitationLynxUrlSetting.getActivityId()), bool) && (function1 = c492420JSu2.LLILZIL) != null) {
                                function1.invoke(subscribeInvitationLynxUrlSetting.getActivityId());
                            }
                        }
                    }
                }
                Activity topActivity = ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).getTopActivity();
                if (topActivity != null) {
                    IHybridStorageService iHybridStorageService = (IHybridStorageService) C1161920gLG.LIZJ(IHybridStorageService.class);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("get_sub_info_response_");
                    sbLIZ.append(UserService.getInstance().user().getCurrentUserId());
                    iHybridStorageService.CM(topActivity, GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, getSubInfoResponse2), C2188811AlT.LIZIZ(sbLIZ), null);
                }
                C1C7U.LIZIZ("SubscribeEntranceHelper@9d5b.fetchInitialStatus$1");
            }
        }, new C09JN() { // from class: X.0JSv
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("SubscribeEntranceHelper@9d5b.fetchInitialStatus$2");
                Throwable th = (Throwable) obj;
                User.sShowSubEntranceGoLive = false;
                Iterator it2 = ((CopyOnWriteArrayList) this.LL.LLILLL).iterator();
                while (it2.hasNext()) {
                    ((InterfaceC492460JSy) it2.next()).LIZIZ(th);
                }
                C1C7U.LIZIZ("SubscribeEntranceHelper@9d5b.fetchInitialStatus$2");
            }
        });
    }

    @Override // X.InterfaceC493650JXn
    public final GetSubInfoResponse LIZ() {
        return this.LLILZ;
    }

    public C492420JSu(String str) {
        this.LL = str;
        LJII();
        C1548820qPI.LIZLLL("anchor_subscribe_finished_guide", this);
        C1548820qPI.LIZLLL("anchor_subscribe_emotes_status_change", this);
        C1548820qPI.LIZLLL("anchor_subscribe_badge_status_change", this);
        C1548820qPI.LIZLLL("anchor_subscribe_status_submit_event", this);
        C1548820qPI.LIZLLL("anchor_subscribe_note_status_change", this);
        C1548820qPI.LIZLLL("anchor_subscribe_c2c_trans_disagree", this);
        C1548820qPI.LIZLLL("smb_optin_process_ended", this);
        this.LLILLL = new CopyOnWriteArrayList();
    }

    @Override // X.InterfaceC493680JXq
    public final void LIZJ(final InterfaceC492450JSx interfaceC492450JSx) {
        if (this.LLILLJJLI != null) {
            interfaceC492450JSx.LIZIZ(this.LLILZ);
        } else {
            LJI(new InterfaceC492460JSy() { // from class: X.0JSw
                @Override // X.InterfaceC492460JSy
                public final void LIZ() {
                    interfaceC492450JSx.LIZIZ(this.LLILZ);
                    ((CopyOnWriteArrayList) this.LLILLL).remove(this);
                }

                @Override // X.InterfaceC492460JSy
                public final void LIZIZ(Throwable th) {
                    interfaceC492450JSx.LIZ(th);
                    ((CopyOnWriteArrayList) this.LLILLL).remove(this);
                }
            });
        }
    }

    @Override // X.InterfaceC493650JXn
    public final void LJFF(Function1<? super String, Unit> function1) {
        this.LLILZIL = function1;
    }

    @Override // X.InterfaceC493650JXn
    public final void LJI(InterfaceC492460JSy interfaceC492460JSy) {
        if (!((CopyOnWriteArrayList) this.LLILLL).contains(interfaceC492460JSy)) {
            ((CopyOnWriteArrayList) this.LLILLL).add(interfaceC492460JSy);
        }
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        String str;
        String strAsString;
        InterfaceC1871820yoG interfaceC1871820yoG;
        String str2 = c262100zr.LIZ;
        switch (str2.hashCode()) {
            case -1809547272:
                str = "anchor_subscribe_emotes_status_change";
                break;
            case -606560159:
                if (!str2.equals("anchor_subscribe_status_submit_event")) {
                    return;
                }
                InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
                if (interfaceC1107590evd == null || (interfaceC1871820yoG = interfaceC1107590evd.get("toast_text")) == null || (strAsString = interfaceC1871820yoG.asString()) == null) {
                    strAsString = "";
                }
                if (TextUtils.isEmpty(strAsString)) {
                    return;
                }
                C766270U4b.LJIIJJI(strAsString);
                return;
            case -57187985:
                if (!str2.equals("anchor_subscribe_note_status_change")) {
                    return;
                }
                this.LLILZLL = true;
                LJII();
                return;
            case 900742783:
                if (!str2.equals("anchor_subscribe_c2c_trans_disagree")) {
                    return;
                }
                LJII();
                return;
            case 1836714626:
                str = "anchor_subscribe_badge_status_change";
                break;
            case 1901835916:
                if (!str2.equals("smb_optin_process_ended")) {
                    return;
                }
                LJII();
                return;
            case 2137959118:
                if (!str2.equals("anchor_subscribe_finished_guide")) {
                    return;
                }
                C0KPJ.je.LIZJ(Boolean.TRUE);
                LJII();
                return;
            default:
                return;
        }
        str2.equals(str);
    }

    @Override // X.InterfaceC493650JXn
    public final void LIZLLL(String str, String str2, final AwS121S1100000_7 awS121S1100000_7) {
        C480460Ism.LIZ().getClass();
        C510380Jzw.LJIILJJIL(((SubscribeApi) C480460Ism.LIZLLL(SubscribeApi.class)).getInvitationState(str2), EnumC510330Jzr.GENERAL, str, "sub/invitation/get_invitation_status", C2097608Jq.LJ(), AFwS237S0000000_7.get$arr$(353)).LJIILIIL(new C0UO0()).LJJLL(new C09JN() { // from class: X.0JT1
            @Override // X.C09JN
            public final void accept(Object obj) {
                String str3;
                long id;
                Boolean boolValueOf;
                C1C7U.LIZ("SubscribeEntranceHelper@9d5b.requestInviteCodeStatus$dispose$1");
                T t = ((BaseResponse) obj).data;
                if (t != null) {
                    C492420JSu c492420JSu = this.LL;
                    GetInvitationStatusResponse getInvitationStatusResponse = (GetInvitationStatusResponse) t;
                    Function1<String, Unit> function1 = awS121S1100000_7;
                    c492420JSu.getClass();
                    long currentUserId = UserService.getInstance().user().getCurrentUserId();
                    SubInvitationCode subInvitationCode = getInvitationStatusResponse.inviteCodeData;
                    if (subInvitationCode == null || (str3 = subInvitationCode.inviteeId) == null) {
                        str3 = "";
                    }
                    User user = getInvitationStatusResponse.inviterInfo;
                    if (user != null) {
                        id = user.getId();
                    } else {
                        id = 0;
                    }
                    if (!TextUtils.isEmpty(str3) && currentUserId != 0) {
                        if (TextUtils.equals(str3, String.valueOf(currentUserId))) {
                            SubInvitationInviteeStatus subInvitationInviteeStatus = getInvitationStatusResponse.inviteeStatus;
                            if (subInvitationInviteeStatus != null) {
                                int i = subInvitationInviteeStatus.invitationStatus;
                                if (i != 0 && i != 10) {
                                    if (i != 20) {
                                        if (i != 30) {
                                            if (i == 40) {
                                                function1.invoke(SubscribeInvitationLynxUrlSetting.INSTANCE.getHome_page());
                                            }
                                        } else {
                                            SubOptInStatus subOptInStatus = subInvitationInviteeStatus.optInStatus;
                                            if (subOptInStatus != null) {
                                                boolValueOf = Boolean.valueOf(subOptInStatus.initialized);
                                            } else {
                                                boolValueOf = null;
                                            }
                                            if (C500260Jjc.LJJIJIIJIL(boolValueOf)) {
                                                c492420JSu.LLILLJJLI = Boolean.FALSE;
                                                function1.invoke("native_click_entrance");
                                            } else {
                                                SubOptInStatus subOptInStatus2 = subInvitationInviteeStatus.optInStatus;
                                                if (subOptInStatus2 != null) {
                                                    if (subOptInStatus2.auditStatus == 3) {
                                                        function1.invoke(SubscribeInvitationLynxUrlSetting.INSTANCE.getHome_page());
                                                    } else if (subOptInStatus2.auditStatus == 2) {
                                                        function1.invoke(SubscribeInvitationLynxUrlSetting.INSTANCE.getInvitation_card());
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        function1.invoke(SubscribeInvitationLynxUrlSetting.INSTANCE.getInvitation_card());
                                    }
                                } else if (C0KPJ.ye.LIZIZ().booleanValue()) {
                                    function1.invoke("native_letter_cover");
                                } else {
                                    function1.invoke(SubscribeInvitationLynxUrlSetting.INSTANCE.getInvitation_card());
                                }
                            }
                        } else if (currentUserId == id) {
                            function1.invoke(SubscribeInvitationLynxUrlSetting.INSTANCE.getInvitation_card());
                        } else {
                            function1.invoke(SubscribeInvitationLynxUrlSetting.INSTANCE.getWrong_invitation());
                        }
                    } else {
                        C20441214yg.LIZLLL("inviteeCode empty or currentId == 0");
                    }
                }
                C1C7U.LIZIZ("SubscribeEntranceHelper@9d5b.requestInviteCodeStatus$dispose$1");
            }
        }, new C09JN() { // from class: X.0882
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("SubscribeEntranceHelper@9d5b.requestInviteCodeStatus$dispose$2");
                awS121S1100000_7.invoke("error");
                C1C7U.LIZIZ("SubscribeEntranceHelper@9d5b.requestInviteCodeStatus$dispose$2");
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
    @Override // X.InterfaceC493680JXq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LJ(android.content.Context r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, kotlin.jvm.functions.Function0<kotlin.Unit> r19) {
        /*
            r14 = this;
            r10 = r16
            r7 = r14
            java.lang.Boolean r0 = r7.LLILLJJLI
            if (r0 == 0) goto L8a
            r0.booleanValue()
            java.lang.String r5 = "live_take_page"
            if (r10 != 0) goto Lf
            r10 = r5
        Lf:
            com.bytedance.android.livesdk.subscribe.model.GetSubInfoResponse r3 = r7.LLILZ
            r1 = 1
            r2 = 0
            r11 = r17
            r8 = r15
            if (r3 == 0) goto L70
            com.bytedance.android.livesdk.subscribe.model.invite.SubAvailable r0 = r3.subAvailable
            if (r0 == 0) goto L66
            boolean r0 = r0.isSubAvailable
            if (r0 != 0) goto L66
            com.bytedance.android.livesdk.livesetting.watchlive.LiveSubscribeLynxUrl r1 = com.bytedance.android.livesdk.livesetting.watchlive.LiveSubscribeLynxUrl.INSTANCE
            com.bytedance.android.livesdk.livesetting.model.LiveSubscribeLynxMap r0 = r1.getValue()
            java.lang.String r9 = r0.getAnchorUserNotAvailablePage()
            java.lang.String r12 = ""
            java.lang.String r13 = "page"
            r7.LIZIZ(r8, r9, r10, r11, r12, r13)
            com.bytedance.android.livesdk.livesetting.model.LiveSubscribeLynxMap r0 = r1.getValue()
            java.lang.String r6 = r0.getAnchorUserNotAvailablePage()
        L39:
            java.lang.Boolean r4 = r7.LLILLJJLI
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            java.lang.String r0 = "show_entrance"
            X.C0K04.LJFF(r0, r5, r3)
            if (r6 != 0) goto L64
            java.lang.String r1 = ""
        L49:
            java.lang.String r0 = "to_page"
            X.C0K04.LJFF(r0, r1, r3)
            if (r4 == 0) goto L54
            boolean r2 = r4.booleanValue()
        L54:
            java.lang.String r0 = "initialized"
            X.C0K04.LJIIIZ(r3, r0, r2)
            java.lang.String r0 = "enter_from"
            X.C0K04.LJFF(r0, r10, r3)
            java.lang.String r0 = "subscription_broadcast_entrance_click"
            X.C510380Jzw.LJJ(r0, r3)
            return r6
        L64:
            r1 = r6
            goto L49
        L66:
            boolean r0 = r3.hasOptIn
            if (r0 != r1) goto L70
            r19.invoke()
            java.lang.String r6 = "subscribe_settings"
            goto L39
        L70:
            com.bytedance.android.livesdk.livesetting.watchlive.LiveSubscribeLynxUrl r1 = com.bytedance.android.livesdk.livesetting.watchlive.LiveSubscribeLynxUrl.INSTANCE
            com.bytedance.android.livesdk.livesetting.model.LiveSubscribeLynxMap r0 = r1.getValue()
            java.lang.String r9 = r0.getAnchor_user_guide_page()
            java.lang.String r13 = "page"
            r12 = r18
            r7.LIZIZ(r8, r9, r10, r11, r12, r13)
            com.bytedance.android.livesdk.livesetting.model.LiveSubscribeLynxMap r0 = r1.getValue()
            java.lang.String r6 = r0.getAnchor_user_guide_page()
            goto L39
        L8a:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C492420JSu.LJ(android.content.Context, java.lang.String, java.lang.String, java.lang.String, kotlin.jvm.functions.Function0):java.lang.String");
    }

    @Override // X.InterfaceC493650JXn
    public final void LIZIZ(Context context, String str, String str2, String str3, String str4, String str5) {
        C0K8F.LIZ.getClass();
        C0K8F.LJ(context, str, str2, str2, str3, "", "", "", false, null, str5, str4);
    }
}
