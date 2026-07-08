package X;

import Y.AObserverS216S0100000_12;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0T7n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C741690T7n {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(LifecycleOwner lifecycleOwner, DataChannel dataChannel, List list, IIconSlot.SlotViewModel slotViewModel) {
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                EnumC742820TBw enumC742820TBw = (EnumC742820TBw) it2.next();
                ((ConcurrentHashMap) slotViewModel.LLJJIJIIJIL).put(enumC742820TBw, new MutableLiveData());
                LiveData liveData = (LiveData) ((ConcurrentHashMap) slotViewModel.LLJJIJIIJIL).get(enumC742820TBw);
                if (liveData != null) {
                    int i = C741700T7o.LIZ[enumC742820TBw.ordinal()];
                    if (i != 1) {
                        if (i == 2) {
                            liveData.observe(lifecycleOwner, new AObserverS216S0100000_12(dataChannel, 95));
                        }
                    } else {
                        liveData.observe(lifecycleOwner, new AObserverS216S0100000_12(dataChannel, 94));
                    }
                }
            }
        }
    }
}
