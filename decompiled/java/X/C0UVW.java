package X;

import com.bytedance.android.livesdk.api.BroadcastRoomApi;
import com.bytedance.android.livesdk.api.BroadcastRoomApiKt;
import com.bytedance.android.livesdk.api.StatusApi;
import com.bytedance.android.livesdk.broadcast.interaction.widget.livecenter.LiveCenterApi;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS199S0000000_12;

/* JADX INFO: renamed from: X.0UVW, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UVW {
    public static final C01GW<C0UVW> LIZIZ = C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, AFwS199S0000000_12.get$arr$(269));
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(270));

    public final BroadcastRoomApi LIZ() {
        return (BroadcastRoomApi) LIZJ(BroadcastRoomApi.class);
    }

    public final BroadcastRoomApiKt LIZIZ() {
        return (BroadcastRoomApiKt) LIZJ(BroadcastRoomApiKt.class);
    }

    public final LiveCenterApi LIZLLL() {
        return (LiveCenterApi) LIZJ(LiveCenterApi.class);
    }

    public final StatusApi LJ() {
        return (StatusApi) LIZJ(StatusApi.class);
    }

    public final <T> T LIZJ(Class<T> cls) {
        if (!((ConcurrentHashMap) this.LIZ.getValue()).contains(cls)) {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.LIZ.getValue();
            C480460Ism.LIZ().getClass();
            concurrentHashMap.putIfAbsent(cls, C480460Ism.LIZLLL(cls));
        }
        return (T) ((ConcurrentHashMap) this.LIZ.getValue()).get(cls);
    }
}
