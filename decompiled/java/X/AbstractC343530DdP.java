package X;

import com.google.gson.k;
import com.google.gson.m;
import com.google.gson.q;
import java.util.List;

/* JADX INFO: renamed from: X.0DdP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC343530DdP {
    public final EnumC343590DdV LIZ;

    public List<C343690Ddf> LIZIZ() {
        return C13BV.INSTANCE;
    }

    public AbstractC343530DdP(EnumC343590DdV enumC343590DdV) {
        this.LIZ = enumC343590DdV;
    }

    public static String LIZ(k kVar) {
        if (kVar instanceof m) {
            return null;
        }
        if (kVar instanceof q) {
            return kVar.LJIILJJIL().LJIL();
        }
        return kVar.toString();
    }
}
