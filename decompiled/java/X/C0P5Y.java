package X;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0P5Y, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0P5Y implements InterfaceC582690MtH {
    public final C0PI7 LL;
    public final long LLILLJJLI = System.currentTimeMillis();
    public final HashMap<String, C0P5X> LLILLL = new HashMap<>();

    public C0P5Y(C0PI7 c0pi7) {
        this.LL = c0pi7;
    }

    @Override // X.InterfaceC582690MtH
    public final void LIZLLL(long j, String str) {
        if (str == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (j > 0) {
            HashMap<String, C0P5X> map = this.LLILLL;
            C0P5X c0p5x = map.get(str);
            if (c0p5x == null) {
                c0p5x = new C0P5X();
                map.put(str, c0p5x);
            }
            c0p5x.LIZ = Long.valueOf(jCurrentTimeMillis);
            return;
        }
        if (Intrinsics.LJFF(str, this.LL.LIZIZ) && !this.LLILLL.containsKey(str)) {
            HashMap<String, C0P5X> map2 = this.LLILLL;
            C0P5X c0p5x2 = map2.get(str);
            if (c0p5x2 == null) {
                c0p5x2 = new C0P5X();
                map2.put(str, c0p5x2);
            }
            C0P5X c0p5x3 = c0p5x2;
            c0p5x3.LIZ = Long.valueOf(this.LLILLJJLI);
            c0p5x3.LIZIZ = Long.valueOf(jCurrentTimeMillis);
            return;
        }
        C0P5X c0p5x4 = this.LLILLL.get(str);
        if (c0p5x4 == null) {
            return;
        }
        c0p5x4.LIZIZ = Long.valueOf(jCurrentTimeMillis);
    }
}
