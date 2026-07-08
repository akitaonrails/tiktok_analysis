package X;

import com.bytedance.keva.Keva;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.017n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2825017n implements InterfaceC657010Ppr {
    public Keva LIZ;
    public final HashMap<String, Pair<String, Long>> LIZIZ = new HashMap<>();
    public String LIZJ = "";

    @Override // X.InterfaceC657010Ppr
    public final void LIZ(String str) {
        this.LIZJ = str;
    }

    @Override // X.InterfaceC657010Ppr
    public final void LIZIZ(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.LIZIZ.put(str, new Pair<>(this.LIZJ, Long.valueOf(jCurrentTimeMillis)));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZJ);
        sbLIZ.append('_');
        sbLIZ.append(jCurrentTimeMillis);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        Keva keva = this.LIZ;
        if (keva != null) {
            keva.storeString(str, strLIZIZ);
        }
    }

    @Override // X.InterfaceC657010Ppr
    public final boolean LIZJ(String str) {
        Pair<String, Long> pair = this.LIZIZ.get(str);
        if (pair == null) {
            return false;
        }
        String first = pair.getFirst();
        if (System.currentTimeMillis() - pair.getSecond().longValue() > 86400000) {
            this.LIZIZ.remove(str);
            Keva keva = this.LIZ;
            if (keva != null) {
                keva.erase(str);
            }
            return false;
        }
        return Intrinsics.LJFF(first, this.LIZJ);
    }
}
