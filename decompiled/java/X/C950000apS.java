package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0apS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C950000apS extends C920650a47 {
    public final long LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public final long LJ;
    public final long LJFF;
    public final Room LJI;
    public final Map<String, Object> LJII;
    public final List<String> LJIIIIZZ;

    public C950000apS(long j, long j2, long j3, long j4, long j5, Room room, Map map, List list) {
        super(list);
        this.LIZIZ = j;
        this.LIZJ = j2;
        this.LIZLLL = j3;
        this.LJ = j4;
        this.LJFF = j5;
        this.LJI = room;
        this.LJII = map;
        this.LJIIIIZZ = list;
    }

    public C950000apS(int i, long j, long j2, long j3, long j4, long j5, Room room, Map map, String str, List list, int i2) {
        this(j, j2, j3, (i2 & 16) != 0 ? 0L : j4, (i2 & 32) != 0 ? 0L : j5, (i2 & 64) != 0 ? null : room, (i2 & 128) == 0 ? map : null, (i2 & 512) != 0 ? C13BV.INSTANCE : list);
    }
}
