package X;

import java.util.Map;

/* JADX INFO: renamed from: X.17yJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public abstract class AbstractC21203317yJ extends AbstractC21206917yt {
    public final boolean LLILLL;
    public InterfaceC21180717uf LLILZ;
    public InterfaceC1748810vbr LLILZIL;

    public abstract boolean LJJ(Map<String, Object> map);

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public void onDestroy() {
        this.LLILZ = null;
    }

    public AbstractC21203317yJ(boolean z) {
        this.LLILLL = z;
    }

    @Override // X.InterfaceC1124060fMC
    public final void prepareToShow(Map<String, Object> map, InterfaceC756140TlM interfaceC756140TlM) {
        if (!this.LLILLL) {
            interfaceC756140TlM.LIZ(LJJ(map));
        }
    }
}
