package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.Map;

/* JADX INFO: renamed from: X.0UKm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public interface InterfaceC770540UKm extends LifecycleObserver, InterfaceC1732906qV, WeakHandler.IHandler, OnMessageListener {
    Map<String, Object> getDataContainer();

    InterfaceC1124060fMC<IIconSlot, IIconSlot.SlotViewModel, EnumC756810TmR> getSlotWidgetByBizType(String str);

    void load(EnumC756810TmR enumC756810TmR);

    @Override // X.InterfaceC1732906qV
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    /* synthetic */ void onCreate();

    @Override // X.InterfaceC1732906qV
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    /* synthetic */ void onDestroy();

    @Override // X.InterfaceC1732906qV
    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    /* synthetic */ void onPause();

    @Override // X.InterfaceC1732906qV
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    /* synthetic */ void onResume();

    @Override // X.InterfaceC1732906qV
    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    /* synthetic */ void onStart();

    @Override // X.InterfaceC1732906qV
    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    /* synthetic */ void onStop();

    void putData(String str, Object obj);

    InterfaceC770540UKm setDataChannel(DataChannel dataChannel);
}
