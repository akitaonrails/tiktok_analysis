package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0aAS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C924580aAS {
    public final Room LIZ;
    public final ConcurrentHashMap<String, Long> LIZIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, Long> LIZJ = new ConcurrentHashMap<>();
    public boolean LIZLLL;
    public Long LJ;
    public long LJFF;
    public long LJI;
    public C19487011Lw LJII;

    public C924580aAS(Room room) {
        this.LIZ = room;
    }

    public final void LIZ(long j, String str) {
        long jLongValue;
        int size = this.LIZIZ.size();
        if (j > 0) {
            if (this.LIZIZ.get(str) == null) {
                this.LIZIZ.put(str, Long.valueOf(System.currentTimeMillis()));
            }
        } else {
            Long l = this.LIZIZ.get(str);
            if (l != null) {
                long jCurrentTimeMillis = System.currentTimeMillis() - l.longValue();
                this.LIZIZ.remove(str);
                ConcurrentHashMap<String, Long> concurrentHashMap = this.LIZJ;
                Long l2 = concurrentHashMap.get(str);
                if (l2 != null) {
                    jLongValue = l2.longValue();
                } else {
                    jLongValue = 0;
                }
                concurrentHashMap.put(str, Long.valueOf(jCurrentTimeMillis + jLongValue));
            }
        }
        if (!C950220apo.LJI()) {
            int size2 = this.LIZIZ.size();
            if (size == 0) {
                if (size2 > 0) {
                    this.LJI = System.currentTimeMillis();
                    C19487011Lw c19487011Lw = this.LJII;
                    if (c19487011Lw != null) {
                        c19487011Lw.dispose();
                    }
                    this.LJII = null;
                    return;
                }
                return;
            }
            if (size <= 0 || size2 != 0 || this.LJI <= 0) {
                return;
            }
            final long jCurrentTimeMillis2 = System.currentTimeMillis() - this.LJI;
            this.LJII = C11QJ.LL.LJ(2L, TimeUnit.SECONDS).LJIILJJIL(C1701940uOG.LIZIZ()).LJIJI(new C09JN() { // from class: X.00L4
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("AvatarDurationHelper@4f52.putAvatarState$4");
                    C1C7U.LIZIZ("AvatarDurationHelper@4f52.putAvatarState$4");
                }
            }, new InterfaceC781210Ukh() { // from class: X.0aAT
                @Override // X.InterfaceC781210Ukh
                public final void run() {
                    if (this.LIZ.LIZIZ.size() == 0) {
                        C924600aAU.LIZIZ(jCurrentTimeMillis2, this.LIZ.LIZ);
                        this.LIZ.LJI = 0L;
                    }
                    this.LIZ.LJII = null;
                }
            });
        }
    }
}
