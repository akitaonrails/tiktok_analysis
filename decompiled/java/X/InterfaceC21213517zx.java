package X;

import android.os.Bundle;
import com.bytedance.android.live.slot.IIconSlot;
import java.util.Map;

/* JADX INFO: renamed from: X.17zx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public interface InterfaceC21213517zx {
    void onAudiencePermissionChanged(boolean z);

    void onClick(long j, String str, Map<String, ? extends Object> map, String str2);

    void onCreate(Bundle bundle);

    void onDestroy();

    void onDispose();

    void onExposure(String str);

    void onPause();

    void onProductNumChange(int i);

    void onResume();

    void onShopBagIconDrawableLoaded();

    void onSlotCreated(IIconSlot.SlotViewModel slotViewModel, InterfaceC21213717zz interfaceC21213717zz);

    void onStart();

    void onStop();

    void prepareToShow(Map<String, ? extends Object> map, InterfaceC756140TlM interfaceC756140TlM);
}
