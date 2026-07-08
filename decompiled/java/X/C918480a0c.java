package X;

import com.bytedance.android.live.base.model.user.User;
import java.util.Map;

/* JADX INFO: renamed from: X.0a0c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C918480a0c {
    public final User LIZ;
    public final long LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;
    public final Map<String, String> LJ;

    public C918480a0c() {
        throw null;
    }

    public C918480a0c(User user, long j, String str, int i, Map map, int i2) {
        str = (i2 & 4) != 0 ? null : str;
        i = (i2 & 8) != 0 ? 0 : i;
        map = (i2 & 128) != 0 ? null : map;
        this.LIZ = user;
        this.LIZIZ = j;
        this.LIZJ = str;
        this.LIZLLL = i;
        this.LJ = map;
    }
}
