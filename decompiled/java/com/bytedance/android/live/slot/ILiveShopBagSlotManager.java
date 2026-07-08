package com.bytedance.android.live.slot;

import X.C006A;
import X.C00EZ;
import X.C756940Tme;
import X.InterfaceC1124130fMJ;
import X.InterfaceC212386189o;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* JADX INFO: loaded from: classes18.dex */
public interface ILiveShopBagSlotManager extends C006A {
    boolean DN2(String str);

    void GV(C00EZ c00ez);

    void RT0(String str);

    void RZ(int i);

    void bC2(String str, LifecycleOwner lifecycleOwner, IIconSlot.SlotViewModel slotViewModel, InterfaceC212386189o interfaceC212386189o);

    void kJ1(C756940Tme c756940Tme, InterfaceC212386189o interfaceC212386189o);

    void pC2(Room room);

    void y10(InterfaceC1124130fMJ interfaceC1124130fMJ);
}
