package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0gYK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1170020gYK {
    public final Function1<String, Unit> LIZ;
    public final String LIZIZ = null;
    public final String LIZJ = null;

    public final int hashCode() {
        int iZ2 = ((C786410Ut5.Z2(true) * 31) + this.LIZ.hashCode()) * 31;
        String str = this.LIZIZ;
        int iHashCode = (iZ2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZJ;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public C1170020gYK(Function1 function1) {
        this.LIZ = function1;
    }
}
