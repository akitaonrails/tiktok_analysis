package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;

/* JADX INFO: renamed from: X.0bRk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C973740bRk {
    public static final C973740bRk LIZ = new C973740bRk();
    public static long LIZIZ;
    public static long LIZJ;

    public final synchronized long LIZ() {
        long j;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        j = 0;
        if (room != null) {
            long id = room.getId();
            if (id > 0 && id == LIZIZ) {
                j = LIZJ;
            }
        }
        return j;
    }

    public final synchronized void LIZIZ(long j) {
        if (j <= 0) {
            return;
        }
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            long id = room.getId();
            if (id > 0) {
                if (id != LIZIZ) {
                    LIZIZ = id;
                    LIZJ = j;
                }
            }
        }
    }
}
