package X;

import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;

/* JADX INFO: renamed from: X.16E3, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C16E3 implements InterfaceC901780ZZg {
    public final /* synthetic */ C1ACD LIZ;

    @Override // X.InterfaceC901780ZZg
    public final void LIZIZ() {
        C1ACD c1acd = this.LIZ;
        if (c1acd != null) {
            c1acd.LIZIZ();
        }
    }

    @Override // X.InterfaceC901780ZZg
    public final String getPlayerTag() {
        C1ACD c1acd = this.LIZ;
        if (c1acd != null) {
            return c1acd.getPlayerTag();
        }
        return null;
    }

    public C16E3(C1ACD c1acd) {
        this.LIZ = c1acd;
    }

    @Override // X.InterfaceC901780ZZg
    public final void LIZJ(LiveRoomStruct liveRoomStruct, FrameLayout frameLayout) {
        C1ACD c1acd = this.LIZ;
        if (c1acd != null) {
            c1acd.LJJIIJZLJL(true, liveRoomStruct, frameLayout, false, null, "", false, null);
        }
    }

    public final void LIZ(String str, boolean z, boolean z2) {
        C1ACD c1acd = this.LIZ;
        if (c1acd != null) {
            c1acd.LJIILIIL(new C1699360uK6("chat_live_cover", "chat_live_cover", "click", str, z, z2));
        }
    }
}
