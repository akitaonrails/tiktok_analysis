package X;

import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0IHM, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IHM implements C0IHN {
    public final List<C0IHN> LIZ;

    /* JADX WARN: Multi-variable type inference failed */
    public C0IHM(List<? extends C0IHN> list) {
        this.LIZ = list;
    }

    @Override // X.C0IHN
    public final void LIZ(Fragment fragment, Room room) {
        Iterator<C0IHN> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(fragment, room);
        }
    }

    @Override // X.C0IHN
    public final void LIZIZ(LivePlayFragment livePlayFragment, Room room, long j, String str, boolean z, String str2, C0IIF c0iif, HashMap map) {
        Iterator<C0IHN> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZIZ(livePlayFragment, room, j, str, z, str2, c0iif, map);
        }
    }
}
