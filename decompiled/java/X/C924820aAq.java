package X;

import com.bytedance.android.live.liveinteract.api.LinkConnectionTypeChangedEvent;
import com.bytedance.android.live.liveinteract.linkroom.widget.LinkControlWidget;

/* JADX INFO: renamed from: X.0aAq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C924820aAq {
    public boolean LIZ;
    public final /* synthetic */ LinkControlWidget LIZIZ;

    public C924820aAq(LinkControlWidget linkControlWidget) {
        this.LIZIZ = linkControlWidget;
    }

    public final void LIZ(boolean z) {
        if (this.LIZ == z) {
            return;
        }
        this.LIZ = z;
        this.LIZIZ.dataChannel.FQ2(LinkConnectionTypeChangedEvent.class);
    }
}
