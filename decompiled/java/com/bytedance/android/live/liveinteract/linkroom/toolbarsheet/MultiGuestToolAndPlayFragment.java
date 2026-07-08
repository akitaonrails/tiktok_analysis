package com.bytedance.android.live.liveinteract.linkroom.toolbarsheet;

import X.AbstractC1143290frD;
import X.AbstractC1882307Yv;
import X.AbstractC21673619ry;
import X.C01GW;
import X.C01HZ;
import X.C0DXR;
import X.C0IJT;
import X.C1143300frE;
import X.C1161920gLG;
import X.C11NJ;
import X.C13LP;
import X.C1882207Yu;
import X.C1882407Yw;
import X.C1882507Yx;
import X.C20736316Cj;
import X.C2188811AlT;
import X.C306901Gx;
import X.C307001Gy;
import X.C310501Ih;
import X.C356501Zz;
import X.C452501pT;
import X.C474500IjA;
import X.C475510Ikn;
import X.C497740JfY;
import X.C500260Jjc;
import X.C786410Ut5;
import X.C915900ZwS;
import X.C915980Zwa;
import X.C917520Zz4;
import X.C917810ZzX;
import X.C927600aFK;
import X.C930540aK4;
import X.C930940aKi;
import X.C932160aMg;
import X.C941700ac4;
import X.C942160aco;
import X.C942630adZ;
import X.C942690adf;
import X.C946950akX;
import X.C950220apo;
import X.C986270blx;
import X.C986870bmv;
import X.EnumC499801x6;
import X.EnumC918970a1P;
import X.EnumC919090a1b;
import X.EnumC936960aUQ;
import X.EnumC937290aUx;
import X.EnumC942650adb;
import X.EnumC942670add;
import X.InterfaceC926960aEI;
import X.InterfaceC941720ac6;
import X.InterfaceC954180awC;
import Y.ARunnableS115S0100000_15;
import Y.AsS42S0100000_15;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.ability.LinkMicAbilityManager;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.event.CountDownForAllShowEntryChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.event.CountDownForAllUpdatePlaySettingEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.GuestShowdownUpdatePlaySettingEvent;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.api.logger.service.ILoggerService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.Channel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.datachannel.Event;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.tiktok.kmp.live.socialgamebusinessapi.event.MultiLetsDanceEnableFromCreateChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS250S0000000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class MultiGuestToolAndPlayFragment extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyM6Ji4+JiHELIOSA+ZjEjJiMxKTc/ISo2PGsBPCMnIQI5LDwnHCojJQ49LBUgKDYVOiQrJCo9PA==";
    public boolean LLLF;
    public boolean LLLFF;
    public RecyclerView LLLFFI;
    public FrameLayout LLLFZ;
    public final C11NJ LLJLLL = new C11NJ();
    public final C01GW LLJZ = C930540aK4.LJJIJIL(new AwS559S0100000_15(this, 135));
    public final C01GW LLJZIJLIL = C930540aK4.LJJIJIL(new AwS559S0100000_15(this, 136));
    public final C01GW LLL = C930540aK4.LJJIJIL(new AwS559S0100000_15(this, 134));
    public final Map<Integer, Boolean> LLLI = new LinkedHashMap();
    public final C01GW LLLII = C452501pT.LIZIZ(new AwS559S0100000_15(this, 137));

    public static final class LiveShowIconShowChannel extends Channel<Boolean> {
        public static final int $stable = 8;

        public LiveShowIconShowChannel() {
            super(Boolean.FALSE);
        }
    }

    public static final class ToolAndPlayFragmentCloseEvent extends Event<Unit> {
        public static final int $stable = 8;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        LinkMicAbilityManager.LJIIIZ.getClass();
        InterfaceC941720ac6 interfaceC941720ac6LIZIZ = C941700ac4.LIZIZ();
        if (interfaceC941720ac6LIZIZ != null) {
            interfaceC941720ac6LIZIZ.LJIIJJI((C942690adf) this.LLLII.getValue());
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C01HZ c01hzKi1 = ((ILoggerService) C1161920gLG.LIZJ(ILoggerService.class)).ki1();
        if (c01hzKi1 != null) {
            c01hzKi1.LIZ(EnumC499801x6.PLAYBOOK, C915900ZwS.LIZIZ("tool_and_play"));
        }
        this.LLJLLL.LJ();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final int QM(Context context) {
        return C20736316Cj.LIZIZ(R.attr.c61, context);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        if (!C356501Zz.LIZ(null)) {
            return null;
        }
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZ(1, null);
        return sheetOptions;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        DataChannel dataChannelLJ;
        super.onCreate(bundle);
        if (C986270blx.LIZ() && (dataChannelLJ = C475510Ikn.LJ(this)) != null) {
            dataChannelLJ.FQ2(GuestShowdownUpdatePlaySettingEvent.class);
        }
    }

    public final void uS(RecyclerView recyclerView) {
        LinearLayoutManager linearLayoutManager;
        int iFindFirstVisibleItemPosition;
        int iFindLastVisibleItemPosition;
        C1882507Yx c1882507Yx;
        String str;
        RecyclerView.LayoutManager layoutManager = null;
        if (recyclerView != null) {
            layoutManager = recyclerView.getLayoutManager();
        }
        if (!(layoutManager instanceof GridLayoutManager) || (linearLayoutManager = (LinearLayoutManager) layoutManager) == null || (iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition()) > (iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition())) {
            return;
        }
        while (true) {
            Object obj = ((LinkedHashMap) this.LLLI).get(Integer.valueOf(iFindFirstVisibleItemPosition));
            Boolean bool = Boolean.TRUE;
            if (!Intrinsics.LJFF(obj, bool)) {
                this.LLLI.put(Integer.valueOf(iFindFirstVisibleItemPosition), bool);
                AbstractC1882307Yv abstractC1882307Yv = (AbstractC1882307Yv) C13LP.LJJJLZIJ(iFindFirstVisibleItemPosition, ((C942630adZ) this.LLL.getValue()).LLILLL);
                if ((abstractC1882307Yv instanceof C1882507Yx) && (c1882507Yx = (C1882507Yx) abstractC1882307Yv) != null) {
                    if (Intrinsics.LJFF(c1882507Yx.LIZIZ, "live_show")) {
                        if (C930540aK4.LIZJ() || (str = (String) this.LLJZ.getValue()) == null) {
                            str = "";
                        }
                        Map mapLIZJ = C306901Gx.LIZJ();
                        if (str.length() > 0) {
                            mapLIZJ.put("show_entrance", str);
                        }
                        C306901Gx.LJIL("livesdk_anchor_multiguest_liveshow_icon_show", mapLIZJ);
                        C932160aMg.LJFF(EnumC936960aUQ.LIVE_SHOW, "show", EnumC937290aUx.MULTI_TOOL, false, 0);
                    } else {
                        C932160aMg.LJI(c1882507Yx.LIZIZ, "show", EnumC937290aUx.MULTI_TOOL);
                        if (Intrinsics.LJFF(c1882507Yx.LIZIZ, "lets_dance")) {
                            C946950akX.LIZJ("funkit");
                        }
                    }
                }
            }
            if (iFindFirstVisibleItemPosition != iFindLastVisibleItemPosition) {
                iFindFirstVisibleItemPosition++;
            } else {
                return;
            }
        }
    }

    public final void wS(String str) {
        DataChannel dataChannelLJ;
        Boolean boolValueOf;
        Boolean boolValueOf2;
        Boolean boolValueOf3;
        DataChannel dataChannelLJ2;
        Boolean boolValueOf4;
        C1143300frE c1143300frELJIIJJI = C1143300frE.LJIIJJI();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateItems=");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1143300frELJIIJJI.getClass();
        AbstractC1143290frD.LIZ("MultiGuestToolAndPlayFragment", strLIZIZ);
        ArrayList arrayList = new ArrayList();
        if (C930540aK4.LIZJ()) {
            arrayList.add(new C1882207Yu(C497740JfY.LJIJI(2131853924)));
            arrayList.add(new C1882407Yw(EnumC942670add.NOTICEBOARD));
            if (!this.LLLFF) {
                ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).BT1(EnumC937290aUx.MULTI_TOOL, false, EnumC919090a1b.SHOW, false);
                this.LLLFF = true;
            }
        }
        DataChannel dataChannelLJ3 = C475510Ikn.LJ(this);
        if ((dataChannelLJ3 != null && Intrinsics.LJFF(dataChannelLJ3.gg0(LiveShowIconShowChannel.class), Boolean.TRUE)) || (((dataChannelLJ = C475510Ikn.LJ(this)) != null && Intrinsics.LJFF(dataChannelLJ.gg0(CountDownForAllShowEntryChannel.class), Boolean.TRUE) && C930540aK4.LIZJ()) || C950220apo.LJI())) {
            arrayList.add(new C1882207Yu(C497740JfY.LJIJI(2131853921)));
        }
        Boolean boolValueOf5 = null;
        if (C942160aco.LIZ() && (dataChannelLJ2 = C475510Ikn.LJ(this)) != null && Intrinsics.LJFF(dataChannelLJ2.gg0(MultiLetsDanceEnableFromCreateChannel.class), Boolean.TRUE) && !C917810ZzX.LJII()) {
            EnumC942650adb enumC942650adb = EnumC942650adb.LETS_DANCE;
            LinkMicAbilityManager.LJIIIZ.getClass();
            InterfaceC926960aEI interfaceC926960aEILIZJ = C941700ac4.LIZJ();
            if (interfaceC926960aEILIZJ != null) {
                boolValueOf4 = Boolean.valueOf(interfaceC926960aEILIZJ.LJIIZILJ("lets_dance"));
            } else {
                boolValueOf4 = null;
            }
            arrayList.add(new C1882507Yx(enumC942650adb, "lets_dance", C500260Jjc.LJJJI(boolValueOf4)));
        }
        if (C950220apo.LJI()) {
            EnumC942650adb enumC942650adb2 = EnumC942650adb.GUEST_SHOWDOWN;
            LinkMicAbilityManager.LJIIIZ.getClass();
            InterfaceC926960aEI interfaceC926960aEILIZJ2 = C941700ac4.LIZJ();
            if (interfaceC926960aEILIZJ2 != null) {
                boolValueOf3 = Boolean.valueOf(interfaceC926960aEILIZJ2.LJIIZILJ("guest_showdown"));
            } else {
                boolValueOf3 = null;
            }
            arrayList.add(new C1882507Yx(enumC942650adb2, "guest_showdown", C500260Jjc.LJJJI(boolValueOf3)));
        }
        DataChannel dataChannelLJ4 = C475510Ikn.LJ(this);
        if ((dataChannelLJ4 != null && Intrinsics.LJFF(dataChannelLJ4.gg0(LiveShowIconShowChannel.class), Boolean.TRUE)) || C950220apo.LJI()) {
            EnumC942650adb enumC942650adb3 = EnumC942650adb.LIVE_SHOW;
            LinkMicAbilityManager.LJIIIZ.getClass();
            InterfaceC926960aEI interfaceC926960aEILIZJ3 = C941700ac4.LIZJ();
            if (interfaceC926960aEILIZJ3 != null) {
                boolValueOf2 = Boolean.valueOf(interfaceC926960aEILIZJ3.LJIIZILJ("live_show"));
            } else {
                boolValueOf2 = null;
            }
            arrayList.add(new C1882507Yx(enumC942650adb3, "live_show", C500260Jjc.LJJJI(boolValueOf2)));
        }
        DataChannel dataChannelLJ5 = C475510Ikn.LJ(this);
        if ((dataChannelLJ5 == null || !Intrinsics.LJFF(dataChannelLJ5.gg0(CountDownForAllShowEntryChannel.class), Boolean.TRUE) || !C930540aK4.LIZJ()) && !C950220apo.LJI()) {
            this.LLLF = false;
        } else {
            if (!this.LLLF) {
                C310501Ih.LIZJ("show");
                this.LLLF = true;
            }
            EnumC942650adb enumC942650adb4 = EnumC942650adb.COUNT_DOWN_FOR_ALL;
            LinkMicAbilityManager.LJIIIZ.getClass();
            InterfaceC926960aEI interfaceC926960aEILIZJ4 = C941700ac4.LIZJ();
            if (interfaceC926960aEILIZJ4 != null) {
                boolValueOf = Boolean.valueOf(interfaceC926960aEILIZJ4.LJIIZILJ("count_down_for_all"));
            } else {
                boolValueOf = null;
            }
            arrayList.add(new C1882507Yx(enumC942650adb4, "count_down_for_all", C500260Jjc.LJJJI(boolValueOf)));
        }
        if (C356501Zz.LIZ(null) && C950220apo.LJI()) {
            EnumC942650adb enumC942650adb5 = EnumC942650adb.TOP_GUEST;
            LinkMicAbilityManager.LJIIIZ.getClass();
            InterfaceC926960aEI interfaceC926960aEILIZJ5 = C941700ac4.LIZJ();
            if (interfaceC926960aEILIZJ5 != null) {
                boolValueOf5 = Boolean.valueOf(interfaceC926960aEILIZJ5.LJIIZILJ("top_guests"));
            }
            arrayList.add(new C1882507Yx(enumC942650adb5, "top_guests", C500260Jjc.LJJJI(boolValueOf5)));
        }
        if (arrayList.isEmpty()) {
            close(1);
            return;
        }
        ((C942630adZ) this.LLL.getValue()).LLILLL = arrayList;
        ((AbstractC21673619ry) this.LLL.getValue()).notifyDataSetChanged();
        RecyclerView recyclerView = this.LLLFFI;
        if (recyclerView == null) {
            return;
        }
        HandlerHook.viewPost(recyclerView, new ARunnableS115S0100000_15(this, 31));
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String idStr;
        Long lValueOf;
        int size;
        boolean z;
        Object obj;
        DataChannel dataChannelLJ;
        FrameLayout frameLayout;
        DataChannel dataChannelLJ2;
        List<LinkUser> listLIZLLL;
        super.onViewCreated(view, bundle);
        C01HZ c01hzKi1 = ((ILoggerService) C1161920gLG.LIZJ(ILoggerService.class)).ki1();
        if (c01hzKi1 != null) {
            c01hzKi1.LIZIZ(EnumC499801x6.PLAYBOOK, C915900ZwS.LIZIZ("tool_and_play"), null);
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_multi_anchor_funkit_panel_show");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        Room room = (Room) dataChannelGlobal.gg0(C930940aKi.class);
        Object obj2 = "";
        if (room == null || (idStr = room.getIdStr()) == null) {
            idStr = "";
        }
        linkedHashMap.put("room_id", idStr);
        Room room2 = (Room) dataChannelGlobal.gg0(C930940aKi.class);
        if (room2 != null) {
            lValueOf = Long.valueOf(room2.getOwnerUserId());
        } else {
            lValueOf = null;
        }
        linkedHashMap.put("anchor_id", String.valueOf(lValueOf));
        List<String> listZP2 = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).ZP2();
        if (listZP2 != null) {
            int size2 = listZP2.size();
            linkedHashMap.put("guest_cnt", String.valueOf(size2));
            if (size2 > 0) {
                linkedHashMap.put("link_id_list", C13LP.LJJLIIIJ(listZP2, ",", null, null, 0, null, null, 62));
            }
        }
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL != null && (listLIZLLL = interfaceC954180awCLLJLL.LIZLLL()) != null) {
            size = listLIZLLL.size();
        } else {
            size = 1;
        }
        if (size - 1 > 0) {
            z = true;
        } else {
            z = false;
        }
        String str = "1";
        if (z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_guest_connection", obj);
        C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
        C307001Gy.LIZ().getClass();
        EnumC918970a1P enumC918970a1PLJII = C927600aFK.LJII();
        linkedHashMap.put("window_setting", C917520Zz4.LJII(enumC918970a1PLJII).getSecond());
        linkedHashMap.put("layout_setting", C917520Zz4.LJII(enumC918970a1PLJII).getFirst());
        linkedHashMap.put("layout_id", C917520Zz4.LIZJ());
        Object value = this.LLJZIJLIL.getValue();
        if (value != null) {
            obj2 = value;
        }
        linkedHashMap.put("from_page", obj2);
        if (C930540aK4.LIZJ()) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_multi_guest_moderator", str);
        ArrayList arrayList = new ArrayList();
        if (C942160aco.LIZ() && (dataChannelLJ2 = C475510Ikn.LJ(this)) != null && Intrinsics.LJFF(dataChannelLJ2.gg0(MultiLetsDanceEnableFromCreateChannel.class), Boolean.TRUE) && !C917810ZzX.LJII()) {
            arrayList.add(EnumC936960aUQ.LETS_DANCE);
        }
        if (C930540aK4.LIZJ()) {
            arrayList.add(EnumC936960aUQ.NOTICE_BOARD);
        }
        if (C950220apo.LJI()) {
            arrayList.add(EnumC936960aUQ.GUEST_SHOWDOWN);
        }
        DataChannel dataChannelLJ3 = C475510Ikn.LJ(this);
        if (dataChannelLJ3 != null && Intrinsics.LJFF(dataChannelLJ3.gg0(LiveShowIconShowChannel.class), Boolean.TRUE)) {
            arrayList.add(EnumC936960aUQ.LIVE_SHOW);
        }
        DataChannel dataChannelLJ4 = C475510Ikn.LJ(this);
        if (dataChannelLJ4 != null && Intrinsics.LJFF(dataChannelLJ4.gg0(CountDownForAllShowEntryChannel.class), Boolean.TRUE) && C930540aK4.LIZJ()) {
            arrayList.add(EnumC936960aUQ.COUNTDOWN_FOR_ALL);
        }
        if (C356501Zz.LIZ(null)) {
            arrayList.add(EnumC936960aUQ.TOP_GUEST);
        }
        linkedHashMap.put("tool_list", C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, AFwS250S0000000_15.get$arr$(267), 30));
        c474500IjALIZ.LJJIIZI(linkedHashMap);
        c474500IjALIZ.LIZ();
        this.LLLFZ = (FrameLayout) view.findViewById(R.id.oad);
        if (!C356501Zz.LIZ(null) && (frameLayout = this.LLLFZ) != null) {
            frameLayout.setPadding(0, 0, 0, (int) C497740JfY.LIZIZ(50.0f));
        }
        this.LLLFFI = (RecyclerView) view.findViewById(R.id.txi);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2);
        RecyclerView recyclerView = this.LLLFFI;
        if (recyclerView != null) {
            recyclerView.setAdapter((AbstractC21673619ry) this.LLL.getValue());
        }
        RecyclerView recyclerView2 = this.LLLFFI;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(gridLayoutManager);
        }
        gridLayoutManager.LLIZ = new C986870bmv(this, 1);
        RecyclerView recyclerView3 = this.LLLFFI;
        if (recyclerView3 != null) {
            recyclerView3.addItemDecoration(new C0DXR() { // from class: X.0adq
                @Override // X.C0DXR
                public final void LIZIZ(Rect rect, View view2, RecyclerView recyclerView4, C21673919s1 c21673919s1) {
                    Integer numValueOf;
                    int childAdapterPosition = recyclerView4.getChildAdapterPosition(view2);
                    AbstractC21673619ry adapter = recyclerView4.getAdapter();
                    if (adapter != null && (numValueOf = Integer.valueOf(adapter.getItemViewType(childAdapterPosition))) != null && numValueOf.intValue() != 0 && numValueOf.intValue() == 1) {
                        rect.left = (int) C497740JfY.LIZIZ(12.0f);
                        if (childAdapterPosition % 2 == 0) {
                            rect.right = (int) C497740JfY.LIZIZ(12.0f);
                        }
                        if (childAdapterPosition >= 3) {
                            rect.top = (int) C497740JfY.LIZIZ(12.0f);
                        }
                    }
                }
            });
        }
        RecyclerView recyclerView4 = this.LLLFFI;
        if (recyclerView4 != null) {
            recyclerView4.addOnScrollListener(new AsS42S0100000_15(this, 1));
        }
        LinkMicAbilityManager.LJIIIZ.getClass();
        InterfaceC941720ac6 interfaceC941720ac6LIZIZ = C941700ac4.LIZIZ();
        if (interfaceC941720ac6LIZIZ != null) {
            interfaceC941720ac6LIZIZ.LIZ((C942690adf) this.LLLII.getValue());
        }
        DataChannel dataChannelLJ5 = C475510Ikn.LJ(this);
        if (dataChannelLJ5 != null && Intrinsics.LJFF(dataChannelLJ5.gg0(CountDownForAllShowEntryChannel.class), Boolean.TRUE) && (dataChannelLJ = C475510Ikn.LJ(this)) != null) {
            dataChannelLJ.FQ2(CountDownForAllUpdatePlaySettingEvent.class);
        }
        wS("onViewCreated");
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.hdu, viewGroup, false);
    }
}
