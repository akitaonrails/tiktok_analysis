package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0KRf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C517490KRf {
    public final String LIZ;
    public C517510KRh LIZIZ;
    public long LIZJ;
    public final List<Pair<Long, C517500KRg>> LIZLLL = new ArrayList();

    public final C517500KRg LIZ() {
        Pair pair = (Pair) C13LP.LJJLIIIJL(this.LIZLLL);
        if (pair != null) {
            return (C517500KRg) pair.getSecond();
        }
        return null;
    }

    public C517490KRf(String str) {
        this.LIZ = str;
    }
}
