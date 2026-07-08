package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0aE8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C926860aE8 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZLLL;
    public final DataChannel LIZ;
    public final C304201Fw LIZIZ = new C304201Fw("MULTI_GUEST_DATA_HOLDER");
    public String LIZJ = "invite";

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C926860aE8.class, "multiGuestDataHolder", "getMultiGuestDataHolder()Lcom/bytedance/android/live/liveinteract/multiguestv3/main/common/MultiGuestDataHolder;", 0);
        C13LE.LIZ.getClass();
        LIZLLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public final MultiGuestDataHolder LIZ() {
        C304201Fw c304201Fw = this.LIZIZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LIZLLL;
        return (MultiGuestDataHolder) c304201Fw.LIZ();
    }

    public C926860aE8(DataChannel dataChannel) {
        this.LIZ = dataChannel;
    }
}
