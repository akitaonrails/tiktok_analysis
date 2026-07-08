package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;

/* JADX INFO: renamed from: X.17zu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21213217zu {
    public static final C21213217zu LIZ = new C21213217zu();
    public static final HashMap<Long, C21212917zr> LIZIZ = new HashMap<>();
    public static final HashMap<Long, C21213017zs> LIZJ = new HashMap<>();
    public static String LIZLLL;

    public static void LIZJ(Room room) {
        C21200017xm c21200017xm;
        if (room != null) {
            long id = room.getId();
            C21212917zr c21212917zrRemove = LIZIZ.remove(Long.valueOf(id));
            if (c21212917zrRemove != null) {
                AnonymousClass1800 anonymousClass1800 = c21212917zrRemove.LJJII;
                if (anonymousClass1800 != null) {
                    anonymousClass1800.destroy();
                }
                C21200117xn c21200117xn = c21212917zrRemove.LJIL;
                if (c21200117xn != null && (c21200017xm = c21212917zrRemove.LJJ) != null) {
                    c21200017xm.LJFF(c21200117xn, false);
                }
                c21212917zrRemove.LJIL = null;
                c21212917zrRemove.LJJ = null;
                c21212917zrRemove.LJJII = null;
                c21212917zrRemove.LJIIJ = false;
                c21212917zrRemove.LIZLLL = null;
                c21212917zrRemove.LJIIZILJ = null;
            }
            C21213017zs c21213017zsRemove = LIZJ.remove(Long.valueOf(id));
            if (c21213017zsRemove != null) {
                c21213017zsRemove.LIZJ = false;
                c21213017zsRemove.LIZIZ.set(true);
                c21213017zsRemove.LIZLLL = null;
                AnonymousClass0956 anonymousClass0956 = c21213017zsRemove.LIZ;
                if (anonymousClass0956 != null) {
                    anonymousClass0956.LIZIZ(null);
                }
                c21213017zsRemove.LIZ = null;
            }
        }
    }

    public final C21213017zs LIZ(Long l) {
        if (l != null) {
            C21213117zt.LIZ.getClass();
            if (C21213117zt.LJII() != 0) {
                HashMap<Long, C21213017zs> map = LIZJ;
                if (map.get(l) == null) {
                    synchronized (this) {
                        try {
                            if (map.get(l) == null) {
                                map.put(l, new C21213017zs());
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
                return map.get(l);
            }
            return null;
        }
        return null;
    }

    public final C21212917zr LIZIZ(Long l) {
        if (l != null) {
            C21213117zt.LIZ.getClass();
            if (C21213117zt.LJII() != 0) {
                HashMap<Long, C21212917zr> map = LIZIZ;
                if (map.get(l) == null) {
                    synchronized (this) {
                        try {
                            if (map.get(l) == null) {
                                map.put(l, new C21212917zr());
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
                return map.get(l);
            }
            return null;
        }
        return null;
    }
}
