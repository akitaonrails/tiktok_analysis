package X;

import Y.ACListenerS142S0100000_7;
import Y.AfS39S1200000_7;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.feed.api.TopLiveSkylightVisibilityChannel;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.dataChannel.MultiTabCurrentIndex;
import com.bytedance.android.livesdk.like.LikeHelper;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveRepostStrategyV2Config;
import com.bytedance.android.livesdk.sheet.LiveRepostGuideFragment;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.RepostInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostShare;
import com.bytedance.android.strategy.StrategyApi;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.keva.Keva;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AwS29S0310000_7;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import qo2.w;
import webcast.api.room.StrategyData;

/* JADX INFO: renamed from: X.0JhD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C498770JhD implements InterfaceC1087920ePu {
    public Room LL;
    public boolean LLILLJJLI;
    public boolean LLILLL;
    public InterfaceC1103130eoR LLILZLL;
    public Function0<Unit> LLIZ;
    public DataChannel LLIZLLLIL;
    public long LLILZ = -1;
    public final C11NJ LLILZIL = new C11NJ();
    public final C01GW LLJ = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(292));
    public final C01GW LLJI = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(291));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(290));

    @Override // X.InterfaceC1087920ePu
    public final String JA() {
        return "repost";
    }

    @Override // X.InterfaceC1087920ePu
    public final void Py(LikeHelper likeHelper, int i) {
    }

    @Override // X.InterfaceC1087920ePu
    public final /* synthetic */ void onResult(String str) {
    }

    public final void LIZ() {
        String requestId;
        RepostInfo repostInfo;
        User owner;
        FollowInfo followInfo;
        Pair[] pairArr = new Pair[11];
        pairArr[0] = new Pair("user_id", String.valueOf(UserService.getInstance().user().getCurrentUserId()));
        pairArr[1] = new Pair("panel_source", "share_panel");
        pairArr[2] = new Pair("button_status", "repost");
        w.LIZ.getClass();
        pairArr[3] = new Pair("enter_from_merge", w.LJIIIZ());
        pairArr[4] = new Pair("enter_method", w.LJIIL());
        pairArr[5] = new Pair("action_type", w.LIZLLL());
        Room room = this.LL;
        Long lValueOf = null;
        pairArr[6] = new Pair("room_id", String.valueOf(room != null ? Long.valueOf(room.getId()) : null));
        Room room2 = this.LL;
        pairArr[7] = new Pair("anchor_id", String.valueOf(room2 != null ? Long.valueOf(room2.getOwnerUserId()) : null));
        Room room3 = this.LL;
        pairArr[8] = new Pair("follow_status", String.valueOf((room3 == null || (owner = room3.getOwner()) == null || (followInfo = owner.getFollowInfo()) == null) ? null : Long.valueOf(followInfo.getFollowStatus())));
        Room room4 = this.LL;
        if (room4 != null && (repostInfo = room4.repostInfo) != null) {
            lValueOf = Long.valueOf(repostInfo.repostersCnt);
        }
        pairArr[9] = new Pair("reposted_user_cnt", String.valueOf(lValueOf));
        Room room5 = this.LL;
        if (room5 == null || (requestId = room5.getRequestId()) == null) {
            requestId = "";
        }
        pairArr[10] = new Pair("request_id", requestId);
        Map<String, String> mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
        IHostShare iHostShare = (IHostShare) C1161920gLG.LIZJ(IHostShare.class);
        Room room6 = this.LL;
        iHostShare.repost(room6 != null ? room6.getId() : 0L, mapLJIIIIZZ);
    }

    public final Keva LIZIZ() {
        return (Keva) this.LLJI.getValue();
    }

    public final void LJ() {
        FragmentManager fragmentManager;
        DataChannel dataChannel = this.LLIZLLLIL;
        if (dataChannel != null && (fragmentManager = (FragmentManager) dataChannel.gg0(C1082960eHu.class)) != null) {
            String str = LiveRepostGuideFragment._pnsPageId;
            if (C474350Iiv.LIZ(fragmentManager, new InterfaceC474360Iiw() { // from class: X.0JhF
                @Override // X.InterfaceC474360Iiw
                public final void LIZJ() {
                    this.LIZ.LIZ();
                }
            }, "share_panel", null)) {
                return;
            }
        }
        LIZ();
    }

    public final void LIZLLL() {
        int i = LIZIZ().getInt("repost_bubble_show_count", 0);
        long j = LIZIZ().getLong("last_bubble_show_time", 0L);
        int i2 = LIZIZ().getInt("daily_count", 0);
        Set<String> stringSet = LIZIZ().getStringSet("bubble_show_room_set", new LinkedHashSet());
        Room room = this.LL;
        stringSet.add(String.valueOf(room != null ? Long.valueOf(room.getId()) : null));
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (C0KLP.LIZ(jCurrentTimeMillis, j)) {
            LIZIZ().storeInt("daily_count", i2 + 1);
        } else {
            LIZIZ().storeInt("daily_count", 1);
        }
        LIZIZ().storeLong("last_bubble_show_time", jCurrentTimeMillis);
        LIZIZ().storeInt("repost_bubble_show_count", i + 1);
        LIZIZ().storeStringSet("bubble_show_room_set", stringSet);
    }

    public final void LIZJ(InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel) {
        boolean zBooleanValue;
        String str;
        Integer num;
        Boolean bool;
        if (!this.LLILLJJLI) {
            return;
        }
        this.LLILLJJLI = false;
        if (dataChannel != null && (bool = (Boolean) dataChannel.gg0(C0TZM.class)) != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = true;
        }
        Object objGg0 = null;
        C469620IbI.LIZ.getClass();
        StrategyData strategyDataLIZIZ = C469620IbI.LIZIZ(20, null, true, true, false);
        if (strategyDataLIZIZ != null) {
            str = strategyDataLIZIZ.actionType;
        } else {
            str = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isVertical:");
        sbLIZ.append(zBooleanValue);
        C20441214yg.LIZIZ("LiveRepostManager", C2188811AlT.LIZIZ(sbLIZ));
        if (!zBooleanValue) {
            if (!Intrinsics.LJFF(str, "replace_share_button") && !Intrinsics.LJFF(str, "replace_share_button_with_edu_bubble")) {
                if (dataChannel != null) {
                    objGg0 = dataChannel.gg0(C753990Tht.class);
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("landscapeStatus:");
                sbLIZ2.append(objGg0);
                C20441214yg.LIZIZ("LiveRepostManager", C2188811AlT.LIZIZ(sbLIZ2));
                if (Intrinsics.LJFF(objGg0, Boolean.TRUE)) {
                    C20441214yg.LIZIZ("LiveRepostManager", "landscapeStatus");
                    return;
                }
            } else {
                return;
            }
        }
        if (Intrinsics.LJFF(DataChannelGlobal.LLILZ.gg0(TopLiveSkylightVisibilityChannel.class), Boolean.TRUE)) {
            C20441214yg.LIZIZ("LiveRepostManager", "toplive skylight open");
            return;
        }
        if (dataChannel != null && (num = (Integer) dataChannel.gg0(MultiTabCurrentIndex.class)) != null && num.intValue() == 0) {
            if (Intrinsics.LJFF(str, "repost_through_tooltip")) {
                LJFF(strategyDataLIZIZ, new AwS29S0310000_7(this, interfaceC1103130eoR, dataChannel, zBooleanValue, 0));
                return;
            } else if ((Intrinsics.LJFF(str, "replace_share_button") || Intrinsics.LJFF(str, "replace_share_button_with_edu_bubble")) && this.LLIZ != null) {
                LJFF(strategyDataLIZIZ, new AwS29S0310000_7(this, interfaceC1103130eoR, dataChannel, zBooleanValue, 1));
                return;
            } else {
                LJI(interfaceC1103130eoR, dataChannel, zBooleanValue, strategyDataLIZIZ, false);
                return;
            }
        }
        C20441214yg.LIZIZ("LiveRepostManager", "multitab not at chat");
    }

    public final void LJFF(StrategyData strategyData, Function1<? super StrategyData, Unit> function1) {
        long id;
        long ownerUserId;
        if (strategyData == null) {
            return;
        }
        Room room = this.LL;
        if (room != null) {
            id = room.getId();
        } else {
            id = 0;
        }
        Room room2 = this.LL;
        if (room2 != null) {
            ownerUserId = room2.getOwnerUserId();
        } else {
            ownerUserId = 0;
        }
        String str = strategyData.strategyId;
        String str2 = strategyData.actionType;
        if (id > 0 && ownerUserId > 0 && !a0.LJJJIL(str) && !a0.LJJJIL(str2)) {
            C11NJ c11nj = this.LLILZIL;
            C480460Ism.LIZ().getClass();
            c11nj.LIZ(((StrategyApi) C480460Ism.LIZLLL(StrategyApi.class)).strategyCheck(20, id, ownerUserId, str, str2).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS39S1200000_7(function1, strategyData, str2, 1), new C09JN() { // from class: X.0Ibg
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("LiveRepostManager@c2f7.requestStrategyCheck$2");
                    Throwable th = (Throwable) obj;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("strategyCheck error: ");
                    sbLIZ.append(th.getMessage());
                    C20441214yg.LJFF("LiveRepostManager", C2188811AlT.LIZIZ(sbLIZ), th);
                    C1C7U.LIZIZ("LiveRepostManager@c2f7.requestStrategyCheck$2");
                }
            }));
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("strategyCheck skip, invalid params roomId=");
        sbLIZ.append(id);
        sbLIZ.append(" anchorId=");
        sbLIZ.append(ownerUserId);
        sbLIZ.append(" strategyId=");
        sbLIZ.append(str);
        sbLIZ.append(" actionType=");
        sbLIZ.append(str2);
        C20441214yg.LIZIZ("LiveRepostManager", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LJI(InterfaceC1103130eoR interfaceC1103130eoR, final DataChannel dataChannel, boolean z, StrategyData strategyData, final boolean z2) {
        int i;
        String str;
        C785220UrA c785220UrA = new C785220UrA(interfaceC1103130eoR.LJ());
        String strLJIJI = C497740JfY.LJIJI(2131855719);
        Objects.requireNonNull(strLJIJI);
        c785220UrA.LJIJJ = strLJIJI;
        if (z) {
            i = 48;
        } else {
            i = 80;
        }
        c785220UrA.LJFF = i;
        c785220UrA.LIZ(R.attr.ebh);
        c785220UrA.LJIILLIIL = new C521970KdX(this, 3);
        c785220UrA.LJIILL = new InterfaceC254600ye() { // from class: X.0JhE
            @Override // X.InterfaceC254600ye
            public final void onShow() {
                if (z2) {
                    return;
                }
                C498770JhD c498770JhD = this;
                c498770JhD.LLILLL = true;
                c498770JhD.LLILZ = System.currentTimeMillis();
                this.LIZLLL();
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_repost_guide_bubble_show");
                c474500IjALIZ.LJIJJLI(dataChannel);
                c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
                w.LIZ.getClass();
                c474500IjALIZ.LJJII(w.LJIJI(), "request_id");
                c474500IjALIZ.LIZ();
            }
        };
        c785220UrA.LJIIIIZZ = ((LiveRepostStrategyV2Config.RepostConfig) this.LLJIJIL.getValue()).bubbleDuration;
        c785220UrA.LJIIIZ = true;
        if (strategyData != null) {
            str = strategyData.actionType;
        } else {
            str = null;
        }
        if (Intrinsics.LJFF("repost_through_tooltip", str)) {
            c785220UrA.LJ = new ACListenerS142S0100000_7(this, 255);
            c785220UrA.LJJIII = true;
        }
        C1113800f5e.LIZ.LJ(new C1119590fEz(c785220UrA), EnumC1120860fH2.REPOST_GUIDE_BUBBLE, dataChannel);
    }

    @Override // X.InterfaceC1087920ePu
    public final void Pb(InterfaceC1085480eLy interfaceC1085480eLy, int i, int i2, float f, float f2, float f3, float f4) {
        InterfaceC1103130eoR interfaceC1103130eoR = this.LLILZLL;
        if (interfaceC1103130eoR != null) {
            LIZJ(interfaceC1103130eoR, this.LLIZLLLIL);
        }
    }
}
