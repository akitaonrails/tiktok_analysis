package com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.common.linkmicmatch.fragment;

import X.AbstractC923750a97;
import X.AbstractC929640aIc;
import X.C0GSX;
import X.C0IF8;
import X.C0IL2;
import X.C0JT6;
import X.C0TZM;
import X.C1143680frq;
import X.C1143920fsE;
import X.C1324720kZq;
import X.C1388190mED;
import X.C13BV;
import X.C15438062q;
import X.C19EG;
import X.C19GN;
import X.C19GO;
import X.C20441214yg;
import X.C2188811AlT;
import X.C464330IIt;
import X.C465640INu;
import X.C470590Icr;
import X.C473410IhP;
import X.C497740JfY;
import X.C500980Jkm;
import X.C784440Upu;
import X.C785410UrT;
import X.C786410Ut5;
import X.C915980Zwa;
import X.C920790a4L;
import X.C920830a4P;
import X.C921180a4y;
import X.C923130a87;
import X.C924980aB6;
import X.C925080aBG;
import X.C925640aCA;
import X.C926630aDl;
import X.C927170aEd;
import X.C930920aKg;
import X.C930940aKi;
import X.C942600adW;
import X.C943990afl;
import X.C946150ajF;
import X.C948450amx;
import X.DialogInterfaceOnClickListenerC986970bn5;
import X.EnumC926600aDi;
import X.InterfaceC500100JjM;
import X.InterfaceC921200a50;
import X.InterfaceC934710aQn;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import X.ViewOnClickListenerC1836610xtT;
import Y.ACListenerS150S0100000_15;
import Y.AfS184S0100000_15;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestGuestSelfSendGiftData;
import com.bytedance.android.live.liveinteract.multiguestv3.main.link.PreviewDialogUICtrlCmd;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.common.linkmicmatch.viewmodel.MultiGuestLinkMicMatchViewModel;
import com.bytedance.android.live.liveinteract.multilive.model.MultiGuestRecommendRoomInfo;
import com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicWaitingSizeOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestRecomApplyRoomCountSetting;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserApplyPermission;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserApplySettings;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserSettings;
import com.bytedance.android.livesdk.model.message.LinkMessage;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes16.dex */
public abstract class BaseMultiGuestLinkMicMatchFragment extends LiveDialogFragment implements Parcelable {
    public static final int $stable = 8;
    public C19GN activeModalDialog;
    public int applyCount;
    public AbstractC929640aIc applyPresenter;
    public EnumC926600aDi applyType;
    public int currentIndex;
    public MultiGuestDataHolder dataHolder;
    public C946150ajF goLiveView;
    public WeakReference<AbstractC923750a97> guestPresenter;
    public boolean isClickGoLive;
    public int jumpType;
    public AbstractC929640aIc presenter;
    public PreviewDialogUICtrlCmd previewOptUICtrlCmd;
    public final int recomApplyRoomCount;
    public List<MultiGuestRecommendRoomInfo> roomList;
    public Runnable runnable;
    public long showTime;
    public String source;
    public ViewOnClickListenerC1836610xtT stateView;
    public int triggerType;
    public MultiGuestLinkMicMatchViewModel viewModel;
    public Integer waitingSize;

    public abstract void WR(View view);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public abstract int getLayoutId();

    public void initData() {
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    public abstract void kS();

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
    }

    public final int OR() {
        MultiLiveUserSettings multiLiveUserSettings;
        MultiLiveUserApplySettings multiLiveUserApplySettings;
        MultiLiveUserApplyPermission multiLiveUserApplyPermission;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZIZ;
        MultiGuestDataHolder multiGuestDataHolder = this.dataHolder;
        if (multiGuestDataHolder != null && (multiLiveAnchorPanelSettingsLIZIZ = multiGuestDataHolder.LIZIZ()) != null) {
            return multiLiveAnchorPanelSettingsLIZIZ.applierSortSetting;
        }
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room == null || (multiLiveUserSettings = room.multiLiveUserSettings) == null || (multiLiveUserApplySettings = multiLiveUserSettings.multiLiveUserApplySettings) == null || (multiLiveUserApplyPermission = multiLiveUserApplySettings.multiLiveUserApplyPermission) == null) {
            return 0;
        }
        return (int) multiLiveUserApplyPermission.applierSortSetting;
    }

    public final List<Long> PR() {
        if (this.currentIndex >= this.roomList.size()) {
            return C13BV.INSTANCE;
        }
        int i = this.recomApplyRoomCount;
        if (i <= 1) {
            return Collections.singletonList(Long.valueOf(((MultiGuestRecommendRoomInfo) ListProtector.get(this.roomList, this.currentIndex)).roomId));
        }
        int i2 = this.currentIndex + i;
        int size = this.roomList.size();
        if (i2 > size) {
            i2 = size;
        }
        List<MultiGuestRecommendRoomInfo> listSubList = this.roomList.subList(this.currentIndex, i2);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listSubList, 10));
        Iterator<MultiGuestRecommendRoomInfo> it2 = listSubList.iterator();
        while (it2.hasNext()) {
            arrayList.add(Long.valueOf(it2.next().roomId));
        }
        return arrayList;
    }

    public void cS() {
        C924980aB6.LIZ(this.applyCount, OR(), null, C923130a87.LIZ(this.dataHolder), this.dataChannel, null, null, null, 224);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void gS() {
        /*
            r13 = this;
            java.lang.String r4 = "in_request_panel"
            java.lang.String r5 = "refresh"
            java.util.List<com.bytedance.android.live.liveinteract.multilive.model.MultiGuestRecommendRoomInfo> r1 = r13.roomList
            int r0 = r13.currentIndex
            java.lang.Object r6 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r1, r0)
            com.bytedance.android.live.liveinteract.multilive.model.MultiGuestRecommendRoomInfo r6 = (com.bytedance.android.live.liveinteract.multilive.model.MultiGuestRecommendRoomInfo) r6
            java.lang.Integer r0 = r13.waitingSize
            r3 = 0
            if (r0 == 0) goto L6f
            int r7 = r0.intValue()
        L17:
            long r8 = r13.showTime
            com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.common.linkmicmatch.viewmodel.MultiGuestLinkMicMatchViewModel r1 = r13.viewModel
            r12 = 0
            if (r1 == 0) goto L6d
            java.lang.String r10 = r1.LLILZIL
        L20:
            r2 = 1
            if (r1 == 0) goto L69
            boolean r0 = r1.LLIZ
            r0 = r0 ^ 1
            if (r0 != r2) goto L69
            r11 = 1
        L2a:
            com.bytedance.android.live.liveinteract.multilive.model.LiveGuideCard r0 = r1.LLILZLL
            if (r0 == 0) goto L34
            int r0 = r0.scene
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)
        L34:
            X.C942580adU.LJ(r4, r5, r6, r7, r8, r10, r11, r12)
            int r1 = r13.currentIndex
            java.util.List<com.bytedance.android.live.liveinteract.multilive.model.MultiGuestRecommendRoomInfo> r0 = r13.roomList
            int r0 = r0.size()
            int r0 = r0 - r2
            if (r1 >= r0) goto L66
            int r0 = r13.currentIndex
            int r0 = r0 + 1
            r13.currentIndex = r0
        L48:
            java.lang.Runnable r0 = r13.runnable
            if (r0 != 0) goto L55
            Y.ARunnableS115S0100000_15 r1 = new Y.ARunnableS115S0100000_15
            r0 = 59
            r1.<init>(r13, r0)
            r13.runnable = r1
        L55:
            android.os.Handler r3 = X.C473410IhP.LIZ()
            Y.ARunnableS115S0100000_15 r2 = new Y.ARunnableS115S0100000_15
            r0 = 60
            r2.<init>(r13, r0)
            r0 = 500(0x1f4, double:2.47E-321)
            X.C786410Ut5.LJLIIL(r0, r3, r2)
            return
        L66:
            r13.currentIndex = r3
            goto L48
        L69:
            r11 = 0
            if (r1 == 0) goto L34
            goto L2a
        L6d:
            r10 = r12
            goto L20
        L6f:
            r7 = 0
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.common.linkmicmatch.fragment.BaseMultiGuestLinkMicMatchFragment.gS():void");
    }

    public final void o() {
        C19GN c19gn;
        C19GN c19gn2 = this.activeModalDialog;
        if (c19gn2 != null && c19gn2.isShowing() && (c19gn = this.activeModalDialog) != null) {
            c19gn.dismiss();
            C785410UrT.LIZ(c19gn);
        }
        C19GO c19go = new C19GO(getContext());
        c19go.LJI(2131844676);
        c19go.LIZIZ(2131844677);
        c19go.LJ(2131844675, new DialogInterfaceOnClickListenerC986970bn5(this, 2), false);
        c19go.LIZJ(2131843825, new DialogInterface.OnClickListener() { // from class: X.0adV
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }, false);
        C19GN c19gnLIZ = c19go.LIZ();
        this.activeModalDialog = c19gnLIZ;
        c19gnLIZ.setCanceledOnTouchOutside(false);
        C19GN c19gn3 = this.activeModalDialog;
        if (c19gn3 != null) {
            C926630aDl.LIZ(c19gn3, 5, true, false, false, 120);
        }
        C19GN c19gn4 = this.activeModalDialog;
        if (c19gn4 != null) {
            C786410Ut5.M4(c19gn4);
        }
        bS(this, "show");
    }

    public BaseMultiGuestLinkMicMatchFragment() {
        Object objLJIIIZ = C948450amx.LIZIZ.LJIIIZ("MULTI_GUEST_DATA_HOLDER");
        this.dataHolder = objLJIIIZ instanceof MultiGuestDataHolder ? (MultiGuestDataHolder) objLJIIIZ : null;
        this.source = "permit";
        this.roomList = new ArrayList();
        this.waitingSize = 0;
        this.recomApplyRoomCount = MultiGuestRecomApplyRoomCountSetting.INSTANCE.getValue();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        Integer numValueOf;
        List<LinkPlayerInfo> list;
        List<LinkListUser> listLJI;
        Boolean bool;
        Context context = getContext();
        int iLIZIZ = context != null ? C465640INu.LIZIZ(context) : 0;
        C500980Jkm c500980Jkm = new C500980Jkm(getLayoutId());
        DataChannel dataChannel = this.dataChannel;
        int size = 1;
        boolean zBooleanValue = (dataChannel == null || (bool = (Boolean) dataChannel.gg0(C0TZM.class)) == null) ? true : bool.booleanValue();
        if (LinkMicWaitingSizeOptSetting.INSTANCE.optimize()) {
            InterfaceC921200a50<LinkListUser, LinkMessage> interfaceC921200a50LIZIZ = C921180a4y.LIZIZ();
            if (interfaceC921200a50LIZIZ != null && (listLJI = interfaceC921200a50LIZIZ.LJI()) != null) {
                size = listLJI.size();
            }
            numValueOf = Integer.valueOf(size);
        } else {
            MultiGuestDataHolder multiGuestDataHolder = this.dataHolder;
            if (multiGuestDataHolder == null || (list = multiGuestDataHolder.LJJJ) == null) {
                numValueOf = null;
            } else {
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator<LinkPlayerInfo> it2 = list.iterator();
                while (it2.hasNext()) {
                    it2.next().LIZ = 1;
                    arrayList.add(Unit.LIZ);
                }
                numValueOf = Integer.valueOf(arrayList.size());
            }
        }
        this.waitingSize = numValueOf;
        c500980Jkm.LJII = zBooleanValue ? 80 : 8388629;
        c500980Jkm.LJI = 0.5f;
        c500980Jkm.LJIIIZ = zBooleanValue ? -1 : iLIZIZ;
        if (zBooleanValue) {
            iLIZIZ = -1;
        }
        c500980Jkm.LJIIJ = iLIZIZ;
        if (zBooleanValue) {
            c500980Jkm.LIZJ = R.style.ajr;
            return c500980Jkm;
        }
        c500980Jkm.LIZJ = R.style.ajs;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        if (this.goLiveView != null) {
            if (this.isClickGoLive) {
                InterfaceC934710aQn.Gc.LIZJ(0);
                InterfaceC934710aQn.Hc.LIZJ(new HashSet<>());
            } else if (this.triggerType == 1) {
                Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
                if (room != null) {
                    C0JT6<HashSet<String>> c0jt6 = InterfaceC934710aQn.Hc;
                    HashSet<String> hashSetLIZ = c0jt6.LIZ();
                    if (hashSetLIZ == null) {
                        hashSetLIZ = new HashSet<>();
                    }
                    if (hashSetLIZ.size() <= 3) {
                        hashSetLIZ.add(room.getIdStr());
                        c0jt6.LIZJ(hashSetLIZ);
                    }
                }
            } else {
                C0JT6<Integer> c0jt62 = InterfaceC934710aQn.Gc;
                Integer numLIZ = c0jt62.LIZ();
                c0jt62.LIZJ(Integer.valueOf((numLIZ != null ? numLIZ.intValue() : 0) + 1));
            }
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
        Runnable runnable = this.runnable;
        if (runnable != null) {
            C473410IhP.LIZ().removeCallbacks(runnable);
        }
        this.runnable = null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static String RR(MultiGuestRecommendRoomInfo multiGuestRecommendRoomInfo) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getReasonText: ");
        sbLIZ.append(multiGuestRecommendRoomInfo.recoReason);
        C20441214yg.LIZIZ("BaseMultiGuestLinkMicMatchFragment", C2188811AlT.LIZIZ(sbLIZ));
        String str = multiGuestRecommendRoomInfo.recoReason;
        if (str == null) {
            return "";
        }
        switch (str.hashCode()) {
            case -1268958287:
                if (!str.equals("follow")) {
                    return "";
                }
                return C497740JfY.LJIJI(2131854179);
            case -1266283874:
                if (!str.equals("friend")) {
                    return "";
                }
                return C497740JfY.LJIJI(2131854180);
            case 103501:
                if (!str.equals("hot")) {
                    return "";
                }
                return C497740JfY.LJIJI(2131854183);
            case 3321850:
                if (!str.equals("link")) {
                    return "";
                }
                return C497740JfY.LJIJI(2131854182);
            case 74296567:
                if (!str.equals("friend_guest")) {
                    return "";
                }
                C497740JfY.LJIJI(2131854180);
                return "";
            case 1387894441:
                if (!str.equals("friend_host")) {
                    return "";
                }
                C497740JfY.LJIJI(2131854181);
                return "";
            default:
                return "";
        }
    }

    public static String SR(String str) {
        if (Intrinsics.LJFF(str, "Friend")) {
            return C497740JfY.LJIJI(2131842136);
        }
        if (Intrinsics.LJFF(str, "Following")) {
            return C497740JfY.LJIJI(2131842135);
        }
        return "";
    }

    public static String UR(MultiGuestRecommendRoomInfo multiGuestRecommendRoomInfo) {
        String strLJIIL;
        String strLJIIL2;
        long j = multiGuestRecommendRoomInfo.guestNum;
        if (j <= 1) {
            strLJIIL = C497740JfY.LJIIL(2131755912, 1, Long.valueOf(j));
        } else {
            strLJIIL = C497740JfY.LJIIL(2131755912, 2, Long.valueOf(j));
        }
        if (a0.LJJIIZI(strLJIIL, "{num}", false)) {
            strLJIIL = u.LJJIFFI(strLJIIL, "{num}", String.valueOf(multiGuestRecommendRoomInfo.guestNum), false);
        }
        long j2 = multiGuestRecommendRoomInfo.viewerNum;
        if (j2 <= 1) {
            strLJIIL2 = C497740JfY.LJIIL(2131755913, 1, Long.valueOf(j2));
        } else {
            strLJIIL2 = C497740JfY.LJIIL(2131755913, 2, Long.valueOf(j2));
        }
        if (a0.LJJIIZI(strLJIIL2, "{num}", false)) {
            strLJIIL2 = u.LJJIFFI(strLJIIL2, "{num}", String.valueOf(multiGuestRecommendRoomInfo.guestNum), false);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strLJIIL);
        sbLIZ.append(" · ");
        sbLIZ.append(strLJIIL2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void hS(C0GSX c0gsx) {
        float fLIZIZ = (int) C497740JfY.LIZIZ(2.0f);
        if (C497740JfY.LJJ()) {
            if (c0gsx != null) {
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0gsx);
                c0gsx.setTranslationX((-1.0f) * fLIZIZ);
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0gsx);
                c0gsx.setTranslationY(fLIZIZ);
            } else {
                return;
            }
        } else {
            if (c0gsx == null) {
                return;
            }
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0gsx);
            c0gsx.setTranslationX(fLIZIZ);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0gsx);
            c0gsx.setTranslationY(fLIZIZ);
        }
        c0gsx.LIZ(-1, -1);
    }

    public final void NR(String str) {
        C19EG c19egLIZIZ;
        C943990afl.LIZ().LIZ("multi_guest_guest_preview_page", "other");
        Context context = getContext();
        Long lValueOf = null;
        if (context != null) {
            c19egLIZIZ = C1388190mED.LIZIZ(context);
        } else {
            c19egLIZIZ = null;
        }
        if ((c19egLIZIZ instanceof Activity) && c19egLIZIZ != null) {
            C920830a4P.LIZLLL = "preview_panel";
            boolean z = C925080aBG.LIZ;
            if (this.dataHolder != null) {
                lValueOf = Long.valueOf(r0.LJJJLL);
            }
            C925080aBG.LIZJ(true, 0, c19egLIZIZ, lValueOf, new AwS594S0100000_15(this, 457), null, str);
        }
    }

    public final void ZR(List<Long> list) {
        String str;
        String str2;
        String nickName;
        C927170aEd.LJFF = true;
        C927170aEd.LJI = false;
        if (this.roomList.size() > this.currentIndex && !list.isEmpty()) {
            MultiGuestRecommendRoomInfo multiGuestRecommendRoomInfo = (MultiGuestRecommendRoomInfo) ListProtector.get(this.roomList, this.currentIndex);
            MultiGuestLinkMicMatchViewModel multiGuestLinkMicMatchViewModel = this.viewModel;
            String str3 = null;
            if (multiGuestLinkMicMatchViewModel != null) {
                str = multiGuestLinkMicMatchViewModel.LLILZIL;
            } else {
                str = null;
            }
            C927170aEd.LJIIIIZZ = new C942600adW(multiGuestRecommendRoomInfo, str, this.waitingSize);
            EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
            C0IL2.LIZ.LIZLLL(EnterRoomLinkSession.LJ(enterRoomConfig));
            EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
            roomsData.enterFromMerge = "live_detail";
            roomsData.enterMethod = "recommend_link_room_head";
            enterRoomConfig.mLogData.enterRoomId = ((Number) ListProtector.get(list, 0)).longValue();
            EnterRoomConfig.LogData logData = enterRoomConfig.mLogData;
            MultiGuestLinkMicMatchViewModel multiGuestLinkMicMatchViewModel2 = this.viewModel;
            if (multiGuestLinkMicMatchViewModel2 != null) {
                str2 = multiGuestLinkMicMatchViewModel2.LLILZIL;
            } else {
                str2 = null;
            }
            logData.guestRequestId = str2;
            if (this.recomApplyRoomCount > 1) {
                long jLongValue = ((Number) ListProtector.get(list, 0)).longValue();
                MultiGuestLinkMicMatchViewModel multiGuestLinkMicMatchViewModel3 = this.viewModel;
                if (multiGuestLinkMicMatchViewModel3 != null) {
                    str3 = multiGuestLinkMicMatchViewModel3.LLILZIL;
                }
                enterRoomConfig.mLogData.moreConfig = MR(str3, jLongValue, list, "recommend_link_room_head");
            }
            User user = ((MultiGuestRecommendRoomInfo) ListProtector.get(this.roomList, this.currentIndex)).hostInfo;
            if (user == null || (nickName = user.getNickName()) == null) {
                nickName = "";
            }
            C927170aEd.LJII = nickName;
            C784440Upu.LIZ().LIZIZ(new C0IF8(enterRoomConfig, ((Number) ListProtector.get(list, 0)).longValue()));
            dismissAllowingStateLoss();
        }
    }

    public final void aS(List<Long> list) {
        String str;
        String str2;
        String str3;
        String nickName;
        C927170aEd.LJI = true;
        C927170aEd.LJFF = false;
        if (this.roomList.size() > this.currentIndex && !list.isEmpty()) {
            MultiGuestRecommendRoomInfo multiGuestRecommendRoomInfo = (MultiGuestRecommendRoomInfo) ListProtector.get(this.roomList, this.currentIndex);
            MultiGuestLinkMicMatchViewModel multiGuestLinkMicMatchViewModel = this.viewModel;
            String str4 = null;
            if (multiGuestLinkMicMatchViewModel != null) {
                str = multiGuestLinkMicMatchViewModel.LLILZIL;
            } else {
                str = null;
            }
            C927170aEd.LJIIIIZZ = new C942600adW(multiGuestRecommendRoomInfo, str, this.waitingSize);
            if (this instanceof MultiGuestLinkMicMatchFragmentAuto) {
                str2 = "applyWaitAutoPanel";
            } else {
                str2 = "applyWaitApplyPanel";
            }
            C927170aEd.LJIIIZ = str2;
            EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
            C0IL2.LIZ.LIZLLL(EnterRoomLinkSession.LJ(enterRoomConfig));
            EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
            roomsData.enterFromMerge = "live_detail";
            roomsData.enterMethod = "recommend_link_room_request";
            EnterRoomConfig.LogData logData = enterRoomConfig.mLogData;
            MultiGuestLinkMicMatchViewModel multiGuestLinkMicMatchViewModel2 = this.viewModel;
            if (multiGuestLinkMicMatchViewModel2 != null) {
                str3 = multiGuestLinkMicMatchViewModel2.LLILZIL;
            } else {
                str3 = null;
            }
            logData.guestRequestId = str3;
            logData.enterRoomId = ((Number) ListProtector.get(list, 0)).longValue();
            if (this.recomApplyRoomCount > 1) {
                long jLongValue = ((Number) ListProtector.get(list, 0)).longValue();
                MultiGuestLinkMicMatchViewModel multiGuestLinkMicMatchViewModel3 = this.viewModel;
                if (multiGuestLinkMicMatchViewModel3 != null) {
                    str4 = multiGuestLinkMicMatchViewModel3.LLILZIL;
                }
                enterRoomConfig.mLogData.moreConfig = MR(str4, jLongValue, list, "recommend_link_room_request");
            }
            DataChannelGlobal.LLILZ.JQ2(C930920aKg.class, ListProtector.get(list, 0));
            User user = ((MultiGuestRecommendRoomInfo) ListProtector.get(this.roomList, this.currentIndex)).hostInfo;
            if (user == null || (nickName = user.getNickName()) == null) {
                nickName = "";
            }
            C927170aEd.LJII = nickName;
            C784440Upu.LIZ().LIZIZ(new C0IF8(enterRoomConfig, ((Number) ListProtector.get(list, 0)).longValue()));
            dismissAllowingStateLoss();
        }
    }

    public final void dS(C1324720kZq c1324720kZq) {
        C1143920fsE c1143920fsE = new C1143920fsE();
        c1143920fsE.LJFF = true;
        c1143920fsE.LIZIZ = "tiktok_live_watch_resource_normal_1";
        c1143920fsE.LIZJ = "live_skylight_icon_anim_small_size.webp";
        c1143920fsE.LIZ = c1324720kZq;
        c1143920fsE.LJI = Integer.MAX_VALUE;
        C1143680frq.LJIIIIZZ(c1143920fsE);
    }

    public static void VR(View view, float f) {
        View viewFindViewById = view.findViewById(R.id.i6z);
        View viewFindViewById2 = view.findViewById(R.id.dx4);
        int iLIZIZ = (int) C497740JfY.LIZIZ(f);
        if (viewFindViewById != null) {
            ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = iLIZIZ;
            }
            if (viewFindViewById != null) {
                C786410Ut5.W5(viewFindViewById, layoutParams);
            }
        }
        if (viewFindViewById2 != null) {
            ViewGroup.LayoutParams layoutParams2 = viewFindViewById2.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.height = iLIZIZ;
            }
            if (viewFindViewById2 != null) {
                C786410Ut5.W5(viewFindViewById2, layoutParams2);
            }
        }
    }

    public static void bS(BaseMultiGuestLinkMicMatchFragment baseMultiGuestLinkMicMatchFragment, String str) {
        long jCurrentTimeMillis;
        long jLongValue;
        MultiGuestDataHolder multiGuestDataHolder;
        Long l;
        MultiGuestDataHolder multiGuestDataHolder2 = baseMultiGuestLinkMicMatchFragment.dataHolder;
        if (multiGuestDataHolder2 != null) {
            jCurrentTimeMillis = multiGuestDataHolder2.LJI;
        } else {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        boolean zLJFF = Intrinsics.LJFF(str, "click");
        if (zLJFF) {
            C920790a4L.LIZ("cancelApplyAlert", "disconnectBtn");
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        Integer numValueOf = Integer.valueOf(C921180a4y.LJIIL(C915980Zwa.LJIIIIZZ()));
        int iOR = baseMultiGuestLinkMicMatchFragment.OR();
        MultiGuestDataHolder multiGuestDataHolder3 = baseMultiGuestLinkMicMatchFragment.dataHolder;
        DataChannel dataChannel = baseMultiGuestLinkMicMatchFragment.dataChannel;
        if (dataChannel != null && (l = (Long) dataChannel.gg0(MultiGuestGuestSelfSendGiftData.class)) != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        C925640aCA.LJIIZILJ(str, jCurrentTimeMillis2, 0L, "apply", 0, numValueOf, iOR, 0, C923130a87.LIZIZ(multiGuestDataHolder3, jLongValue), null, null, 1536);
        if (zLJFF && (multiGuestDataHolder = baseMultiGuestLinkMicMatchFragment.dataHolder) != null) {
            multiGuestDataHolder.LJI = System.currentTimeMillis();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void iS(boolean z, boolean z2) {
        Context context;
        View view;
        C946150ajF c946150ajF = this.goLiveView;
        if (c946150ajF == null) {
            ViewOnClickListenerC1836610xtT viewOnClickListenerC1836610xtT = this.stateView;
            if (viewOnClickListenerC1836610xtT == null || (context = viewOnClickListenerC1836610xtT.getContext()) == null) {
                context = getContext();
            }
            if (context != null) {
                C946150ajF c946150ajF2 = new C946150ajF(context, this, z, z2, new AwS594S0100000_15(this, 458));
                this.goLiveView = c946150ajF2;
                c946150ajF2.e0();
                ViewOnClickListenerC1836610xtT viewOnClickListenerC1836610xtT2 = this.stateView;
                if (viewOnClickListenerC1836610xtT2 != null && (view = (View) viewOnClickListenerC1836610xtT2.LL.remove("CONTENT")) != null) {
                    RemoveViewCausedNPEChecker.recordViewRemovedPoint(viewOnClickListenerC1836610xtT2, view);
                    viewOnClickListenerC1836610xtT2.removeView(view);
                }
                ViewOnClickListenerC1836610xtT viewOnClickListenerC1836610xtT3 = this.stateView;
                if (viewOnClickListenerC1836610xtT3 != null) {
                    viewOnClickListenerC1836610xtT3.setContentView(this.goLiveView);
                    return;
                }
                return;
            }
            kS();
            return;
        }
        c946150ajF.e0();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        AbstractC923750a97 abstractC923750a97;
        InterfaceC500100JjM<C470590Icr<MultiLiveGuestInfoList>> interfaceC500100JjMFetchUserListData;
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(R.id.pw6);
        if (viewFindViewById != null) {
            C786410Ut5.I7(new ACListenerS150S0100000_15(this, 135), viewFindViewById);
        }
        WR(view);
        this.showTime = System.currentTimeMillis();
        WeakReference<AbstractC923750a97> weakReference = this.guestPresenter;
        if (weakReference != null && (abstractC923750a97 = weakReference.get()) != null && (interfaceC500100JjMFetchUserListData = abstractC923750a97.fetchUserListData(false)) != null) {
            interfaceC500100JjMFetchUserListData.LIZJ(new AfS184S0100000_15(this, 101));
        }
        this.viewModel = (MultiGuestLinkMicMatchViewModel) new ViewModelProvider(this).get(MultiGuestLinkMicMatchViewModel.class);
        initData();
        setCancelable(false);
    }

    public static ArrayList MR(String str, long j, List list, String str2) {
        if (list != null) {
            list.size();
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                long jLongValue = ((Number) it2.next()).longValue();
                if (jLongValue != j) {
                    Room room = new Room();
                    room.setId(jLongValue);
                    room.setIdStr(String.valueOf(jLongValue));
                    EnterRoomConfig enterRoomConfigLIZJ = C464330IIt.LIZJ(true, room);
                    EnterRoomConfig.RoomsData roomsData = enterRoomConfigLIZJ.mRoomsData;
                    roomsData.roomId = jLongValue;
                    roomsData.enterMethod = str2;
                    roomsData.enterFromMerge = "live_detail";
                    enterRoomConfigLIZJ.mLogData.guestRequestId = str;
                    arrayList.add(enterRoomConfigLIZJ);
                }
            }
            return arrayList;
        }
        return null;
    }
}
