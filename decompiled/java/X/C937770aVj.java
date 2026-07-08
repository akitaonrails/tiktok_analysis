package X;

import Y.ARunnableS84S0200000_15;
import Y.AcS496S0100000_15;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.liveinteract.api.RequestSettingSuccessEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.MultiGuestV3VideoSizeChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.MultiGuestV3VideoViewRealSizeChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.AutoOpenGuestApplyDialogEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestAddEmptySeatStatus;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestGetGuestCameraStatusFromServerEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestGuestSelfSendGiftData;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.GuestApplyEvent;
import com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList;
import com.bytedance.android.live.room.MultiLiveUIChangeEvent;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.BugFixApplyViewDataHolderEmptySetting;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserApplyPermission;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserApplySettings;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserSettings;
import com.bytedance.android.livesdk.model.message.LinkMessage;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.Intrinsics;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: renamed from: X.0aVj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C937770aVj {
    public final DataChannel LIZ;
    public final FrameLayout LIZIZ;
    public TextView LIZJ;
    public LiveDialog LJ;
    public final C937790aVl LJII;

    @InterfaceC948490an1(name = "MULTI_GUEST_DATA_HOLDER", nullable = true)
    public MultiGuestDataHolder dataHolder;

    @InterfaceC948490an1(name = "MULTI_GUEST_DATA_HOLDER", nullable = true)
    public MultiGuestDataHolder mDataHolder;
    public final int LIZLLL = (int) C497740JfY.LIZIZ(4.0f);
    public int LJFF = 720;
    public int LJI = 720;

    public final void LIZJ() {
        InterfaceC921620a5g interfaceC921620a5g;
        TextView textView = this.LIZJ;
        if (textView != null) {
            C930540aK4.LJJIJL(textView);
        }
        this.LIZJ = null;
        LiveDialog liveDialog = this.LJ;
        if (liveDialog != null && liveDialog.isShowing()) {
            liveDialog.dismiss();
            C785410UrT.LIZ(liveDialog);
        }
        DataChannel dataChannel = this.LIZ;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
        Object objLJIIIZ = C948450amx.LIZIZ.LJIIIZ("MULTI_GUEST_V3_GUEST_USER_MANAGER");
        if (!(objLJIIIZ instanceof InterfaceC917640ZzG) || (interfaceC921620a5g = (InterfaceC921620a5g) objLJIIIZ) == null) {
            return;
        }
        interfaceC921620a5g.LJJIIJ(this.LJII);
    }

    public final Drawable LJFF() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        FrameLayout frameLayout = this.LIZIZ;
        if (frameLayout != null) {
            gradientDrawable.setColor(C20736316Cj.LIZIZ(R.attr.c5m, frameLayout.getContext()));
        }
        gradientDrawable.setCornerRadius(LJI());
        return gradientDrawable;
    }

    public final float LJI() {
        List<InterfaceC937840aVq> allLayoutWindows;
        InterfaceC937840aVq interfaceC937840aVqLIZLLL;
        Integer numValueOf;
        List list;
        C915830ZwL shapeDescriptor;
        InterfaceC940060aZQ interfaceC940060aZQ;
        C942080acg c942080acgLJLJI;
        C947470alN c947470alN;
        if (!LivesdkLinkmicFloatWindowOptimizeSetting.INSTANCE.isV0(false)) {
            return (this.LJI * 8.0f) / this.LJFF;
        }
        if (C917910Zzh.LIZ(false)) {
            if (C931790aM5.LIZIZ()) {
                InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
                InterfaceC937900aVw interfaceC937900aVwLLIIJLIL = interfaceC954180awCLLJLL != null ? interfaceC954180awCLLJLL.LLIIJLIL() : null;
                if (!(interfaceC937900aVwLLIIJLIL instanceof InterfaceC940060aZQ) || (interfaceC940060aZQ = (InterfaceC940060aZQ) interfaceC937900aVwLLIIJLIL) == null || (c942080acgLJLJI = interfaceC940060aZQ.LJLJI()) == null || (c947470alN = c942080acgLJLJI.LIZ) == null || (list = c947470alN.LIZLLL) == null) {
                    list = C13BV.INSTANCE;
                }
                C957020b0m c957020b0mLJ = LJ(list);
                if (c957020b0mLJ != null && (shapeDescriptor = c957020b0mLJ.getShapeDescriptor()) != null) {
                    return shapeDescriptor.LIZIZ;
                }
            } else {
                InterfaceC937820aVo interfaceC937820aVoLJII = LJII();
                if (interfaceC937820aVoLJII != null && (allLayoutWindows = interfaceC937820aVoLJII.getAllLayoutWindows()) != null && (interfaceC937840aVqLIZLLL = LIZLLL(allLayoutWindows)) != null && (numValueOf = Integer.valueOf(interfaceC937840aVqLIZLLL.getCornerRadius())) != null) {
                    return numValueOf.intValue();
                }
            }
        }
        return (int) C497740JfY.LIZIZ(2.0f);
    }

    public final MultiGuestDataHolder LJIIIZ() {
        MultiGuestDataHolder multiGuestDataHolder = this.mDataHolder;
        if (multiGuestDataHolder != null) {
            return multiGuestDataHolder;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIIJ() {
        Integer num;
        Integer numValueOf;
        Room room;
        MultiLiveUserSettings multiLiveUserSettings;
        MultiLiveUserApplySettings multiLiveUserApplySettings;
        MultiLiveUserApplyPermission multiLiveUserApplyPermission;
        DataChannel dataChannel;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZIZ;
        Room room2;
        User owner;
        FollowInfo followInfo;
        C925600aC6.LIZ = "black_button";
        DataChannel dataChannel2 = this.LIZ;
        C925640aCA.LJIJJ("black_button", (dataChannel2 == null || (room2 = (Room) dataChannel2.gg0(RoomChannel.class)) == null || (owner = room2.getOwner()) == null || (followInfo = owner.getFollowInfo()) == null) ? 0L : followInfo.getFollowStatus(), false, C925640aCA.LJFF(C924810aAp.LJ().LJJII), this.LIZ, "liveHome", "blackBtn");
        TextView textView = this.LIZJ;
        if (Intrinsics.LJFF(textView != null ? textView.getText() : null, C497740JfY.LJIJI(2131840602)) || ((num = (Integer) C924790aAn.LIZLLL().LIZIZ) != null && num.intValue() == 1)) {
            LiveDialog liveDialog = this.LJ;
            if (liveDialog != null && liveDialog.isShowing()) {
                liveDialog.dismiss();
                C785410UrT.LIZ(liveDialog);
            }
            FrameLayout frameLayout = this.LIZIZ;
            if (frameLayout != null) {
                C782110Um9 c782110Um9 = new C782110Um9(frameLayout.getContext());
                c782110Um9.LJIIZILJ(2131844676);
                c782110Um9.LJII(2131844677);
                c782110Um9.LJIILIIL(2131844675, new AcS496S0100000_15(this, 47));
                c782110Um9.LJIIJ(2131843825, new InterfaceC743640TFa() { // from class: X.0aVm
                    @Override // X.InterfaceC743640TFa
                    public final void LIZ(LiveDialog liveDialog2) {
                        liveDialog2.dismiss();
                    }
                });
                LiveDialog liveDialogLIZ = c782110Um9.LIZ();
                this.LJ = liveDialogLIZ;
                C786410Ut5.E4(liveDialogLIZ);
                LJIILL("show");
                if (!BugFixApplyViewDataHolderEmptySetting.INSTANCE.isEnable()) {
                    LJIIIZ().LJJJLL = -1;
                    return;
                }
                MultiGuestDataHolder multiGuestDataHolder = this.dataHolder;
                if (multiGuestDataHolder != null) {
                    multiGuestDataHolder.LJJJLL = -1;
                    return;
                }
                return;
            }
            return;
        }
        C943990afl.LIZ().LIZ("multi_guest_apply_page", "quick_apply_icon");
        Integer num2 = (Integer) C924790aAn.LIZLLL().LIZIZ;
        if ((num2 == null || num2.intValue() != 2) && LJIIIIZZ() != 5) {
            DataChannel dataChannel3 = this.LIZ;
            if (dataChannel3 != null) {
                dataChannel3.FQ2(MultiGuestGetGuestCameraStatusFromServerEvent.class);
            }
            DataChannel dataChannel4 = this.LIZ;
            if (dataChannel4 != null) {
                dataChannel4.LC0(GuestApplyEvent.class, new C925770aCN(-1, 0, 0, false, 0, false, 0, 0L, null, 0L, null, 8186));
            }
            if (!C922760a7W.LIZLLL() || C930540aK4.LJJIJ()) {
                return;
            }
            if (!BugFixApplyViewDataHolderEmptySetting.INSTANCE.isEnable()) {
                MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZIZ2 = LJIIIZ().LIZIZ();
                if (multiLiveAnchorPanelSettingsLIZIZ2 != null) {
                    numValueOf = Integer.valueOf(multiLiveAnchorPanelSettingsLIZIZ2.applierSortSetting);
                    if (numValueOf == null) {
                    }
                }
                room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
                if (room != null) {
                    return;
                } else {
                    return;
                }
            }
            MultiGuestDataHolder multiGuestDataHolder2 = this.dataHolder;
            if (multiGuestDataHolder2 != null && (multiLiveAnchorPanelSettingsLIZIZ = multiGuestDataHolder2.LIZIZ()) != null) {
                numValueOf = Integer.valueOf(multiLiveAnchorPanelSettingsLIZIZ.applierSortSetting);
                if (numValueOf == null) {
                }
            }
            room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
            if (room != null || (multiLiveUserSettings = room.multiLiveUserSettings) == null || (multiLiveUserApplySettings = multiLiveUserSettings.multiLiveUserApplySettings) == null || (multiLiveUserApplyPermission = multiLiveUserApplySettings.multiLiveUserApplyPermission) == null || (numValueOf = Integer.valueOf((int) multiLiveUserApplyPermission.applierSortSetting)) == null) {
                return;
            }
            if (numValueOf.intValue() != 1 || (dataChannel = this.LIZ) == null) {
                return;
            }
            dataChannel.FQ2(AutoOpenGuestApplyDialogEvent.class);
        }
    }

    public final int LJIIJJI() {
        if (!BugFixApplyViewDataHolderEmptySetting.INSTANCE.isEnable()) {
            return !LJIIIZ().LJJIII ? 2131840602 : 2131843403;
        }
        MultiGuestDataHolder multiGuestDataHolder = this.dataHolder;
        return (multiGuestDataHolder == null || multiGuestDataHolder.LJJIII) ? 2131843403 : 2131840602;
    }

    public final void LJIJI() {
        TextView textView = this.LIZJ;
        if (textView != null) {
            textView.setTextSize(textView.getLineCount() >= 3 ? 10.0f : 12.0f);
        }
    }

    public static InterfaceC937820aVo LJII() {
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL;
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL == null || (interfaceC937900aVwLLIIJLIL = interfaceC954180awCLLJLL.LLIIJLIL()) == null) {
            return null;
        }
        return interfaceC937900aVwLLIIJLIL.LJJJJZ();
    }

    public static int LJIIIIZZ() {
        return C921180a4y.LJIIJJI(C915980Zwa.LJIIIIZZ());
    }

    public static boolean LJIILIIL() {
        List<InterfaceC937840aVq> allLayoutWindows;
        PosIdentity posIdentity;
        if (C931790aM5.LIZIZ()) {
            List<C957020b0m> listLJIIIZ = C940770aaZ.LIZ().getDataSource().LJIIIZ();
            if (listLJIIIZ.size() < 2) {
                return false;
            }
            for (C957020b0m c957020b0m : listLJIIIZ) {
                C957020b0m c957020b0m2 = c957020b0m;
                if (!c957020b0m2.LLJIJIL && ((posIdentity = c957020b0m2.getPosIdentity()) == null || posIdentity.type != 0)) {
                    if (c957020b0m == null) {
                        return false;
                    }
                    int size = listLJIIIZ.size() - 1;
                    C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
                    C307001Gy.LIZ().getClass();
                    return size < C927600aFK.LJIIJJI();
                }
            }
            return false;
        }
        InterfaceC937820aVo interfaceC937820aVoLJII = LJII();
        if (interfaceC937820aVoLJII == null || (allLayoutWindows = interfaceC937820aVoLJII.getAllLayoutWindows()) == null) {
            allLayoutWindows = C13BV.INSTANCE;
        }
        if (allLayoutWindows.size() < 2) {
            return false;
        }
        for (InterfaceC937840aVq interfaceC937840aVq : allLayoutWindows) {
            InterfaceC937840aVq interfaceC937840aVq2 = interfaceC937840aVq;
            if (!interfaceC937840aVq2.LIZJ() && C1533950q1J.LJ(interfaceC937840aVq2.LJ())) {
                if (interfaceC937840aVq == null) {
                    return false;
                }
                int size2 = allLayoutWindows.size() - 1;
                C01GW<C927600aFK> c01gw2 = C927600aFK.LIZIZ;
                C307001Gy.LIZ().getClass();
                return size2 < C927600aFK.LJIIJJI();
            }
        }
        return false;
    }

    public static boolean LJIILJJIL() {
        List<InterfaceC937840aVq> allLayoutWindows;
        if (C931790aM5.LIZIZ()) {
            Iterator<C957020b0m> it2 = C940770aaZ.LIZ().getDataSource().LJIIIZ().iterator();
            while (it2.hasNext()) {
                C957020b0m next = it2.next();
                if (next.LLJILJIL) {
                    return next != null;
                }
            }
            return false;
        }
        InterfaceC937820aVo interfaceC937820aVoLJII = LJII();
        if (interfaceC937820aVoLJII == null || (allLayoutWindows = interfaceC937820aVoLJII.getAllLayoutWindows()) == null) {
            allLayoutWindows = C13BV.INSTANCE;
        }
        String strLJIIJ = C921180a4y.LJIIJ(C915980Zwa.LJIIIIZZ());
        if ((allLayoutWindows instanceof Collection) && allLayoutWindows.isEmpty()) {
            return false;
        }
        Iterator<InterfaceC937840aVq> it3 = allLayoutWindows.iterator();
        while (it3.hasNext()) {
            if (Intrinsics.LJFF(it3.next().LJ(), strLJIIJ)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean LIZIZ() {
        boolean z = !C931790aM5.LIZIZ() ? LJII() == null : C940770aaZ.LIZ().getDataSource().LJJIIZ();
        if (C925150aBN.LJJIL(false, true, 1) || LJIIIIZZ() == 5) {
            return false;
        }
        Integer num = (Integer) C924790aAn.LIZLLL().LIZIZ;
        if ((num != null && num.intValue() == 2) || LJIILJJIL() || C500260Jjc.LJIIZILJ(this.LIZ)) {
            return false;
        }
        C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
        C307001Gy.LIZ().getClass();
        if (C927600aFK.LJII() != EnumC918970a1P.FLOATING || !z || !LJIILIIL()) {
            return false;
        }
        DataChannel dataChannel = this.LIZ;
        return dataChannel == null || !Intrinsics.LJFF(dataChannel.gg0(MultiGuestAddEmptySeatStatus.class), Boolean.TRUE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int LJIIL() {
        Integer num;
        if (LJIIIIZZ() == 0 && LJIIIIZZ() == 1) {
            return 2131843403;
        }
        if ((LJIIIIZZ() == 2 && !LJIILJJIL()) || ((num = (Integer) C924790aAn.LIZLLL().LIZIZ) != null && num.intValue() == 1)) {
            return LJIIJJI();
        }
        if (!LJIILJJIL()) {
            return 2131843403;
        }
        LJIILLIIL(false);
        return LJIIJJI();
    }

    public final void LJIJ() {
        DataChannel dataChannel;
        EnumC934000aPe enumC934000aPeLIZIZ;
        if (!C931790aM5.LIZIZ() || (dataChannel = this.LIZ) == null || (enumC934000aPeLIZIZ = C937310aUz.LIZIZ(dataChannel)) == null) {
            return;
        }
        EnumC934000aPe enumC934000aPe = EnumC934000aPe.AUDIENCE;
        if (enumC934000aPeLIZIZ == enumC934000aPe || enumC934000aPeLIZIZ == EnumC934000aPe.GUEST) {
            LJIIZILJ(enumC934000aPeLIZIZ == enumC934000aPe);
        }
    }

    public static InterfaceC937840aVq LIZLLL(List list) {
        Object next;
        Iterator it2 = list.iterator();
        Object next2 = null;
        if (!it2.hasNext()) {
            next = null;
        } else {
            next = it2.next();
            if (it2.hasNext()) {
                int iWidth = ((InterfaceC937840aVq) next).LJIIL().width();
                do {
                    Object next3 = it2.next();
                    int iWidth2 = ((InterfaceC937840aVq) next3).LJIIL().width();
                    if (iWidth < iWidth2) {
                        next = next3;
                        iWidth = iWidth2;
                    }
                } while (it2.hasNext());
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!Intrinsics.LJFF(obj, next)) {
                arrayList.add(obj);
            }
        }
        Iterator it3 = arrayList.iterator();
        if (it3.hasNext()) {
            next2 = it3.next();
            if (it3.hasNext()) {
                int i = ((InterfaceC937840aVq) next2).LJIIL().top;
                do {
                    Object next4 = it3.next();
                    int i2 = ((InterfaceC937840aVq) next4).LJIIL().top;
                    if (i > i2) {
                        next2 = next4;
                        i = i2;
                    }
                } while (it3.hasNext());
            }
        }
        return (InterfaceC937840aVq) next2;
    }

    public static C957020b0m LJ(List list) {
        Object obj;
        Iterator it2 = list.iterator();
        while (true) {
            obj = null;
            str = null;
            str = null;
            String str = null;
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            C465260IMi c465260IMi = C939890aZ9.LIZ;
            try {
                String strOptString = JSONObjectProtectorUtils.getJSONObject(C939890aZ9.LIZ(), "apply_float_button_align").optString(((C957020b0m) next).getIdentity());
                if (strOptString != null && strOptString.length() != 0) {
                    str = strOptString;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("shouldAddFloatButton error=");
                sbLIZ.append(e.getMessage());
                C937310aUz.LJFF("LayoutBizConfigController", C2188811AlT.LIZIZ(sbLIZ));
            }
            if (C500260Jjc.LJJIIZ(str)) {
                obj = next;
                break;
            }
        }
        return (C957020b0m) obj;
    }

    public final void LJIILL(String str) {
        Long lValueOf;
        long jCurrentTimeMillis;
        MultiGuestDataHolder multiGuestDataHolderLJIIIZ;
        long jLongValue;
        Long l;
        C925600aC6.LIZ = "black_button";
        BugFixApplyViewDataHolderEmptySetting bugFixApplyViewDataHolderEmptySetting = BugFixApplyViewDataHolderEmptySetting.INSTANCE;
        if (bugFixApplyViewDataHolderEmptySetting.isEnable()) {
            MultiGuestDataHolder multiGuestDataHolder = this.dataHolder;
            if (multiGuestDataHolder != null) {
                lValueOf = Long.valueOf(multiGuestDataHolder.LJI);
            } else {
                lValueOf = null;
            }
        } else {
            lValueOf = Long.valueOf(LJIIIZ().LJI);
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        if (lValueOf != null) {
            jCurrentTimeMillis = lValueOf.longValue();
        } else {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        long j = jCurrentTimeMillis2 - jCurrentTimeMillis;
        if (bugFixApplyViewDataHolderEmptySetting.isEnable()) {
            multiGuestDataHolderLJIIIZ = this.dataHolder;
        } else {
            multiGuestDataHolderLJIIIZ = LJIIIZ();
        }
        DataChannel dataChannel = this.LIZ;
        if (dataChannel != null && (l = (Long) dataChannel.gg0(MultiGuestGuestSelfSendGiftData.class)) != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        C925640aCA.LJIIZILJ(str, j, 0L, "apply", null, null, 0, 0, C923130a87.LIZIZ(multiGuestDataHolderLJIIIZ, jLongValue), null, null, 1780);
        if (bugFixApplyViewDataHolderEmptySetting.isEnable()) {
            MultiGuestDataHolder multiGuestDataHolder2 = this.dataHolder;
            if (multiGuestDataHolder2 != null) {
                multiGuestDataHolder2.LJI = System.currentTimeMillis();
                return;
            }
            return;
        }
        LJIIIZ().LJI = System.currentTimeMillis();
    }

    public final void LJIILLIIL(boolean z) {
        long followStatus;
        Room room;
        User owner;
        FollowInfo followInfo;
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        ViewPropertyAnimator viewPropertyAnimatorAlpha;
        ViewPropertyAnimator duration;
        if (z) {
            boolean zLIZIZ = LIZIZ();
            TextView textView = this.LIZJ;
            if (textView != null && textView.getVisibility() == 0) {
                if (zLIZIZ) {
                    return;
                }
            } else if (zLIZIZ) {
                TextView textView2 = this.LIZJ;
                if (textView2 != null) {
                    C500260Jjc.LJLJLJ(textView2, true);
                }
                TextView textView3 = this.LIZJ;
                if (textView3 != null) {
                    C786410Ut5.S4(0.0f, textView3);
                }
                TextView textView4 = this.LIZJ;
                if (textView4 != null && (viewPropertyAnimatorAnimate = textView4.animate()) != null && (viewPropertyAnimatorAlpha = viewPropertyAnimatorAnimate.alpha(1.0f)) != null && (duration = viewPropertyAnimatorAlpha.setDuration(800L)) != null) {
                    duration.start();
                }
                DataChannel dataChannel = this.LIZ;
                if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null && (owner = room.getOwner()) != null && (followInfo = owner.getFollowInfo()) != null) {
                    followStatus = followInfo.getFollowStatus();
                } else {
                    followStatus = 0;
                }
                C924640aAY.LIZIZ(followStatus, this.LIZ, "black_button", false);
                return;
            }
            TextView textView5 = this.LIZJ;
            if (textView5 != null) {
                C500260Jjc.LJLJLJ(textView5, false);
            }
            TextView textView6 = this.LIZJ;
            if (textView6 != null) {
                C930540aK4.LJJIJL(textView6);
                return;
            }
            return;
        }
        TextView textView7 = this.LIZJ;
        if (textView7 != null) {
            C500260Jjc.LJLJLJ(textView7, false);
        }
        TextView textView8 = this.LIZJ;
        if (textView8 == null) {
            return;
        }
        C930540aK4.LJJIJL(textView8);
    }

    public final void LJIIZILJ(boolean z) {
        List<InterfaceC937840aVq> allLayoutWindows;
        InterfaceC937840aVq next;
        Rect rectLJIIL;
        int stroke_width;
        ViewGroup.LayoutParams layoutParams;
        FrameLayout.LayoutParams layoutParams2;
        TextView textView;
        TextView textView2;
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL;
        List list;
        Drawable background;
        C915830ZwL shapeDescriptor;
        Rect rect;
        int stroke_width2;
        ViewGroup.LayoutParams layoutParams3;
        FrameLayout.LayoutParams layoutParams4;
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL2;
        ViewGroup.LayoutParams layoutParams5;
        Rect rect2;
        FrameLayout.LayoutParams layoutParams6;
        InterfaceC940060aZQ interfaceC940060aZQ;
        FrameLayout frameLayoutLL;
        TextView textView3;
        TextView textView4;
        InterfaceC940060aZQ interfaceC940060aZQ2;
        C942080acg c942080acgLJLJI;
        C947470alN c947470alN;
        if (C931790aM5.LIZIZ()) {
            TextView textView5 = this.LIZJ;
            if ((textView5 != null && textView5.getVisibility() == 0) || !C940770aaZ.LIZ().getDataSource().LJJIIZ()) {
                InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
                if (interfaceC954180awCLLJLL != null) {
                    interfaceC937900aVwLLIIJLIL = interfaceC954180awCLLJLL.LLIIJLIL();
                } else {
                    interfaceC937900aVwLLIIJLIL = null;
                }
                if (!(interfaceC937900aVwLLIIJLIL instanceof InterfaceC940060aZQ) || (interfaceC940060aZQ2 = (InterfaceC940060aZQ) interfaceC937900aVwLLIIJLIL) == null || (c942080acgLJLJI = interfaceC940060aZQ2.LJLJI()) == null || (c947470alN = c942080acgLJLJI.LIZ) == null || (list = c947470alN.LIZLLL) == null) {
                    list = C13BV.INSTANCE;
                }
                if (LIZ(this.LIZ, z)) {
                    if (this.LIZJ == null) {
                        FrameLayout frameLayout = this.LIZIZ;
                        if (frameLayout != null) {
                            textView4 = (TextView) C786410Ut5.Td(C786410Ut5.ne(frameLayout.getContext()), R.layout.hs5, frameLayout, false);
                        } else {
                            textView4 = null;
                        }
                        this.LIZJ = textView4;
                        if (textView4 != null) {
                            textView4.setBackground(LJFF());
                        }
                    }
                    TextView textView6 = this.LIZJ;
                    if (textView6 != null && textView6.getParent() != null && (textView3 = this.LIZJ) != null) {
                        C930540aK4.LJJIJL(textView3);
                    }
                    FrameLayout frameLayout2 = this.LIZIZ;
                    if (frameLayout2 != null && !list.isEmpty()) {
                        C957020b0m c957020b0mLJ = LJ(list);
                        if (c957020b0mLJ != null && (shapeDescriptor = c957020b0mLJ.getShapeDescriptor()) != null && (rect = shapeDescriptor.LIZ) != null) {
                            LivesdkLinkmicFloatWindowOptimizeSetting livesdkLinkmicFloatWindowOptimizeSetting = LivesdkLinkmicFloatWindowOptimizeSetting.INSTANCE;
                            if (!livesdkLinkmicFloatWindowOptimizeSetting.isV0(false) && !livesdkLinkmicFloatWindowOptimizeSetting.isV3(false)) {
                                stroke_width2 = livesdkLinkmicFloatWindowOptimizeSetting.getSTROKE_WIDTH();
                            } else {
                                stroke_width2 = 0;
                            }
                            int height = (frameLayout2.getHeight() - rect.top) + ((int) C497740JfY.LIZIZ(4.0f));
                            TextView textView7 = this.LIZJ;
                            if (textView7 != null) {
                                layoutParams3 = textView7.getLayoutParams();
                            } else {
                                layoutParams3 = null;
                            }
                            if (layoutParams3 instanceof FrameLayout.LayoutParams) {
                                layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                                if (layoutParams4 != null) {
                                    layoutParams4.height = -2;
                                    layoutParams4.bottomMargin = height;
                                    layoutParams4.width = (rect.right - rect.left) + stroke_width2;
                                }
                            } else {
                                layoutParams4 = null;
                            }
                            InterfaceC954180awC interfaceC954180awCLLJLL2 = C915980Zwa.LJIIIIZZ().LLJLL();
                            if (interfaceC954180awCLLJLL2 != null) {
                                interfaceC937900aVwLLIIJLIL2 = interfaceC954180awCLLJLL2.LLIIJLIL();
                            } else {
                                interfaceC937900aVwLLIIJLIL2 = null;
                            }
                            if ((interfaceC937900aVwLLIIJLIL2 instanceof InterfaceC940060aZQ) && (interfaceC940060aZQ = (InterfaceC940060aZQ) interfaceC937900aVwLLIIJLIL2) != null && (frameLayoutLL = interfaceC940060aZQ.LL()) != null) {
                                layoutParams5 = frameLayoutLL.getLayoutParams();
                            } else {
                                layoutParams5 = null;
                            }
                            if ((layoutParams5 instanceof FrameLayout.LayoutParams) && (layoutParams6 = (FrameLayout.LayoutParams) layoutParams5) != null) {
                                int i = layoutParams6.leftMargin;
                                int i2 = layoutParams6.topMargin;
                                rect2 = new Rect(i, i2, layoutParams6.width + i, i2 + i);
                            } else {
                                rect2 = new Rect();
                            }
                            if (layoutParams4 != null) {
                                layoutParams4.rightMargin = (rect2.right - rect.right) - (stroke_width2 / 2);
                            }
                            TextView textView8 = this.LIZJ;
                            if (textView8 != null) {
                                C786410Ut5.g6(textView8, layoutParams4);
                            }
                            LJIJI();
                            frameLayout2.addView(this.LIZJ);
                            if (LIZIZ()) {
                                LJIILLIIL(true);
                                TextView textView9 = this.LIZJ;
                                if (textView9 != null) {
                                    textView9.setText(LJIIL());
                                }
                                TextView textView10 = this.LIZJ;
                                if (textView10 != null) {
                                    HandlerHook.viewPost(textView10, new ARunnableS84S0200000_15(this, (C937770aVj) list, (List<C957020b0m>) height, 43));
                                }
                            } else {
                                LJIILLIIL(false);
                            }
                            TextView textView11 = this.LIZJ;
                            if (textView11 != null) {
                                C500260Jjc.LJLILLLLZI(textView11, R.layout.hs5, 1000L, new AwS594S0100000_15(this, 804));
                            }
                        }
                        if (C917910Zzh.LIZ(false)) {
                            TextView textView12 = this.LIZJ;
                            if (textView12 != null) {
                                background = textView12.getBackground();
                            } else {
                                background = null;
                            }
                            if (background instanceof GradientDrawable) {
                                ((GradientDrawable) background).setCornerRadius(LJI());
                                TextView textView13 = this.LIZJ;
                                if (textView13 != null) {
                                    textView13.setBackground(background);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                LJIILLIIL(false);
                return;
            }
            return;
        }
        if (LJII() == null) {
            return;
        }
        InterfaceC937820aVo interfaceC937820aVoLJII = LJII();
        if (interfaceC937820aVoLJII == null || (allLayoutWindows = interfaceC937820aVoLJII.getAllLayoutWindows()) == null) {
            allLayoutWindows = C13BV.INSTANCE;
        }
        if (LIZ(this.LIZ, z)) {
            if (this.LIZJ == null) {
                FrameLayout frameLayout3 = this.LIZIZ;
                if (frameLayout3 != null) {
                    textView2 = (TextView) C786410Ut5.Td(C786410Ut5.ne(frameLayout3.getContext()), R.layout.hs5, frameLayout3, false);
                } else {
                    textView2 = null;
                }
                this.LIZJ = textView2;
                if (textView2 != null) {
                    textView2.setBackground(LJFF());
                }
            }
            TextView textView14 = this.LIZJ;
            if (textView14 != null && textView14.getParent() != null && (textView = this.LIZJ) != null) {
                C930540aK4.LJJIJL(textView);
            }
            FrameLayout frameLayout4 = this.LIZIZ;
            if (frameLayout4 == null || allLayoutWindows.isEmpty()) {
                return;
            }
            InterfaceC937840aVq interfaceC937840aVqLIZLLL = LIZLLL(allLayoutWindows);
            if (interfaceC937840aVqLIZLLL == null || (rectLJIIL = interfaceC937840aVqLIZLLL.LJIIL()) == null) {
                Iterator<InterfaceC937840aVq> it2 = allLayoutWindows.iterator();
                if (!it2.hasNext()) {
                    next = null;
                } else {
                    next = it2.next();
                    if (it2.hasNext()) {
                        int iLJIIIIZZ = next.LJIIIIZZ();
                        do {
                            InterfaceC937840aVq next2 = it2.next();
                            int iLJIIIIZZ2 = next2.LJIIIIZZ();
                            if (iLJIIIIZZ < iLJIIIIZZ2) {
                                next = next2;
                                iLJIIIIZZ = iLJIIIIZZ2;
                            }
                        } while (it2.hasNext());
                    }
                }
                InterfaceC937840aVq interfaceC937840aVq = next;
                if (interfaceC937840aVq == null || (rectLJIIL = interfaceC937840aVq.LJIIL()) == null) {
                    rectLJIIL = ((InterfaceC937840aVq) ListProtector.get(allLayoutWindows, allLayoutWindows.size() - 1)).LJIIL();
                }
            }
            LivesdkLinkmicFloatWindowOptimizeSetting livesdkLinkmicFloatWindowOptimizeSetting2 = LivesdkLinkmicFloatWindowOptimizeSetting.INSTANCE;
            if (!livesdkLinkmicFloatWindowOptimizeSetting2.isV0(false) && !livesdkLinkmicFloatWindowOptimizeSetting2.isV3(false)) {
                stroke_width = livesdkLinkmicFloatWindowOptimizeSetting2.getSTROKE_WIDTH();
            } else {
                stroke_width = 0;
            }
            int height2 = (frameLayout4.getHeight() - rectLJIIL.top) + ((int) C497740JfY.LIZIZ(4.0f));
            TextView textView15 = this.LIZJ;
            if (textView15 != null) {
                layoutParams = textView15.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if (layoutParams instanceof FrameLayout.LayoutParams) {
                layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                if (layoutParams2 != null) {
                    layoutParams2.height = -2;
                    layoutParams2.bottomMargin = height2;
                    layoutParams2.width = (rectLJIIL.right - rectLJIIL.left) + stroke_width;
                    layoutParams2.rightMargin = (frameLayout4.getRight() - rectLJIIL.right) - (stroke_width / 2);
                }
            } else {
                layoutParams2 = null;
            }
            TextView textView16 = this.LIZJ;
            if (textView16 != null) {
                C786410Ut5.g6(textView16, layoutParams2);
            }
            LJIJI();
            frameLayout4.addView(this.LIZJ);
            if (LIZIZ()) {
                LJIILLIIL(true);
                TextView textView17 = this.LIZJ;
                if (textView17 != null) {
                    textView17.setText(LJIIL());
                }
                TextView textView18 = this.LIZJ;
                if (textView18 != null) {
                    HandlerHook.viewPost(textView18, new ARunnableS84S0200000_15(this, (C937770aVj) allLayoutWindows, (List<C957020b0m>) height2, 44));
                }
            } else {
                LJIILLIIL(false);
            }
            TextView textView19 = this.LIZJ;
            if (textView19 == null) {
                return;
            }
            C500260Jjc.LJLILLLLZI(textView19, R.layout.hs5, 1000L, new AwS594S0100000_15(this, 805));
            return;
        }
        LJIILLIIL(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.0a7J, X.0aVl] */
    public C937770aVj(DataChannel dataChannel, FrameLayout frameLayout) {
        InterfaceC921620a5g interfaceC921620a5g;
        this.LIZ = dataChannel;
        this.LIZIZ = frameLayout;
        ?? r3 = new InterfaceC922630a7J() { // from class: X.0aVl
            @Override // X.InterfaceC922630a7J
            public final void Ue(Throwable th) {
            }

            @Override // X.InterfaceC922630a7J
            public final void L2(InterfaceC921200a50<LinkPlayerInfo, MultiLiveGuestInfoList> interfaceC921200a50, int i) {
                this.LL.LJIJ();
            }

            @Override // X.InterfaceC922630a7J
            public final void rn(InterfaceC921200a50<LinkListUser, LinkMessage> interfaceC921200a50, int i) {
                this.LL.LJIJ();
            }
        };
        this.LJII = r3;
        C948450amx c948450amx = C948450amx.LIZIZ;
        c948450amx.LIZJ(this);
        if (dataChannel != null) {
            dataChannel.DQ2(MultiLiveUIChangeEvent.class, this, new C937780aVk(this));
            dataChannel.DQ2(RequestSettingSuccessEvent.class, this, new AwS594S0100000_15(this, 800));
            dataChannel.DQ2(MultiGuestV3VideoSizeChannel.class, this, new AwS594S0100000_15(this, 801));
            dataChannel.DQ2(MultiGuestV3VideoViewRealSizeChannel.class, this, new AwS594S0100000_15(this, 802));
            dataChannel.DQ2(MultiGuestAddEmptySeatStatus.class, this, new AwS594S0100000_15(this, 803));
        }
        Object objLJIIIZ = c948450amx.LJIIIZ("MULTI_GUEST_V3_GUEST_USER_MANAGER");
        if ((objLJIIIZ instanceof InterfaceC917640ZzG) && (interfaceC921620a5g = (InterfaceC921620a5g) objLJIIIZ) != 0) {
            interfaceC921620a5g.LJJIJIL(r3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean LIZ(DataChannel dataChannel, boolean z) {
        if (z) {
            if ((dataChannel != null && C500260Jjc.LJIIZILJ(dataChannel)) || LJIIIIZZ() == 5 || LJIILJJIL()) {
                return false;
            }
            Integer num = (Integer) C924790aAn.LIZLLL().LIZIZ;
            if (num != null && num.intValue() == 2) {
                return false;
            }
            C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
            C307001Gy.LIZ().getClass();
            if (C927600aFK.LJII() == EnumC918970a1P.FLOATING && LJIILIIL()) {
                return true;
            }
            return false;
        }
        return false;
    }
}
