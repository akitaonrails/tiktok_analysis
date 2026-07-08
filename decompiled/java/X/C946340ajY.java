package X;

import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestAddAutoAcceptInGoLivePageSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicMgPreviewLivePageSetting;

/* JADX INFO: renamed from: X.0ajY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C946340ajY {
    public final boolean LIZ;
    public final boolean LIZIZ;

    public C946340ajY() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C946340ajY)) {
            return false;
        }
        C946340ajY c946340ajY = (C946340ajY) obj;
        return this.LIZ == c946340ajY.LIZ && this.LIZIZ == c946340ajY.LIZIZ;
    }

    public C946340ajY(int i) {
        boolean zEnable = LinkMicMgPreviewLivePageSetting.INSTANCE.enable();
        boolean zEnable2 = MultiGuestAddAutoAcceptInGoLivePageSetting.INSTANCE.enable();
        this.LIZ = zEnable;
        this.LIZIZ = zEnable2;
    }
}
