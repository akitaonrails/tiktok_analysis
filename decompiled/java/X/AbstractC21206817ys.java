package X;

import com.bytedance.android.live.slot.AbsSlotWidget;
import com.bytedance.android.live.slot.IFrameSlot;
import java.util.Map;

/* JADX INFO: renamed from: X.17ys, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public abstract class AbstractC21206817ys extends AbsSlotWidget<IFrameSlot, IFrameSlot.SlotViewModel, EnumC1124020fM8> {
    public final boolean LLILLL;
    public InterfaceC21180617ue LLILZ;
    public InterfaceC1748810vbr LLILZIL;

    public abstract boolean LJJ(Map<String, Object> map);

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public void onDestroy() {
        this.LLILZ = null;
    }

    public AbstractC21206817ys(boolean z) {
        this.LLILLL = z;
    }

    @Override // X.InterfaceC1124060fMC
    public final void prepareToShow(Map<String, Object> map, InterfaceC756140TlM interfaceC756140TlM) {
        if (!this.LLILLL) {
            interfaceC756140TlM.LIZ(LJJ(map));
        }
    }
}
