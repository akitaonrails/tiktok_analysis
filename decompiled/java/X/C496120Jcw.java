package X;

import com.bytedance.android.live.base.model.user.User;
import java.util.Map;
import webcast.api.room.ComponentLayoutConfig;
import webcast.api.room.PreloadRoomData;

/* JADX INFO: renamed from: X.0Jcw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C496120Jcw {
    public final User LIZ;
    public final PreloadRoomData LIZIZ;
    public final Map<AbstractC495790JcP<?>, Object> LIZJ;
    public final String LIZLLL;
    public final int LJ;
    public final ComponentLayoutConfig LJFF;

    public C496120Jcw() {
        this(null, null, C2097608Jq.LJ(), null, 0, null);
    }

    public C496120Jcw(User user, PreloadRoomData preloadRoomData, Map<AbstractC495790JcP<?>, ? extends Object> map, String str, int i, ComponentLayoutConfig componentLayoutConfig) {
        this.LIZ = user;
        this.LIZIZ = preloadRoomData;
        this.LIZJ = map;
        this.LIZLLL = str;
        this.LJ = i;
        this.LJFF = componentLayoutConfig;
    }
}
