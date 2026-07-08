package X;

import com.ss.android.ugc.aweme.im.sticker.api.model.StickerSetInfo;
import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Haz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C443950Haz implements IEvent {
    public final StickerSetInfo LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C443950Haz) && Intrinsics.LJFF(this.LIZ, ((C443950Haz) obj).LIZ);
    }

    public final int hashCode() {
        StickerSetInfo stickerSetInfo = this.LIZ;
        if (stickerSetInfo == null) {
            return 0;
        }
        return stickerSetInfo.hashCode();
    }

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent post() {
        C1440005kM.LIZ(this);
        return this;
    }

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent postSticky() {
        C1440005kM.LIZIZ(this);
        return this;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UseStickerSetEvent(info=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C443950Haz(StickerSetInfo stickerSetInfo) {
        this.LIZ = stickerSetInfo;
    }
}
