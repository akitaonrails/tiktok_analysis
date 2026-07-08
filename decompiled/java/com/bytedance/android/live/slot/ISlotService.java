package com.bytedance.android.live.slot;

import X.AbstractC1210780hc4;
import X.C006A;
import X.C1124000fM6;
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
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.ss.ugc.live.sdk.message.data.IMessage;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public interface ISlotService extends C006A {
    InterfaceC781630UlN createGiftDebugService(Context context, DataChannel dataChannel);

    InterfaceC770540UKm createIconSlotController(Context context, InterfaceC1123890fLv interfaceC1123890fLv, EnumC756810TmR enumC756810TmR, EnumC785140Ur2 enumC785140Ur2, Fragment fragment);

    void dispatchMessage(IMessage iMessage);

    InterfaceC756730TmJ getAggregateProviderByID(EnumC756810TmR enumC756810TmR);

    Class<? extends LiveRecyclableWidget> getBarrageWidget();

    Class<? extends LiveRecyclableWidget> getECAuctionActingAreaSlotWidget();

    Class<? extends LiveRecyclableWidget> getECAuctionBottomRightActingAreaSlotWidget();

    Class<? extends LiveRecyclableWidget> getECBillboardBroadcastSlotWidget();

    Class<? extends LiveWidget> getECBillboardSlotWidgetClass();

    Class<? extends LiveRecyclableWidget> getECBillboardWatcherSlotWidget();

    Class<? extends LiveRecyclableWidget> getECScriptSlotWidget();

    Class<? extends LiveRecyclableWidget> getECWatcherWaterMarkSlotWidget();

    Class<? extends LiveRecyclableWidget> getFrameL2SlotWidget();

    Class<? extends LiveRecyclableWidget> getFrameL3SlotWidget();

    Rect getFrameSlotLocation(Context context, EnumC1124020fM8 enumC1124020fM8);

    Class<? extends LiveRecyclableWidget> getFrameSlotWidget();

    Class<? extends LiveRecyclableWidget> getFreeFrameSlotWidget();

    Class<? extends LiveRecyclableWidget> getHighPrioritySlotWidget();

    Rect getIconSlotLocation(Context context, EnumC756810TmR enumC756810TmR);

    List<AbstractC1210780hc4> getLiveShareSheetAction(Map<String, Object> map, EnumC756810TmR enumC756810TmR);

    List<C1124000fM6> getProviderWrappersByID(EnumC756810TmR enumC756810TmR);

    List<C1124000fM6> getProviderWrappersByID(EnumC1124020fM8 enumC1124020fM8);

    InterfaceC781620UlM getSlotMessagerByBiz(String str);

    boolean isBizTypeRegistered(String str);

    void loadToolbarIconSlotBehavior(Context context, LifecycleOwner lifecycleOwner, DataChannel dataChannel);

    /* bridge */ /* synthetic */ void onInit();

    void registerAggregateSlot(InterfaceC756730TmJ interfaceC756730TmJ);

    void registerSlot(InterfaceC1123960fM2 interfaceC1123960fM2);
}
