package X;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: X.0R1i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C689120R1i {
    public long LIZ = System.currentTimeMillis();
    public final Map<String, String> LIZIZ = new ConcurrentHashMap();

    public final void LIZ(String str) {
        ((ConcurrentHashMap) this.LIZIZ).put(str, String.valueOf(System.currentTimeMillis() - this.LIZ));
        this.LIZ = System.currentTimeMillis();
    }

    public final void LIZIZ(String str, int i, boolean z, Map<String, String> map, InterfaceC1493105sv interfaceC1493105sv) {
        float f;
        float f2 = 1;
        if (z) {
            f = 0.01f;
        } else {
            f = 1.0E-4f;
        }
        if (C13LZ.LJIIJ(AbstractC19994813Le.Default, new IntRange(1, (int) (f2 / f))) == 10) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), null, null, new C689110R1h(this, str, z, i, map, interfaceC1493105sv, null), 3);
        }
    }
}
