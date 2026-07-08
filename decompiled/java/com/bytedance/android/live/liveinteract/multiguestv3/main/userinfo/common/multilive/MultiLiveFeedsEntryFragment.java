package com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.common.multilive;

import X.C098200Yq;
import X.C0KX4;
import X.C1161920gLG;
import X.C11JF;
import X.C13LP;
import X.C1685300txQ;
import X.C16FS;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20441214yg;
import X.C20736316Cj;
import X.C464330IIt;
import X.C497010JeN;
import X.C497740JfY;
import X.C786410Ut5;
import X.C947520alS;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostWatch;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import wh6.AbS689S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class MultiLiveFeedsEntryFragment extends Fragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElLjo2OzE6emE+KSHELIOSwiZzogLTclJyk8ZiYjJCI8JmshPCMnISklPyp9BTAgPSYfITMpDyo2LDYJJzshMQM+KCg+LSs4";
    public View LL;
    public C16FS LLILLJJLI;
    public List<FeedItem> LLILLL;
    public C11JF LLILZ;
    public boolean LLILZIL;

    /* JADX WARN: Removed duplicated region for block: B:9:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void MR() {
        /*
            r5 = this;
            java.lang.Class<com.bytedance.android.feed.api.ILiveFeedApiService> r0 = com.bytedance.android.feed.api.ILiveFeedApiService.class
            X.006A r4 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.feed.api.ILiveFeedApiService r4 = (com.bytedance.android.feed.api.ILiveFeedApiService) r4
            if (r4 == 0) goto L49
            com.bytedance.android.livesdk.livesetting.feed.FeedDrawMtSetting r0 = com.bytedance.android.livesdk.livesetting.feed.FeedDrawMtSetting.INSTANCE
            com.bytedance.android.livesdk.live.model.LiveFeedDraw r0 = r0.getValue()
            java.lang.String r3 = r0.getUrl()
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            java.lang.String r1 = "channel_id"
            java.lang.String r0 = "22046"
            r2.put(r1, r0)
            java.lang.String r1 = "live_detail"
            java.lang.String r0 = "mg_random_match_inner_refresh"
            X.11JN r1 = r4.IC(r1, r3, r0, r2)
            if (r1 == 0) goto L49
            X.11RO r0 = X.C1701940uOG.LIZIZ()
            X.11O8 r3 = r1.LJJJLZIJ(r0)
            Y.AfS176S0100000_7 r2 = new Y.AfS176S0100000_7
            r0 = 16
            r2.<init>(r5, r0)
            Y.AfS176S0100000_7 r1 = new Y.AfS176S0100000_7
            r0 = 17
            r1.<init>(r5, r0)
            X.01kM r0 = r3.LJJLL(r2, r1)
        L44:
            X.11JF r0 = (X.C11JF) r0
            r5.LLILZ = r0
            return
        L49:
            r0 = 0
            goto L44
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.common.multilive.MultiLiveFeedsEntryFragment.MR():void");
    }

    public final void NR() {
        FeedItem feedItem;
        Room room;
        Context context;
        C20441214yg.LJIIIZ("MultiLiveFeedsEntryFragment", "jumpFeeds");
        List<FeedItem> list = this.LLILLL;
        if (list == null || list.isEmpty() || (feedItem = (FeedItem) C13LP.LJJJLL(list)) == null || (room = feedItem.getRoom()) == null) {
            return;
        }
        long id = room.getId();
        if (id == 0 || (context = getContext()) == null) {
            return;
        }
        EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
        C464330IIt.LJ(room, enterRoomConfig);
        EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
        roomsData.hasMoreExtra = Boolean.TRUE;
        roomsData.maxTimeExtra = 1L;
        roomsData.enterMethod = "continuous_match";
        roomsData.enterFromMerge = "live_detail";
        roomsData.enterType = "click";
        enterRoomConfig.mLogData.requestId = feedItem.requestId();
        enterRoomConfig.mRoomsData.multiGuestContinuousType = 1;
        ArrayList<EnterRoomConfig> arrayList = new ArrayList<>();
        for (FeedItem feedItem2 : list) {
            Room room2 = feedItem2.getRoom();
            if (room2 != null && room2.getId() != id) {
                EnterRoomConfig enterRoomConfig2 = new EnterRoomConfig();
                C464330IIt.LJ(room2, enterRoomConfig2);
                EnterRoomConfig.RoomsData roomsData2 = enterRoomConfig2.mRoomsData;
                roomsData2.enterMethod = "continuous_match";
                roomsData2.enterFromMerge = "live_detail";
                enterRoomConfig2.mLogData.requestId = feedItem2.requestId();
                arrayList.add(enterRoomConfig2);
            }
        }
        if (!arrayList.isEmpty()) {
            enterRoomConfig.mLogData.moreConfig = arrayList;
        }
        HashMap map = new HashMap();
        String str = enterRoomConfig.mRoomsData.enterFromMerge;
        if (str == null) {
            str = "";
        }
        map.put("enter_from_merge", str);
        String str2 = enterRoomConfig.mRoomsData.enterMethod;
        map.put("enter_method", str2 != null ? str2 : "");
        map.put("room_id", String.valueOf(enterRoomConfig.mRoomsData.roomId));
        map.put("action_type", C947520alS.LIZJ(enterRoomConfig.mRoomsData.enterType));
        map.put("user_id", String.valueOf(UserService.getInstance().user().getCurrentUserId()));
        map.put("anchor_id", C947520alS.LIZJ(enterRoomConfig.mRoomsData.userId));
        map.put("guest_request_id", C947520alS.LIZJ(enterRoomConfig.mLogData.requestId));
        map.put("is_multi_continuous_match", Intrinsics.LJFF(enterRoomConfig.mRoomsData.enterMethod, "continuous_match") ? "1" : CardStruct.IStatusCode.DEFAULT);
        C0KX4.LIZ("livesdk_live_show", map, null, true);
        ((IHostWatch) C1161920gLG.LIZJ(IHostWatch.class)).watchLive(context, enterRoomConfig);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C11JF c11jf = this.LLILZ;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LLILZ = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C497010JeN.LIZJ();
        this.LL = view.findViewById(R.id.i6d);
        this.LLILLJJLI = (C16FS) view.findViewById(R.id.cqk);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        Context context = getContext();
        if (context != null) {
            gradientDrawable.setColor(C20736316Cj.LIZIZ(R.attr.eyd, context));
        }
        View view2 = this.LL;
        if (view2 != null) {
            view2.setBackground(gradientDrawable);
        }
        C16FS c16fs = this.LLILLJJLI;
        if (c16fs != null) {
            c16fs.setText(C497740JfY.LJIJI(2131854551));
        }
        C16FS c16fs2 = this.LLILLJJLI;
        if (c16fs2 != null) {
            c16fs2.setRadius(C497740JfY.LIZIZ(99));
        }
        C16FS c16fs3 = this.LLILLJJLI;
        if (c16fs3 != null) {
            C786410Ut5.I7(new AbS689S0100000_7(this, 1), c16fs3);
        }
        MR();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19GS c19gs;
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.gk4, viewGroup, false);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(C497740JfY.LIZIZ(16));
        Context context = getContext();
        if (context != null) {
            gradientDrawable.setColor(C20736316Cj.LIZIZ(R.attr.ezl, context));
        }
        viewTd.setBackground(gradientDrawable);
        try {
            ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(viewTd, this);
            viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            } else {
                c19gs = null;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return viewTd;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return viewTd;
        }
    }
}
