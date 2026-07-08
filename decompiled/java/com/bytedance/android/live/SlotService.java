package com.bytedance.android.live;

import X.AbstractC1123970fM3;
import X.AbstractC1210780hc4;
import X.C1105280eru;
import X.C1123920fLy;
import X.C1123930fLz;
import X.C1124000fM6;
import X.C1124030fM9;
import X.C20441214yg;
import X.C500260Jjc;
import X.C520010KaN;
import X.C785060Uqu;
import X.EnumC1102740eno;
import X.EnumC1124020fM8;
import X.EnumC756810TmR;
import X.EnumC785140Ur2;
import X.InterfaceC1123890fLv;
import X.InterfaceC1123960fM2;
import X.InterfaceC756730TmJ;
import X.InterfaceC770540UKm;
import X.InterfaceC781620UlM;
import X.InterfaceC781630UlN;
import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.slot.BroadcastLiveECBillboardSlotWidget;
import com.bytedance.android.live.slot.ECAuctionActingAreaSlotWidget;
import com.bytedance.android.live.slot.ECAuctionBottomRightActingAreaSlotWidget;
import com.bytedance.android.live.slot.FrameL2SlotWidget;
import com.bytedance.android.live.slot.FrameL3SlotWidget;
import com.bytedance.android.live.slot.FrameSlotWidget;
import com.bytedance.android.live.slot.FreeFrameSlotWidget;
import com.bytedance.android.live.slot.HighPrioritySlotWidget;
import com.bytedance.android.live.slot.ISlotService;
import com.bytedance.android.live.slot.IconSlotController;
import com.bytedance.android.live.slot.LiveECScriptSlotWidget;
import com.bytedance.android.live.slot.PreviewLiveECBillboardSlotWidget;
import com.bytedance.android.live.slot.SlotBarrageWidget;
import com.bytedance.android.live.slot.WatcherLiveECBillboardSlotWidget;
import com.bytedance.android.live.slot.WatcherLiveECWaterMarkSlotWidget;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveSlotExperiment;
import com.bytedance.android.livesdk.livesetting.model.SlotBizTypeDisallow;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public class SlotService implements ISlotService {
    @Override // com.bytedance.android.live.slot.ISlotService
    public final void onInit() {
        HashSet hashSet = new HashSet();
        hashSet.add(Integer.valueOf(R.layout.hxl));
        hashSet.add(Integer.valueOf(R.layout.hxm));
        C1105280eru.LIZIZ(null, hashSet);
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public final Class<? extends LiveRecyclableWidget> getBarrageWidget() {
        return SlotBarrageWidget.class;
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public final Class<? extends LiveRecyclableWidget> getECAuctionActingAreaSlotWidget() {
        return ECAuctionActingAreaSlotWidget.class;
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public final Class<? extends LiveRecyclableWidget> getECAuctionBottomRightActingAreaSlotWidget() {
        return ECAuctionBottomRightActingAreaSlotWidget.class;
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public final Class<? extends LiveRecyclableWidget> getECBillboardBroadcastSlotWidget() {
        return BroadcastLiveECBillboardSlotWidget.class;
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public final Class<? extends LiveWidget> getECBillboardSlotWidgetClass() {
        return PreviewLiveECBillboardSlotWidget.class;
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public final Class<? extends LiveRecyclableWidget> getECBillboardWatcherSlotWidget() {
        return WatcherLiveECBillboardSlotWidget.class;
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public final Class<? extends LiveRecyclableWidget> getECScriptSlotWidget() {
        return LiveECScriptSlotWidget.class;
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public final Class<? extends LiveRecyclableWidget> getECWatcherWaterMarkSlotWidget() {
        return WatcherLiveECWaterMarkSlotWidget.class;
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public final Class<? extends LiveRecyclableWidget> getFrameL2SlotWidget() {
        return FrameL2SlotWidget.class;
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public final Class<? extends LiveRecyclableWidget> getFrameL3SlotWidget() {
        return FrameL3SlotWidget.class;
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public final Class<? extends LiveRecyclableWidget> getFrameSlotWidget() {
        return FrameSlotWidget.class;
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public final Class<? extends LiveRecyclableWidget> getFreeFrameSlotWidget() {
        return FreeFrameSlotWidget.class;
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public final Class<? extends LiveRecyclableWidget> getHighPrioritySlotWidget() {
        return HighPrioritySlotWidget.class;
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public final void dispatchMessage(IMessage iMessage) {
        Iterator it2 = ((HashMap) C1123920fLy.LIZ().LIZ.LIZLLL).values().iterator();
        while (it2.hasNext()) {
            ((InterfaceC1123960fM2) it2.next()).LIZLLL();
        }
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public final InterfaceC756730TmJ getAggregateProviderByID(EnumC756810TmR enumC756810TmR) {
        C1123930fLz c1123930fLz = C1123920fLy.LIZ().LIZ;
        c1123930fLz.LIZ();
        return (InterfaceC756730TmJ) ((HashMap) c1123930fLz.LIZJ).get(enumC756810TmR);
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public final List<C1124000fM6> getProviderWrappersByID(EnumC756810TmR enumC756810TmR) {
        return C1123920fLy.LIZ().LIZJ(enumC756810TmR);
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public final InterfaceC781620UlM getSlotMessagerByBiz(String str) {
        C1123920fLy c1123920fLyLIZ = C1123920fLy.LIZ();
        if (((HashMap) c1123920fLyLIZ.LIZ.LIZLLL).containsKey(str)) {
            C1123930fLz c1123930fLz = c1123920fLyLIZ.LIZ;
            c1123930fLz.LIZ();
            if (((HashMap) c1123930fLz.LIZLLL).get(str) != null) {
                C1123930fLz c1123930fLz2 = c1123920fLyLIZ.LIZ;
                c1123930fLz2.LIZ();
                ((InterfaceC1123960fM2) ((HashMap) c1123930fLz2.LIZLLL).get(str)).LIZLLL();
                return null;
            }
            return null;
        }
        return null;
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public final boolean isBizTypeRegistered(String str) {
        return ((HashMap) C1123920fLy.LIZ().LIZ.LIZLLL).containsKey(str);
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public final void registerAggregateSlot(InterfaceC756730TmJ interfaceC756730TmJ) {
        C1123920fLy c1123920fLyLIZ = C1123920fLy.LIZ();
        c1123920fLyLIZ.getClass();
        String strLIZ = interfaceC756730TmJ.LIZ();
        if (!TextUtils.isEmpty(strLIZ)) {
            SlotBizTypeDisallow slotBizTypeDisallow = LiveSlotExperiment.INSTANCE.getBizTypeDisallow().get(strLIZ);
            if (slotBizTypeDisallow != null && slotBizTypeDisallow.getDisallowAll()) {
                return;
            }
            C1123930fLz c1123930fLz = c1123920fLyLIZ.LIZ;
            ((HashMap) c1123930fLz.LJ).put(interfaceC756730TmJ.LIZ(), interfaceC756730TmJ);
            List<EnumC756810TmR> listLIZIZ = interfaceC756730TmJ.LIZIZ();
            if (listLIZIZ == null) {
                return;
            }
            for (EnumC756810TmR enumC756810TmR : listLIZIZ) {
                if (slotBizTypeDisallow == null || slotBizTypeDisallow.getIconSlotDisallowList() == null || !slotBizTypeDisallow.getIconSlotDisallowList().contains(enumC756810TmR.name())) {
                    ((HashMap) c1123920fLyLIZ.LIZ.LIZJ).put(enumC756810TmR, interfaceC756730TmJ);
                }
            }
            return;
        }
        throw new IllegalArgumentException("SlotWidgetProvider must return valid bizType");
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public final void registerSlot(InterfaceC1123960fM2 interfaceC1123960fM2) {
        C1123920fLy c1123920fLyLIZ = C1123920fLy.LIZ();
        c1123920fLyLIZ.getClass();
        String strLIZ = interfaceC1123960fM2.LIZ();
        if (!TextUtils.isEmpty(strLIZ)) {
            SlotBizTypeDisallow slotBizTypeDisallow = LiveSlotExperiment.INSTANCE.getBizTypeDisallow().get(strLIZ);
            if (slotBizTypeDisallow != null && slotBizTypeDisallow.getDisallowAll()) {
                return;
            }
            C1123930fLz c1123930fLz = c1123920fLyLIZ.LIZ;
            ((HashMap) c1123930fLz.LIZLLL).put(interfaceC1123960fM2.LIZ(), interfaceC1123960fM2);
            List<EnumC756810TmR> listLIZIZ = interfaceC1123960fM2.LIZIZ();
            if (listLIZIZ != null) {
                for (EnumC756810TmR enumC756810TmR : listLIZIZ) {
                    if (slotBizTypeDisallow == null || slotBizTypeDisallow.getIconSlotDisallowList() == null || !slotBizTypeDisallow.getIconSlotDisallowList().contains(enumC756810TmR.name())) {
                        C1123930fLz c1123930fLz2 = c1123920fLyLIZ.LIZ;
                        List arrayList = (List) ((HashMap) c1123930fLz2.LIZ).get(enumC756810TmR);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            ((HashMap) c1123930fLz2.LIZ).put(enumC756810TmR, arrayList);
                        }
                        arrayList.add(interfaceC1123960fM2);
                    }
                }
            }
            List<EnumC1124020fM8> listLIZJ = interfaceC1123960fM2.LIZJ();
            if (listLIZJ == null) {
                return;
            }
            for (EnumC1124020fM8 enumC1124020fM8 : listLIZJ) {
                if (slotBizTypeDisallow == null || slotBizTypeDisallow.getFrameSlotDisallowList() == null || !slotBizTypeDisallow.getFrameSlotDisallowList().contains(enumC1124020fM8.name())) {
                    C1123930fLz c1123930fLz3 = c1123920fLyLIZ.LIZ;
                    List arrayList2 = (List) ((HashMap) c1123930fLz3.LIZIZ).get(enumC1124020fM8);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        ((HashMap) c1123930fLz3.LIZIZ).put(enumC1124020fM8, arrayList2);
                    }
                    arrayList2.add(interfaceC1123960fM2);
                }
            }
            return;
        }
        throw new IllegalArgumentException("SlotWidgetProvider must return valid bizType");
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public final List<C1124000fM6> getProviderWrappersByID(EnumC1124020fM8 enumC1124020fM8) {
        return C1123920fLy.LIZ().LIZIZ(enumC1124020fM8);
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public final InterfaceC781630UlN createGiftDebugService(Context context, DataChannel dataChannel) {
        return new InterfaceC781630UlN() { // from class: X.0fM7
        };
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public final Rect getFrameSlotLocation(Context context, EnumC1124020fM8 enumC1124020fM8) {
        View viewLIZIZ;
        if (C500260Jjc.LJ(context) != null) {
            switch (C1124030fM9.LIZIZ[enumC1124020fM8.ordinal()]) {
                case 1:
                    viewLIZIZ = C520010KaN.LIZIZ(R.id.vl5, context);
                    break;
                case 2:
                case 3:
                    viewLIZIZ = C520010KaN.LIZIZ(R.id.ik5, context);
                    break;
                case 4:
                    viewLIZIZ = C520010KaN.LIZIZ(R.id.cga, context);
                    break;
                case 5:
                    viewLIZIZ = C520010KaN.LIZIZ(R.id.il0, context);
                    break;
                case 6:
                    viewLIZIZ = C520010KaN.LIZIZ(R.id.gfq, context);
                    break;
                case 7:
                    viewLIZIZ = C520010KaN.LIZIZ(R.id.gf2, context);
                    break;
                case 8:
                    viewLIZIZ = C520010KaN.LIZIZ(R.id.gf1, context);
                    break;
                case BdTuring.TYPE_ECAF /* 9 */:
                    viewLIZIZ = C520010KaN.LIZIZ(R.id.gf3, context);
                    break;
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                    viewLIZIZ = C520010KaN.LIZIZ(R.id.gew, context);
                    break;
                case BdTuring.TYPE_EMAIL /* 11 */:
                    viewLIZIZ = C520010KaN.LIZIZ(R.id.gey, context);
                    break;
            }
            if (viewLIZIZ != null) {
                int[] iArr = new int[2];
                viewLIZIZ.getLocationInWindow(iArr);
                int i = iArr[0];
                return new Rect(i, iArr[1], viewLIZIZ.getWidth() + i, iArr[1] + viewLIZIZ.getHeight());
            }
        }
        return null;
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public final Rect getIconSlotLocation(Context context, EnumC756810TmR enumC756810TmR) {
        View viewLIZIZ;
        if (C500260Jjc.LJ(context) != null) {
            int i = C1124030fM9.LIZ[enumC756810TmR.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        viewLIZIZ = C520010KaN.LIZIZ(R.id.yvt, context);
                    }
                } else {
                    viewLIZIZ = C520010KaN.LIZIZ(R.id.ceh, context);
                }
            } else {
                viewLIZIZ = C520010KaN.LIZIZ(R.id.yvv, context);
            }
            if (viewLIZIZ != null) {
                int[] iArr = new int[2];
                viewLIZIZ.getLocationInWindow(iArr);
                int i2 = iArr[0];
                return new Rect(i2, iArr[1], viewLIZIZ.getWidth() + i2, iArr[1] + viewLIZIZ.getHeight());
            }
        }
        return null;
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public final List<AbstractC1210780hc4> getLiveShareSheetAction(Map<String, Object> map, EnumC756810TmR enumC756810TmR) {
        AbstractC1123970fM3 abstractC1123970fM3;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = ((ArrayList) C1123920fLy.LIZ().LIZJ(enumC756810TmR)).iterator();
        while (it2.hasNext()) {
            InterfaceC1123960fM2 interfaceC1123960fM2 = ((C1124000fM6) it2.next()).LIZ;
            List list = null;
            if (interfaceC1123960fM2 instanceof AbstractC1123970fM3) {
                abstractC1123970fM3 = (AbstractC1123970fM3) interfaceC1123960fM2;
            } else {
                abstractC1123970fM3 = null;
            }
            if (abstractC1123970fM3 != null) {
                try {
                    list = (List) abstractC1123970fM3.LJI(map, enumC756810TmR).get("param_live_broadcast_share_sheet_list");
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C20441214yg.LJIIIZ("TAG", "getLiveShareSheetAction responseParams get param_live_broadcast_share_sheet_list, error");
                }
                if (list != null && list.size() > 0) {
                    arrayList.addAll(list);
                }
            }
        }
        return arrayList;
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public final void loadToolbarIconSlotBehavior(Context context, LifecycleOwner lifecycleOwner, DataChannel dataChannel) {
        EnumC1102740eno.ICON_SLOT.load(dataChannel, new C785060Uqu(), false);
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public final InterfaceC770540UKm createIconSlotController(Context context, InterfaceC1123890fLv interfaceC1123890fLv, EnumC756810TmR enumC756810TmR, EnumC785140Ur2 enumC785140Ur2, Fragment fragment) {
        return new IconSlotController(context, interfaceC1123890fLv, enumC756810TmR, enumC785140Ur2, fragment);
    }
}
